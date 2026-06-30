package sw4;

/* loaded from: classes8.dex */
public class j extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sw4.e f495020a;

    public j(sw4.k kVar, sw4.e eVar) {
        this.f495020a = eVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("err_msg", str);
        bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject != null ? jSONObject.toString() : "");
        this.f495020a.f(bundle);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5
    public void b(java.lang.String str, org.json.JSONObject jSONObject) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("event", str);
        bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject != null ? jSONObject.toString() : "");
        this.f495020a.a(bundle);
    }
}
