package bm2;

/* loaded from: classes3.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.a1 f103973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f103974e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.w0 f103975f;

    public y0(bm2.a1 a1Var, int i17, bm2.w0 w0Var) {
        this.f103973d = a1Var;
        this.f103974e = i17;
        this.f103975f = w0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorStickerTextSelectorAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f443300a >= 500) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
            z17 = true;
        }
        qd2.h.f443300a = currentTimeMillis;
        bm2.a1 a1Var = this.f103973d;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a1Var.f103286e, "view holder click too fast,position:" + this.f103974e);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorStickerTextSelectorAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int m8183xf806b362 = this.f103975f.m8183xf806b362();
        if (m8183xf806b362 >= 0 && m8183xf806b362 < a1Var.mo1894x7e414b06()) {
            java.lang.Object obj = a1Var.x().get(m8183xf806b362);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            r45.h84 h84Var = (r45.h84) obj;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a1Var.f103286e, "click position:" + m8183xf806b362 + ", select element:" + pm0.b0.g(h84Var));
            a1Var.f103289h = m8183xf806b362;
            yz5.p pVar = a1Var.f103290i;
            if (pVar != null) {
                pVar.mo149xb9724478(h84Var, java.lang.Integer.valueOf(m8183xf806b362));
            }
            a1Var.m8146xced61ae5();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a1Var.f103286e, "view holder click error,position:" + m8183xf806b362);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorStickerTextSelectorAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
