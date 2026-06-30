package wu;

/* loaded from: classes9.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s15.d0 f531133d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f531134e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hu.b f531135f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(s15.d0 d0Var, android.content.Context context, hu.b bVar) {
        super(1);
        this.f531133d = d0Var;
        this.f531134e = context;
        this.f531135f = bVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.CharSequence charSequence;
        android.widget.TextView it = (android.widget.TextView) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        s15.d0 d0Var = this.f531133d;
        java.lang.String m163572x40021d37 = d0Var.m163572x40021d37();
        boolean N = r26.n0.N(m163572x40021d37);
        hu.b bVar = this.f531135f;
        if (N) {
            m163572x40021d37 = bVar.f366533h.toString();
        }
        java.lang.String t17 = r26.i0.t(r26.i0.v(d0Var.m163571x76847043(), "&lt;", "<", false, 4, null), "&gt;", ">", false);
        if (!r26.n0.N(t17)) {
            i95.m c17 = i95.n0.c(ct.r2.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            int m163573xfb85f7b0 = d0Var.m163573xfb85f7b0();
            int i17 = ti3.i.f501121a;
            android.content.Context context = it.getContext();
            int currentTextColor = it.getCurrentTextColor();
            float textSize = it.getPaint().getTextSize();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            sb6.append((java.lang.CharSequence) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, m163572x40021d37, textSize));
            sb6.append("：");
            java.lang.String i18 = ti3.i.i(context, m163573xfb85f7b0, t17, false);
            l15.c cVar = new l15.c();
            cVar.m126728xdc93280d(t17);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i18)) {
                android.graphics.drawable.Drawable g17 = ti3.i.g(context, m163573xfb85f7b0, cVar);
                com.p314xaae8f345.mm.ui.uk.f(g17, currentTextColor);
                charSequence = sb6;
                if (g17 != null) {
                    charSequence = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).Ai(context, sb6, g17, true);
                }
            } else {
                android.graphics.drawable.Drawable g18 = ti3.i.g(context, m163573xfb85f7b0, cVar);
                com.p314xaae8f345.mm.ui.uk.f(g18, currentTextColor);
                if (g18 != null) {
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
                    android.text.SpannableString j17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, i18, textSize);
                    ((ke0.e) xVar).getClass();
                    charSequence = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.b(context, sb6, j17, g18, true, true);
                } else {
                    ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
                    sb6.append((java.lang.CharSequence) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, i18, textSize));
                    charSequence = sb6;
                }
            }
        } else {
            charSequence = "";
        }
        java.lang.CharSequence charSequence2 = charSequence;
        if (d0Var.m163573xfb85f7b0() == 47) {
            java.lang.CharSequence concat = android.text.TextUtils.concat(charSequence, this.f531134e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571915tf));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(concat, "concat(...)");
            charSequence2 = concat;
        }
        boolean z17 = !r26.n0.N(charSequence2);
        java.lang.CharSequence charSequence3 = charSequence2;
        if (!z17) {
            if (!r26.n0.N(d0Var.j())) {
                charSequence3 = d0Var.j();
            } else {
                s15.h hVar = bVar.f366530e;
                charSequence3 = hVar.m75945x2fec8307(hVar.f384955d + 1);
            }
        }
        it.setText(charSequence3);
        return jz5.f0.f384359a;
    }
}
