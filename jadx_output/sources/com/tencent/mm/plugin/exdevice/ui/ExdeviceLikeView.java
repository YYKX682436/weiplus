package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class ExdeviceLikeView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f99288d;

    /* renamed from: e, reason: collision with root package name */
    public int f99289e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.exdevice.ui.h3 f99290f;

    /* renamed from: g, reason: collision with root package name */
    public int f99291g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f99292h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f99293i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ProgressBar f99294m;

    public ExdeviceLikeView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f99291g = 2;
        this.f99288d = context;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.a9x, (android.view.ViewGroup) this, true);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f484245dj3);
        this.f99292h = textView;
        kotlin.jvm.internal.o.g(textView, "textView");
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        java.lang.Object systemService = context2.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        textView.setTextSize(1, (displayMetrics.density * 14.0f) / context2.getResources().getDisplayMetrics().density);
        this.f99293i = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f484244dj2);
        this.f99294m = (android.widget.ProgressBar) inflate.findViewById(com.tencent.mm.R.id.dj6);
        setOnClickListener(new com.tencent.mm.plugin.exdevice.ui.g3(this));
    }

    public void setLikeNum(int i17) {
        this.f99289e = i17;
        java.lang.String str = "" + this.f99289e;
        if (this.f99289e < 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ExdeviceLikeView", "hy: like num is negative. set to 0");
            str = "0";
        } else if (i17 > 999) {
            str = "999+";
        }
        if (this.f99289e <= 0) {
            this.f99292h.setVisibility(8);
        } else {
            this.f99292h.setVisibility(0);
        }
        this.f99292h.setText(str);
    }

    public void setOnLikeViewClickListener(com.tencent.mm.plugin.exdevice.ui.h3 h3Var) {
        this.f99290f = h3Var;
    }

    public void setSelfLikeState(int i17) {
        this.f99291g = i17;
        if (i17 == 1) {
            this.f99294m.setVisibility(8);
            this.f99292h.setVisibility(0);
            this.f99293i.setVisibility(0);
            this.f99293i.setImageResource(com.tencent.mm.R.raw.device_rank_item_liked);
            return;
        }
        if (i17 == 0) {
            this.f99294m.setVisibility(8);
            this.f99292h.setVisibility(0);
            this.f99293i.setVisibility(0);
            this.f99293i.setImageResource(com.tencent.mm.R.raw.device_rank_item_unliked);
            return;
        }
        if (i17 != 2) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ExdeviceLikeView", "hy: error state");
            return;
        }
        this.f99292h.setVisibility(8);
        this.f99294m.setVisibility(0);
        this.f99293i.setVisibility(8);
    }

    public ExdeviceLikeView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
