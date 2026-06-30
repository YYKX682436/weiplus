package qp5;

/* loaded from: classes9.dex */
public class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qp5.k f447375d;

    public i(qp5.k kVar) {
        this.f447375d = kVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String a17 = j62.e.g().a("clicfg_wcpay_host_change_to_cn_android", "", false, false);
        boolean z17 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(a17, 0) == 0) ? false : true;
        qp5.k kVar = this.f447375d;
        if (z17) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(kVar.f447376d, "https://tenpay.wechatpay.cn/cgi-bin/mmpayweb-bin/payunregshow?operation=1", false);
        } else {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(kVar.f447376d, "https://wx.tenpay.com/cgi-bin/mmpayweb-bin/payunregshow?operation=1", false);
        }
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6239x3d383f6().e();
    }
}
