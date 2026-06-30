package mm2;

/* loaded from: classes.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f410894d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(java.lang.String str) {
        super(3);
        this.f410894d = str;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String wordingId = (java.lang.String) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((java.lang.String) obj2, "<anonymous parameter 1>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wordingId, "wordingId");
        return java.lang.Boolean.valueOf(intValue == 5 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(wordingId, this.f410894d));
    }
}
