package x40;

/* loaded from: classes9.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f533293d;

    /* renamed from: e, reason: collision with root package name */
    public int f533294e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x40.h f533295f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f533296g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(x40.h hVar, android.content.Context context, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f533295f = hVar;
        this.f533296g = context;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new x40.f(this.f533295f, this.f533296g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((x40.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        x40.h hVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f533294e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            hVar = this.f533295f;
            this.f533293d = hVar;
            this.f533294e = 1;
            obj = x40.h.a(hVar, "mine_page", null, this);
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
            hVar = (x40.h) this.f533293d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        this.f533293d = null;
        this.f533294e = 2;
        if (x40.h.b(hVar, (pi0.l1) obj, this.f533296g, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
