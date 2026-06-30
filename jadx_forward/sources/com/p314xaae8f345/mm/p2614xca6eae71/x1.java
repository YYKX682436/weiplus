package com.p314xaae8f345.mm.p2614xca6eae71;

@j95.b
/* loaded from: classes12.dex */
public class x1 extends i95.w implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.r, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.b7 {

    /* renamed from: e, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2614xca6eae71.x1 f274939e;

    /* renamed from: d, reason: collision with root package name */
    public final int f274940d = 300;

    private x1() {
    }

    public static com.p314xaae8f345.mm.p2614xca6eae71.x1 Di() {
        if (f274939e == null) {
            f274939e = new com.p314xaae8f345.mm.p2614xca6eae71.x1();
        }
        return f274939e;
    }

    public boolean Ai(java.lang.CharSequence charSequence) {
        com.p314xaae8f345.mm.p2614xca6eae71.g b17 = com.p314xaae8f345.mm.p2614xca6eae71.g.b();
        java.lang.String charSequence2 = charSequence.toString();
        b17.getClass();
        boolean z17 = com.p314xaae8f345.mm.p2614xca6eae71.q0.f274869d;
        com.p314xaae8f345.mm.p2614xca6eae71.l0.f274840a.getClass();
        if (charSequence2 == null) {
            return false;
        }
        if (charSequence2.length() == 0) {
            return false;
        }
        com.p314xaae8f345.mm.p2614xca6eae71.p pVar = com.p314xaae8f345.mm.p2614xca6eae71.m.f274842a;
        int length = charSequence2.length();
        com.p314xaae8f345.mm.p2614xca6eae71.r rVar = new com.p314xaae8f345.mm.p2614xca6eae71.r(pVar.f274862e);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        rVar.a(charSequence2, 0, length, new com.p314xaae8f345.mm.p2614xca6eae71.o(h0Var));
        com.p314xaae8f345.mm.p2614xca6eae71.a1 a1Var = (com.p314xaae8f345.mm.p2614xca6eae71.a1) h0Var.f391656d;
        return a1Var != null && (a1Var instanceof com.p314xaae8f345.mm.p2614xca6eae71.b2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0041 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Bi(java.lang.CharSequence r6) {
        /*
            r5 = this;
            com.tencent.mm.smiley.t1 r0 = com.p314xaae8f345.mm.p2614xca6eae71.t1.a()
            java.lang.String r6 = r6.toString()
            r0.getClass()
            java.lang.String r1 = "source"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r1)
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(r6)
            r2 = 0
            if (r1 == 0) goto L19
            goto L3e
        L19:
            com.tencent.mm.smiley.m1 r0 = r0.f274927k
            int r1 = r6.length()
            com.tencent.mm.smiley.r r3 = new com.tencent.mm.smiley.r
            com.tencent.mm.smiley.w1 r0 = r0.f274846a
            r3.<init>(r0)
            kotlin.jvm.internal.h0 r0 = new kotlin.jvm.internal.h0
            r0.<init>()
            com.tencent.mm.smiley.l1 r4 = new com.tencent.mm.smiley.l1
            r4.<init>(r0)
            r3.a(r6, r2, r1, r4)
            java.lang.Object r6 = r0.f391656d
            com.tencent.mm.smiley.a1 r6 = (com.p314xaae8f345.mm.p2614xca6eae71.a1) r6
            boolean r0 = r6 instanceof com.p314xaae8f345.mm.p2614xca6eae71.h1
            if (r0 == 0) goto L3e
            com.tencent.mm.smiley.h1 r6 = (com.p314xaae8f345.mm.p2614xca6eae71.h1) r6
            goto L3f
        L3e:
            r6 = 0
        L3f:
            if (r6 == 0) goto L42
            r2 = 1
        L42:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2614xca6eae71.x1.Bi(java.lang.CharSequence):boolean");
    }

    public android.text.SpannableString Ni(android.content.Context context, java.lang.CharSequence charSequence) {
        return Ri(charSequence, true);
    }

    public android.text.SpannableString Ri(java.lang.CharSequence charSequence, boolean z17) {
        boolean z18;
        if (charSequence == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(charSequence.toString())) {
            return new android.text.SpannableString("");
        }
        android.text.SpannableString spannableString = charSequence instanceof android.text.SpannableString ? (android.text.SpannableString) charSequence : new android.text.SpannableString(charSequence);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(spannableString.toString())) {
            return new android.text.SpannableString("");
        }
        com.p314xaae8f345.mm.p2614xca6eae71.g b17 = com.p314xaae8f345.mm.p2614xca6eae71.g.b();
        int i17 = this.f274940d;
        int length = spannableString.length();
        b17.getClass();
        if (spannableString.length() != 0) {
            if (!b17.f274787a) {
                int max = java.lang.Math.max(0, 0);
                int length2 = (length < 0 || length > spannableString.length()) ? spannableString.length() : length;
                while (true) {
                    if (max >= length2) {
                        z18 = false;
                        break;
                    }
                    int codePointAt = java.lang.Character.codePointAt(spannableString, max);
                    if ((codePointAt >= 8986 && codePointAt <= 11093) || (codePointAt >= 126980 && codePointAt <= 129784) || codePointAt == 65039) {
                        z18 = true;
                        break;
                    }
                    max += java.lang.Character.charCount(codePointAt);
                }
                if (z18 && !b17.f274787a) {
                    if (!b17.f274787a) {
                        synchronized (b17) {
                            if (!b17.f274787a) {
                                boolean z19 = com.p314xaae8f345.mm.p2614xca6eae71.q0.f274869d;
                                com.p314xaae8f345.mm.p2614xca6eae71.l0.f274840a.j();
                                b17.f274787a = true;
                            }
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiHelper", "Found emoji code and try to init emoji resources.");
                }
            }
            com.p314xaae8f345.mm.p2614xca6eae71.j jVar = new com.p314xaae8f345.mm.p2614xca6eae71.j(b17, new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f(0), i17, z17, new com.p314xaae8f345.mm.p2614xca6eae71.h(b17, spannableString));
            com.p314xaae8f345.mm.p2614xca6eae71.f0 f0Var = com.p314xaae8f345.mm.p2614xca6eae71.e0.f274771a;
            f0Var.getClass();
            new com.p314xaae8f345.mm.p2614xca6eae71.r(f0Var.f274783a).a(spannableString, 0, length, jVar);
        }
        wi(spannableString, 0, spannableString.length(), 1);
        return spannableString;
    }

    public void wi(android.text.Spannable spannable, int i17, int i18, int i19) {
        if (spannable == null || ((al5.w[]) spannable.getSpans(i17, i18, al5.w.class)).length <= 0) {
            return;
        }
        for (java.lang.Object obj : (jg5.b[]) spannable.getSpans(i17, i18, jg5.b.class)) {
            spannable.removeSpan(obj);
        }
        jg5.b bVar = new jg5.b(i17, i18, i19);
        java.lang.CharSequence subSequence = spannable.subSequence(i17, i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subSequence, "<set-?>");
        bVar.f381197b = subSequence;
        spannable.setSpan(bVar, i17, i18, 33);
    }
}
