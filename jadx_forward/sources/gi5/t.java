package gi5;

/* loaded from: classes12.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f353859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tt.h f353860e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353861f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353862g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gi5.v f353863h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353864i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ai5.c f353865m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ gg3.c f353866n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(tt.h hVar, java.lang.String str, java.lang.String str2, gi5.v vVar, java.lang.String str3, ai5.c cVar, gg3.c cVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f353860e = hVar;
        this.f353861f = str;
        this.f353862g = str2;
        this.f353863h = vVar;
        this.f353864i = str3;
        this.f353865m = cVar;
        this.f353866n = cVar2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gi5.t(this.f353860e, this.f353861f, this.f353862g, this.f353863h, this.f353864i, this.f353865m, this.f353866n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gi5.t) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f353859d;
        tt.h hVar = this.f353860e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            pt.k0 k0Var = (pt.k0) i95.n0.c(pt.k0.class);
            this.f353859d = 1;
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
        java.lang.String str = this.f353861f;
        if (gVar == gVar2) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("download video success, result: ");
            sb6.append(gVar);
            sb6.append(" mediaId: ");
            sb6.append(str);
            sb6.append(" length: ");
            java.lang.String str2 = this.f353862g;
            sb6.append(com.p314xaae8f345.mm.vfs.w6.k(str2));
            sb6.append(" path: ");
            sb6.append(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.RecordVideoStateManager", sb6.toString());
            if (hVar.f503301e != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.RecordVideoStateManager", "video download check duplicate file. mediaId: " + str + " checkDupRsp: " + ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).Zi(str2, 19, null, null).f559224a);
            }
            ((java.util.HashSet) ((jz5.n) this.f353863h.f353871g).mo141623x754a37bb()).remove(this.f353864i);
            jg3.b.X6(this.f353863h, this.f353865m, gg3.d.f353266e, this.f353866n, null, 4, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.RecordVideoStateManager", "download video failed, result: " + gVar + " mediaId:  " + str + " ret:" + iVar.f503307b);
            jg3.b.X6(this.f353863h, this.f353865m, gg3.d.f353267f, this.f353866n, null, 4, null);
        }
        return jz5.f0.f384359a;
    }
}
