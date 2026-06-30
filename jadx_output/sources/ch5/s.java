package ch5;

/* loaded from: classes14.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen f41621d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen circleToSearchHalfScreen) {
        super(0);
        this.f41621d = circleToSearchHalfScreen;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f41621d.getIntent().getBooleanExtra("INTENT_KEY_HALFSCREEN_ENABLE_DRAG", false));
    }
}
