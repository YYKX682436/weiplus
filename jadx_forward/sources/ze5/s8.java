package ze5;

/* loaded from: classes9.dex */
public final class s8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.w8 f553725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553726e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rd5.d f553727f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(ze5.w8 w8Var, yb5.d dVar, rd5.d dVar2) {
        super(1);
        this.f553725d = w8Var;
        this.f553726e = dVar;
        this.f553727f = dVar2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.widget.LinearLayout linearLayout;
        android.widget.FrameLayout frameLayout;
        ze5.n8 it = (ze5.n8) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.widget.LinearLayout linearLayout2 = it.f553646e;
        ze5.w8 w8Var = this.f553725d;
        if (linearLayout2 != null) {
            ze5.y8.b(w8Var.f0(it), linearLayout2, this.f553726e, this.f553727f, it);
        }
        if (w8Var.M() && (linearLayout = it.f553646e) != null && (frameLayout = it.f553643b) != null) {
            java.lang.Object parent = linearLayout.getParent();
            android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
            if (view != null) {
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                if (!n3.x0.c(view) || view.isLayoutRequested()) {
                    view.addOnLayoutChangeListener(new ze5.v8(linearLayout, frameLayout));
                } else {
                    int width = linearLayout.getWidth();
                    int width2 = frameLayout.getWidth();
                    if (width > 0 && width2 > 0) {
                        android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = layoutParams instanceof p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams ? (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams : null;
                        if (layoutParams2 != null) {
                            float f17 = width < width2 ? 0.0f : 1.0f;
                            if (!(layoutParams2.f92448z == f17)) {
                                layoutParams2.f92448z = f17;
                                linearLayout.setLayoutParams(layoutParams2);
                            }
                        }
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
