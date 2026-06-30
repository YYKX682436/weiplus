package ms5;

/* loaded from: classes10.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f412688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412689e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f412690f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String str, org.json.JSONArray jSONArray, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f412689e = str;
        this.f412690f = jSONArray;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ms5.e eVar = new ms5.e(this.f412689e, this.f412690f, interfaceC29045xdcb5ca57);
        eVar.f412688d = obj;
        return eVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ms5.e eVar = (ms5.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        eVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f412688d;
        java.util.Iterator it = ms5.f.f412693c.entrySet().iterator();
        while (it.hasNext()) {
            p3325xe03a0797.p3326xc267989b.l.b(y0Var, null, null, new ms5.d((java.util.Map.Entry) it.next(), this.f412689e, this.f412690f, null), 3, null);
        }
        return jz5.f0.f384359a;
    }
}
