package fq4;

/* loaded from: classes12.dex */
public class j implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fq4.k f347144d;

    public j(fq4.k kVar) {
        this.f347144d = kVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        m1Var.mo808xfb85f7b0();
        fq4.k kVar = this.f347144d;
        if (i17 == 0 && i18 == 0) {
            fq4.l lVar = kVar.f347146e;
            lVar.mo807x6c193ac1(lVar.m47995xb7ba1aa7(), kVar.f347146e.f347147d);
        } else {
            fq4.l lVar2 = kVar.f347146e;
            lVar2.f347147d.mo815x76e0bfae(i17, i18, "", lVar2);
        }
    }
}
