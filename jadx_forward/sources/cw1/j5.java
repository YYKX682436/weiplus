package cw1;

/* loaded from: classes5.dex */
public final class j5 implements oa.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d f304574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff f304575e;

    public j5(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d c21470xb673f8d, com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff) {
        this.f304574d = c21470xb673f8d;
        this.f304575e = c2718xca2902ff;
    }

    @Override // oa.c
    public void h0(oa.i tab) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tab, "tab");
    }

    @Override // oa.c
    public void l4(oa.i tab) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tab, "tab");
        android.view.View childAt = this.f304575e.getChildAt(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.View childAt2 = ((android.view.ViewGroup) childAt).getChildAt(tab.f425315e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt2, "null cannot be cast to non-null type android.widget.LinearLayout");
        android.view.View childAt3 = ((android.widget.LinearLayout) childAt2).getChildAt(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt3, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView = (android.widget.TextView) childAt3;
        textView.setTypeface(textView.getTypeface(), 0);
    }

    @Override // oa.c
    public void u1(oa.i tab) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tab, "tab");
        this.f304574d.m80845x940d026a(tab.f425315e, true);
        android.view.View childAt = this.f304575e.getChildAt(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.View childAt2 = ((android.view.ViewGroup) childAt).getChildAt(tab.f425315e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt2, "null cannot be cast to non-null type android.widget.LinearLayout");
        android.view.View childAt3 = ((android.widget.LinearLayout) childAt2).getChildAt(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt3, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView = (android.widget.TextView) childAt3;
        textView.setTypeface(textView.getTypeface(), 1);
    }
}
