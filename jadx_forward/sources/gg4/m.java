package gg4;

/* loaded from: classes4.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.ActivityC18537x8ea3e013 f353296d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.ActivityC18537x8ea3e013 activityC18537x8ea3e013) {
        this.f353296d = activityC18537x8ea3e013;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent putExtra = new android.content.Intent().putExtra("Search_Scene", 2).putExtra("MMActivity.OverrideEnterAnimation", 0).putExtra("MMActivity.OverrideExitAnimation", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.ActivityC18537x8ea3e013 activityC18537x8ea3e013 = this.f353296d;
        ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).Ai(activityC18537x8ea3e013.mo55332x76847179(), ".ui.FTSAddFriendUI", putExtra.putExtra("report_add_friends_sessionid", ((gg4.i) activityC18537x8ea3e013.m80391xac8f1cfd(gg4.i.class)).O6()), (com.p314xaae8f345.mm.ui.bk.C() || activityC18537x8ea3e013.m81217xb3833cfe()) ? null : android.app.ActivityOptions.makeSceneTransitionAnimation(activityC18537x8ea3e013, new android.util.Pair[0]).toBundle());
        gg4.i iVar = (gg4.i) activityC18537x8ea3e013.m80391xac8f1cfd(gg4.i.class);
        iVar.getClass();
        pm0.v.K(null, new gg4.g(iVar));
        yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
