package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class t10 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z10 f201392d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t10(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z10 z10Var) {
        super(0);
        this.f201392d = z10Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z10 z10Var = this.f201392d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = z10Var.f202032h;
        if (c22613xe7040d9c == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
            throw null;
        }
        if (!c22613xe7040d9c.isShowing) {
            android.view.View view = z10Var.f202031g;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget$hideLoading$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget$hideLoading$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c2 = z10Var.f202032h;
            if (c22613xe7040d9c2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
                throw null;
            }
            c22613xe7040d9c2.f();
        }
        z10Var.d();
        android.widget.TextView textView = z10Var.f202035k;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.FrameLayout frameLayout = z10Var.f202029e;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        return jz5.f0.f384359a;
    }
}
