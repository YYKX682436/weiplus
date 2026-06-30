package com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p423xc53e9ae1;

/* renamed from: com.tencent.live2.jsplugin.player.V2TXLivePlayerJSConfig */
/* loaded from: classes16.dex */
public class C3890xc5128a18 {

    /* renamed from: sAudioRoute */
    public static int f15556xb52e44e6 = com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXAudioRoute.TXAudioRouteSpeakerphone.ordinal();

    /* renamed from: audioRoute */
    public int f15557x5ba01c13;

    /* renamed from: enableDebugView */
    public boolean f15558x6f9b6155;

    /* renamed from: enableRecvSEIMessage */
    public boolean f15559x2eec3e99;

    /* renamed from: fillMode */
    public com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveFillMode f15560xd48829c6;

    /* renamed from: isAutoPlay */
    public boolean f15561x267714cd;

    /* renamed from: isCanAutoPlay */
    public boolean f15562xdf3b1de9;

    /* renamed from: isMuteAudio */
    public boolean f15563x89c10333;

    /* renamed from: isMuteVideo */
    public boolean f15564x8ae37bd8;

    /* renamed from: maxCache */
    public float f15565x16bfd87e;

    /* renamed from: minCache */
    public float f15566xace13c50;

    /* renamed from: mode */
    public int f15567x3339a3;

    /* renamed from: renderRotation */
    public com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveRotation f15568x8f06bf34;
    public java.lang.String url;

    /* renamed from: volumeNotifyIntervals */
    public int f15569x199fd88b;

    public C3890xc5128a18() {
        this.url = "";
        this.f15567x3339a3 = 1;
        this.f15562xdf3b1de9 = true;
        this.f15566xace13c50 = 1.0f;
        this.f15565x16bfd87e = 3.0f;
        this.f15557x5ba01c13 = com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXAudioRoute.TXAudioRouteSpeakerphone.ordinal();
        this.f15560xd48829c6 = com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveFillMode.V2TXLiveFillModeFill;
        this.f15568x8f06bf34 = com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveRotation.V2TXLiveRotation0;
    }

    /* renamed from: diffConfig */
    public java.lang.String m31969x2cd9a3a7(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p423xc53e9ae1.C3890xc5128a18 c3890xc5128a18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = this.url;
        if (str != null && !str.equals(c3890xc5128a18.url)) {
            sb6.append("[url:");
            sb6.append(com.p314xaae8f345.p420x6236cc6.p421x316220.C3884x280948e5.m31923x4eea1bd9(this.url));
            sb6.append("]");
        }
        if (this.f15567x3339a3 != c3890xc5128a18.f15567x3339a3) {
            sb6.append("[mode:");
            sb6.append(this.f15567x3339a3);
            sb6.append("]");
        }
        if (this.f15562xdf3b1de9 != c3890xc5128a18.f15562xdf3b1de9) {
            sb6.append("[isCanAutoPlay:");
            sb6.append(this.f15562xdf3b1de9);
            sb6.append("]");
        }
        if (this.f15561x267714cd != c3890xc5128a18.f15561x267714cd) {
            sb6.append("[isAutoPlay:");
            sb6.append(this.f15561x267714cd);
            sb6.append("]");
        }
        if (this.f15564x8ae37bd8 != c3890xc5128a18.f15564x8ae37bd8) {
            sb6.append("[isMuteVideo:");
            sb6.append(this.f15564x8ae37bd8);
            sb6.append("]");
        }
        if (this.f15563x89c10333 != c3890xc5128a18.f15563x89c10333) {
            sb6.append("[isMuteAudio:");
            sb6.append(this.f15563x89c10333);
            sb6.append("]");
        }
        if (this.f15559x2eec3e99 != c3890xc5128a18.f15559x2eec3e99) {
            sb6.append("[enableRecvSEIMessage:");
            sb6.append(this.f15559x2eec3e99);
            sb6.append("]");
        }
        if (this.f15566xace13c50 != c3890xc5128a18.f15566xace13c50) {
            sb6.append("[minCache:");
            sb6.append(this.f15566xace13c50);
            sb6.append("]");
        }
        if (this.f15565x16bfd87e != c3890xc5128a18.f15565x16bfd87e) {
            sb6.append("[macCache:");
            sb6.append(this.f15565x16bfd87e);
            sb6.append("]");
        }
        if (this.f15557x5ba01c13 != c3890xc5128a18.f15557x5ba01c13) {
            sb6.append("[audioRoute:");
            sb6.append(this.f15557x5ba01c13 == com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXAudioRoute.TXAudioRouteSpeakerphone.ordinal() ? "speaker" : "ear");
            sb6.append("]");
        }
        if (this.f15569x199fd88b != c3890xc5128a18.f15569x199fd88b) {
            sb6.append("[volumeNotifyIntervals:");
            sb6.append(this.f15569x199fd88b);
            sb6.append("]");
        }
        if (this.f15560xd48829c6 != c3890xc5128a18.f15560xd48829c6) {
            sb6.append("[fillMode:");
            sb6.append(this.f15560xd48829c6);
            sb6.append("]");
        }
        if (this.f15568x8f06bf34 != c3890xc5128a18.f15568x8f06bf34) {
            sb6.append("[renderRotation:");
            sb6.append(this.f15568x8f06bf34);
            sb6.append("]");
        }
        return sb6.toString();
    }

