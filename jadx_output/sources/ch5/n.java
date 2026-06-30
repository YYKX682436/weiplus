package ch5;

/* loaded from: classes14.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen f41608d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen circleToSearchHalfScreen) {
        super(0);
        this.f41608d = circleToSearchHalfScreen;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen.U;
        com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen circleToSearchHalfScreen = this.f41608d;
        int w07 = circleToSearchHalfScreen.w0();
        android.content.Context context = circleToSearchHalfScreen.getContext();
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        return java.lang.Integer.valueOf(w07 - (com.tencent.mm.ui.bl.c(context) + com.tencent.mm.ui.bl.h(context)));
    }
}
