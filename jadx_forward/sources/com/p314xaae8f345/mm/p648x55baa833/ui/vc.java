package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes12.dex */
public class vc implements db5.o9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea f146142d;

    public vc(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea activityC10372xd653ffea) {
        this.f146142d = activityC10372xd653ffea;
    }

    @Override // db5.o9
    public void Q0(java.lang.String str) {
        boolean equals = "↑".equals(str);
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea activityC10372xd653ffea = this.f146142d;
        if (equals) {
            activityC10372xd653ffea.f145504d.setSelection(0);
            return;
        }
        java.util.HashMap hashMap = activityC10372xd653ffea.f145510m.f145824n;
        int intValue = hashMap.containsKey(str) ? ((java.lang.Integer) hashMap.get(str)).intValue() : -1;
        if (intValue != -1) {
            activityC10372xd653ffea.f145504d.setSelection(intValue);
        }
    }
}
