package cb1;

/* loaded from: classes4.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f40289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f40290e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.yb f40291f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f40292g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f40293h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f40294i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ cb1.y0 f40295m;

    public q0(cb1.y0 y0Var, com.tencent.mm.plugin.appbrand.page.v5 v5Var, int i17, r45.yb ybVar, int i18, java.lang.String str, java.util.LinkedList linkedList) {
        this.f40295m = y0Var;
        this.f40289d = v5Var;
        this.f40290e = i17;
        this.f40291f = ybVar;
        this.f40292g = i18;
        this.f40293h = str;
        this.f40294i = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        cb1.y0 y0Var = this.f40295m;
        y0Var.getClass();
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f40289d;
        java.lang.String string = this.f40292g == 2 ? v5Var.getF147807d().getString(com.tencent.mm.R.string.f490047jf) : v5Var.getF147807d().getString(com.tencent.mm.R.string.f490048jg);
        java.lang.String string2 = v5Var.getF147807d().getString(com.tencent.mm.R.string.f490049jh);
        java.lang.String string3 = v5Var.getF147807d().getString(com.tencent.mm.R.string.f490046je);
        java.lang.String string4 = v5Var.getF147807d().getString(com.tencent.mm.R.string.f490045jd);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) v5Var.getF147807d().getSystemService("layout_inflater");
        android.view.View inflate = layoutInflater.inflate(com.tencent.mm.R.layout.f488011ed, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f483090wb);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f483091wc);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.f483092wd);
        textView.setText(this.f40293h);
        textView2.setText(string4);
        textView2.setOnClickListener(new cb1.u0(y0Var, v5Var));
        linearLayout.removeAllViews();
        java.util.LinkedList linkedList = this.f40294i;
        if (linkedList == null || linkedList.size() <= 0) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) textView2.getLayoutParams();
            layoutParams.leftMargin = 0;
            textView2.setLayoutParams(layoutParams);
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                android.widget.TextView textView3 = (android.widget.TextView) layoutInflater.inflate(com.tencent.mm.R.layout.f488006e8, (android.view.ViewGroup) null);
                textView3.setText(str);
                android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
                layoutParams2.bottomMargin = v5Var.getContentView().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480032m5);
                textView3.setLayoutParams(layoutParams2);
                linearLayout.addView(textView3);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "show the auto fill data protocol dialog!");
        android.content.Context f147807d = v5Var.getF147807d();
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211709a = string;
        aVar.L = inflate;
        aVar.B = false;
        aVar.A = false;
        aVar.f211732v = string2;
        r45.yb ybVar = this.f40291f;
        int i17 = this.f40290e;
        aVar.E = new cb1.w0(y0Var, ybVar, v5Var, i17);
        aVar.f211733w = string3;
        aVar.F = new cb1.v0(y0Var, ybVar, v5Var, i17);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(f147807d, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.show();
    }
}
