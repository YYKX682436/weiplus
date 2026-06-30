package zh5;

/* loaded from: classes12.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f554536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zh5.d f554537e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zh5.l f554538f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f554539g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f554540h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f554541i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ zh5.a f554542m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ sf3.g f554543n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(zh5.d dVar, zh5.l lVar, java.lang.String str, java.lang.String str2, java.lang.String str3, zh5.a aVar, sf3.g gVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f554537e = dVar;
        this.f554538f = lVar;
        this.f554539g = str;
        this.f554540h = str2;
        this.f554541i = str3;
        this.f554542m = aVar;
        this.f554543n = gVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zh5.c(this.f554537e, this.f554538f, this.f554539g, this.f554540h, this.f554541i, this.f554542m, this.f554543n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((zh5.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f554536d;
        zh5.d dVar = this.f554537e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            zh5.k kVar = dVar.f554547g;
            this.f554536d = 1;
            obj = kVar.b(this.f554538f, this);
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
        sf3.g gVar = this.f554543n;
        zh5.a aVar2 = this.f554542m;
        java.lang.String str = this.f554539g;
        if (fVar == fVar2) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("download image success ");
            sb6.append(fVar);
            sb6.append(" mediaId:");
            sb6.append(str);
            sb6.append(" length: ");
            java.lang.String str2 = this.f554540h;
            sb6.append(com.p314xaae8f345.mm.vfs.w6.k(str2));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.CDNImageStateManager", sb6.toString());
            ((java.util.HashSet) ((jz5.n) dVar.f554548h).mo141623x754a37bb()).remove(this.f554541i);
            dVar.W6(aVar2, sf3.k.f488930e, gVar);
            zh5.k0 k0Var = (zh5.k0) dVar.U6(zh5.k0.class);
            e60.t0 t0Var = k0Var != null ? ((zh5.e) k0Var).f554552d : null;
            if (t0Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.CDNImageStateManager", "image download check duplicate file. mediaId: " + str + " checkDupRsp: " + ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).Zi(str2, t0Var.f331268f, null, null).f559224a);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.CDNImageStateManager", "download image failed  " + fVar + " mediaId:" + str);
            dVar.W6(aVar2, sf3.k.f488931f, gVar);
        }
        return jz5.f0.f384359a;
    }
}
