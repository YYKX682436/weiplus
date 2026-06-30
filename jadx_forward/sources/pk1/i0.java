package pk1;

/* loaded from: classes12.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk1.l0 f436988d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(pk1.l0 l0Var) {
        super(2);
        this.f436988d = l0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        long longValue2 = ((java.lang.Number) obj2).longValue();
        pk1.l0 l0Var = this.f436988d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var.f437003h, "progressCallback, finished: " + longValue + ", total: " + longValue2);
        yz5.p pVar = l0Var.f437001f;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(longValue2));
        }
        pk1.v vVar = l0Var.f437004i;
        if (longValue >= longValue2) {
            pk1.z.f437063a.d(vVar);
        } else {
            pk1.z.f437063a.e(vVar);
        }
        return jz5.f0.f384359a;
    }
}
