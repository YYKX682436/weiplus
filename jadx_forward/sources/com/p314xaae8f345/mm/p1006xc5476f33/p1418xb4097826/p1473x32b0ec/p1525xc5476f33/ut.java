package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ut implements oa.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv f196151d;

    public ut(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv ivVar) {
        this.f196151d = ivVar;
    }

    @Override // oa.c
    public void h0(oa.i iVar) {
    }

    @Override // oa.c
    public void l4(oa.i iVar) {
        android.widget.TextView textView = null;
        oa.k kVar = iVar != null ? iVar.f425318h : null;
        if (kVar != null) {
            int childCount = kVar.getChildCount();
            int i17 = 0;
            while (true) {
                if (i17 >= childCount) {
                    break;
                }
                android.view.View childAt = kVar.getChildAt(i17);
                if (childAt instanceof android.widget.TextView) {
                    textView = (android.widget.TextView) childAt;
                    break;
                }
                i17++;
            }
        }
        if (textView != null) {
            com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            textView.setTextColor(this.f196151d.f446856d.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        }
    }

    @Override // oa.c
    public void u1(oa.i tab) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tab, "tab");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv ivVar = this.f196151d;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = ivVar.F;
        android.view.ViewGroup viewGroup = ivVar.f446856d;
        android.content.Context context = viewGroup.getContext();
        int i17 = tab.f425315e;
        int i18 = com.p314xaae8f345.mm.R.C30859x5a72f63.ak7;
        c2718xca2902ff.m20368xc75d81ec(context.getColor(i17 == 0 ? com.p314xaae8f345.mm.R.C30859x5a72f63.ak7 : com.p314xaae8f345.mm.R.C30859x5a72f63.f560594ak5));
        oa.k kVar = tab.f425318h;
        android.widget.TextView textView = null;
        if (kVar != null) {
            int childCount = kVar.getChildCount();
            int i19 = 0;
            while (true) {
                if (i19 >= childCount) {
                    break;
                }
                android.view.View childAt = kVar.getChildAt(i19);
                if (childAt instanceof android.widget.TextView) {
                    textView = (android.widget.TextView) childAt;
                    break;
                }
                i19++;
            }
        }
        if (textView != null) {
            com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            android.content.Context context2 = viewGroup.getContext();
            if (tab.f425315e != 0) {
                i18 = com.p314xaae8f345.mm.R.C30859x5a72f63.f560594ak5;
            }
            textView.setTextColor(context2.getColor(i18));
        }
    }
}
