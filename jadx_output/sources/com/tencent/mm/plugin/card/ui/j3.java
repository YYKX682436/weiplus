package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class j3 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardNewMsgUI f95034d;

    public j3(com.tencent.mm.plugin.card.ui.CardNewMsgUI cardNewMsgUI) {
        this.f95034d = cardNewMsgUI;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        int i18 = com.tencent.mm.plugin.card.ui.CardNewMsgUI.f94893n;
        com.tencent.mm.plugin.card.ui.CardNewMsgUI cardNewMsgUI = this.f95034d;
        db5.e1.e(cardNewMsgUI, cardNewMsgUI.getResources().getString(com.tencent.mm.R.string.aud), null, cardNewMsgUI.getResources().getString(com.tencent.mm.R.string.f490367t0), new com.tencent.mm.plugin.card.ui.n3(cardNewMsgUI, i17));
        return true;
    }
}
