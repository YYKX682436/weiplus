package ra3;

/* loaded from: classes.dex */
public class e implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_flutter_game_enable, 0);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("result", Ni == 1);
        if (rVar != null) {
            rVar.a(bundle);
        }
    }
}
