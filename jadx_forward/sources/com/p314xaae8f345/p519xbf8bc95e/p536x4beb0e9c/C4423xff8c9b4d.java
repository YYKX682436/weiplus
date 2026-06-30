package com.p314xaae8f345.p519xbf8bc95e.p536x4beb0e9c;

/* renamed from: com.tencent.mapsdk.rastercore.MapProvider */
/* loaded from: classes13.dex */
public class C4423xff8c9b4d {

    /* renamed from: mTencentMapOptions */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25946x7e4576a7 f17538x3062bdda;

    /* renamed from: getMapSdkPath */
    public static java.lang.String m37443x694b1279() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        synchronized (lp0.b.class) {
            str = lp0.b.d0() + "/MicroMsg/";
        }
        sb6.append(str);
        sb6.append("mapsdk");
        java.lang.String sb7 = sb6.toString();
        if (!com.p314xaae8f345.mm.vfs.w6.j(sb7)) {
            com.p314xaae8f345.mm.vfs.w6.u(sb7);
        }
        return sb7;
    }

    /* renamed from: getMapView */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998 m37444x6fad81eb(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25946x7e4576a7 c25946x7e4576a7) {
        this.f17538x3062bdda = c25946x7e4576a7;
        int m99048x6facd680 = c25946x7e4576a7 != null ? c25946x7e4576a7.m99048x6facd680() : 0;
        if (m99048x6facd680 == 0) {
            com.p314xaae8f345.p519xbf8bc95e.p536x4beb0e9c.C4422xd8343bf2.e("maptype", "glmapview");
            return new ey5.d(context, this.f17538x3062bdda);
        }
        if (m99048x6facd680 == 1) {
            ey5.s sVar = new ey5.s(context, this.f17538x3062bdda);
            com.p314xaae8f345.p519xbf8bc95e.p536x4beb0e9c.C4422xd8343bf2.e("maptype", "maprenderlayer");
            return sVar;
        }
        if (m99048x6facd680 != 2) {
            return new ey5.d(context, this.f17538x3062bdda);
        }
        ey5.a aVar = new ey5.a(context, this.f17538x3062bdda);
        com.p314xaae8f345.p519xbf8bc95e.p536x4beb0e9c.C4422xd8343bf2.e("maptype", "texturemapview");
        return aVar;
    }
}
