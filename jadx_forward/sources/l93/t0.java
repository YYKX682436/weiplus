package l93;

/* loaded from: classes5.dex */
public final class t0 implements ah5.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a f398840a;

    public t0(com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar) {
        this.f398840a = aVar;
    }

    @Override // ah5.a
    public void a() {
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f398840a;
        if (aVar != null) {
            aVar.c(true, false, 0);
        }
    }

    @Override // ah5.a
    public void b(int i17, int i18) {
        if (i17 > i18) {
            return;
        }
        float f17 = 1 - ((i17 * 1.0f) / i18);
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f398840a;
        if (aVar != null) {
            aVar.a(f17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderWeComHalfDrawListener", "onHeightChanged " + i17 + " percent：" + f17);
    }

    @Override // ah5.a
    public void c() {
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f398840a;
        if (aVar != null) {
            aVar.c(false, true, 0);
        }
    }

    @Override // ah5.a
    public void d() {
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f398840a;
        if (aVar != null) {
            aVar.c(false, false, 0);
        }
    }

    @Override // ah5.a
    public void e() {
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f398840a;
        if (aVar != null) {
            aVar.c(true, true, 0);
        }
    }
}
