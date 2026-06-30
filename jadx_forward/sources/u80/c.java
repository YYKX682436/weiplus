package u80;

/* loaded from: classes4.dex */
public class c extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f506928d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f506929e;

    /* renamed from: f, reason: collision with root package name */
    public final t80.f f506930f;

    public c(java.lang.String str, java.lang.String str2, java.util.LinkedList linkedList, t80.f fVar) {
        this.f506930f = fVar;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.kn3();
        lVar.f152198b = new r45.ln3();
        lVar.f152199c = "/cgi-bin/mmpay-bin/ops/get_liteapp_resource_description";
        lVar.f152200d = 4873;
        int i17 = 2;
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f506929e = a17;
        r45.kn3 kn3Var = (r45.kn3) a17.f152243a.f152217a;
        kn3Var.f76494x2de60e5e = o45.bh.a(a17.mo47979x2d63726f());
        r45.jn3 jn3Var = new r45.jn3();
        jn3Var.f459499d = str;
        jn3Var.f459500e = str2;
        jn3Var.f459501f = linkedList;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        jn3Var.f459502g = linkedList2;
        r45.a55 a55Var = new r45.a55();
        a55Var.f451273d = "package_type";
        r45.ax6 ax6Var = new r45.ax6();
        ax6Var.f451875f = "wechat_android";
        a55Var.f451274e = ax6Var;
        linkedList2.add(a55Var);
        java.util.LinkedList linkedList3 = jn3Var.f459502g;
        r45.a55 a55Var2 = new r45.a55();
        a55Var2.f451273d = "uin";
        r45.ax6 ax6Var2 = new r45.ax6();
        ax6Var2.f451877h = java.lang.Long.parseLong(gm0.j1.b().j());
        a55Var2.f451274e = ax6Var2;
        linkedList3.add(a55Var2);
        java.util.LinkedList linkedList4 = jn3Var.f459502g;
        r45.a55 a55Var3 = new r45.a55();
        a55Var3.f451273d = "client_version";
        r45.ax6 ax6Var3 = new r45.ax6();
        ax6Var3.f451877h = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
        a55Var3.f451274e = ax6Var3;
        linkedList4.add(a55Var3);
        java.util.LinkedList linkedList5 = jn3Var.f459502g;
        r45.a55 a55Var4 = new r45.a55();
        a55Var4.f451273d = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52919x5302ea51;
        r45.ax6 ax6Var4 = new r45.ax6();
        ax6Var4.f451875f = java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT);
        a55Var4.f451274e = ax6Var4;
        linkedList5.add(a55Var4);
        java.util.LinkedList linkedList6 = jn3Var.f459502g;
        r45.a55 a55Var5 = new r45.a55();
        a55Var5.f451273d = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52909x9bfe27d4;
        r45.ax6 ax6Var5 = new r45.ax6();
        ax6Var5.f451875f = java.lang.String.valueOf(o45.wf.f424558c);
        a55Var5.f451274e = ax6Var5;
        linkedList6.add(a55Var5);
        java.lang.String m40061x1de3608b = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        if (java.util.Objects.equals(m40061x1de3608b, "2G")) {
            i17 = 1;
        } else if (!java.util.Objects.equals(m40061x1de3608b, "3G")) {
            i17 = java.util.Objects.equals(m40061x1de3608b, "4G") ? 3 : java.util.Objects.equals(m40061x1de3608b, "WIFI") ? 4 : 0;
        }
        java.util.LinkedList linkedList7 = jn3Var.f459502g;
        r45.a55 a55Var6 = new r45.a55();
        a55Var6.f451273d = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52918x89383abf;
        r45.ax6 ax6Var6 = new r45.ax6();
        ax6Var6.f451877h = i17;
        a55Var6.f451274e = ax6Var6;
        linkedList7.add(a55Var6);
        kn3Var.f460377e = jn3Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f506928d = u0Var;
        return mo9409x10f9447a(sVar, this.f506929e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4873;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.ln3 ln3Var = (r45.ln3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        t80.f fVar = this.f506930f;
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.NetSceneGetPayLiteAppResource", "pay GetResourceDescriptionResp: %s", ln3Var);
            r45.xr5 xr5Var = ln3Var.f461191d;
            if (fVar != null) {
                fVar.b(xr5Var);
            }
        } else if (fVar != null) {
            fVar.a(i18, i19, str);
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f506928d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
