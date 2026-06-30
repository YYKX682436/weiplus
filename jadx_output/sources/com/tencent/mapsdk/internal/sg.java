package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class sg implements com.tencent.mapsdk.internal.se {
    @Override // com.tencent.mapsdk.internal.se
    public final com.tencent.mapsdk.internal.el a(com.tencent.mapsdk.internal.el elVar, java.lang.String str) {
        return elVar;
    }

    @Override // com.tencent.mapsdk.internal.se
    public final com.tencent.mapsdk.internal.el a(byte[] bArr) {
        return (com.tencent.mapsdk.internal.el) com.tencent.map.tools.json.JsonUtils.parseToModel(new java.lang.String(bArr), com.tencent.mapsdk.internal.en.class, new java.lang.Object[0]);
    }

    @Override // com.tencent.mapsdk.internal.se
    public final com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider a(com.tencent.mapsdk.internal.el elVar) {
        com.tencent.mapsdk.internal.el.c.d dVar;
        if (!(elVar instanceof com.tencent.mapsdk.internal.en) || !elVar.c()) {
            return null;
        }
        com.tencent.mapsdk.internal.en enVar = (com.tencent.mapsdk.internal.en) elVar;
        com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider gradientVectorOverlayProvider = new com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mapsdk.internal.el.a.C0027a.AbstractC0028a abstractC0028a : enVar.f49342a.f49294c.f49296b) {
            if (abstractC0028a instanceof com.tencent.mapsdk.internal.el.a.C0027a.e) {
                arrayList.addAll(((com.tencent.mapsdk.internal.el.a.C0027a.e) abstractC0028a).f49310c);
            }
        }
        gradientVectorOverlayProvider.weightedData(arrayList);
        int size = enVar.f49342a.f49343a.f49344a.f49351a.f49355a.f49353b.f49326b.size();
        int[] iArr = new int[size];
        for (int i17 = 0; i17 < size; i17++) {
            iArr[i17] = enVar.f49342a.f49343a.f49344a.f49351a.f49355a.f49353b.f49326b.get(i17).intValue();
        }
        float[] fArr = new float[enVar.f49342a.f49343a.f49344a.f49351a.f49355a.f49353b.f49325a.size()];
        for (int i18 = 0; i18 < size; i18++) {
            fArr[i18] = enVar.f49342a.f49343a.f49344a.f49351a.f49355a.f49353b.f49325a.get(i18).floatValue();
        }
        gradientVectorOverlayProvider.gradient(iArr, fArr);
        gradientVectorOverlayProvider.radius(enVar.f49342a.f49343a.f49344a.f49351a.f49355a.f49352a);
        gradientVectorOverlayProvider.setMaxHeight(enVar.f49342a.f49343a.f49345b.f49349d.get(1).floatValue());
        com.tencent.mapsdk.internal.en.a.C0034a.C0035a c0035a = enVar.f49342a.f49343a.f49345b;
        gradientVectorOverlayProvider.setIntensityRange((float) c0035a.f49347b, (float) c0035a.f49346a);
        com.tencent.mapsdk.internal.en.a.C0034a.C0035a c0035a2 = enVar.f49342a.f49343a.f49345b;
        gradientVectorOverlayProvider.zoomRange(c0035a2.f49320k, c0035a2.f49319j);
        gradientVectorOverlayProvider.zIndex(enVar.f49342a.f49343a.f49345b.f49316g);
        gradientVectorOverlayProvider.displayLevel(enVar.f49342a.f49343a.f49345b.f49315f);
        gradientVectorOverlayProvider.enable3D(enVar.f49342a.f49343a.f49345b.f49348c);
        gradientVectorOverlayProvider.opacity((float) enVar.f49342a.f49343a.f49345b.f49318i);
        gradientVectorOverlayProvider.visibility(!enVar.f49342a.f49343a.f49345b.f49317h);
        com.tencent.mapsdk.internal.en.a.C0034a c0034a = enVar.f49342a.f49343a;
        if (c0034a.f49345b.f49350e && (dVar = c0034a.f49344a.f49351a.f49355a.f49354c) != null) {
            gradientVectorOverlayProvider.setAnimateDuration((int) (dVar.f49324c * 1000.0d));
        } else {
            gradientVectorOverlayProvider.setAnimateDuration(0);
        }
        return gradientVectorOverlayProvider;
    }
}
