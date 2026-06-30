package ma1;

/* loaded from: classes7.dex */
public class e implements ta1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f406687a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f406688b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ma1.c f406689c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f406691e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f406692f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ma1.f f406693g;

    public e(ma1.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17, ma1.c cVar, java.lang.String str, org.json.JSONArray jSONArray, org.json.JSONObject jSONObject) {
        this.f406693g = fVar;
        this.f406687a = c0Var;
        this.f406688b = i17;
        this.f406689c = cVar;
        this.f406690d = str;
        this.f406691e = jSONArray;
        this.f406692f = jSONObject;
    }

    @Override // ta1.t0
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        try {
            if (i18 != 0 || jSONObject == null) {
                this.f406693g.F(this.f406687a, this.f406688b, i17, i18, str);
                return;
            }
            ma1.f fVar = this.f406693g;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f406687a;
            fVar.getClass();
            ta1.q0 b17 = ta1.q0.b(c0Var.mo48798x74292566(), c0Var);
            java.util.Objects.requireNonNull(b17);
            ta1.n0 n0Var = new ta1.n0(b17);
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("audio");
            if (optJSONObject != null) {
                n0Var.f498181a = optJSONObject.optInt(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63, 0);
                n0Var.f498182b = optJSONObject.optInt("samplerate", 0);
                n0Var.f498183c = optJSONObject.optInt("channel", 0);
            }
            this.f406693g.G(this.f406687a, this.f406688b, this.f406689c, this.f406690d, this.f406691e, n0Var, this.f406692f);
        } catch (java.lang.Exception e17) {
            this.f406693g.F(this.f406687a, this.f406688b, 1, -1, e17.getMessage());
        }
    }
}
