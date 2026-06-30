package pg0;

@j95.b(m140513x1e06fd29 = {pg0.j2.class})
/* loaded from: classes9.dex */
public class a3 extends i95.w implements qg0.b0 {

    /* renamed from: d, reason: collision with root package name */
    public volatile at4.b1 f435486d = new at4.b1();

    /* renamed from: e, reason: collision with root package name */
    public final pq5.i f435487e = new pq5.i(new pg0.r2(this));

    /* renamed from: f, reason: collision with root package name */
    public final pq5.i f435488f = new pq5.i(new pg0.s2(this));

    /* renamed from: g, reason: collision with root package name */
    public final pq5.i f435489g = new pq5.i(new pg0.t2(this));

    /* renamed from: h, reason: collision with root package name */
    public final pq5.i f435490h = new pq5.i(new pg0.u2(this));

    /* renamed from: i, reason: collision with root package name */
    public final pq5.i f435491i = new pq5.i(new pg0.v2(this));

    /* renamed from: m, reason: collision with root package name */
    public final pq5.i f435492m = new pq5.i(new pg0.w2(this));

    /* renamed from: n, reason: collision with root package name */
    public final pq5.i f435493n = new pq5.i(new pg0.x2(this));

    /* renamed from: o, reason: collision with root package name */
    public final pq5.i f435494o = new pq5.i(new pg0.y2(this));

    /* renamed from: p, reason: collision with root package name */
    public final pq5.i f435495p = new pq5.i(new pg0.z2(this));

    /* renamed from: q, reason: collision with root package name */
    public final pq5.i f435496q = new pq5.i(new pg0.n2(this));

    /* renamed from: r, reason: collision with root package name */
    public final pq5.i f435497r = new pq5.i(new pg0.o2(this));

    /* renamed from: s, reason: collision with root package name */
    public final pq5.i f435498s = new pq5.i(new pg0.p2(this));

    /* renamed from: t, reason: collision with root package name */
    public final zs4.q f435499t = new zs4.q();

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f435500u = "";

