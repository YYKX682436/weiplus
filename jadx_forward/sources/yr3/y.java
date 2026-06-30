package yr3;

/* loaded from: classes11.dex */
public final class y extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final wr3.i f546609d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f546610e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f546611f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f546612g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f546613h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f546614i;

    /* renamed from: m, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f546615m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f546616n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f546617o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f546618p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f546619q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f546620r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(wr3.i adapter, android.view.View itemView, int i17) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f546609d = adapter;
        this.f546610e = adapter.B();
        this.f546611f = itemView.findViewById(com.p314xaae8f345.mm.R.id.syc);
        this.f546612g = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.cb9);
        this.f546613h = itemView.findViewById(com.p314xaae8f345.mm.R.id.syc);
        this.f546614i = (android.widget.ImageView) itemView.findViewById(com.p314xaae8f345.mm.R.id.syb);
        this.f546615m = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) itemView.findViewById(com.p314xaae8f345.mm.R.id.f565413cb3);
        this.f546616n = itemView.findViewById(com.p314xaae8f345.mm.R.id.f565411cb1);
        this.f546617o = itemView.findViewById(com.p314xaae8f345.mm.R.id.t_g);
        this.f546618p = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.t_m);
        this.f546619q = itemView.findViewById(com.p314xaae8f345.mm.R.id.t_s);
        this.f546620r = itemView.findViewById(com.p314xaae8f345.mm.R.id.cbi);
    }

    public final void i(r45.s5 bizMessage, wr3.n0 itemStatus, int i17, boolean z17, java.lang.String userName, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizMessage, "bizMessage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemStatus, "itemStatus");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        wr3.n0 n0Var = wr3.n0.f530375f;
        yr3.w wVar = yr3.w.f546592a;
        if (itemStatus == n0Var || itemStatus == wr3.n0.f530379m) {
            wVar.l(bizMessage, userName);
        }
        fq1.e.h(fq1.e.f347040a, this.f546620r, i65.a.b(this.f546610e, 8), false, false, 12, null);
        android.content.Context context = this.f546610e;
        wr3.i iVar = this.f546609d;
        android.view.View view = this.f546616n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        android.view.View view2 = this.f546617o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view2);
        android.view.View view3 = this.f546620r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view3);
        android.widget.TextView textView = this.f546618p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        android.view.View view4 = this.f546619q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view4);
        wVar.h(context, iVar, bizMessage, view, view2, view3, textView, view4, new yr3.x(this, bizMessage, itemStatus, i17, z17, i18));
    }
}
