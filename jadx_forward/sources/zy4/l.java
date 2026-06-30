package zy4;

/* loaded from: classes15.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2443x6bc77ff.ui.ActivityC19512xacf356cc f559216d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p2443x6bc77ff.ui.ActivityC19512xacf356cc activityC19512xacf356cc) {
        this.f559216d = activityC19512xacf356cc;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/welab/ui/WelabMainUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag();
        if (tag instanceof yy4.a) {
            yy4.a aVar = (yy4.a) tag;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("para_appid", aVar.f66634x369ad11);
            az4.h hVar = az4.h.f97712c;
            intent.putExtra("para_from_with_red_point", hVar.a(aVar) ? 1 : 0);
            intent.setClass(this.f559216d, com.p314xaae8f345.mm.p1006xc5476f33.p2443x6bc77ff.ui.ActivityC19511xc9358824.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p2443x6bc77ff.ui.ActivityC19512xacf356cc activityC19512xacf356cc = this.f559216d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activityC19512xacf356cc, arrayList2.toArray(), "com/tencent/mm/plugin/welab/ui/WelabMainUI$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC19512xacf356cc.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activityC19512xacf356cc, "com/tencent/mm/plugin/welab/ui/WelabMainUI$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            java.lang.String str = aVar.f66634x369ad11;
            ((java.util.HashMap) hVar.f97713a).put(str, 1);
            hVar.f97714b += "&" + str + "=1";
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WELAB_REDPOINT_STRING, hVar.f97714b);
            hVar.c();
            java.lang.String str2 = (java.lang.String) ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p2443x6bc77ff.ui.ActivityC19512xacf356cc.f269632q).get(aVar.f66634x369ad11);
            if (!android.text.TextUtils.isEmpty(str2)) {
                rn3.i.Di().a(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.c(str2));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WelabMainUI", "click " + aVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/welab/ui/WelabMainUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
