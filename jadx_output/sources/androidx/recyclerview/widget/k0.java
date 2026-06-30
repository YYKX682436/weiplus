package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class k0 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.n0 f12107d;

    public k0(androidx.recyclerview.widget.n0 n0Var) {
        this.f12107d = n0Var;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        androidx.recyclerview.widget.n0 n0Var = this.f12107d;
        int computeVerticalScrollRange = n0Var.f12164y.computeVerticalScrollRange();
        int i19 = n0Var.f12163x;
        int i27 = computeVerticalScrollRange - i19;
        int i28 = n0Var.f12146d;
        n0Var.f12165z = i27 > 0 && i19 >= i28;
        int computeHorizontalScrollRange = n0Var.f12164y.computeHorizontalScrollRange();
        int i29 = n0Var.f12162w;
        boolean z17 = computeHorizontalScrollRange - i29 > 0 && i29 >= i28;
        n0Var.A = z17;
        boolean z18 = n0Var.f12165z;
        if (!z18 && !z17) {
            if (n0Var.B != 0) {
                n0Var.f(0);
                return;
            }
            return;
        }
        if (z18) {
            float f17 = i19;
            n0Var.f12157r = (int) ((f17 * (computeVerticalScrollOffset + (f17 / 2.0f))) / computeVerticalScrollRange);
            n0Var.f12156q = java.lang.Math.min(i19, (i19 * i19) / computeVerticalScrollRange);
        }
        if (n0Var.A) {
            float f18 = computeHorizontalScrollOffset;
            float f19 = i29;
            n0Var.f12160u = (int) ((f19 * (f18 + (f19 / 2.0f))) / computeHorizontalScrollRange);
            n0Var.f12159t = java.lang.Math.min(i29, (i29 * i29) / computeHorizontalScrollRange);
        }
        int i37 = n0Var.B;
        if (i37 == 0 || i37 == 1) {
            n0Var.f(1);
        }
    }
}
