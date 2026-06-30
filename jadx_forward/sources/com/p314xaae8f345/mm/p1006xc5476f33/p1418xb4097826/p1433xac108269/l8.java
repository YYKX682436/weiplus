package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes10.dex */
public final class l8 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f183896a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Float f183897b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Float f183898c;

    public l8(android.media.ExifInterface exif) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exif, "exif");
        this.f183896a = "Finder.GeoDegree";
        java.lang.String attribute = exif.getAttribute(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3216xb7785126);
        java.lang.String attribute2 = exif.getAttribute(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3217xb32bb9da);
        java.lang.String attribute3 = exif.getAttribute(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3218xa477fc15);
        java.lang.String attribute4 = exif.getAttribute(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3219x716e5549);
        if (attribute == null || attribute2 == null || attribute3 == null || attribute4 == null) {
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(attribute2, "N")) {
            this.f183897b = a(attribute);
        } else {
            java.lang.Float a17 = a(attribute);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
            this.f183897b = java.lang.Float.valueOf(0 - a17.floatValue());
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(attribute4, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3048xa13f9cad)) {
            this.f183898c = a(attribute3);
            return;
        }
        java.lang.Float a18 = a(attribute3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a18);
        this.f183898c = java.lang.Float.valueOf(0 - a18.floatValue());
    }

    public final java.lang.Float a(java.lang.String str) {
        try {
            java.lang.String[] strArr = (java.lang.String[]) new r26.t(",").g(str, 3).toArray(new java.lang.String[0]);
            java.lang.String[] strArr2 = (java.lang.String[]) new r26.t("/").g(strArr[0], 2).toArray(new java.lang.String[0]);
            double parseDouble = java.lang.Double.parseDouble(strArr2[0]) / java.lang.Double.parseDouble(strArr2[1]);
            java.lang.String[] strArr3 = (java.lang.String[]) new r26.t("/").g(strArr[1], 2).toArray(new java.lang.String[0]);
            double parseDouble2 = java.lang.Double.parseDouble(strArr3[0]) / java.lang.Double.parseDouble(strArr3[1]);
            java.lang.String[] strArr4 = (java.lang.String[]) new r26.t("/").g(strArr[2], 2).toArray(new java.lang.String[0]);
            return java.lang.Float.valueOf((float) (parseDouble + (parseDouble2 / 60) + ((java.lang.Double.parseDouble(strArr4[0]) / java.lang.Double.parseDouble(strArr4[1])) / 3600)));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f183896a, th6, "convertToDegree", new java.lang.Object[0]);
            return null;
        }
    }

    /* renamed from: toString */
    public java.lang.String m55513x9616526c() {
        return this.f183897b + ", " + this.f183898c;
    }
}
