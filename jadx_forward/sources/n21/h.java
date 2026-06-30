package n21;

/* loaded from: classes8.dex */
public class h implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: f, reason: collision with root package name */
    public static final kk.j f415798f = new kk.l(5);

    /* renamed from: g, reason: collision with root package name */
    public static int f415799g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static n21.h f415800h;

    /* renamed from: d, reason: collision with root package name */
    public boolean f415801d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f415802e = 3;

    public static int a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return 5;
        }
        str.startsWith("single");
        int i17 = str.startsWith("chatroom") ? 7 : 5;
        if (str.startsWith("app")) {
            return 8;
        }
        return i17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if ((m1Var instanceof com.p314xaae8f345.mm.p944x882e457a.q1) && ((com.p314xaae8f345.mm.p944x882e457a.q1) m1Var).u() == 9 && m1Var.mo808xfb85f7b0() == 159) {
            if (i17 == 0 && i18 == 0) {
                gm0.j1.i();
                gm0.j1.u().c().w(81944, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
            } else {
                int i19 = this.f415802e - 1;
                this.f415802e = i19;
                if (i19 < 0) {
                    gm0.j1.i();
                    com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    c17.w(81944, java.lang.Long.valueOf(((java.lang.System.currentTimeMillis() - 86400000) + 3600000) / 1000));
                    this.f415802e = 3;
                }
            }
            this.f415801d = false;
            gm0.j1.d().q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e0.f33785x366c91de, this);
        }
    }
}
