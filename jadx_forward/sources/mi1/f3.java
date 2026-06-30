package mi1;

/* loaded from: classes7.dex */
public abstract class f3 {
    public static final void a(android.view.View view, android.content.Context context, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WAGameCapsuleBarStyleApplier", "setupCapsuleContainerMarginForGame, this:" + view.getClass().getSimpleName() + ", context:" + context.getClass().getSimpleName() + ", density:" + context.getResources().getDisplayMetrics().density);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561582ml);
            marginLayoutParams.height = context.getResources().getDimensionPixelSize(z17 ? com.p314xaae8f345.mm.R.C30860x5b28f31.ank : com.p314xaae8f345.mm.R.C30860x5b28f31.f561154aw);
            view.requestLayout();
        }
    }

    public static final void b(android.view.View view, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        a(view, context, z17);
    }

    public static final void c(android.view.View view, android.content.Context context, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WAGameCapsuleBarStyleApplier", "setupCapsuleMarginsForGame, this:" + view.getClass().getSimpleName() + ", context:" + context.getClass().getSimpleName() + ", density:" + context.getResources().getDisplayMetrics().density);
        if (view instanceof mi1.i) {
            view = ((mi1.i) view).m147347xbe6f1d74();
        } else if (!(view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6.C12501xc5d62fec)) {
            throw new java.lang.IllegalStateException("Unrecognized View class".toString());
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            if (z17) {
                marginLayoutParams.rightMargin = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561554lu);
            } else {
                marginLayoutParams.rightMargin = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561552ls) + context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561581mk);
            }
            view.requestLayout();
        }
    }
}
