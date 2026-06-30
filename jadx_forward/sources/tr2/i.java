package tr2;

/* loaded from: classes.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f502917d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i17) {
        super(1);
        this.f502917d = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        int i17 = this.f502917d;
        if (intValue > i17) {
            intValue = i17;
        }
        return java.lang.Integer.valueOf(intValue);
    }
}
