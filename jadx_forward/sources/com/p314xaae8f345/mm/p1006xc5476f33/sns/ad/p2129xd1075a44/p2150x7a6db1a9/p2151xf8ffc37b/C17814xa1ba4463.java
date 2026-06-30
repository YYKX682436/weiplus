package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B1\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/widget/shakead/bidding/CommonShakeLogic;", "Landroidx/lifecycle/x;", "Lcom/tencent/mm/plugin/sns/ui/y4;", "Lu44/b;", "La94/l;", "Landroid/content/Context;", "mContext", "Landroid/widget/FrameLayout;", "mShakeViewContainer", "Landroid/view/View;", "mAdRootView", "", "mSource", "Lb94/d;", "mOnShakeListener", "<init>", "(Landroid/content/Context;Landroid/widget/FrameLayout;Landroid/view/View;ILb94/d;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic */
/* loaded from: classes4.dex */
public final class C17814xa1ba4463 implements p012xc85e97e9.p093xedfae76a.x, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y4, u44.b, a94.l {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f245390d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.FrameLayout f245391e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f245392f;

    /* renamed from: g, reason: collision with root package name */
    public final int f245393g;

    /* renamed from: h, reason: collision with root package name */
    public final b94.d f245394h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b.C17816xdbf1b100 f245395i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f245396m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f245397n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f245398o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f245399p;

    /* renamed from: q, reason: collision with root package name */
    public b94.a f245400q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f245401r;

    /* renamed from: s, reason: collision with root package name */
    public int f245402s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f245403t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f245404u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f245405v;

    /* renamed from: w, reason: collision with root package name */
    public final b94.f f245406w;

    /* renamed from: x, reason: collision with root package name */
    public final b94.c f245407x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2097x72ce5378.p2100xb73a0fae.C17725xc5c6b7a7 f245408y;

    /* JADX WARN: Multi-variable type inference failed */
    public C17814xa1ba4463(android.content.Context mContext, android.widget.FrameLayout mShakeViewContainer, android.view.View mAdRootView, int i17, b94.d dVar) {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContext, "mContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mShakeViewContainer, "mShakeViewContainer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mAdRootView, "mAdRootView");
        this.f245390d = mContext;
        this.f245391e = mShakeViewContainer;
        this.f245392f = mAdRootView;
        this.f245393g = i17;
        this.f245394h = dVar;
        this.f245406w = new b94.f(mContext, new b94.b(this));
        this.f245407x = new b94.c(this, android.os.Looper.getMainLooper());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initLifeCycleListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        boolean z17 = mContext instanceof p012xc85e97e9.p093xedfae76a.y;
        p012xc85e97e9.p093xedfae76a.y yVar = z17 ? (p012xc85e97e9.p093xedfae76a.y) mContext : null;
        if (yVar != null && (mo273xed6858b4 = yVar.mo273xed6858b4()) != null) {
            mo273xed6858b4.a(new p012xc85e97e9.p093xedfae76a.f() { // from class: com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic$initLifeCycleListener$1$1
                @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
                /* renamed from: onCreate */
                public void mo7794x3e5a77bb(p012xc85e97e9.p093xedfae76a.y owner) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic$initLifeCycleListener$1$1");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic$initLifeCycleListener$1$1");
                }

                @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
                /* renamed from: onDestroy */
                public void mo7795xac79a11b(p012xc85e97e9.p093xedfae76a.y owner) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic$initLifeCycleListener$1$1");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$onActivityDestroy", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b.C17814xa1ba4463 c17814xa1ba4463 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b.C17814xa1ba4463.this;
                    c17814xa1ba4463.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityDestroy", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CommonShakeLogic", "onActivityDestroy, hash=" + c17814xa1ba4463.hashCode());
                    c17814xa1ba4463.f245396m = false;
                    c17814xa1ba4463.b();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deadAdAddStateListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2097x72ce5378.p2100xb73a0fae.C17725xc5c6b7a7 c17725xc5c6b7a7 = c17814xa1ba4463.f245408y;
                    if (c17725xc5c6b7a7 != null) {
                        c17725xc5c6b7a7.mo48814x2efc64();
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deadAdAddStateListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    c17814xa1ba4463.a();
                    c17814xa1ba4463.f245403t = false;
                    c17814xa1ba4463.f245404u = false;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityDestroy", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$onActivityDestroy", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic$initLifeCycleListener$1$1");
                }

                @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
                /* renamed from: onPause */
                public void mo7796xb01dfb57(p012xc85e97e9.p093xedfae76a.y owner) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic$initLifeCycleListener$1$1");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$onActivityPause", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b.C17814xa1ba4463 c17814xa1ba4463 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b.C17814xa1ba4463.this;
                    c17814xa1ba4463.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityPause", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CommonShakeLogic", "onActivityPause, hash=" + c17814xa1ba4463.hashCode());
                    c17814xa1ba4463.f245396m = false;
                    c17814xa1ba4463.f245399p = true;
                    c17814xa1ba4463.b();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityPause", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$onActivityPause", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic$initLifeCycleListener$1$1");
                }

                @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
                /* renamed from: onResume */
                public void mo7055x57429eec(p012xc85e97e9.p093xedfae76a.y owner) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic$initLifeCycleListener$1$1");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$onActivityResume", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b.C17814xa1ba4463 c17814xa1ba4463 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b.C17814xa1ba4463.this;
                    c17814xa1ba4463.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResume", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    c17814xa1ba4463.f245396m = true;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CommonShakeLogic", "onActivityResume， isPausedBefore=" + c17814xa1ba4463.f245399p + ", hash=" + c17814xa1ba4463.hashCode());
                    if (c17814xa1ba4463.f245399p) {
                        c17814xa1ba4463.i(1, 50L);
                    }
                    c17814xa1ba4463.f245399p = false;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResume", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$onActivityResume", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic$initLifeCycleListener$1$1");
                }
            });
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initLifeCycleListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("aliveAdAddStateListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        p012xc85e97e9.p093xedfae76a.y yVar2 = z17 ? (p012xc85e97e9.p093xedfae76a.y) mContext : null;
        if (yVar2 != null) {
            if (this.f245408y == null) {
                this.f245408y = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2097x72ce5378.p2100xb73a0fae.C17725xc5c6b7a7(this, yVar2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2097x72ce5378.p2100xb73a0fae.C17725xc5c6b7a7 c17725xc5c6b7a7 = this.f245408y;
            if (c17725xc5c6b7a7 != null) {
                c17725xc5c6b7a7.mo48813x58998cd();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("aliveAdAddStateListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1697, 48);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (((r6 == null || (r6 = r6.m70346x10413e67()) == null) ? null : r6.f38089x17592329) != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r6) {
        /*
            java.lang.String r0 = "isEnableCommonShake"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic$Companion"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r2)
            r3 = 1
            r4 = 0
            if (r6 == 0) goto L19
            boolean r5 = r6.m70377x3172ed()
            if (r5 != r3) goto L19
            r5 = r3
            goto L1a
        L19:
            r5 = r4
        L1a:
            if (r5 == 0) goto L2b
            if (r6 == 0) goto L27
            com.tencent.mm.plugin.sns.storage.ADInfo r6 = r6.m70346x10413e67()
            if (r6 == 0) goto L27
            b94.a r6 = r6.f38089x17592329
            goto L28
        L27:
            r6 = 0
        L28:
            if (r6 == 0) goto L2b
            goto L2c
        L2b:
            r3 = r4
        L2c:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r2)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b.C17814xa1ba4463.d(com.tencent.mm.plugin.sns.storage.SnsInfo):boolean");
    }

    public static final boolean e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isExpEnabled", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isExpEnabled", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic$Companion");
        boolean z17 = false;
        try {
            boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_ad_common_shake_enable, -1) != 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExpEnabled", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic$Companion");
            z17 = z18;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CommonShakeLogic", "isExpEnabled, exp=" + e17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExpEnabled", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic$Companion");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExpEnabled", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y4
    public void F3() {
        long j17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollIdle", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        b94.a aVar = this.f245400q;
        if (aVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getActionDelay", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeInfo");
            j17 = aVar.f100147d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActionDelay", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeInfo");
        } else {
            j17 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CommonShakeLogic", "onScrollIdle, hash=" + hashCode());
        i(1, j17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollIdle", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkReportShakeFailed", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CommonShakeLogic", "checkReportShakeFailed, hasSuccOnece=" + this.f245403t + ", isReportedFail=" + this.f245405v + ", isShakableBefore=" + this.f245404u);
        if (!this.f245403t && !this.f245405v && this.f245404u) {
            k(2);
            this.f245405v = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkReportShakeFailed", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
    }

    @Override // a94.l
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopDetectShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("postMsg$default", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        i(2, 0L);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("postMsg$default", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopDetectShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
    }

    public final r44.f c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsAdBizUic", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        try {
            android.content.Context context = this.f245390d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r44.f fVar = (r44.f) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(r44.f.class);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAdBizUic", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
            return fVar;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CommonShakeLogic", "getSnsAdBizUic, exp=" + e17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAdBizUic", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
            return null;
        }
    }

    @Override // a94.l
    public boolean f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isHighPriorityAd", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isHighPriorityAd", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        return false;
    }

    public final void g(boolean z17) {
        long j17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onRefresh", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CommonShakeLogic", "onRefresh, isShakeAd=" + z17 + ", hash=" + hashCode() + ", pos=" + this.f245402s);
        this.f245398o = z17;
        if (z17) {
            b94.a aVar = this.f245400q;
            if (aVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getActionDelay", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeInfo");
                j17 = aVar.f100147d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActionDelay", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeInfo");
            } else {
                j17 = 0;
            }
            if (this.f245393g != 0 && j17 < 1000) {
                j17 = 1000;
            }
            i(1, j17);
        } else {
            b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRefresh", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
    }

    @Override // a94.l
    /* renamed from: getPosition */
    public int mo877xa86cd69f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPosition", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        int i17 = this.f245402s;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPosition", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        return i17;
    }

    @Override // a94.l
    public float h() {
        int height;
        int a17;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdContentExposureRatio", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTimelineAdBodyVisibleRatio", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
        android.view.View view = this.f245392f;
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimelineAdBodyVisibleRatio", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
        } else {
            android.content.Context context = this.f245390d;
            if (context == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimelineAdBodyVisibleRatio", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
            } else {
                int height2 = view.getHeight();
                android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f564408qh);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCommentViewHeight", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
                if (findViewById == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TimelineAdVisibleAreaHelper", "getCommentViewHeight==null");
                } else if (findViewById.getVisibility() == 0) {
                    height = findViewById.getHeight() + c44.b.a(12);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentViewHeight", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
                    a17 = l44.v5.f397927a.a(context);
                    int i18 = height2 - height;
                    if (a17 != 0 || i18 <= 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("TimelineAdVisibleAreaHelper", "getAdBodyVisibleRatio, bodyH=0, ratio=0");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimelineAdBodyVisibleRatio", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
                    } else {
                        android.graphics.Rect rect = new android.graphics.Rect();
                        int[] iArr = {0, 0};
                        view.getLocalVisibleRect(rect);
                        view.getLocationOnScreen(iArr);
                        rect.toString();
                        int i19 = iArr[1];
                        int i27 = rect.top;
                        if (i27 == 0 && rect.bottom >= i18 && i19 >= a17) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimelineAdBodyVisibleRatio", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
                            r5 = 1.0f;
                        } else if (i27 >= 0 && i19 < a17) {
                            int i28 = a17 - i19;
                            r5 = i28 < i18 ? 1.0f - (i28 / i18) : 0.0f;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimelineAdBodyVisibleRatio", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
                        } else if (i27 != 0 || (i17 = rect.bottom) >= i18) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimelineAdBodyVisibleRatio", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
                        } else {
                            r5 = 1.0f - ((i18 - i17) / i18);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimelineAdBodyVisibleRatio", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
                        }
                    }
                }
                height = 0;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentViewHeight", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
                a17 = l44.v5.f397927a.a(context);
                int i182 = height2 - height;
                if (a17 != 0) {
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("TimelineAdVisibleAreaHelper", "getAdBodyVisibleRatio, bodyH=0, ratio=0");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimelineAdBodyVisibleRatio", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
            }
        }
        float f17 = r5 * 100;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdContentExposureRatio", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        return f17;
    }

    public final void i(int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("postMsg", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CommonShakeLogic", "postMsg, what=" + i17 + ", delay=" + j17 + ", hash=" + hashCode());
        b94.c cVar = this.f245407x;
        cVar.removeCallbacksAndMessages(null);
        cVar.sendEmptyMessageDelayed(i17, j17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("postMsg", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
    }

    public final void j(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, b94.a aVar, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refresh", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        this.f245401r = c17933xe8d1b226;
        this.f245402s = i17;
        this.f245400q = aVar;
        if (aVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b.C17816xdbf1b100 c17816xdbf1b100 = this.f245395i;
            if (c17816xdbf1b100 != null) {
                c17816xdbf1b100.setVisibility(8);
            }
            g(false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b.C17816xdbf1b100 c17816xdbf1b1002 = this.f245395i;
            if (c17816xdbf1b1002 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CommonShakeLogic", "new shakeView, mediaWidth=" + i18 + ", source=" + this.f245393g + ", hash=" + hashCode());
                if (i18 > 0) {
                    android.content.Context context = this.f245390d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b.C17816xdbf1b100 c17816xdbf1b1003 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b.C17816xdbf1b100(context, null);
                    android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i18, c44.b.a(38));
                    layoutParams.gravity = 80;
                    this.f245391e.addView(c17816xdbf1b1003, layoutParams);
                    this.f245395i = c17816xdbf1b1003;
                }
            } else {
                android.view.ViewGroup.LayoutParams layoutParams2 = c17816xdbf1b1002.getLayoutParams();
                if (!(layoutParams2 != null && layoutParams2.width == i18)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b.C17816xdbf1b100 c17816xdbf1b1004 = this.f245395i;
                    if (c17816xdbf1b1004 != null) {
                        c17816xdbf1b1004.getLayoutParams();
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b.C17816xdbf1b100 c17816xdbf1b1005 = this.f245395i;
                    android.view.ViewGroup.LayoutParams layoutParams3 = c17816xdbf1b1005 != null ? c17816xdbf1b1005.getLayoutParams() : null;
                    if (layoutParams3 != null) {
                        layoutParams3.width = i18;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b.C17816xdbf1b100 c17816xdbf1b1006 = this.f245395i;
                    if (c17816xdbf1b1006 != null) {
                        c17816xdbf1b1006.requestLayout();
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b.C17816xdbf1b100 c17816xdbf1b1007 = this.f245395i;
            if (c17816xdbf1b1007 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getActionTip", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeInfo");
                java.lang.String str = aVar.f100144a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActionTip", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("update", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeView");
                android.widget.TextView textView = c17816xdbf1b1007.f245410d;
                if (textView != null) {
                    textView.setTextSize(0, c44.b.a(12));
                }
                android.widget.TextView textView2 = c17816xdbf1b1007.f245410d;
                if (textView2 != null) {
                    if (str == null || str.length() == 0) {
                        str = c17816xdbf1b1007.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574703ls2);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
                    }
                    textView2.setText(str);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("update", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeView");
            }
            b94.f fVar = this.f245406w;
            fVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isShakeSupported", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.SnsAdShakeDetector");
            boolean z17 = fVar.f100157c != null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isShakeSupported", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.SnsAdShakeDetector");
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b.C17816xdbf1b100 c17816xdbf1b1008 = this.f245395i;
                if (c17816xdbf1b1008 != null) {
                    c17816xdbf1b1008.setVisibility(0);
                }
                g(true);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CommonShakeLogic", "isShakeSupported=false");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b.C17816xdbf1b100 c17816xdbf1b1009 = this.f245395i;
                if (c17816xdbf1b1009 != null) {
                    c17816xdbf1b1009.setVisibility(8);
                }
                g(false);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refresh", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
    }

    public final void k(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportShakeResult", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        int i18 = this.f245393g == 0 ? 1 : 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CommonShakeLogic", "reportShakeResult, result=" + i17 + ", scene=" + i18);
        a94.m.b(this.f245401r, i17, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportShakeResult", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
    }

    public final void l(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b.C17816xdbf1b100 c17816xdbf1b100;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showDebugTip", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        if (ca4.m0.d0() && bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.ad.C19910x92050d3f()) == 1 && (c17816xdbf1b100 = this.f245395i) != null) {
            c17816xdbf1b100.m69691x5c74c1b9(z17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showDebugTip", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
    }
}
