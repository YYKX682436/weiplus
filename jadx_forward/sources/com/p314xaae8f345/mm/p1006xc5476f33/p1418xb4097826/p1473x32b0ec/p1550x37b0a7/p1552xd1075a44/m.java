package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44;

/* loaded from: classes10.dex */
public final class m implements fs2.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f202264d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f202265e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f202266f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.i f202267g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f202268h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f202269i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f202270m;

    /* renamed from: n, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f202271n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f202272o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f202273p;

    public m(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, android.view.View rootView, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.i presenter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        this.f202264d = activity;
        this.f202265e = rootView;
        this.f202266f = view;
        this.f202267g = presenter;
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.m mVar) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = mVar.f202268h;
        if (c22621x7603e017 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wishCountEditText");
            throw null;
        }
        c22621x7603e017.setText("");
        android.widget.TextView textView = mVar.f202272o;
        if (textView != null) {
            textView.setVisibility(0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wishInvalidDesc");
            throw null;
        }
    }

    public final void g(long j17, java.lang.String performanceName, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performanceName, "performanceName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("InteractionWishContract.ViewCallback", "onWishCountChanged wishCount:" + j17 + " performanceName:" + performanceName + " disablePerformance:" + z17);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f202268h;
        if (c22621x7603e017 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wishCountEditText");
            throw null;
        }
        c22621x7603e017.setText(j17 > 0 ? java.lang.String.valueOf(j17) : "");
        if (z17) {
            android.view.ViewGroup viewGroup = this.f202270m;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("performanceLayout");
                throw null;
            }
        }
        android.view.ViewGroup viewGroup2 = this.f202270m;
        if (viewGroup2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("performanceLayout");
            throw null;
        }
        viewGroup2.setVisibility(0);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = this.f202269i;
        if (c22621x7603e0172 != null) {
            c22621x7603e0172.setText(performanceName);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("performanceNameEditText");
            throw null;
        }
    }

    @Override // fs2.c
    /* renamed from: getActivity */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
        return this.f202264d;
    }
}
