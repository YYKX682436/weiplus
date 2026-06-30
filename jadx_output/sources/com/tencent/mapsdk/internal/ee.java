package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public interface ee extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component {
    int a(java.lang.String str);

    com.tencent.map.sdk.comps.vis.VisualLayer a(com.tencent.map.sdk.comps.vis.VisualLayerOptions visualLayerOptions);

    java.lang.String a(com.tencent.map.sdk.comps.vis.VisualLayer visualLayer, java.lang.String str);

    void a(java.lang.String str, int i17);

    void a(java.lang.String str, int i17, int i18);

    void a(java.lang.String str, com.tencent.map.tools.Callback<byte[]> callback);

    void a(java.lang.String str, byte[] bArr);

    void a(org.json.JSONObject jSONObject);

    boolean a();

    void b(java.lang.String str);

    void b(java.lang.String str, com.tencent.map.tools.Callback<byte[]> callback);

    void c(java.lang.String str);

    java.lang.String d(java.lang.String str);

    boolean e(java.lang.String str);

    void f(java.lang.String str);

    void g(java.lang.String str);

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component
    /* renamed from: n_, reason: merged with bridge method [inline-methods] */
    com.tencent.mapsdk.internal.bn getMapContext();
}
