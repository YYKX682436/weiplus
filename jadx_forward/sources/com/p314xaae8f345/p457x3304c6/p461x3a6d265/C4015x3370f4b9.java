package com.p314xaae8f345.p457x3304c6.p461x3a6d265;

/* renamed from: com.tencent.maas.camstudio.MJCamPreviewSettings */
/* loaded from: classes5.dex */
public class C4015x3370f4b9 {

    /* renamed from: aigcGeneratingTimeout */
    private float f15858x210a16b;

    /* renamed from: cameraDimensionLevel */
    private rg.c f15859x3a735843;

    /* renamed from: defaultAspectRatio */
    private com.p314xaae8f345.p457x3304c6.p479x4179489f.c f15860x82e85192;

    /* renamed from: defaultLyricsStyle */
    private final com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4010x201fddcb f15861x68e42d1c;

    /* renamed from: forcedUseDimensionLevel */
    private rg.c f15862x4639e14c;

    /* renamed from: isAsyncAIGCEnabled */
    private boolean f15863x80c6e4eb;

    /* renamed from: isDeformNeedCrop */
    private final boolean f15864xbc34c3f5;

    /* renamed from: isUseAIGCBridgeService */
    private boolean f15865x6c408feb;

    /* renamed from: isUseEchoCancellation */
    private final boolean f15866x22a019e5;

    /* renamed from: isUseLongSide1920Policy */
    private boolean f15867xfd948448;

    /* renamed from: isUsingFrontCamera */
    private boolean f15868x33be18d4;

    /* renamed from: lensDirtyCheckThreshold */
    private float f15869x887a7ad7;

    /* renamed from: needRunningCaptureSession */
    private boolean f15870xc41d4119;

    /* renamed from: preloadCaptureSession */
    private com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4028xa5c0f76d f15871x19d72ed9;

    /* renamed from: previewDimensionLevel */
    private final rg.c f15872xf6bf1fa6;

    public C4015x3370f4b9(float f17, rg.c cVar, rg.c cVar2, boolean z17, boolean z18, com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4010x201fddcb c4010x201fddcb, float f18, boolean z19, boolean z27, rg.c cVar3) {
        this.f15865x6c408feb = false;
        this.f15863x80c6e4eb = false;
        this.f15860x82e85192 = null;
        this.f15871x19d72ed9 = null;
        this.f15870xc41d4119 = true;
        this.f15869x887a7ad7 = f17;
        this.f15872xf6bf1fa6 = cVar;
        this.f15862x4639e14c = cVar2;
        this.f15864xbc34c3f5 = z17;
        this.f15866x22a019e5 = z18;
        this.f15861x68e42d1c = c4010x201fddcb;
        this.f15858x210a16b = f18;
        this.f15867xfd948448 = z19;
        this.f15868x33be18d4 = z27;
        this.f15859x3a735843 = cVar3;
    }

    /* renamed from: getAigcGeneratingTimeout */
    public float m32621xdbc73b5() {
        return this.f15858x210a16b;
    }

    /* renamed from: getCameraDimensionLevel */
    public int m32622xe83f14b9() {
        rg.c cVar = this.f15859x3a735843;
        if (cVar != null) {
            return cVar.f476682d;
        }
        rg.c cVar2 = rg.c.DIMENSION_LEVEL_360;
        return 5;
    }

    /* renamed from: getDefaultAspectRatio */
    public int m32623x9644b388() {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.c cVar = this.f15860x82e85192;
        if (cVar == null) {
            return -1;
        }
        return cVar.f130015d;
    }

    /* renamed from: getDefaultLyricsStyle */
    public com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4010x201fddcb m32624x7c408f12() {
        return this.f15861x68e42d1c;
    }

    /* renamed from: getForcedUseDimensionLevel */
    public int m32625x163a4916() {
        rg.c cVar = this.f15862x4639e14c;
        if (cVar == null) {
            return -1;
        }
        return cVar.f476682d;
    }

    /* renamed from: getLensDirtyCheckThreshold */
    public float m32626x587ae2a1() {
        return this.f15869x887a7ad7;
    }

    /* renamed from: getPreloadCaptureSession */
    public com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4028xa5c0f76d m32627x25830123() {
        return this.f15871x19d72ed9;
    }

    /* renamed from: getPreviewDimensionLevel */
    public int m32628x26af1f0() {
        return this.f15872xf6bf1fa6.f476682d;
    }

    /* renamed from: isAsyncAIGCEnabled */
    public boolean m32629x80c6e4eb() {
        return this.f15863x80c6e4eb;
    }

    /* renamed from: isDeformNeedCrop */
    public boolean m32630xbc34c3f5() {
        return this.f15864xbc34c3f5;
    }

    /* renamed from: isNeedRunningCaptureSession */
    public boolean m32631x94f3d70f() {
        return this.f15870xc41d4119;
    }

    /* renamed from: isUseAIGCBridgeService */
    public boolean m32632x6c408feb() {
        return this.f15865x6c408feb;
    }

    /* renamed from: isUseEchoCancellation */
    public boolean m32633x22a019e5() {
        return this.f15866x22a019e5;
    }

    /* renamed from: isUseLongSide1920Policy */
    public boolean m32634xfd948448() {
        return this.f15867xfd948448;
    }

