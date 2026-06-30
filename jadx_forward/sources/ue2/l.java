package ue2;

/* loaded from: classes3.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ue2.o f508357d;

    public l(ue2.o oVar) {
        this.f508357d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatAnchorPluginLayout$setupDialogButtonListeners$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ue2.o oVar = this.f508357d;
        ue2.e0 e0Var = oVar.f508370p;
        boolean z17 = false;
        if (e0Var != null) {
            e0Var.a(false);
        }
        yf2.s0 s0Var = (yf2.s0) oVar.mo57658x143f1b92(yf2.s0.class);
        if (s0Var != null) {
            if (!(s0Var.b7() == 1)) {
                z17 = true;
            }
        }
        if (!z17) {
            ue2.o.s(oVar);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatAnchorPluginLayout$setupDialogButtonListeners$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ue2.o.f508360y, "tryStartPost: waiting for license confirmation");
        yf2.s0 s0Var2 = (yf2.s0) oVar.mo57658x143f1b92(yf2.s0.class);
        if (s0Var2 != null) {
            s0Var2.g7(new ue2.j(oVar), new ue2.k(oVar), null, yf2.j2.f543263d);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatAnchorPluginLayout$setupDialogButtonListeners$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
