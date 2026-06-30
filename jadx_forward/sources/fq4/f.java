package fq4;

/* loaded from: classes12.dex */
public class f implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fq4.g f347125d;

    public f(fq4.g gVar) {
        this.f347125d = gVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        m1Var.mo808xfb85f7b0();
        fq4.g gVar = this.f347125d;
        if (i17 == 0 && i18 == 0) {
            fq4.h hVar = gVar.f347127e;
            hVar.mo807x6c193ac1(hVar.m47995xb7ba1aa7(), gVar.f347127e.f347131d);
        } else {
            fq4.h hVar2 = gVar.f347127e;
            hVar2.f347131d.mo815x76e0bfae(i17, i18, "", hVar2);
        }
    }
}
