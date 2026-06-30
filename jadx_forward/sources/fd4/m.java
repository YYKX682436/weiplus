package fd4;

/* loaded from: classes4.dex */
public final class m extends fd4.c {

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v f342850q;

    @Override // fd4.c, fd4.l
    public void a(int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.n nVar, android.view.ViewGroup.LayoutParams layoutParams) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7;
        r45.a90 a90Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
        super.a(i17, c17933xe8d1b226, nVar, layoutParams);
        r45.jj4 jj4Var = null;
        java.lang.Integer valueOf = layoutParams != null ? java.lang.Integer.valueOf(layoutParams.width) : null;
        java.lang.Integer valueOf2 = layoutParams != null ? java.lang.Integer.valueOf(layoutParams.height) : null;
        if (valueOf == null || valueOf2 == null || valueOf.intValue() <= 0 || valueOf2.intValue() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiveStreamAdTimelineItem", "width is " + valueOf + ", height is " + valueOf2);
        } else {
            a84.y0.o(this.f342822f.Q, valueOf.intValue(), valueOf2.intValue());
        }
        if (((c17933xe8d1b226 == null || (m70371x485d7 = c17933xe8d1b226.m70371x485d7()) == null || (a90Var = m70371x485d7.f39014x86965dde) == null) ? null : a90Var.f451373h) != null) {
            java.util.LinkedList linkedList = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451373h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList);
            if (linkedList.size() >= 1) {
                java.util.LinkedList linkedList2 = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451373h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList2);
                jj4Var = (r45.jj4) linkedList2.get(0);
            }
        }
        r45.jj4 jj4Var2 = jj4Var;
        this.f342823g.d(c17933xe8d1b226);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v vVar = this.f342850q;
        if (vVar != null) {
            vVar.d(c17933xe8d1b226, this.f342822f.T.f506664a, jj4Var2, valueOf, valueOf2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoStart", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
        super.c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f342825i;
        if (c17933xe8d1b226 != null && !c17933xe8d1b226.m70378x4c74e984()) {
            int i17 = this.f342822f.T.f506664a;
            if (i17 == 1 || i17 == 2) {
                l44.b3 b3Var = l44.b3.f397574a;
                b3Var.h(this.f342825i);
                b3Var.i(new l44.d0(this.f342822f.T.f506664a, this.f342825i, true));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v vVar = this.f342850q;
            if (vVar != null) {
                vVar.i();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoStart", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIDestroy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
        super.d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveStreamAdTimelineItem", "onUIDestroy: snsId is " + ca4.z0.T(this.f342825i));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v vVar = this.f342850q;
        if (vVar != null) {
            vVar.f();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIDestroy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
    }

    @Override // fd4.l
    public void g(long j17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void i(android.app.Activity activity, i64.b1 b1Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar, u74.d dVar, u74.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
        super.i(activity, b1Var, iVar, dVar, fVar);
        if (this.f342820d == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
            return;
        }
        if (dVar.Q == null) {
            android.view.View inflate = ((android.view.ViewStub) dVar.f506696x.findViewById(com.p314xaae8f345.mm.R.id.n4i)).inflate();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
            dVar.Q = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17803x7f9d5a75) inflate;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiveStreamAdTimelineItem", "buildContent many times");
        }
        this.f342850q = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v(this.f342822f.Q);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
        super.j();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveStreamAdTimelineItem", "onAdRemoved: snsId is " + ca4.z0.T(this.f342825i));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v vVar = this.f342850q;
        if (vVar != null) {
            vVar.b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
    }

    @Override // fd4.c, fd4.l
    /* renamed from: onVideoPause */
    public void mo129355x65d3157a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
        super.mo129355x65d3157a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v vVar = this.f342850q;
        if (vVar != null) {
            vVar.g();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
    }
}
