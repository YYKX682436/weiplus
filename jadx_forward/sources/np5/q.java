package np5;

/* loaded from: classes9.dex */
public class q implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e f420379d;

    public q(com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e) {
        this.f420379d = abstractActivityC22902xe37969e;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("key_is_bind_bankcard", false);
        com.p314xaae8f345.mm.p2802xd031a825.a.k(this.f420379d, "wallet", "BindCardProcess", bundle, new np5.p(this));
    }
}
