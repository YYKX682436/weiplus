package lr;

/* loaded from: classes15.dex */
public final class x extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final ir.h f402133d;

    /* renamed from: e, reason: collision with root package name */
    public final ir.x0 f402134e;

    /* renamed from: f, reason: collision with root package name */
    public final lr.o0 f402135f;

    /* renamed from: g, reason: collision with root package name */
    public final lr.o0 f402136g;

    /* renamed from: h, reason: collision with root package name */
    public final ym5.f0 f402137h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f402138i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f402139m;

    /* renamed from: n, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.y2 f402140n;

    /* renamed from: o, reason: collision with root package name */
    public lr.k0 f402141o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 f402142p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f402143q;

    public x(ir.h config, ir.x0 lifeCycle, lr.o0 smileyItemSize, lr.o0 emojiItemSize, ym5.f0 indicatorWrapper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifeCycle, "lifeCycle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(smileyItemSize, "smileyItemSize");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiItemSize, "emojiItemSize");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(indicatorWrapper, "indicatorWrapper");
        this.f402133d = config;
        this.f402134e = lifeCycle;
        this.f402135f = smileyItemSize;
        this.f402136g = emojiItemSize;
        this.f402137h = indicatorWrapper;
        this.f402138i = "MicroMsg.EmojiPanelGroupAdapter";
        this.f402139m = new java.util.ArrayList();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.y2 y2Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.y2();
        this.f402140n = y2Var;
        y2Var.e(0, 50);
        y2Var.e(1, 30);
        y2Var.e(2, 3);
        y2Var.e(3, 1);
        y2Var.e(4, 2);
        y2Var.e(5, 3);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f402139m.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return this.f402139m.get(i17) instanceof ir.c1 ? 1 : 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        lr.u holder = (lr.u) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("smiley_log onBindViewHolder ");
        java.util.ArrayList arrayList = this.f402139m;
        sb6.append(arrayList.size());
        sb6.append(" , ");
        sb6.append(((ir.t0) arrayList.get(i17)).b().p().c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f402138i, sb6.toString());
        java.lang.Object obj = arrayList.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        holder.j((ir.t0) obj);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(parent.getContext());
        if (i17 == 1) {
            android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a6v, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return new lr.w(this, inflate);
        }
        android.view.View inflate2 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a6u, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
        return new lr.v(this, inflate2);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewRecycled */
    public void mo8162x34789575(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        lr.u holder = (lr.u) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.mo8162x34789575(holder);
        holder.k();
    }
}
