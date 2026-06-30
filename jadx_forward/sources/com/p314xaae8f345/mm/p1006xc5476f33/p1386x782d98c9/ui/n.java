package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes3.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13457xf0c8f0d1 f181109d;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13457xf0c8f0d1 activityC13457xf0c8f0d1) {
        this.f181109d = activityC13457xf0c8f0d1;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13457xf0c8f0d1 activityC13457xf0c8f0d1 = this.f181109d;
        android.view.View view = activityC13457xf0c8f0d1.f180702m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceAddDataSourceUI$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/exdevice/ui/ExdeviceAddDataSourceUI$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        activityC13457xf0c8f0d1.f180697e.notifyDataSetChanged();
    }
}
