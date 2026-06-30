package qv4;

/* loaded from: classes5.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qv4.k0 f448500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f448501e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(qv4.k0 k0Var, boolean z17) {
        super(0);
        this.f448500d = k0Var;
        this.f448501e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view;
        java.lang.Float f17;
        int floatValue;
        qv4.k0 k0Var = this.f448500d;
        java.util.List j17 = k0Var.j();
        java.util.Iterator it = j17.iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            view = k0Var.f448520d;
            if (!hasNext) {
                i17 = -1;
                break;
            }
            if (((android.view.View) it.next()).getLeft() > view.getWidth()) {
                break;
            }
            i17++;
        }
        int size = j17.size();
        if (i17 >= (size <= 1 ? size : 1)) {
            android.view.View view2 = (android.view.View) j17.get(i17);
            int i18 = i17 - 1;
            android.view.View view3 = (android.view.View) j17.get(i18);
            int width = view.getWidth() - view3.getLeft();
            int right = view3.getRight() - view.getWidth();
            if (width < k0Var.l() || right < k0Var.l()) {
                float left = ((view2.getLeft() + k0Var.l()) - view.getWidth()) / i17;
                float f18 = k0Var.f448522f;
                if (f18 - left < 0.0f) {
                    float right2 = f18 - (((view3.getRight() - k0Var.l()) - view.getWidth()) / i18);
                    f17 = java.lang.Float.valueOf(right2 >= 0.0f ? right2 : 0.0f);
                    if (f17 != null && (floatValue = (int) f17.floatValue()) != k0Var.f448523g) {
                        k0Var.f448523g = floatValue;
                        k0Var.o(this.f448501e);
                    }
                    k0Var.n().setOnScrollChangeListener(new qv4.d0(k0Var));
                    return jz5.f0.f384359a;
                }
            }
        }
        f17 = null;
        if (f17 != null) {
            k0Var.f448523g = floatValue;
            k0Var.o(this.f448501e);
        }
        k0Var.n().setOnScrollChangeListener(new qv4.d0(k0Var));
        return jz5.f0.f384359a;
    }
}
