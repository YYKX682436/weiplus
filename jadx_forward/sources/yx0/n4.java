package yx0;

/* loaded from: classes5.dex */
public final class n4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f549011d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(java.lang.ref.WeakReference weakReference) {
        super(4);
        this.f549011d = weakReference;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        int intValue3 = ((java.lang.Number) obj3).intValue();
        long longValue = ((java.lang.Number) obj4).longValue();
        ux0.e eVar = new ux0.e(intValue, intValue2, intValue3);
        eVar.f513324a = longValue;
        pp0.p0 p0Var = (pp0.p0) this.f549011d.get();
        if (p0Var != null) {
            p0Var.d0(eVar);
        }
        return jz5.f0.f384359a;
    }
}
