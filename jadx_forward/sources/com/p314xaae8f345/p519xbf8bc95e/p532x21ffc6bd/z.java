package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class z implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25972xaba233a3 {

    /* renamed from: a, reason: collision with root package name */
    protected com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne f134010a;

    /* renamed from: b, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk f134011b;

    /* renamed from: e, reason: collision with root package name */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26048xa050dd50 f134014e;

    /* renamed from: c, reason: collision with root package name */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26046x68d6a40d f134012c = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26046x68d6a40d(1.0f, 1.0f, 1.0f);

    /* renamed from: d, reason: collision with root package name */
    private float f134013d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26047x66511729 f134015f = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26047x66511729(1.0f, 0.0f, 0.0f);

    /* renamed from: g, reason: collision with root package name */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26046x68d6a40d f134016g = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26046x68d6a40d(1.0f, 1.0f, 1.0f);

    /* renamed from: h, reason: collision with root package name */
    private float f134017h = 2.5f;

    public z(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd bdVar) {
        this.f134011b = bdVar.i();
        this.f134010a = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne) bdVar;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25972xaba233a3
    /* renamed from: executeVisualLayerSettings */
    public final com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus mo37080x9d52ef7f(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.BaseCommandFunction baseCommandFunction) {
        if (baseCommandFunction == null) {
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo.ErrorMsg.jsonparse);
        }
        java.lang.String name = baseCommandFunction.getClass().getName();
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$ErrorCommandFunction")) {
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo.ErrorMsg.unsupported);
        }
        if (!name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$SetSpotOrDirectionalLightCommand")) {
            if (!name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$SetAmbientLightCommand")) {
                return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus();
            }
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetAmbientLightCommand setAmbientLightCommand = (com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetAmbientLightCommand) baseCommandFunction;
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.MonoColorParams monoColorParams = setAmbientLightCommand.f16380xc4aaf986.f16392x5a72f63;
            if (monoColorParams != null) {
                this.f134012c = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26046x68d6a40d(monoColorParams.f130206r, monoColorParams.f130205g, monoColorParams.f130204b);
            }
            float f17 = setAmbientLightCommand.f16380xc4aaf986.f16393x1dc31833;
            this.f134013d = f17;
            mo37081xbc30bee0(this.f134012c, f17);
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus();
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetSpotOrDirectionalLightCommand setSpotOrDirectionalLightCommand = (com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetSpotOrDirectionalLightCommand) baseCommandFunction;
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.SpotOrDirectionalLightParams spotOrDirectionalLightParams = setSpotOrDirectionalLightCommand.f16388xc4aaf986;
        int i17 = spotOrDirectionalLightParams.f16417x368f3a;
        if (i17 == 0) {
            this.f134014e = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26048xa050dd50.SPOTLIGHT;
        } else {
            if (i17 != 1) {
                return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo.ErrorMsg.invalidparam.m35429x3d29bbb6("type value must be 0 or 1"));
            }
            this.f134014e = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26048xa050dd50.DIRECTIONALLIGHT;
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.MonoColorParams monoColorParams2 = spotOrDirectionalLightParams.f16414x5a72f63;
        if (monoColorParams2 != null) {
            this.f134016g = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26046x68d6a40d(monoColorParams2.f130206r, monoColorParams2.f130205g, monoColorParams2.f130204b);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.DirectionalParams directionalParams = setSpotOrDirectionalLightCommand.f16388xc4aaf986.f16415xc6a0077f;
        if (directionalParams != null) {
            this.f134015f = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26047x66511729(directionalParams.f130201x, directionalParams.f130202y, directionalParams.f130203z);
        }
        float f18 = setSpotOrDirectionalLightCommand.f16388xc4aaf986.f16416x1dc31833;
        this.f134017h = f18;
        mo37082x8e15eef3(this.f134014e, this.f134016g, this.f134015f, f18);
        return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25972xaba233a3
    /* renamed from: setAmbientLight */
    public final void mo37081xbc30bee0(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26046x68d6a40d c26046x68d6a40d, float f17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f134011b;
        tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass99(c26046x68d6a40d, f17));
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25972xaba233a3
    /* renamed from: setSpotOrDirectionalLight */
    public final void mo37082x8e15eef3(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26048xa050dd50 enumC26048xa050dd50, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26046x68d6a40d c26046x68d6a40d, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26047x66511729 c26047x66511729, float f17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f134011b;
        tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass100(enumC26048xa050dd50, c26046x68d6a40d, c26047x66511729, f17));
    }
}
