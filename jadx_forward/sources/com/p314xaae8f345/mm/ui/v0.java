package com.p314xaae8f345.mm.ui;

/* loaded from: classes9.dex */
public class v0 extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21346x5cfbe046 f292632a;

    public v0(com.p314xaae8f345.mm.ui.ActivityC21346x5cfbe046 activityC21346x5cfbe046) {
        this.f292632a = activityC21346x5cfbe046;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        com.p314xaae8f345.mm.ui.ActivityC21346x5cfbe046 activityC21346x5cfbe046 = this.f292632a;
        android.view.View findViewById = activityC21346x5cfbe046.findViewById(com.p314xaae8f345.mm.R.id.i3_);
        int i17 = activityC21346x5cfbe046.f278114e.isEmpty() ? 4 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/AppBrandNotifySettingsUI$4", "onChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/ui/AppBrandNotifySettingsUI$4", "onChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
