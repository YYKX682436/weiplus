package hq0;

/* loaded from: classes7.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f364583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hq0.b0 f364584e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364585f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364586g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364587h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364588i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ iq0.e f364589m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(hq0.b0 b0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, iq0.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f364584e = b0Var;
        this.f364585f = str;
        this.f364586g = str2;
        this.f364587h = str3;
        this.f364588i = str4;
        this.f364589m = eVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hq0.r(this.f364584e, this.f364585f, this.f364586g, this.f364587h, this.f364588i, this.f364589m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hq0.r) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f364583d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f364583d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        hq0.b0 b0Var = this.f364584e;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = b0Var.F;
        java.lang.String str = this.f364585f;
        if (concurrentHashMap.containsKey(str)) {
            b0Var.F.remove(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(b0Var.f364504y, "innerGenerateCover preload, bindFrameSetView timeout, : " + this.f364586g);
            ((mq0.v0) ((mq0.e0) i95.n0.c(mq0.e0.class))).wi("preloadCover", "endForce", this.f364587h, this.f364588i, this.f364589m.f375190a, this.f364586g, "");
            if (b0Var.F.isEmpty()) {
                if (!b0Var.I || b0Var.f364538t) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var.f364504y, "innerGenerateCover preload all force end, but isOnlyPreload is false");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var.f364504y, "innerGenerateCover preload all force end, auto destroy biz");
                    b0Var.mo123041x5cd39ffa();
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
