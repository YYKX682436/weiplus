package f1;

/* loaded from: classes14.dex */
public final class v {
    public v(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final float a(float[] fArr) {
        float f17 = fArr[0];
        float f18 = fArr[1];
        float f19 = fArr[2];
        float f27 = fArr[3];
        float f28 = fArr[4];
        float f29 = fArr[5];
        float f37 = ((((((f17 * f27) + (f18 * f28)) + (f19 * f29)) - (f27 * f28)) - (f18 * f19)) - (f17 * f29)) * 0.5f;
        return f37 < 0.0f ? -f37 : f37;
    }

    public final boolean b(double d17, yz5.l lVar, yz5.l lVar2) {
        return java.lang.Math.abs(((java.lang.Number) lVar.mo146xb9724478(java.lang.Double.valueOf(d17))).doubleValue() - ((java.lang.Number) lVar2.mo146xb9724478(java.lang.Double.valueOf(d17))).doubleValue()) <= 0.001d;
    }
}
