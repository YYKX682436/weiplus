package com.tencent.mapsdk.core;

/* loaded from: classes13.dex */
public class MapDelegateFactoryImpl implements com.tencent.mapsdk.internal.s {
    @Override // com.tencent.mapsdk.internal.s
    public com.tencent.mapsdk.core.MapDelegate createDelegate(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions, android.view.ViewGroup viewGroup) {
        com.tencent.mapsdk.core.MapDelegate mapDelegate;
        com.tencent.tencentmap.mapsdk.maps.TencentMapOptions.IMapKernel mapKernel = tencentMapOptions.getMapKernel();
        java.lang.Class<?> a17 = com.tencent.mapsdk.internal.hp.a("com.tencent.mapsdk.navi.MapKernelNavi", mapKernel.getClass().getClassLoader());
        java.lang.Class<?> a18 = com.tencent.mapsdk.internal.hp.a("com.tencent.mapsdk.compat.MapKernelCompat", mapKernel.getClass().getClassLoader());
        if (a18 != null && a18 == mapKernel.getClass()) {
            mapDelegate = (com.tencent.mapsdk.core.MapDelegate) com.tencent.mapsdk.internal.hp.a(com.tencent.mapsdk.internal.hp.a("com.tencent.mapsdk.compat.VectorMapCompatDelegateProxy", com.tencent.mapsdk.core.MapDelegate.class, com.tencent.mapsdk.internal.u.a().b()), context, tencentMapOptions, viewGroup);
        } else if (a17 != null && a17 == mapKernel.getClass()) {
            mapDelegate = (com.tencent.mapsdk.core.MapDelegate) com.tencent.mapsdk.internal.hp.a(com.tencent.mapsdk.internal.hp.a("com.tencent.mapsdk.navi.VectorMapNaviDelegateProxy", com.tencent.mapsdk.core.MapDelegate.class, com.tencent.mapsdk.internal.u.a().b()), context, tencentMapOptions, viewGroup);
        } else {
            mapDelegate = (com.tencent.mapsdk.core.MapDelegate) com.tencent.mapsdk.internal.hp.a(com.tencent.mapsdk.internal.hp.a("com.tencent.mapsdk.vector.VectorMapDelegateProxy", com.tencent.mapsdk.core.MapDelegate.class, com.tencent.mapsdk.internal.u.a().b()), context, tencentMapOptions, viewGroup);
        }
        if (mapDelegate != null) {
            mapDelegate.onCreated();
        }
        return mapDelegate;
    }
}
