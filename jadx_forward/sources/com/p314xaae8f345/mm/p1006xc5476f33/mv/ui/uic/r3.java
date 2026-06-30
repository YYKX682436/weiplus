package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes2.dex */
public final class r3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f232935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f232936e;

    public r3(android.widget.ImageView imageView, yz5.l lVar) {
        this.f232935d = imageView;
        this.f232936e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ImageView imageView = this.f232935d;
        imageView.setVisibility(4);
        fm3.w a17 = fm3.x.a(imageView);
        yz5.l lVar = this.f232936e;
        if (lVar != null) {
            lVar.mo146xb9724478(a17);
        }
    }
}
