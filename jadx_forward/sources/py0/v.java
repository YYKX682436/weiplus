package py0;

/* loaded from: classes5.dex */
public final class v extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f440552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f440553e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ py0.y f440554f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, py0.y yVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f440553e = c0Var;
        this.f440554f = yVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        py0.v vVar = new py0.v(this.f440553e, this.f440554f, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        vVar.f440552d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f384359a;
        vVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.Throwable th6 = (java.lang.Throwable) this.f440552d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasBaseUILogicUIC", "change on completion");
        this.f440553e.f391645d = th6 == null;
        this.f440554f.P6().dismiss();
        return jz5.f0.f384359a;
    }
}
