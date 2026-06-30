package yr3;

/* loaded from: classes11.dex */
public final class g0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final wr3.i f546348d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f546349e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f546350f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f546351g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f546352h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f546353i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f546354m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f546355n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f546356o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f546357p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.ImageView f546358q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f546359r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f546360s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.ImageView f546361t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f546362u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f546363v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(wr3.i adapter, android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f546348d = adapter;
        this.f546349e = "FeaturedMsgSinglePicArticleViewHolder";
        this.f546350f = adapter.B();
        this.f546351g = itemView.findViewById(com.p314xaae8f345.mm.R.id.f565411cb1);
        this.f546352h = itemView.findViewById(com.p314xaae8f345.mm.R.id.t_g);
        this.f546353i = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.t_m);
        this.f546354m = itemView.findViewById(com.p314xaae8f345.mm.R.id.t_s);
        this.f546355n = itemView.findViewById(com.p314xaae8f345.mm.R.id.syc);
        this.f546356o = itemView.findViewById(com.p314xaae8f345.mm.R.id.cbi);
        this.f546357p = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.cb9);
        this.f546358q = (android.widget.ImageView) itemView.findViewById(com.p314xaae8f345.mm.R.id.syb);
        this.f546359r = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.r5o);
        this.f546360s = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.r5m);
        this.f546361t = (android.widget.ImageView) itemView.findViewById(com.p314xaae8f345.mm.R.id.cbl);
        this.f546362u = itemView.findViewById(com.p314xaae8f345.mm.R.id.f567756uo2);
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
        fq1.e.h(fq1.e.f347040a, this.f546356o, i65.a.b(this.f546350f, 8), false, false, 12, null);
        android.content.Context context = this.f546350f;
        wr3.i iVar = this.f546348d;
        android.view.View view = this.f546351g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        android.view.View view2 = this.f546352h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view2);
        android.view.View view3 = this.f546356o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view3);
        android.widget.TextView textView = this.f546353i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        android.view.View view4 = this.f546354m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view4);
        wVar.h(context, iVar, bizMessage, view, view2, view3, textView, view4, new yr3.f0(this, bizMessage, itemStatus, z17, i18));
    }
}
