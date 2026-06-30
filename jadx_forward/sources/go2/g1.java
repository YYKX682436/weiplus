package go2;

/* loaded from: classes2.dex */
public final class g1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1564x2dd08d.uic.C14455xccd2070 f355513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f355514e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1564x2dd08d.uic.C14455xccd2070 c14455xccd2070, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        super(0);
        this.f355513d = c14455xccd2070;
        this.f355514e = componentCallbacksC1101xa17d4670;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.wl wlVar;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1564x2dd08d.uic.C14455xccd2070 c14455xccd2070 = this.f355513d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = c14455xccd2070.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.wl wlVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.wl((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085, 2, 204, false, c14455xccd2070.f202650d, c14455xccd2070.f202651e, c14455xccd2070.f202653g, c14455xccd2070.f202652f, c14455xccd2070.f202654h, 0, 0, c14455xccd2070.f202655i, 8, null);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f355514e;
        android.view.View m7474xfb86a31b = componentCallbacksC1101xa17d4670.m7474xfb86a31b();
        if (m7474xfb86a31b == null || (c22801x87cbdc00 = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) m7474xfb86a31b.findViewById(com.p314xaae8f345.mm.R.id.m6e)) == null) {
            wlVar = wlVar2;
        } else {
            wlVar = wlVar2;
            wlVar.f187713m = c22801x87cbdc00;
            c22801x87cbdc00.m82565x6107557d(true);
        }
        android.view.View m7474xfb86a31b2 = componentCallbacksC1101xa17d4670.m7474xfb86a31b();
        wlVar.C = m7474xfb86a31b2 != null ? m7474xfb86a31b2.findViewById(com.p314xaae8f345.mm.R.id.f565762dg3) : null;
        return wlVar;
    }
}
