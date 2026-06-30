package mx0;

/* loaded from: classes5.dex */
public final class w4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f413950e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413949d = c10977x8e40eced;
        this.f413950e = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.w4(this.f413949d, this.f413950e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        mx0.w4 w4Var = (mx0.w4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        w4Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = this.f413949d;
        c10977x8e40eced.z0();
        vt3.l lVar = vt3.l.f521538a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AssetInfoStatistics", "removeAllMedia");
        lVar.c(new vt3.g(2));
        if (this.f413950e) {
            if (c10977x8e40eced.U1 == mx0.r3.f413816e) {
                by0.c cVar = by0.c.f117856a;
                android.content.Context context = c10977x8e40eced.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                if (cVar.a(context) != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingPluginLayout", "exitImportPreview: back to album");
                    c10977x8e40eced.O0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.e0.f33720x366c91de);
                }
            }
            c10977x8e40eced.g1(false, true);
        } else {
            db5.t7.i(c10977x8e40eced.getContext(), j65.q.b(c10977x8e40eced.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.m27), 0);
        }
        return jz5.f0.f384359a;
    }
}
