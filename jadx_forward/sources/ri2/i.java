package ri2;

/* loaded from: classes10.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ri2.j f477587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f477588e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f477589f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f477590g;

    public i(ri2.j jVar, java.lang.Long l17, java.lang.Long l18, boolean z17) {
        this.f477587d = jVar;
        this.f477588e = l17;
        this.f477589f = l18;
        this.f477590g = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.f0 f0Var;
        java.lang.Long l17;
        ri2.j jVar = this.f477587d;
        p3325xe03a0797.p3326xc267989b.y0 y0Var = jVar.f477592b.f498674d.f498680g;
        if (y0Var != null ? p3325xe03a0797.p3326xc267989b.z0.h(y0Var) : false) {
            android.view.View view = jVar.f477614x;
            int right = view != null ? view.getRight() : 0;
            int i17 = jVar.f477595e;
            int i18 = right + i17;
            android.view.View view2 = jVar.f477613w;
            java.lang.Integer valueOf = view2 != null ? java.lang.Integer.valueOf(view2.getLeft()) : null;
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = jVar.f477606p;
            if ((c22789xd23e9a9b != null ? c22789xd23e9a9b.getMeasuredWidth() : 0) > 0) {
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = jVar.f477606p;
                i17 = c22789xd23e9a9b2 != null ? c22789xd23e9a9b2.getMeasuredWidth() : 0;
            }
            android.view.View view3 = jVar.f477591a;
            java.lang.Long l18 = this.f477588e;
            if (l18 != null && (l17 = this.f477589f) != null && view3 != null) {
                long longValue = l17.longValue();
                long longValue2 = l18.longValue();
                long j17 = longValue + longValue2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(jVar.f477593c, "updateBattleBar: rewardTotal:" + j17 + ", self.wecoinHot:" + longValue2);
                if (j17 == 0) {
                    com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b3 = jVar.f477606p;
                    android.view.ViewGroup.LayoutParams layoutParams = c22789xd23e9a9b3 != null ? c22789xd23e9a9b3.getLayoutParams() : null;
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.setMarginStart((((com.p314xaae8f345.mm.ui.bl.b(view3.getContext()).x / 2) - i17) - 0) + com.p314xaae8f345.mm.ui.zk.a(view3.getContext(), 8));
                    }
                    android.view.View view4 = jVar.f477598h;
                    android.view.ViewGroup.LayoutParams layoutParams2 = view4 != null ? view4.getLayoutParams() : null;
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    if (marginLayoutParams2 != null) {
                        marginLayoutParams2.setMarginStart((com.p314xaae8f345.mm.ui.bl.b(view3.getContext()).x / 2) - 0);
                    }
                } else {
                    float f17 = (((float) longValue2) / ((float) j17)) * com.p314xaae8f345.mm.ui.bl.b(view3.getContext()).x;
                    float f18 = i18;
                    if (f17 < f18) {
                        f17 = f18;
                    }
                    float intValue = valueOf != null ? valueOf.intValue() : 0;
                    if (f17 > intValue) {
                        f17 = intValue;
                    }
                    float f19 = f17 - 0;
                    com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b4 = jVar.f477606p;
                    android.view.ViewGroup.LayoutParams layoutParams3 = c22789xd23e9a9b4 != null ? c22789xd23e9a9b4.getLayoutParams() : null;
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (marginLayoutParams3 != null) {
                        marginLayoutParams3.setMarginStart((((int) f19) - i17) + com.p314xaae8f345.mm.ui.zk.a(view3.getContext(), 8));
                    }
                    android.view.View view5 = jVar.f477598h;
                    android.view.ViewGroup.LayoutParams layoutParams4 = view5 != null ? view5.getLayoutParams() : null;
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    if (marginLayoutParams4 != null) {
                        marginLayoutParams4.setMarginStart((int) f19);
                    }
                }
                android.view.View view6 = jVar.f477597g;
                if (view6 != null) {
                    view6.requestLayout();
                    f0Var = jz5.f0.f384359a;
                    if (f0Var == null || view3 == null || !this.f477590g) {
                        return;
                    }
                    com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b5 = jVar.f477606p;
                    android.view.ViewGroup.LayoutParams layoutParams5 = c22789xd23e9a9b5 != null ? c22789xd23e9a9b5.getLayoutParams() : null;
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams5 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams5 : null;
                    if (marginLayoutParams5 != null) {
                        marginLayoutParams5.setMarginStart((((com.p314xaae8f345.mm.ui.bl.b(view3.getContext()).x / 2) - i17) - 0) + com.p314xaae8f345.mm.ui.zk.a(view3.getContext(), 8));
                    }
                    android.view.View view7 = jVar.f477598h;
                    android.view.ViewGroup.LayoutParams layoutParams6 = view7 != null ? view7.getLayoutParams() : null;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams6, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((android.view.ViewGroup.MarginLayoutParams) layoutParams6).setMarginStart((com.p314xaae8f345.mm.ui.bl.b(view3.getContext()).x / 2) - 0);
                    android.view.View view8 = jVar.f477597g;
                    if (view8 != null) {
                        view8.requestLayout();
                        return;
                    }
                    return;
                }
            }
            f0Var = null;
            if (f0Var == null) {
            }
        }
    }
}
