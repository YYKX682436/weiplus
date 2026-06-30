package r26;

/* loaded from: classes5.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ char[] f450431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f450432e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(char[] cArr, boolean z17) {
        super(2);
        this.f450431d = cArr;
        this.f450432e = z17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.CharSequence $receiver = (java.lang.CharSequence) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g($receiver, "$this$$receiver");
        int M = r26.n0.M($receiver, this.f450431d, intValue, this.f450432e);
        if (M < 0) {
            return null;
        }
        return new jz5.l(java.lang.Integer.valueOf(M), 1);
    }
}
