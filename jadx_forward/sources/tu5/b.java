package tu5;

/* loaded from: classes12.dex */
public abstract class b extends uu5.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f503700b;

    /* renamed from: c, reason: collision with root package name */
    public final int f503701c;

    public b(int i17, int i18) {
        this.f503700b = i17;
        this.f503701c = i18;
    }

    @Override // uu5.b
    public synchronized boolean a(tu5.h hVar) {
        boolean z17;
        int i17 = hVar.f503706b.f503704c.get();
        int i18 = this.f503700b;
        java.lang.Object obj = hVar.f503706b.f503702a.get("LIMIT");
        if (obj != null) {
            i18 = ((java.lang.Integer) obj).intValue();
        }
        z17 = i18 > i17;
        if (!z17 && i18 >= this.f503700b) {
            hVar.f503706b.f503702a.put("LIMIT", java.lang.Integer.valueOf(this.f503701c));
        }
        return z17;
    }

    @Override // uu5.a, uu5.b
    public synchronized void c(tu5.h hVar) {
        super.c(hVar);
        java.lang.Object obj = hVar.f503706b.f503702a.get("LIMIT");
        if ((obj == null ? 0 : ((java.lang.Integer) obj).intValue()) <= this.f503701c) {
            hVar.f503706b.f503702a.put("LIMIT", java.lang.Integer.valueOf(this.f503700b));
        }
    }
}
