package lq0;

/* loaded from: classes7.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lq0.d f401984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f401985e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f401986f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(lq0.d dVar, org.json.JSONObject jSONObject, yz5.l lVar) {
        super(0);
        this.f401984d = dVar;
        this.f401985e = jSONObject;
        this.f401986f = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        lq0.d dVar = this.f401984d;
        lc3.s sVar = (lc3.s) dVar.f399423a;
        if (sVar != null) {
            yz5.l lVar = this.f401986f;
            org.json.JSONObject jSONObject = this.f401985e;
            sVar.E0(jSONObject, new lq0.b(lVar, dVar, jSONObject));
        }
        return jz5.f0.f384359a;
    }
}
