package eg4;

/* loaded from: classes4.dex */
public class v1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e.ActivityC18506xcc7cdd98 f334355d;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e.ActivityC18506xcc7cdd98 activityC18506xcc7cdd98) {
        this.f334355d = activityC18506xcc7cdd98;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent putExtra = new android.content.Intent().putExtra("Search_Scene", 2).putExtra("MMActivity.OverrideEnterAnimation", 0).putExtra("MMActivity.OverrideExitAnimation", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e.ActivityC18506xcc7cdd98 activityC18506xcc7cdd98 = this.f334355d;
        android.os.Bundle bundle = android.app.ActivityOptions.makeSceneTransitionAnimation(activityC18506xcc7cdd98, new android.util.Pair[0]).toBundle();
        ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).Ai(activityC18506xcc7cdd98.mo55332x76847179(), ".ui.FTSAddFriendUI", putExtra, bundle);
        tf5.j.O6(activityC18506xcc7cdd98, "search_account_new_friends");
        yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
