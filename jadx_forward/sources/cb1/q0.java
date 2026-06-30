package cb1;

/* loaded from: classes4.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f121822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f121823e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.yb f121824f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f121825g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121826h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f121827i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ cb1.y0 f121828m;

    public q0(cb1.y0 y0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, int i17, r45.yb ybVar, int i18, java.lang.String str, java.util.LinkedList linkedList) {
        this.f121828m = y0Var;
        this.f121822d = v5Var;
        this.f121823e = i17;
        this.f121824f = ybVar;
        this.f121825g = i18;
        this.f121826h = str;
        this.f121827i = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        cb1.y0 y0Var = this.f121828m;
        y0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f121822d;
        java.lang.String string = this.f121825g == 2 ? v5Var.getF229340d().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571580jf) : v5Var.getF229340d().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571581jg);
        java.lang.String string2 = v5Var.getF229340d().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571582jh);
        java.lang.String string3 = v5Var.getF229340d().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571579je);
        java.lang.String string4 = v5Var.getF229340d().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571578jd);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) v5Var.getF229340d().getSystemService("layout_inflater");
        android.view.View inflate = layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569544ed, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564623wb);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564624wc);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564625wd);
        textView.setText(this.f121826h);
        textView2.setText(string4);
        textView2.setOnClickListener(new cb1.u0(y0Var, v5Var));
        linearLayout.removeAllViews();
        java.util.LinkedList linkedList = this.f121827i;
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
                android.widget.TextView textView3 = (android.widget.TextView) layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569539e8, (android.view.ViewGroup) null);
                textView3.setText(str);
                android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
                layoutParams2.bottomMargin = v5Var.mo51310xc2a54588().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561565m5);
                textView3.setLayoutParams(layoutParams2);
                linearLayout.addView(textView3);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "show the auto fill data protocol dialog!");
        android.content.Context f229340d = v5Var.getF229340d();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293242a = string;
        aVar.L = inflate;
        aVar.B = false;
        aVar.A = false;
        aVar.f293265v = string2;
        r45.yb ybVar = this.f121824f;
        int i17 = this.f121823e;
        aVar.E = new cb1.w0(y0Var, ybVar, v5Var, i17);
        aVar.f293266w = string3;
        aVar.F = new cb1.v0(y0Var, ybVar, v5Var, i17);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(f229340d, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
    }
}
