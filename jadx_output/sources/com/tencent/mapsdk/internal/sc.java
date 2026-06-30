package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class sc implements com.tencent.mapsdk.internal.se {
    @Override // com.tencent.mapsdk.internal.se
    public final com.tencent.mapsdk.internal.el a(com.tencent.mapsdk.internal.el elVar, java.lang.String str) {
        return elVar;
    }

    @Override // com.tencent.mapsdk.internal.se
    public final com.tencent.mapsdk.internal.el a(byte[] bArr) {
        return (com.tencent.mapsdk.internal.el) com.tencent.map.tools.json.JsonUtils.parseToModel(new java.lang.String(bArr), com.tencent.mapsdk.internal.eh.class, new java.lang.Object[0]);
    }

    @Override // com.tencent.mapsdk.internal.se
    public final com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider a(com.tencent.mapsdk.internal.el elVar) {
        if (!(elVar instanceof com.tencent.mapsdk.internal.eh) || !elVar.c()) {
            return null;
        }
        com.tencent.mapsdk.internal.eh ehVar = (com.tencent.mapsdk.internal.eh) elVar;
        com.tencent.map.sdk.utilities.visualization.od.ArcLineOverlayProvider arcLineOverlayProvider = new com.tencent.map.sdk.utilities.visualization.od.ArcLineOverlayProvider();
        if (ehVar.f49263a.f49294c.f49296b != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.tencent.mapsdk.internal.el.a.C0027a.AbstractC0028a abstractC0028a : ehVar.f49263a.f49294c.f49296b) {
                if (abstractC0028a instanceof com.tencent.mapsdk.internal.el.a.C0027a.b) {
                    com.tencent.mapsdk.internal.el.a.C0027a.b bVar = (com.tencent.mapsdk.internal.el.a.C0027a.b) abstractC0028a;
                    arrayList.add(new com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng(bVar.f49299c.get(0), bVar.f49299c.get(1)));
                }
            }
            arcLineOverlayProvider.data(arrayList);
        }
        com.tencent.mapsdk.internal.el.c.e eVar = ehVar.f49263a.f49264a.f49265a.f49273a.f49280a.f49276c;
        if (eVar != null) {
            int size = eVar.f49326b.size();
            int[] iArr = new int[size];
            for (int i17 = 0; i17 < size; i17++) {
                iArr[i17] = ehVar.f49263a.f49264a.f49265a.f49273a.f49280a.f49276c.f49326b.get(i17).intValue();
            }
            arcLineOverlayProvider.gradient(iArr);
        }
        arcLineOverlayProvider.width(ehVar.f49263a.f49264a.f49265a.f49273a.f49280a.f49274a);
        arcLineOverlayProvider.radian((float) (ehVar.f49263a.f49264a.f49265a.f49273a.f49280a.f49275b * 90.0d));
        com.tencent.mapsdk.internal.eh.a.C0021a.C0022a c0022a = ehVar.f49263a.f49264a.f49266b;
        arcLineOverlayProvider.zoomRange(c0022a.f49320k, c0022a.f49319j);
        arcLineOverlayProvider.zIndex(ehVar.f49263a.f49264a.f49266b.f49316g);
        arcLineOverlayProvider.displayLevel(ehVar.f49263a.f49264a.f49266b.f49315f);
        arcLineOverlayProvider.enable3D(ehVar.f49263a.f49264a.f49266b.f49267a);
        arcLineOverlayProvider.opacity((float) ehVar.f49263a.f49264a.f49266b.f49318i);
        arcLineOverlayProvider.visibility(!ehVar.f49263a.f49264a.f49266b.f49317h);
        com.tencent.mapsdk.internal.eh.a.C0021a.C0022a c0022a2 = ehVar.f49263a.f49264a.f49266b;
        if (c0022a2.f49268b) {
            arcLineOverlayProvider.setAnimateDuration((int) (c0022a2.f49269c.f49272c * 1000.0d));
            arcLineOverlayProvider.setHighlightDuration((int) (ehVar.f49263a.f49264a.f49266b.f49269c.f49270a * 1000.0d));
            arcLineOverlayProvider.animateColor(ehVar.f49263a.f49264a.f49266b.f49269c.f49271b);
        } else {
            arcLineOverlayProvider.setAnimateDuration(0);
        }
        return arcLineOverlayProvider;
    }
}
