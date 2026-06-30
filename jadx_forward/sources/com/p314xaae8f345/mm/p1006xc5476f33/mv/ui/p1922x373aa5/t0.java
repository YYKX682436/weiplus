package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class t0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.u2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a f233482a;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a c16687xe732929a) {
        this.f233482a = c16687xe732929a;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.u2
    public boolean a(int i17, int i18) {
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a.B1;
        if (this.f233482a.h()) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a c16687xe732929a = this.f233482a;
        if (c16687xe732929a.D) {
            return false;
        }
        if (i18 > 8000 && c16687xe732929a.f233177y1) {
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a.j(c16687xe732929a, false, null, null, 6, null);
            return false;
        }
        if (i18 >= -8000 || c16687xe732929a.f233177y1) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a.j(c16687xe732929a, true, null, null, 6, null);
        return false;
    }
}
