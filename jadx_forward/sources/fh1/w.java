package fh1;

/* loaded from: classes7.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f344143d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fh1.z f344144e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fh1.x0 f344145f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344146g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344147h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f344148i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(fh1.z zVar, fh1.x0 x0Var, java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f344144e = zVar;
        this.f344145f = x0Var;
        this.f344146g = str;
        this.f344147h = str2;
        this.f344148i = jSONObject;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fh1.w(this.f344144e, this.f344145f, this.f344146g, this.f344147h, this.f344148i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fh1.w) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f344143d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f344143d = 1;
            obj = this.f344144e.b(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!booleanValue) {
            return f0Var;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("appId", this.f344146g);
        jSONObject.put("envVersion", this.f344147h);
        org.json.JSONObject jSONObject2 = this.f344148i;
        if (jSONObject2 == null) {
            jSONObject2 = new org.json.JSONObject();
        }
        jSONObject.put("config", jSONObject2);
        java.lang.String jSONObject3 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
        this.f344145f.G1("onWxConfigReady", jSONObject3);
        return f0Var;
    }
}
