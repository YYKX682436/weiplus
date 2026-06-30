package x40;

/* loaded from: classes9.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f533273d;

    /* renamed from: e, reason: collision with root package name */
    public int f533274e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x40.h f533275f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f533276g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f533277h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f533278i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ byte[] f533279m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(x40.h hVar, java.util.Map map, android.content.Context context, boolean z17, byte[] bArr, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f533275f = hVar;
        this.f533276g = map;
        this.f533277h = context;
        this.f533278i = z17;
        this.f533279m = bArr;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new x40.c(this.f533275f, this.f533276g, this.f533277h, this.f533278i, this.f533279m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((x40.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        x40.h hVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f533274e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f533278i);
            java.util.Map map = this.f533276g;
            map.put("isAuthor", valueOf);
            byte[] bArr = this.f533279m;
            if (bArr != null) {
                map.put("categoryItem", bArr);
            }
            x40.h hVar2 = this.f533275f;
            this.f533273d = hVar2;
            this.f533274e = 1;
            java.lang.Object a17 = x40.h.a(hVar2, "audio_collection", map, this);
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
            hVar = (x40.h) this.f533273d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        this.f533273d = null;
        this.f533274e = 2;
        if (x40.h.b(hVar, (pi0.l1) obj, this.f533277h, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
