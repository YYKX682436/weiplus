package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class sz extends com.tencent.mapsdk.internal.tr {
    public sz(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions, android.view.ViewGroup viewGroup) {
        super(context, tencentMapOptions, viewGroup);
    }

    @Override // com.tencent.mapsdk.internal.tz, com.tencent.mapsdk.internal.bo
    /* renamed from: a */
    public final com.tencent.mapsdk.vector.VectorMap createMap(com.tencent.mapsdk.internal.ne neVar) {
        return new com.tencent.mapsdk.internal.sy(neVar);
    }
}
