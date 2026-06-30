package ch5;

/* loaded from: classes14.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen f41641d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen mPWebSearchHomeHalfScreen) {
        super(0);
        this.f41641d = mPWebSearchHomeHalfScreen;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object a17 = ok5.d.a(this.f41641d.getIntent(), "INTENT_KEY_HALFSCREEN_STATUS_LISTENER");
        if (kotlin.jvm.internal.m0.f(a17, 2)) {
            return (yz5.p) a17;
        }
        return null;
    }
}
