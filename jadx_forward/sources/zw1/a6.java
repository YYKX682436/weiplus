package zw1;

/* loaded from: classes9.dex */
public class a6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6 f558111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 f558112e;

    public a6(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6 c6241x543927b6) {
        this.f558112e = activityC13149x63b02cb3;
        this.f558111d = c6241x543927b6;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6 c6241x543927b6 = this.f558111d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c6241x543927b6.f136489h.f88527a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "no bulletin data");
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) this.f558112e.findViewById(com.p314xaae8f345.mm.R.id.af7);
        am.j10 j10Var = c6241x543927b6.f136489h;
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.s0(null, textView, j10Var.f88527a, j10Var.f88528b, j10Var.f88529c);
    }
}
