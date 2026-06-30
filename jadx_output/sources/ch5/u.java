package ch5;

/* loaded from: classes14.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen f41625d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen circleToSearchHalfScreen) {
        super(0);
        this.f41625d = circleToSearchHalfScreen;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f41625d.getIntent().getIntExtra("key_halfscreen_id", 0));
    }
}