    /* renamed from: isUsingFrontCamera */
    public boolean m32635x33be18d4() {
        return this.f15868x33be18d4;
    }

    /* renamed from: setAigcGeneratingTimeout */
    public void m32636xddcf2629(float f17) {
        this.f15858x210a16b = f17;
    }

    /* renamed from: setAsyncAIGCEnabled */
    public void m32637x22b32423(boolean z17) {
        this.f15863x80c6e4eb = z17;
    }

    /* renamed from: setCameraDimensionLevel */
    public void m32638x629243c5(rg.c cVar) {
        this.f15859x3a735843 = cVar;
    }

    /* renamed from: setDefaultAspectRatio */
    public void m32639x2d703594(com.p314xaae8f345.p457x3304c6.p479x4179489f.c cVar) {
        this.f15860x82e85192 = cVar;
    }

    /* renamed from: setForcedUseDimensionLevel */
    public void m32640x2c6a2e8a(rg.c cVar) {
        this.f15862x4639e14c = cVar;
    }

    /* renamed from: setLensDirtyCheckThreshold */
    public void m32641x6eaac815(float f17) {
        this.f15869x887a7ad7 = f17;
    }

    /* renamed from: setNeedRunningCaptureSession */
    public void m32642xdf6f36d7(boolean z17) {
        this.f15870xc41d4119 = z17;
    }

    /* renamed from: setPreloadCaptureSession */
    public void m32643xf595b397(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4028xa5c0f76d c4028xa5c0f76d) {
        this.f15871x19d72ed9 = c4028xa5c0f76d;
    }

    /* renamed from: setUseAIGCBridgeService */
    public void m32644xb30a7323(boolean z17) {
        this.f15865x6c408feb = z17;
    }

    /* renamed from: setUseLongSide1920Policy */
    public void m32645x90070810(boolean z17) {
        this.f15867xfd948448 = z17;
    }

    /* renamed from: setUsingFrontCamera */
    public void m32646xd5aa580c(boolean z17) {
        this.f15868x33be18d4 = z17;
    }

    public C4015x3370f4b9(rg.c cVar) {
        this.f15858x210a16b = 30.0f;
        this.f15865x6c408feb = false;
        this.f15863x80c6e4eb = false;
        this.f15869x887a7ad7 = 0.75f;
        this.f15867xfd948448 = false;
        this.f15860x82e85192 = null;
        this.f15868x33be18d4 = false;
        this.f15859x3a735843 = null;
        this.f15871x19d72ed9 = null;
        this.f15870xc41d4119 = true;
        this.f15872xf6bf1fa6 = cVar;
        this.f15862x4639e14c = null;
        this.f15864xbc34c3f5 = false;
        this.f15866x22a019e5 = false;
        this.f15861x68e42d1c = null;
    }

    public C4015x3370f4b9(rg.c cVar, boolean z17) {
        this.f15858x210a16b = 30.0f;
        this.f15865x6c408feb = false;
        this.f15863x80c6e4eb = false;
        this.f15869x887a7ad7 = 0.75f;
        this.f15867xfd948448 = false;
        this.f15860x82e85192 = null;
        this.f15859x3a735843 = null;
        this.f15871x19d72ed9 = null;
        this.f15870xc41d4119 = true;
        this.f15868x33be18d4 = z17;
        this.f15872xf6bf1fa6 = cVar;
        this.f15862x4639e14c = null;
        this.f15864xbc34c3f5 = false;
        this.f15866x22a019e5 = false;
        this.f15861x68e42d1c = null;
    }

    public C4015x3370f4b9(rg.c cVar, boolean z17, boolean z18) {
        this.f15858x210a16b = 30.0f;
        this.f15865x6c408feb = false;
        this.f15863x80c6e4eb = false;
        this.f15869x887a7ad7 = 0.75f;
        this.f15867xfd948448 = false;
        this.f15860x82e85192 = null;
        this.f15868x33be18d4 = false;
        this.f15859x3a735843 = null;
        this.f15871x19d72ed9 = null;
        this.f15870xc41d4119 = true;
        this.f15872xf6bf1fa6 = cVar;
        this.f15862x4639e14c = null;
        this.f15864xbc34c3f5 = z17;
        this.f15866x22a019e5 = z18;
        this.f15861x68e42d1c = null;
    }

    public C4015x3370f4b9(rg.c cVar, boolean z17, boolean z18, com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4010x201fddcb c4010x201fddcb) {
        this.f15858x210a16b = 30.0f;
        this.f15865x6c408feb = false;
        this.f15863x80c6e4eb = false;
        this.f15869x887a7ad7 = 0.75f;
        this.f15867xfd948448 = false;
        this.f15860x82e85192 = null;
        this.f15868x33be18d4 = false;
        this.f15859x3a735843 = null;
        this.f15871x19d72ed9 = null;
        this.f15870xc41d4119 = true;
        this.f15872xf6bf1fa6 = cVar;
        this.f15862x4639e14c = null;
        this.f15864xbc34c3f5 = z17;
        this.f15866x22a019e5 = z18;
        this.f15861x68e42d1c = c4010x201fddcb;
    }
}
