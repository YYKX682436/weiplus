package ak4;

/* loaded from: classes11.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final ak4.g f87158a = new ak4.g();

    public static /* synthetic */ java.lang.CharSequence b(ak4.g gVar, android.view.View view, java.lang.String str, java.lang.CharSequence charSequence, bi4.c cVar, xe0.u0 u0Var, boolean z17, android.view.View.OnClickListener onClickListener, bi4.d dVar, xe0.m0 m0Var, int i17, java.lang.Object obj) {
        return gVar.a(view, str, charSequence, cVar, u0Var, z17, (i17 & 64) != 0 ? null : onClickListener, (i17 & 128) != 0 ? bi4.d.FILLED : dVar, (i17 & 256) != 0 ? xe0.m0.f535287d : m0Var);
    }

    public final java.lang.CharSequence a(android.view.View view, java.lang.String username, java.lang.CharSequence displayName, bi4.c cVar, xe0.u0 style, boolean z17, android.view.View.OnClickListener onClickListener, bi4.d iconType, xe0.m0 position) {
        ak4.d c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayName, "displayName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconType, "iconType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(position, "position");
        if (!r26.n0.N(username)) {
            if ((displayName.length() == 0) || (c17 = c(view, username, cVar, style, z17, onClickListener, iconType)) == null) {
                return displayName;
            }
            int ordinal = position.ordinal();
            if (ordinal == 0) {
                android.text.SpannableStringBuilder append = new android.text.SpannableStringBuilder().append((char) 8199).append(displayName);
                append.setSpan(c17, 0, 1, 34);
                return append;
            }
            if (ordinal != 1) {
                throw new jz5.j();
            }
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(displayName);
            if (!r26.n0.E(spannableStringBuilder, (char) 8199, false, 2, null)) {
                spannableStringBuilder.append((char) 8199);
            }
            spannableStringBuilder.setSpan(c17, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 34);
            return spannableStringBuilder;
        }
        return displayName;
    }

    public final ak4.d c(android.view.View view, java.lang.String username, bi4.c cVar, xe0.u0 style, boolean z17, android.view.View.OnClickListener onClickListener, bi4.d iconType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconType, "iconType");
        if (r26.n0.N(username)) {
            return null;
        }
        try {
            mj4.h M = ai4.m0.f86706a.M(username);
            if (M == null) {
                M = qi4.v.f445321a.e(username);
            }
            mj4.h hVar = M;
            java.lang.String h17 = hVar != null ? ((mj4.k) hVar).h() : null;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17)) {
                return null;
            }
            if (hVar != null) {
                ((mj4.k) hVar).l();
            }
            if (hVar != null) {
                ((mj4.k) hVar).z();
            }
            java.util.Objects.toString(iconType);
            ak4.d dVar = new ak4.d(view, username, h17, iconType, cVar, style, hVar, onClickListener);
            if (z17) {
                if (view != null) {
                    new ak4.j(view, dVar, username);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TextStatus.TSItemSpanFactory", "[TSItemSpan] createByUsername skip listener: attachView=null username=".concat(username));
                }
            }
            return dVar;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TextStatus.TSItemSpanFactory", th6, "createByUsername err: username=".concat(username), new java.lang.Object[0]);
            return null;
        }
    }
}
