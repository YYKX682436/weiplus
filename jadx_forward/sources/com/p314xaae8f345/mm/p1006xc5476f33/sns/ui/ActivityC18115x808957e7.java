package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTagDetailUI */
/* loaded from: classes11.dex */
public class ActivityC18115x808957e7 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b implements com.p314xaae8f345.mm.p944x882e457a.u0, l75.z0 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f248975q = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f248977e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 f248978f;

    /* renamed from: h, reason: collision with root package name */
    public long f248980h;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f248976d = null;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f248979g = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f248981i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f248982m = "";

    /* renamed from: n, reason: collision with root package name */
    public boolean f248983n = false;

    /* renamed from: o, reason: collision with root package name */
    public int f248984o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final r35.d2 f248985p = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.rr(this);

    public void V6(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("__onCreate", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        gm0.j1.i();
        gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a0.f33775x366c91de, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(291, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(292, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.c0.f33779x366c91de, this);
        gm0.j1.i();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
        if (((java.util.ArrayList) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Lj().z0()).size() == 0) {
            gm0.j1.i();
            gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d3(1));
            this.f248983n = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("__onCreate", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    public void W6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("__onDestroy", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        gm0.j1.i();
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a0.f33775x366c91de, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(291, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(292, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.c0.f33779x366c91de, this);
        gm0.j1.i();
        if (gm0.j1.b().m()) {
            gm0.j1.i();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("__onDestroy", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    public void X6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dealBack", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        if ((this.f248981i + " " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f248979g, ",")).equals(this.f248982m) && this.f248980h != 0) {
            finish();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealBack", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        } else {
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Lj().b1(this.f248980h, this.f248981i)) {
                db5.e1.s(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.jfg, this.f248981i), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealBack", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.e3 e3Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.e3(3, this.f248980h, this.f248981i, this.f248979g.size(), this.f248979g, this.f248984o);
            gm0.j1.i();
            gm0.j1.n().f354821b.g(e3Var);
            this.f248976d = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.jfx), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qr(this, e3Var));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealBack", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        }
    }

    public void Y6(java.lang.String str) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dealDelChatRoomMember", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        if (str == null || str.equals("")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealDelChatRoomMember", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
            return;
        }
        this.f248979g.remove(str);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f32 = this.f248978f;
        if (c19662x4f7a67f32 != null) {
            c19662x4f7a67f32.S(this.f248979g);
            this.f248978f.s();
        }
        if (this.f248979g.size() != 0 || (c19662x4f7a67f3 = this.f248978f) == null) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f33 = this.f248978f;
            if (c19662x4f7a67f33 != null) {
                c19662x4f7a67f33.T(true);
                c19662x4f7a67f33.V(true);
            }
        } else {
            c19662x4f7a67f3.N();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f34 = this.f248978f;
            c19662x4f7a67f34.T(true);
            c19662x4f7a67f34.V(false);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f248977e).notifyDataSetChanged();
        }
        d7();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealDelChatRoomMember", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    public void Z6(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dealOnAddContact", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        com.p314xaae8f345.mm.p2621x8fb0427b.e8 pj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.pj();
        java.lang.String r17 = c01.z1.r();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!this.f248979g.contains(str) && ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) pj6).n(str, true) != null && ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) pj6).n(str, true).r2() && !r17.equals(str)) {
                this.f248979g.add(str);
            }
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3 = this.f248978f;
        if (c19662x4f7a67f3 != null) {
            c19662x4f7a67f3.S(this.f248979g);
            this.f248978f.s();
        }
        if (this.f248979g.size() > 0) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f32 = this.f248978f;
            c19662x4f7a67f32.T(true);
            c19662x4f7a67f32.V(true);
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f33 = this.f248978f;
            c19662x4f7a67f33.T(true);
            c19662x4f7a67f33.V(false);
        }
        d7();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealOnAddContact", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    public void a7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteTag", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        if (this.f248980h != 0) {
            gm0.j1.i();
            gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f3(3, this.f248980h, this.f248981i));
        }
        this.f248976d = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.jfx), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kr(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteTag", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    public java.util.List b7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getListUserName", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        java.util.List linkedList = new java.util.LinkedList();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2 D0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Lj().D0(this.f248980h);
        java.lang.String str = D0.f69152x693306bd;
        if (str != null && !str.equals("")) {
            linkedList = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(D0.f69152x693306bd.split(","));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getListUserName", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        return linkedList;
    }

    public final void c7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateTagName", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f248977e).h("settings_tag_name");
        if (h17 != null) {
            if (this.f248981i.length() > 20) {
                this.f248981i = this.f248981i.substring(0, 20);
            }
            h17.H(this.f248981i);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f248977e).notifyDataSetChanged();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateTagName", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    public void d7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateTitle", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        mo54450xbf7c1df6(this.f248981i + "(" + this.f248979g.size() + ")");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateTitle", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
            return dispatchKeyEvent;
        }
        if (!(this.f248981i + " " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f248979g, ",")).equals(this.f248982m) || this.f248980h == 0) {
            db5.e1.n(this, com.p314xaae8f345.mm.R.C30867xcad56011.jff, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pr(this), null);
        } else {
            finish();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        return true;
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onNotifyChange", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onNotifyChange", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getResourceId", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getResourceId", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        return com.p314xaae8f345.mm.R.xml.f576495cs;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        this.f248977e = m79336x8b97809d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("__initView", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f248977e).h("roominfo_contact_anchor");
        this.f248978f = c19662x4f7a67f3;
        if (c19662x4f7a67f3 != null) {
            c19662x4f7a67f3.R(this.f248977e, c19662x4f7a67f3.f279313q);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f32 = this.f248978f;
            c19662x4f7a67f32.T(true);
            c19662x4f7a67f32.V(true);
            this.f248978f.Q(this.f248979g);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f33 = this.f248978f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.lr lrVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.lr(this);
            lz.f fVar = c19662x4f7a67f33.M;
            if (fVar != null) {
                ((r35.u1) fVar).f450808g = lrVar;
            }
            c19662x4f7a67f33.Z(this.f248985p);
        }
        if (bi4.v1.g()) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b c21568x1a71b23b = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f248977e).h("outside");
            if (c21568x1a71b23b != null) {
                c21568x1a71b23b.J(com.p314xaae8f345.mm.R.C30867xcad56011.jfp);
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b c21568x1a71b23b2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f248977e).h("black");
            if (c21568x1a71b23b2 != null) {
                c21568x1a71b23b2.J(com.p314xaae8f345.mm.R.C30867xcad56011.jfn);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("__initView", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        getIntent().getIntExtra("k_sns_from_settings_about_sns", 0);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.nr(this));
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.or(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
            return;
        }
        if (i17 != 1) {
            if (i17 != 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("k_sns_tag_name");
            if (stringExtra != null) {
                this.f248981i = stringExtra;
            }
            d7();
        } else {
            if (intent == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
                return;
            }
            java.lang.String stringExtra2 = intent.getStringExtra("Select_Contact");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isContactExit", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
            java.lang.String r17 = c01.z1.r();
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (r17 == null) {
                r17 = "";
            }
            if (r17.equals(stringExtra2)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isContactExit", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
                z17 = true;
            } else {
                java.util.List list = this.f248979g;
                if (list == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isContactExit", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
                    z17 = false;
                } else {
                    java.util.Iterator it = list.iterator();
                    z17 = false;
                    while (it.hasNext()) {
                        if (((java.lang.String) it.next()).equals(stringExtra2)) {
                            z17 = true;
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isContactExit", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
                }
            }
            if (z17) {
                db5.e1.s(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571373d8, 0, 0), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
                return;
            } else {
                java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra2.split(","));
                if (P1 == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
                    return;
                }
                Z6(P1);
            }
        }
        if (!(this.f248981i + " " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f248979g, ",")).equals(this.f248982m) || this.f248980h == 0) {
            m78501x43e00957(true);
        } else {
            m78501x43e00957(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        super.onCreate(bundle);
        V6(bundle);
        this.f248984o = getIntent().getIntExtra("k_tag_detail_sns_block_scene", 0);
        long longExtra = getIntent().getLongExtra("k_sns_tag_id", 0L);
        this.f248980h = longExtra;
        if (longExtra == 4) {
            this.f248981i = getString(com.p314xaae8f345.mm.R.C30867xcad56011.jfr);
        } else if (longExtra == 5) {
            this.f248981i = getString(com.p314xaae8f345.mm.R.C30867xcad56011.jfz);
        } else {
            this.f248981i = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Lj().D0(this.f248980h).f69154x183bff00;
        }
        if (this.f248980h == 0) {
            java.lang.String stringExtra = getIntent().getStringExtra("k_sns_tag_list");
            java.lang.String stringExtra2 = getIntent().getStringExtra("k_sns_tag_name");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            this.f248981i = stringExtra2;
            com.p314xaae8f345.mm.p2621x8fb0427b.e8 pj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.pj();
            java.lang.String r17 = c01.z1.r();
            java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(","));
            if (P1 != null) {
                java.util.Iterator it = P1.iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    if (!this.f248979g.contains(str) && ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) pj6).n(str, true).r2() && !r17.equals(str)) {
                        this.f248979g.add(str);
                    }
                }
            }
        } else {
            this.f248979g = b7();
        }
        java.lang.String str2 = this.f248981i;
        if (str2 == null || str2.equals("")) {
            this.f248981i = getString(com.p314xaae8f345.mm.R.C30867xcad56011.jfq);
            this.f248981i = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.g(getString(com.p314xaae8f345.mm.R.C30867xcad56011.jfq));
        }
        mo43517x10010bd5();
        c7();
        d7();
        if (this.f248980h < 6) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f248977e).w("delete_tag_name");
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f248977e).w("delete_tag_name_category");
            if (this.f248980h > 0) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f248977e).w("settings_tag_name");
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f248977e).w("settings_tag_name_category");
            }
        }
        long j17 = this.f248980h;
        if (j17 == 4) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f248977e).w("black");
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f248977e).w("group");
        } else if (j17 == 5) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f248977e).w("outside");
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f248977e).w("group");
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f248977e).w("black");
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f248977e).w("outside");
        }
        if (this.f248980h == 0) {
            m78501x43e00957(true);
        } else {
            m78501x43e00957(false);
        }
        this.f248982m = this.f248981i + " " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f248979g, ",");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3 = this.f248978f;
        if (c19662x4f7a67f3 != null) {
            c19662x4f7a67f3.getClass();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f248976d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        W6();
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        java.lang.String str = c21560x1fce98fb.f279313q;
        if (str.equals("settings_tag_name")) {
            long j17 = this.f248980h;
            if (j17 >= 6 || j17 == 0) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Contact_mode_name_type", 3);
                java.lang.String str2 = this.f248981i;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str2 == null) {
                    str2 = " ";
                }
                intent.putExtra("Contact_Nick", str2);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.getClass();
                intent.setClass(this, com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01.class);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(2);
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.k(this, arrayList.toArray(), "com/tencent/mm/app/WorkerUICallbackImpl", "startRemarkUIForResult", "(Landroid/content/Intent;Landroid/app/Activity;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            }
        }
        if (str.equals("delete_tag_name")) {
            db5.e1.n(this, com.p314xaae8f345.mm.R.C30867xcad56011.iiy, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ir(this), new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.jr(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        super.onResume();
        c7();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTagDetailUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f248976d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        switch (m1Var.mo808xfb85f7b0()) {
            case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a0.f33775x366c91de /* 290 */:
                finish();
                break;
            case 291:
                finish();
                break;
            case 292:
                if (this.f248978f != null && this.f248983n && !(this instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18015xfb6314c)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d3 d3Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d3) m1Var;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(d3Var.H(this.f248980h))) {
                        for (int i19 = 0; i19 < ((java.util.LinkedList) d3Var.H(this.f248980h)).size(); i19++) {
                            java.lang.String str2 = (java.lang.String) ((java.util.LinkedList) d3Var.H(this.f248980h)).get(i19);
                            if (str2 != null) {
                                arrayList.add(str2);
                            }
                        }
                    }
                    this.f248982m = this.f248981i + " " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ",");
                    new java.util.LinkedList();
                    java.util.List<java.lang.String> list = this.f248979g;
                    this.f248979g = b7();
                    if (list != null) {
                        for (java.lang.String str3 : list) {
                            if (!this.f248979g.contains(str3)) {
                                this.f248979g.add(str3);
                            }
                        }
                    }
                    this.f248978f.S(this.f248979g);
                    this.f248978f.s();
                    break;
                }
                break;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }
}
