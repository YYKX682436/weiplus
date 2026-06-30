package bn;

/* loaded from: classes15.dex */
public class c implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27175x8885f30b {
    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27175x8885f30b
    /* renamed from: battery */
    public float mo10844xec41ae0d() {
        return ph.t.k().c().b();
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27175x8885f30b
    /* renamed from: brand */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraDeviceBrand mo10845x59a4b87() {
        java.lang.String lowerCase = android.os.Build.BRAND.toLowerCase();
        return lowerCase.equals("oppo") ? com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraDeviceBrand.CARA_DEVICE_BRAND_OPPO : lowerCase.equals("vivo") ? com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraDeviceBrand.CARA_DEVICE_BRAND_VIVO : lowerCase.equals("xiaomi") ? com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraDeviceBrand.CARA_DEVICE_BRAND_XIAOMI : lowerCase.equals("huawei") ? com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraDeviceBrand.CARA_DEVICE_BRAND_HUAWEI : lowerCase.equals("honor") ? com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraDeviceBrand.CARA_DEVICE_BRAND_HONOR : lowerCase.equals("samsung") ? com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraDeviceBrand.CARA_DEVICE_BRAND_SAMSUNG : lowerCase.equals("oneplus") ? com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraDeviceBrand.CARA_DEVICE_BRAND_ONEPLUS : lowerCase.equals("realme") ? com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraDeviceBrand.CARA_DEVICE_BRAND_REALME : lowerCase.equals("redmi") ? com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraDeviceBrand.CARA_DEVICE_BRAND_REDMI : com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraDeviceBrand.CARA_DEVICE_BRAND_UNKNOWN;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27175x8885f30b
    /* renamed from: isCharging */
    public boolean mo10846x265109bb() {
        return ph.t.k().c().d();
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27175x8885f30b
    /* renamed from: isReachable */
    public boolean mo10847x2a0bf43() {
        return com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27175x8885f30b
    /* renamed from: networkType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraNetworkType mo10848x8c549688() {
        int m40117xee32071e = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.m40117xee32071e();
        if (m40117xee32071e == -1) {
            return com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraNetworkType.CARA_NETWORK_TYPE_UNKNOWN;
        }
        if (m40117xee32071e == 1) {
            return com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraNetworkType.CARA_NETWORK_TYPE_WIFI;
        }
        if (m40117xee32071e == 7) {
            return com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraNetworkType.CARA_NETWORK_TYPE_MOBILE_5G;
        }
        if (m40117xee32071e != 3 && m40117xee32071e != 4) {
            return m40117xee32071e != 5 ? com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraNetworkType.CARA_NETWORK_TYPE_UNKNOWN : com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraNetworkType.CARA_NETWORK_TYPE_MOBILE_4G;
        }
        return com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraNetworkType.CARA_NETWORK_TYPE_MOBILE_LOW;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27175x8885f30b
    /* renamed from: screenSize */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize mo10849xe71efe8d() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize.Builder m111447x3136c9db = com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize.m111447x3136c9db();
        m111447x3136c9db.m111471x53e9ee84(com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).f278668a);
        m111447x3136c9db.m111470xf84e829(com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).f278669b);
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize) m111447x3136c9db.mo20556x59bc66e();
    }
}
