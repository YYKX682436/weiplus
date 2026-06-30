package y83;

/* loaded from: classes14.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.ActivityC16156xf944aa02 f541521d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.ActivityC16156xf944aa02 activityC16156xf944aa02) {
        this.f541521d = activityC16156xf944aa02;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginCardChooseUI$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KidsWatchLoginCardChooseUI", "click switch count button");
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.ActivityC16156xf944aa02 activityC16156xf944aa02 = this.f541521d;
        java.lang.String str = activityC16156xf944aa02.f224645d;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loginUrl");
            throw null;
        }
        intent.putExtra("intent.key.login.url", str);
        intent.putExtra("intent.key.device.name", activityC16156xf944aa02.f224646e);
        intent.putExtra("intent.key.ok.session.list", activityC16156xf944aa02.f224647f);
        intent.putExtra("intent.key.ok.reg.btn", activityC16156xf944aa02.f224648g);
        intent.putExtra("intent.key.kids.cnt", activityC16156xf944aa02.f224649h);
        intent.putExtra("intent.key.enter.login.first", 2);
        intent.putExtra("intent.key.need.show.syncmsg.btn", activityC16156xf944aa02.f224650i);
        intent.setFlags(268435456);
        intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.ActivityC16157x6d78d4a9.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginCardChooseUI$initView$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginCardChooseUI$initView$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginCardChooseUI$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
