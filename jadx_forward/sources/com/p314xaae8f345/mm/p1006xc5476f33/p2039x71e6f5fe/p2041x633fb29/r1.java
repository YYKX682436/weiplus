package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes3.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.u f240533a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.AbstractC17340x3097aadf f240534b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17337xb9c9eb33 f240535c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17328xd29825bc f240536d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240537e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.r f240538f;

    /* renamed from: g, reason: collision with root package name */
    public int f240539g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f240540h = "";

    public final void a(boolean z17, boolean z18) {
        if (this.f240537e != z17) {
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.AbstractC17340x3097aadf abstractC17340x3097aadf = this.f240534b;
                android.view.View mo68768xf65d1cae = abstractC17340x3097aadf != null ? abstractC17340x3097aadf.mo68768xf65d1cae() : null;
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17328xd29825bc c17328xd29825bc = this.f240536d;
                if (c17328xd29825bc != null) {
                    c17328xd29825bc.m68787xcf1614fc(mo68768xf65d1cae);
                }
            }
            this.f240537e = z17;
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17337xb9c9eb33 c17337xb9c9eb33 = this.f240535c;
            if (c17337xb9c9eb33 != null) {
                c17337xb9c9eb33.b(!z17);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17328xd29825bc c17328xd29825bc2 = this.f240536d;
            if (c17328xd29825bc2 != null) {
                android.view.View view = c17328xd29825bc2.f241237h;
                if (view == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("infoLayout");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showLoadingView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showLoadingView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.widget.TextView textView = c17328xd29825bc2.f241239m;
                if (textView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("opButton");
                    throw null;
                }
                textView.setVisibility(8);
                if (!z17) {
                    c17328xd29825bc2.setVisibility(8);
                    c17328xd29825bc2.f241250x = false;
                    android.view.View view2 = c17328xd29825bc2.f241235f;
                    if (view2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
                        throw null;
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showLoadingView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showLoadingView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.animation.Animation animation = c17328xd29825bc2.f241241o;
                    if (animation != null) {
                        animation.cancel();
                    }
                    android.view.View view3 = c17328xd29825bc2.f241236g;
                    if (view3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingIcon");
                        throw null;
                    }
                    view3.clearAnimation();
                } else if (z18) {
                    c17328xd29825bc2.f241242p = false;
                    c17328xd29825bc2.f241248v = true;
                    c17328xd29825bc2.f241249w = z18;
                    android.view.View view4 = c17328xd29825bc2.f241235f;
                    if (view4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
                        throw null;
                    }
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showLoadingView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showLoadingView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    c17328xd29825bc2.setVisibility(4);
                    c17328xd29825bc2.post(new d04.a1(c17328xd29825bc2));
                } else {
                    c17328xd29825bc2.b(false);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.AbstractC17340x3097aadf abstractC17340x3097aadf2 = this.f240534b;
            if (abstractC17340x3097aadf2 != null) {
                abstractC17340x3097aadf2.q(z17);
            }
        }
    }
}
