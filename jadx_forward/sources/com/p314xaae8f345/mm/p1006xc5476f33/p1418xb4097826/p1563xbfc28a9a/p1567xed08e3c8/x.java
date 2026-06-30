package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8;

/* loaded from: classes2.dex */
public final class x implements android.view.ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.c0 f202829a;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.c0 c0Var) {
        this.f202829a = c0Var;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        float f17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.c0 c0Var = this.f202829a;
        android.view.ViewGroup viewGroup = c0Var.f202711e;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("previewContainer");
            throw null;
        }
        float scrollY = viewGroup.getScrollY();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = c0Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.b) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.b.class);
        bVar.getClass();
        float min = java.lang.Math.min(1.0f, (java.lang.Math.abs(scrollY) * 1.0f) / bVar.f337112q);
        if (min < 0.5f) {
            f17 = (0.5f - min) / 0.5f;
            android.view.View view = bVar.f337105g;
            if (view != null) {
                view.setBackgroundColor(bVar.f337110o);
            }
            android.widget.FrameLayout frameLayout = bVar.f337108m;
            if (frameLayout != null) {
                frameLayout.setAlpha(0.0f);
            }
            bVar.V6(min, f17);
        } else {
            f17 = (min - 0.5f) / 0.5f;
            int i17 = (int) (255 * f17);
            android.view.View view2 = bVar.f337105g;
            if (view2 != null) {
                view2.setBackgroundColor(com.p314xaae8f345.mm.ui.uk.a(bVar.f337111p, i17));
            }
            android.widget.FrameLayout frameLayout2 = bVar.f337108m;
            if (frameLayout2 != null) {
                frameLayout2.setAlpha(f17);
            }
            bVar.V6(min, f17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "alpha : " + f17);
    }
}
