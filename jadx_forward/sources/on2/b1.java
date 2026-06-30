package on2;

/* loaded from: classes3.dex */
public final class b1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ on2.j1 f428379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.dz1 f428380e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f428381f;

    public b1(on2.j1 j1Var, r45.dz1 dz1Var, int i17) {
        this.f428379d = j1Var;
        this.f428380e = dz1Var;
        this.f428381f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryPanelListAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f443300a >= 500) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
            z17 = true;
        }
        qd2.h.f443300a = currentTimeMillis;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryPanelListAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        yz5.p pVar = this.f428379d.f428480f;
        if (pVar != null) {
            pVar.mo149xb9724478(this.f428380e, java.lang.Integer.valueOf(this.f428381f));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryPanelListAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
