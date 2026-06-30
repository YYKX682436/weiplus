package eo2;

/* loaded from: classes2.dex */
public class i extends eo2.j {

    /* renamed from: e, reason: collision with root package name */
    public v92.g f337103e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f337104f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f337105g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f337106h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f337107i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.FrameLayout f337108m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f337109n;

    /* renamed from: o, reason: collision with root package name */
    public final int f337110o;

    /* renamed from: p, reason: collision with root package name */
    public int f337111p;

    /* renamed from: q, reason: collision with root package name */
    public final int f337112q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f337110o = m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        this.f337111p = m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560512mi);
        this.f337112q = i65.a.b(m80379x76847179(), 72);
    }

    @Override // eo2.j
    public void P6() {
        this.f337104f = (android.widget.FrameLayout) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f567411jf4);
        this.f337105g = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.jfw);
        this.f337108m = (android.widget.FrameLayout) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.jfx);
        this.f337109n = (android.widget.TextView) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f564080hd);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.e9d);
        android.widget.LinearLayout linearLayout2 = null;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new eo2.g(this));
        } else {
            linearLayout = null;
        }
        this.f337106h = linearLayout;
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.jf7);
        if (linearLayout3 != null) {
            linearLayout3.setOnClickListener(new eo2.h(this));
            linearLayout2 = linearLayout3;
        }
        this.f337107i = linearLayout2;
        this.f337111p = m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a);
        android.widget.TextView textView = this.f337109n;
        if (textView != null) {
            textView.setTextColor(m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        }
    }

    @Override // eo2.j
    public void T6(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        this.f337113d = fVar;
        android.widget.TextView textView = this.f337109n;
        if (textView == null) {
            return;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        java.lang.String X6 = X6();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(m158354x19263085, X6));
    }

    public final void V6(float f17, float f18) {
        if (f17 < 0.5d) {
            Y6(this.f337109n, 4);
        } else {
            Y6(this.f337109n, 0);
        }
        android.widget.LinearLayout linearLayout = this.f337106h;
        if (linearLayout != null) {
            linearLayout.setAlpha(f18);
        }
        android.widget.LinearLayout linearLayout2 = this.f337107i;
        if (linearLayout2 == null) {
            return;
        }
        linearLayout2.setAlpha(f18);
    }

    public v92.g W6() {
        return new fo2.e(m158354x19263085(), "");
    }

    public java.lang.String X6() {
        return "";
    }

    public final void Y6(android.view.View view, int i17) {
        if ((view != null && view.getVisibility() == i17) || view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/MemberActionBarUIC", "setVisibleStats", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/member/MemberActionBarUIC", "setVisibleStats", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // eo2.j, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        super.mo450x3e5a77bb(bundle);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            hc2.i.e(abstractActivityC21394xb3d2c0cf, false);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        hc2.i.a((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630852, this.f337105g, this.f337104f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f337110o = m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        this.f337111p = m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560512mi);
        this.f337112q = i65.a.b(m80379x76847179(), 72);
    }
}
