package l36;

/* loaded from: classes16.dex */
public final class f implements n36.c {

    /* renamed from: a, reason: collision with root package name */
    public final n36.h f397020a;

    /* renamed from: b, reason: collision with root package name */
    public final x36.f0 f397021b;

    /* renamed from: c, reason: collision with root package name */
    public final x36.f0 f397022c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f397023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l36.j f397024e;

    public f(l36.j jVar, n36.h hVar) {
        this.f397024e = jVar;
        this.f397020a = hVar;
        x36.f0 d17 = hVar.d(1);
        this.f397021b = d17;
        this.f397022c = new l36.e(this, d17, jVar, hVar);
    }

    public void a() {
        synchronized (this.f397024e) {
            if (this.f397023d) {
                return;
            }
            this.f397023d = true;
            this.f397024e.getClass();
            m36.e.c(this.f397021b);
            try {
                this.f397020a.a();
            } catch (java.io.IOException unused) {
            }
        }
    }
}
