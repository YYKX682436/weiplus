package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes5.dex */
public final class a7 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 f213154a;

    public a7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34) {
        this.f213154a = c15270x6d877a34;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34 = this.f213154a;
        c15270x6d877a34.m61859xdb574fcd().getText().insert(c15270x6d877a34.m61859xdb574fcd().getSelectionStart(), pg5.d.a(c15270x6d877a34.getContext(), str));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34 = this.f213154a;
        if (c15270x6d877a34.m61859xdb574fcd().mo81352x6a67d012() != null) {
            c15270x6d877a34.m61859xdb574fcd().mo81352x6a67d012().sendKeyEvent(new android.view.KeyEvent(0, 67));
            c15270x6d877a34.m61859xdb574fcd().mo81352x6a67d012().sendKeyEvent(new android.view.KeyEvent(1, 67));
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void d() {
    }
}
