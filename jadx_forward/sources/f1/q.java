package f1;

/* loaded from: classes14.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.z f340048d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(f1.z zVar) {
        super(1);
        this.f340048d = zVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        double doubleValue = ((java.lang.Number) obj).doubleValue();
        f1.z zVar = this.f340048d;
        return java.lang.Double.valueOf(doubleValue >= zVar.f340072e ? java.lang.Math.pow((zVar.f340069b * doubleValue) + zVar.f340070c, zVar.f340068a) : doubleValue * zVar.f340071d);
    }
}
