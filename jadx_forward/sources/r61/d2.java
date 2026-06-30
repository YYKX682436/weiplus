package r61;

/* loaded from: classes9.dex */
public class d2 extends wu5.i {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f474371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f474372e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.p1011x633fb29.C11374x5be6abc6 f474373f;

    public d2(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.p1011x633fb29.C11374x5be6abc6 c11374x5be6abc6, java.lang.String str, java.util.List list) {
        this.f474373f = c11374x5be6abc6;
        this.f474371d = str;
        this.f474372e = list;
    }

    @Override // wu5.e
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecoverFriendPresenter", "after running insert task");
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.p1011x633fb29.C11374x5be6abc6 c11374x5be6abc6 = this.f474373f;
        if (c11374x5be6abc6.f154648o.decrementAndGet() != 0 || c11374x5be6abc6.f154647n) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecoverFriendPresenter", "all insert tasks are finished!");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new r61.c2(this));
    }

    @Override // wu5.e
    public void b(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecoverFriendPresenter", "before running insert task");
    }

    @Override // wu5.i
    public void c() {
        boolean z17;
        char c17;
        java.util.List<r45.ky4> list = this.f474372e;
        int i17 = 0;
        for (r45.ky4 ky4Var : list) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ky4Var.f460573h)) {
                z17 = false;
            } else {
                java.lang.String str = ky4Var.f460573h;
                java.lang.String str2 = this.f474371d;
                r61.x0 a17 = r61.z1.a(str2, str);
                if (a17 == null) {
                    a17 = new r61.x0();
                }
                a17.f67922xdd77ad16 = ky4Var.f460573h;
                java.lang.String str3 = ky4Var.f460572g;
                a17.f67923x21f9b213 = str3;
                java.lang.String a18 = x51.k.a(str3);
                if (a18 == null) {
                    a18 = "";
                }
                java.lang.String upperCase = a18.toUpperCase();
                a17.f67925xc64d6439 = upperCase;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(upperCase) || (c17 = upperCase.charAt(0)) < 'A' || c17 > 'Z') {
                    c17 = '[';
                }
                a17.f67927x98b6022 = c17;
                a17.f67928x11bb99f1 = ky4Var.f460570e;
                a17.f67929xdec927b = ky4Var.f460569d;
                a17.f67924xe8a3dc58 = str2;
                a17.f67926x4b6e7f9a = ky4Var.f460571f;
                if (a17.f72763xa3c65b86 == -1) {
                    z17 = ((r61.u1) ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).wi()).mo880xb970c2b9(a17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecoverFriendLogic", "insert local old friend (%s,%s), success %s", ky4Var.f460573h, ky4Var.f460572g, java.lang.Boolean.valueOf(z17));
                } else {
                    z17 = ((r61.u1) ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).wi()).mo11260x413cb2b4(a17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecoverFriendLogic", "replace local old friend (%s,%s), success %s", ky4Var.f460573h, ky4Var.f460572g, java.lang.Boolean.valueOf(z17));
                }
            }
            if (z17) {
                i17++;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecoverFriendLogic", "insert local old %d, success %d", java.lang.Integer.valueOf(list.size()), java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecoverFriendPresenter", "insert old account friend %d, success %d", java.lang.Integer.valueOf(list.size()), java.lang.Integer.valueOf(i17));
    }
}
