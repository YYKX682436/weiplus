package df2;

/* loaded from: classes3.dex */
public final class na extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f312374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f312375e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.zb f312376f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na(java.lang.String str, java.lang.String str2, df2.zb zbVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312374d = str;
        this.f312375e = str2;
        this.f312376f = zbVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.na(this.f312374d, this.f312375e, this.f312376f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.na naVar = (df2.na) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        naVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        cl0.g gVar = new cl0.g();
        gVar.h("ai_session_id", this.f312374d);
        gVar.h("ai_msg_id", this.f312375e);
        gVar.o("type", 2);
        gVar.o("function_type", 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312376f.f313472m, "[reportAiAssistantOp] js = " + gVar);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.J2, gVar.toString(), null, 4, null);
        return jz5.f0.f384359a;
    }
}
