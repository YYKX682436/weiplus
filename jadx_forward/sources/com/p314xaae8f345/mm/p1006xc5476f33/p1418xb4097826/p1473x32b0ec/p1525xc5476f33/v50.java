package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class v50 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 f196198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 f196199e;

    public v50(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 ep0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var) {
        this.f196198d = ep0Var;
        this.f196199e = r60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 ep0Var = this.f196198d;
        android.view.View findViewById = ep0Var.mo56902xfb86a31b().findViewById(ep0Var.p0());
        android.view.View findViewById2 = ep0Var.mo56902xfb86a31b().findViewById(ep0Var.e0());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var = this.f196199e;
        int h17 = (r60Var.A.x / 2) - i65.a.h(r60Var.f446856d.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561199c3);
        int h18 = i65.a.h(r60Var.f446856d.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.ajz);
        if (h18 <= h17) {
            h17 = h18;
        }
        if (findViewById == null || findViewById2 == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        android.view.ViewGroup.LayoutParams layoutParams2 = findViewById2.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.width = h17;
        }
        int h19 = i65.a.h(r60Var.f446856d.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        android.view.ViewGroup viewGroup = r60Var.f446856d;
        int h27 = i65.a.h(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561182bo);
        int h28 = i65.a.h(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
        if (marginLayoutParams2 != null) {
            if (marginLayoutParams2 instanceof android.widget.LinearLayout.LayoutParams) {
                marginLayoutParams2.setMargins(h19, marginLayoutParams2.topMargin, 0, 0);
            } else {
                marginLayoutParams2.setMargins(0, marginLayoutParams2.topMargin, h28, 0);
            }
            findViewById2.setLayoutParams(marginLayoutParams2);
            findViewById2.invalidate();
        }
        int i17 = ((je2.h) r60Var.P0(je2.h.class)).f380767g;
        if (i17 > 0) {
            h27 = i17 + com.p314xaae8f345.mm.ui.zk.a(findViewById.getContext(), 28) + com.p314xaae8f345.mm.ui.zk.a(findViewById.getContext(), 4);
        }
        if (marginLayoutParams != null) {
            int width = (viewGroup.getWidth() - h17) - h27;
            if (width < 0) {
                width = 0;
            }
            marginLayoutParams.setMargins(width, 0, marginLayoutParams.getMarginEnd(), 0);
        }
        findViewById.setLayoutParams(marginLayoutParams);
        findViewById.invalidate();
    }
}
