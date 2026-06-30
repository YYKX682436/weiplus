package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.sns;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/sns/MagicSnsTimelineDemoUI;", "Lcom/tencent/mm/ui/MMComposeActivity;", "<init>", "()V", "", "visible", "", "visibleScene", "mb-samples_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.magicbrush.sns.MagicSnsTimelineDemoUI */
/* loaded from: classes5.dex */
public final class ActivityC16463xebab0e3 extends com.p314xaae8f345.mm.ui.AbstractActivityC21399xe75e5101 {

    /* renamed from: f, reason: collision with root package name */
    public int f229670f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f229668d = kz5.c0.i("新年快乐", "万事胜意", "新春快乐", "过年好", "身体健康", "恭喜发财", "新年新气象");

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f229669e = kz5.c0.i("[呲牙]", "[爱心]", "[旺柴]", "[猪头]", "[發]", "[福]");

    /* renamed from: g, reason: collision with root package name */
    public final c06.e f229671g = c06.f.a(java.lang.System.currentTimeMillis());

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f229672h = jz5.h.b(new te3.o(this));

    /* renamed from: i, reason: collision with root package name */
    public final te3.q f229673i = new te3.q(this);

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f229674m = jz5.h.b(new te3.p(this));

    /* renamed from: n, reason: collision with root package name */
    public final te3.r f229675n = new te3.r(this);

    public static final void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.sns.ActivityC16463xebab0e3 activityC16463xebab0e3, aq0.f delegate) {
        activityC16463xebab0e3.getClass();
        android.util.DisplayMetrics displayMetrics = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDisplayMetrics();
        aq0.g gVar = (aq0.g) i95.n0.c(aq0.g.class);
        aq0.i iVar = aq0.i.f94559e;
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, displayMetrics.widthPixels * 1.0f, displayMetrics.heightPixels * 1.0f);
        v12.i iVar2 = (v12.i) gVar;
        iVar2.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        int i17 = iVar2.f514045i + 1;
        iVar2.f514045i = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicSnsTimeline", "enterScene " + iVar + ", rect = " + rectF + ", cnt: " + i17);
        v12.f fVar = iVar2.f514040d;
        if (fVar == null) {
            fVar = new v12.f();
            fVar.f514036e = iVar2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicSnsTimeline", "create new sns timeline biz done");
        }
        iVar2.f514040d = fVar;
        iVar2.f514043g = delegate;
        if (iVar != iVar2.f514042f) {
            fVar.C0(new zp0.a());
        }
        x12.a aVar = new x12.a(iVar, rectF);
        v12.f fVar2 = iVar2.f514040d;
        if (fVar2 != null) {
            fVar2.C0(aVar);
        }
        delegate.a(new v12.g(i17, iVar2));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutView */
    public android.view.View mo44092x29ebce5() {
        com.p314xaae8f345.mm.p935xe99f85f3.C11098x3efa6197 c11098x3efa6197 = new com.p314xaae8f345.mm.p935xe99f85f3.C11098x3efa6197(this, null, 2, null);
        c11098x3efa6197.m47820xe9f5bdb7(u0.j.c(193544540, true, new te3.n(this)));
        return c11098x3efa6197;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        v12.i iVar = (v12.i) ((aq0.g) i95.n0.c(aq0.g.class));
        iVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicSnsTimeline", "destroy biz");
        iVar.f514045i++;
        v12.f fVar = iVar.f514040d;
        if (fVar != null) {
            fVar.f514036e = null;
            ((rc3.w0) fVar.f514035d).m162151x5cd39ffa();
            iVar.f514040d = null;
        }
        android.view.View view = iVar.f514041e;
        if (view != null) {
            android.view.ViewParent parent = view.getParent();
            android.widget.FrameLayout frameLayout = parent instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) parent : null;
            if (frameLayout != null) {
                frameLayout.removeView(view);
            }
            iVar.f514041e = null;
        }
        iVar.f514042f = aq0.i.f94558d;
        iVar.f514043g = null;
        iVar.f514044h = null;
    }
}
