package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.AndroidComposeView f10760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.n1 f10761e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f10762f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10763g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(androidx.compose.ui.platform.AndroidComposeView androidComposeView, androidx.compose.ui.platform.n1 n1Var, yz5.p pVar, int i17) {
        super(2);
        this.f10760d = androidComposeView;
        this.f10761e = n1Var;
        this.f10762f = pVar;
        this.f10763g = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        int i17 = ((this.f10763g << 3) & ce1.h.CTRL_INDEX) | 72;
        androidx.compose.ui.platform.m2.a(this.f10760d, this.f10761e, this.f10762f, oVar, i17);
        return jz5.f0.f302826a;
    }
}
