package org.p3343x72743996.p3344x2e06d1;

@org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29387x20efb56(m152783x6ac9171 = "base::android")
@org.p3343x72743996.p3353x59bc66e.p3354xc6ad7b24.InterfaceC29461x94c0977e
/* renamed from: org.chromium.base.TimezoneUtils */
/* loaded from: classes13.dex */
class C29370x509f1c18 {
    private C29370x509f1c18() {
    }

    /* renamed from: getDefaultTimeZoneId */
    private static java.lang.String m152686xa0ca3f7f() {
        android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        java.lang.String id6 = java.util.TimeZone.getDefault().getID();
        android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
        return id6;
    }
}
