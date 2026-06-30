package yr3;

/* loaded from: classes11.dex */
public final class c1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final wr3.v f546275d;

    /* renamed from: e, reason: collision with root package name */
    public final sr3.a f546276e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f546277f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f546278g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f546279h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f546280i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f546281m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f546282n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f546283o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f546284p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f546285q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.ImageView f546286r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f546287s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f546288t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f546289u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.Boolean f546290v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f546291w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f546292x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(wr3.v adapter, android.view.View itemView, sr3.a accountType) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(accountType, "accountType");
        this.f546275d = adapter;
        this.f546276e = accountType;
        this.f546277f = "MsgSingleAudioViewHolder";
        this.f546278g = adapter.f530311m;
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.f565406sy2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f546279h = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.sya);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f546280i = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.p314xaae8f345.mm.R.id.f565409sy5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f546281m = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.p314xaae8f345.mm.R.id.f565407sy3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f546282n = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = itemView.findViewById(com.p314xaae8f345.mm.R.id.sy6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f546283o = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById5;
        android.view.View findViewById6 = itemView.findViewById(com.p314xaae8f345.mm.R.id.sy8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f546284p = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById6;
        android.view.View findViewById7 = itemView.findViewById(com.p314xaae8f345.mm.R.id.f567756uo2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f546285q = findViewById7;
        android.view.View findViewById8 = itemView.findViewById(com.p314xaae8f345.mm.R.id.t_n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f546286r = (android.widget.ImageView) findViewById8;
        android.view.View findViewById9 = itemView.findViewById(com.p314xaae8f345.mm.R.id.sy7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.f546287s = findViewById9;
        android.view.View findViewById10 = itemView.findViewById(com.p314xaae8f345.mm.R.id.sy9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        this.f546288t = findViewById10;
        this.f546289u = "";
    }

    public final void i(android.view.View view, boolean z17) {
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSingleAudioViewHolder", "setVisible", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSingleAudioViewHolder", "setVisible", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
