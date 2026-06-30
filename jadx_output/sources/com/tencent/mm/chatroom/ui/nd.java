package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class nd implements db5.o9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI f64398d;

    public nd(com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI selectServiceNotifySenderUI) {
        this.f64398d = selectServiceNotifySenderUI;
    }

    @Override // db5.o9
    public void Q0(java.lang.String str) {
        boolean equals = "↑".equals(str);
        com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI selectServiceNotifySenderUI = this.f64398d;
        if (equals) {
            selectServiceNotifySenderUI.f63988d.setSelection(0);
            return;
        }
        java.util.HashMap hashMap = selectServiceNotifySenderUI.f63992h.f64632m;
        int intValue = hashMap.containsKey(str) ? ((java.lang.Integer) hashMap.get(str)).intValue() : -1;
        if (intValue != -1) {
            selectServiceNotifySenderUI.f63988d.setSelection(intValue);
        }
    }
}
