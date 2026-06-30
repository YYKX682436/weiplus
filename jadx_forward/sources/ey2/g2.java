package ey2;

/* loaded from: classes2.dex */
public final class g2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ey2.h2 f338914d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(ey2.h2 h2Var) {
        super(2);
        this.f338914d = h2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((java.lang.String) obj2, "<anonymous parameter 1>");
        return java.lang.Boolean.valueOf(this.f338914d.f338922b.indexOfKey(longValue) < 0);
    }
}
