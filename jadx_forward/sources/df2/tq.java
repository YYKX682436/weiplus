package df2;

/* loaded from: classes.dex */
public final class tq extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ar f312999d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq(df2.ar arVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312999d = arVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.tq(this.f312999d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.tq tqVar = (df2.tq) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        tqVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.content.Context context;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f312999d.S6(com.p314xaae8f345.mm.R.id.tiq);
        if (viewGroup != null && (context = viewGroup.getContext()) != null) {
            db5.t7.m123882x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.f573087nq1, 0).show();
        }
        return jz5.f0.f384359a;
    }
}
