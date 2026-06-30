package js3;

/* loaded from: classes4.dex */
public class g implements com.p314xaae8f345.mm.p794xb0fa9b5e.j, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p794xb0fa9b5e.r f383056d;

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f383056d = rVar;
        gm0.j1.d().a(12213, this);
        gm0.j1.d().g(new ms3.b());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetUnreadMailCountTask", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        gm0.j1.d().q(12213, this);
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f383056d;
        if (rVar != null) {
            rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2(((ks3.d1) ((ms3.b) m1Var).f412511d.f152244b.f152233a).f393188d));
        }
    }
}
