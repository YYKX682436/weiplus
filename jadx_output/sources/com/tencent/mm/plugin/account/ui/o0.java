package com.tencent.mm.plugin.account.ui;

/* loaded from: classes8.dex */
public class o0 implements db5.o4 {
    public o0(com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI baseLoginVoiceUI) {
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.size() == 0) {
            g4Var.a(com.tencent.liteav.TXLiteAVCode.WARNING_MICROPHONE_HOWLING_DETECTED, com.tencent.mm.R.string.ghr);
            if (com.tencent.mm.sdk.platformtools.m2.m()) {
                g4Var.a(7012, com.tencent.mm.R.string.f492406gi3);
            }
            if (!com.tencent.mm.ui.bk.A()) {
                g4Var.a(7003, com.tencent.mm.R.string.o7r);
            }
            g4Var.a(7004, com.tencent.mm.R.string.l8m);
            if (!com.tencent.mm.sdk.platformtools.m2.m()) {
                g4Var.a(7009, com.tencent.mm.R.string.l8j);
            }
            g4Var.a(7010, com.tencent.mm.R.string.lsd);
        }
    }
}
