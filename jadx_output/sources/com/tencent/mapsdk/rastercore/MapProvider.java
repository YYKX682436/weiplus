package com.tencent.mapsdk.rastercore;

/* loaded from: classes13.dex */
public class MapProvider {
    private com.tencent.tencentmap.mapsdk.map.TencentMapOptions mTencentMapOptions;

    public static java.lang.String getMapSdkPath() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        synchronized (lp0.b.class) {
            str = lp0.b.d0() + "/MicroMsg/";
        }
        sb6.append(str);
        sb6.append("mapsdk");
        java.lang.String sb7 = sb6.toString();
        if (!com.tencent.mm.vfs.w6.j(sb7)) {
            com.tencent.mm.vfs.w6.u(sb7);
        }
        return sb7;
    }

    public com.tencent.tencentmap.mapsdk.map.IMapView getMapView(android.content.Context context, com.tencent.tencentmap.mapsdk.map.TencentMapOptions tencentMapOptions) {
        this.mTencentMapOptions = tencentMapOptions;
        int mapType = tencentMapOptions != null ? tencentMapOptions.getMapType() : 0;
        if (mapType == 0) {
            com.tencent.mapsdk.rastercore.LogHelper.e("maptype", "glmapview");
            return new ey5.d(context, this.mTencentMapOptions);
        }
        if (mapType == 1) {
            ey5.s sVar = new ey5.s(context, this.mTencentMapOptions);
            com.tencent.mapsdk.rastercore.LogHelper.e("maptype", "maprenderlayer");
            return sVar;
        }
        if (mapType != 2) {
            return new ey5.d(context, this.mTencentMapOptions);
        }
        ey5.a aVar = new ey5.a(context, this.mTencentMapOptions);
        com.tencent.mapsdk.rastercore.LogHelper.e("maptype", "texturemapview");
        return aVar;
    }
}
