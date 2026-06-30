package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class f1 implements db5.o9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16130xc9e2940f f224336d;

    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16130xc9e2940f activityC16130xc9e2940f) {
        this.f224336d = activityC16130xc9e2940f;
    }

    @Override // db5.o9
    public void Q0(java.lang.String str) {
        boolean equals = "↑".equals(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16130xc9e2940f activityC16130xc9e2940f = this.f224336d;
        if (equals) {
            activityC16130xc9e2940f.f224084f.setSelection(0);
            return;
        }
        java.util.HashMap hashMap = activityC16130xc9e2940f.f224085g.f224582r;
        int intValue = hashMap.containsKey(str) ? ((java.lang.Integer) hashMap.get(str)).intValue() : -1;
        if (intValue != -1) {
            activityC16130xc9e2940f.f224084f.setSelection(intValue);
        }
    }
}
