package r61;

/* loaded from: classes12.dex */
public class m1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.v0 f474439d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f474440e = null;

    public m1(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        r61.l1 l1Var = new r61.l1();
        this.f474439d = l1Var;
        r61.y0 y0Var = (r61.y0) l1Var.mo47979x2d63726f();
        r45.ro3 ro3Var = y0Var.f474532a;
        ro3Var.f466587e = str;
        ro3Var.f466588f = str2;
        ro3Var.f466589g = str3;
        ro3Var.f466590h = str4;
        ro3Var.f466591i = str5;
        ro3Var.f466592m = str6;
        ro3Var.f466593n = i17;
        ro3Var.f466594o = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        gm0.j1.b();
        y0Var.f474532a.f466595p = gm0.m.e();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f474440e = u0Var;
        return mo9409x10f9447a(sVar, this.f474439d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60875xf35223e;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 != 4 || i19 != -102) {
            this.f474440e.mo815x76e0bfae(i18, i19, str, this);
        } else {
            gm0.j1.e().j(new r61.k1(this, v0Var.mo47979x2d63726f().m150614x960aaed8().f424532c));
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 3;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: setSecurityCheckError */
    public void mo14485xb35c0942(com.p314xaae8f345.mm.p944x882e457a.n1 n1Var) {
    }
}
