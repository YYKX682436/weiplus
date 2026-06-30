package ns4;

/* loaded from: classes8.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19065x55609b3 f421192d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19065x55609b3 activityC19065x55609b3) {
        this.f421192d = activityC19065x55609b3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinBalanceDetailView$updateData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19065x55609b3.f260672o;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19065x55609b3 activityC19065x55609b3 = this.f421192d;
        activityC19065x55609b3.T6(22);
        activityC19065x55609b3.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinBalanceDetailView$updateData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
