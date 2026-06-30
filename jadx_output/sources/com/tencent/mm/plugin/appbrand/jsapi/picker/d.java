package com.tencent.mm.plugin.appbrand.jsapi.picker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes15.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.picker.d f82714e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.picker.d f82715f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.picker.d f82716g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.picker.d[] f82717h;

    /* renamed from: d, reason: collision with root package name */
    public final java.text.DateFormat f82718d;

    static {
        java.util.Locale locale = java.util.Locale.US;
        com.tencent.mm.plugin.appbrand.jsapi.picker.d dVar = new com.tencent.mm.plugin.appbrand.jsapi.picker.d("YEAR", 0, new java.text.SimpleDateFormat("yyyy", locale));
        f82714e = dVar;
        com.tencent.mm.plugin.appbrand.jsapi.picker.d dVar2 = new com.tencent.mm.plugin.appbrand.jsapi.picker.d("MONTH", 1, new java.text.SimpleDateFormat("yyyy-MM", locale));
        f82715f = dVar2;
        com.tencent.mm.plugin.appbrand.jsapi.picker.d dVar3 = new com.tencent.mm.plugin.appbrand.jsapi.picker.d("DAY", 2, new java.text.SimpleDateFormat("yyyy-MM-dd", locale));
        f82716g = dVar3;
        f82717h = new com.tencent.mm.plugin.appbrand.jsapi.picker.d[]{dVar, dVar2, dVar3};
    }

    public d(java.lang.String str, int i17, java.text.DateFormat dateFormat) {
        this.f82718d = dateFormat;
    }

    public static com.tencent.mm.plugin.appbrand.jsapi.picker.d valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.appbrand.jsapi.picker.d) java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.jsapi.picker.d.class, str);
    }

    public static com.tencent.mm.plugin.appbrand.jsapi.picker.d[] values() {
        return (com.tencent.mm.plugin.appbrand.jsapi.picker.d[]) f82717h.clone();
    }
}
