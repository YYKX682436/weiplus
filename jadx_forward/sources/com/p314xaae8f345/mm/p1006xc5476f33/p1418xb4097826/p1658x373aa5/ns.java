package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class ns extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.y0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f214284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971 f214285e;

    public ns(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971 c15379x1d4ea971) {
        this.f214285e = c15379x1d4ea971;
        this.f214284d = new java.lang.ref.WeakReference(c15379x1d4ea971);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.x0
    /* renamed from: onLongPress */
    public void mo62211x4f8d808(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        java.lang.Object obj = this.f214284d.get();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.is onSimultaneouslyLongPressListener = this.f214285e.getOnSimultaneouslyLongPressListener();
        if (obj == null || onSimultaneouslyLongPressListener == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971 c15379x1d4ea971 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971) obj;
        c15379x1d4ea971.f213114h = true;
        onSimultaneouslyLongPressListener.b(c15379x1d4ea971, e17);
    }
}
