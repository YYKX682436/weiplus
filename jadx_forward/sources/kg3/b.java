package kg3;

/* loaded from: classes3.dex */
public final class b {
    public final void a(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup == null) {
            return;
        }
        android.content.Context context = viewGroup.getContext();
        int e17 = com.p314xaae8f345.mm.ui.bl.e(context);
        int f17 = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        int f18 = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
        int i17 = (f17 * 2) + e17;
        int i18 = com.p314xaae8f345.mm.ui.bl.i(context, 0);
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-1, -1);
        }
        marginLayoutParams.leftMargin = f18;
        marginLayoutParams.rightMargin = f18;
        marginLayoutParams.topMargin = i18;
        marginLayoutParams.bottomMargin = i17;
        viewGroup.setLayoutParams(marginLayoutParams);
    }

    public final void b(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup == null) {
            return;
        }
        android.content.Context context = viewGroup.getContext();
        com.p314xaae8f345.mm.ui.bl.e(context);
        i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        int f17 = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        int f18 = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
        int f19 = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
        com.p314xaae8f345.mm.ui.bl.i(context, 0);
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-1, -1);
        }
        marginLayoutParams.leftMargin = f18;
        marginLayoutParams.rightMargin = f18;
        marginLayoutParams.topMargin = f19;
        marginLayoutParams.bottomMargin = f17;
        viewGroup.setLayoutParams(marginLayoutParams);
    }
}
