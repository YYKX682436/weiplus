package dr4;

/* loaded from: classes14.dex */
public final class a extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f324121a;

    public a(yz5.l lVar) {
        super(null);
        this.f324121a = lVar;
        boolean a17 = a();
        qq4.b wi6 = gq4.v.wi();
        wi6.f447505f = a17;
        wi6.f447506g.mo7808x76db6cb1(java.lang.Boolean.valueOf(a17));
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(a17));
        }
    }

    public final boolean a() {
        try {
            int i17 = android.provider.Settings.System.getInt(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver(), "accelerometer_rotation", 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPRenderMgr", "accRotation=" + i17);
            return i17 == 0;
        } catch (java.lang.Exception unused) {
            return true;
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17) {
        boolean a17 = a();
        qq4.b wi6 = gq4.v.wi();
        boolean a18 = a();
        wi6.f447505f = a18;
        wi6.f447506g.mo7808x76db6cb1(java.lang.Boolean.valueOf(a18));
        yz5.l lVar = this.f324121a;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(a17));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccelerometerRotationObserver", "systemRotateLocked now " + a17);
    }
}
