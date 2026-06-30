package k14;

/* loaded from: classes11.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k14.r0 f384903d;

    public q0(k14.r0 r0Var) {
        this.f384903d = r0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.vp vpVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.vp) this.f384903d.f384904e.f384946l;
        vpVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UnfamiliarContactUI", "[onError]");
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17486x3b418ac7 activityC17486x3b418ac7 = vpVar.f243211b;
        android.view.View findViewById = activityC17486x3b418ac7.findViewById(com.p314xaae8f345.mm.R.id.o_j);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = activityC17486x3b418ac7.findViewById(com.p314xaae8f345.mm.R.id.lbl);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        activityC17486x3b418ac7.f242308p.setText(activityC17486x3b418ac7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k2u));
    }
}
