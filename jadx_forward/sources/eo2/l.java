package eo2;

/* loaded from: classes2.dex */
public final class l extends w92.a {

    /* renamed from: m, reason: collision with root package name */
    public final android.content.Context f337116m;

    /* renamed from: n, reason: collision with root package name */
    public final int f337117n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f337118o;

    /* renamed from: p, reason: collision with root package name */
    public int f337119p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f337120q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f337121r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context, int i17, java.lang.String title, boolean z17, int i18, int i19, int i27, boolean z18) {
        super(i17, title, z17, i18, i19);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f337116m = context;
        this.f337117n = i27;
        this.f337118o = z18;
    }

    @Override // w92.a, zx2.k, zx2.i
    public int a() {
        return this.f337117n;
    }

    @Override // w92.a, zx2.i
    public int[] b() {
        return new int[]{0, 0};
    }

    @Override // zx2.k, zx2.i
    public void c(android.view.ViewGroup viewGroup) {
        android.view.ViewTreeObserver viewTreeObserver;
        android.widget.TextView textView;
        super.c(viewGroup);
        android.widget.TextView textView2 = this.f558585j;
        if (textView2 != null) {
            textView2.setIncludeFontPadding(false);
        }
        if (viewGroup != null) {
            android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f568734nv5);
            if (findViewById != null) {
                findViewById.setPadding(this.f337119p, findViewById.getPaddingTop(), this.f337119p, findViewById.getPaddingBottom());
            }
            android.widget.TextView textView3 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.nuu);
            this.f337121r = textView3;
            if (textView3 != null) {
                textView3.setTextSize(1, 12.0f);
            }
            java.lang.String str = this.f337120q;
            if (!(str == null || str.length() == 0) && (textView = this.f337121r) != null) {
                textView.setText(this.f337120q);
            }
            if (this.f337118o) {
                android.view.View findViewById2 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.r8v);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = findViewById2 instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159) findViewById2 : null;
                if (c22645x24069159 == null || (viewTreeObserver = c22645x24069159.getViewTreeObserver()) == null) {
                    return;
                }
                viewTreeObserver.addOnGlobalLayoutListener(new eo2.k(c22645x24069159, c22645x24069159));
            }
        }
    }

    @Override // zx2.k, zx2.i
    public void d(boolean z17, android.view.ViewGroup tabView) {
        android.widget.TextView textView;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabView, "tabView");
        super.d(z17, tabView);
        if (this.f337118o) {
            android.view.View findViewById = tabView.findViewById(com.p314xaae8f345.mm.R.id.r8v);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = findViewById instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159) findViewById : null;
            if (c22645x24069159 != null) {
                c22645x24069159.m81436x205ac394(c22645x24069159.getHeight() / 2.0f);
            }
            if (z17) {
                if (c22645x24069159 != null) {
                    c22645x24069159.setBackgroundColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b));
                }
            } else if (c22645x24069159 != null) {
                c22645x24069159.setBackgroundColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
            }
        }
        if (z17 || (textView = this.f337121r) == null) {
            return;
        }
        textView.setText("");
    }
}
