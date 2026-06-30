package ns4;

/* loaded from: classes8.dex */
public final class j4 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f421092a;

    /* renamed from: b, reason: collision with root package name */
    public final ns4.k4 f421093b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f421094c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f421095d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f421096e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f421097f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f421098g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f421099h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.CheckBox f421100i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.TextView f421101j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.Button f421102k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.Button f421103l;

    public j4(android.content.Context context, ns4.k4 parameter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parameter, "parameter");
        this.f421092a = context;
        this.f421093b = parameter;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(context);
        this.f421094c = y1Var;
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f571149d64, null);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.cgr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f421095d = (android.widget.LinearLayout) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.h5n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f421096e = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.obc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        this.f421097f = textView;
        com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById4;
        this.f421098g = textView2;
        com.p314xaae8f345.mm.ui.bk.s0(textView2.getPaint());
        android.view.View findViewById5 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f564323o2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f421099h = findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.p314xaae8f345.mm.R.id.btf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f421100i = (android.widget.CheckBox) findViewById6;
        android.view.View findViewById7 = inflate.findViewById(com.p314xaae8f345.mm.R.id.lci);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f421101j = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = inflate.findViewById(com.p314xaae8f345.mm.R.id.b5j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f421102k = (android.widget.Button) findViewById8;
        android.view.View findViewById9 = inflate.findViewById(com.p314xaae8f345.mm.R.id.c_3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.f421103l = (android.widget.Button) findViewById9;
        y1Var.k(inflate);
        y1Var.f293571t = new ns4.f4(this);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = this.f421096e;
        if (c19659x677e0913 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("icon");
            throw null;
        }
        c19659x677e0913.setImageDrawable(context.getDrawable(com.p314xaae8f345.mm.R.raw.f81381x48f364b5));
        java.lang.String str = parameter.f421111a.f460101d;
        boolean z17 = str == null || str.length() == 0;
        r45.ka7 ka7Var = parameter.f421111a;
        if (!z17) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e09132 = this.f421096e;
            if (c19659x677e09132 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("icon");
                throw null;
            }
            c19659x677e09132.m75396xca029dad(ka7Var.f460101d);
        }
        android.widget.TextView textView3 = this.f421097f;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            throw null;
        }
        textView3.setText(ka7Var.f460102e);
        android.widget.TextView textView4 = this.f421098g;
        if (textView4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("content");
            throw null;
        }
        textView4.setText(ka7Var.f460103f);
        android.widget.TextView textView5 = this.f421101j;
        if (textView5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("protocol");
            throw null;
        }
        textView5.setText(ka7Var.f460104g);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.widget.TextView textView6 = this.f421101j;
        if (textView6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("protocol");
            throw null;
        }
        ((ke0.e) xVar).getClass();
        android.text.SpannableString p17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.p(textView6, 1, false, null);
        android.widget.TextView textView7 = this.f421101j;
        if (textView7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("protocol");
            throw null;
        }
        textView7.setText(p17);
        android.widget.TextView textView8 = this.f421101j;
        if (textView8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("protocol");
            throw null;
        }
        textView8.setClickable(true);
        android.widget.TextView textView9 = this.f421101j;
        if (textView9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("protocol");
            throw null;
        }
        textView9.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0());
        android.widget.TextView textView10 = this.f421101j;
        if (textView10 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("protocol");
            throw null;
        }
        textView10.setOnClickListener(new ns4.g4(this));
        android.widget.Button button = this.f421102k;
        if (button == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancel_button");
            throw null;
        }
        button.setOnClickListener(new ns4.h4(this));
        android.widget.Button button2 = this.f421103l;
        if (button2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("confirm_button");
            throw null;
        }
        button2.setOnClickListener(new ns4.i4(this));
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        android.widget.LinearLayout linearLayout = this.f421095d;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
            throw null;
        }
        cy1.a aVar = (cy1.a) rVar;
        aVar.pk(linearLayout, "tyt_vip_pay_renewal_panel");
        android.widget.LinearLayout linearLayout2 = this.f421095d;
        if (linearLayout2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
            throw null;
        }
        aVar.rj(linearLayout2);
        android.widget.LinearLayout linearLayout3 = this.f421095d;
        if (linearLayout3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
            throw null;
        }
        aVar.gk(linearLayout3, kz5.b1.e(new jz5.l("buy_vip_session", js4.r.f383099b)));
        android.widget.LinearLayout linearLayout4 = this.f421095d;
        if (linearLayout4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
            throw null;
        }
        aVar.ik(linearLayout4, 32, 25955);
        dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
        android.widget.Button button3 = this.f421103l;
        if (button3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("confirm_button");
            throw null;
        }
        cy1.a aVar2 = (cy1.a) rVar2;
        aVar2.pk(button3, "tyt_vip_renewal_panel_agree");
        android.widget.LinearLayout linearLayout5 = this.f421095d;
        if (linearLayout5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
            throw null;
        }
        aVar2.gk(linearLayout5, kz5.b1.e(new jz5.l("buy_vip_session", js4.r.f383099b)));
        android.widget.Button button4 = this.f421103l;
        if (button4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("confirm_button");
            throw null;
        }
        aVar2.ik(button4, 8, 25955);
        dy1.r rVar3 = (dy1.r) i95.n0.c(dy1.r.class);
        android.widget.Button button5 = this.f421102k;
        if (button5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancel_button");
            throw null;
        }
        cy1.a aVar3 = (cy1.a) rVar3;
        aVar3.pk(button5, "tyt_vip_renewal_panel_disagree");
        android.widget.LinearLayout linearLayout6 = this.f421095d;
        if (linearLayout6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
            throw null;
        }
        aVar3.gk(linearLayout6, kz5.b1.e(new jz5.l("buy_vip_session", js4.r.f383099b)));
        android.widget.Button button6 = this.f421102k;
        if (button6 != null) {
            aVar3.ik(button6, 8, 25955);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancel_button");
            throw null;
        }
    }
}
