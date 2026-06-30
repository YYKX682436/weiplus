package x40;

/* loaded from: classes9.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f533280d;

    /* renamed from: e, reason: collision with root package name */
    public int f533281e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x40.h f533282f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f533283g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f533284h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f533285i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ byte[] f533286m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(x40.h hVar, java.util.Map map, android.content.Context context, boolean z17, byte[] bArr, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f533282f = hVar;
        this.f533283g = map;
        this.f533284h = context;
        this.f533285i = z17;
        this.f533286m = bArr;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new x40.d(this.f533282f, this.f533283g, this.f533284h, this.f533285i, this.f533286m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((x40.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        x40.h hVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f533281e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f533285i);
            java.util.Map map = this.f533283g;
            map.put("usePlayingOne", valueOf);
            byte[] bArr = this.f533286m;
            if (bArr != null) {
                map.put("playListInfo", bArr);
            }
            x40.h hVar2 = this.f533282f;
            this.f533280d = hVar2;
            this.f533281e = 1;
            java.lang.Object a17 = x40.h.a(hVar2, "list_repo_feed", map, this);
            if (a17 == aVar) {
                return aVar;
            }
            hVar = hVar2;
            obj = a17;
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            hVar = (x40.h) this.f533280d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        this.f533280d = null;
        this.f533281e = 2;
        if (x40.h.b(hVar, (pi0.l1) obj, this.f533284h, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
