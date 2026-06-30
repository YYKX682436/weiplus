package f1;

/* loaded from: classes14.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.z f340049d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(f1.z zVar) {
        super(1);
        this.f340049d = zVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        double d17;
        double doubleValue = ((java.lang.Number) obj).doubleValue();
        f1.z zVar = this.f340049d;
        double d18 = zVar.f340069b;
        if (doubleValue >= zVar.f340072e) {
            d17 = java.lang.Math.pow((d18 * doubleValue) + zVar.f340070c, zVar.f340068a) + zVar.f340073f;
        } else {
            d17 = zVar.f340074g + (zVar.f340071d * doubleValue);
        }
        return java.lang.Double.valueOf(d17);
    }
}
