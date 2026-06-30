package uh1;

/* loaded from: classes7.dex */
public final class f implements uh1.w {

    /* renamed from: b, reason: collision with root package name */
    public final int f509318b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f509319c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f509320d;

    /* renamed from: e, reason: collision with root package name */
    public final javax.net.ssl.SSLContext f509321e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f509322f;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f509324h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f509325i;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f509323g = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f509326j = new java.util.ArrayList();

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, boolean z17) {
        this.f509320d = false;
        this.f509324h = lVar;
        uh1.a aVar = (uh1.a) lVar.b(uh1.a.class);
        this.f509318b = aVar.f509281o;
        this.f509322f = aVar.B;
        this.f509321e = uh1.j0.p(aVar);
        this.f509325i = new java.util.Hashtable(10);
        this.f509320d = z17;
        java.lang.String D = lp0.b.D();
        this.f509319c = (D.endsWith("/") ? D : D.concat("/")) + "networkfiles/";
    }

    public final void a(java.lang.String str) {
        if (str == null) {
            return;
        }
        synchronized (this.f509326j) {
            java.util.Iterator it = this.f509326j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                vh1.f fVar = (vh1.f) it.next();
                if (str.equals(fVar.f518566v)) {
                    this.f509326j.remove(fVar);
                    break;
                }
            }
        }
    }

    @Override // uh1.w
    /* renamed from: release */
    public void mo168031x41012807() {
        synchronized (this.f509326j) {
            java.util.Iterator it = this.f509326j.iterator();
            while (it.hasNext()) {
                ((vh1.f) it.next()).f518554g = false;
            }
            this.f509326j.clear();
        }
    }
}
