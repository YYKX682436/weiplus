package dn3;

/* loaded from: classes14.dex */
public class e implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f323533d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w25.e f323534e;

    public e(dn3.f fVar, boolean z17, w25.e eVar) {
        this.f323533d = z17;
        this.f323534e = eVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof dn3.k) {
            gm0.j1.d().q(603, this);
            w25.e eVar = this.f323534e;
            if (i17 == 0 && i18 == 0) {
                eVar.i3(this.f323533d ? ((r45.th3) ((dn3.k) m1Var).f323558e.f152244b.f152233a).f467970s : ((r45.th3) ((dn3.k) m1Var).f323558e.f152244b.f152233a).f467967p, ((r45.th3) ((dn3.k) m1Var).f323558e.f152244b.f152233a).f467962h);
            } else {
                eVar.i3("", java.util.Collections.EMPTY_LIST);
            }
        }
    }
}
