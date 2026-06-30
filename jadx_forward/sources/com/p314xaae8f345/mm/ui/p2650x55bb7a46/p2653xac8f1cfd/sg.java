package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class sg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21668xed8974f2 f281472d;

    public sg(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21668xed8974f2 c21668xed8974f2) {
        this.f281472d = c21668xed8974f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21668xed8974f2 c21668xed8974f2 = this.f281472d;
        if (c21668xed8974f2.getF212379i() != null) {
            java.lang.CharSequence f212379i = c21668xed8974f2.getF212379i();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f212379i, "getText(...)");
            if (!(f212379i.length() == 0)) {
                int lineCount = (c21668xed8974f2.getLineCount() * c21668xed8974f2.getLineHeight()) - ((c21668xed8974f2.getHeight() - c21668xed8974f2.getPaddingTop()) - c21668xed8974f2.getPaddingBottom());
                if (lineCount > 0) {
                    c21668xed8974f2.scrollBy(0, lineCount - c21668xed8974f2.getScrollY());
                    return;
                } else {
                    c21668xed8974f2.scrollTo(c21668xed8974f2.getScrollX(), 0);
                    return;
                }
            }
        }
        c21668xed8974f2.scrollTo(0, 0);
    }
}
