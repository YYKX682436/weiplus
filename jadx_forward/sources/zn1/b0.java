package zn1;

/* loaded from: classes8.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r26.t f555955d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(r26.t tVar) {
        super(1);
        this.f555955d = tVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (str == null || str.length() == 0) {
            return java.lang.Boolean.FALSE;
        }
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        return java.lang.Boolean.valueOf(this.f555955d.a(lowerCase));
    }
}
