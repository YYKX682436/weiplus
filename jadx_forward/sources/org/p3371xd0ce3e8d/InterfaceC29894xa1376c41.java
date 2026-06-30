package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.VideoEncoder */
/* loaded from: classes6.dex */
public interface InterfaceC29894xa1376c41 {

    /* renamed from: org.webrtc.VideoEncoder$BitrateAllocation */
    /* loaded from: classes6.dex */
    public static class BitrateAllocation {

        /* renamed from: bitratesBbs */
        public final int[][] f76073x79e747ad;

        public BitrateAllocation(int[][] iArr) {
            this.f76073x79e747ad = iArr;
        }

        /* renamed from: getSum */
        public int m156515xb5886f15() {
            int i17 = 0;
            for (int[] iArr : this.f76073x79e747ad) {
                for (int i18 : iArr) {
                    i17 += i18;
                }
            }
            return i17;
        }
    }

    /* renamed from: org.webrtc.VideoEncoder$Callback */
    /* loaded from: classes6.dex */
    public interface Callback {
        /* renamed from: onEncodedFrame */
        void mo156516x5c2fb87e(org.p3371xd0ce3e8d.C29774xf0e0810d c29774xf0e0810d, org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.CodecSpecificInfo codecSpecificInfo);
    }

    /* renamed from: org.webrtc.VideoEncoder$Capabilities */
    /* loaded from: classes6.dex */
    public static class Capabilities {

        /* renamed from: lossNotification */
        public final boolean f76074xe87007ae;

        public Capabilities(boolean z17) {
            this.f76074xe87007ae = z17;
        }
    }

    /* renamed from: org.webrtc.VideoEncoder$CodecSpecificInfo */
    /* loaded from: classes6.dex */
    public static class CodecSpecificInfo {
    }

    /* renamed from: org.webrtc.VideoEncoder$CodecSpecificInfoAV1 */
    /* loaded from: classes6.dex */
    public static class CodecSpecificInfoAV1 extends org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.CodecSpecificInfo {
    }

    /* renamed from: org.webrtc.VideoEncoder$CodecSpecificInfoH264 */
    /* loaded from: classes6.dex */
    public static class CodecSpecificInfoH264 extends org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.CodecSpecificInfo {
    }

    /* renamed from: org.webrtc.VideoEncoder$CodecSpecificInfoVP8 */
    /* loaded from: classes6.dex */
    public static class CodecSpecificInfoVP8 extends org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.CodecSpecificInfo {
    }

    /* renamed from: org.webrtc.VideoEncoder$CodecSpecificInfoVP9 */
    /* loaded from: classes6.dex */
    public static class CodecSpecificInfoVP9 extends org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.CodecSpecificInfo {
    }

    /* renamed from: org.webrtc.VideoEncoder$EncodeInfo */
    /* loaded from: classes6.dex */
    public static class EncodeInfo {

        /* renamed from: frameTypes */
        public final org.p3371xd0ce3e8d.C29774xf0e0810d.FrameType[] f76075xef479b0c;

        public EncodeInfo(org.p3371xd0ce3e8d.C29774xf0e0810d.FrameType[] frameTypeArr) {
            this.f76075xef479b0c = frameTypeArr;
        }
    }

    /* renamed from: org.webrtc.VideoEncoder$RateControlParameters */
    /* loaded from: classes6.dex */
    public static class RateControlParameters {

        /* renamed from: bitrate */
        public final org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.BitrateAllocation f76076xf9e77b6d;

        /* renamed from: framerateFps */
        public final double f76077x460b6ddc;

        public RateControlParameters(org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.BitrateAllocation bitrateAllocation, double d17) {
            this.f76076xf9e77b6d = bitrateAllocation;
            this.f76077x460b6ddc = d17;
        }
    }

    /* renamed from: org.webrtc.VideoEncoder$ResolutionBitrateLimits */
    /* loaded from: classes6.dex */
    public static class ResolutionBitrateLimits {

        /* renamed from: frameSizePixels */
        public final int f76078xb93ce75b;

        /* renamed from: maxBitrateBps */
        public final int f76079x5af44bbc;

        /* renamed from: minBitrateBps */
        public final int f76080xc7927b2a;

        /* renamed from: minStartBitrateBps */
        public final int f76081x8b22a888;

        public ResolutionBitrateLimits(int i17, int i18, int i19, int i27) {
            this.f76078xb93ce75b = i17;
            this.f76081x8b22a888 = i18;
            this.f76080xc7927b2a = i19;
            this.f76079x5af44bbc = i27;
        }

        /* renamed from: getFrameSizePixels */
        public int m156517x9d9eb925() {
            return this.f76078xb93ce75b;
        }

        /* renamed from: getMaxBitrateBps */
        public int m156518x18540806() {
            return this.f76079x5af44bbc;
        }

        /* renamed from: getMinBitrateBps */
        public int m156519x84f23774() {
            return this.f76080xc7927b2a;
        }

