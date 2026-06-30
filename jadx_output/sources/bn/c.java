package bn;

/* loaded from: classes15.dex */
public class c implements com.tencent.wechat.aff.cara.CaraNativeDeviceBase {
    @Override // com.tencent.wechat.aff.cara.CaraNativeDeviceBase
    public float battery() {
        return ph.t.k().c().b();
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeDeviceBase
    public com.tencent.wechat.aff.cara.CaraFoundationProto.CaraDeviceBrand brand() {
        java.lang.String lowerCase = android.os.Build.BRAND.toLowerCase();
        return lowerCase.equals("oppo") ? com.tencent.wechat.aff.cara.CaraFoundationProto.CaraDeviceBrand.CARA_DEVICE_BRAND_OPPO : lowerCase.equals("vivo") ? com.tencent.wechat.aff.cara.CaraFoundationProto.CaraDeviceBrand.CARA_DEVICE_BRAND_VIVO : lowerCase.equals("xiaomi") ? com.tencent.wechat.aff.cara.CaraFoundationProto.CaraDeviceBrand.CARA_DEVICE_BRAND_XIAOMI : lowerCase.equals("huawei") ? com.tencent.wechat.aff.cara.CaraFoundationProto.CaraDeviceBrand.CARA_DEVICE_BRAND_HUAWEI : lowerCase.equals("honor") ? com.tencent.wechat.aff.cara.CaraFoundationProto.CaraDeviceBrand.CARA_DEVICE_BRAND_HONOR : lowerCase.equals("samsung") ? com.tencent.wechat.aff.cara.CaraFoundationProto.CaraDeviceBrand.CARA_DEVICE_BRAND_SAMSUNG : lowerCase.equals("oneplus") ? com.tencent.wechat.aff.cara.CaraFoundationProto.CaraDeviceBrand.CARA_DEVICE_BRAND_ONEPLUS : lowerCase.equals("realme") ? com.tencent.wechat.aff.cara.CaraFoundationProto.CaraDeviceBrand.CARA_DEVICE_BRAND_REALME : lowerCase.equals("redmi") ? com.tencent.wechat.aff.cara.CaraFoundationProto.CaraDeviceBrand.CARA_DEVICE_BRAND_REDMI : com.tencent.wechat.aff.cara.CaraFoundationProto.CaraDeviceBrand.CARA_DEVICE_BRAND_UNKNOWN;
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeDeviceBase
    public boolean isCharging() {
        return ph.t.k().c().d();
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeDeviceBase
    public boolean isReachable() {
        return com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeDeviceBase
    public com.tencent.wechat.aff.cara.CaraFoundationProto.CaraNetworkType networkType() {
        int statisticsNetType = com.tencent.mars.comm.PlatformComm.C2Java.getStatisticsNetType();
        if (statisticsNetType == -1) {
            return com.tencent.wechat.aff.cara.CaraFoundationProto.CaraNetworkType.CARA_NETWORK_TYPE_UNKNOWN;
        }
        if (statisticsNetType == 1) {
            return com.tencent.wechat.aff.cara.CaraFoundationProto.CaraNetworkType.CARA_NETWORK_TYPE_WIFI;
        }
        if (statisticsNetType == 7) {
            return com.tencent.wechat.aff.cara.CaraFoundationProto.CaraNetworkType.CARA_NETWORK_TYPE_MOBILE_5G;
        }
        if (statisticsNetType != 3 && statisticsNetType != 4) {
            return statisticsNetType != 5 ? com.tencent.wechat.aff.cara.CaraFoundationProto.CaraNetworkType.CARA_NETWORK_TYPE_UNKNOWN : com.tencent.wechat.aff.cara.CaraFoundationProto.CaraNetworkType.CARA_NETWORK_TYPE_MOBILE_4G;
        }
        return com.tencent.wechat.aff.cara.CaraFoundationProto.CaraNetworkType.CARA_NETWORK_TYPE_MOBILE_LOW;
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeDeviceBase
    public com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize screenSize() {
        com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize.Builder newBuilder = com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize.newBuilder();
        newBuilder.setWidth(com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a).f197135a);
        newBuilder.setHeight(com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a).f197136b);
        return (com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize) newBuilder.build();
    }
}
