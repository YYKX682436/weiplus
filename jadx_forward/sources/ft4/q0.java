package ft4;

/* loaded from: classes14.dex */
public final class q0 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f348209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ft4.r0 f348210e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, ft4.r0 r0Var) {
        super(false);
        this.f348209d = k3Var;
        this.f348210e = r0Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f348209d;
        int m8183xf806b362 = ((ft4.o0) k3Var).m8183xf806b362() - 2;
        ft4.r0 r0Var = this.f348210e;
        if (m8183xf806b362 >= r0Var.f348213e.size() || ((ft4.o0) k3Var).m8183xf806b362() - 2 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletLedgerPersonAdapter", "adapterPosition:" + ((ft4.o0) k3Var).m8183xf806b362() + "-2 is >=  " + r0Var.f348213e.size() + " || < 0");
            return;
        }
        dt4.u itemData = (dt4.u) r0Var.f348213e.get(((ft4.o0) k3Var).m8183xf806b362() - 2);
        ft4.l0 l0Var = r0Var.f348222q;
        if (l0Var != null) {
            int m8183xf806b3622 = ((ft4.o0) k3Var).m8183xf806b362() - 2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemData, "itemData");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerPersonUI", "ClickItem index:" + m8183xf806b3622 + " msgId:" + itemData.f324830f);
            dt4.h hVar = dt4.p.f324799f;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19140xe76629ab activityC19140xe76629ab = ((ft4.j1) l0Var).f348168a;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC19140xe76629ab.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            hVar.b(mo55332x76847179, activityC19140xe76629ab.f262001d, itemData);
        }
    }
}
