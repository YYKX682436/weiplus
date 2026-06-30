package zj2;

/* loaded from: classes10.dex */
public final class c implements android.view.View.OnClickListener, ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f554824d;

    /* renamed from: e, reason: collision with root package name */
    public final ak2.a f554825e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f554826f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f554827g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f554828h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f554829i;

    public c(android.view.View root, ak2.a adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        this.f554824d = root;
        this.f554825e = adapter;
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.evm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById;
        this.f554826f = viewGroup;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.cjn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f554827g = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.f565285by4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f554828h = findViewById3;
        android.view.View findViewById4 = root.findViewById(com.p314xaae8f345.mm.R.id.f567766ko0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) findViewById4;
        this.f554829i = c22789xd23e9a9b;
        findViewById3.setOnClickListener(this);
        ym5.l2 l2Var = ym5.l2.f544957a;
        ym5.j2[] j2VarArr = ym5.j2.f544925d;
        c22789xd23e9a9b.o(ae2.in.f85221a.a(ym5.f6.I));
        android.content.res.AssetManager assets = root.getContext().getAssets();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(assets, "getAssets(...)");
        c22789xd23e9a9b.k(assets, "small_mile_stone_lottery_amin.pag");
        c22789xd23e9a9b.a(this);
        viewGroup.setTranslationY(-i65.a.b(root.getContext(), 16));
        viewGroup.setTranslationX(-i65.a.b(root.getContext(), 12));
    }

    @Override // ym5.w1
    public void a(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
    }

    @Override // ym5.w1
    public void b(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
    }

    @Override // ym5.w1
    public void c(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        this.f554827g.setVisibility(0);
    }

    @Override // ym5.w1
    public void e(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/milestone/banner/LiveMilestoneBubbleWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.f565285by4) {
            ((ck2.o) this.f554825e).d7();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/milestone/banner/LiveMilestoneBubbleWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
