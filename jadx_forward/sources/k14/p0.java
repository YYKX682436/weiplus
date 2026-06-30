package k14;

/* loaded from: classes11.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k14.r0 f384902d;

    public p0(k14.r0 r0Var) {
        this.f384902d = r0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.vp vpVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.vp) this.f384902d.f384904e.f384946l;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17486x3b418ac7 activityC17486x3b418ac7 = vpVar.f243211b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnfamiliarContactUI", "[onSuccess] size:%s cost:%sms", java.lang.Integer.valueOf(activityC17486x3b418ac7.f242312t.size()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - vpVar.f243210a));
        android.widget.TextView textView = activityC17486x3b418ac7.f242303h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(activityC17486x3b418ac7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k2o));
        sb6.append("(");
        java.util.ArrayList arrayList = activityC17486x3b418ac7.f242312t;
        sb6.append(arrayList.size());
        sb6.append(")");
        textView.setText(sb6.toString());
        if (arrayList.size() != 0) {
            android.view.View findViewById = activityC17486x3b418ac7.findViewById(com.p314xaae8f345.mm.R.id.o_j);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = activityC17486x3b418ac7.findViewById(com.p314xaae8f345.mm.R.id.i3k);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xp xpVar = activityC17486x3b418ac7.f242309q;
            if (xpVar != null) {
                xpVar.m8146xced61ae5();
                return;
            }
            return;
        }
        android.view.View findViewById3 = activityC17486x3b418ac7.findViewById(com.p314xaae8f345.mm.R.id.o_j);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById3, arrayList4.toArray(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById4 = activityC17486x3b418ac7.findViewById(com.p314xaae8f345.mm.R.id.lbl);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(findViewById4, arrayList5.toArray(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById5 = activityC17486x3b418ac7.findViewById(com.p314xaae8f345.mm.R.id.i3k);
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(findViewById5, arrayList6.toArray(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById5.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(findViewById5, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        activityC17486x3b418ac7.f242308p.setText(activityC17486x3b418ac7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gg_));
    }
}
