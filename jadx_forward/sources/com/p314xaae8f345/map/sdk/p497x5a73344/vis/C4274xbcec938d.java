package com.p314xaae8f345.map.sdk.p497x5a73344.vis;

/* renamed from: com.tencent.map.sdk.comps.vis.VisualLayerOptions */
/* loaded from: classes13.dex */
public class C4274xbcec938d implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25990x18bf1e7e<com.p314xaae8f345.map.sdk.p497x5a73344.vis.C4274xbcec938d, com.p314xaae8f345.map.sdk.p497x5a73344.vis.C4275x165a4b4e> {

    /* renamed from: mLayerId */
    java.lang.String f16703x9b98811f;

    /* renamed from: mZIndex */
    int f16706x23d39b45;

    /* renamed from: mLevel */
    int f16704xbe5ee717 = 1;

    /* renamed from: mTimeInternal */
    int f16705xce0079b7 = 0;

    /* renamed from: mAlpha */
    float f16700xbdc6fcf1 = 1.0f;

    /* renamed from: mIsVisible */
    boolean f16702x73fa81fb = true;

    /* renamed from: mClickEnabled */
    boolean f16701x58bfada6 = false;

    public C4274xbcec938d(java.lang.String str) {
        this.f16703x9b98811f = str;
    }

    /* renamed from: getAlpha */
    public float m35540x742757a8() {
        return this.f16700xbdc6fcf1;
    }

    /* renamed from: getLayerId */
    public java.lang.String m35541x3b4d0a16() {
        return this.f16703x9b98811f;
    }

    /* renamed from: getLevel */
    public int m35542x74bf41ce() {
        return this.f16704xbe5ee717;
    }

    /* renamed from: getTimeInterval */
    public int m35543x975e1128() {
        return this.f16705xce0079b7;
    }

    /* renamed from: getZIndex */
    public int m35544x397e976e() {
        return this.f16706x23d39b45;
    }

    /* renamed from: isClickEnabled */
    public boolean m35545x93c986e3() {
        return this.f16701x58bfada6;
    }

    /* renamed from: isVisible */
    public boolean m35546xf94337e8() {
        return this.f16702x73fa81fb;
    }

    /* renamed from: toString */
    public java.lang.String m35548x9616526c() {
        return "VisualLayerOptions{mLayerId='" + this.f16703x9b98811f + "', mLevel=" + this.f16704xbe5ee717 + ", mZIndex=" + this.f16706x23d39b45 + ", mTimeInternal=" + this.f16705xce0079b7 + ", mAlpha=" + this.f16700xbdc6fcf1 + ", mIsVisible=" + this.f16702x73fa81fb + ", mClickEnabled=" + this.f16701x58bfada6 + '}';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25990x18bf1e7e
    /* renamed from: newBuilder */
    public com.p314xaae8f345.map.sdk.p497x5a73344.vis.C4275x165a4b4e mo35547x3136c9db() {
        return new com.p314xaae8f345.map.sdk.p497x5a73344.vis.C4275x165a4b4e(this);
    }
}
