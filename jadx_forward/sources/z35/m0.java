package z35;

/* loaded from: classes4.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f551556d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 f551557e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab46, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f551557e = c19718xcf23ab46;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new z35.m0(this.f551557e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((z35.m0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        z35.h0 videoPlayDurationProvider;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f551556d;
        if (i17 != 0 && i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        do {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab46 = this.f551557e;
            if (!c19718xcf23ab46.isSeekBarActive) {
                return jz5.f0.f384359a;
            }
            if (!c19718xcf23ab46.getUserTouching() && (videoPlayDurationProvider = c19718xcf23ab46.getVideoPlayDurationProvider()) != null) {
                long a17 = videoPlayDurationProvider.a();
                if (c19718xcf23ab46.getUserSeekProgress() <= 0) {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46.a(c19718xcf23ab46, a17);
                } else if (a17 >= c19718xcf23ab46.c(c19718xcf23ab46.getUserSeekProgress())) {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46.a(c19718xcf23ab46, a17);
                    c19718xcf23ab46.m75690x727fe0b2(-1);
                }
            }
            this.f551556d = 1;
        } while (p3325xe03a0797.p3326xc267989b.k1.b(16L, this) != aVar);
        return aVar;
    }
}
