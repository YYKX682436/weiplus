package mx0;

/* loaded from: classes5.dex */
public final class d6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413451d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413451d = c10977x8e40eced;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.d6(this.f413451d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.d6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        hu3.q0 m47305xbf78a9ee;
        hu3.q0 m47305xbf78a9ee2;
        hu3.q0 m47305xbf78a9ee3;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = this.f413451d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c10977x8e40eced, "<this>");
        by0.c cVar = by0.c.f117856a;
        android.content.Context context = c10977x8e40eced.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.app.Activity a17 = cVar.a(context);
        if (a17 == null) {
            return null;
        }
        if (!a17.isFinishing() && !a17.isDestroyed()) {
            m47305xbf78a9ee = c10977x8e40eced.m47305xbf78a9ee();
            if (!m47305xbf78a9ee.isShowing()) {
                m47305xbf78a9ee3 = c10977x8e40eced.m47305xbf78a9ee();
                m47305xbf78a9ee3.show();
            }
            m47305xbf78a9ee2 = c10977x8e40eced.m47305xbf78a9ee();
            m47305xbf78a9ee2.b(null);
        }
        return jz5.f0.f384359a;
    }
}
