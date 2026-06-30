package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public class ns extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr> implements com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.InterfaceC4293x33dcde6c {

    /* renamed from: e, reason: collision with root package name */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26021xc84d9a6d f132118e;

    /* renamed from: com.tencent.mapsdk.internal.ns$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass1 implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.mapsdk.internal.nh.a f132119a;

        public AnonymousClass1(com.tencent.mapsdk.internal.nh.a aVar) {
            this.f132119a = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns.this.f132100d).m35421xac5665b8() != null) {
                ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns.this.f132100d).m35421xac5665b8().mo36965x82f09148(this.f132119a.mo36852xa86cd69f(), this.f132119a.mo36850x8dc9649f(), this.f132119a.mo36851xfb82e301());
            }
        }
    }

    public ns(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nq nqVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr nrVar) {
        super(nqVar, nrVar);
    }

    public final void c() {
        if (this.f132118e != null) {
            if (((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d).f132117a.m35692x3f3cf2f6() != null) {
                this.f132118e.m99425xcae17624(((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d).f132117a.m35692x3f3cf2f6());
            }
            this.f132118e.mo99421x5236b62a();
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d
    /* renamed from: enableClick */
    public void mo35532xa947a9c5(boolean z17) {
        T t17 = this.f132100d;
        if (((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) t17).f132117a != null) {
            ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) t17).f132117a.mo35584xa947a9c5(z17);
        }
        ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d).m35300xa947a9c5(z17);
        a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns) this.f132100d);
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
            ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d).m35324x2e1094e(zoomLevelRangeParams.f16424xad622852, zoomLevelRangeParams.f16423x1740c480);
            a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns) this.f132100d);
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus();
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$StartTranslateAnimationCommand")) {
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.StartTranslateAnimationCommand startTranslateAnimationCommand = (com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.StartTranslateAnimationCommand) baseCommandFunction;
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.StartTranslateAnimationParams startTranslateAnimationParams = startTranslateAnimationCommand.f16391xc4aaf986;
            if (startTranslateAnimationParams != null && startTranslateAnimationParams.f16421x65c08c6a != null) {
                c();
                this.f132118e = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26021xc84d9a6d.Builder(this, r1.f16418x89444d94 * 1000.0f, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[]) startTranslateAnimationCommand.f16391xc4aaf986.f16421x65c08c6a.toArray(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[0])).m99436xc1f59966(startTranslateAnimationCommand.f16391xc4aaf986.f16420xae940991).m99435x88284203(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26021xc84d9a6d.ModelType.MODEL_OVERLAY).m99434xd75228b(startTranslateAnimationCommand.f16391xc4aaf986.f16419x84b6c8ae).m99433x59bc66e();
                if (((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d).f132117a.m35692x3f3cf2f6() != null) {
                    this.f132118e.m99420xc3f03ee7(((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d).f132117a.m35692x3f3cf2f6());
                }
                this.f132118e.mo99426x2d8c4542();
                return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus();
            }
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo.ErrorMsg.jsonparse);
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$SetRotationCommand")) {
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.RotationParams rotationParams = ((com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetRotationCommand) baseCommandFunction).f16386xc4aaf986;
            if (rotationParams == null) {
                return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo.ErrorMsg.jsonparse);
            }
            float f17 = rotationParams.f16409xb588e09a;
            float f18 = rotationParams.f16410xb588e09b;
            float f19 = rotationParams.f16411xb588e09c;
            T t17 = this.f132100d;
            if (((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) t17).f132117a != null) {
                ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) t17).f132117a.m35699xb588e09a(f17).m35700xb588e09b(f18).m35701xb588e09c(f19);
            }
            ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d).m35318x114a1258(f17);
            ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d).m35319x114a1259(f18);
            ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d).m35320x114a125a(f19);
            a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns) this.f132100d);
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus();
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$SetExposureCommand")) {
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetExposureCommand setExposureCommand = (com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetExposureCommand) baseCommandFunction;
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.ExposureParams exposureParams = setExposureCommand.f16381xc4aaf986;
            if (exposureParams == null) {
                return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo.ErrorMsg.jsonparse);
            }
            T t18 = this.f132100d;
            if (((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) t18).f132117a != null) {
                ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) t18).f132117a.m35705x3c61b89(exposureParams.f16399x8d337d07);
            }
            ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d).m35311x3c61b89(setExposureCommand.f16381xc4aaf986.f16399x8d337d07);
            a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns) this.f132100d);
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
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetCurrentMaterialVariantCommand")) {
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.BaseIntReturnInfo(mo35667x4ba299b());
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$ErrorCommandFunction")) {
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo.ErrorMsg.unsupported);
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$SetMaterialVariantCommand")) {
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.MaterialVariantIndexParams materialVariantIndexParams = ((com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetMaterialVariantCommand) baseCommandFunction).f16382xc4aaf986;
            if (materialVariantIndexParams == null) {
                return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo.ErrorMsg.jsonparse);
            }
            mo35673x15ce49c(materialVariantIndexParams.f16400x70b9b34d);
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus();
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetVisibleCommand")) {
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.BaseBooleanReturnInfo(((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d).m35309xf94337e8());
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$EnableUnlitCommand")) {
            mo35675x53d0221c(((com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.EnableUnlitCommand) baseCommandFunction).f16378xc4aaf986.f16398xa00f8b41);
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus();
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetMaterialVariantsCommand")) {
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.MaterialVariantsReturnInfo(mo35668x86431a4b());
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$SetPixelBoundCommand")) {
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetPixelBoundCommand setPixelBoundCommand = (com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetPixelBoundCommand) baseCommandFunction;
            if (setPixelBoundCommand.f16384xc4aaf986 == null) {
                return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo.ErrorMsg.jsonparse);
            }
            T t19 = this.f132100d;
            if (((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) t19).f132117a != null) {
                ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) t19).f132117a.m35679x191ebbcf(com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d.CoordType.PixelType);
                com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d c4294x45fc1c7d = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d).f132117a;
                com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.PixelBoundParams pixelBoundParams = setPixelBoundCommand.f16384xc4aaf986;
                c4294x45fc1c7d.m35697x9a2c38db(pixelBoundParams.f16404x6be2dc6, pixelBoundParams.f16403xb7389127);
            }
            ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d).m35310x74dfed8d(com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d.CoordType.PixelType.ordinal());
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr nrVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d;
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.PixelBoundParams pixelBoundParams2 = setPixelBoundCommand.f16384xc4aaf986;
            nrVar.m35317x191c209a(pixelBoundParams2.f16404x6be2dc6, pixelBoundParams2.f16403xb7389127);
            a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns) this.f132100d);
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus();
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetPositionCommand")) {
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.PositionReturnInfo(((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d).m35302xa86cd69f());
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetClickEnabledCommand")) {
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.BaseBooleanReturnInfo(mo35534x93c986e3());
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetScaleCommand")) {
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.BaseFloatReturnInfo((float) ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d).m35306x7520af94());
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$ResetColorCommand")) {
            mo35672xb237e5b1();
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus();
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetSkeletonAnimationInfoCommand")) {
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.SkeletonAnimationReturnInfo(mo35669x5395ad14());
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$SetPositionCommand")) {
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetPositionCommand setPositionCommand = (com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetPositionCommand) baseCommandFunction;
            if (setPositionCommand.f16385xc4aaf986 == null) {
                return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo.ErrorMsg.jsonparse);
            }
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.PositionParams positionParams = setPositionCommand.f16385xc4aaf986;
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(positionParams.lat, positionParams.lng, positionParams.f16408x79634aa2);
            T t27 = this.f132100d;
            if (((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) t27).f132117a != null) {
                ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) t27).f132117a.m35698x2c929929(c26041x873d1d26);
            }
            ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d).m35315x7ba1e230(c26041x873d1d26);
            a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns) this.f132100d);
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus();
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$EnableClickCommand")) {
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.EnableClickParams enableClickParams = ((com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.EnableClickCommand) baseCommandFunction).f16377xc4aaf986;
            if (enableClickParams == null) {
                return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo.ErrorMsg.jsonparse);
            }
            mo35532xa947a9c5(enableClickParams.f16397xa00f8b41);
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus();
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$SetScaleCommand")) {
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.ScaleParams scaleParams = ((com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetScaleCommand) baseCommandFunction).f16387xc4aaf986;
            if (scaleParams == null) {
                return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo.ErrorMsg.jsonparse);
            }
            float f27 = scaleParams.f16412x683094a;
            T t28 = this.f132100d;
            if (((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) t28).f132117a != null) {
                ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) t28).f132117a.m35679x191ebbcf(com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d.CoordType.GeoGraphicType);
                ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d).f132117a.m35702x683094a(f27);
            }
            ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d).m35310x74dfed8d(com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d.CoordType.GeoGraphicType.ordinal());
            ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d).m35321x53aeca08(f27);
            a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns) this.f132100d);
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus();
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetTypeCommand")) {
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.BaseStringReturnInfo(mo36854xfb85f7b0());
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$PlaySkeletonAnimationCommand")) {
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.PlaySkeletonAnimationParams playSkeletonAnimationParams = ((com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.PlaySkeletonAnimationCommand) baseCommandFunction).f16379xc4aaf986;
            if (playSkeletonAnimationParams == null) {
                return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo.ErrorMsg.jsonparse);
            }
            mo35671x14e74ce3(playSkeletonAnimationParams.f16405x5fb28d2, playSkeletonAnimationParams.f16407x6890047, playSkeletonAnimationParams.f16406xc84c2d9b);
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus();
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$SetMonoColorCommand")) {
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.MonoColorParams monoColorParams = ((com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetMonoColorCommand) baseCommandFunction).f16383xc4aaf986;
            if (monoColorParams == null) {
                return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo.ErrorMsg.jsonparse);
            }
            mo35674x3c28bfe(monoColorParams);
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus();
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetUnlitEnabledCommand")) {
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.BaseBooleanReturnInfo(mo35670x754207a8());
        }
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetRotationCommand")) {
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.RotationReturnInfo(((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d).m35303xb4f651e4(), ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d).m35304xb4f651e5(), ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d).m35305xb4f651e6());
        }
        if (!name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$StopSkeletonAnimationCommand")) {
            return !name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetExposureCommand") ? new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo.ErrorMsg.unsupported) : new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.BaseFloatReturnInfo(((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d).m35301x90dba7d());
        }
        mo35676xcdf145d5();
        return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus();
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.InterfaceC4293x33dcde6c
    /* renamed from: getCurrentMaterialVariant */
    public int mo35667x4ba299b() {
        java.lang.Object obj = this.f132099c;
        if (obj instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nq) {
            return ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nq) obj).d(this.f132098b);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.InterfaceC4293x33dcde6c
    /* renamed from: getMaterialVariants */
    public java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.MaterialVariantInfo> mo35668x86431a4b() {
        java.lang.Object obj = this.f132099c;
        if (obj instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nq) {
            return ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nq) obj).c(this.f132098b);
        }
        return null;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26027x51ae46b9
    /* renamed from: getRotation */
    public float mo36858x79734cf4() {
        return ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d).m35304xb4f651e5();
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.InterfaceC4293x33dcde6c
    /* renamed from: getSkeletonAnimationProperties */
    public java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.AnimationInfo> mo35669x5395ad14() {
        java.lang.Object obj = this.f132099c;
        if (obj instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nq) {
            return ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nq) obj).b(this.f132098b);
        }
        return null;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d
    /* renamed from: getType */
    public java.lang.String mo36854xfb85f7b0() {
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ef.GLModel.f130778h;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.InterfaceC4293x33dcde6c
    /* renamed from: getUnlit */
    public boolean mo35670x754207a8() {
        return ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d).m35307x754207a8();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d
    /* renamed from: isClickEnabled */
    public boolean mo35534x93c986e3() {
        return ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d).m35308x93c986e3();
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.InterfaceC4293x33dcde6c
    /* renamed from: playSkeletonAnimation */
    public void mo35671x14e74ce3(int i17, float f17, boolean z17) {
        ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nq) this.f132099c).a(this.f132098b, i17, f17, z17);
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.InterfaceC4293x33dcde6c
    /* renamed from: resetMonoColor */
    public void mo35672xb237e5b1() {
        java.lang.Object obj = this.f132099c;
        if (obj instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nq) {
            ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nq) obj).e(this.f132098b);
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d
    /* renamed from: setLevel */
    public void mo35536x534d5c42(int i17) {
        T t17 = this.f132100d;
        if (((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) t17).f132117a != null) {
            ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) t17).f132117a.mo35583x5f34bbe2(i17);
        }
        ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d).m35312x534d5c42(i17);
        a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns) this.f132100d);
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.InterfaceC4293x33dcde6c
    /* renamed from: setMaterialVariant */
    public void mo35673x15ce49c(int i17) {
        java.lang.Object obj = this.f132099c;
        if (obj instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nq) {
            ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nq) obj).a(this.f132098b, i17);
        }
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.InterfaceC4293x33dcde6c
    /* renamed from: setMonoColor */
    public void mo35674x3c28bfe(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.MonoColorParams monoColorParams) {
        java.lang.Object obj = this.f132099c;
        if ((obj instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nq) && monoColorParams != null) {
            ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nq) obj).a(this.f132098b, monoColorParams.f130206r, monoColorParams.f130205g, monoColorParams.f130204b);
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26096xab512edd
    /* renamed from: setOpacity */
    public void mo36855x65b68149(float f17) {
        T t17 = this.f132100d;
        if (((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) t17).f132117a != null) {
            ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) t17).f132117a.mo35596xb477f80b(f17);
        }
        ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d).m35316x65b68149(f17);
        a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns) this.f132100d);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26027x51ae46b9
    /* renamed from: setPosition */
    public void mo36859xa32537ab(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        T t17 = this.f132100d;
        if (((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) t17).f132117a != null) {
            ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) t17).f132117a.m35698x2c929929(c26041x873d1d26);
        }
        ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d).m35315x7ba1e230(c26041x873d1d26);
        a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns) this.f132100d);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26027x51ae46b9
    /* renamed from: setRotation */
    public void mo36860x742bae00(float f17) {
        T t17 = this.f132100d;
        if (((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) t17).f132117a != null) {
            ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) t17).f132117a.m35700xb588e09b(f17);
        }
        ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d).m35319x114a1259(f17);
        a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns) this.f132100d);
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.InterfaceC4293x33dcde6c
    /* renamed from: setUnlit */
    public void mo35675x53d0221c(boolean z17) {
        T t17 = this.f132100d;
        if (((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) t17).f132117a != null) {
            ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) t17).f132117a.m35707x6a4615e(z17);
        }
        ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d).m35322x53d0221c(z17);
        a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns) this.f132100d);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26096xab512edd
    /* renamed from: setVisibility */
    public void mo36856x901b6914(boolean z17) {
        T t17 = this.f132100d;
        if (((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) t17).f132117a != null) {
            ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) t17).f132117a.mo35600x73b66312(z17);
        }
        ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d).m35323xcd1079b0(z17);
        a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns) this.f132100d);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d
    /* renamed from: setZIndex */
    public void mo36857x2cb3cb7a(int i17) {
        T t17 = this.f132100d;
        if (((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) t17).f132117a != null) {
            ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) t17).f132117a.mo35601xd4677478(i17);
        }
        ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr) this.f132100d).m35325x634edf5a(i17);
        a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns) this.f132100d);
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.InterfaceC4293x33dcde6c
    /* renamed from: stopSkeletonAnimation */
    public void mo35676xcdf145d5() {
        ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nq) this.f132099c).a(this.f132098b);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng
    public final void a(long j17) {
        this.f132098b = j17;
    }

    private void a(com.tencent.mapsdk.internal.nh.a aVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns.AnonymousClass1(aVar));
    }
}
