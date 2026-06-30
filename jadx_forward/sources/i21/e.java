package i21;

/* loaded from: classes11.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f369423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f369424e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.c5 f369425f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f369426g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i21.g f369427h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String str, r45.c5 c5Var, int i17, i21.g gVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f369424e = str;
        this.f369425f = c5Var;
        this.f369426g = i17;
        this.f369427h = gVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new i21.e(this.f369424e, this.f369425f, this.f369426g, this.f369427h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((i21.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f369423d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            i21.f fVar = i21.h.f369428a;
            java.lang.String str = this.f369424e;
            r45.c5 c5Var = this.f369425f;
            int i18 = this.f369426g;
            i21.d dVar = new i21.d(this.f369427h, null);
            this.f369423d = 1;
            if (i21.f.a(fVar, str, c5Var, i18, dVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
