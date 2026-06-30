package fk2;

/* loaded from: classes3.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk2.k f344934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f344935e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344936f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(fk2.k kVar, int i17, java.lang.String str) {
        super(0);
        this.f344934d = kVar;
        this.f344935e = i17;
        this.f344936f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fk2.k kVar = this.f344934d;
        if (!kVar.f526773a.t()) {
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            ml2.g4[] g4VarArr = ml2.g4.f409012d;
            ml2.h4[] h4VarArr = ml2.h4.f409056d;
            jSONObject.put("type", 3);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String str = this.f344936f;
            if (str == null) {
                str = "";
            }
            jSONObject.put("doc", fp.s0.b(str, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            r0Var.getClass();
            ml2.r0.hj(r0Var, ml2.b4.R, jSONObject2, 0L, null, null, null, null, null, 252, null);
        }
        kVar.f526773a.o(false, this.f344935e);
        return jz5.f0.f384359a;
    }
}
