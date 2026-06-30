package a23;

/* loaded from: classes8.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f847d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(org.json.JSONArray jSONArray) {
        super(1);
        this.f847d = jSONArray;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        int intValue = ((java.lang.Number) obj).intValue();
        org.json.JSONArray jSONArray = this.f847d;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            org.json.JSONObject jSONObject = jSONArray.getJSONObject(intValue);
            a23.e eVar = new a23.e("");
            kotlin.jvm.internal.o.d(jSONObject);
            eVar.a(jSONObject);
            m521constructorimpl = kotlin.Result.m521constructorimpl(eVar);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = null;
        }
        return (a23.e) m521constructorimpl;
    }
}
