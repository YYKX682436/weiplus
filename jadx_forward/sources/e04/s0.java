package e04;

/* loaded from: classes15.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6185x2d8542e8 f327616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e04.p f327617e;

    public s0(e04.p pVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6185x2d8542e8 c6185x2d8542e8) {
        this.f327617e = pVar;
        this.f327616d = c6185x2d8542e8;
    }

    @Override // java.lang.Runnable
    public void run() {
        am.qz qzVar;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6185x2d8542e8 c6185x2d8542e8 = this.f327616d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "[do UniPcPay] callback，errorCode：%s", java.lang.Integer.valueOf(c6185x2d8542e8.f136444h.f89287a));
        java.lang.ref.WeakReference weakReference = c6185x2d8542e8.f136443g.f89215k;
        if (weakReference == null || weakReference.get() == null || (qzVar = c6185x2d8542e8.f136444h) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QBarStringHandler", "[do UniPcPay] event.data.contextRef.get() == null || event.result == null ");
            return;
        }
        int i17 = qzVar.f89287a;
        e04.p pVar = this.f327617e;
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "[do UniPcPay] callback，scan continue ");
            pVar.D(true);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "[do UniPcPay] callback，scan finish");
        am.pz pzVar = c6185x2d8542e8.f136443g;
        pzVar.f89215k = null;
        pzVar.f89216l = null;
        pVar.D(false);
    }
}
