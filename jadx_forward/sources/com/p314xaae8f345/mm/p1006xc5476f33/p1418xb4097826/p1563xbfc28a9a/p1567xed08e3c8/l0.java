package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8;

/* loaded from: classes2.dex */
public final class l0 implements gx2.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.n0 f202787d;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.n0 n0Var) {
        this.f202787d = n0Var;
    }

    @Override // gx2.b
    public android.graphics.Rect G6(gx2.q drawer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawer, "drawer");
        android.graphics.Rect rect = new android.graphics.Rect();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.C14468x579dd28e c14468x579dd28e = this.f202787d.f202795e;
        if (c14468x579dd28e != null) {
            android.view.View view = c14468x579dd28e.f287834h;
            android.view.View findViewById = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.f564769a25) : null;
            if (findViewById != null) {
                findViewById.getGlobalVisibleRect(rect);
            }
        }
        return rect;
    }
}
