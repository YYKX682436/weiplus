package e04;

/* loaded from: classes15.dex */
public class v implements h45.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f327667a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e04.p f327668b;

    public v(e04.p pVar, int i17) {
        this.f327668b = pVar;
        this.f327667a = i17;
    }

    @Override // h45.i
    /* renamed from: onKindaBusinessCallback */
    public void mo24858x44dbb8f3(android.content.Intent intent) {
        int intExtra = intent.getIntExtra("scan_continue", 0);
        e04.p pVar = this.f327668b;
        if (intExtra != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "WPHK finish scan");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1882, 117);
            pVar.t(true, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "WPHK scan continue is 1，call getA8key，mOriginQBarString is %s, codeType is %s, codeVersion is %s, getA8keyScene is %s, appId is %s, processOfflineScan is %s, mGetA8KeyRequestId is %s", pVar.f327579g, java.lang.Integer.valueOf(pVar.f327581i), java.lang.Integer.valueOf(pVar.f327582m), java.lang.Integer.valueOf(this.f327667a), pVar.D, java.lang.Boolean.valueOf(pVar.f327584o), java.lang.Integer.valueOf(pVar.f327590u));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1882, 116);
            java.lang.ref.WeakReference weakReference = pVar.f327576d;
            android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
            e04.p pVar2 = this.f327668b;
            pVar2.f(activity, pVar2.f327579g, pVar2.f327581i, pVar2.f327582m, this.f327667a, pVar2.D, pVar2.f327584o, pVar2.f327590u);
        }
    }
}
