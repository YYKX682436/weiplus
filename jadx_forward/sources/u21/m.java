package u21;

/* loaded from: classes12.dex */
public class m implements com.p314xaae8f345.mm.p944x882e457a.j1 {
    @Override // com.p314xaae8f345.mm.p944x882e457a.j1
    /* renamed from: onSceneEnd */
    public void mo10099x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var;
        t21.p3 Zi = t21.o2.Zi();
        if (!Zi.f496398e || (n3Var = Zi.f496397d) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoService", "onSceneEnd error!, handler or thread is null!");
        } else {
            n3Var.mo50293x3498a0(new t21.m3(Zi, m1Var, i17, i18));
        }
    }
}
