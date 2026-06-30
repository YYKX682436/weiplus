package com.tencent.mapsdk.internal;

/* loaded from: classes8.dex */
public final class tb {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f51575a = "TMS-Oaid";

    /* renamed from: b, reason: collision with root package name */
    private static java.lang.String f51576b = "";

    /* renamed from: c, reason: collision with root package name */
    private static boolean f51577c = true;

    /* renamed from: d, reason: collision with root package name */
    private static com.tencent.tmsqmsp.oaid2.IVendorCallback f51578d = new com.tencent.tmsqmsp.oaid2.IVendorCallback() { // from class: com.tencent.mapsdk.internal.tb.1
        @Override // com.tencent.tmsqmsp.oaid2.IVendorCallback
        public final void onResult(boolean z17, java.lang.String str, java.lang.String str2) {
            boolean unused = com.tencent.mapsdk.internal.tb.f51577c = z17;
            if (z17) {
                java.lang.String unused2 = com.tencent.mapsdk.internal.tb.f51576b = str2;
            }
        }
    };

    public static java.lang.String a(android.content.Context context) {
        if (!f51577c) {
            return "undefined";
        }
        if (!android.text.TextUtils.isEmpty(f51576b) && f51577c) {
            return f51576b;
        }
        try {
            new com.tencent.tmsqmsp.oaid2.VendorManager().getVendorInfo(context, f51578d);
        } catch (java.lang.Exception unused) {
        }
        return f51576b;
    }
}
