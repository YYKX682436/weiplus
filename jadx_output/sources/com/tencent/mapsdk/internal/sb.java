package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class sb implements com.tencent.mapsdk.internal.se {
    private static com.tencent.mapsdk.internal.eg b(byte[] bArr) {
        return (com.tencent.mapsdk.internal.eg) com.tencent.map.tools.json.JsonUtils.parseToModel(new java.lang.String(bArr), com.tencent.mapsdk.internal.eg.class, new java.lang.Object[0]);
    }

    @Override // com.tencent.mapsdk.internal.se
    public final com.tencent.mapsdk.internal.el a(com.tencent.mapsdk.internal.el elVar, java.lang.String str) {
        return elVar;
    }

    @Override // com.tencent.mapsdk.internal.se
    public final com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider a(com.tencent.mapsdk.internal.el elVar) {
        com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlayProvider squareVectorOverlayProvider;
        com.tencent.mapsdk.internal.el.c.d dVar;
        if (!(elVar instanceof com.tencent.mapsdk.internal.eg) || !elVar.c()) {
            return null;
        }
        com.tencent.mapsdk.internal.eg egVar = (com.tencent.mapsdk.internal.eg) elVar;
        if (egVar.f49247a.f49248a.f49249a.f49256a.f49262a.f49259c.equals("hexagon")) {
            squareVectorOverlayProvider = new com.tencent.map.sdk.utilities.visualization.aggregation.HoneyCombVectorOverlayProvider();
        } else {
            squareVectorOverlayProvider = egVar.f49247a.f49248a.f49249a.f49256a.f49262a.f49259c.equals("grid") ? new com.tencent.map.sdk.utilities.visualization.aggregation.SquareVectorOverlayProvider() : null;
        }
        if (squareVectorOverlayProvider == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mapsdk.internal.el.a.C0027a.AbstractC0028a abstractC0028a : egVar.f49247a.f49294c.f49296b) {
            if (abstractC0028a instanceof com.tencent.mapsdk.internal.el.a.C0027a.e) {
                arrayList.addAll(((com.tencent.mapsdk.internal.el.a.C0027a.e) abstractC0028a).f49310c);
            }
        }
        com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlayProvider nodes = squareVectorOverlayProvider.nodes((com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng[]) arrayList.toArray(new com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng[0]));
        int size = egVar.f49247a.f49248a.f49249a.f49256a.f49262a.f49260d.f49326b.size();
        int[] iArr = new int[size];
        for (int i17 = 0; i17 < size; i17++) {
            iArr[i17] = egVar.f49247a.f49248a.f49249a.f49256a.f49262a.f49260d.f49326b.get(i17).intValue();
        }
        double[] dArr = new double[egVar.f49247a.f49248a.f49249a.f49256a.f49262a.f49260d.f49325a.size()];
        for (int i18 = 0; i18 < size; i18++) {
            dArr[i18] = egVar.f49247a.f49248a.f49249a.f49256a.f49262a.f49260d.f49325a.get(i18).doubleValue();
        }
        nodes.colors(iArr, dArr);
        nodes.size(egVar.f49247a.f49248a.f49249a.f49256a.f49262a.f49258b);
        nodes.gap(egVar.f49247a.f49248a.f49249a.f49256a.f49262a.f49257a);
        nodes.setHeightRange(egVar.f49247a.f49248a.f49250b.f49254d.get(0).doubleValue(), egVar.f49247a.f49248a.f49250b.f49254d.get(1).doubleValue());
        com.tencent.mapsdk.internal.eg.a.C0017a.C0018a c0018a = egVar.f49247a.f49248a.f49250b;
        nodes.setIntensityRange(c0018a.f49252b, c0018a.f49251a);
        com.tencent.mapsdk.internal.eg.a.C0017a.C0018a c0018a2 = egVar.f49247a.f49248a.f49250b;
        nodes.zoomRange(c0018a2.f49320k, c0018a2.f49319j);
        nodes.zIndex(egVar.f49247a.f49248a.f49250b.f49316g);
        nodes.displayLevel(egVar.f49247a.f49248a.f49250b.f49315f);
        nodes.enable3D(egVar.f49247a.f49248a.f49250b.f49253c);
        nodes.opacity((float) egVar.f49247a.f49248a.f49250b.f49318i);
        nodes.visibility(!egVar.f49247a.f49248a.f49250b.f49317h);
        com.tencent.mapsdk.internal.eg.a.C0017a c0017a = egVar.f49247a.f49248a;
        if (c0017a.f49250b.f49255e && (dVar = c0017a.f49249a.f49256a.f49262a.f49261e) != null) {
            nodes.setAnimateDuration((int) (dVar.f49324c * 1000.0d));
        } else {
            nodes.setAnimateDuration(0);
        }
        return nodes;
    }

    @Override // com.tencent.mapsdk.internal.se
    public final /* synthetic */ com.tencent.mapsdk.internal.el a(byte[] bArr) {
        return (com.tencent.mapsdk.internal.eg) com.tencent.map.tools.json.JsonUtils.parseToModel(new java.lang.String(bArr), com.tencent.mapsdk.internal.eg.class, new java.lang.Object[0]);
    }
}
