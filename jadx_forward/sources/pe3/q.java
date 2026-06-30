package pe3;

/* loaded from: classes3.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f435205d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(yz5.p pVar, java.util.List list) {
        super(1);
        this.f435205d = list;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(intValue);
        java.lang.Object obj2 = this.f435205d.get(intValue);
        valueOf.intValue();
        se3.d it = (se3.d) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        return java.lang.Integer.valueOf(it.hashCode());
    }
}
