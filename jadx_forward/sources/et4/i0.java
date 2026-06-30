package et4;

/* loaded from: classes9.dex */
public class i0 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ et4.j0 f338166d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(et4.j0 j0Var) {
        super(false);
        this.f338166d = j0Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayCashierFetchFavorDialog", "click back");
        this.f338166d.cancel();
    }
}
