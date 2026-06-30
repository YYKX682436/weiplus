package so4;

/* loaded from: classes10.dex */
public final class e implements wm5.f {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f492306a = "";

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 f492307b;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var) {
        this.f492307b = h1Var;
    }

    @Override // wm5.f
    public void a(long j17) {
        java.lang.String str;
        so4.g gVar = so4.g.f492309a;
        so4.a aVar = so4.g.f492313e;
        if ((aVar != null ? aVar.f492299a : null) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 c17 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.x.c(this.f492307b, j17);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17 != null ? c17.f257149a : null, this.f492306a)) {
                return;
            }
            int a17 = gVar.a(c17 != null ? c17.f257149a : null);
            if (((java.util.ArrayList) so4.g.f492317i).contains(java.lang.Integer.valueOf(a17))) {
                gVar.g(a17);
            }
            if (c17 == null || (str = c17.f257149a) == null) {
                str = "";
            }
            this.f492306a = str;
        }
    }

    @Override // wm5.f
    public void b() {
    }
}
