package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class fm implements gx2.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15460x89aca30d f215945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f215946e;

    public fm(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15460x89aca30d c15460x89aca30d, android.widget.FrameLayout frameLayout) {
        this.f215945d = c15460x89aca30d;
        this.f215946e = frameLayout;
    }

    @Override // gx2.b
    public android.graphics.Rect G6(gx2.q drawer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawer, "drawer");
        android.graphics.Rect rect = new android.graphics.Rect();
        if (this.f215945d.f215122f) {
            this.f215946e.getGlobalVisibleRect(rect);
        }
        return rect;
    }
}
