package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class n3 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95090a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardNewMsgUI f95091b;

    public n3(com.tencent.mm.plugin.card.ui.CardNewMsgUI cardNewMsgUI, int i17) {
        this.f95091b = cardNewMsgUI;
        this.f95090a = i17;
    }

    @Override // db5.c1
    public void e(int i17) {
        if (i17 != 0) {
            return;
        }
        com.tencent.mm.plugin.card.ui.CardNewMsgUI cardNewMsgUI = this.f95091b;
        xt1.k kVar = (xt1.k) cardNewMsgUI.f94895e.getItem(this.f95090a);
        if (kVar != null) {
            xt1.t0.Ui().b(kVar.field_msg_id);
            cardNewMsgUI.T6();
            cardNewMsgUI.f94895e.f();
        }
    }
}
