package pg5;

/* loaded from: classes12.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static pg5.c f435785a;

    public static java.lang.CharSequence a(android.content.Context context, java.lang.CharSequence charSequence) {
        pg5.c cVar = f435785a;
        if (cVar == null) {
            return charSequence;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f1) cVar).getClass();
        return com.p314xaae8f345.mm.p2614xca6eae71.x1.Di().Ri(charSequence, true);
    }

    public static java.lang.CharSequence b(java.lang.CharSequence charSequence, boolean z17) {
        pg5.c cVar = f435785a;
        if (cVar == null) {
            return charSequence;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f1) cVar).getClass();
        return com.p314xaae8f345.mm.p2614xca6eae71.x1.Di().Ri(charSequence, z17);
    }

    public static pg5.b c(android.view.View view, pg5.a aVar) {
        pg5.b bVar;
        if (f435785a == null) {
            return null;
        }
        com.p314xaae8f345.mm.p2614xca6eae71.x1 Di = com.p314xaae8f345.mm.p2614xca6eae71.x1.Di();
        Di.getClass();
        com.p314xaae8f345.mm.p2614xca6eae71.g b17 = com.p314xaae8f345.mm.p2614xca6eae71.g.b();
        b17.getClass();
        java.lang.CharSequence charSequence = aVar.f435775a;
        int i17 = aVar.f435778d;
        int i18 = aVar.f435779e;
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f(0);
        android.text.Spannable spannableString = aVar.f435780f ? charSequence instanceof android.text.SpannableString ? (android.text.SpannableString) charSequence : charSequence instanceof android.text.SpannableStringBuilder ? (android.text.SpannableStringBuilder) charSequence : new android.text.SpannableString(charSequence) : null;
        int length = charSequence.length();
        int i19 = aVar.f435777c;
        int i27 = aVar.f435776b;
        if (length == 0) {
            bVar = new pg5.b(null, c19767x257d7f.f38864x6ac9171);
        } else if (spannableString == null) {
            bVar = new pg5.b(null, c19767x257d7f.f38864x6ac9171);
        } else {
            if (aVar.f435781g) {
                for (com.p314xaae8f345.mm.p2614xca6eae71.r0 r0Var : (com.p314xaae8f345.mm.p2614xca6eae71.r0[]) spannableString.getSpans(0, charSequence.length(), com.p314xaae8f345.mm.p2614xca6eae71.r0.class)) {
                    spannableString.removeSpan(r0Var);
                }
            }
            com.p314xaae8f345.mm.p2614xca6eae71.i iVar = new com.p314xaae8f345.mm.p2614xca6eae71.i(b17, new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f(0), i18, c19767x257d7f, i17, spannableString, aVar);
            com.p314xaae8f345.mm.p2614xca6eae71.f0 f0Var = com.p314xaae8f345.mm.p2614xca6eae71.e0.f274771a;
            f0Var.getClass();
            new com.p314xaae8f345.mm.p2614xca6eae71.r(f0Var.f274783a).a(spannableString, i27, i19, iVar);
            bVar = new pg5.b(spannableString, c19767x257d7f.f38864x6ac9171);
        }
        Di.wi(bVar.f435783a, i27, i19, aVar.f435778d);
        return bVar;
    }

    public static int d(android.content.Context context, java.lang.String str, int i17) {
        pg5.c cVar = f435785a;
        if (cVar == null) {
            return i17;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f1) cVar).getClass();
        com.p314xaae8f345.mm.p2614xca6eae71.x1.Di().getClass();
        com.p314xaae8f345.mm.p2614xca6eae71.m1 m1Var = com.p314xaae8f345.mm.p2614xca6eae71.t1.a().f274927k;
        com.p314xaae8f345.mm.p2614xca6eae71.r rVar = new com.p314xaae8f345.mm.p2614xca6eae71.r(m1Var.f274846a);
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        f0Var.f391649d = i17;
        int i18 = m1Var.f274847b;
        rVar.a(str, i17 - i18, i18 + i17, new com.p314xaae8f345.mm.p2614xca6eae71.k1(i17, f0Var));
        return f0Var.f391649d;
    }
}
