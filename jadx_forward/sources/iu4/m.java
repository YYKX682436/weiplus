package iu4;

/* loaded from: classes9.dex */
public class m implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.e3 f376569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.ViewOnClickListenerC19201x9aa113d6 f376570e;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.ViewOnClickListenerC19201x9aa113d6 viewOnClickListenerC19201x9aa113d6, com.p314xaae8f345.mm.p944x882e457a.e3 e3Var) {
        this.f376570e = viewOnClickListenerC19201x9aa113d6;
        this.f376569d = e3Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GestureGuardLogicUI", java.lang.String.format("Scene doSwitchOn, errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str));
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.ViewOnClickListenerC19201x9aa113d6.f262841y;
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.ViewOnClickListenerC19201x9aa113d6 viewOnClickListenerC19201x9aa113d6 = this.f376570e;
        viewOnClickListenerC19201x9aa113d6.U6();
        if (i17 == 0 && i18 == 0) {
            hu4.i.j(((r45.on5) oVar.f152244b.f152233a).f463914d);
            hu4.f.b(false);
            com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.ViewOnClickListenerC19201x9aa113d6.T6(viewOnClickListenerC19201x9aa113d6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.n.INSTANCE.i();
        com.p314xaae8f345.mm.p944x882e457a.e3 e3Var = this.f376569d;
        if (e3Var != null) {
            return e3Var.mo1034xf5bc2045(i17, i18, str, oVar, m1Var);
        }
        return 0;
    }
}
