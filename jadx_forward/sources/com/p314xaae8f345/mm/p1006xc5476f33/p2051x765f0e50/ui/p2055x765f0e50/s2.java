package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes3.dex */
public class s2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17388xa7b1222e f243060d;

    public s2(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17388xa7b1222e activityC17388xa7b1222e) {
        this.f243060d = activityC17388xa7b1222e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gm0.j1.u().c().w(143618, 0);
        boolean z17 = bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20239x152d18ed()) == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17388xa7b1222e activityC17388xa7b1222e = this.f243060d;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfQRCodeNewUI", "updateNewFriendData, [AddFriendVerifyRecordToCloud] goto AddFriendVerifyRecordUI (new)");
            android.content.Intent intent = new android.content.Intent();
            lk5.s.e(intent, true);
            j45.l.j(activityC17388xa7b1222e.mo55332x76847179(), "subapp", ".ui.friend.AddFriendVerifyRecordUI", intent, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfQRCodeNewUI", "updateNewFriendData, [AddFriendVerifyRecordToCloud] goto FMessageConversationUI (old)");
            j45.l.j(activityC17388xa7b1222e.mo55332x76847179(), "subapp", ".ui.friend.FMessageConversationUI", new android.content.Intent(), null);
        }
        activityC17388xa7b1222e.getClass();
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.k2(activityC17388xa7b1222e, 1L));
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
