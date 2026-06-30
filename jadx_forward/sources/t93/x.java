package t93;

/* loaded from: classes.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f498111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f498112e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f498113f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t93.y f498114g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.content.Context context, org.json.JSONObject jSONObject, t93.y yVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f498112e = context;
        this.f498113f = jSONObject;
        this.f498114g = yVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new t93.x(this.f498112e, this.f498113f, this.f498114g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((t93.x) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f498111d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            android.content.Context context = this.f498112e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
            org.json.JSONObject jSONObject = this.f498113f;
            if (jSONObject == null || (str = jSONObject.toString()) == null) {
                str = "";
            }
            this.f498111d = 1;
            ((c61.l7) b6Var).getClass();
            obj = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a.v(context, str, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(ya.b.f77491x8758c4e1, (java.lang.String) obj);
        this.f498114g.f224976f.b(hashMap);
        return jz5.f0.f384359a;
    }
}
