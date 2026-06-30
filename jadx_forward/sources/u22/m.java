package u22;

/* loaded from: classes10.dex */
public final class m implements x85.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u22.r f505533a;

    public m(u22.r rVar) {
        this.f505533a = rVar;
    }

    @Override // x85.c
    public void a(int i17, r45.p64 p64Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StickerPanelData", "getLensInfo onResult: " + p64Var);
        if (p64Var != null) {
            u22.r rVar = this.f505533a;
            rVar.f505558m.add(p64Var);
            rVar.d();
        }
    }
}
