package lq0;

/* loaded from: classes7.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f401981d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lq0.d f401982e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f401983f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(yz5.l lVar, lq0.d dVar, org.json.JSONObject jSONObject) {
        super(1);
        this.f401981d = lVar;
        this.f401982e = dVar;
        this.f401983f = jSONObject;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.content.Context context;
        android.view.View view = (android.view.View) obj;
        yz5.l lVar = this.f401981d;
        if (view != null) {
            lVar.mo146xb9724478(view);
        } else {
            lq0.d dVar = this.f401982e;
            lc3.s sVar = (lc3.s) dVar.f399423a;
            if (sVar == null || (context = sVar.B0()) == null) {
                context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            android.content.Context context2 = context;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context2);
            com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d = new com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d(context2, null, 0, 6, null);
            org.json.JSONObject jSONObject = this.f401983f;
            int v17 = dVar.v(jSONObject);
            c10867x3e50a04d.f150216p = v17;
            fq0.x xVar = c10867x3e50a04d.frameSet;
            if (xVar != null) {
                xVar.f347025p = v17;
            }
            java.lang.String optString = jSONObject.optString("frameSetName");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
            c10867x3e50a04d.e(optString);
            lVar.mo146xb9724478(c10867x3e50a04d);
        }
        return jz5.f0.f384359a;
    }
}
