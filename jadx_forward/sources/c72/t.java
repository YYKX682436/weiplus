package c72;

/* loaded from: classes12.dex */
public class t implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c72.u f121123d;

    public t(c72.u uVar) {
        this.f121123d = uVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        m1Var.mo808xfb85f7b0();
        c72.u uVar = this.f121123d;
        if (i17 == 0 && i18 == 0) {
            c72.v vVar = uVar.f121125e;
            vVar.H(vVar.m47995xb7ba1aa7(), uVar.f121125e.f121127e);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneFaceRsaBase", "hy: do scene err in rsa when get cert. clear ticket");
        c72.v.f121126f = null;
        c72.v vVar2 = uVar.f121125e;
        vVar2.getClass();
        vVar2.K(c72.v.f121126f);
        c72.v vVar3 = uVar.f121125e;
        vVar3.f121127e.mo815x76e0bfae(i17, i18, "", vVar3);
    }
}
