package by0;

/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final by0.v f117884a = new by0.v();

    public final android.view.View a(android.view.ViewGroup viewGroup, fv0.a operation, int i17, int i18, int i19, yz5.l onOperationClickListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onOperationClickListener, "onOperationClickListener");
        java.lang.String r17 = i65.a.r(viewGroup.getContext(), i17);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331 c0098xfb43a331 = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331(viewGroup.getContext(), null);
        c0098xfb43a331.setTag(operation);
        c0098xfb43a331.m2727x1a6eb00e(1);
        c0098xfb43a331.m2724xc1f6fb8c(17);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams layoutParams = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams(c0098xfb43a331.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj), -2);
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i19;
        c0098xfb43a331.setLayoutParams(layoutParams);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(c0098xfb43a331.getContext());
        c22699x3dcdb352.setTag("icon");
        c22699x3dcdb352.setImageResource(i18);
        c22699x3dcdb352.m82037xa10c26f6(false);
        c22699x3dcdb352.setLayoutParams(new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams(c22699x3dcdb352.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz), c22699x3dcdb352.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz)));
        c22699x3dcdb352.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        c0098xfb43a331.addView(c22699x3dcdb352);
        android.widget.TextView textView = new android.widget.TextView(c0098xfb43a331.getContext());
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams layoutParams2 = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams(-2, -2);
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin = textView.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        textView.setLayoutParams(layoutParams2);
        textView.setText(r17);
        textView.setAlpha(0.5f);
        textView.setTextColor(-1);
        textView.setTextSize(1, 10.0f);
        c0098xfb43a331.addView(textView);
        c0098xfb43a331.setOnClickListener(new by0.u(onOperationClickListener, operation));
        return c0098xfb43a331;
    }

    public final int b(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.g3 a17 = n3.b1.a(view);
        e3.d a18 = a17 != null ? a17.a(2) : null;
        return a18 != null ? a18.f328580d - a18.f328578b : com.p314xaae8f345.mm.ui.bl.c(view.getContext());
    }
}
