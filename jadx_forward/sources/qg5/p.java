package qg5;

/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f444652a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f444653b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f444654c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f444655d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f444656e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f444657f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f444658g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f444659h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f444660i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f444661j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f444662k;

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f444663l;

    public p(android.content.Context context, java.util.List msgList, yz5.a aVar, yz5.a aVar2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        this.f444652a = context;
        this.f444653b = msgList;
        this.f444654c = aVar;
        this.f444655d = aVar2;
        this.f444656e = jz5.h.b(qg5.d.f444476d);
        this.f444657f = jz5.h.b(qg5.m.f444599d);
        this.f444658g = jz5.h.b(qg5.o.f444636d);
        jz5.g b17 = jz5.h.b(new qg5.l(this));
        this.f444659h = b17;
        jz5.g b18 = jz5.h.b(new qg5.k(this));
        this.f444660i = jz5.h.b(new qg5.c(this));
        this.f444661j = jz5.h.b(new qg5.n(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsAnalyzeStagingDialog", "Creating staging dialog");
        em.f fVar = (em.f) ((jz5.n) b18).mo141623x754a37bb();
        if (fVar.f335830b == null) {
            fVar.f335830b = (android.widget.TextView) fVar.f335829a.findViewById(com.p314xaae8f345.mm.R.id.f567447ug4);
        }
        fVar.f335830b.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pda, java.lang.Integer.valueOf(msgList.size())));
        em.f fVar2 = (em.f) ((jz5.n) b18).mo141623x754a37bb();
        if (fVar2.f335832d == null) {
            fVar2.f335832d = (android.widget.Button) fVar2.f335829a.findViewById(com.p314xaae8f345.mm.R.id.t3i);
        }
        fVar2.f335832d.setOnClickListener(new qg5.e(this));
        qg5.j jVar = new qg5.j(this);
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pd8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pd7, string));
        spannableStringBuilder.setSpan(jVar, spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 33);
        em.f fVar3 = (em.f) ((jz5.n) b18).mo141623x754a37bb();
        if (fVar3.f335833e == null) {
            fVar3.f335833e = (android.widget.TextView) fVar3.f335829a.findViewById(com.p314xaae8f345.mm.R.id.vgi);
        }
        android.widget.TextView textView = fVar3.f335833e;
        textView.setVisibility(b() ? 8 : 0);
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        em.f fVar4 = (em.f) ((jz5.n) b18).mo141623x754a37bb();
        if (fVar4.f335831c == null) {
            fVar4.f335831c = (android.widget.TextView) fVar4.f335829a.findViewById(com.p314xaae8f345.mm.R.id.utm);
        }
        fVar4.f335831c.setVisibility(b() ? 0 : 8);
        android.view.View view = (android.view.View) ((jz5.n) b17).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "<get-dialogBodyView>(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 1, 0, true);
        z2Var.f293591g.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cw_);
        z2Var.j(view);
        z2Var.m(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), context.getString(b() ? com.p314xaae8f345.mm.R.C30867xcad56011.f571891sq : com.p314xaae8f345.mm.R.C30867xcad56011.f572101yq));
        qg5.f fVar5 = new qg5.f(z2Var);
        qg5.g gVar = new qg5.g(this, z2Var);
        z2Var.D = fVar5;
        z2Var.E = gVar;
        z2Var.n(6);
        z2Var.o(0);
        z2Var.l(new qg5.h(this));
        z2Var.w(new qg5.i(this));
        this.f444663l = z2Var;
    }

    public static final void a(qg5.p pVar, int i17, boolean z17) {
        ((qg5.e3) ((ct.k3) ((jz5.n) pVar.f444658g).mo141623x754a37bb())).tj(java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
    }

    public final boolean b() {
        return ((java.lang.Boolean) this.f444661j.mo141623x754a37bb()).booleanValue();
    }
}
