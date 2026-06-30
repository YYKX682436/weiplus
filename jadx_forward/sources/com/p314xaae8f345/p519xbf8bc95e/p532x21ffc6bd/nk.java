package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public class nk extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nl> implements com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p505x3228a6e2.InterfaceC4282xd8aacf2e, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26096xab512edd {
    public nk(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nm nmVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nl nlVar) {
        super(nmVar, nlVar);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d
    /* renamed from: enableClick */
    public void mo35532xa947a9c5(boolean z17) {
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d
    /* renamed from: executeCommandFunction */
    public com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus mo36853x3384840e(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.BaseCommandFunction baseCommandFunction) {
        if (baseCommandFunction == null) {
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo.ErrorMsg.jsonparse);
        }
        java.lang.String name = baseCommandFunction.getClass().getName();
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$SetZoomLevelRangeCommand")) {
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.ZoomLevelRangeParams zoomLevelRangeParams = ((com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetZoomLevelRangeCommand) baseCommandFunction).f16390xc4aaf986;
            if (zoomLevelRangeParams == null) {
                return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo.ErrorMsg.jsonparse);
            }
            ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nl) this.f132100d).m35260x2e1094e(zoomLevelRangeParams.f16424xad622852, zoomLevelRangeParams.f16423x1740c480);
            a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nk) this.f132100d);
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus();
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$SetVisibleCommand")) {
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.VisibleParams visibleParams = ((com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetVisibleCommand) baseCommandFunction).f16389xc4aaf986;
            if (visibleParams == null) {
                return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo.ErrorMsg.jsonparse);
            }
            mo36856x901b6914(visibleParams.f16422xf94337e8);
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus();
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetVisibleCommand")) {
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.BaseBooleanReturnInfo(((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nl) this.f132100d).m35242xf94337e8());
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetClickEnabledCommand")) {
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.BaseBooleanReturnInfo(mo35534x93c986e3());
        }
        if (!name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$EnableClickCommand")) {
            return !name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetTypeCommand") ? new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo.ErrorMsg.unsupported) : new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.BaseStringReturnInfo(mo36854xfb85f7b0());
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.EnableClickParams enableClickParams = ((com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.EnableClickCommand) baseCommandFunction).f16377xc4aaf986;
        if (enableClickParams == null) {
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo.ErrorMsg.jsonparse);
        }
        mo35532xa947a9c5(enableClickParams.f16397xa00f8b41);
        return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d
    /* renamed from: getType */
    public java.lang.String mo36854xfb85f7b0() {
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ef.Aggregation.f130778h;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p505x3228a6e2.InterfaceC4282xd8aacf2e, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26096xab512edd
    /* renamed from: getUnit */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26095x1582c113 mo35605xfb8641fa(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        java.lang.Object obj = this.f132099c;
        if (obj == null) {
            return null;
        }
        long j17 = this.f132098b;
        if (j17 == 0) {
            return null;
        }
        return ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nm) obj).a(j17, c26041x873d1d26);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d
    /* renamed from: isClickEnabled */
    public boolean mo35534x93c986e3() {
        return false;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d
    /* renamed from: setLevel */
    public void mo35536x534d5c42(int i17) {
        T t17 = this.f132100d;
        if (((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nl) t17).f132113a != null) {
            ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nl) t17).f132113a.mo35583x5f34bbe2(i17);
        }
        ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nl) this.f132100d).m35246xf6704964(i17);
        a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nk) this.f132100d);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26096xab512edd
    /* renamed from: setOpacity */
    public void mo36855x65b68149(float f17) {
        T t17 = this.f132100d;
        if (((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nl) t17).f132113a != null) {
            ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nl) t17).f132113a.mo35596xb477f80b(f17);
        }
        ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nl) this.f132100d).m35253x65b68149(f17);
        a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nk) this.f132100d);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26096xab512edd
    /* renamed from: setVisibility */
    public void mo36856x901b6914(boolean z17) {
        T t17 = this.f132100d;
        if (((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nl) t17).f132113a != null) {
            ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nl) t17).f132113a.mo35600x73b66312(z17);
        }
        ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nl) this.f132100d).m35258x901b6914(z17);
        a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nk) this.f132100d);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d
    /* renamed from: setZIndex */
    public void mo36857x2cb3cb7a(int i17) {
        T t17 = this.f132100d;
        if (((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nl) t17).f132113a != null) {
            ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nl) t17).f132113a.mo35601xd4677478(i17);
        }
        ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nl) this.f132100d).m35259x2cb3cb7a(i17);
        a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nk) this.f132100d);
    }
}
