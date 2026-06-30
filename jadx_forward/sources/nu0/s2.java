package nu0;

/* loaded from: classes5.dex */
public final class s2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f421624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f421625e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f421626f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(nu0.b4 b4Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f421625e = b4Var;
        this.f421626f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nu0.s2(this.f421625e, this.f421626f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((nu0.s2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f421624d;
        nu0.b4 b4Var = this.f421625e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            b4Var.getClass();
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(this.f421626f));
            if (r6Var.m()) {
                r6Var.l();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageComp.MainComposingUIC", "reportMaasExportCanceled");
            b4Var.L("MCExport", "MJImageComposing", "", 1);
            b4Var.L("CompressVideo", "", "", 1);
            jx0.k kVar = b4Var.T.f367148b;
            if (kVar.isShowing()) {
                kVar.dismiss();
            }
            b4Var.z7(nu0.c1.f421429f);
            this.f421624d = 1;
            if (b4Var.y7(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                hx0.e eVar = b4Var.T;
                eVar.getClass();
                eVar.a(hx0.c.f367143m);
                hx0.f.b(b4Var);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        nu0.r2 r2Var = new nu0.r2(b4Var, null);
        this.f421624d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, r2Var, this) == aVar) {
            return aVar;
        }
        hx0.e eVar2 = b4Var.T;
        eVar2.getClass();
        eVar2.a(hx0.c.f367143m);
        hx0.f.b(b4Var);
        return jz5.f0.f384359a;
    }
}
