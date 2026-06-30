package cs3;

/* loaded from: classes10.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f303630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout.LayoutParams f303631e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.Window f303632f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16922xfbfc713e f303633g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f303634h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f303635i;

    public b(android.content.Context context, android.widget.FrameLayout.LayoutParams layoutParams, android.view.Window window, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16922xfbfc713e c16922xfbfc713e, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, int i17) {
        this.f303630d = context;
        this.f303631e = layoutParams;
        this.f303632f = window;
        this.f303633g = c16922xfbfc713e;
        this.f303634h = h0Var;
        this.f303635i = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f303630d;
        int g17 = com.p314xaae8f345.mm.ui.bl.g(context);
        android.widget.FrameLayout.LayoutParams layoutParams = this.f303631e;
        layoutParams.bottomMargin = g17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizProfileServiceInfoDrawer", "[initView] bottomMargin= " + g17);
        android.view.View decorView = this.f303632f.getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(decorView, "null cannot be cast to non-null type android.widget.FrameLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16922xfbfc713e c16922xfbfc713e = this.f303633g;
        ((android.widget.FrameLayout) decorView).addView(c16922xfbfc713e, layoutParams);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f303634h;
        cs3.f fVar = (cs3.f) h0Var.f391656d;
        android.widget.FrameLayout headerLayout = c16922xfbfc713e.m82795xcb847e8d();
        fVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerLayout, "headerLayout");
        fVar.f303643h = headerLayout;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dpv, fVar.h().m82795xcb847e8d());
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.ank);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        fVar.f303640e = textView;
        textView.setText(context.getString(this.f303635i == 1 ? com.p314xaae8f345.mm.R.C30867xcad56011.n4n : com.p314xaae8f345.mm.R.C30867xcad56011.ak9));
        android.widget.TextView textView2 = fVar.f303640e;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerTitleTv");
            throw null;
        }
        com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.rdr);
        viewGroup.setOnClickListener(new cs3.e(fVar));
        fVar.h().k(viewGroup);
        cs3.f fVar2 = (cs3.f) h0Var.f391656d;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 rlLayout = c16922xfbfc713e.m82792x510df255();
        fVar2.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rlLayout, "rlLayout");
        fVar2.f303641f = rlLayout;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa = rlLayout.m82555x4905e9fa();
        m82555x4905e9fa.m7963x830bc99d(true);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 m7949x5701d990 = m82555x4905e9fa.m7949x5701d990();
        if (m7949x5701d990 != null) {
            m7949x5701d990.f93704f = 0L;
        }
        vr3.z zVar = (vr3.z) fVar2.f303639d;
        zVar.getClass();
        m82555x4905e9fa.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context, 1, false));
        m82555x4905e9fa.N(new vr3.w());
        xr3.i iVar = new xr3.i(zVar.f521197g);
        iVar.f537762e = zVar;
        m82555x4905e9fa.mo7960x6cab2c8d(iVar);
    }
}
