package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8;

/* loaded from: classes2.dex */
public final class d implements com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.k f202738a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f202739b;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.k kVar, android.widget.TextView textView) {
        this.f202738a = kVar;
        this.f202739b = textView;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.e
    public final void a(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c, int i17) {
        float abs = java.lang.Math.abs(i17) / (com.p314xaae8f345.mm.ui.bl.h(r3.m80379x76847179()) + this.f202738a.m80379x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df));
        android.widget.TextView textView = this.f202739b;
        if (abs > 1.0f) {
            textView.setAlpha(1.0f);
        } else {
            textView.setAlpha(abs);
        }
    }
}
