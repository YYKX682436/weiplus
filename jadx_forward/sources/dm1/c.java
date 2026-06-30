package dm1;

/* loaded from: classes5.dex */
public final class c implements com.p314xaae8f345.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm1.m f323164d;

    public c(dm1.m mVar) {
        this.f323164d = mVar;
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        android.content.Context context;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WMPFVoip.WMPFVoipCallInPopupWindow", "onAppBackground: ");
        dm1.m mVar = this.f323164d;
        android.view.View view = mVar.f323181c;
        java.lang.Object systemService = (view == null || (context = view.getContext()) == null) ? null : context.getSystemService("power");
        android.os.PowerManager powerManager = systemService instanceof android.os.PowerManager ? (android.os.PowerManager) systemService : null;
        if (powerManager != null ? powerManager.isInteractive() : true) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WMPFVoip.WMPFVoipCallInPopupWindow", "onAppBackground: hideCard");
            p3325xe03a0797.p3326xc267989b.i2 i2Var = p3325xe03a0797.p3326xc267989b.i2.f392010d;
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(i2Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new dm1.b(mVar, null), 2, null);
        }
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        dm1.m mVar = this.f323164d;
        if (mVar.f323192n) {
            mVar.f323192n = false;
            mVar.b(true, mVar.f323182d);
        }
    }
}
