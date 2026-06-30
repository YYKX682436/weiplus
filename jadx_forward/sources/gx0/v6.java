package gx0;

/* loaded from: classes5.dex */
public final class v6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f358594e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f358595f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(gx0.w8 w8Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358594e = w8Var;
        this.f358595f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.v6(this.f358594e, this.f358595f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.v6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f358593d;
        gx0.w8 w8Var = this.f358594e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            w8Var.getClass();
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(this.f358595f));
            if (r6Var.m()) {
                r6Var.l();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MovieComp.MainComposingUIC", "reportMaasExportCanceled");
            w8Var.L("MCExport", "MJMovieComposing", "", 1);
            w8Var.L("CompressVideo", "", "", 1);
            w8Var.G7();
            jx0.k kVar = w8Var.V.f367148b;
            if (kVar.isShowing()) {
                kVar.dismiss();
            }
            w8Var.J7(gx0.y4.f358735f);
            this.f358593d = 1;
            if (w8Var.I7(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                hx0.e eVar = w8Var.V;
                eVar.getClass();
                eVar.a(hx0.c.f367143m);
                hx0.f.b(w8Var);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        gx0.u6 u6Var = new gx0.u6(w8Var, null);
        this.f358593d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, u6Var, this) == aVar) {
            return aVar;
        }
        hx0.e eVar2 = w8Var.V;
        eVar2.getClass();
        eVar2.a(hx0.c.f367143m);
        hx0.f.b(w8Var);
        return jz5.f0.f384359a;
    }
}
