package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class e6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.emoji.ui.e6 f97964d = new com.tencent.mm.plugin.emoji.ui.e6();

    public e6() {
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
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.o.f(locale, "getDefault(...)");
        java.lang.String upperCase = substring.toUpperCase(locale);
        kotlin.jvm.internal.o.f(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
