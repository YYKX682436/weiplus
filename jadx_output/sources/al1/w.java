package al1;

/* loaded from: classes7.dex */
public final class w extends al1.q {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f5817i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f5818m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(android.content.Context context, java.util.Map params, yz5.l onViewCreated) {
        super(context);
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(onViewCreated, "onViewCreated");
        android.view.View.inflate(context, com.tencent.mm.R.layout.f488015dn, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.hri);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        setIcon((android.widget.ImageView) findViewById);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.hrj);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f5818m = textView;
        this.f5817i = java.lang.String.valueOf(params.get("key_appid"));
        textView.setText(java.lang.String.valueOf(params.get("key_content")));
        setMOnViewCreated(onViewCreated);
        a(java.lang.String.valueOf(params.get("key_img_url")), false);
        a(java.lang.String.valueOf(params.get("key_img_url_dark")), true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        if (((com.tencent.mm.plugin.appbrand.report.j2) i95.n0.c(com.tencent.mm.plugin.appbrand.report.j2.class)) != null) {
            java.lang.String str = this.f5817i;
            if (str == null) {
                kotlin.jvm.internal.o.o("appId");
                throw null;
            }
            com.tencent.mm.plugin.appbrand.report.v0.k(str, 1, 5, 3);
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (((com.tencent.mm.plugin.appbrand.report.j2) i95.n0.c(com.tencent.mm.plugin.appbrand.report.j2.class)) != null) {
            java.lang.String str = this.f5817i;
            if (str == null) {
                kotlin.jvm.internal.o.o("appId");
                throw null;
            }
            com.tencent.mm.plugin.appbrand.report.v0.k(str, 2, 5, 3);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // al1.q
    public void setColor(int i17) {
        if (getMStyleColor() == i17) {
            return;
        }
        android.widget.TextView textView = this.f5818m;
        if (i17 == -1) {
            textView.setTextColor(-1);
        } else {
            textView.setTextColor(-16777216);
        }
        b(i17);
        setMStyleColor(i17);
    }
}
