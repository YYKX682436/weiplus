package y83;

/* loaded from: classes14.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.ActivityC16157x6d78d4a9 f541526d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.ActivityC16157x6d78d4a9 activityC16157x6d78d4a9) {
        this.f541526d = activityC16157x6d78d4a9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirst$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchLoginFirst", "login button clicked");
        v83.b bVar = v83.b.f515613d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.ActivityC16157x6d78d4a9 activityC16157x6d78d4a9 = this.f541526d;
        activityC16157x6d78d4a9.f224659m = bVar;
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = activityC16157x6d78d4a9.f224653d;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loginUrl");
            throw null;
        }
        intent.putExtra("intent.key.login.url", str);
        intent.putExtra("intent.key.device.name", activityC16157x6d78d4a9.f224654e);
        intent.putExtra("intent.key.ok.session.list", activityC16157x6d78d4a9.f224655f);
        intent.putExtra("intent.key.kids.cnt", activityC16157x6d78d4a9.f224657h);
        intent.putExtra("intent.key.need.show.syncmsg.btn", activityC16157x6d78d4a9.f224658i);
        intent.setFlags(268435456);
        intent.setClass(activityC16157x6d78d4a9, com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.ActivityC16159x6f4d8fe0.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirst$initView$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirst$initView$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirst$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
