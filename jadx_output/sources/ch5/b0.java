package ch5;

/* loaded from: classes14.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen f41538d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen circleToSearchHalfScreen) {
        super(0);
        this.f41538d = circleToSearchHalfScreen;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object a17 = ok5.d.a(this.f41538d.getIntent(), "INTENT_KEY_HALFSCREEN_VISIBLE_LISTENER");
        if (kotlin.jvm.internal.m0.f(a17, 1)) {
            return (yz5.l) a17;
        }
        return null;
    }
}
