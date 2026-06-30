package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class z0 implements oa.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a f233532d;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a c16687xe732929a) {
        this.f233532d = c16687xe732929a;
    }

    @Override // oa.c
    public void h0(oa.i iVar) {
    }

    @Override // oa.c
    public void l4(oa.i iVar) {
        if (iVar != null) {
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f233532d.f233152d;
            android.view.View childAt = c2718xca2902ff != null ? c2718xca2902ff.getChildAt(0) : null;
            android.view.ViewGroup viewGroup = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
            android.view.View childAt2 = viewGroup != null ? viewGroup.getChildAt(iVar.f425315e) : null;
            android.view.ViewGroup viewGroup2 = childAt2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt2 : null;
            android.view.KeyEvent.Callback childAt3 = viewGroup2 != null ? viewGroup2.getChildAt(1) : null;
            android.widget.TextView textView = childAt3 instanceof android.widget.TextView ? (android.widget.TextView) childAt3 : null;
            if (textView == null) {
                return;
            }
            textView.setTypeface(android.graphics.Typeface.DEFAULT);
        }
    }

    @Override // oa.c
    public void u1(oa.i iVar) {
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 ftsEditText;
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 ftsEditText2;
        if (iVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a c16687xe732929a = this.f233532d;
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = c16687xe732929a.f233152d;
            android.view.View childAt = c2718xca2902ff != null ? c2718xca2902ff.getChildAt(0) : null;
            android.view.ViewGroup viewGroup = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
            android.view.View childAt2 = viewGroup != null ? viewGroup.getChildAt(iVar.f425315e) : null;
            android.view.ViewGroup viewGroup2 = childAt2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt2 : null;
            android.view.KeyEvent.Callback childAt3 = viewGroup2 != null ? viewGroup2.getChildAt(1) : null;
            android.widget.TextView textView = childAt3 instanceof android.widget.TextView ? (android.widget.TextView) childAt3 : null;
            if (textView != null) {
                textView.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
            }
            int i17 = iVar.f425315e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMVCardChooseView", "setCurrentPage:" + i17);
            if (i17 == -1) {
                i17 = 0;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16680x607376f4 c16680x607376f4 = c16687xe732929a.f233161o;
            if (c16680x607376f4 != null && (ftsEditText2 = c16680x607376f4.getFtsEditText()) != null) {
                ftsEditText2.d();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16680x607376f4 c16680x607376f42 = c16687xe732929a.f233161o;
            if (c16680x607376f42 != null && (ftsEditText = c16680x607376f42.getFtsEditText()) != null) {
                ftsEditText.h();
            }
            if (i17 == 0) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c16687xe732929a.f233153e;
                if (c1163xf1deaba4 != null) {
                    c1163xf1deaba4.setVisibility(0);
                }
                android.widget.RelativeLayout relativeLayout = c16687xe732929a.f233156h;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(4);
                }
            } else if (i17 == 1) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = c16687xe732929a.f233153e;
                if (c1163xf1deaba42 != null) {
                    c1163xf1deaba42.setVisibility(4);
                }
                android.widget.RelativeLayout relativeLayout2 = c16687xe732929a.f233156h;
                if (relativeLayout2 != null) {
                    relativeLayout2.setVisibility(0);
                }
            }
            c16687xe732929a.m();
        }
    }
}
