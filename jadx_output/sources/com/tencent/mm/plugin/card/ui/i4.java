package com.tencent.mm.plugin.card.ui;

/* loaded from: classes5.dex */
public class i4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardShowWaringTransparentUI f95029d;

    public i4(com.tencent.mm.plugin.card.ui.CardShowWaringTransparentUI cardShowWaringTransparentUI) {
        this.f95029d = cardShowWaringTransparentUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        this.f95029d.finish();
    }
}
