package y83;

/* loaded from: classes14.dex */
public final class n implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.ActivityC16157x6d78d4a9 f541527d;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.ActivityC16157x6d78d4a9 activityC16157x6d78d4a9) {
        this.f541527d = activityC16157x6d78d4a9;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reg button clicked, isShowRegBtn:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.ActivityC16157x6d78d4a9 activityC16157x6d78d4a9 = this.f541527d;
        sb6.append(activityC16157x6d78d4a9.f224656g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchLoginFirst", sb6.toString());
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = activityC16157x6d78d4a9.f224653d;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loginUrl");
            throw null;
        }
        intent.putExtra("intent.key.login.url", str);
        intent.putExtra("intent.key.device.name", activityC16157x6d78d4a9.f224654e);
        intent.setFlags(268435456);
        intent.setClass(activityC16157x6d78d4a9, com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16160x425523e6.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirst$initView$3$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirst$initView$3$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16157x6d78d4a9.f224659m = v83.b.f515614e;
        x83.g gVar = x83.g.f534101a;
        x83.c cVar = x83.c.f534085e;
        java.lang.String str2 = activityC16157x6d78d4a9.f224653d;
        if (str2 != null) {
            gVar.a(cVar, str2, x83.e.f534095e, x83.d.f534090f, activityC16157x6d78d4a9.f224657h, 0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loginUrl");
            throw null;
        }
    }
}
