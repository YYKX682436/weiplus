package tp0;

/* loaded from: classes7.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tp0.c f502543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f502544e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jc3.m f502545f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(tp0.c cVar, org.json.JSONObject jSONObject, jc3.m mVar) {
        super(1);
        this.f502543d = cVar;
        this.f502544e = jSONObject;
        this.f502545f = mVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        jz5.f0 f0Var;
        lc3.r rVar;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        tp0.c cVar = this.f502543d;
        if (obj != null) {
            lc3.s sVar = (lc3.s) cVar.f399423a;
            org.json.JSONObject jSONObject = this.f502544e;
            if (sVar != null && (rVar = sVar.f399452d) != null) {
                rVar.a(cVar.v(jSONObject), obj);
            }
            jc3.m mVar = this.f502545f;
            mVar.e(obj, mVar.a(jSONObject), new tp0.a(cVar, obj, jSONObject, mVar));
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseCoverViewInsert", "hy: failed to create view!");
            cVar.u(lc3.v.f399465d);
        }
        return f0Var2;
    }
}
