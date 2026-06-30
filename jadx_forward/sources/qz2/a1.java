package qz2;

/* loaded from: classes9.dex */
public final class a1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qz2.j1 f449371d;

    public a1(qz2.j1 j1Var) {
        this.f449371d = j1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "showSuccessAlert, finish ui!");
        this.f449371d.m158354x19263085().finish();
    }
}
