package xc2;

/* loaded from: classes2.dex */
public final class u {
    public u(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(long j17, int i17, java.lang.String str) {
        java.lang.Integer num = (java.lang.Integer) xc2.k0.B.get(java.lang.Integer.valueOf(i17));
        int intValue = num != null ? num.intValue() : 0;
        if (intValue > 0) {
            i17 = intValue;
        }
        return j17 + '#' + str + '#' + i17;
    }
}
