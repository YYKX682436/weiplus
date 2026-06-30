package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class vc implements db5.o9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SelectMemberUI f64609d;

    public vc(com.tencent.mm.chatroom.ui.SelectMemberUI selectMemberUI) {
        this.f64609d = selectMemberUI;
    }

    @Override // db5.o9
    public void Q0(java.lang.String str) {
        boolean equals = "↑".equals(str);
        com.tencent.mm.chatroom.ui.SelectMemberUI selectMemberUI = this.f64609d;
        if (equals) {
            selectMemberUI.f63971d.setSelection(0);
            return;
        }
        java.util.HashMap hashMap = selectMemberUI.f63977m.f64291n;
        int intValue = hashMap.containsKey(str) ? ((java.lang.Integer) hashMap.get(str)).intValue() : -1;
        if (intValue != -1) {
            selectMemberUI.f63971d.setSelection(intValue);
        }
    }
}
