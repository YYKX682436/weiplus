package com.p314xaae8f345.mm.ui;

/* loaded from: classes9.dex */
public class oh extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21435x7826ced5 f291010a;

    public oh(com.p314xaae8f345.mm.ui.ActivityC21435x7826ced5 activityC21435x7826ced5) {
        this.f291010a = activityC21435x7826ced5;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        com.p314xaae8f345.mm.ui.ActivityC21435x7826ced5 activityC21435x7826ced5 = this.f291010a;
        android.view.View findViewById = activityC21435x7826ced5.findViewById(com.p314xaae8f345.mm.R.id.i3_);
        int i17 = activityC21435x7826ced5.f278592f.isEmpty() ? 4 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/ServiceNotifySettingsUI$3", "onChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/ui/ServiceNotifySettingsUI$3", "onChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
