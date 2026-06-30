package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* loaded from: classes14.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16238x79483a39 f225929d;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16238x79483a39 c16238x79483a39) {
        this.f225929d = c16238x79483a39;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View landscapeMarginView;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16238x79483a39 c16238x79483a39 = this.f225929d;
        if (c16238x79483a39.K == null) {
            c16238x79483a39.K = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65439x6a0f1ce7(c16238x79483a39.f127584r, c16238x79483a39.f127589w, c16238x79483a39.f127588v, c16238x79483a39.f127585s);
        }
        boolean m65381x1cd9fc48 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65381x1cd9fc48();
        int m65630x3119c89f = c16238x79483a39.K.m65630x3119c89f(m65381x1cd9fc48);
        if (m65630x3119c89f == 0) {
            m65630x3119c89f = m65381x1cd9fc48 ? -16777216 : -1;
        }
        if (c16238x79483a39.getLandscape()) {
            android.content.Context context = zc.c.f552872b;
            if (context == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appContext");
                throw null;
            }
            android.graphics.Point h17 = com.p314xaae8f345.mm.ui.bk.h(context);
            android.widget.FrameLayout landscapeContentView = c16238x79483a39.getLandscapeContentView();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(landscapeContentView);
            landscapeContentView.setTranslationX(-(h17.x / 2));
            c16238x79483a39.i(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.a.f225913f, 300L, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.d0(c16238x79483a39));
            int m65633x279e4dd3 = c16238x79483a39.K.m65633x279e4dd3(m65381x1cd9fc48);
            if (m65633x279e4dd3 != 0 && (landscapeMarginView = c16238x79483a39.getLandscapeMarginView()) != null) {
                landscapeMarginView.setBackgroundColor(m65633x279e4dd3);
            }
        } else {
            c16238x79483a39.k(true);
        }
        if (c16238x79483a39.f127591y) {
            return;
        }
        c16238x79483a39.f127576g.setBackgroundColor(m65630x3119c89f);
    }
}
