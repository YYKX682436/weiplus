package uj3;

/* loaded from: classes14.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f509796a;

    /* renamed from: b, reason: collision with root package name */
    public final uj3.b f509797b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f509798c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f509799d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f509800e;

    public f1(android.content.Context context, uj3.b statusManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusManager, "statusManager");
        this.f509796a = context;
        this.f509797b = statusManager;
    }

    public final void a() {
        android.view.View view = this.f509798c;
        this.f509799d = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.kq9) : null;
        android.view.View view2 = this.f509798c;
        this.f509800e = view2 != null ? (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.kq_) : null;
        android.view.View view3 = this.f509799d;
        android.content.Context context = this.f509796a;
        if (view3 != null) {
            view3.setBackground(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.C30861xcebc809e.aft, android.graphics.Color.parseColor("#FA5151")));
        }
        sj3.n3 n3Var = sj3.o3.f490199e;
        if (n3Var.a(context) == 90 || n3Var.a(context) == 270) {
            android.widget.TextView textView = this.f509800e;
            if (textView != null) {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ibs);
            }
        } else {
            android.widget.TextView textView2 = this.f509800e;
            if (textView2 != null) {
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ibl);
            }
        }
        android.view.View view4 = this.f509799d;
        if (view4 != null) {
            view4.requestLayout();
        }
        android.view.View view5 = this.f509799d;
        if (view5 != null) {
            view5.setOnClickListener(new uj3.e1(this));
        }
    }
}
