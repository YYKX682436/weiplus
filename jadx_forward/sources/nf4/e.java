package nf4;

/* loaded from: classes4.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final nf4.e f418377d = new nf4.e();

    public e() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        long longValue2 = ((java.lang.Number) obj2).longValue();
        return java.lang.Boolean.valueOf(((longValue < 0) ^ (longValue < longValue2)) ^ (longValue2 < 0));
    }
}
