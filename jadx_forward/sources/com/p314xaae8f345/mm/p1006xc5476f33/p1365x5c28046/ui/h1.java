package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes13.dex */
public final class h1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.h1 f179582d = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.h1();

    public h1() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        o12.u it = (o12.u) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.String hexString = java.lang.Integer.toHexString(it.f423718c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(hexString, "toHexString(...)");
        java.lang.String substring = hexString.substring(2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        android.os.LocaleList localeList = android.os.LocaleList.getDefault();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(localeList, "getDefault()");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = localeList.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.util.Locale locale = localeList.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale, "localeList[i]");
            arrayList.add(new h2.a(locale));
        }
        h2.e platformLocale = (h2.e) arrayList.get(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(platformLocale, "platformLocale");
        java.lang.String upperCase = substring.toUpperCase(((h2.a) platformLocale).f359789a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }
}
