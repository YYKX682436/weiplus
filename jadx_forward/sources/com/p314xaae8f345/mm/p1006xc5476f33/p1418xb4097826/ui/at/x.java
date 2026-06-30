package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at;

/* loaded from: classes.dex */
public final class x extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.t {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(int i17, com.p314xaae8f345.mm.p2621x8fb0427b.z3 contact, int i18, java.lang.String groupId) {
        super(i17, contact, i18);
        java.lang.String z07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupId, "groupId");
        if (i18 == 3) {
            jz5.f0 f0Var = null;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(contact.w0())) {
                com.p314xaae8f345.mm.p2621x8fb0427b.a3 z08 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(groupId);
                z07 = z08 != null ? z08.z0(contact.d1()) : null;
            } else {
                z07 = contact.w0();
            }
            java.lang.String str = "";
            z07 = z07 == null ? "" : z07;
            this.f210442o = z07;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07)) {
                java.lang.String f27 = contact.f2();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f27, "getDisplayNick(...)");
                this.f210442o = f27;
            }
            java.lang.String str2 = this.f210442o;
            if (str2 != null) {
                java.util.Locale locale = java.util.Locale.getDefault();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale, "getDefault(...)");
                str = str2.toUpperCase(locale);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toUpperCase(...)");
            }
            ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
            java.lang.String k17 = o13.n.k(str);
            char c17 = '{';
            if (k17 != null) {
                java.util.Locale locale2 = java.util.Locale.getDefault();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale2, "getDefault(...)");
                java.lang.String upperCase = k17.toUpperCase(locale2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(upperCase, "toUpperCase(...)");
                java.lang.String concat = upperCase.concat("\u007f");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(concat, "<set-?>");
                this.f210443p = concat;
                char[] charArray = upperCase.toCharArray();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(charArray, "toCharArray(...)");
                java.lang.Character R = kz5.z.R(charArray, 0);
                char charValue = R != null ? R.charValue() : ' ';
                if ('a' <= charValue && charValue < '{') {
                    charValue = (char) (charValue - ' ');
                } else {
                    if (!('A' <= charValue && charValue < '[')) {
                        charValue = '{';
                    }
                }
                this.f210440m = charValue;
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                java.lang.String concat2 = str.concat("\u007f");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(concat2, "<set-?>");
                this.f210443p = concat2;
                char[] charArray2 = str.toCharArray();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(charArray2, "toCharArray(...)");
                java.lang.Character R2 = kz5.z.R(charArray2, 0);
                char charValue2 = R2 != null ? R2.charValue() : ' ';
                if ('a' <= charValue2 && charValue2 < '{') {
                    c17 = (char) (charValue2 - ' ');
                } else {
                    if ('A' <= charValue2 && charValue2 < '[') {
                        c17 = charValue2;
                    }
                }
                this.f210440m = c17;
            }
            java.lang.String str3 = this.f210443p + str;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str3, "<set-?>");
            this.f210443p = str3;
            int i19 = this.f210440m;
            java.lang.String valueOf = (i19 < 65 || i19 > 90) ? "#" : java.lang.String.valueOf((char) i19);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueOf, "<set-?>");
            this.f210441n = valueOf;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderGroupAtSomeoneLiveItem", "displayName:" + str + " showHeadCode:" + ((char) this.f210440m) + " compareContent:" + this.f210443p);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.t, xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.t
    public void n() {
    }
}
