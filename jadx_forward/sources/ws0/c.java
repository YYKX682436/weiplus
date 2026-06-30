package ws0;

/* loaded from: classes10.dex */
public final class c implements com.p314xaae8f345.mm.p788xd6f12a1a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ws0.g f530491a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f530492b;

    public c(ws0.g gVar, yz5.a aVar) {
        this.f530491a = gVar;
        this.f530492b = aVar;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.a
    /* renamed from: onGetParameters */
    public final void mo46148x3ca75e41(int i17, org.json.JSONObject jSONObject) {
        if (i17 == 2) {
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("CameraRequestTags");
            ws0.g gVar = this.f530491a;
            gVar.f530500c = optJSONArray;
            gVar.f530501d = jSONObject.optJSONArray("CameraResultTags");
            gVar.f530502e = jSONObject.optJSONArray("CaptureSessionType");
            this.f530492b.mo152xb9724478();
        }
    }
}
