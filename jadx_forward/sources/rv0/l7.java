package rv0;

/* loaded from: classes5.dex */
public final class l7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.o7 f481638d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(rv0.o7 o7Var) {
        super(1);
        this.f481638d = o7Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        android.content.res.Resources a17 = j65.q.a(this.f481638d.getContext());
        if (floatValue > 0.0f) {
            java.lang.ThreadLocal threadLocal = d3.q.f307641a;
            return d3.l.a(a17, com.p314xaae8f345.mm.R.C30861xcebc809e.f562569cn1, null);
        }
        java.lang.ThreadLocal threadLocal2 = d3.q.f307641a;
        return d3.l.a(a17, com.p314xaae8f345.mm.R.C30861xcebc809e.cni, null);
    }
}
