package x40;

/* loaded from: classes9.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f533287d;

    /* renamed from: e, reason: collision with root package name */
    public int f533288e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x40.h f533289f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f533290g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f533291h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ byte[] f533292i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(x40.h hVar, java.util.Map map, android.content.Context context, byte[] bArr, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f533289f = hVar;
        this.f533290g = map;
        this.f533291h = context;
        this.f533292i = bArr;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new x40.e(this.f533289f, this.f533290g, this.f533291h, this.f533292i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((x40.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        x40.h hVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f533288e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.util.Map map = this.f533290g;
            byte[] bArr = this.f533292i;
            if (bArr != null) {
                map.put("insertedBufferFromAudioMixFeedItem", bArr);
            }
            hVar = this.f533289f;
            this.f533287d = hVar;
            this.f533288e = 1;
            obj = x40.h.a(hVar, "main_feed", map, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            hVar = (x40.h) this.f533287d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        this.f533287d = null;
        this.f533288e = 2;
        if (x40.h.b(hVar, (pi0.l1) obj, this.f533291h, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
