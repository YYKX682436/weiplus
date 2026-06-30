package fc;

/* loaded from: classes16.dex */
public abstract class o {

    /* renamed from: d, reason: collision with root package name */
    public final fc.b f342453d;

    /* renamed from: e, reason: collision with root package name */
    public int f342454e;

    /* renamed from: f, reason: collision with root package name */
    public int f342455f;

    public o(fc.b bVar) {
        this.f342453d = bVar;
        this.f342454e = bVar.f342433d;
        this.f342455f = bVar.d();
    }

    /* renamed from: hasNext */
    public boolean m129321x2987b4ad() {
        return mo129318x47548d9f() >= 0;
    }

    /* renamed from: nextIndex */
    public abstract int mo129318x47548d9f();

    /* renamed from: remove */
    public void m129322xc84af884() {
        int i17 = this.f342454e;
        fc.b bVar = this.f342453d;
        if (i17 != bVar.f342433d) {
            throw new java.util.ConcurrentModificationException();
        }
        int i18 = bVar.f342435f;
        if (i18 < 0) {
            throw new java.lang.IllegalStateException("Unpaired stop/startCompactingOnRemove");
        }
        bVar.f342435f = i18 - bVar.d();
        try {
            bVar.l(this.f342455f);
            int i19 = bVar.f342435f;
            if (i19 >= 0) {
                throw new java.lang.IllegalStateException("Unpaired stop/startCompactingOnRemove");
            }
            bVar.f342435f = i19 + bVar.d();
            this.f342454e--;
        } catch (java.lang.Throwable th6) {
            int i27 = bVar.f342435f;
            if (i27 >= 0) {
                throw new java.lang.IllegalStateException("Unpaired stop/startCompactingOnRemove");
            }
            bVar.f342435f = i27 + bVar.d();
            throw th6;
        }
    }
}
