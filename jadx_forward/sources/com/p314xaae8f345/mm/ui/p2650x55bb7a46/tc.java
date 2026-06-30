package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes.dex */
public class tc implements db5.l4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f284250a;

    public tc(android.content.Context context) {
        this.f284250a = context;
    }

    @Override // db5.l4
    public void a(android.widget.TextView textView, android.view.MenuItem menuItem) {
        if (textView != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(((java.lang.Object) menuItem.getTitle()) + "", true);
            if (n17 == null || ((int) n17.E2) <= 0) {
                textView.setText(((java.lang.Object) menuItem.getTitle()) + "");
                return;
            }
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String f27 = n17.f2();
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this.f284250a, f27, textSize));
        }
    }
}
