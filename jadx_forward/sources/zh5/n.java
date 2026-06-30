package zh5;

/* loaded from: classes12.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f554579d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zh5.p f554580e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zh5.l f554581f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f554582g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f554583h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f554584i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ zh5.x f554585m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ gg3.c f554586n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(zh5.p pVar, zh5.l lVar, java.lang.String str, java.lang.String str2, java.lang.String str3, zh5.x xVar, gg3.c cVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f554580e = pVar;
        this.f554581f = lVar;
        this.f554582g = str;
        this.f554583h = str2;
        this.f554584i = str3;
        this.f554585m = xVar;
        this.f554586n = cVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zh5.n(this.f554580e, this.f554581f, this.f554582g, this.f554583h, this.f554584i, this.f554585m, this.f554586n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((zh5.n) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f554579d;
        zh5.p pVar = this.f554580e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            zh5.k kVar = pVar.f554590f;
            this.f554579d = 1;
            obj = kVar.b(this.f554581f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        zh5.f fVar = (zh5.f) obj;
        zh5.f fVar2 = zh5.f.f554554d;
        java.lang.String str = this.f554582g;
        if (fVar == fVar2) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("download video success, result: ");
            sb6.append(fVar);
            sb6.append(" mediaId: ");
            sb6.append(str);
            sb6.append(" length: ");
            java.lang.String str2 = this.f554583h;
            sb6.append(com.p314xaae8f345.mm.vfs.w6.k(str2));
            sb6.append(" path: ");
            sb6.append(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.CDNVideoStateManager", sb6.toString());
            zh5.k0 k0Var = (zh5.k0) pVar.U6(zh5.k0.class);
            e60.t0 t0Var = k0Var != null ? ((zh5.e) k0Var).f554552d : null;
            if (t0Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.CDNVideoStateManager", "video download check duplicate file. mediaId: " + str + " checkDupRsp: " + ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).Zi(str2, t0Var.f331268f, null, null).f559224a);
            }
            ((java.util.HashSet) ((jz5.n) pVar.f554592h).mo141623x754a37bb()).remove(this.f554584i);
            jg3.b.X6(this.f554580e, this.f554585m, gg3.d.f353266e, this.f554586n, null, 4, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.CDNVideoStateManager", "download video failed, result: " + fVar + " mediaId:  " + str + " ret:" + fVar);
            jg3.b.X6(this.f554580e, this.f554585m, gg3.d.f353267f, this.f554586n, null, 4, null);
        }
        return jz5.f0.f384359a;
    }
}
