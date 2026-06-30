package yl2;

/* loaded from: classes.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f544618d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v65.n f544619e;

    public y0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var, v65.n nVar) {
        this.f544618d = y1Var;
        this.f544619e = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/ui/livepost/FinderLivePostHelper$showEligibilityDialog$2$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostHelper", "eligibilityJumpInfo click cancel");
        this.f544618d.q();
        this.f544619e.a(jz5.f0.f384359a);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/ui/livepost/FinderLivePostHelper$showEligibilityDialog$2$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
