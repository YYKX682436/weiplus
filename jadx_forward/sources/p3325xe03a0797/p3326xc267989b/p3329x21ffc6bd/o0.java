package p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd;

/* loaded from: classes14.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.o0 f392045d = new p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.o0();

    public o0() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        oz5.i iVar = (oz5.i) obj2;
        if (!(iVar instanceof p3325xe03a0797.p3326xc267989b.u3)) {
            return obj;
        }
        java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
        int intValue = num != null ? num.intValue() : 1;
        return intValue == 0 ? iVar : java.lang.Integer.valueOf(intValue + 1);
    }
}
