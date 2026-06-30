package q01;

/* loaded from: classes.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f440847d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(long j17) {
        super(1);
        this.f440847d = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.Map.Entry it = (java.util.Map.Entry) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object value = it.getValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "<get-value>(...)");
        return java.lang.Boolean.valueOf(((java.lang.Number) value).longValue() < this.f440847d);
    }
}
