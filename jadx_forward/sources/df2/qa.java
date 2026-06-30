package df2;

/* loaded from: classes5.dex */
public final class qa extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.zb f312682d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa(df2.zb zbVar) {
        super(2);
        this.f312682d = zbVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String keyword = (java.lang.String) obj;
        float floatValue = ((java.lang.Number) obj2).floatValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyword, "keyword");
        df2.zb zbVar = this.f312682d;
        java.lang.Float f17 = zbVar.f313476q;
        float floatValue2 = f17 != null ? f17.floatValue() : 0.0f;
        java.lang.String str = zbVar.f313472m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[KWS] keyword detected: " + keyword + ", confidence=" + floatValue + ", threshold=" + floatValue2);
        if (floatValue < floatValue2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[KWS] confidence below threshold, ignored");
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new df2.pa(zbVar));
        }
        return jz5.f0.f384359a;
    }
}
