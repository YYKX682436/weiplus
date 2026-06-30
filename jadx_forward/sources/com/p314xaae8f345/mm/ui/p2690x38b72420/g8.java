package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class g8 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f288257d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f288258e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f288259f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2690x38b72420.e8 f288260g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2690x38b72420.f8 f288261h;

    public g8(android.content.Context context, com.p314xaae8f345.mm.ui.p2690x38b72420.e8 e8Var) {
        super(context);
        this.f288258e = null;
        this.f288257d = context;
        this.f288260g = e8Var;
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2690x38b72420.d8(this));
    }

    /* renamed from: getOpenIMCount */
    public int m80421x7d2c78b() {
        java.util.List list = this.f288259f;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: setOnVisibilityChangeListener */
    public void m80422x54effb37(com.p314xaae8f345.mm.ui.p2690x38b72420.f8 f8Var) {
        this.f288261h = f8Var;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        if (this.f288261h != null && i17 != getVisibility()) {
            this.f288261h.a(i17 == 0);
        }
        super.setVisibility(i17);
    }
}
