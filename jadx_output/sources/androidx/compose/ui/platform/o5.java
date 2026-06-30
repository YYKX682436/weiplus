package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class o5 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.WrappedComposition f10677d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f10678e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(androidx.compose.ui.platform.WrappedComposition wrappedComposition, yz5.p pVar) {
        super(2);
        this.f10677d = wrappedComposition;
        this.f10678e = pVar;
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
        androidx.compose.ui.platform.WrappedComposition wrappedComposition = this.f10677d;
        java.lang.Object tag = wrappedComposition.f10496d.getTag(com.tencent.mm.R.id.hdy);
        java.util.Set set = kotlin.jvm.internal.m0.i(tag) ? (java.util.Set) tag : null;
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = wrappedComposition.f10496d;
        if (set == null) {
            java.lang.Object parent = androidComposeView.getParent();
            android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
            java.lang.Object tag2 = view != null ? view.getTag(com.tencent.mm.R.id.hdy) : null;
            set = kotlin.jvm.internal.m0.i(tag2) ? (java.util.Set) tag2 : null;
        }
        if (set != null) {
            n0.y0 y0Var2 = (n0.y0) oVar;
            set.add(y0Var2.f333763d);
            y0Var2.f333776q = true;
        }
        n0.d2.f(androidComposeView, new androidx.compose.ui.platform.l5(wrappedComposition, null), oVar, 8);
        n0.d2.f(androidComposeView, new androidx.compose.ui.platform.m5(wrappedComposition, null), oVar, 8);
        n0.n1.a(new n0.i3[]{y0.d.f458489a.b(set)}, u0.j.b(oVar, -1193460702, true, new androidx.compose.ui.platform.n5(wrappedComposition, this.f10678e)), oVar, 56);
        return jz5.f0.f302826a;
    }
}
