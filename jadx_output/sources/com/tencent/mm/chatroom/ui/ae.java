package com.tencent.mm.chatroom.ui;

/* loaded from: classes8.dex */
public class ae implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI f64045d;

    public ae(com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI selectedMemberChattingRecordUI) {
        this.f64045d = selectedMemberChattingRecordUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI selectedMemberChattingRecordUI = this.f64045d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(selectedMemberChattingRecordUI.f64004i) && c01.z1.J(selectedMemberChattingRecordUI.f64004i)) {
            selectedMemberChattingRecordUI.f64005m = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().r7(selectedMemberChattingRecordUI.f64003h);
        } else if (!c01.z1.J(selectedMemberChattingRecordUI.f64004i)) {
            final com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
            final java.lang.String str = selectedMemberChattingRecordUI.f64003h;
            final java.lang.String str2 = selectedMemberChattingRecordUI.f64004i;
            final java.lang.String X8 = cj6.X8(str);
            final long m07 = ((com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(str);
            if (cj6.Da(X8)) {
                i17 = ot0.c3.l().d("getMsgCountByMember", new yz5.a() { // from class: com.tencent.mm.storage.g9$$h4
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        return java.lang.Integer.valueOf(ot0.z2.f348822a.V0(com.tencent.mm.storage.g9.this.f193989r, X8, str, m07));
                    }
                }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$i4
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        com.tencent.mm.storage.g9 g9Var = com.tencent.mm.storage.g9.this;
                        g9Var.getClass();
                        android.database.Cursor f17 = g9Var.f193989r.f(" SELECT COUNT(*) FROM " + X8 + " WHERE" + g9Var.P0(m07) + g9Var.Z8(str) + "AND content LIKE '" + str2 + "%' ", null, 2);
                        int i18 = 0;
                        try {
                            try {
                                if (f17.moveToFirst()) {
                                    i18 = f17.getInt(0);
                                }
                            } catch (java.lang.Exception e17) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MsgInfoStorage", e17, "", new java.lang.Object[0]);
                            }
                            f17.close();
                            return java.lang.Integer.valueOf(i18);
                        } catch (java.lang.Throwable th6) {
                            f17.close();
                            throw th6;
                        }
                    }
                });
            } else if (cj6.Pb(X8)) {
                i17 = ot0.z2.f348822a.V0(cj6.f193989r, X8, str, m07);
            } else {
                android.database.Cursor f17 = cj6.f193989r.f(" SELECT COUNT(*) FROM " + X8 + " WHERE" + cj6.P0(m07) + cj6.Z8(str) + "AND content LIKE '" + str2 + "%' ", null, 2);
                try {
                    try {
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MsgInfoStorage", e17, "", new java.lang.Object[0]);
                    }
                    if (f17.moveToFirst()) {
                        i17 = f17.getInt(0);
                    }
                    i17 = 0;
                } finally {
                    f17.close();
                }
            }
            selectedMemberChattingRecordUI.f64005m = i17;
        }
        if (selectedMemberChattingRecordUI.isFinishing() || selectedMemberChattingRecordUI.isDestroyed()) {
            return;
        }
        selectedMemberChattingRecordUI.runOnUiThread(new com.tencent.mm.chatroom.ui.zd(this));
    }
}
