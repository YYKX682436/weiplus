package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class sd implements com.tencent.map.sdk.comps.vis.VisualLayer {

    /* renamed from: c, reason: collision with root package name */
    private static final int f51328c = 15;

    /* renamed from: a, reason: collision with root package name */
    int f51329a;

    /* renamed from: b, reason: collision with root package name */
    com.tencent.mapsdk.internal.se f51330b;

    /* renamed from: d, reason: collision with root package name */
    private com.tencent.mapsdk.internal.ee f51331d;

    /* renamed from: e, reason: collision with root package name */
    private java.util.List<com.tencent.map.sdk.comps.vis.VisualLayer.OnLayerStatusChangedListener> f51332e;

    /* renamed from: f, reason: collision with root package name */
    private int f51333f;

    /* renamed from: g, reason: collision with root package name */
    private int f51334g;

    /* renamed from: h, reason: collision with root package name */
    private float f51335h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f51336i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f51337j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f51338k;

    /* renamed from: l, reason: collision with root package name */
    private final java.lang.String f51339l;

    /* renamed from: m, reason: collision with root package name */
    private final java.lang.String f51340m;

    /* renamed from: n, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay f51341n;

    /* renamed from: o, reason: collision with root package name */
    private com.tencent.mapsdk.internal.el f51342o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f51343p = true;

    /* renamed from: q, reason: collision with root package name */
    private volatile int f51344q = -1;

    /* renamed from: com.tencent.mapsdk.internal.sd$3, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass3 implements com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay.OnVectorOverlayLoadListener {
        public AnonymousClass3() {
        }

        @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay.OnVectorOverlayLoadListener
        public final void onVectorOverlayLoaded(boolean z17) {
            if (z17) {
                com.tencent.mapsdk.internal.sd.this.a(0);
            } else {
                com.tencent.mapsdk.internal.sd.this.a(20);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.sd$4, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass4 implements com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay.OnVectorOverlayClickListener {
        public AnonymousClass4() {
        }

        @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay.OnVectorOverlayClickListener
        public final void onClicked(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, java.lang.String str, java.lang.String str2) {
            com.tencent.mapsdk.internal.sd.this.a(com.tencent.map.sdk.comps.vis.VisualLayer.OnLayerStatusChangedListener.EventType.ON_CLICK, com.tencent.map.tools.json.JsonUtils.modelToJsonString(new com.tencent.map.lib.models.EventParamsModelClass.ClickEventParams(com.tencent.mapsdk.internal.sd.this.f51339l, latLng, str, str2)));
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.sd$5, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass5 implements com.tencent.tencentmap.mapsdk.maps.model.IAnimatorModel.IAnimatorEndListener {
        public AnonymousClass5() {
        }

        @Override // com.tencent.tencentmap.mapsdk.maps.model.IAnimatorModel.IAnimatorEndListener
        public final void onAnimatorEnd() {
            com.tencent.mapsdk.internal.sd.this.a(com.tencent.map.sdk.comps.vis.VisualLayer.OnLayerStatusChangedListener.EventType.ON_TRANSLATEANIMATION_COMPLETE, com.tencent.map.tools.json.JsonUtils.modelToJsonString(new com.tencent.map.lib.models.EventParamsModelClass.TranslateAnimationCompleteEventParams(com.tencent.mapsdk.internal.sd.this.f51339l)));
        }
    }

    public sd(com.tencent.map.sdk.comps.vis.VisualLayerOptions visualLayerOptions) {
        java.lang.String substring = visualLayerOptions.getLayerId().substring(0, visualLayerOptions.getLayerId().lastIndexOf("_") == -1 ? visualLayerOptions.getLayerId().length() : visualLayerOptions.getLayerId().lastIndexOf("_"));
        this.f51340m = substring;
        int intValue = visualLayerOptions.getLayerId().lastIndexOf("_") != -1 ? java.lang.Integer.valueOf(visualLayerOptions.getLayerId().substring(visualLayerOptions.getLayerId().lastIndexOf("_") + 1)).intValue() : 0;
        if (intValue == 0) {
            this.f51339l = substring;
        } else {
            this.f51339l = substring + "_" + intValue;
        }
        a(visualLayerOptions);
    }

    private <T extends com.tencent.mapsdk.internal.el> T c() {
        return (T) this.f51342o;
    }

    private java.lang.String d() {
        return this.f51340m;
    }

    @Override // com.tencent.map.sdk.comps.vis.VisualLayer
    public final void addLayerStatusChangedListener(com.tencent.map.sdk.comps.vis.VisualLayer.OnLayerStatusChangedListener onLayerStatusChangedListener) {
        if (this.f51332e == null) {
            this.f51332e = new java.util.ArrayList();
        }
        this.f51332e.remove(onLayerStatusChangedListener);
        this.f51332e.add(onLayerStatusChangedListener);
    }

    @Override // com.tencent.map.sdk.comps.vis.VisualLayer
    public final void clearCache() {
        com.tencent.mapsdk.internal.ee eeVar;
        if (isRemoved() || android.text.TextUtils.isEmpty(this.f51339l) || (eeVar = this.f51331d) == null) {
            return;
        }
        eeVar.c(this.f51339l);
    }

    @Override // com.tencent.map.sdk.comps.vis.VisualLayer
    public final com.tencent.map.sdk.comps.vis.VisualLayer copy() {
        com.tencent.mapsdk.internal.ee eeVar = this.f51331d;
        if (eeVar == null) {
            return null;
        }
        return this.f51331d.a(new com.tencent.map.sdk.comps.vis.VisualLayerOptions(this.f51340m + "_" + eeVar.a(this.f51340m)).newBuilder().setAlpha(this.f51335h).setZIndex(this.f51334g).setTimeInterval(this.f51329a).setClickEnable(this.f51338k).build());
    }

    @Override // com.tencent.map.sdk.comps.vis.VisualLayer, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay
    public final void enableClick(boolean z17) {
        if (this.f51338k != z17) {
            this.f51338k = z17;
            com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay vectorOverlay = this.f51341n;
            if (vectorOverlay != null) {
                vectorOverlay.enableClick(z17);
            }
        }
    }

    @Override // com.tencent.map.sdk.comps.vis.VisualLayer
    public final java.lang.String executeCommand(com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap, java.lang.String str) {
        com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction a17 = com.tencent.mapsdk.internal.sh.a(str);
        if (a17 == null) {
            return com.tencent.mapsdk.internal.sh.a(new com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo(com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse));
        }
        java.lang.String str2 = a17.commandFunction;
        if (android.text.TextUtils.isEmpty(str2)) {
            return com.tencent.mapsdk.internal.sh.a(new com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo(com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.unsupported));
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "executeCommand functionType: [" + str2 + "]");
        com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction a18 = com.tencent.mapsdk.internal.sh.a(str, str2);
        com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay vectorOverlay = this.f51341n;
        if (vectorOverlay == null) {
            return com.tencent.mapsdk.internal.sh.a(new com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo(com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.internal.bindErrorMsg("mOverlay is null")));
        }
        com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus executeCommandFunction = vectorOverlay.executeCommandFunction(a18);
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "executeCommand returnJson:" + com.tencent.mapsdk.internal.sh.a(executeCommandFunction));
        return com.tencent.mapsdk.internal.sh.a(executeCommandFunction);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay
    public final com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus executeCommandFunction(com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction baseCommandFunction) {
        com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay vectorOverlay = this.f51341n;
        if (vectorOverlay != null) {
            return vectorOverlay.executeCommandFunction(baseCommandFunction);
        }
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Alphable
    public final float getAlpha() {
        return this.f51335h;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.IOverlay
    public final java.lang.String getId() {
        return this.f51339l;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public final int getLevel() {
        return this.f51333f;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay
    public final java.lang.String getType() {
        com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay vectorOverlay = this.f51341n;
        return vectorOverlay == null ? "" : vectorOverlay.getType();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public final int getZIndex() {
        return this.f51334g;
    }

    @Override // com.tencent.map.sdk.comps.vis.VisualLayer, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay
    public final boolean isClickEnabled() {
        com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay vectorOverlay = this.f51341n;
        if (vectorOverlay != null) {
            return vectorOverlay.isClickEnabled();
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public final boolean isRemoved() {
        return this.f51336i;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Visible
    public final boolean isVisible() {
        return this.f51337j;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public final void releaseData() {
        if (isRemoved() || android.text.TextUtils.isEmpty(this.f51339l)) {
            return;
        }
        a();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public final void remove() {
        java.util.List<com.tencent.map.sdk.comps.vis.VisualLayer.OnLayerStatusChangedListener> list = this.f51332e;
        if (list != null) {
            list.clear();
            this.f51332e = null;
        }
        a();
        com.tencent.mapsdk.internal.ee eeVar = this.f51331d;
        if (eeVar != null) {
            eeVar.b(this.f51339l);
            this.f51331d = null;
        }
        this.f51336i = true;
    }

    @Override // com.tencent.map.sdk.comps.vis.VisualLayer
    public final void removeLayerStatusChangedListener(com.tencent.map.sdk.comps.vis.VisualLayer.OnLayerStatusChangedListener onLayerStatusChangedListener) {
        java.util.List<com.tencent.map.sdk.comps.vis.VisualLayer.OnLayerStatusChangedListener> list = this.f51332e;
        if (list != null) {
            list.remove(onLayerStatusChangedListener);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Alphable
    public final void setAlpha(float f17) {
        if (this.f51335h != f17) {
            this.f51335h = f17;
            com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay vectorOverlay = this.f51341n;
            if (vectorOverlay != null) {
                vectorOverlay.setOpacity(f17);
            }
        }
    }

    @Override // com.tencent.map.sdk.comps.vis.VisualLayer, com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay
    public final void setLevel(int i17) {
        if (this.f51333f == i17 || i17 == 0) {
            return;
        }
        this.f51333f = i17;
        com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay vectorOverlay = this.f51341n;
        if (vectorOverlay != null) {
            vectorOverlay.setLevel(i17);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay, com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlay
    public final void setOpacity(float f17) {
        setAlpha(f17);
    }

    @Override // com.tencent.map.sdk.comps.vis.VisualLayer
    public final void setTimeInterval(int i17) {
        if (this.f51329a != i17) {
            this.f51343p = true;
            this.f51329a = i17;
            if (i17 > 0 && i17 < 15) {
                this.f51329a = 15;
            }
            c(this.f51331d);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay, com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlay
    public final void setVisibility(boolean z17) {
        setVisible(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Visible
    public final void setVisible(boolean z17) {
        if (this.f51337j != z17) {
            this.f51337j = z17;
            com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay vectorOverlay = this.f51341n;
            if (vectorOverlay != null) {
                vectorOverlay.setVisibility(z17);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public final void setZIndex(int i17) {
        if (this.f51334g != i17) {
            this.f51334g = i17;
            com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay vectorOverlay = this.f51341n;
            if (vectorOverlay != null) {
                vectorOverlay.setZIndex(i17);
            }
        }
    }

    private void a(com.tencent.mapsdk.internal.se seVar) {
        this.f51330b = seVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(com.tencent.mapsdk.internal.ee eeVar) {
        if (eeVar == null || !this.f51343p) {
            return;
        }
        this.f51343p = false;
        int i17 = this.f51329a;
        if (i17 > 0) {
            if (i17 < 15) {
                this.f51329a = 15;
            }
            eeVar.a(this.f51339l, this.f51329a);
            return;
        }
        eeVar.g(this.f51339l);
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [com.tencent.tencentmap.mapsdk.maps.TencentMap] */
    /* JADX WARN: Type inference failed for: r6v8, types: [com.tencent.tencentmap.mapsdk.maps.TencentMap] */
    private void d(com.tencent.mapsdk.internal.ee eeVar) {
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "图层id[" + this.f51339l + "] #drawLayer");
        com.tencent.mapsdk.internal.el elVar = this.f51342o;
        if (elVar == null || !elVar.c() || eeVar == null) {
            return;
        }
        com.tencent.mapsdk.internal.el elVar2 = this.f51342o;
        com.tencent.mapsdk.internal.se seVar = this.f51330b;
        com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider a17 = seVar != null ? seVar.a(elVar2) : null;
        if (a17 == null) {
            com.tencent.mapsdk.core.utils.log.LogUtil.d(com.tencent.mapsdk.internal.kx.f50224y, "图层id[" + this.f51339l + "] 创建OverlayProvider失败");
            a(4);
            return;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "图层id[" + this.f51339l + "] 创建OverlayProvider:" + a17);
        a17.setVectorOverlayLoadedListener((com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay.OnVectorOverlayLoadListener) new com.tencent.mapsdk.internal.sd.AnonymousClass3());
        a17.setVectorOverlayClickListener(new com.tencent.mapsdk.internal.sd.AnonymousClass4());
        if (a17 instanceof com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider) {
            ((com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider) a17).setTransAnimatorEndListener(new com.tencent.mapsdk.internal.sd.AnonymousClass5());
        }
        a17.enableClick(this.f51338k);
        if (this.f51341n == null) {
            this.f51341n = eeVar.getMapContext().f48999b.getMap().addVectorOverlay(a17);
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "图层id[" + this.f51339l + "] 创建Overlay:" + this.f51341n);
            return;
        }
        eeVar.getMapContext().f48999b.getMap().updateVectorOverlay(this.f51341n, a17);
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "图层id[" + this.f51339l + "] 更新Overlay:" + this.f51341n);
    }

    private int b() {
        return this.f51329a;
    }

    public final void a() {
        com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay vectorOverlay = this.f51341n;
        if (vectorOverlay != null) {
            vectorOverlay.remove();
            this.f51341n = null;
        }
    }

    public final void b(final com.tencent.mapsdk.internal.ee eeVar) {
        if (eeVar == null) {
            return;
        }
        eeVar.b(this.f51339l, new com.tencent.map.tools.Callback<byte[]>() { // from class: com.tencent.mapsdk.internal.sd.2
            private void a(byte[] bArr) {
                if (bArr != null && bArr.length > 0) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "图层id[" + com.tencent.mapsdk.internal.sd.this.f51339l + "] 刷新图层数据[" + bArr.length + "]");
                    if (com.tencent.mapsdk.internal.sd.this.a(bArr, true)) {
                        com.tencent.mapsdk.internal.sd.a(com.tencent.mapsdk.internal.sd.this, eeVar);
                        eeVar.a(com.tencent.mapsdk.internal.sd.this.f51339l, bArr);
                    }
                }
                com.tencent.mapsdk.internal.sd.this.c(eeVar);
            }

            @Override // com.tencent.map.tools.Callback
            public final /* synthetic */ void callback(byte[] bArr) {
                byte[] bArr2 = bArr;
                if (bArr2 != null && bArr2.length > 0) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "图层id[" + com.tencent.mapsdk.internal.sd.this.f51339l + "] 刷新图层数据[" + bArr2.length + "]");
                    if (com.tencent.mapsdk.internal.sd.this.a(bArr2, true)) {
                        com.tencent.mapsdk.internal.sd.a(com.tencent.mapsdk.internal.sd.this, eeVar);
                        eeVar.a(com.tencent.mapsdk.internal.sd.this.f51339l, bArr2);
                    }
                }
                com.tencent.mapsdk.internal.sd.this.c(eeVar);
            }
        });
    }

    private boolean b(int i17) {
        if (this.f51344q == i17) {
            return false;
        }
        int i18 = this.f51344q;
        if (i18 == 0 ? i17 > this.f51344q : !(i18 != 1 && i18 != 2 && i18 != 3 && i18 != 4 && i18 != 20)) {
            i17 = this.f51344q;
        }
        if (this.f51344q == i17) {
            return false;
        }
        this.f51344q = i17;
        return true;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public final void setZIndex(float f17) {
        setZIndex((int) f17);
    }

    public final void a(final com.tencent.mapsdk.internal.ee eeVar) {
        this.f51331d = eeVar;
        if (eeVar.e(this.f51339l)) {
            eeVar.a(this.f51339l, new com.tencent.map.tools.Callback<byte[]>() { // from class: com.tencent.mapsdk.internal.sd.1
                private void a(byte[] bArr) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("图层id[");
                    sb6.append(com.tencent.mapsdk.internal.sd.this.f51339l);
                    sb6.append("] 读取本地图层数据[");
                    sb6.append(bArr != null ? bArr.length : 0);
                    sb6.append("]");
                    com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, sb6.toString());
                    if (bArr != null && bArr.length > 0 && com.tencent.mapsdk.internal.sd.this.a(bArr, false)) {
                        com.tencent.mapsdk.internal.sd.a(com.tencent.mapsdk.internal.sd.this, eeVar);
                    }
                    com.tencent.mapsdk.internal.sd.this.b(eeVar);
                }

                @Override // com.tencent.map.tools.Callback
                public final /* synthetic */ void callback(byte[] bArr) {
                    byte[] bArr2 = bArr;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("图层id[");
                    sb6.append(com.tencent.mapsdk.internal.sd.this.f51339l);
                    sb6.append("] 读取本地图层数据[");
                    sb6.append(bArr2 != null ? bArr2.length : 0);
                    sb6.append("]");
                    com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, sb6.toString());
                    if (bArr2 != null && bArr2.length > 0 && com.tencent.mapsdk.internal.sd.this.a(bArr2, false)) {
                        com.tencent.mapsdk.internal.sd.a(com.tencent.mapsdk.internal.sd.this, eeVar);
                    }
                    com.tencent.mapsdk.internal.sd.this.b(eeVar);
                }
            });
        } else if (eeVar.a()) {
            a(2);
        } else {
            eeVar.f(this.f51339l);
        }
    }

    public final void a(com.tencent.map.sdk.comps.vis.VisualLayerOptions visualLayerOptions) {
        if (visualLayerOptions != null) {
            setAlpha(visualLayerOptions.getAlpha());
            setLevel(visualLayerOptions.getLevel());
            setTimeInterval(visualLayerOptions.getTimeInterval());
            setVisible(visualLayerOptions.isVisible());
            setZIndex(visualLayerOptions.getZIndex());
            enableClick(visualLayerOptions.isClickEnabled());
        }
    }

    public final boolean a(byte[] bArr, boolean z17) {
        com.tencent.mapsdk.internal.el elVar;
        com.tencent.mapsdk.internal.el.b bVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("图层id[");
        sb6.append(this.f51339l);
        sb6.append("] #parseLayerData[");
        sb6.append(bArr != null ? bArr.length : 0);
        sb6.append("]");
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, sb6.toString());
        com.tencent.mapsdk.internal.se seVar = this.f51330b;
        com.tencent.mapsdk.internal.el a17 = seVar != null ? seVar.a(bArr) : null;
        this.f51342o = a17;
        if (a17 != null && this.f51331d != null && a17.c()) {
            com.tencent.mapsdk.internal.el elVar2 = this.f51342o;
            java.lang.String d17 = this.f51331d.d(this.f51339l);
            com.tencent.mapsdk.internal.se seVar2 = this.f51330b;
            this.f51342o = seVar2 != null ? seVar2.a(elVar2, d17) : null;
            this.f51331d.a(getId(), this.f51342o.a(), this.f51342o.b());
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "图层id[" + this.f51339l + "] 创建Protocol对象：成功");
            return true;
        }
        if (z17 && (elVar = this.f51342o) != null && (bVar = elVar.f49292b) != null && bVar.f49311a == 0) {
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "图层id[" + this.f51339l + "] 创建Protocol对象：网络返回数据版本无变化, 无需更新本地数据");
            return false;
        }
        a(3);
        com.tencent.mapsdk.core.utils.log.LogUtil.d(com.tencent.mapsdk.internal.kx.f50224y, "图层id[" + this.f51339l + "] 创建Protocol对象：失败");
        return false;
    }

    private com.tencent.mapsdk.internal.el a(byte[] bArr) {
        com.tencent.mapsdk.internal.se seVar = this.f51330b;
        if (seVar != null) {
            return seVar.a(bArr);
        }
        return null;
    }

    private com.tencent.mapsdk.internal.el a(com.tencent.mapsdk.internal.el elVar, java.lang.String str) {
        com.tencent.mapsdk.internal.se seVar = this.f51330b;
        if (seVar != null) {
            return seVar.a(elVar, str);
        }
        return null;
    }

    private com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider a(com.tencent.mapsdk.internal.el elVar) {
        com.tencent.mapsdk.internal.se seVar = this.f51330b;
        if (seVar != null) {
            return seVar.a(elVar);
        }
        return null;
    }

    public final void a(final int i17) {
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "图层id[" + this.f51339l + "] notifyStatusChange want from[" + this.f51344q + "]to[" + i17 + "]");
        com.tencent.mapsdk.internal.ko.a(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.sd.6
            @Override // java.lang.Runnable
            public final void run() {
                if (com.tencent.mapsdk.internal.sd.a(com.tencent.mapsdk.internal.sd.this, i17) && com.tencent.mapsdk.internal.sd.this.f51332e != null) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "图层id[" + com.tencent.mapsdk.internal.sd.this.f51339l + "] notifyStatusChange do success");
                    java.util.ArrayList arrayList = new java.util.ArrayList(com.tencent.mapsdk.internal.sd.this.f51332e);
                    com.tencent.mapsdk.internal.sd.this.a(com.tencent.map.sdk.comps.vis.VisualLayer.OnLayerStatusChangedListener.EventType.ON_LAYER_LOAD_FINISH, com.tencent.map.tools.json.JsonUtils.modelToJsonString(new com.tencent.map.lib.models.EventParamsModelClass.LoadFinishEventParams(com.tencent.mapsdk.internal.sd.this.f51339l, com.tencent.map.lib.models.EventParamsModelClass.LoadFinishEventParams.LoadFinishInfo.getById(i17))));
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        com.tencent.map.sdk.comps.vis.VisualLayer.OnLayerStatusChangedListener onLayerStatusChangedListener = (com.tencent.map.sdk.comps.vis.VisualLayer.OnLayerStatusChangedListener) it.next();
                        if (onLayerStatusChangedListener != null) {
                            onLayerStatusChangedListener.onLayerLoadFinish(i17);
                        }
                    }
                }
            }
        }, 10L);
    }

    public final void a(final java.lang.String str, final java.lang.String str2) {
        com.tencent.mapsdk.internal.ko.a(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.sd.7
            @Override // java.lang.Runnable
            public final void run() {
                if (com.tencent.mapsdk.internal.sd.this.f51332e == null) {
                    return;
                }
                java.util.Iterator it = new java.util.ArrayList(com.tencent.mapsdk.internal.sd.this.f51332e).iterator();
                while (it.hasNext()) {
                    com.tencent.map.sdk.comps.vis.VisualLayer.OnLayerStatusChangedListener onLayerStatusChangedListener = (com.tencent.map.sdk.comps.vis.VisualLayer.OnLayerStatusChangedListener) it.next();
                    if (onLayerStatusChangedListener != null) {
                        onLayerStatusChangedListener.onEvent(this, str, str2);
                    }
                }
            }
        }, 10L);
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [com.tencent.tencentmap.mapsdk.maps.TencentMap] */
    /* JADX WARN: Type inference failed for: r6v7, types: [com.tencent.tencentmap.mapsdk.maps.TencentMap] */
    public static /* synthetic */ void a(com.tencent.mapsdk.internal.sd sdVar, com.tencent.mapsdk.internal.ee eeVar) {
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "图层id[" + sdVar.f51339l + "] #drawLayer");
        com.tencent.mapsdk.internal.el elVar = sdVar.f51342o;
        if (elVar == null || !elVar.c() || eeVar == null) {
            return;
        }
        com.tencent.mapsdk.internal.el elVar2 = sdVar.f51342o;
        com.tencent.mapsdk.internal.se seVar = sdVar.f51330b;
        com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider a17 = seVar != null ? seVar.a(elVar2) : null;
        if (a17 == null) {
            com.tencent.mapsdk.core.utils.log.LogUtil.d(com.tencent.mapsdk.internal.kx.f50224y, "图层id[" + sdVar.f51339l + "] 创建OverlayProvider失败");
            sdVar.a(4);
            return;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "图层id[" + sdVar.f51339l + "] 创建OverlayProvider:" + a17);
        a17.setVectorOverlayLoadedListener((com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay.OnVectorOverlayLoadListener) new com.tencent.mapsdk.internal.sd.AnonymousClass3());
        a17.setVectorOverlayClickListener(new com.tencent.mapsdk.internal.sd.AnonymousClass4());
        if (a17 instanceof com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider) {
            ((com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider) a17).setTransAnimatorEndListener(new com.tencent.mapsdk.internal.sd.AnonymousClass5());
        }
        a17.enableClick(sdVar.f51338k);
        if (sdVar.f51341n == null) {
            sdVar.f51341n = eeVar.getMapContext().f48999b.getMap().addVectorOverlay(a17);
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "图层id[" + sdVar.f51339l + "] 创建Overlay:" + sdVar.f51341n);
            return;
        }
        eeVar.getMapContext().f48999b.getMap().updateVectorOverlay(sdVar.f51341n, a17);
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "图层id[" + sdVar.f51339l + "] 更新Overlay:" + sdVar.f51341n);
    }

    public static /* synthetic */ boolean a(com.tencent.mapsdk.internal.sd sdVar, int i17) {
        if (sdVar.f51344q == i17) {
            return false;
        }
        int i18 = sdVar.f51344q;
        if (i18 == 0 ? i17 > sdVar.f51344q : !(i18 != 1 && i18 != 2 && i18 != 3 && i18 != 4 && i18 != 20)) {
            i17 = sdVar.f51344q;
        }
        if (sdVar.f51344q == i17) {
            return false;
        }
        sdVar.f51344q = i17;
        return true;
    }
}
