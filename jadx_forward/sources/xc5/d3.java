package xc5;

/* loaded from: classes12.dex */
public final class d3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f534952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xf0.i f534953e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xc5.e3 f534954f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f534955g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mf3.k f534956h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ gg3.c f534957i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f534958m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(xf0.i iVar, xc5.e3 e3Var, java.lang.String str, mf3.k kVar, gg3.c cVar, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f534953e = iVar;
        this.f534954f = e3Var;
        this.f534955g = str;
        this.f534956h = kVar;
        this.f534957i = cVar;
        this.f534958m = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xc5.d3(this.f534953e, this.f534954f, this.f534955g, this.f534956h, this.f534957i, this.f534958m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xc5.d3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        xf0.j jVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f534952d;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                xf0.s a17 = xf0.s.f535749f.a();
                xf0.i iVar = this.f534953e;
                this.f534952d = 1;
                obj = a17.T6(iVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            jVar = (xf0.j) obj;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryVideoStateManager", "downloadMsgVideo exception: " + e17.getMessage());
            jVar = null;
        }
        xc5.e3 e3Var = this.f534954f;
        java.util.HashSet Z6 = e3Var.Z6();
        java.lang.String str = this.f534955g;
        Z6.remove(str);
        if ((jVar != null ? jVar.f535725a : null) == xf0.k.f535727d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryVideoStateManager", "download video success. mediaId: " + str);
            e3Var.Y6(this.f534956h, this.f534957i, this.f534958m);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryVideoStateManager", "download video failed. mediaId: " + str + ", result: " + jVar);
            e3Var.f534973h.remove(str);
            jg3.b.X6(this.f534954f, this.f534956h, gg3.d.f353267f, this.f534957i, null, 4, null);
        }
        return jz5.f0.f384359a;
    }
}
