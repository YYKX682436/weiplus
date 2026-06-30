package org.p3343x72743996.net.p3358x316220;

/* renamed from: org.chromium.net.impl.CronetManifest */
/* loaded from: classes13.dex */
public final class C29605x3f4fad2c {

    /* renamed from: ENABLE_TELEMETRY_META_DATA_KEY */
    static final java.lang.String f74599x18ab3842 = "android.net.http.EnableTelemetry";

    /* renamed from: META_DATA_HOLDER_SERVICE_NAME */
    static final java.lang.String f74600xd01ace8d = "android.net.http.MetaDataHolder";

    /* renamed from: READ_HTTP_FLAGS_META_DATA_KEY */
    public static final java.lang.String f74601x6546859e = "android.net.http.EXPERIMENTAL_ReadHttpFlags";

    private C29605x3f4fad2c() {
    }

    /* renamed from: getMetaData */
    private static android.os.Bundle m154127x60f92cc5(android.content.Context context) {
        android.content.pm.ServiceInfo serviceInfo;
        try {
            serviceInfo = context.getPackageManager().getServiceInfo(new android.content.ComponentName(context, f74600xd01ace8d), 787072);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            serviceInfo = null;
        }
        return serviceInfo != null ? serviceInfo.metaData : new android.os.Bundle();
    }

    /* renamed from: isAppOptedInForTelemetry */
    public static boolean m154128xcc2c67d0(android.content.Context context, org.p3343x72743996.net.p3358x316220.AbstractC29603x6ebc0fcd.CronetSource cronetSource) {
        return m154127x60f92cc5(context).getBoolean(f74599x18ab3842, cronetSource == org.p3343x72743996.net.p3358x316220.AbstractC29603x6ebc0fcd.CronetSource.CRONET_SOURCE_PLATFORM || cronetSource == org.p3343x72743996.net.p3358x316220.AbstractC29603x6ebc0fcd.CronetSource.CRONET_SOURCE_PLAY_SERVICES);
    }

    /* renamed from: shouldReadHttpFlags */
    public static boolean m154129x3a7f6ef6(android.content.Context context) {
        return m154127x60f92cc5(context).getBoolean(f74601x6546859e, false);
    }
}
