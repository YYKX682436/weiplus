package gi5;

/* loaded from: classes12.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f353844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tt.h f353845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353846f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353847g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gi5.l f353848h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353849i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ai5.c f353850m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ sf3.g f353851n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(tt.h hVar, java.lang.String str, java.lang.String str2, gi5.l lVar, java.lang.String str3, ai5.c cVar, sf3.g gVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f353845e = hVar;
        this.f353846f = str;
        this.f353847g = str2;
        this.f353848h = lVar;
        this.f353849i = str3;
        this.f353850m = cVar;
        this.f353851n = gVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gi5.k(this.f353845e, this.f353846f, this.f353847g, this.f353848h, this.f353849i, this.f353850m, this.f353851n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gi5.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f353844d;
        tt.h hVar = this.f353845e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            pt.k0 k0Var = (pt.k0) i95.n0.c(pt.k0.class);
            this.f353844d = 1;
            ((ot.q) k0Var).getClass();
            obj = tt.f.f503290f.a().T6(hVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        tt.i iVar = (tt.i) obj;
        tt.g gVar = iVar.f503306a;
        tt.g gVar2 = tt.g.f503291d;
        sf3.g gVar3 = this.f353851n;
        ai5.c cVar = this.f353850m;
        gi5.l lVar = this.f353848h;
        java.lang.String str = this.f353846f;
        if (gVar == gVar2) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("download image success ");
            sb6.append(gVar);
            sb6.append(" mediaId:");
            sb6.append(str);
            sb6.append(" length: ");
            java.lang.String str2 = this.f353847g;
            sb6.append(com.p314xaae8f345.mm.vfs.w6.k(str2));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.RecordImageStateManager", sb6.toString());
            ((java.util.HashSet) ((jz5.n) lVar.f353853h).mo141623x754a37bb()).remove(this.f353849i);
            lVar.W6(cVar, sf3.k.f488930e, gVar3);
            if (hVar.f503301e != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.RecordImageStateManager", "image download check duplicate file. mediaId: " + str + " checkDupRsp: " + ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).Zi(str2, 19, null, null).f559224a);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.RecordImageStateManager", "download image failed  " + gVar + " mediaId:" + str + " ret:" + iVar.f503307b);
            lVar.W6(cVar, sf3.k.f488931f, gVar3);
        }
        return jz5.f0.f384359a;
    }
}
