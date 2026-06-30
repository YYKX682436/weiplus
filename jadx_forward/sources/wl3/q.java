package wl3;

/* loaded from: classes4.dex */
public final class q {
    public q(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        long j17 = i17 / 60000;
        long floor = (long) java.lang.Math.floor((r1 % 60000) / 1000.0d);
        if (j17 < 10) {
            sb6.append("0");
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(j17);
        sb7.append(':');
        sb6.append(sb7.toString());
        if (floor < 10) {
            sb6.append("0");
        }
        sb6.append(floor);
        java.lang.String sb8 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb8, "toString(...)");
        return sb8;
    }
}
