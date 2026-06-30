package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036;

@db5.a(m123858x6ac9171 = 3)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/game/luggage/LuggageGameHalfWebViewUI;", "Lcom/tencent/mm/plugin/game/luggage/LuggageGameWebViewUI;", "<init>", "()V", "luggage-game_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.game.luggage.LuggageGameHalfWebViewUI */
/* loaded from: classes8.dex */
public final class ActivityC15874x8f11b532 extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15876x18f56825 {

    /* renamed from: n, reason: collision with root package name */
    public int f221022n;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f221021m = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.r(this));

    /* renamed from: o, reason: collision with root package name */
    public boolean f221023o = true;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f221024p = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.w(this));

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f221025q = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.x(this));

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15876x18f56825
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 W6(android.os.Bundle params, java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        sd.o0 g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1.g(this, url);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createPage, wc : ");
        sb6.append(g17 != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageGameHalfWebViewUI", sb6.toString());
        if (g17 == null) {
            sd.x xVar = this.f221027d.f488202j;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(xVar, "getCtrl(...)");
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.d(xVar, null, params);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.b0 b0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.b0) g17.h();
        if ((b0Var != null ? b0Var.getParent() : null) instanceof android.view.ViewGroup) {
            android.view.ViewParent parent = b0Var.getParent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).removeView(b0Var);
        }
        sd.x xVar2 = this.f221027d.f488202j;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(xVar2, "getCtrl(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.c(xVar2, g17, params);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15876x18f56825
    public void a7(android.view.View view) {
    }

    public final double c7() {
        return ((java.lang.Number) ((jz5.n) this.f221021m).mo141623x754a37bb()).doubleValue();
    }

    public final void d7(android.view.ViewGroup viewGroup) {
        java.util.Objects.toString(viewGroup);
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            if (childAt instanceof android.view.ViewGroup) {
                childAt.setBackgroundResource(0);
                d7((android.view.ViewGroup) childAt);
            } else if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(childAt, (android.view.View) ((jz5.n) this.f221024p).mo141623x754a37bb()) && !(childAt instanceof android.view.TextureView)) {
                java.util.Objects.toString(childAt);
                childAt.setBackgroundColor(0);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15876x18f56825, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bga;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15876x18f56825, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559344c5, com.p314xaae8f345.mm.R.C30854x2dc211.f559317bd);
        float floatExtra = getIntent().getFloatExtra("KHalfScreenHeightPercent", -1.0f);
        int intExtra = getIntent().getIntExtra("KHalfScreenBackGroundColor", 0);
        if (floatExtra <= 0.0f || floatExtra > 1.0f) {
            int intExtra2 = getIntent().getIntExtra("KHalfScreenHeight", (int) c7());
            this.f221022n = intExtra2;
            this.f221022n = com.p314xaae8f345.mm.ui.zk.a(this, intExtra2);
            this.f221023o = true;
        } else {
            this.f221022n = (int) (floatExtra * c7());
            this.f221023o = false;
        }
        if (this.f221022n > c7()) {
            this.f221022n = (int) c7();
        }
        jz5.g gVar = this.f221024p;
        ((android.view.View) ((jz5.n) gVar).mo141623x754a37bb()).setBackgroundColor(intExtra);
        ((android.view.View) ((jz5.n) gVar).mo141623x754a37bb()).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.t(this));
        this.f221027d.f488195c.setAnimation(android.view.animation.AnimationUtils.loadAnimation(this, com.p314xaae8f345.mm.R.C30854x2dc211.f559343c4));
        jz5.g gVar2 = this.f221025q;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.C15872x5d00238a) ((jz5.n) gVar2).mo141623x754a37bb()).addView(this.f221027d.f488195c, new android.view.ViewGroup.LayoutParams(-1, this.f221022n));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.C15872x5d00238a) ((jz5.n) gVar2).mo141623x754a37bb()).m64509xc07e953d(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.u(this));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.C15872x5d00238a) ((jz5.n) gVar2).mo141623x754a37bb()).m64508xa9cb5ca8(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.v(this));
        if (this.f221023o) {
            return;
        }
        try {
            if (getWindow() != null) {
                android.view.View findViewById = getWindow().getDecorView().findViewById(android.R.id.content);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
                android.view.View childAt = ((android.view.ViewGroup) findViewById).getChildAt(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
                d7((android.view.ViewGroup) childAt);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15876x18f56825, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
