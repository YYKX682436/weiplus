package df2;

/* loaded from: classes3.dex */
public final class h6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.t6 f311824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f311825e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f311826f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f311827g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f311828h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f311829i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f311830m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f311831n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f311832o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f311833p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(df2.t6 t6Var, java.lang.String str, java.lang.String str2, float f17, float f18, float f19, float f27, float f28, java.lang.String str3, java.lang.String str4, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311824d = t6Var;
        this.f311825e = str;
        this.f311826f = str2;
        this.f311827g = f17;
        this.f311828h = f18;
        this.f311829i = f19;
        this.f311830m = f27;
        this.f311831n = f28;
        this.f311832o = str3;
        this.f311833p = str4;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.h6(this.f311824d, this.f311825e, this.f311826f, this.f311827g, this.f311828h, this.f311829i, this.f311830m, this.f311831n, this.f311832o, this.f311833p, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.h6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        df2.t6 t6Var = this.f311824d;
        android.view.ViewGroup viewGroup = t6Var.f312948m;
        df2.e6 e6Var = null;
        android.content.Context context = viewGroup != null ? viewGroup.getContext() : null;
        boolean z17 = false;
        if (context != null) {
            java.lang.String str = this.f311825e;
            java.lang.String f76 = t6Var.f7(str);
            if (f76.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GestureEffectPagController", "#getStreamWidgetForSdkId sdkId not found in business:".concat(str));
            } else {
                java.util.Map map = t6Var.f312955t;
                df2.e6 e6Var2 = (df2.e6) ((java.util.LinkedHashMap) map).get(str);
                if (e6Var2 == null) {
                    android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
                    android.view.ViewGroup viewGroup2 = t6Var.f312948m;
                    if (viewGroup2 != null) {
                        viewGroup2.addView(frameLayout);
                    }
                    android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                    if (layoutParams != null && (layoutParams instanceof android.widget.FrameLayout.LayoutParams)) {
                        layoutParams.width = -1;
                        layoutParams.height = -1;
                        frameLayout.requestLayout();
                    }
                    android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(context);
                    frameLayout.addView(frameLayout2);
                    android.view.ViewGroup.LayoutParams layoutParams2 = frameLayout2.getLayoutParams();
                    if (layoutParams2 != null && (layoutParams2 instanceof android.widget.FrameLayout.LayoutParams)) {
                        layoutParams2.width = -1;
                        layoutParams2.height = -1;
                        ((android.widget.FrameLayout.LayoutParams) layoutParams2).gravity = 17;
                        frameLayout2.requestLayout();
                    }
                    com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = new com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b(context);
                    ym5.l2 l2Var = ym5.l2.f544957a;
                    ym5.j2[] j2VarArr = ym5.j2.f544925d;
                    c22789xd23e9a9b.o(ae2.in.f85221a.a(ym5.f6.E1));
                    frameLayout2.addView(c22789xd23e9a9b, new android.widget.FrameLayout.LayoutParams(-1, -1));
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15381xac4783ea c15381xac4783ea = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15381xac4783ea(context);
                    c15381xac4783ea.setMaxWidth(com.p314xaae8f345.mm.ui.zk.a(context, 280));
                    c15381xac4783ea.setMaxLines(1);
                    c15381xac4783ea.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560640q6));
                    c15381xac4783ea.setVisibility(8);
                    c15381xac4783ea.m62513xe1d3a649(android.graphics.Color.parseColor("#FF99B4"));
                    c15381xac4783ea.m62515xe2eaa4ac(4.0f);
                    android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-2, -2);
                    layoutParams3.gravity = 17;
                    frameLayout2.addView(c15381xac4783ea, layoutParams3);
                    df2.e6 e6Var3 = new df2.e6(frameLayout, frameLayout2, c22789xd23e9a9b, c15381xac4783ea, null, null);
                    map.put(str, e6Var3);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GestureEffectPagController", "#getStreamWidgetForSdkId now widgetBucket.count=" + map.size());
                    e6Var = e6Var3;
                } else {
                    e6Var = e6Var2;
                }
                e6Var.f311571e = (android.graphics.Rect) ((java.util.LinkedHashMap) t6Var.f312956u).get(f76);
            }
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (e6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GestureEffectPagController", "#executeAnimationCommand streamWidget is null");
            return f0Var;
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = e6Var.f311572f;
        if (r2Var != null && r2Var.a()) {
            z17 = true;
        }
        if (!z17 && !e6Var.f311569c.f()) {
            df2.t6 t6Var2 = this.f311824d;
            e6Var.f311572f = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(t6Var2, null, null, new df2.g6(this.f311826f, t6Var2, this.f311827g, this.f311828h, this.f311829i, this.f311830m, this.f311831n, this.f311832o, e6Var, this.f311833p, null), 3, null);
        }
        return f0Var;
    }
}
