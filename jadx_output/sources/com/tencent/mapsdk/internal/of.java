package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class of extends com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.oh> implements com.tencent.map.sdk.utilities.visualization.scatterplot.BitmapScatterPlotOverlay, com.tencent.map.sdk.utilities.visualization.scatterplot.DotScatterPlotOverlay, com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlay {
    public of(com.tencent.mapsdk.internal.nh nhVar, com.tencent.mapsdk.internal.oh ohVar) {
        super(nhVar, ohVar);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay
    public void enableClick(boolean z17) {
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay
    public com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus executeCommandFunction(com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction baseCommandFunction) {
        if (baseCommandFunction == null) {
            return new com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo(com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse);
        }
        java.lang.String name = baseCommandFunction.getClass().getName();
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$SetZoomLevelRangeCommand")) {
            com.tencent.map.lib.models.CommonParamsModelClass.ZoomLevelRangeParams zoomLevelRangeParams = ((com.tencent.map.lib.models.CommandFunctionModelClass.SetZoomLevelRangeCommand) baseCommandFunction).params;
            if (zoomLevelRangeParams == null) {
                return new com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo(com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse);
            }
            ((com.tencent.mapsdk.internal.oh) this.f50567d).setZoomLevelRange(zoomLevelRangeParams.minLevel, zoomLevelRangeParams.maxLevel);
            a((com.tencent.mapsdk.internal.of) this.f50567d);
            return new com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus();
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$SetVisibleCommand")) {
            com.tencent.map.lib.models.CommonParamsModelClass.VisibleParams visibleParams = ((com.tencent.map.lib.models.CommandFunctionModelClass.SetVisibleCommand) baseCommandFunction).params;
            if (visibleParams == null) {
                return new com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo(com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse);
            }
            setVisibility(visibleParams.isVisible);
            return new com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus();
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetVisibleCommand")) {
            return new com.tencent.map.lib.models.ReturnInfoModelClass.BaseBooleanReturnInfo(((com.tencent.mapsdk.internal.oh) this.f50567d).isVisible());
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetClickEnabledCommand")) {
            return new com.tencent.map.lib.models.ReturnInfoModelClass.BaseBooleanReturnInfo(isClickEnabled());
        }
        if (!name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$EnableClickCommand")) {
            return !name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetTypeCommand") ? new com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo(com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.unsupported) : new com.tencent.map.lib.models.ReturnInfoModelClass.BaseStringReturnInfo(getType());
        }
        com.tencent.map.lib.models.CommonParamsModelClass.EnableClickParams enableClickParams = ((com.tencent.map.lib.models.CommandFunctionModelClass.EnableClickCommand) baseCommandFunction).params;
        if (enableClickParams == null) {
            return new com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo(com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse);
        }
        enableClick(enableClickParams.enabled);
        return new com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay
    public java.lang.String getType() {
        return com.tencent.mapsdk.internal.ef.Scatter.f49245h;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay
    public boolean isClickEnabled() {
        return false;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlay
    public void setActiveDataIndex(int i17) {
        ((com.tencent.mapsdk.internal.oh) this.f50567d).setActiveIndex(i17);
        a((com.tencent.mapsdk.internal.of) this.f50567d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay
    public void setLevel(int i17) {
        T t17 = this.f50567d;
        if (((com.tencent.mapsdk.internal.oh) t17).f50591a != null) {
            ((com.tencent.mapsdk.internal.oh) t17).f50591a.displayLevel(i17);
        }
        ((com.tencent.mapsdk.internal.oh) this.f50567d).setLevel(i17);
        a((com.tencent.mapsdk.internal.of) this.f50567d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay, com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlay
    public void setOpacity(float f17) {
        T t17 = this.f50567d;
        if (((com.tencent.mapsdk.internal.oh) t17).f50591a != null) {
            ((com.tencent.mapsdk.internal.oh) t17).f50591a.opacity(f17);
        }
        ((com.tencent.mapsdk.internal.oh) this.f50567d).setOpacity(f17);
        a((com.tencent.mapsdk.internal.of) this.f50567d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay, com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlay
    public void setVisibility(boolean z17) {
        T t17 = this.f50567d;
        if (((com.tencent.mapsdk.internal.oh) t17).f50591a != null) {
            ((com.tencent.mapsdk.internal.oh) t17).f50591a.visibility(z17);
        }
        ((com.tencent.mapsdk.internal.oh) this.f50567d).setVisible(z17);
        a((com.tencent.mapsdk.internal.of) this.f50567d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay
    public void setZIndex(int i17) {
        T t17 = this.f50567d;
        if (((com.tencent.mapsdk.internal.oh) t17).f50591a != null) {
            ((com.tencent.mapsdk.internal.oh) t17).f50591a.zIndex(i17);
        }
        ((com.tencent.mapsdk.internal.oh) this.f50567d).setzIndex(i17);
        a((com.tencent.mapsdk.internal.of) this.f50567d);
    }
}
