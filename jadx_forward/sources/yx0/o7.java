package yx0;

/* loaded from: classes5.dex */
public final class o7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f549049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f549050e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pp0.p0 f549051f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f549052g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f549053h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f549054i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f549055m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.g f549056n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f549057o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ bs0.h f549058p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f549059q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f549060r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.util.List f549061s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(yx0.b8 b8Var, pp0.p0 p0Var, java.lang.String str, long j17, int i17, long j18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i18, bs0.h hVar, boolean z17, boolean z18, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549050e = b8Var;
        this.f549051f = p0Var;
        this.f549052g = str;
        this.f549053h = j17;
        this.f549054i = i17;
        this.f549055m = j18;
        this.f549056n = gVar;
        this.f549057o = i18;
        this.f549058p = hVar;
        this.f549059q = z17;
        this.f549060r = z18;
        this.f549061s = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.o7(this.f549050e, this.f549051f, this.f549052g, this.f549053h, this.f549054i, this.f549055m, this.f549056n, this.f549057o, this.f549058p, this.f549059q, this.f549060r, this.f549061s, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.o7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f549049d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            yx0.b8 b8Var = this.f549050e;
            pp0.p0 p0Var = this.f549051f;
            java.lang.String str = this.f549052g;
            long j17 = this.f549053h;
            int i18 = this.f549054i;
            long j18 = this.f549055m;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f549056n;
            int i19 = this.f549057o;
            bs0.h hVar = this.f549058p;
            boolean z17 = this.f549059q;
            boolean z18 = this.f549060r;
            java.util.List list = this.f549061s;
            this.f549049d = 1;
            if (yx0.b8.e(b8Var, p0Var, str, j17, i18, j18, gVar, i19, hVar, z17, z18, list, this) == aVar) {
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
