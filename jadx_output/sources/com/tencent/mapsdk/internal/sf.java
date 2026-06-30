package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class sf implements com.tencent.mapsdk.internal.se {
    @Override // com.tencent.mapsdk.internal.se
    public final com.tencent.mapsdk.internal.el a(byte[] bArr) {
        return (com.tencent.mapsdk.internal.el) com.tencent.map.tools.json.JsonUtils.parseToModel(new java.lang.String(bArr), com.tencent.mapsdk.internal.em.class, new java.lang.Object[0]);
    }

    @Override // com.tencent.mapsdk.internal.se
    public final com.tencent.mapsdk.internal.el a(com.tencent.mapsdk.internal.el elVar, java.lang.String str) {
        boolean z17 = elVar instanceof com.tencent.mapsdk.internal.em;
        com.tencent.mapsdk.internal.el elVar2 = elVar;
        if (z17) {
            com.tencent.mapsdk.internal.em emVar = (com.tencent.mapsdk.internal.em) elVar;
            com.tencent.mapsdk.internal.el.a.C0027a.c cVar = (com.tencent.mapsdk.internal.el.a.C0027a.c) emVar.f49328a.f49294c.f49296b.get(0);
            java.lang.String str2 = str + "/model/";
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "# 2次处理数据缓存根目录: [" + str2 + "]");
            java.lang.String str3 = str2 + cVar.f49307i;
            java.io.File file = new java.io.File(str3, cVar.f49306h);
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "# 2次处理数据缓存目标文件: [" + file.getAbsolutePath() + "]");
            if (!file.exists()) {
                if (!android.text.TextUtils.isEmpty(cVar.f49302d) && !cVar.f49302d.equals("null")) {
                    cVar.f49301c = cVar.f49302d;
                }
                if (!android.text.TextUtils.isEmpty(cVar.f49303e) && !cVar.f49303e.equals("null")) {
                    cVar.f49301c = cVar.f49303e;
                }
                com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "2次处理数据请求url: [" + cVar.f49301c + "]");
                com.tencent.map.tools.net.NetResponse doGet = com.tencent.map.tools.net.NetManager.getInstance().builder().url(cVar.f49301c).doGet();
                if (doGet.available()) {
                    com.tencent.mapsdk.internal.ks.f(new java.io.File(str2));
                    byte[] bArr = doGet.data;
                    java.io.File file2 = new java.io.File(str2, cVar.f49305g + ".tmp");
                    com.tencent.mapsdk.internal.ks.a(file2, bArr);
                    try {
                        com.tencent.mapsdk.internal.kv.a(new java.io.FileInputStream(file2), new java.io.File(str3));
                    } catch (java.lang.Exception unused) {
                    }
                    com.tencent.mapsdk.internal.ks.b(file2);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("# 2次下载处理数据大小: {");
                    sb6.append(cVar.f49305g);
                    sb6.append("} [");
                    byte[] bArr2 = doGet.data;
                    sb6.append(bArr2 != null ? bArr2.length : 0);
                    sb6.append("]");
                    com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, sb6.toString());
                    ((com.tencent.mapsdk.internal.el.a.C0027a.c) emVar.f49328a.f49294c.f49296b.get(0)).f49298b = file.getAbsolutePath();
                    elVar2 = emVar;
                } else {
                    com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "2次处理数据请求失败");
                    ((com.tencent.mapsdk.internal.el.a.C0027a.c) emVar.f49328a.f49294c.f49296b.get(0)).f49298b = "";
                    elVar2 = emVar;
                }
            } else {
                com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "2次处理数据已存在缓存中");
                ((com.tencent.mapsdk.internal.el.a.C0027a.c) emVar.f49328a.f49294c.f49296b.get(0)).f49298b = file.getAbsolutePath();
                elVar2 = emVar;
            }
        }
        return elVar2;
    }

    @Override // com.tencent.mapsdk.internal.se
    public final com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider a(com.tencent.mapsdk.internal.el elVar) {
        if (!(elVar instanceof com.tencent.mapsdk.internal.em) || !elVar.c()) {
            return null;
        }
        com.tencent.mapsdk.internal.em emVar = (com.tencent.mapsdk.internal.em) elVar;
        com.tencent.mapsdk.internal.el.a.C0027a.c cVar = (com.tencent.mapsdk.internal.el.a.C0027a.c) emVar.f49328a.f49294c.f49296b.get(0);
        if (android.text.TextUtils.isEmpty(cVar.f49298b)) {
            return null;
        }
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = emVar.f49328a.f49329a.f49330a.f49332a.f49341a.f49333a;
        com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider gLModelOverlayProvider = new com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider(cVar.f49298b, new com.tencent.tencentmap.mapsdk.maps.model.LatLng(latLng.latitude, latLng.longitude, latLng.altitude));
        java.util.List<java.lang.Double> list = emVar.f49328a.f49329a.f49330a.f49332a.f49341a.f49334b;
        if (list != null && list.size() == 3) {
            gLModelOverlayProvider.rotationX(list.get(0).floatValue() + 90.0f).rotationY(list.get(1).floatValue()).rotationZ(list.get(2).floatValue());
        }
        gLModelOverlayProvider.latLngBounds(emVar.f49328a.f49329a.f49330a.f49332a.f49341a.f49338f);
        if (emVar.f49328a.f49329a.f49330a.f49332a.f49341a.f49336d) {
            gLModelOverlayProvider.coordType(com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider.CoordType.GeoGraphicType);
            gLModelOverlayProvider.scale(emVar.f49328a.f49329a.f49330a.f49332a.f49341a.f49335c);
        } else {
            gLModelOverlayProvider.coordType(com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider.CoordType.PixelType);
            java.util.List<java.lang.Integer> list2 = emVar.f49328a.f49329a.f49330a.f49332a.f49341a.f49337e;
            if (list2 != null && list2.size() == 2) {
                gLModelOverlayProvider.pixelBounds(list2.get(0).intValue(), list2.get(1).intValue());
            }
        }
        int i17 = emVar.f49328a.f49329a.f49330a.f49332a.f49341a.f49339g.f49327a;
        if (i17 == 0) {
            gLModelOverlayProvider.animateType(com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider.AnimationType.None);
        } else if (i17 == 1) {
            gLModelOverlayProvider.animateType(com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider.AnimationType.FlattenRise);
        }
        gLModelOverlayProvider.setExposure((float) emVar.f49328a.f49329a.f49330a.f49332a.f49341a.f49340h);
        com.tencent.mapsdk.internal.em.a.C0030a.C0031a c0031a = emVar.f49328a.f49329a.f49331b;
        gLModelOverlayProvider.zoomRange(c0031a.f49320k, c0031a.f49319j);
        gLModelOverlayProvider.zIndex(emVar.f49328a.f49329a.f49331b.f49316g);
        gLModelOverlayProvider.displayLevel(emVar.f49328a.f49329a.f49331b.f49315f);
        gLModelOverlayProvider.opacity((float) emVar.f49328a.f49329a.f49331b.f49318i);
        gLModelOverlayProvider.visibility(!emVar.f49328a.f49329a.f49331b.f49317h);
        return gLModelOverlayProvider;
    }
}
