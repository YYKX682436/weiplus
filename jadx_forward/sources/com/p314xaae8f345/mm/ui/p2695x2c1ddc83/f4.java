package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class f4 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f289204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22371xa262f838.EnterpriseConversationFmUI f289205e;

    public f4(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22371xa262f838.EnterpriseConversationFmUI enterpriseConversationFmUI, android.graphics.Point point) {
        this.f289205e = enterpriseConversationFmUI;
        this.f289204d = point;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22371xa262f838.EnterpriseConversationFmUI enterpriseConversationFmUI = this.f289205e;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p7 item = enterpriseConversationFmUI.f288883i.getItem(i17);
        dg5.v l07 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22371xa262f838.EnterpriseConversationFmUI.l0(enterpriseConversationFmUI, item);
        if (l07 == null) {
            return false;
        }
        return l07.a(view, this.f289204d, i17, j17, item);
    }
}
