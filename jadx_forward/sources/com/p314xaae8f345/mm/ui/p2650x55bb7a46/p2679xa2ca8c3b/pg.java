package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes.dex */
public class pg implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f286799a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f286800b;

    public pg(android.widget.TextView textView, android.content.Context context) {
        this.f286799a = textView;
        this.f286800b = context;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        android.content.Context context = this.f286800b;
        android.widget.TextView textView = this.f286799a;
        if (n17 == null || ((int) n17.E2) <= 0 || !c01.e2.G(str)) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.aj6);
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, string, textSize));
            return;
        }
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String e17 = c01.a2.e(str);
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        float textSize2 = textView.getTextSize();
        ((ke0.e) xVar2).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, e17, textSize2));
    }
}
