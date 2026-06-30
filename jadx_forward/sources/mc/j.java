package mc;

/* loaded from: classes14.dex */
public final class j implements android.hardware.SensorEventListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mc.m f407057d;

    public j(mc.m mVar) {
        this.f407057d = mVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        boolean z17;
        java.lang.String str;
        boolean z18;
        if (sensorEvent.sensor.getType() == 5) {
            float f17 = sensorEvent.values[0];
            mc.l lVar = this.f407057d.f407062d;
            if (lVar != null) {
                lc.g gVar = ((lc.C29089x2f5e24) lVar).f399375a;
                if (f17 < 4.0f) {
                    str = gVar.b().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575426pj2);
                    z17 = true;
                } else {
                    z17 = false;
                    str = "";
                }
                if (f17 > 235.0f) {
                    str = gVar.b().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575427pj3);
                    z18 = true;
                    z17 = true;
                } else {
                    z18 = false;
                }
                if (gVar.f399343h == null) {
                    return;
                }
                if (!z17) {
                    if (gVar.f399357y) {
                        gVar.f399357y = false;
                        pc.o oVar = gVar.f399352t;
                        if (oVar.f434750d.equals("")) {
                            return;
                        }
                        oVar.f434750d = "";
                        oVar.f434749c.setText("");
                        return;
                    }
                    return;
                }
                if (gVar.f399357y || !gVar.f399358z) {
                    return;
                }
                pc.o oVar2 = gVar.f399352t;
                if (!oVar2.f434750d.equals(str)) {
                    oVar2.f434750d = str;
                    oVar2.f434749c.setText(str);
                }
                if (z18) {
                    int i17 = ic.d.f371814k;
                    ic.c.f371813a.d(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.LIGHT_TOO_STRONG, true);
                } else {
                    int i18 = ic.d.f371814k;
                    ic.c.f371813a.d(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.LIGHT_TOO_LOW, true);
                }
                gVar.f399357y = true;
            }
        }
    }
}
