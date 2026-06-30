package z35;

/* loaded from: classes10.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f551584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19717xb0837240 f551585e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19717xb0837240 c19717xb0837240, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f551585e = c19717xb0837240;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new z35.y(this.f551585e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((z35.y) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        z35.v videoPlayDurationProvider;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f551584d;
        if (i17 != 0 && i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        do {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19717xb0837240 c19717xb0837240 = this.f551585e;
            if (!c19717xb0837240.f272672u) {
                return jz5.f0.f384359a;
            }
            if (!c19717xb0837240.f272667p && (videoPlayDurationProvider = this.f551585e.getVideoPlayDurationProvider()) != null) {
                zy2.g5 g5Var = ((lo2.b0) videoPlayDurationProvider).f401639a.f202941z;
                long mo56685x3d7f3f1d = g5Var != null ? g5Var.mo56685x3d7f3f1d() : 0L;
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19717xb0837240 c19717xb08372402 = this.f551585e;
                int i18 = c19717xb08372402.f272662h;
                if (i18 <= 0) {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19717xb0837240.e(c19717xb08372402, mo56685x3d7f3f1d);
                } else if (mo56685x3d7f3f1d >= (i18 * c19717xb08372402.f272661g) / 2500) {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19717xb0837240.e(c19717xb08372402, mo56685x3d7f3f1d);
                    c19717xb08372402.f272662h = -1;
                }
            }
            this.f551584d = 1;
        } while (p3325xe03a0797.p3326xc267989b.k1.b(16L, this) != aVar);
        return aVar;
    }
}
