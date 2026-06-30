package h11;

/* loaded from: classes12.dex */
public class a implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h11.b f359598d;

    public a(h11.b bVar) {
        this.f359598d = bVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        m1Var.mo808xfb85f7b0();
        h11.b bVar = this.f359598d;
        if (i17 == 0 && i18 == 0) {
            h11.e eVar = bVar.f359600e;
            eVar.mo807x6c193ac1(eVar.m47995xb7ba1aa7(), bVar.f359600e.f359605e);
        } else {
            h11.e eVar2 = bVar.f359600e;
            eVar2.f359605e.mo815x76e0bfae(i17, i18, "", eVar2);
        }
    }
}
