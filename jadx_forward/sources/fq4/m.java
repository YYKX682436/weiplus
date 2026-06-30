package fq4;

/* loaded from: classes9.dex */
public class m implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fq4.n f347151d;

    public m(fq4.n nVar) {
        this.f347151d = nVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        m1Var.mo808xfb85f7b0();
        fq4.n nVar = this.f347151d;
        if (i17 == 0 && i18 == 0) {
            fq4.o oVar = nVar.f347153e;
            oVar.mo807x6c193ac1(oVar.m47995xb7ba1aa7(), nVar.f347153e.f347154d);
        } else {
            fq4.o oVar2 = nVar.f347153e;
            oVar2.f347154d.mo815x76e0bfae(i17, i18, "", oVar2);
        }
    }
}
