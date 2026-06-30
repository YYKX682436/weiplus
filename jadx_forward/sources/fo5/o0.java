package fo5;

/* loaded from: classes14.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fo5.r0 f346571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f346572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ er4.r f346573f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f346574g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f346575h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346576i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f346577m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f346578n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(fo5.r0 r0Var, int i17, er4.r rVar, long j17, int i18, java.lang.String str, java.util.ArrayList arrayList, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f346571d = r0Var;
        this.f346572e = i17;
        this.f346573f = rVar;
        this.f346574g = j17;
        this.f346575h = i18;
        this.f346576i = str;
        this.f346577m = arrayList;
        this.f346578n = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fo5.o0(this.f346571d, this.f346572e, this.f346573f, this.f346574g, this.f346575h, this.f346576i, this.f346577m, this.f346578n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        fo5.o0 o0Var = (fo5.o0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        o0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        fo5.r0 r0Var = this.f346571d;
        lo5.h hVar = r0Var.f346628n;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        long j17 = this.f346574g;
        int i17 = this.f346575h;
        hVar.getClass();
        er4.r roomType = this.f346573f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomType, "roomType");
        java.lang.String toUser = this.f346576i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        lo5.m mVar = hVar.f401749c;
        mVar.getClass();
        mVar.f382756x = false;
        boolean z17 = this.f346578n;
        mVar.f382782r = z17 ? 3 : 1;
        mVar.H = roomType;
        mVar.f382758z = roomType == er4.r.MP_ROOM_TYPE_VIDEO;
        mVar.D = this.f346572e;
        mVar.A = roomType == er4.r.MP_ROOM_TYPE_TRANS_MUTLTI || roomType == er4.r.MP_ROOM_TYPE_MULTI_TALK;
        mVar.G = this.f346577m;
        mVar.x(context, new android.content.Intent(), j17, i17, mVar.f382758z, toUser, false, mVar.f382782r);
        if (!z17) {
            ((jp5.o) i95.n0.c(jp5.o.class)).Gi(toUser, mVar.f382758z);
        }
        jz5.g gVar = co5.v.f125420j;
        ((co5.v) ((jz5.n) co5.v.f125420j).mo141623x754a37bb()).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.vqm.a aVar2 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.a.f258826b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(aVar2, "getInstance(...)");
        aVar2.e(com.p314xaae8f345.mm.p1006xc5476f33.vqm.d.DidAppearFloatingBannerInApp, new com.p314xaae8f345.mm.p1006xc5476f33.vqm.c().m75963xebb06ba0());
        r0Var.f346628n.f401747a = new fo5.l0(r0Var, z17);
        return jz5.f0.f384359a;
    }
}
