package ut2;

/* loaded from: classes3.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f512525a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f512526b;

    /* renamed from: c, reason: collision with root package name */
    public final gk2.e f512527c;

    /* renamed from: d, reason: collision with root package name */
    public ut2.q0 f512528d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.HorizontalScrollView f512529e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f512530f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f512531g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f512532h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.LinearLayout f512533i;

    public m0(android.view.View root, boolean z17, gk2.e buContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        this.f512525a = root;
        this.f512526b = z17;
        this.f512527c = buContext;
        android.widget.HorizontalScrollView horizontalScrollView = (android.widget.HorizontalScrollView) root.findViewById(com.p314xaae8f345.mm.R.id.t5z);
        this.f512529e = horizontalScrollView;
        this.f512530f = new java.util.ArrayList();
        this.f512531g = kz5.p0.f395529d;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(root.getContext());
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        linearLayout.setVisibility(0);
        this.f512533i = linearLayout;
        horizontalScrollView.removeAllViews();
        horizontalScrollView.addView(linearLayout);
        horizontalScrollView.setVisibility(8);
    }

    public final void a() {
        java.util.List list = this.f512530f;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f512533i.removeView((android.widget.LinearLayout) it.next());
        }
        ((java.util.ArrayList) list).clear();
        this.f512529e.setVisibility(8);
    }
}
