package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes8.dex */
public final class tb {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f133108a = "TMS-Oaid";

    /* renamed from: b, reason: collision with root package name */
    private static java.lang.String f133109b = "";

    /* renamed from: c, reason: collision with root package name */
    private static boolean f133110c = true;

    /* renamed from: d, reason: collision with root package name */
    private static com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 f133111d = new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56() { // from class: com.tencent.mapsdk.internal.tb.1
        @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56
        /* renamed from: onResult */
        public final void mo36999x57429edc(boolean z17, java.lang.String str, java.lang.String str2) {
            boolean unused = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tb.f133110c = z17;
            if (z17) {
                java.lang.String unused2 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tb.f133109b = str2;
            }
        }
    };

    public static java.lang.String a(android.content.Context context) {
        if (!f133110c) {
            return "undefined";
        }
        if (!android.text.TextUtils.isEmpty(f133109b) && f133110c) {
            return f133109b;
        }
        try {
            new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.C26783xb1033125().m105541x179e520c(context, f133111d);
        } catch (java.lang.Exception unused) {
        }
        return f133109b;
    }
}
