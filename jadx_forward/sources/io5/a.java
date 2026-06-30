package io5;

/* loaded from: classes7.dex */
public final class a extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f375063a;

    public a(yz5.l lVar) {
        super(null);
        this.f375063a = lVar;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17) {
        boolean z18 = android.provider.Settings.System.getInt(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver(), "accelerometer_rotation", 0) == 0;
        yz5.l lVar = this.f375063a;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(z18));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccelerometerRotationObserver", "onChange: " + z18);
    }
}
