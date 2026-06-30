package qd2;

/* loaded from: classes2.dex */
public final class e0 implements android.hardware.SensorEventListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qd2.g0 f443254d;

    public e0(qd2.g0 g0Var) {
        this.f443254d = g0Var;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent event) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        float[] fArr = event.values;
        boolean z17 = false;
        float f17 = -fArr[0];
        float f18 = -fArr[1];
        float f19 = -fArr[2];
        qd2.g0 g0Var = this.f443254d;
        java.lang.System.arraycopy(fArr, 0, g0Var.f443276g, 0, 3);
        float f27 = (f17 * f17) + (f18 * f18);
        float f28 = f19 * f19;
        float abs = java.lang.Math.abs(((float) java.lang.Math.sqrt(f27 + f28)) - 9.80665f);
        jz5.g gVar = g0Var.f443277h;
        if (abs > ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue()) {
            ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue();
        } else if (java.lang.Math.abs(f18) < 0.2f) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(f18)}, 1)), "format(...)");
        } else {
            z17 = true;
        }
        if (z17) {
            if (f27 * 4 >= f28) {
                i17 = 90 - ((int) java.lang.Math.rint(((float) java.lang.Math.atan2(-f18, f17)) * 57.29578f));
                while (i17 >= 360) {
                    i17 += org.p3343x72743996.net.InterfaceC29524x4f65168b.f73983x984b3535;
                }
                while (i17 < 0) {
                    i17 += com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
                }
            } else {
                i17 = -1;
            }
            if (i17 != g0Var.f443270a) {
                g0Var.f443270a = i17;
                qd2.j0 j0Var = (qd2.j0) g0Var;
                if (i17 == -1) {
                    return;
                }
                qd2.k0 k0Var = j0Var.f443316i;
                qd2.h0 h0Var = k0Var.f443318b;
                qd2.h0 h0Var2 = ((i17 < 330 || i17 >= 360) && (i17 < 0 || i17 > 30)) ? (i17 < 240 || i17 > 300) ? (i17 < 150 || i17 > 210) ? (i17 < 60 || i17 > 120) ? h0Var : qd2.h0.f443305h : qd2.h0.f443304g : qd2.h0.f443303f : qd2.h0.f443302e;
                if (h0Var2 != h0Var) {
                    qd2.i0 i0Var = k0Var.f443317a;
                    if (i0Var != null && h0Var != qd2.h0.f443301d) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ot) i0Var).f217017a.mo149xb9724478(h0Var, h0Var2);
                    }
                    k0Var.f443318b = h0Var2;
                }
            }
        }
    }
}
