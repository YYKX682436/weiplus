package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes4.dex */
public class im implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f228567d;

    public im(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d, android.view.View view) {
        this.f228567d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f228567d;
        if (view.getHeight() != 0) {
            float height = view.getHeight() / 2;
            if (view != null) {
                view.setOutlineProvider(new zl5.a(true, true, height));
            }
            if (view == null) {
                return;
            }
            view.setClipToOutline(true);
            return;
        }
        float b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 16);
        if (view != null) {
            view.setOutlineProvider(new zl5.a(true, true, b17));
        }
        if (view == null) {
            return;
        }
        view.setClipToOutline(true);
    }
}
