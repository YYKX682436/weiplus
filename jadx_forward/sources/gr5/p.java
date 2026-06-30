package gr5;

/* loaded from: classes.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f356475d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(int i17) {
        super(1);
        this.f356475d = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return java.lang.Boolean.valueOf((((java.lang.Number) obj).intValue() & this.f356475d) != 0);
    }
}
