package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes13.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.emoji.ui.h1 f98049d = new com.tencent.mm.plugin.emoji.ui.h1();

    public h1() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        o12.u it = (o12.u) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String hexString = java.lang.Integer.toHexString(it.f342185c);
        kotlin.jvm.internal.o.f(hexString, "toHexString(...)");
        java.lang.String substring = hexString.substring(2);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        android.os.LocaleList localeList = android.os.LocaleList.getDefault();
        kotlin.jvm.internal.o.f(localeList, "getDefault()");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = localeList.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.util.Locale locale = localeList.get(i17);
            kotlin.jvm.internal.o.f(locale, "localeList[i]");
            arrayList.add(new h2.a(locale));
        }
        h2.e platformLocale = (h2.e) arrayList.get(0);
        kotlin.jvm.internal.o.g(platformLocale, "platformLocale");
        java.lang.String upperCase = substring.toUpperCase(((h2.a) platformLocale).f278256a);
        kotlin.jvm.internal.o.f(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }
}
