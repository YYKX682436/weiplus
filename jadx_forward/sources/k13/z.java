package k13;

/* loaded from: classes8.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15562xa7b84ac6 f384821d;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15562xa7b84ac6 activityC15562xa7b84ac6) {
        this.f384821d = activityC15562xa7b84ac6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15562xa7b84ac6 activityC15562xa7b84ac6 = this.f384821d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC15562xa7b84ac6.f218868d, "[onCreate] load size=" + activityC15562xa7b84ac6.f218873i.size());
        k13.s sVar = activityC15562xa7b84ac6.f218870f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sVar);
        sVar.m8146xced61ae5();
        android.view.View view = activityC15562xa7b84ac6.f218871g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$onCreate$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$onCreate$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!activityC15562xa7b84ac6.f218873i.isEmpty()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = activityC15562xa7b84ac6.f218869e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1163xf1deaba4);
            c1163xf1deaba4.setVisibility(0);
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = activityC15562xa7b84ac6.f218869e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1163xf1deaba42);
        c1163xf1deaba42.setVisibility(8);
        android.view.View view2 = activityC15562xa7b84ac6.f218872h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view2);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$onCreate$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$onCreate$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
