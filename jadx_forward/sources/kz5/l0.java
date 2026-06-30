package kz5;

/* loaded from: classes.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f395516d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(int i17) {
        super(1);
        this.f395516d = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        throw new java.lang.IndexOutOfBoundsException("Collection doesn't contain element at index " + this.f395516d + '.');
    }
}
