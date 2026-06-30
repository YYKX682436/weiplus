package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes10.dex */
public class d7 implements db5.o9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22321x6fa86dd0 f288199d;

    public d7(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22321x6fa86dd0 activityC22321x6fa86dd0) {
        this.f288199d = activityC22321x6fa86dd0;
    }

    @Override // db5.o9
    public void Q0(java.lang.String str) {
        boolean equals = "↑".equals(str);
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22321x6fa86dd0 activityC22321x6fa86dd0 = this.f288199d;
        if (equals) {
            activityC22321x6fa86dd0.f288035d.setSelection(0);
            return;
        }
        java.util.HashMap hashMap = activityC22321x6fa86dd0.f288036e.f288496o;
        int intValue = hashMap.get(str) == null ? -1 : ((java.lang.Integer) hashMap.get(str)).intValue();
        if (intValue != -1) {
            activityC22321x6fa86dd0.f288035d.setSelection(intValue);
        }
    }
}
