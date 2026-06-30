package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/conversation/OpenImKefuServiceChattingUI;", "Lcom/tencent/mm/ui/chatting/ChattingUI;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.conversation.OpenImKefuServiceChattingUI */
/* loaded from: classes9.dex */
public final class ActivityC22378x56f312b8 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a {

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f288923u = jz5.h.b(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q8(this));

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f288924v = jz5.h.b(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p8(this));

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c7() {
        return new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuChattingUIFragment(true);
    }

    public final com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 g7() {
        return (com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1) ((jz5.n) this.f288923u).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        r45.s4 s4Var;
        r45.s4 s4Var2;
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 g76 = g7();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g76);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(g76.f153807f);
        jz5.g gVar = this.f288924v;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenImKefuServiceChattingUI", "enterKefuChattingUI getContactScene: %s, isConfirmPageShown: %s", valueOf, java.lang.Boolean.valueOf(((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue()));
        int i17 = ((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue() ? 24 : 23;
        com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 g77 = g7();
        java.lang.String str = null;
        java.lang.String str2 = (g77 == null || (s4Var2 = g77.f153810i) == null) ? null : s4Var2.f467023h;
        com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 g78 = g7();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g78);
        q41.f.a(str2, i17, g78.f153807f);
        c00.u3 u3Var = (c00.u3) i95.n0.c(c00.u3.class);
        com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 g79 = g7();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g79);
        int i18 = g79.f153807f;
        com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 g710 = g7();
        if (g710 != null && (s4Var = g710.f153810i) != null) {
            str = s4Var.f467023h;
        }
        ((b00.a0) u3Var).hj(i18, str);
    }
}
