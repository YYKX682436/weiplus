package ft4;

/* loaded from: classes14.dex */
public final class n extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ft4.o f348188d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f348189e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f348190f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ft4.o oVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        super(false);
        this.f348188d = oVar;
        this.f348189e = k3Var;
        this.f348190f = i17;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        ft4.o oVar = this.f348188d;
        int size = oVar.f348196d.size();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f348189e;
        if (size <= ((ft4.m) k3Var).m8183xf806b362()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletLedgerDayCellAdapter", "onRealClick data.size:" + oVar.f348196d.size() + " is small than " + this.f348190f);
            return;
        }
        dt4.u uVar = (dt4.u) oVar.f348196d.get(((ft4.m) k3Var).m8183xf806b362());
        ft4.l lVar = oVar.f348198f;
        if (lVar != null) {
            lVar.a(uVar);
        }
    }
}
