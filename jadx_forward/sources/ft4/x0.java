package ft4;

/* loaded from: classes14.dex */
public final class x0 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f348259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ft4.y0 f348260e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, ft4.y0 y0Var) {
        super(false);
        this.f348259d = k3Var;
        this.f348260e = y0Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f348259d;
        int m8183xf806b362 = ((ft4.v0) k3Var).m8183xf806b362() - 2;
        ft4.y0 y0Var = this.f348260e;
        if (m8183xf806b362 >= y0Var.f348263e.size() || ((ft4.v0) k3Var).m8183xf806b362() - 2 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletLedgerPersonDetailAdapter", "adapterPosition:" + ((ft4.v0) k3Var).m8183xf806b362() + "-2 is >=  " + y0Var.f348263e.size() + " || < 0");
            return;
        }
        dt4.u itemData = (dt4.u) y0Var.f348263e.get(((ft4.v0) k3Var).m8183xf806b362() - 2);
        ft4.s0 s0Var = y0Var.f348274s;
        if (s0Var != null) {
            int m8183xf806b3622 = ((ft4.v0) k3Var).m8183xf806b362() - 2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemData, "itemData");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerPersonDetailUI", "ClickItem index:" + m8183xf806b3622 + " msgId:" + itemData.f324830f);
            dt4.h hVar = dt4.p.f324799f;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19139x26e1e89c activityC19139x26e1e89c = ((ft4.f1) s0Var).f348145a;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC19139x26e1e89c.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            hVar.b(mo55332x76847179, activityC19139x26e1e89c.f261981d, itemData);
        }
    }
}