    /* renamed from: toString */
    public java.lang.String m31970x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[url:");
        sb6.append(com.p314xaae8f345.p420x6236cc6.p421x316220.C3884x280948e5.m31923x4eea1bd9(this.url));
        sb6.append("][mode:");
        sb6.append(this.f15567x3339a3);
        sb6.append("][isAutoPlay:");
        sb6.append(this.f15561x267714cd);
        sb6.append("][isCanAutoPlay:");
        sb6.append(this.f15562xdf3b1de9);
        sb6.append("][isMuteVideo:");
        sb6.append(this.f15564x8ae37bd8);
        sb6.append("][isMuteAudio:");
        sb6.append(this.f15563x89c10333);
        sb6.append("][enableDebugView:");
        sb6.append(this.f15558x6f9b6155);
        sb6.append("][enableRecvSEIMessage:");
        sb6.append(this.f15559x2eec3e99);
        sb6.append("][minCache:");
        sb6.append(this.f15566xace13c50);
        sb6.append("][maxCache:");
        sb6.append(this.f15565x16bfd87e);
        sb6.append("][volumeNotifyIntervals:");
        sb6.append(this.f15569x199fd88b);
        sb6.append("][audioRoute:");
        sb6.append(this.f15557x5ba01c13 == com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXAudioRoute.TXAudioRouteSpeakerphone.ordinal() ? "speaker" : "ear");
        sb6.append("][fillMode:");
        sb6.append(this.f15560xd48829c6);
        sb6.append("][renderRotation:");
        sb6.append(this.f15568x8f06bf34);
        sb6.append(']');
        return sb6.toString();
    }

