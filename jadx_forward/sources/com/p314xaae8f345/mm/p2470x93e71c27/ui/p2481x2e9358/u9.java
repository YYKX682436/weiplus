package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public final class u9 {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f272216c = kz5.c1.k(new jz5.l('(', ")"), new jz5.l((char) 65288, "）"), new jz5.l((char) 12304, "】"), new jz5.l('<', ">"));

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f272217d = kz5.c0.i(".", ".", "、", ")", "）", "】");

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f272218a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f272219b;

    public u9(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 chatFooter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatFooter, "chatFooter");
        this.f272218a = chatFooter;
    }

    public static final boolean a(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u9 u9Var, int i17, fl5.i iVar) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.s9 b17;
        if (i17 != 0) {
            u9Var.getClass();
            if (i17 != 1) {
                return false;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<this>");
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(iVar.m129682xb5887064(com.p314xaae8f345.mm.R.id.bkv), java.lang.Boolean.TRUE)) {
                iVar.m129683xca0297d8(com.p314xaae8f345.mm.R.id.bkv, java.lang.Boolean.FALSE);
                return false;
            }
            int mo81569x6f2c472c = iVar.mo81569x6f2c472c();
            android.text.Editable text = iVar.getText();
            if (text == null || r26.n0.N(text)) {
                b17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.s9.f272181j;
            } else {
                java.lang.String v17 = r26.i0.v(text.subSequence(0, mo81569x6f2c472c).toString(), "\u200b", "", false, 4, null);
                if (v17.charAt(v17.length() - 1) != '\n') {
                    b17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.s9.f272181j;
                } else {
                    java.lang.String substring = v17.substring(0, v17.length() - 1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                    b17 = u9Var.b(substring);
                }
            }
            if (!(!r26.n0.N((java.lang.String) ((jz5.n) b17.f272190i).mo141623x754a37bb()))) {
                return false;
            }
            try {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.Character ch6 = b17.f272183b;
                if (ch6 != null) {
                    sb6.append(ch6.charValue());
                }
                sb6.append((java.lang.String) ((jz5.n) b17.f272190i).mo141623x754a37bb());
                java.lang.String str = b17.f272184c;
                if (str != null) {
                    sb6.append(str);
                }
                if (b17.f272187f) {
                    sb6.append(" ");
                }
                text.insert(mo81569x6f2c472c, sb6);
                int i18 = !u9Var.f272219b ? 1 : 0;
                java.lang.String a17 = b17.a();
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6628xef1f4b81 c6628xef1f4b81 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6628xef1f4b81();
                c6628xef1f4b81.f139800d = 2;
                c6628xef1f4b81.f139801e = c6628xef1f4b81.b("CompleteSeq", a17, true);
                c6628xef1f4b81.f139802f = i18;
                java.lang.String n17 = c6628xef1f4b81.n();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SAInputReporter", "report%s %s", 27027, r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ", false));
                c6628xef1f4b81.k();
                if (!u9Var.f272219b) {
                    u9Var.f272219b = true;
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("ChatFooterKtHelper", th6, "edt insert err", new java.lang.Object[0]);
                return false;
            }
        } else {
            if (!u9Var.d(iVar)) {
                return false;
            }
            iVar.m129683xca0297d8(com.p314xaae8f345.mm.R.id.bkv, java.lang.Boolean.TRUE);
        }
        return true;
    }

    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.s9 b(java.lang.CharSequence charSequence) {
        java.lang.String str;
        if (charSequence == null || r26.n0.N(charSequence)) {
            return com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.s9.f272181j;
        }
        java.lang.String obj = charSequence.toString();
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i17 = length - 1;
                if (charSequence.charAt(length) == 8203) {
                    break;
                }
                if (i17 < 0) {
                    break;
                }
                length = i17;
            }
        }
        length = -1;
        if (length == -1) {
            length = charSequence.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i18 = length - 1;
                    if (charSequence.charAt(length) == '\n') {
                        break;
                    }
                    if (i18 < 0) {
                        break;
                    }
                    length = i18;
                }
            }
            length = -1;
        }
        int i19 = length != -1 ? length + 1 : 0;
        java.lang.Character valueOf = obj.length() > i19 ? java.lang.Character.valueOf(obj.charAt(i19)) : null;
        java.util.Map map = f272216c;
        if (map.containsKey(valueOf)) {
            str = (java.lang.String) map.get(valueOf);
            i19++;
        } else {
            valueOf = null;
            str = null;
        }
        if (i19 == -1) {
            return com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.s9.f272181j;
        }
        if (str != null) {
            return c(i19, obj, valueOf, str);
        }
        java.util.Iterator it = f272217d.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.s9 c17 = c(i19, obj, null, (java.lang.String) it.next());
            if (!r26.n0.N((java.lang.String) ((jz5.n) c17.f272190i).mo141623x754a37bb())) {
                return c17;
            }
        }
        return c(i19, obj, null, null);
    }

    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.s9 c(int i17, java.lang.String str, java.lang.Character ch6, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "str");
        int L = str2 != null ? r26.n0.L(str, str2, i17, false, 4, null) : i17 + 1;
        if (L == -1 || i17 >= L || str.length() < L) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.s9 s9Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.s9.f272181j;
            return com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.s9.f272181j;
        }
        java.lang.String obj = str.subSequence(i17, L).toString();
        if (ch6 != null) {
            i17--;
        }
        int i18 = i17;
        boolean z17 = false;
        int length = L + (str2 != null ? str2.length() : 0);
        if (str.length() > length && str.charAt(length) == ' ') {
            z17 = true;
        }
        boolean z18 = z17;
        int i19 = length + (z18 ? 1 : 0);
        return new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.s9(obj, ch6, str2, i18, i19, z18, str.length() > i19 ? java.lang.Character.valueOf(str.charAt(i19)) : null);
    }

    public final boolean d(fl5.i edt) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(edt, "edt");
        int mo81569x6f2c472c = edt.mo81569x6f2c472c();
        android.text.Editable text = edt.getText();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(text);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.s9 b17 = b(text.subSequence(0, mo81569x6f2c472c).toString());
        if ((!r26.n0.N((java.lang.String) ((jz5.n) b17.f272190i).mo141623x754a37bb())) && (i17 = b17.f272186e) == mo81569x6f2c472c) {
            try {
                text.delete(b17.f272185d, i17);
                return true;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("ChatFooterKtHelper", th6, "edt delete err", new java.lang.Object[0]);
            }
        }
        return false;
    }
}
