package com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic;

/* loaded from: classes8.dex */
public final class d extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public final void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 c12473xe2bfc4b5, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 c12476xea20f622) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dispatch collection:");
        sb6.append(c12473xe2bfc4b5);
        sb6.append(" , msgId:");
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.m124847x74d37ac6()) : null);
        sb6.append(", materialExtension:");
        sb6.append(c12476xea20f622 != null ? c12476xea20f622.f167803e : null);
        sb6.append(", mimeType: ");
        sb6.append(c12476xea20f622 != null ? c12476xea20f622.f167802d : null);
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenMsgPreProcessUIC", sb6.toString());
        boolean n27 = f9Var != null ? f9Var.n2() : true;
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.B3(new eb0.b(c12473xe2bfc4b5, f9Var, null, true ^ n27));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(m158354x19263085(), new com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.c(this));
        }
    }
}
