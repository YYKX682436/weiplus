package qi2;

/* loaded from: classes10.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f445191a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f445192b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.ImageView f445193c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f445194d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f445195e;

    /* renamed from: f, reason: collision with root package name */
    public fj2.k f445196f;

    /* renamed from: g, reason: collision with root package name */
    public km2.q f445197g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.ViewGroup f445198h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f445199i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.TextView f445200j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f445201k;

    public z(qi2.c0 c0Var, android.view.View root) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        this.f445191a = root;
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.f567855kw4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f445192b = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.nzc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f445193c = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.nze);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f445194d = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = root.findViewById(com.p314xaae8f345.mm.R.id.nzf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById4;
        this.f445195e = textView;
        this.f445196f = fj2.k.f344708d;
        android.view.View findViewById5 = root.findViewById(com.p314xaae8f345.mm.R.id.f563876bx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById5;
        this.f445198h = viewGroup;
        android.view.View findViewById6 = root.findViewById(com.p314xaae8f345.mm.R.id.f563867bo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f445199i = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById6;
        android.view.View findViewById7 = root.findViewById(com.p314xaae8f345.mm.R.id.f563878c0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f445200j = (android.widget.TextView) findViewById7;
        this.f445201k = true;
        viewGroup.setVisibility(8);
        textView.setOnClickListener(new qi2.x(this, c0Var));
    }

    public final void a(fj2.k teamType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(teamType, "teamType");
        this.f445196f = teamType;
        int i17 = qi2.y.f445189a[teamType.ordinal()];
        android.widget.TextView textView = this.f445200j;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f445199i;
        android.widget.TextView textView2 = this.f445192b;
        android.view.View view = this.f445191a;
        if (i17 == 1) {
            textView2.setText(view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eg8));
            textView2.setTextColor(view.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560631px));
            c22699x3dcdb352.m82040x7541828(view.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560631px));
            textView.setTextColor(view.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560631px));
            return;
        }
        textView2.setText(view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eg7));
        textView2.setTextColor(android.graphics.Color.parseColor("#6467F0"));
        c22699x3dcdb352.m82040x7541828(android.graphics.Color.parseColor("#6467F0"));
        textView.setTextColor(android.graphics.Color.parseColor("#6467F0"));
    }

    public final void b(boolean z17) {
        this.f445201k = z17;
        android.widget.TextView textView = this.f445195e;
        if (z17) {
            textView.setTextColor(android.graphics.Color.parseColor("#576B95"));
        } else {
            textView.setTextColor(android.graphics.Color.parseColor("#80576B95"));
        }
    }
}
