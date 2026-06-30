package u80;

/* loaded from: classes4.dex */
public class b extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f506925d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f506926e;

    /* renamed from: f, reason: collision with root package name */
    public final t80.e f506927f;

    public b(java.util.List list, t80.e eVar) {
        this.f506927f = eVar;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.uf();
        lVar.f152198b = new r45.vf();
        lVar.f152199c = "/cgi-bin/mmpay-bin/ops/batch_get_liteapp_resource_description";
        lVar.f152200d = 4570;
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f506926e = a17;
        r45.uf ufVar = (r45.uf) a17.f152243a.f152217a;
        ufVar.f76494x2de60e5e = o45.bh.a(a17.mo47979x2d63726f());
        r45.tf tfVar = new r45.tf();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            t80.g gVar = (t80.g) it.next();
            java.util.Iterator it6 = it;
            r45.jn3 jn3Var = new r45.jn3();
            jn3Var.f459499d = gVar.f497882a;
            jn3Var.f459500e = gVar.f497883b;
            jn3Var.f459501f = gVar.f497884c;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            jn3Var.f459502g = linkedList;
            r45.a55 a55Var = new r45.a55();
            a55Var.f451273d = "package_type";
            r45.ax6 ax6Var = new r45.ax6();
            ax6Var.f451875f = "wechat_android";
            a55Var.f451274e = ax6Var;
            linkedList.add(a55Var);
            java.util.LinkedList linkedList2 = jn3Var.f459502g;
            r45.a55 a55Var2 = new r45.a55();
            a55Var2.f451273d = "uin";
            r45.ax6 ax6Var2 = new r45.ax6();
            ax6Var2.f451877h = java.lang.Long.parseLong(gm0.j1.b().j());
            a55Var2.f451274e = ax6Var2;
            linkedList2.add(a55Var2);
            java.util.LinkedList linkedList3 = jn3Var.f459502g;
            r45.a55 a55Var3 = new r45.a55();
            a55Var3.f451273d = "client_version";
            r45.ax6 ax6Var3 = new r45.ax6();
            ax6Var3.f451877h = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
            a55Var3.f451274e = ax6Var3;
            linkedList3.add(a55Var3);
            java.util.LinkedList linkedList4 = jn3Var.f459502g;
            r45.a55 a55Var4 = new r45.a55();
            a55Var4.f451273d = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52919x5302ea51;
            r45.ax6 ax6Var4 = new r45.ax6();
            ax6Var4.f451875f = java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT);
            a55Var4.f451274e = ax6Var4;
            linkedList4.add(a55Var4);
            java.util.LinkedList linkedList5 = jn3Var.f459502g;
            r45.a55 a55Var5 = new r45.a55();
            a55Var5.f451273d = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52909x9bfe27d4;
            r45.ax6 ax6Var5 = new r45.ax6();
            ax6Var5.f451875f = java.lang.String.valueOf(o45.wf.f424558c);
            a55Var5.f451274e = ax6Var5;
            linkedList5.add(a55Var5);
            java.lang.String m40061x1de3608b = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            int i17 = java.util.Objects.equals(m40061x1de3608b, "2G") ? 1 : java.util.Objects.equals(m40061x1de3608b, "3G") ? 2 : java.util.Objects.equals(m40061x1de3608b, "4G") ? 3 : java.util.Objects.equals(m40061x1de3608b, "WIFI") ? 4 : 0;
            java.util.LinkedList linkedList6 = jn3Var.f459502g;
            r45.a55 a55Var6 = new r45.a55();
            a55Var6.f451273d = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52918x89383abf;
            r45.ax6 ax6Var6 = new r45.ax6();
            ax6Var6.f451877h = i17;
            a55Var6.f451274e = ax6Var6;
            linkedList6.add(a55Var6);
            tfVar.f467898d.add(jn3Var);
            it = it6;
        }
        ufVar.f468846e = tfVar;
        r45.lf5 lf5Var = new r45.lf5();
        java.util.LinkedList linkedList7 = new java.util.LinkedList();
        lf5Var.f460960d = linkedList7;
        r45.a55 a55Var7 = new r45.a55();
        a55Var7.f451273d = "package_type";
        r45.ax6 ax6Var7 = new r45.ax6();
        ax6Var7.f451875f = "wechat_android";
        a55Var7.f451274e = ax6Var7;
        linkedList7.add(a55Var7);
        java.util.LinkedList linkedList8 = lf5Var.f460960d;
        r45.a55 a55Var8 = new r45.a55();
        a55Var8.f451273d = "uin";
        r45.ax6 ax6Var8 = new r45.ax6();
        ax6Var8.f451877h = java.lang.Long.parseLong(gm0.j1.b().j());
        a55Var8.f451274e = ax6Var8;
        linkedList8.add(a55Var8);
        java.util.LinkedList linkedList9 = lf5Var.f460960d;
        r45.a55 a55Var9 = new r45.a55();
        a55Var9.f451273d = "client_version";
        r45.ax6 ax6Var9 = new r45.ax6();
        ax6Var9.f451877h = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
        a55Var9.f451274e = ax6Var9;
        linkedList9.add(a55Var9);
        java.util.LinkedList linkedList10 = lf5Var.f460960d;
        r45.a55 a55Var10 = new r45.a55();
        a55Var10.f451273d = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52919x5302ea51;
        r45.ax6 ax6Var10 = new r45.ax6();
        ax6Var10.f451875f = java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT);
        a55Var10.f451274e = ax6Var10;
        linkedList10.add(a55Var10);
        java.util.LinkedList linkedList11 = lf5Var.f460960d;
        r45.a55 a55Var11 = new r45.a55();
        a55Var11.f451273d = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52909x9bfe27d4;
        r45.ax6 ax6Var11 = new r45.ax6();
        ax6Var11.f451875f = java.lang.String.valueOf(o45.wf.f424558c);
        a55Var11.f451274e = ax6Var11;
        linkedList11.add(a55Var11);
        java.lang.String m40061x1de3608b2 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i18 = java.util.Objects.equals(m40061x1de3608b2, "2G") ? 1 : java.util.Objects.equals(m40061x1de3608b2, "3G") ? 2 : java.util.Objects.equals(m40061x1de3608b2, "4G") ? 3 : java.util.Objects.equals(m40061x1de3608b2, "WIFI") ? 4 : 0;
        java.util.LinkedList linkedList12 = lf5Var.f460960d;
        r45.a55 a55Var12 = new r45.a55();
        a55Var12.f451273d = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52918x89383abf;
        r45.ax6 ax6Var12 = new r45.ax6();
        ax6Var12.f451877h = i18;
        a55Var12.f451274e = ax6Var12;
        linkedList12.add(a55Var12);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(java.util.TimeZone.getDefault().getOffset(java.lang.System.currentTimeMillis()) / 1000);
        java.util.LinkedList linkedList13 = lf5Var.f460960d;
        r45.a55 a55Var13 = new r45.a55();
        a55Var13.f451273d = "time_zone";
        r45.ax6 ax6Var13 = new r45.ax6();
        ax6Var13.f451875f = valueOf.toString();
        a55Var13.f451274e = ax6Var13;
        linkedList13.add(a55Var13);
        java.util.LinkedList linkedList14 = lf5Var.f460960d;
        r45.a55 a55Var14 = new r45.a55();
        a55Var14.f451273d = "oversea";
        r45.ax6 ax6Var14 = new r45.ax6();
        ax6Var14.f451873d = c01.e2.a0() ? 1L : 0L;
        a55Var14.f451274e = ax6Var14;
        linkedList14.add(a55Var14);
        java.util.LinkedList linkedList15 = lf5Var.f460960d;
        r45.a55 a55Var15 = new r45.a55();
        a55Var15.f451273d = "gp";
        r45.ax6 ax6Var15 = new r45.ax6();
        ax6Var15.f451873d = com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c() ? 1L : 0L;
        a55Var15.f451274e = ax6Var15;
        linkedList15.add(a55Var15);
        at4.x1 fj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
        int i19 = fj6.r().f67049xff817ee4 == 2 ? 2 : fj6.r().f67049xff817ee4 == 1 ? 1 : 0;
        java.util.LinkedList linkedList16 = lf5Var.f460960d;
        r45.a55 a55Var16 = new r45.a55();
        a55Var16.f451273d = "pay_reg_flag";
        r45.ax6 ax6Var16 = new r45.ax6();
        ax6Var16.f451873d = i19;
        a55Var16.f451274e = ax6Var16;
        linkedList16.add(a55Var16);
        java.util.LinkedList linkedList17 = lf5Var.f460960d;
        r45.a55 a55Var17 = new r45.a55();
        a55Var17.f451273d = "pay_card_flag";
        r45.ax6 ax6Var17 = new r45.ax6();
        ax6Var17.f451873d = fj6.r().f67046xf0b0ce38 ? 2L : 1L;
        a55Var17.f451274e = ax6Var17;
        linkedList17.add(a55Var17);
        java.util.ArrayList y07 = ((pg0.a3) i95.n0.c(pg0.a3.class)).Ri().y0();
        int i27 = (y07 == null || y07.size() <= 0) ? 0 : 1;
        java.util.LinkedList linkedList18 = lf5Var.f460960d;
        r45.a55 a55Var18 = new r45.a55();
        a55Var18.f451273d = "pay_had_card_flag";
        r45.ax6 ax6Var18 = new r45.ax6();
        ax6Var18.f451873d = i27;
        a55Var18.f451274e = ax6Var18;
        linkedList18.add(a55Var18);
        double[] dArr = {0.0d};
        double[] dArr2 = {0.0d};
        if (i95.n0.h(u60.g.class)) {
            ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
            i11.h e17 = i11.h.e();
            if (e17 == null || !e17.h()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxPay.NetSceneGetPayLiteAppResource", "isGetWgs84LocationIn10Minutes false");
            } else {
                e17.f(new u80.a(this, dArr2, dArr));
            }
        }
        java.util.LinkedList linkedList19 = lf5Var.f460960d;
        r45.a55 a55Var19 = new r45.a55();
        a55Var19.f451273d = "cred_info_type";
        r45.ax6 ax6Var19 = new r45.ax6();
        ax6Var19.f451875f = java.lang.String.format(java.util.Locale.CHINA, "%d", java.lang.Integer.valueOf(fj6.r().f67042x8a2885a8));
        a55Var19.f451274e = ax6Var19;
        linkedList19.add(a55Var19);
        java.util.LinkedList linkedList20 = lf5Var.f460960d;
        r45.a55 a55Var20 = new r45.a55();
        a55Var20.f451273d = "cred_info_name";
        r45.ax6 ax6Var20 = new r45.ax6();
        ax6Var20.f451875f = fj6.r().f67041x8a2570f9;
        a55Var20.f451274e = ax6Var20;
        linkedList20.add(a55Var20);
        ufVar.f468847f = lf5Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f506925d = u0Var;
        return mo9409x10f9447a(sVar, this.f506926e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4570;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.vf vfVar = (r45.vf) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        t80.e eVar = this.f506927f;
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.NetSceneGetPayLiteAppResource", "pay BatchGetResourceDescriptionResp: %s", vfVar);
            r45.mg mgVar = vfVar.f469714d;
            r45.mg mgVar2 = vfVar.f469715e;
            if (eVar != null) {
                eVar.b(mgVar, mgVar2);
            }
        } else if (eVar != null) {
            eVar.a(i18, i19, str);
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f506925d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
