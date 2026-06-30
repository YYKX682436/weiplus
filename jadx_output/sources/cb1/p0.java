package cb1;

/* loaded from: classes9.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f40281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f40282e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.yb f40283f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f40284g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ cb1.y0 f40285h;

    public p0(cb1.y0 y0Var, com.tencent.mm.plugin.appbrand.page.v5 v5Var, int i17, r45.yb ybVar, java.lang.String str) {
        this.f40285h = y0Var;
        this.f40281d = v5Var;
        this.f40282e = i17;
        this.f40283f = ybVar;
        this.f40284g = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        cb1.y0 y0Var = this.f40285h;
        y0Var.getClass();
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f40281d;
        android.view.View inflate = ((android.view.LayoutInflater) v5Var.getF147807d().getSystemService("layout_inflater")).inflate(com.tencent.mm.R.layout.f488008ea, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.a9e);
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.a9d);
        android.widget.Button button2 = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.a9f);
        textView.setText(android.text.Html.fromHtml(this.f40284g));
        android.text.SpannableString spannableString = new android.text.SpannableString(textView.getText());
        for (android.text.style.URLSpan uRLSpan : (android.text.style.URLSpan[]) spannableString.getSpans(0, spannableString.length(), android.text.style.URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new com.tencent.mm.plugin.appbrand.jsapi.autofill.URLSpanNoUnderline(uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
        textView.setText(spannableString);
        textView.setMovementMethod(new cb1.r0(y0Var, v5Var));
        r45.yb ybVar = this.f40283f;
        int i17 = this.f40282e;
        button.setOnClickListener(new cb1.s0(y0Var, ybVar, v5Var, i17));
        button2.setOnClickListener(new cb1.t0(y0Var, ybVar, v5Var, i17));
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "showAlertImplNew, show the new bottom dialog!");
        cb1.k1 k1Var = new cb1.k1(v5Var.getF147807d());
        y0Var.f40336g = k1Var;
        k1Var.setContentView(inflate);
        y0Var.f40336g.setCancelable(false);
        y0Var.f40336g.setCanceledOnTouchOutside(false);
        fl1.g2 authorizeDialogContainer = v5Var.getRuntime().getAuthorizeDialogContainer();
        if (authorizeDialogContainer != null) {
            ((fl1.c0) authorizeDialogContainer).c(y0Var.f40336g);
        }
    }
}
