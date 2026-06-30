package cb1;

/* loaded from: classes9.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f121814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f121815e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.yb f121816f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121817g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ cb1.y0 f121818h;

    public p0(cb1.y0 y0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, int i17, r45.yb ybVar, java.lang.String str) {
        this.f121818h = y0Var;
        this.f121814d = v5Var;
        this.f121815e = i17;
        this.f121816f = ybVar;
        this.f121817g = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        cb1.y0 y0Var = this.f121818h;
        y0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f121814d;
        android.view.View inflate = ((android.view.LayoutInflater) v5Var.getF229340d().getSystemService("layout_inflater")).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569541ea, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a9e);
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.a9d);
        android.widget.Button button2 = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.a9f);
        textView.setText(android.text.Html.fromHtml(this.f121817g));
        android.text.SpannableString spannableString = new android.text.SpannableString(textView.getText());
        for (android.text.style.URLSpan uRLSpan : (android.text.style.URLSpan[]) spannableString.getSpans(0, spannableString.length(), android.text.style.URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1066x55c963b2.C12011x370fa712(uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
        textView.setText(spannableString);
        textView.setMovementMethod(new cb1.r0(y0Var, v5Var));
        r45.yb ybVar = this.f121816f;
        int i17 = this.f121815e;
        button.setOnClickListener(new cb1.s0(y0Var, ybVar, v5Var, i17));
        button2.setOnClickListener(new cb1.t0(y0Var, ybVar, v5Var, i17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "showAlertImplNew, show the new bottom dialog!");
        cb1.k1 k1Var = new cb1.k1(v5Var.getF229340d());
        y0Var.f121869g = k1Var;
        k1Var.setContentView(inflate);
        y0Var.f121869g.setCancelable(false);
        y0Var.f121869g.setCanceledOnTouchOutside(false);
        fl1.g2 m48800x14ed3266 = v5Var.mo32091x9a3f0ba2().m48800x14ed3266();
        if (m48800x14ed3266 != null) {
            ((fl1.c0) m48800x14ed3266).c(y0Var.f121869g);
        }
    }
}
