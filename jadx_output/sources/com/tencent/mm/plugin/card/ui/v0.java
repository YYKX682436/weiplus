package com.tencent.mm.plugin.card.ui;

/* loaded from: classes12.dex */
public class v0 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardGiftImageUI f95179d;

    public v0(com.tencent.mm.plugin.card.ui.CardGiftImageUI cardGiftImageUI) {
        this.f95179d = cardGiftImageUI;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.card.ui.CardGiftImageUI cardGiftImageUI = this.f95179d;
        cardGiftImageUI.f94810n.d();
        db5.e1.a(cardGiftImageUI, null);
        return true;
    }
}
