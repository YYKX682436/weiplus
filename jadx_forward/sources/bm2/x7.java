package bm2;

/* loaded from: classes3.dex */
public final class x7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f103969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.a8 f103970e;

    public x7(dk2.zf zfVar, bm2.a8 a8Var) {
        this.f103969d = zfVar;
        this.f103970e = a8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveShopMsgAdapter$_onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dk2.zf zfVar = this.f103969d;
        java.lang.String j17 = zfVar.j();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f103970e.f103311i, "resend msg: " + j17);
        if (j17 != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5932xcdb39e3c c5932xcdb39e3c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5932xcdb39e3c();
            am.sr srVar = c5932xcdb39e3c.f136236g;
            srVar.f89463a = j17;
            srVar.f89464b = zfVar.v();
            c5932xcdb39e3c.e();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveShopMsgAdapter$_onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
