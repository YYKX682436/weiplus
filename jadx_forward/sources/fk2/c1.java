package fk2;

/* loaded from: classes3.dex */
public final class c1 {
    public c1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a() {
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575253os0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 b(java.lang.CharSequence charSequence, int i17) {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, charSequence));
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        android.graphics.drawable.Drawable a17 = gm2.u.a(gm2.v.f355031f, a(), 0.0f, 0.0f, 6, null);
        java.lang.String a18 = a();
        float f17 = gm2.w.f355044k;
        f0Var.c(new gm2.v(a17, new gm2.w(a18, f17, f17, context2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b), gm2.w.f355042i, context2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0), gm2.w.f355043j, 0.0f, 128, null)), 0, a().length() + 0, 33);
        java.lang.String f0Var2 = f0Var.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f0Var2, "toString(...)");
        int K = r26.n0.K(f0Var2, '\n', 0, false, 6, null);
        if (K >= 0 && K < f0Var.length() - 1) {
            f0Var.c(new android.text.style.ForegroundColorSpan(android.graphics.Color.parseColor("#80ffffff")), K + 1, f0Var.length(), 33);
        }
        if (i17 > 1) {
            f0Var.c(new android.text.style.LeadingMarginSpan.Standard(0, com.p314xaae8f345.mm.ui.zk.a(context, 11)), 0, f0Var.length(), 33);
        }
        return f0Var;
    }
}
