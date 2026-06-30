package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public final class g9 implements com.p314xaae8f345.mm.ui.y9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuServiceConversationFmUI f289240a;

    public g9(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI) {
        this.f289240a = openImKefuServiceConversationFmUI;
    }

    @Override // com.p314xaae8f345.mm.ui.y9
    public void a(java.lang.Object obj) {
    }

    @Override // com.p314xaae8f345.mm.ui.y9
    public void b(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI = this.f289240a;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.h8 h8Var = openImKefuServiceConversationFmUI.f288935g;
        if ((h8Var != null ? h8Var.getCount() : 0) <= 0) {
            android.widget.TextView textView = openImKefuServiceConversationFmUI.f288933e;
            if (textView != null) {
                textView.setVisibility(0);
            }
            android.widget.ListView listView = openImKefuServiceConversationFmUI.f288934f;
            if (listView == null) {
                return;
            }
            listView.setVisibility(8);
            return;
        }
        android.widget.TextView textView2 = openImKefuServiceConversationFmUI.f288933e;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        android.widget.ListView listView2 = openImKefuServiceConversationFmUI.f288934f;
        if (listView2 == null) {
            return;
        }
        listView2.setVisibility(0);
    }
}
