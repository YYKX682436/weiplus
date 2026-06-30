package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class n5 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.WrappedComposition f10668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f10669e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(androidx.compose.ui.platform.WrappedComposition wrappedComposition, yz5.p pVar) {
        super(2);
        this.f10668d = wrappedComposition;
        this.f10669e = pVar;
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
        androidx.compose.ui.platform.a1.a(this.f10668d.f10496d, this.f10669e, oVar, 8);
        return jz5.f0.f302826a;
    }
}
