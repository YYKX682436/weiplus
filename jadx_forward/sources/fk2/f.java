package fk2;

/* loaded from: classes3.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final fk2.f f344903d = new fk2.f();

    public f() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int i17;
        java.lang.CharSequence content = (java.lang.CharSequence) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        ((ke0.e) xVar).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, content));
        fk2.h hVar = fk2.k.f344946m;
        android.graphics.drawable.Drawable a17 = gm2.u.a(gm2.v.f355031f, hVar.b(), 0.0f, 0.0f, 6, null);
        java.lang.String b17 = hVar.b();
        float f17 = gm2.w.f355044k;
        f0Var.c(new gm2.v(a17, new gm2.w(b17, f17, f17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b), gm2.w.f355042i, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0), gm2.w.f355043j, 0.0f, 128, null)), 0, hVar.b().length() + 0, 33);
        java.lang.String f0Var2 = f0Var.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f0Var2, "toString(...)");
        int K = r26.n0.K(f0Var2, '\n', 0, false, 6, null);
        if (K != -1 && (i17 = K + 1) < f0Var.length()) {
            f0Var.c(new android.text.style.ForegroundColorSpan(android.graphics.Color.parseColor("#80ffffff")), i17, f0Var.toString().length(), 33);
        }
        if (intValue > 1) {
            f0Var.c(new android.text.style.LeadingMarginSpan.Standard(0, com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 11)), 0, f0Var.length(), 33);
        }
        return f0Var;
    }
}
