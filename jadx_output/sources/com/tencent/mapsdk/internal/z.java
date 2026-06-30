package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class z implements com.tencent.tencentmap.mapsdk.maps.VisualSettings {

    /* renamed from: a, reason: collision with root package name */
    protected com.tencent.mapsdk.internal.ne f52477a;

    /* renamed from: b, reason: collision with root package name */
    private com.tencent.mapsdk.internal.tk f52478b;

    /* renamed from: e, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.model.LightType f52481e;

    /* renamed from: c, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.model.LightColor f52479c = new com.tencent.tencentmap.mapsdk.maps.model.LightColor(1.0f, 1.0f, 1.0f);

    /* renamed from: d, reason: collision with root package name */
    private float f52480d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.model.LightDirection f52482f = new com.tencent.tencentmap.mapsdk.maps.model.LightDirection(1.0f, 0.0f, 0.0f);

    /* renamed from: g, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.model.LightColor f52483g = new com.tencent.tencentmap.mapsdk.maps.model.LightColor(1.0f, 1.0f, 1.0f);

    /* renamed from: h, reason: collision with root package name */
    private float f52484h = 2.5f;

    public z(com.tencent.mapsdk.internal.bd bdVar) {
        this.f52478b = bdVar.i();
        this.f52477a = (com.tencent.mapsdk.internal.ne) bdVar;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.VisualSettings
    public final com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus executeVisualLayerSettings(com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction baseCommandFunction) {
        if (baseCommandFunction == null) {
            return new com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo(com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse);
        }
        java.lang.String name = baseCommandFunction.getClass().getName();
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$ErrorCommandFunction")) {
            return new com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo(com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.unsupported);
        }
        if (!name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$SetSpotOrDirectionalLightCommand")) {
            if (!name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$SetAmbientLightCommand")) {
                return new com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus();
            }
            com.tencent.map.lib.models.CommandFunctionModelClass.SetAmbientLightCommand setAmbientLightCommand = (com.tencent.map.lib.models.CommandFunctionModelClass.SetAmbientLightCommand) baseCommandFunction;
            com.tencent.map.lib.models.CommonParamsModelClass.MonoColorParams monoColorParams = setAmbientLightCommand.params.color;
            if (monoColorParams != null) {
                this.f52479c = new com.tencent.tencentmap.mapsdk.maps.model.LightColor(monoColorParams.f48673r, monoColorParams.f48672g, monoColorParams.f48671b);
            }
            float f17 = setAmbientLightCommand.params.intensity;
            this.f52480d = f17;
            setAmbientLight(this.f52479c, f17);
            return new com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus();
        }
        com.tencent.map.lib.models.CommandFunctionModelClass.SetSpotOrDirectionalLightCommand setSpotOrDirectionalLightCommand = (com.tencent.map.lib.models.CommandFunctionModelClass.SetSpotOrDirectionalLightCommand) baseCommandFunction;
        com.tencent.map.lib.models.CommonParamsModelClass.SpotOrDirectionalLightParams spotOrDirectionalLightParams = setSpotOrDirectionalLightCommand.params;
        int i17 = spotOrDirectionalLightParams.type;
        if (i17 == 0) {
            this.f52481e = com.tencent.tencentmap.mapsdk.maps.model.LightType.SPOTLIGHT;
        } else {
            if (i17 != 1) {
                return new com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo(com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.invalidparam.bindErrorMsg("type value must be 0 or 1"));
            }
            this.f52481e = com.tencent.tencentmap.mapsdk.maps.model.LightType.DIRECTIONALLIGHT;
        }
        com.tencent.map.lib.models.CommonParamsModelClass.MonoColorParams monoColorParams2 = spotOrDirectionalLightParams.color;
        if (monoColorParams2 != null) {
            this.f52483g = new com.tencent.tencentmap.mapsdk.maps.model.LightColor(monoColorParams2.f48673r, monoColorParams2.f48672g, monoColorParams2.f48671b);
        }
        com.tencent.map.lib.models.CommonParamsModelClass.DirectionalParams directionalParams = setSpotOrDirectionalLightCommand.params.direction;
        if (directionalParams != null) {
            this.f52482f = new com.tencent.tencentmap.mapsdk.maps.model.LightDirection(directionalParams.f48668x, directionalParams.f48669y, directionalParams.f48670z);
        }
        float f18 = setSpotOrDirectionalLightCommand.params.intensity;
        this.f52484h = f18;
        setSpotOrDirectionalLight(this.f52481e, this.f52483g, this.f52482f, f18);
        return new com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.VisualSettings
    public final void setAmbientLight(com.tencent.tencentmap.mapsdk.maps.model.LightColor lightColor, float f17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f52478b;
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass99(lightColor, f17));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.VisualSettings
    public final void setSpotOrDirectionalLight(com.tencent.tencentmap.mapsdk.maps.model.LightType lightType, com.tencent.tencentmap.mapsdk.maps.model.LightColor lightColor, com.tencent.tencentmap.mapsdk.maps.model.LightDirection lightDirection, float f17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f52478b;
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass100(lightType, lightColor, lightDirection, f17));
    }
}
