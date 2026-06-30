package com.tencent.mm.chatroom.ui;

/* loaded from: classes8.dex */
public class ce implements db5.f4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI f64093a;

    public ce(com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI selectedMemberChattingRecordUI) {
        this.f64093a = selectedMemberChattingRecordUI;
    }

    @Override // db5.f4
    public void onLoadMore() {
        com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI selectedMemberChattingRecordUI = this.f64093a;
        com.tencent.mm.chatroom.ui.ee eeVar = selectedMemberChattingRecordUI.f64002g;
        if (eeVar != null) {
            eeVar.f64139q -= 16;
            com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI selectedMemberChattingRecordUI2 = eeVar.f64142t;
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(selectedMemberChattingRecordUI2.f64004i);
            int i17 = eeVar.f64140r;
            java.lang.String str = eeVar.f64137o;
            if (!K0 && c01.z1.J(selectedMemberChattingRecordUI2.f64004i)) {
                eeVar.s(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().c5(str, i17 - eeVar.f64139q));
            } else if (!c01.z1.J(selectedMemberChattingRecordUI2.f64004i)) {
                eeVar.s(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().b5(str, eeVar.f64138p, i17 - eeVar.f64139q));
            }
            selectedMemberChattingRecordUI.f64002g.notifyDataSetChanged();
        }
    }
}
