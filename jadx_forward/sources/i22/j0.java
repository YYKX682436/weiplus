package i22;

/* loaded from: classes15.dex */
public final class j0 extends i22.m {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f369519f;

    /* renamed from: g, reason: collision with root package name */
    public final i22.w f369520g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f369521h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f369522i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.C13366x84432753 f369523m;

    /* renamed from: n, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d f369524n;

    /* renamed from: o, reason: collision with root package name */
    public final i22.g0 f369525o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f369526p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f369527q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(android.content.Context context, android.view.View itemView, i22.p0 p0Var, i22.w itemSizeResolver) {
        super(itemView, p0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemSizeResolver, "itemSizeResolver");
        this.f369519f = context;
        this.f369520g = itemSizeResolver;
        this.f369521h = "MicroMsg.EmojiStoreV3SingleProductAlbumHolder";
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.mzf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f369522i = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.mzd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = itemView.findViewById(com.p314xaae8f345.mm.R.id.mze);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f369523m = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.C13366x84432753) findViewById3;
        this.f369524n = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(context, itemSizeResolver.f369593b);
        this.f369525o = new i22.g0(context, new java.util.ArrayList());
        this.f369526p = true;
        int d17 = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77660x7595c307);
        int d18 = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77628xb498cd1d);
        float a17 = ym5.x.a(context, 8.0f);
        this.f369527q = n22.f.f415823a.b(d17, d18, a17, a17, a17, a17);
    }

    @Override // i22.m
    public void i(i22.n0 item, java.util.List payloads) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        super.i(item, payloads);
        this.f3639x46306858.setBackground(this.f369527q);
        i22.a1 a1Var = item instanceof i22.a1 ? (i22.a1) item : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        java.util.List list = a1Var != null ? a1Var.f369458a : null;
        h0Var.f391656d = list;
        if (list == null || list.isEmpty() || a1Var == null) {
            return;
        }
        r45.kj0 kj0Var = a1Var.f369459b;
        java.lang.String str = kj0Var != null ? kj0Var.f460260e : null;
        android.widget.TextView textView = this.f369522i;
        textView.setText(str);
        com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
        i22.g0 g0Var = this.f369525o;
        g0Var.f369500e.clear();
        boolean z17 = this.f369526p;
        i22.w wVar = this.f369520g;
        if (z17) {
            this.f369526p = false;
            android.content.res.Resources resources = this.f369519f.getResources();
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.C13366x84432753 c13366x84432753 = this.f369523m;
            c13366x84432753.m54848xf757fca9(wVar);
            c13366x84432753.N(new g22.f((int) resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), 0, 0, wVar));
            c13366x84432753.mo7960x6cab2c8d(g0Var);
            g0Var.f369502g = this.f369535d;
            c13366x84432753.mo7967x900dcbe1(this.f369524n);
            c13366x84432753.m54847xb8ff8537(new i22.i0(h0Var, item, this));
        }
        g0Var.f369500e.addAll((java.util.Collection) h0Var.f391656d);
        g0Var.m8151xc67946d3(0, ((java.util.List) h0Var.f391656d).size());
        ((i22.a1) item).f369460c = wVar.f369593b;
    }
}
