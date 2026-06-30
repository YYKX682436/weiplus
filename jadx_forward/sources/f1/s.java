package f1;

/* loaded from: classes2.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f340050d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(double d17) {
        super(1);
        this.f340050d = d17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        double doubleValue = ((java.lang.Number) obj).doubleValue();
        if (doubleValue < 0.0d) {
            doubleValue = 0.0d;
        }
        return java.lang.Double.valueOf(java.lang.Math.pow(doubleValue, 1.0d / this.f340050d));
    }
}
