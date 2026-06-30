package com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa;

/* renamed from: com.tencent.tav.core.composition.VideoCompositionLayerInstruction */
/* loaded from: classes16.dex */
public interface InterfaceC25708x5f378eec {

    /* renamed from: com.tencent.tav.core.composition.VideoCompositionLayerInstruction$CropRectangleRamp */
    /* loaded from: classes16.dex */
    public static class CropRectangleRamp {

        /* renamed from: available */
        public boolean f47665xd4418ac9 = true;

        /* renamed from: endCropRectangle */
        public com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 f47666xd87017a4;

        /* renamed from: startCropRectangle */
        public com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 f47667xb1f40f7d;

        /* renamed from: timeRange */
        public com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 f47668x16fae70;

        public CropRectangleRamp(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
            this.f47668x16fae70 = c25738xead39d26;
        }
    }

    /* renamed from: com.tencent.tav.core.composition.VideoCompositionLayerInstruction$OpacityRamp */
    /* loaded from: classes16.dex */
    public static class OpacityRamp {

        /* renamed from: timeRange */
        public com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 f47672x16fae70;

        /* renamed from: startOpacity */
        public float f47671xac747949 = 1.0f;

        /* renamed from: endOpacity */
        public float f47670xc2076ab0 = 1.0f;

        /* renamed from: available */
        public boolean f47669xd4418ac9 = true;

        public OpacityRamp(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
            this.f47672x16fae70 = c25738xead39d26;
        }
    }

    /* renamed from: com.tencent.tav.core.composition.VideoCompositionLayerInstruction$TransformRamp */
    /* loaded from: classes16.dex */
    public static class TransformRamp {

        /* renamed from: available */
        public boolean f47673xd4418ac9 = true;

        /* renamed from: endTransform */
        public com.p314xaae8f345.tav.p2957xa228aba5.C25747xb6308b4c f47674x263bc8d1;

        /* renamed from: startTransform */
        public com.p314xaae8f345.tav.p2957xa228aba5.C25747xb6308b4c f47675x299f952a;

        /* renamed from: timeRange */
        public com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 f47676x16fae70;

        public TransformRamp(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
            this.f47676x16fae70 = c25738xead39d26;
        }
    }

    /* renamed from: getCropRectangleRampForTime */
    com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.CropRectangleRamp mo96944x19c4e1fb(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57);

    /* renamed from: getOpacityRampForTime */
    com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.OpacityRamp mo96945x3ae3e7af(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57);

    /* renamed from: getTrackID */
    int mo96946xfe2e0f70();

    /* renamed from: getTransformRampForTime */
    com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.TransformRamp mo96947xfae6982e(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57);
}