    /* renamed from: updateFromBundle */
    public void m31971x1726ba75(android.os.Bundle bundle) {
        if (bundle.containsKey(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15498x8f853862)) {
            this.url = bundle.getString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15498x8f853862, "");
        }
        if (bundle.containsKey("mode")) {
            this.f15567x3339a3 = bundle.getInt("mode");
        }
        if (bundle.containsKey(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15485x340d78e6)) {
            this.f15561x267714cd = bundle.getBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15485x340d78e6);
        }
        if (bundle.containsKey(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15486x7e8b3a17)) {
            this.f15562xdf3b1de9 = bundle.getBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15486x7e8b3a17);
        }
        if (bundle.containsKey(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15493xb067d9d3)) {
            this.f15564x8ae37bd8 = bundle.getBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15493xb067d9d3);
        }
        if (bundle.containsKey(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15492xaf45612e)) {
            this.f15563x89c10333 = bundle.getBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15492xaf45612e);
        }
        if (bundle.containsKey("muted")) {
            this.f15563x89c10333 = bundle.getBoolean("muted");
        }
        if (bundle.containsKey("orientation")) {
            this.f15568x8f06bf34 = bundle.getString("orientation", "").equalsIgnoreCase("horizontal") ? com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveRotation.V2TXLiveRotation90 : com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveRotation.V2TXLiveRotation0;
        }
        if (bundle.containsKey(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15495x767d9974)) {
            this.f15560xd48829c6 = bundle.getString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15495x767d9974, "").equalsIgnoreCase("fillCrop") ? com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveFillMode.V2TXLiveFillModeFill : com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveFillMode.V2TXLiveFillModeFit;
        }
        if (bundle.containsKey(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15490x250b3437)) {
            this.f15566xace13c50 = bundle.getFloat(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15490x250b3437);
        }
        if (bundle.containsKey(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15489xf7001dc9)) {
            this.f15565x16bfd87e = bundle.getFloat(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15489xf7001dc9);
        }
        if (bundle.containsKey(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15488x8a0bb66c)) {
            this.f15559x2eec3e99 = bundle.getBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15488x8a0bb66c);
        }
        if (bundle.containsKey("needAudioVolume")) {
            this.f15569x199fd88b = bundle.getBoolean("needAudioVolume") ? 300 : 0;
        }
        if (bundle.containsKey("debug")) {
            this.f15558x6f9b6155 = bundle.getBoolean("debug");
        }
        if (bundle.containsKey(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15499x6ed1e11)) {
            int ordinal = bundle.getString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15499x6ed1e11, "").equalsIgnoreCase("speaker") ? com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXAudioRoute.TXAudioRouteSpeakerphone.ordinal() : com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXAudioRoute.TXAudioRouteEarpiece.ordinal();
            this.f15557x5ba01c13 = ordinal;
            f15556xb52e44e6 = ordinal;
        }
    }

    public C3890xc5128a18(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p423xc53e9ae1.C3890xc5128a18 c3890xc5128a18) {
        this.url = "";
        this.f15567x3339a3 = 1;
        this.f15562xdf3b1de9 = true;
        this.f15566xace13c50 = 1.0f;
        this.f15565x16bfd87e = 3.0f;
        this.f15557x5ba01c13 = com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXAudioRoute.TXAudioRouteSpeakerphone.ordinal();
        this.f15560xd48829c6 = com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveFillMode.V2TXLiveFillModeFill;
        this.f15568x8f06bf34 = com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveRotation.V2TXLiveRotation0;
        this.url = c3890xc5128a18.url;
        this.f15567x3339a3 = c3890xc5128a18.f15567x3339a3;
        this.f15561x267714cd = c3890xc5128a18.f15561x267714cd;
        this.f15562xdf3b1de9 = c3890xc5128a18.f15562xdf3b1de9;
        this.f15563x89c10333 = c3890xc5128a18.f15563x89c10333;
        this.f15564x8ae37bd8 = c3890xc5128a18.f15564x8ae37bd8;
        this.f15558x6f9b6155 = c3890xc5128a18.f15558x6f9b6155;
        this.f15559x2eec3e99 = c3890xc5128a18.f15559x2eec3e99;
        this.f15566xace13c50 = c3890xc5128a18.f15566xace13c50;
        this.f15565x16bfd87e = c3890xc5128a18.f15565x16bfd87e;
        this.f15569x199fd88b = c3890xc5128a18.f15569x199fd88b;
        this.f15557x5ba01c13 = c3890xc5128a18.f15557x5ba01c13;
        this.f15560xd48829c6 = c3890xc5128a18.f15560xd48829c6;
        this.f15568x8f06bf34 = c3890xc5128a18.f15568x8f06bf34;
    }
}
