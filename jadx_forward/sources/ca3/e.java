package ca3;

/* loaded from: classes13.dex */
public final class e implements android.hardware.SensorEventListener {

    /* renamed from: d, reason: collision with root package name */
    public double f121324d;

    /* renamed from: e, reason: collision with root package name */
    public long f121325e = 200;

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        ca3.a aVar;
        if (sensorEvent == null || sensorEvent.sensor.getType() != 3) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f121325e;
        float f17 = sensorEvent.values[0];
        if (f17 <= 0.0f) {
            f17 += (((((int) f17) * (-1)) / com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) + 1) * com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
        }
        float f18 = f17 % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
        if (currentTimeMillis > 200) {
            double d17 = f18;
            if (java.lang.Math.abs(d17 - this.f121324d) > 3) {
                java.util.Iterator it = ca3.f.f121327b.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.map.C16226x881c42e c16226x881c42e = ((ca3.r) ((ca3.d) it.next())).f121341a;
                    if (c16226x881c42e.f225637h && !c16226x881c42e.G && (aVar = c16226x881c42e.F) != null) {
                        double d18 = aVar.f121317i ? aVar.f121315g : d17;
                        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a = aVar.f121309a;
                        if (interfaceC4409x88f1805a != null) {
                            interfaceC4409x88f1805a.mo37261x742bae00((float) d18);
                        }
                    }
                }
                this.f121324d = d17;
                this.f121325e = java.lang.System.currentTimeMillis();
            }
        }
    }
}
