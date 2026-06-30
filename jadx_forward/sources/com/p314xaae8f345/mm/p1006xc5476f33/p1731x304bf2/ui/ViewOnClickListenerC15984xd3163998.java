package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameNewTopBannerView */
/* loaded from: classes5.dex */
public class ViewOnClickListenerC15984xd3163998 extends android.widget.FrameLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f222479d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f222480e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f222481f;

    /* renamed from: g, reason: collision with root package name */
    public int f222482g;

    /* renamed from: h, reason: collision with root package name */
    public int f222483h;

    /* renamed from: i, reason: collision with root package name */
    public int f222484i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f222485m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f222486n;

    public ViewOnClickListenerC15984xd3163998(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f222485m = "";
        this.f222486n = null;
        this.f222479d = context;
    }

    public final int a(android.widget.ImageView imageView, int i17, int i18) {
        int h17 = r53.f.h(this.f222479d);
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameTopBannerView", "resizeGameThemePic, params is null");
            return 0;
        }
        layoutParams.height = (int) ((i17 / i18) * h17);
        imageView.setLayoutParams(layoutParams);
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        return layoutParams.height;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameNewTopBannerView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() != null && (view.getTag() instanceof java.lang.String)) {
            java.lang.String str = (java.lang.String) view.getTag();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.d(this.f222479d, 10, 1017, 1, r53.f.v(this.f222479d, str, "game_center_top_banner", null), 0, null, this.f222484i, 0, null, null, this.f222486n);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameNewTopBannerView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f222480e = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.ahg);
        this.f222481f = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.n0h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTopBannerView", "initView finished");
    }
}
