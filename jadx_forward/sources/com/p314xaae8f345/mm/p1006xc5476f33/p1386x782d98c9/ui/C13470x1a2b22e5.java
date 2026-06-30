package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeView */
/* loaded from: classes12.dex */
public class C13470x1a2b22e5 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f180821d;

    /* renamed from: e, reason: collision with root package name */
    public int f180822e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.h3 f180823f;

    /* renamed from: g, reason: collision with root package name */
    public int f180824g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f180825h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f180826i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ProgressBar f180827m;

    public C13470x1a2b22e5(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f180824g = 2;
        this.f180821d = context;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a9x, (android.view.ViewGroup) this, true);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565778dj3);
        this.f180825h = textView;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "textView");
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        java.lang.Object systemService = context2.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        textView.setTextSize(1, (displayMetrics.density * 14.0f) / context2.getResources().getDisplayMetrics().density);
        this.f180826i = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565777dj2);
        this.f180827m = (android.widget.ProgressBar) inflate.findViewById(com.p314xaae8f345.mm.R.id.dj6);
        setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.g3(this));
    }

    /* renamed from: setLikeNum */
    public void m55081xbb9f51ad(int i17) {
        this.f180822e = i17;
        java.lang.String str = "" + this.f180822e;
        if (this.f180822e < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExdeviceLikeView", "hy: like num is negative. set to 0");
            str = "0";
        } else if (i17 > 999) {
            str = "999+";
        }
        if (this.f180822e <= 0) {
            this.f180825h.setVisibility(8);
        } else {
            this.f180825h.setVisibility(0);
        }
        this.f180825h.setText(str);
    }

    /* renamed from: setOnLikeViewClickListener */
    public void m55082xb367217f(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.h3 h3Var) {
        this.f180823f = h3Var;
    }

    /* renamed from: setSelfLikeState */
    public void m55083x10ef340c(int i17) {
        this.f180824g = i17;
        if (i17 == 1) {
            this.f180827m.setVisibility(8);
            this.f180825h.setVisibility(0);
            this.f180826i.setVisibility(0);
            this.f180826i.setImageResource(com.p314xaae8f345.mm.R.raw.f78966x490a458b);
            return;
        }
        if (i17 == 0) {
            this.f180827m.setVisibility(8);
            this.f180825h.setVisibility(0);
            this.f180826i.setVisibility(0);
            this.f180826i.setImageResource(com.p314xaae8f345.mm.R.raw.f78967x143f6f12);
            return;
        }
        if (i17 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExdeviceLikeView", "hy: error state");
            return;
        }
        this.f180825h.setVisibility(8);
        this.f180827m.setVisibility(0);
        this.f180826i.setVisibility(8);
    }

    public C13470x1a2b22e5(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
