package i12;

/* loaded from: classes15.dex */
public final class e extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f368739d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f368740e;

    /* renamed from: f, reason: collision with root package name */
    public final int f368741f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f368742g;

    /* renamed from: h, reason: collision with root package name */
    public i22.p0 f368743h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f368744i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f368745m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f368746n;

    public e(java.lang.String finderUserName, java.lang.String sdkRequestID, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUserName, "finderUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sdkRequestID, "sdkRequestID");
        this.f368739d = finderUserName;
        this.f368740e = sdkRequestID;
        this.f368741f = i17;
        this.f368742g = z17;
        this.f368745m = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        this.f368746n = new java.util.LinkedList();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f368746n.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        yz5.a aVar;
        i12.x holder = (i12.x) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        i22.m0 m0Var = new i22.m0();
        bw5.ra raVar = (bw5.ra) kz5.n0.a0(this.f368746n, i17);
        j12.i iVar = new j12.i(raVar);
        iVar.c(3);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.p pVar = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.q.f179124c;
        iVar.b(pVar.b(), null, pVar.a(raVar != null ? raVar.f113989d : null));
        m0Var.f369537a = iVar;
        holder.f369536e = m0Var;
        holder.i(m0Var, new java.util.ArrayList());
        if (i17 < mo1894x7e414b06() - 3 || (aVar = this.f368744i) == null) {
            return;
        }
        aVar.mo152xb9724478();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dby, parent, false);
        android.view.ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = marginLayoutParams.getMarginEnd();
        inflate.setLayoutParams(marginLayoutParams);
        android.content.Context context = parent.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return new i12.x(context, inflate, this.f368743h, this.f368739d, this.f368740e, this.f368741f, this.f368745m, this.f368742g);
    }
}
