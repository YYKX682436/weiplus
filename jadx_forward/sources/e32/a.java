package e32;

/* loaded from: classes10.dex */
public final class a extends p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1
    public int h(android.view.View view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93584c;
        if (layoutManager == null || !layoutManager.mo2416xc6ea780e()) {
            return 0;
        }
        return (layoutManager.m8037x755bd410() / 2) - ((view.getLeft() + view.getRight()) / 2);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1
    public int i(android.view.View view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93584c;
        if (layoutManager == null || !layoutManager.getF204840r()) {
            return 0;
        }
        return (layoutManager.m8018x1c4fb41d() / 2) - ((view.getTop() + view.getBottom()) / 2);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayMetrics, "displayMetrics");
        return 50.0f / displayMetrics.densityDpi;
    }
}
