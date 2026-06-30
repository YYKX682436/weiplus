package en3;

/* loaded from: classes.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f336839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f336840e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f336841f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336842g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336843h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336844i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f336845m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(en3.l0 l0Var, int i17, int i18, int i19, java.lang.String str, java.lang.String str2, java.lang.String str3, yz5.l lVar) {
        super(1);
        this.f336839d = i17;
        this.f336840e = i18;
        this.f336841f = i19;
        this.f336842g = str;
        this.f336843h = str2;
        this.f336844i = str3;
        this.f336845m = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        yz5.l lVar = this.f336845m;
        if (c19792x256d2725 != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("bizuin", this.f336839d);
            jSONObject.put("mid", this.f336840e);
            jSONObject.put("idx", this.f336841f);
            jSONObject.put(dm.i4.f66865x76d1ec5a, this.f336842g);
            jSONObject.put("fid", this.f336843h);
            jSONObject.put("action", this.f336844i);
            nv2.o oVar = nv2.o.f422091e;
            jSONObject.put("praiseStatus", oVar.c(c19792x256d2725) ? 1 : 0);
            jSONObject.put("praiseNum", oVar.b(c19792x256d2725));
            lVar.mo146xb9724478(jSONObject.toString());
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            lVar.mo146xb9724478(null);
        }
        return f0Var2;
    }
}