        /* renamed from: getMinStartBitrateBps */
        public int m156520x9e7f0a7e() {
            return this.f76081x8b22a888;
        }
    }

    /* renamed from: org.webrtc.VideoEncoder$Settings */
    /* loaded from: classes6.dex */
    public static class Settings {

        /* renamed from: automaticResizeOn */
        public final boolean f76083xb62284fe;

        /* renamed from: capabilities */
        public final org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.Capabilities f76084xa7550fb6;

        /* renamed from: height */
        public final int f76085xb7389127;

        /* renamed from: maxFramerate */
        public final int f76086xcbb5c2c9;

        /* renamed from: numberOfCores */
        public final int f76087xb03f7d94;

        /* renamed from: numberOfSimulcastStreams */
        public final int f76088x3de5b966;

        /* renamed from: startBitrate */
        public final int f76089xf1e3fcab;

        /* renamed from: width */
        public final int f76090x6be2dc6;

        @java.lang.Deprecated
        public Settings(int i17, int i18, int i19, int i27, int i28, int i29, boolean z17) {
            this(i17, i18, i19, i27, i28, i29, z17, new org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.Capabilities(false));
        }

        public Settings(int i17, int i18, int i19, int i27, int i28, int i29, boolean z17, org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.Capabilities capabilities) {
            this.f76087xb03f7d94 = i17;
            this.f76090x6be2dc6 = i18;
            this.f76085xb7389127 = i19;
            this.f76089xf1e3fcab = i27;
            this.f76086xcbb5c2c9 = i28;
            this.f76088x3de5b966 = i29;
            this.f76083xb62284fe = z17;
            this.f76084xa7550fb6 = capabilities;
        }
    }

    /* renamed from: createNativeVideoEncoder */
    default long mo155660xce00e7f4() {
        return 0L;
    }

    /* renamed from: encode */
    org.p3371xd0ce3e8d.EnumC29888x1fdab04d mo155584xb2963e16(org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2, org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.EncodeInfo encodeInfo);

    /* renamed from: getImplementationName */
    java.lang.String mo155586xb8d5d353();

    /* renamed from: getResolutionBitrateLimits */
    default org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.ResolutionBitrateLimits[] m156514x40f62463() {
        return new org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.ResolutionBitrateLimits[0];
    }

    /* renamed from: getScalingSettings */
    org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.ScalingSettings mo155587x43907694();

    /* renamed from: initEncode */
    org.p3371xd0ce3e8d.EnumC29888x1fdab04d mo155588xf7308346(org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.Settings settings, org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.Callback callback);

    /* renamed from: isHardwareEncoder */
    default boolean mo155661x488cb38a() {
        return true;
    }

    /* renamed from: release */
    org.p3371xd0ce3e8d.EnumC29888x1fdab04d mo155589x41012807();

    /* renamed from: setRateAllocation */
    org.p3371xd0ce3e8d.EnumC29888x1fdab04d mo155590xea8516e2(org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.BitrateAllocation bitrateAllocation, int i17);

    /* renamed from: setRates */
    default org.p3371xd0ce3e8d.EnumC29888x1fdab04d mo155591x53a01051(org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.RateControlParameters rateControlParameters) {
        return mo155590xea8516e2(rateControlParameters.f76076xf9e77b6d, (int) java.lang.Math.ceil(rateControlParameters.f76077x460b6ddc));
    }

    /* renamed from: org.webrtc.VideoEncoder$ScalingSettings */
    /* loaded from: classes13.dex */
    public static class ScalingSettings {
        public static final org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.ScalingSettings OFF = new org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.ScalingSettings();

        /* renamed from: high */
        public final java.lang.Integer f76082x30dda2;
        public final java.lang.Integer low;

        /* renamed from: on, reason: collision with root package name */
        public final boolean f429483on;

        public ScalingSettings(int i17, int i18) {
            this.f429483on = true;
            this.low = java.lang.Integer.valueOf(i17);
            this.f76082x30dda2 = java.lang.Integer.valueOf(i18);
        }

        /* renamed from: toString */
        public java.lang.String m156522x9616526c() {
            if (!this.f429483on) {
                return "OFF";
            }
            return "[ " + this.low + ", " + this.f76082x30dda2 + " ]";
        }

        private ScalingSettings() {
            this.f429483on = false;
            this.low = null;
            this.f76082x30dda2 = null;
        }

        @java.lang.Deprecated
        public ScalingSettings(boolean z17) {
            this.f429483on = z17;
            this.low = null;
            this.f76082x30dda2 = null;
        }

        @java.lang.Deprecated
        public ScalingSettings(boolean z17, int i17, int i18) {
            this.f429483on = z17;
            this.low = java.lang.Integer.valueOf(i17);
            this.f76082x30dda2 = java.lang.Integer.valueOf(i18);
        }
    }
}