    public void Ai(android.content.Context context, java.util.HashMap hashMap, qg0.a0 a0Var) {
        j05.f fVar = (j05.f) i95.n0.c(j05.f.class);
        pg0.q2 q2Var = new pg0.q2(this, a0Var);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) fVar).getClass();
        if (hashMap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginWxPay", "extraInfo is null ! Return");
            return;
        }
        java.lang.String str = (java.lang.String) hashMap.get("key_red_packet_preview_url");
        java.lang.String str2 = (java.lang.String) hashMap.get("key_red_packet_preview_material_id");
        int parseInt = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) hashMap.get("key_red_packet_preview_scene")) ? java.lang.Integer.parseInt((java.lang.String) hashMap.getOrDefault("key_red_packet_preview_scene", "0")) : -1;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginWxPay", "doRedPacketPreviewLoading, url is %s", str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.z3.c(context, str, q2Var);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginWxPay", "url and materialId is both null");
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.z3.c(context, "", q2Var);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginWxPay", "doRedPacketPreviewLoading, materialId is %s", str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopePreview", "do get red packet preview from pickUI,materialId: %s", str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.z3.f227268a = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.i iVar = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.z3.f227269b;
        if (iVar != null) {
            iVar.j();
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.z3.f227269b = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.z3.f227268a = q2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.i iVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.i(parseInt, "", str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.z3.f227269b = iVar2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.z3.a(context, iVar2);
    }

    public void Bi() {
        gm0.j1.n().f354821b.g(new ms4.c());
    }

    public void Di(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            intent = new android.content.Intent();
        }
        if (c01.z1.z()) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_ENTRY_REDDOT_WALLET_REGION_INT_SYNC, 0);
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_ENTRY_REDDOT_WALLET_REGION_TYPE_INT_SYNC, 0);
            intent.setFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCoreService", "entryWalletIndexPage wallet type is h5,jump to ibg");
            j45.l.j(context, "wallet_core", ".ui.ibg.WalletIbgAdapterUI", intent, null);
            return;
        }
        if (c01.z1.A()) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_ENTRY_REDDOT_WALLET_REGION_INT_SYNC, 0);
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_ENTRY_REDDOT_WALLET_REGION_TYPE_INT_SYNC, 0);
            intent.setFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCoreService", "walletMall oversea switch is ：%s", java.lang.Boolean.TRUE);
            j45.l.j(context, "mall", ".ui.MallIndexOSUIv2", intent, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCoreService", "entryWalletIndexPage wallet type is native");
        intent.setFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCoreService", " walletMallV2 switch is ：%s", java.lang.Boolean.TRUE);
        j45.l.j(context, "mall", ".ui.MallIndexUIv2", intent, null);
        gm0.j1.i();
        if (gm0.j1.u().l()) {
            ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
            f21.g0 g0Var = new f21.g0(11);
            gm0.j1.i();
            gm0.j1.n().f354821b.g(g0Var);
        }
    }

    public dt4.c Ni() {
        if (gm0.j1.a()) {
            return (dt4.c) this.f435491i.a();
        }
        throw new c01.c();
    }

    public dt4.d Ri() {
        if (gm0.j1.a()) {
            return (dt4.d) this.f435490h.a();
        }
        throw new c01.c();
    }

    public dt4.a Ui() {
        if (gm0.j1.a()) {
            return (dt4.a) this.f435492m.a();
        }
        throw new c01.c();
    }

    public dt4.w Vi() {
        if (gm0.j1.a()) {
            return (dt4.w) this.f435498s.a();
        }
        throw new c01.c();
    }

    public dt4.x Zi() {
        if (gm0.j1.a()) {
            return (dt4.x) this.f435497r.a();
        }
        throw new c01.c();
    }

    public at4.p1 aj() {
        if (!gm0.j1.a()) {
            throw new c01.c();
        }
        pg0.j2 j2Var = (pg0.j2) i95.n0.c(pg0.j2.class);
        j2Var.m134976x2690a4ac();
        return j2Var.f435543d;
    }

    public at4.t1 bj() {
        if (gm0.j1.a()) {
            return (at4.t1) this.f435488f.a();
        }
        throw new c01.c();
    }

    public dt4.z cj() {
        if (gm0.j1.a()) {
            return (dt4.z) this.f435489g.a();
        }
        throw new c01.c();
    }

    public at4.x1 fj() {
        m134976x2690a4ac();
        return (at4.x1) this.f435487e.a();
    }

    public dt4.e hj() {
        if (gm0.j1.a()) {
            return (dt4.e) this.f435494o.a();
        }
        throw new c01.c();
    }

    public dt4.g ij() {
        if (gm0.j1.a()) {
            return (dt4.g) this.f435493n.a();
        }
        throw new c01.c();
    }

    public dt4.y mj() {
        if (gm0.j1.a()) {
            return (dt4.y) this.f435496q.a();
        }
        throw new c01.c();
    }

    public boolean nj() {
        boolean w17 = c01.z1.w();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCoreService", "isSupportMobileRemit() isCN:%s mobileRemitSwitch:%s", java.lang.Boolean.valueOf(w17), 1);
        return w17;
    }

    public void oj(java.lang.String str) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).getClass();
        hb3.o.Ni().cj(str, false);
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCoreService", "onAccountPostReset subcore walletCore");
        fj().z();
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        fj().B();
        at4.t1 bj6 = bj();
        bj6.f95507b = null;
        bj6.f95506a.clear();
        bj6.f95506a = new java.util.ArrayList();
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
    }

    public android.text.style.TextAppearanceSpan wi(android.content.Context context, java.lang.String str, int i17, int i18, android.content.res.ColorStateList colorStateList, android.content.res.ColorStateList colorStateList2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19157x23598017 c19157x23598017 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19157x23598017(str, i17, i18, colorStateList, colorStateList2);
        c19157x23598017.f262380d = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.F(context, 4);
        return c19157x23598017;
    }
}
