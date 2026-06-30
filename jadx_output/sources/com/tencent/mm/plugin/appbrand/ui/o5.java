package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes15.dex */
public final class o5 extends com.tencent.mm.ui.widget.dialog.k2 {
    @Override // com.tencent.mm.ui.widget.dialog.k2, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            super.dismiss();
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.ui.n5(this));
        }
    }
}
