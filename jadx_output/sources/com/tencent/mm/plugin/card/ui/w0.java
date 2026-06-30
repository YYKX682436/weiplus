package com.tencent.mm.plugin.card.ui;

/* loaded from: classes12.dex */
public class w0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardGiftImageUI f95430d;

    public w0(com.tencent.mm.plugin.card.ui.CardGiftImageUI cardGiftImageUI) {
        this.f95430d = cardGiftImageUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.f(0, this.f95430d.getString(com.tencent.mm.R.string.i8c));
    }
}
