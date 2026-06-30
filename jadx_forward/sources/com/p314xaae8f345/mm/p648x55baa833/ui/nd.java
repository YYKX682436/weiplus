package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes12.dex */
public class nd implements db5.o9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10374x1787784b f145931d;

    public nd(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10374x1787784b activityC10374x1787784b) {
        this.f145931d = activityC10374x1787784b;
    }

    @Override // db5.o9
    public void Q0(java.lang.String str) {
        boolean equals = "↑".equals(str);
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10374x1787784b activityC10374x1787784b = this.f145931d;
        if (equals) {
            activityC10374x1787784b.f145521d.setSelection(0);
            return;
        }
        java.util.HashMap hashMap = activityC10374x1787784b.f145525h.f146165m;
        int intValue = hashMap.containsKey(str) ? ((java.lang.Integer) hashMap.get(str)).intValue() : -1;
        if (intValue != -1) {
            activityC10374x1787784b.f145521d.setSelection(intValue);
        }
    }
}
