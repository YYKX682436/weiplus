package f1;

/* loaded from: classes14.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.z f340046d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(f1.z zVar) {
        super(1);
        this.f340046d = zVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        double doubleValue = ((java.lang.Number) obj).doubleValue();
        f1.z zVar = this.f340046d;
        double d17 = zVar.f340069b;
        double d18 = zVar.f340072e;
        double d19 = zVar.f340071d;
        return java.lang.Double.valueOf(doubleValue >= d18 * d19 ? (java.lang.Math.pow(doubleValue, 1.0d / zVar.f340068a) - zVar.f340070c) / d17 : doubleValue / d19);
    }
}
