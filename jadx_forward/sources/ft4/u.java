package ft4;

/* loaded from: classes14.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f348230a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f348231b;

    /* renamed from: c, reason: collision with root package name */
    public int f348232c;

    /* renamed from: d, reason: collision with root package name */
    public int f348233d;

    /* renamed from: e, reason: collision with root package name */
    public int f348234e;

    /* renamed from: f, reason: collision with root package name */
    public final int f348235f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.LinearLayout f348236g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.LinearLayout f348237h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f348238i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.TextView f348239j;

    /* renamed from: k, reason: collision with root package name */
    public final android.widget.LinearLayout f348240k;

    /* renamed from: l, reason: collision with root package name */
    public final android.view.ViewGroup f348241l;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f348242m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f348243n;

    public u(android.content.Context context, android.view.View root) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        this.f348230a = context;
        this.f348231b = root;
        this.f348232c = 1;
        this.f348236g = (android.widget.LinearLayout) root.findViewById(com.p314xaae8f345.mm.R.id.q2o);
        this.f348237h = (android.widget.LinearLayout) root.findViewById(com.p314xaae8f345.mm.R.id.q2g);
        this.f348238i = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.q2i);
        this.f348239j = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.q2t);
        this.f348240k = (android.widget.LinearLayout) root.findViewById(com.p314xaae8f345.mm.R.id.q2w);
        this.f348241l = (android.view.ViewGroup) root.findViewById(com.p314xaae8f345.mm.R.id.q2h);
        this.f348242m = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.q2j);
        this.f348243n = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.q2u);
        this.f348235f = i65.a.B(context) - i65.a.b(context, 72);
    }

    public final void a(com.p314xaae8f345.mm.p2802xd031a825.ui.z1 z1Var) {
        if (z1Var != null) {
            this.f348237h.setOnClickListener(z1Var);
            this.f348241l.setOnClickListener(z1Var);
        }
    }

    public final void b(int i17, int i18, long j17, long j18) {
        java.lang.String str;
        this.f348233d = i17;
        this.f348234e = i18;
        android.widget.TextView textView = this.f348243n;
        android.widget.TextView textView2 = this.f348239j;
        if (j17 == 0 && j18 == 0) {
            textView2.setVisibility(8);
            textView.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView.setVisibility(0);
        }
        double d17 = 100;
        java.lang.Object[] objArr = {com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(java.lang.Math.abs(j18) / d17)};
        android.content.Context context = this.f348230a;
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575076lh3, objArr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575077lh4, com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(java.lang.Math.abs(j17) / d17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        java.lang.String str2 = string + "  " + string2;
        int i19 = this.f348232c;
        if (i19 == 1) {
            str = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.r(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ld_), com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f(i17));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        } else if (i19 == 2) {
            str = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.r(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcl), com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f(i17));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        } else {
            java.lang.String r17 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.r(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcl), com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f(i17));
            java.lang.String r18 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.r(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcl), com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f(i18));
            if (i17 / 10000 == i18 / 10000) {
                r18 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.r(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573668fc2), com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f(i18));
            }
            str = r17 + '-' + r18;
        }
        float measureText = textView2.getPaint().measureText(str2);
        android.widget.TextView textView3 = this.f348238i;
        float measureText2 = textView3.getPaint().measureText(str);
        int i27 = this.f348232c;
        android.widget.LinearLayout linearLayout = this.f348240k;
        android.widget.LinearLayout linearLayout2 = this.f348236g;
        if (i27 != 1 || measureText + measureText2 >= this.f348235f) {
            linearLayout2.setVisibility(8);
            linearLayout.setVisibility(0);
            textView.setText(str2);
            this.f348242m.setText(str);
            return;
        }
        linearLayout2.setVisibility(0);
        linearLayout.setVisibility(8);
        textView2.setText(str2);
        textView3.setText(str);
    }
}
