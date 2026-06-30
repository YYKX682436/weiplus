package vv4;

/* loaded from: classes11.dex */
public final class m implements com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75 f522011d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75 activityC19216xc2476b75) {
        this.f522011d = activityC19216xc2476b75;
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void a(float f17) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75.B;
        yv4.k b76 = this.f522011d.b7();
        float f18 = 1 - f17;
        float intValue = ((java.lang.Number) ((jz5.n) b76.f547761d).mo141623x754a37bb()).intValue();
        if (f18 > 0.5f) {
            f18 = 0.5f;
        }
        b76.f547766i = intValue * f18;
        b76.T6(false);
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void b() {
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void c(boolean z17, boolean z18, int i17) {
    }
}
