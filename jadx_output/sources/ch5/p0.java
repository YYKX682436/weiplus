package ch5;

/* loaded from: classes14.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen f41616d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen mPWebSearchHomeHalfScreen) {
        super(0);
        this.f41616d = mPWebSearchHomeHalfScreen;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f41616d.getIntent().getBooleanExtra("INTENT_KEY_HALFSCREEN_TRANSPARENT_MASK", false));
    }
}
