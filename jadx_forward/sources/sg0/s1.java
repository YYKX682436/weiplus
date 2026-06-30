package sg0;

/* loaded from: classes.dex */
public final class s1 implements q80.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f489335a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f489336b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f489337c;

    public s1(int i17, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, yz5.l lVar) {
        this.f489335a = i17;
        this.f489336b = h0Var;
        this.f489337c = lVar;
    }

    @Override // q80.a0
    /* renamed from: onStoreSendResult */
    public void mo51023x884ffda7(java.lang.String str, int i17, java.lang.String str2, java.lang.Object obj) {
        if (i17 == this.f489335a) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).ak(this);
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f489336b;
            org.json.JSONObject jSONObject = (org.json.JSONObject) h0Var.f391656d;
            if (str2 == null) {
                str2 = "type";
            }
            jSONObject.put("type", str2);
            ((org.json.JSONObject) h0Var.f391656d).put("result", obj);
            ((org.json.JSONObject) h0Var.f391656d).put("err_code", 0);
            ((org.json.JSONObject) h0Var.f391656d).put("err_msg", "dispatchLiteAppAction:ok");
            this.f489337c.mo146xb9724478(h0Var.f391656d);
        }
    }

    @Override // q80.a0
    /* renamed from: onStoreSetData */
    public void mo51024x295aba8a(java.lang.String str, java.util.Map map) {
    }
}
