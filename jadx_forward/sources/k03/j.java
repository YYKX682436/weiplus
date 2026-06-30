package k03;

/* loaded from: classes8.dex */
public final class j implements io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384655d;

    /* renamed from: e, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f384656e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.LinearLayout f384657f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f384658g;

    public j(android.content.Context context, int i17, java.util.Map map, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 messenger) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(messenger, "messenger");
        java.lang.Object obj = map != null ? map.get("query") : null;
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        this.f384655d = str == null ? "" : str;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(messenger, "com.tencent.websearch/sug_platform_view_" + i17);
        this.f384656e = c28688xe8dbe4c2;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        linearLayout.setBackgroundColor(-1);
        this.f384657f = linearLayout;
        float f17 = context.getResources().getDisplayMetrics().density;
        int i18 = (int) (16 * f17);
        int i19 = (int) (24 * f17);
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setText(a(this.f384655d));
        textView.setTextColor(android.graphics.Color.parseColor("#999999"));
        textView.setTextSize(14.0f);
        textView.setGravity(17);
        textView.setPadding(i18, i19, i18, i19);
        this.f384658g = textView;
        linearLayout.addView(textView, new android.widget.LinearLayout.LayoutParams(-1, -2));
        c28688xe8dbe4c2.m138441xdf757329(new k03.i(this));
        c28688xe8dbe4c2.m138438xd8c5c779("onSectionOrderChanged", java.util.Collections.singletonMap("isWebSearchTop", java.lang.Boolean.TRUE));
    }

    public final java.lang.String a(java.lang.String str) {
        if (r26.n0.N(str)) {
            return "[Sug PlatformView] 等待输入...";
        }
        return "[Sug PlatformView] query=\"" + str + "\"\n(Stub: 待接入真实 sug CGI)";
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: dispose */
    public void mo31847x63a5261f() {
        this.f384656e.m138441xdf757329(null);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: getView */
    public android.view.View mo31848xfb86a31b() {
        return this.f384657f;
    }
}
