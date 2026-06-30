package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class m5 implements android.view.View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb f167238a;

    public m5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb c11529x5d7a34bb) {
        this.f167238a = c11529x5d7a34bb;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public void onSystemUiVisibilityChange(int i17) {
        android.app.Activity w17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb c11529x5d7a34bb = this.f167238a;
        android.widget.FrameLayout frameLayout = c11529x5d7a34bb.f156371q;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (!n3.x0.b(frameLayout) || (w17 = c11529x5d7a34bb.w()) == null || w17.getWindow() == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.bk.h0(w17.getWindow(), !com.p314xaae8f345.mm.ui.uk.g(w17.getWindow().getNavigationBarColor()));
    }
}
