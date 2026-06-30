package mu1;

/* loaded from: classes15.dex */
public class i extends mu1.a {

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f412913g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f412914h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f412915i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.TextView f412916j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f412917k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View f412918l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f412919m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f412920n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f412921o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f412922p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.ArrayList f412923q;

    @Override // mu1.a
    public void g() {
        this.f412913g = (android.widget.TextView) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.bcg);
        this.f412914h = this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.b88);
        this.f412915i = (android.widget.ImageView) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.o7b);
        this.f412916j = (android.widget.TextView) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.o7a);
        this.f412917k = (android.widget.TextView) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.o7_);
        this.f412918l = this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.o7d);
        this.f412919m = (android.widget.TextView) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.o7f);
        this.f412920n = (android.widget.TextView) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.o7e);
        this.f412921o = (android.widget.ImageView) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.o7c);
        this.f412922p = (android.widget.TextView) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.o79);
    }

    @Override // mu1.a
    public void h() {
        if (this.f412867a.s0().X != null && !android.text.TextUtils.isEmpty(this.f412867a.s0().X.f470411d)) {
            this.f412871e.setText(this.f412867a.s0().X.f470411d);
        } else if (android.text.TextUtils.isEmpty(this.f412867a.s0().f470085m)) {
            this.f412871e.setText("");
        } else {
            this.f412871e.setText(this.f412867a.s0().f470085m);
        }
        if (this.f412867a.s0().X == null || android.text.TextUtils.isEmpty(this.f412867a.s0().X.f470412e)) {
            this.f412913g.setText("");
            this.f412913g.setVisibility(8);
        } else {
            this.f412913g.setText(this.f412867a.s0().X.f470412e);
            this.f412913g.setVisibility(0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardWidgetTicket", "updateContentView()");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f412867a.s0().C)) {
            lu1.g0.d(this.f412868b, this.f412915i, com.p314xaae8f345.mm.R.C30861xcebc809e.bz6, lu1.a0.d(this.f412867a.s0().f470088p));
        } else {
            lu1.g0.c(this.f412868b, this.f412915i, this.f412867a.s0().C, this.f412868b.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561736r9), com.p314xaae8f345.mm.R.C30861xcebc809e.bz6, false, lu1.a0.d(this.f412867a.s0().f470088p));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        if (this.f412867a.s0().f470093s != null && this.f412867a.s0().f470093s.size() >= 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardWidgetTicket", "primary_fields length is >= 2");
            r45.w50 w50Var = (r45.w50) this.f412867a.s0().f470093s.get(0);
            r45.w50 w50Var2 = (r45.w50) this.f412867a.s0().f470093s.get(1);
            sb6.append(w50Var.f470411d);
            sb6.append(" - ");
            sb6.append(w50Var2.f470411d);
            if (!android.text.TextUtils.isEmpty(w50Var.f470413f) && !android.text.TextUtils.isEmpty(w50Var2.f470413f)) {
                sb7.append(w50Var.f470413f);
                sb7.append(" ");
                sb7.append(w50Var.f470412e);
                sb7.append(" - ");
                sb7.append(w50Var2.f470413f);
                sb7.append(" ");
                sb7.append(w50Var2.f470412e);
            }
        } else if (this.f412867a.s0().f470093s != null && this.f412867a.s0().f470093s.size() == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardWidgetTicket", "primary_fields length is == 1");
            r45.w50 w50Var3 = (r45.w50) this.f412867a.s0().f470093s.get(0);
            sb6.append(w50Var3.f470411d);
            sb7.append(w50Var3.f470412e);
        }
        if (android.text.TextUtils.isEmpty(sb6.toString())) {
            this.f412916j.setText("");
        } else {
            this.f412916j.setText(sb6.toString());
        }
        if (!android.text.TextUtils.isEmpty(sb7.toString())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardWidgetTicket", "sub_title_builder is not empty!");
            this.f412917k.setText(sb7.toString());
            this.f412917k.setVisibility(0);
        } else if (android.text.TextUtils.isEmpty(this.f412867a.s0().K)) {
            this.f412917k.setVisibility(8);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardWidgetTicket", "primary_sub_title is not empty!");
            this.f412917k.setText(this.f412867a.s0().K);
            this.f412917k.setVisibility(0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardWidgetTicket", "updateShopView(), shop_count:" + this.f412867a.s0().f470098x);
        if (this.f412867a.s0().f470098x <= 0) {
            android.view.View view = this.f412918l;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/widget/CardWidgetTicket", "updateShopView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/widget/CardWidgetTicket", "updateShopView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f412922p.setVisibility(8);
        } else {
            android.view.View view2 = this.f412918l;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/card/widget/CardWidgetTicket", "updateShopView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/card/widget/CardWidgetTicket", "updateShopView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f412918l.setOnClickListener(this.f412872f);
            lu1.g0.d(this.f412868b, this.f412921o, com.p314xaae8f345.mm.R.C30861xcebc809e.bz7, lu1.a0.d(this.f412867a.s0().f470088p));
            java.util.ArrayList arrayList3 = this.f412923q;
            r45.nu nuVar = (arrayList3 == null || arrayList3.size() < 1) ? null : (r45.nu) this.f412923q.get(0);
            if (this.f412867a.s0().f470098x == 1 && nuVar != null) {
                this.f412919m.setText(nuVar.f463205d);
                android.widget.TextView textView = this.f412920n;
                android.content.Context context = this.f412868b;
                textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.avi, lu1.a0.D(context, nuVar.f463212n), nuVar.f463211m));
                this.f412922p.setVisibility(8);
                this.f412918l.setTag(nuVar.f463205d);
            } else if (this.f412867a.s0().f470098x > 1 && nuVar != null) {
                this.f412919m.setText(nuVar.f463205d);
                android.widget.TextView textView2 = this.f412920n;
                android.content.Context context2 = this.f412868b;
                textView2.setText(context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.avi, lu1.a0.D(context2, nuVar.f463212n), nuVar.f463211m));
                this.f412922p.setVisibility(0);
                this.f412922p.setOnClickListener(this.f412872f);
                this.f412918l.setTag(nuVar.f463205d);
            } else if (this.f412867a.s0().f470098x >= 1) {
                this.f412919m.setText(com.p314xaae8f345.mm.R.C30867xcad56011.arn);
                this.f412920n.setText(this.f412868b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572345aw4, java.lang.Integer.valueOf(this.f412867a.s0().f470098x)));
                this.f412922p.setVisibility(8);
                this.f412922p.setOnClickListener(null);
                this.f412918l.setTag(this.f412868b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.arn));
            }
        }
        if (this.f412867a.z()) {
            android.view.View view3 = this.f412914h;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/card/widget/CardWidgetTicket", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/card/widget/CardWidgetTicket", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view4 = this.f412914h;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/plugin/card/widget/CardWidgetTicket", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/card/widget/CardWidgetTicket", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
