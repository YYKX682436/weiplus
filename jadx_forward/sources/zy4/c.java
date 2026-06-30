package zy4;

/* loaded from: classes15.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2443x6bc77ff.ui.ActivityC19511xc9358824 f559208d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2443x6bc77ff.ui.ActivityC19511xc9358824 activityC19511xc9358824) {
        this.f559208d = activityC19511xc9358824;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/welab/ui/WelabAppInfoUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("open func ");
        com.p314xaae8f345.mm.p1006xc5476f33.p2443x6bc77ff.ui.ActivityC19511xc9358824 activityC19511xc9358824 = this.f559208d;
        sb6.append(activityC19511xc9358824.f269615d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WelabAppInfoUI", sb6.toString());
        sy4.m mVar = sy4.m.f495417c;
        java.lang.String str = activityC19511xc9358824.f269615d;
        uy4.w e17 = mVar.e(str);
        if (e17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WelabMgr", "use custome opener to open " + str);
            e17.Wc(activityC19511xc9358824, str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WelabMgr", "use default opener open " + str);
            if (mVar.b(str).f66647x2253a77f == 2) {
                uy4.w wVar = mVar.f495418a;
                if (wVar != null) {
                    wVar.Wc(activityC19511xc9358824, str);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WelabMgr", "defaultWeAppOpener is null!");
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WelabMgr", "can not find opener for " + str);
            }
        }
        sy4.r.a(activityC19511xc9358824.f269615d, 7, activityC19511xc9358824.f269618g);
        yj0.a.h(this, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
