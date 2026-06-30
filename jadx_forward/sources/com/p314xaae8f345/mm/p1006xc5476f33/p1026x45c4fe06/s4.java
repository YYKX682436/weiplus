package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class s4 implements android.view.View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11527x5889d9af f169981a;

    public s4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11527x5889d9af c11527x5889d9af) {
        this.f169981a = c11527x5889d9af;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public void onSystemUiVisibilityChange(int i17) {
        int i18;
        android.app.Activity a17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11527x5889d9af c11527x5889d9af = this.f169981a;
        if (c11527x5889d9af.f156371q.isShown()) {
            android.widget.FrameLayout frameLayout = c11527x5889d9af.f156371q;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (!n3.x0.b(frameLayout) || (i18 = android.os.Build.VERSION.SDK_INT) < 26 || (c11527x5889d9af.f156371q.getWindowSystemUiVisibility() & 2) != 0 || (a17 = q75.a.a(c11527x5889d9af.f169178d)) == null || a17.getWindow() == null) {
                return;
            }
            boolean g17 = com.p314xaae8f345.mm.ui.uk.g(a17.getWindow().getNavigationBarColor());
            android.view.Window window = a17.getWindow();
            boolean z17 = !g17;
            if (window == null || window.getDecorView() == null || i18 < 26) {
                return;
            }
            android.view.View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z17 ? systemUiVisibility | 16 : systemUiVisibility & (-17));
        }
    }
}
