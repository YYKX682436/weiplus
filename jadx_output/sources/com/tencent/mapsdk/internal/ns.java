package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class ns extends com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.nr> implements com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlay {

    /* renamed from: e, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.model.GeneralTranslateAnimator f50585e;

    /* renamed from: com.tencent.mapsdk.internal.ns$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass1 implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.mapsdk.internal.nh.a f50586a;

        public AnonymousClass1(com.tencent.mapsdk.internal.nh.a aVar) {
            this.f50586a = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((com.tencent.mapsdk.internal.nr) com.tencent.mapsdk.internal.ns.this.f50567d).getOutterVectorOverlayClickListener() != null) {
                ((com.tencent.mapsdk.internal.nr) com.tencent.mapsdk.internal.ns.this.f50567d).getOutterVectorOverlayClickListener().onClicked(this.f50586a.getPosition(), this.f50586a.getIdentifier(), this.f50586a.getName());
            }
        }
    }

    public ns(com.tencent.mapsdk.internal.nq nqVar, com.tencent.mapsdk.internal.nr nrVar) {
        super(nqVar, nrVar);
    }

    public final void c() {
        if (this.f50585e != null) {
            if (((com.tencent.mapsdk.internal.nr) this.f50567d).f50584a.getTransAnimatorEndListener() != null) {
                this.f50585e.removeAnimatorEndListener(((com.tencent.mapsdk.internal.nr) this.f50567d).f50584a.getTransAnimatorEndListener());
            }
            this.f50585e.cancelAnimation();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay
    public void enableClick(boolean z17) {
        T t17 = this.f50567d;
        if (((com.tencent.mapsdk.internal.nr) t17).f50584a != null) {
            ((com.tencent.mapsdk.internal.nr) t17).f50584a.enableClick(z17);
        }
        ((com.tencent.mapsdk.internal.nr) this.f50567d).enableClick(z17);
        a((com.tencent.mapsdk.internal.ns) this.f50567d);
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
            ((com.tencent.mapsdk.internal.nr) this.f50567d).setZoomLevelRange(zoomLevelRangeParams.minLevel, zoomLevelRangeParams.maxLevel);
            a((com.tencent.mapsdk.internal.ns) this.f50567d);
            return new com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus();
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$StartTranslateAnimationCommand")) {
            com.tencent.map.lib.models.CommandFunctionModelClass.StartTranslateAnimationCommand startTranslateAnimationCommand = (com.tencent.map.lib.models.CommandFunctionModelClass.StartTranslateAnimationCommand) baseCommandFunction;
            com.tencent.map.lib.models.CommonParamsModelClass.StartTranslateAnimationParams startTranslateAnimationParams = startTranslateAnimationCommand.params;
            if (startTranslateAnimationParams != null && startTranslateAnimationParams.positions != null) {
                c();
                this.f50585e = new com.tencent.tencentmap.mapsdk.maps.model.GeneralTranslateAnimator.Builder(this, r1.duration * 1000.0f, (com.tencent.tencentmap.mapsdk.maps.model.LatLng[]) startTranslateAnimationCommand.params.positions.toArray(new com.tencent.tencentmap.mapsdk.maps.model.LatLng[0])).rotateEnabled(startTranslateAnimationCommand.params.needRotate).modelType(com.tencent.tencentmap.mapsdk.maps.model.GeneralTranslateAnimator.ModelType.MODEL_OVERLAY).initRotate(startTranslateAnimationCommand.params.initRotation).build();
                if (((com.tencent.mapsdk.internal.nr) this.f50567d).f50584a.getTransAnimatorEndListener() != null) {
                    this.f50585e.addAnimatorEndListener(((com.tencent.mapsdk.internal.nr) this.f50567d).f50584a.getTransAnimatorEndListener());
                }
                this.f50585e.startAnimation();
                return new com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus();
            }
            return new com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo(com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse);
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$SetRotationCommand")) {
            com.tencent.map.lib.models.CommonParamsModelClass.RotationParams rotationParams = ((com.tencent.map.lib.models.CommandFunctionModelClass.SetRotationCommand) baseCommandFunction).params;
            if (rotationParams == null) {
                return new com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo(com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse);
            }
            float f17 = rotationParams.rotationX;
            float f18 = rotationParams.rotationY;
            float f19 = rotationParams.rotationZ;
            T t17 = this.f50567d;
            if (((com.tencent.mapsdk.internal.nr) t17).f50584a != null) {
                ((com.tencent.mapsdk.internal.nr) t17).f50584a.rotationX(f17).rotationY(f18).rotationZ(f19);
            }
            ((com.tencent.mapsdk.internal.nr) this.f50567d).setRotationX(f17);
            ((com.tencent.mapsdk.internal.nr) this.f50567d).setRotationY(f18);
            ((com.tencent.mapsdk.internal.nr) this.f50567d).setRotationZ(f19);
            a((com.tencent.mapsdk.internal.ns) this.f50567d);
            return new com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus();
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$SetExposureCommand")) {
            com.tencent.map.lib.models.CommandFunctionModelClass.SetExposureCommand setExposureCommand = (com.tencent.map.lib.models.CommandFunctionModelClass.SetExposureCommand) baseCommandFunction;
            com.tencent.map.lib.models.CommonParamsModelClass.ExposureParams exposureParams = setExposureCommand.params;
            if (exposureParams == null) {
                return new com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo(com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse);
            }
            T t18 = this.f50567d;
            if (((com.tencent.mapsdk.internal.nr) t18).f50584a != null) {
                ((com.tencent.mapsdk.internal.nr) t18).f50584a.setExposure(exposureParams.exposure);
            }
            ((com.tencent.mapsdk.internal.nr) this.f50567d).setExposure(setExposureCommand.params.exposure);
            a((com.tencent.mapsdk.internal.ns) this.f50567d);
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
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetCurrentMaterialVariantCommand")) {
            return new com.tencent.map.lib.models.ReturnInfoModelClass.BaseIntReturnInfo(getCurrentMaterialVariant());
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$ErrorCommandFunction")) {
            return new com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo(com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.unsupported);
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$SetMaterialVariantCommand")) {
            com.tencent.map.lib.models.CommonParamsModelClass.MaterialVariantIndexParams materialVariantIndexParams = ((com.tencent.map.lib.models.CommandFunctionModelClass.SetMaterialVariantCommand) baseCommandFunction).params;
            if (materialVariantIndexParams == null) {
                return new com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo(com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse);
            }
            setMaterialVariant(materialVariantIndexParams.variantIndex);
            return new com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus();
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetVisibleCommand")) {
            return new com.tencent.map.lib.models.ReturnInfoModelClass.BaseBooleanReturnInfo(((com.tencent.mapsdk.internal.nr) this.f50567d).isVisible());
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$EnableUnlitCommand")) {
            setUnlit(((com.tencent.map.lib.models.CommandFunctionModelClass.EnableUnlitCommand) baseCommandFunction).params.enabled);
            return new com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus();
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetMaterialVariantsCommand")) {
            return new com.tencent.map.lib.models.ReturnInfoModelClass.MaterialVariantsReturnInfo(getMaterialVariants());
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$SetPixelBoundCommand")) {
            com.tencent.map.lib.models.CommandFunctionModelClass.SetPixelBoundCommand setPixelBoundCommand = (com.tencent.map.lib.models.CommandFunctionModelClass.SetPixelBoundCommand) baseCommandFunction;
            if (setPixelBoundCommand.params == null) {
                return new com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo(com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse);
            }
            T t19 = this.f50567d;
            if (((com.tencent.mapsdk.internal.nr) t19).f50584a != null) {
                ((com.tencent.mapsdk.internal.nr) t19).f50584a.coordType(com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider.CoordType.PixelType);
                com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider gLModelOverlayProvider = ((com.tencent.mapsdk.internal.nr) this.f50567d).f50584a;
                com.tencent.map.lib.models.CommonParamsModelClass.PixelBoundParams pixelBoundParams = setPixelBoundCommand.params;
                gLModelOverlayProvider.pixelBounds(pixelBoundParams.width, pixelBoundParams.height);
            }
            ((com.tencent.mapsdk.internal.nr) this.f50567d).setCoordType(com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider.CoordType.PixelType.ordinal());
            com.tencent.mapsdk.internal.nr nrVar = (com.tencent.mapsdk.internal.nr) this.f50567d;
            com.tencent.map.lib.models.CommonParamsModelClass.PixelBoundParams pixelBoundParams2 = setPixelBoundCommand.params;
            nrVar.setPixelBound(pixelBoundParams2.width, pixelBoundParams2.height);
            a((com.tencent.mapsdk.internal.ns) this.f50567d);
            return new com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus();
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetPositionCommand")) {
            return new com.tencent.map.lib.models.ReturnInfoModelClass.PositionReturnInfo(((com.tencent.mapsdk.internal.nr) this.f50567d).getPosition());
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetClickEnabledCommand")) {
            return new com.tencent.map.lib.models.ReturnInfoModelClass.BaseBooleanReturnInfo(isClickEnabled());
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetScaleCommand")) {
            return new com.tencent.map.lib.models.ReturnInfoModelClass.BaseFloatReturnInfo((float) ((com.tencent.mapsdk.internal.nr) this.f50567d).getScale());
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$ResetColorCommand")) {
            resetMonoColor();
            return new com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus();
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetSkeletonAnimationInfoCommand")) {
            return new com.tencent.map.lib.models.ReturnInfoModelClass.SkeletonAnimationReturnInfo(getSkeletonAnimationProperties());
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$SetPositionCommand")) {
            com.tencent.map.lib.models.CommandFunctionModelClass.SetPositionCommand setPositionCommand = (com.tencent.map.lib.models.CommandFunctionModelClass.SetPositionCommand) baseCommandFunction;
            if (setPositionCommand.params == null) {
                return new com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo(com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse);
            }
            com.tencent.map.lib.models.CommonParamsModelClass.PositionParams positionParams = setPositionCommand.params;
            com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(positionParams.lat, positionParams.lng, positionParams.altitude);
            T t27 = this.f50567d;
            if (((com.tencent.mapsdk.internal.nr) t27).f50584a != null) {
                ((com.tencent.mapsdk.internal.nr) t27).f50584a.position(latLng);
            }
            ((com.tencent.mapsdk.internal.nr) this.f50567d).setModelPosition(latLng);
            a((com.tencent.mapsdk.internal.ns) this.f50567d);
            return new com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus();
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$EnableClickCommand")) {
            com.tencent.map.lib.models.CommonParamsModelClass.EnableClickParams enableClickParams = ((com.tencent.map.lib.models.CommandFunctionModelClass.EnableClickCommand) baseCommandFunction).params;
            if (enableClickParams == null) {
                return new com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo(com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse);
            }
            enableClick(enableClickParams.enabled);
            return new com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus();
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$SetScaleCommand")) {
            com.tencent.map.lib.models.CommonParamsModelClass.ScaleParams scaleParams = ((com.tencent.map.lib.models.CommandFunctionModelClass.SetScaleCommand) baseCommandFunction).params;
            if (scaleParams == null) {
                return new com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo(com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse);
            }
            float f27 = scaleParams.scale;
            T t28 = this.f50567d;
            if (((com.tencent.mapsdk.internal.nr) t28).f50584a != null) {
                ((com.tencent.mapsdk.internal.nr) t28).f50584a.coordType(com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider.CoordType.GeoGraphicType);
                ((com.tencent.mapsdk.internal.nr) this.f50567d).f50584a.scale(f27);
            }
            ((com.tencent.mapsdk.internal.nr) this.f50567d).setCoordType(com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider.CoordType.GeoGraphicType.ordinal());
            ((com.tencent.mapsdk.internal.nr) this.f50567d).setScale(f27);
            a((com.tencent.mapsdk.internal.ns) this.f50567d);
            return new com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus();
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetTypeCommand")) {
            return new com.tencent.map.lib.models.ReturnInfoModelClass.BaseStringReturnInfo(getType());
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$PlaySkeletonAnimationCommand")) {
            com.tencent.map.lib.models.CommonParamsModelClass.PlaySkeletonAnimationParams playSkeletonAnimationParams = ((com.tencent.map.lib.models.CommandFunctionModelClass.PlaySkeletonAnimationCommand) baseCommandFunction).params;
            if (playSkeletonAnimationParams == null) {
                return new com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo(com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse);
            }
            playSkeletonAnimation(playSkeletonAnimationParams.index, playSkeletonAnimationParams.speed, playSkeletonAnimationParams.repeat);
            return new com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus();
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$SetMonoColorCommand")) {
            com.tencent.map.lib.models.CommonParamsModelClass.MonoColorParams monoColorParams = ((com.tencent.map.lib.models.CommandFunctionModelClass.SetMonoColorCommand) baseCommandFunction).params;
            if (monoColorParams == null) {
                return new com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo(com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse);
            }
            setMonoColor(monoColorParams);
            return new com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus();
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetUnlitEnabledCommand")) {
            return new com.tencent.map.lib.models.ReturnInfoModelClass.BaseBooleanReturnInfo(getUnlit());
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetRotationCommand")) {
            return new com.tencent.map.lib.models.ReturnInfoModelClass.RotationReturnInfo(((com.tencent.mapsdk.internal.nr) this.f50567d).getRotationX(), ((com.tencent.mapsdk.internal.nr) this.f50567d).getRotationY(), ((com.tencent.mapsdk.internal.nr) this.f50567d).getRotationZ());
        }
        if (!name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$StopSkeletonAnimationCommand")) {
            return !name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetExposureCommand") ? new com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo(com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.unsupported) : new com.tencent.map.lib.models.ReturnInfoModelClass.BaseFloatReturnInfo(((com.tencent.mapsdk.internal.nr) this.f50567d).getExposure());
        }
        stopSkeletonAnimation();
        return new com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlay
    public int getCurrentMaterialVariant() {
        java.lang.Object obj = this.f50566c;
        if (obj instanceof com.tencent.mapsdk.internal.nq) {
            return ((com.tencent.mapsdk.internal.nq) obj).d(this.f50565b);
        }
        return 0;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlay
    public java.util.List<com.tencent.map.lib.models.CommonParamsModelClass.MaterialVariantInfo> getMaterialVariants() {
        java.lang.Object obj = this.f50566c;
        if (obj instanceof com.tencent.mapsdk.internal.nq) {
            return ((com.tencent.mapsdk.internal.nq) obj).c(this.f50565b);
        }
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.IAnimatorModel
    public float getRotation() {
        return ((com.tencent.mapsdk.internal.nr) this.f50567d).getRotationY();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlay
    public java.util.List<com.tencent.map.lib.models.CommonParamsModelClass.AnimationInfo> getSkeletonAnimationProperties() {
        java.lang.Object obj = this.f50566c;
        if (obj instanceof com.tencent.mapsdk.internal.nq) {
            return ((com.tencent.mapsdk.internal.nq) obj).b(this.f50565b);
        }
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay
    public java.lang.String getType() {
        return com.tencent.mapsdk.internal.ef.GLModel.f49245h;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlay
    public boolean getUnlit() {
        return ((com.tencent.mapsdk.internal.nr) this.f50567d).getUnlit();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay
    public boolean isClickEnabled() {
        return ((com.tencent.mapsdk.internal.nr) this.f50567d).isClickEnabled();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlay
    public void playSkeletonAnimation(int i17, float f17, boolean z17) {
        ((com.tencent.mapsdk.internal.nq) this.f50566c).a(this.f50565b, i17, f17, z17);
    }

    @Override // com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlay
    public void resetMonoColor() {
        java.lang.Object obj = this.f50566c;
        if (obj instanceof com.tencent.mapsdk.internal.nq) {
            ((com.tencent.mapsdk.internal.nq) obj).e(this.f50565b);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay
    public void setLevel(int i17) {
        T t17 = this.f50567d;
        if (((com.tencent.mapsdk.internal.nr) t17).f50584a != null) {
            ((com.tencent.mapsdk.internal.nr) t17).f50584a.displayLevel(i17);
        }
        ((com.tencent.mapsdk.internal.nr) this.f50567d).setLevel(i17);
        a((com.tencent.mapsdk.internal.ns) this.f50567d);
    }

    @Override // com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlay
    public void setMaterialVariant(int i17) {
        java.lang.Object obj = this.f50566c;
        if (obj instanceof com.tencent.mapsdk.internal.nq) {
            ((com.tencent.mapsdk.internal.nq) obj).a(this.f50565b, i17);
        }
    }

    @Override // com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlay
    public void setMonoColor(com.tencent.map.lib.models.CommonParamsModelClass.MonoColorParams monoColorParams) {
        java.lang.Object obj = this.f50566c;
        if ((obj instanceof com.tencent.mapsdk.internal.nq) && monoColorParams != null) {
            ((com.tencent.mapsdk.internal.nq) obj).a(this.f50565b, monoColorParams.f48673r, monoColorParams.f48672g, monoColorParams.f48671b);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay, com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlay
    public void setOpacity(float f17) {
        T t17 = this.f50567d;
        if (((com.tencent.mapsdk.internal.nr) t17).f50584a != null) {
            ((com.tencent.mapsdk.internal.nr) t17).f50584a.opacity(f17);
        }
        ((com.tencent.mapsdk.internal.nr) this.f50567d).setOpacity(f17);
        a((com.tencent.mapsdk.internal.ns) this.f50567d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.IAnimatorModel
    public void setPosition(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        T t17 = this.f50567d;
        if (((com.tencent.mapsdk.internal.nr) t17).f50584a != null) {
            ((com.tencent.mapsdk.internal.nr) t17).f50584a.position(latLng);
        }
        ((com.tencent.mapsdk.internal.nr) this.f50567d).setModelPosition(latLng);
        a((com.tencent.mapsdk.internal.ns) this.f50567d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.IAnimatorModel
    public void setRotation(float f17) {
        T t17 = this.f50567d;
        if (((com.tencent.mapsdk.internal.nr) t17).f50584a != null) {
            ((com.tencent.mapsdk.internal.nr) t17).f50584a.rotationY(f17);
        }
        ((com.tencent.mapsdk.internal.nr) this.f50567d).setRotationY(f17);
        a((com.tencent.mapsdk.internal.ns) this.f50567d);
    }

    @Override // com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlay
    public void setUnlit(boolean z17) {
        T t17 = this.f50567d;
        if (((com.tencent.mapsdk.internal.nr) t17).f50584a != null) {
            ((com.tencent.mapsdk.internal.nr) t17).f50584a.unlit(z17);
        }
        ((com.tencent.mapsdk.internal.nr) this.f50567d).setUnlit(z17);
        a((com.tencent.mapsdk.internal.ns) this.f50567d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay, com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlay
    public void setVisibility(boolean z17) {
        T t17 = this.f50567d;
        if (((com.tencent.mapsdk.internal.nr) t17).f50584a != null) {
            ((com.tencent.mapsdk.internal.nr) t17).f50584a.visibility(z17);
        }
        ((com.tencent.mapsdk.internal.nr) this.f50567d).setVisible(z17);
        a((com.tencent.mapsdk.internal.ns) this.f50567d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay
    public void setZIndex(int i17) {
        T t17 = this.f50567d;
        if (((com.tencent.mapsdk.internal.nr) t17).f50584a != null) {
            ((com.tencent.mapsdk.internal.nr) t17).f50584a.zIndex(i17);
        }
        ((com.tencent.mapsdk.internal.nr) this.f50567d).setzIndex(i17);
        a((com.tencent.mapsdk.internal.ns) this.f50567d);
    }

    @Override // com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlay
    public void stopSkeletonAnimation() {
        ((com.tencent.mapsdk.internal.nq) this.f50566c).a(this.f50565b);
    }

    @Override // com.tencent.mapsdk.internal.ng
    public final void a(long j17) {
        this.f50565b = j17;
    }

    private void a(com.tencent.mapsdk.internal.nh.a aVar) {
        com.tencent.mapsdk.internal.ko.a(new com.tencent.mapsdk.internal.ns.AnonymousClass1(aVar));
    }
}
