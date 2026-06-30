package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class v2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18619x86b32cd1 f255893d;

    public v2(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18619x86b32cd1 c18619x86b32cd1) {
        this.f255893d = c18619x86b32cd1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo8217x5db88677(android.graphics.Rect outRect, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18619x86b32cd1 c18619x86b32cd1 = this.f255893d;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = c18619x86b32cd1.f254997e;
        if (c22849x81a93d25 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rvSelfHistory");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c22849x81a93d25.mo7946xf939df19();
        if (i17 == (mo7946xf939df19 != null ? mo7946xf939df19.mo1894x7e414b06() : 1) - 1) {
            outRect.bottom = i65.a.b(c18619x86b32cd1.mo7438x76847179(), 16);
        } else {
            outRect.bottom = i65.a.b(c18619x86b32cd1.mo7438x76847179(), 8);
        }
    }
}
