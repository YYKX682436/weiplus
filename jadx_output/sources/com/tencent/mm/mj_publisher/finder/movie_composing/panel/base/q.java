package com.tencent.mm.mj_publisher.finder.movie_composing.panel.base;

/* loaded from: classes5.dex */
public interface q {
    static /* synthetic */ void a(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q qVar, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        if ((i17 & 2) != 0) {
            z18 = true;
        }
        ((com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel) qVar).e(z17, z18);
    }

    ou0.z b();

    void c(android.content.Context context, android.widget.FrameLayout frameLayout);

    int getPanelHeight();

    zw0.d getPanelLevel();

    com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.p getState();
}
