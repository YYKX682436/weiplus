package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes10.dex */
public final class l8 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f102363a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Float f102364b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Float f102365c;

    public l8(android.media.ExifInterface exif) {
        kotlin.jvm.internal.o.g(exif, "exif");
        this.f102363a = "Finder.GeoDegree";
        java.lang.String attribute = exif.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE);
        java.lang.String attribute2 = exif.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE_REF);
        java.lang.String attribute3 = exif.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE);
        java.lang.String attribute4 = exif.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE_REF);
        if (attribute == null || attribute2 == null || attribute3 == null || attribute4 == null) {
            return;
        }
        if (kotlin.jvm.internal.o.b(attribute2, "N")) {
            this.f102364b = a(attribute);
        } else {
            java.lang.Float a17 = a(attribute);
            kotlin.jvm.internal.o.d(a17);
            this.f102364b = java.lang.Float.valueOf(0 - a17.floatValue());
        }
        if (kotlin.jvm.internal.o.b(attribute4, androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST)) {
            this.f102365c = a(attribute3);
            return;
        }
        java.lang.Float a18 = a(attribute3);
        kotlin.jvm.internal.o.d(a18);
        this.f102365c = java.lang.Float.valueOf(0 - a18.floatValue());
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
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f102363a, th6, "convertToDegree", new java.lang.Object[0]);
            return null;
        }
    }

    public java.lang.String toString() {
        return this.f102364b + ", " + this.f102365c;
    }
}
