package ch5;

/* loaded from: classes14.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen f41574d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen mPWebSearchHomeHalfScreen) {
        super(0);
        this.f41574d = mPWebSearchHomeHalfScreen;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int c17;
        int i17 = com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen.Z;
        android.content.Context context = this.f41574d.getContext();
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        if (com.tencent.mm.ui.b4.c(context)) {
            kotlin.jvm.internal.o.d(context);
            c17 = com.tencent.mm.ui.cl.c(context);
        } else {
            c17 = com.tencent.mm.ui.bl.c(context);
        }
        return java.lang.Float.valueOf(((int) ((r0.w0() - c17) * r0.S)) / r0.w0());
    }
}
