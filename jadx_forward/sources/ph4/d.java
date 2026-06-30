package ph4;

/* loaded from: classes8.dex */
public final class d extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 {

    /* renamed from: b2, reason: collision with root package name */
    public int f436003b2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ph4.e eVar, android.content.Context context) {
        super(context, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setClipChildren(false);
        android.view.View rootView = getRootView();
        java.lang.Object parent = getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
        android.view.View view = (android.view.View) parent;
        while (view != rootView && (view instanceof android.view.ViewGroup)) {
            ((android.view.ViewGroup) view).setClipChildren(false);
            if (view instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) {
                return;
            }
            java.lang.Object parent2 = view.getParent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent2, "null cannot be cast to non-null type android.view.View");
            view = (android.view.View) parent2;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (getMeasuredWidth() != this.f436003b2) {
            this.f436003b2 = getMeasuredWidth();
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            while (m7950x883dc776() > 0) {
                T0(0);
            }
            N(new ph4.c(context));
        }
    }
}
