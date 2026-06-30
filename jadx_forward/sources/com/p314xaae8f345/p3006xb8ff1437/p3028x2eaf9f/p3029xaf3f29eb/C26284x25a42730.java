package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb;

/* renamed from: com.tencent.thumbplayer.core.common.TPAudioPassThroughCapabilities */
/* loaded from: classes13.dex */
public final class C26284x25a42730 {

    /* renamed from: DEFAULT_MAX_CHANNEL_COUNT */
    private static final int f51604x7309283a = 8;

    /* renamed from: EXTERNAL_SURROUND_SOUND_KEY */
    private static final java.lang.String f51606xa37b7e22 = "external_surround_sound_enabled";

    /* renamed from: maxChannelCount */
    private final int f51607xa8499150;

    /* renamed from: supportedEncodings */
    private final int[] f51608xc9402c72;

    /* renamed from: DEFAULT_AUDIO_CAPABILITIES */
    public static final com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26284x25a42730 f51603x3c2e3c7d = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26284x25a42730(new int[]{2}, 8);

    /* renamed from: EXTERNAL_SURROUND_SOUND_CAPABILITIES */
    private static final com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26284x25a42730 f51605x8f8f4b33 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26284x25a42730(new int[]{2, 5, 6}, 8);

    public C26284x25a42730(int[] iArr, int i17) {
        if (iArr != null) {
            int[] copyOf = java.util.Arrays.copyOf(iArr, iArr.length);
            this.f51608xc9402c72 = copyOf;
            java.util.Arrays.sort(copyOf);
        } else {
            this.f51608xc9402c72 = new int[0];
        }
        this.f51607xa8499150 = i17;
    }

    /* renamed from: getCapabilities */
    public static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26284x25a42730 m101668x847a22c(android.content.Context context) {
        return m101669x847a22c(context, context.registerReceiver(null, new android.content.IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    /* renamed from: equals */
    public boolean m101670xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26284x25a42730)) {
            return false;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26284x25a42730 c26284x25a42730 = (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26284x25a42730) obj;
        return java.util.Arrays.equals(this.f51608xc9402c72, c26284x25a42730.f51608xc9402c72) && this.f51607xa8499150 == c26284x25a42730.f51607xa8499150;
    }

    /* renamed from: getMaxChannelCount */
    public int m101671x8cab631a() {
        return this.f51607xa8499150;
    }

    /* renamed from: hashCode */
    public int m101672x8cdac1b() {
        return this.f51607xa8499150 + (java.util.Arrays.hashCode(this.f51608xc9402c72) * 31);
    }

    /* renamed from: supportsEncoding */
    public boolean m101673xe9e647f7(int i17) {
        return java.util.Arrays.binarySearch(this.f51608xc9402c72, i17) >= 0;
    }

    /* renamed from: toString */
    public java.lang.String m101674x9616526c() {
        return "AudioCapabilities[maxChannelCount=" + this.f51607xa8499150 + ", supportedEncodings=" + java.util.Arrays.toString(this.f51608xc9402c72) + "]";
    }

    /* renamed from: getCapabilities */
    public static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26284x25a42730 m101669x847a22c(android.content.Context context, android.content.Intent intent) {
        if (intent != null && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
            return new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26284x25a42730(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        }
        return f51603x3c2e3c7d;
    }
}
