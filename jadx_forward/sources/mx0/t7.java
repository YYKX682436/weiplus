package mx0;

/* loaded from: classes5.dex */
public final class t7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413887e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(java.lang.String str, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413886d = str;
        this.f413887e = c10977x8e40eced;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.t7(this.f413886d, this.f413887e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        mx0.t7 t7Var = (mx0.t7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        t7Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        mx0.ja m47325xd23b40d7;
        xx0.f0 f0Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTemplateDownloadFinished templateId:");
        java.lang.String templateId = this.f413886d;
        sb6.append(templateId);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingPluginLayout", sb6.toString());
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = this.f413887e;
        m47325xd23b40d7 = c10977x8e40eced.m47325xd23b40d7();
        m47325xd23b40d7.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        m47325xd23b40d7.f413613i.L(templateId);
        xx0.n nVar = c10977x8e40eced.K1;
        if (nVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
            xx0.c a17 = nVar.a();
            if (a17 != null && (f0Var = a17.f539397g) != null) {
                java.util.Iterator it = ((java.util.LinkedHashMap) f0Var.f539432h).values().iterator();
                while (it.hasNext()) {
                    xx0.d0 d0Var = ((xx0.e0) it.next()).f539421a;
                    d0Var.getClass();
                    d0Var.f539414i.y(templateId);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
