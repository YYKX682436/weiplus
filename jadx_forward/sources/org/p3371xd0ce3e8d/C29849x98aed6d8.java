package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.RtpParameters */
/* loaded from: classes6.dex */
public class C29849x98aed6d8 {

    /* renamed from: codecs */
    public final java.util.List<org.p3371xd0ce3e8d.C29849x98aed6d8.Codec> f75878xaf3af31d;

    /* renamed from: degradationPreference */
    public org.p3371xd0ce3e8d.C29849x98aed6d8.DegradationPreference f75879xecefaf81;

    /* renamed from: encodings */
    public final java.util.List<org.p3371xd0ce3e8d.C29849x98aed6d8.Encoding> f75880x59e67d80;

    /* renamed from: headerExtensions */
    private final java.util.List<org.p3371xd0ce3e8d.C29849x98aed6d8.HeaderExtension> f75881x38f11e81;

    /* renamed from: rtcp */
    private final org.p3371xd0ce3e8d.C29849x98aed6d8.Rtcp f75882x35922f;

    /* renamed from: transactionId */
    public final java.lang.String f75883x1ab79c99;

    /* renamed from: org.webrtc.RtpParameters$Codec */
    /* loaded from: classes6.dex */
    public static class Codec {

        /* renamed from: clockRate */
        public java.lang.Integer f75884xc843e60e;

        /* renamed from: kind */
        org.p3371xd0ce3e8d.C29816x8efc747.MediaType f75885x323b94;

        /* renamed from: name */
        public java.lang.String f75886x337a8b;

        /* renamed from: numChannels */
        public java.lang.Integer f75887x1a374d76;

        /* renamed from: parameters */
        public java.util.Map<java.lang.String, java.lang.String> f75888x1b57c1ea;

        /* renamed from: payloadType */
        public int f75889x363c6de8;

        public Codec(int i17, java.lang.String str, org.p3371xd0ce3e8d.C29816x8efc747.MediaType mediaType, java.lang.Integer num, java.lang.Integer num2, java.util.Map<java.lang.String, java.lang.String> map) {
            this.f75889x363c6de8 = i17;
            this.f75886x337a8b = str;
            this.f75885x323b94 = mediaType;
            this.f75884xc843e60e = num;
            this.f75887x1a374d76 = num2;
            this.f75888x1b57c1ea = map;
        }

        /* renamed from: getClockRate */
        public java.lang.Integer m156255xc7b15758() {
            return this.f75884xc843e60e;
        }

        /* renamed from: getKind */
        public org.p3371xd0ce3e8d.C29816x8efc747.MediaType m156256xfb81a40a() {
            return this.f75885x323b94;
        }

        /* renamed from: getName */
        public java.lang.String m156257xfb82e301() {
            return this.f75886x337a8b;
        }

        /* renamed from: getNumChannels */
        public java.lang.Integer m156258xf40d9440() {
            return this.f75887x1a374d76;
        }

        /* renamed from: getParameters */
        public java.util.Map m156259x99879e0() {
            return this.f75888x1b57c1ea;
        }

        /* renamed from: getPayloadType */
        public int m156260x1012b4b2() {
            return this.f75889x363c6de8;
        }
    }

    /* renamed from: org.webrtc.RtpParameters$DegradationPreference */
    /* loaded from: classes6.dex */
    public enum DegradationPreference {
        DISABLED,
        MAINTAIN_FRAMERATE,
        MAINTAIN_RESOLUTION,
        BALANCED;

        /* renamed from: fromNativeIndex */
        public static org.p3371xd0ce3e8d.C29849x98aed6d8.DegradationPreference m156262xde3460f1(int i17) {
            return m156264xcee59d22()[i17];
        }
    }

    /* renamed from: org.webrtc.RtpParameters$HeaderExtension */
    /* loaded from: classes6.dex */
    public static class HeaderExtension {

        /* renamed from: encrypted */
        private final boolean f75905x603039c4;

        /* renamed from: id, reason: collision with root package name */
        private final int f429453id;
        private final java.lang.String uri;

        public HeaderExtension(java.lang.String str, int i17, boolean z17) {
            this.uri = str;
            this.f429453id = i17;
            this.f75905x603039c4 = z17;
        }

        /* renamed from: getEncrypted */
        public boolean m156276x5f9dab0e() {
            return this.f75905x603039c4;
        }

        /* renamed from: getId */
        public int m156277x5db1b11() {
            return this.f429453id;
        }

        /* renamed from: getUri */
        public java.lang.String m156278xb5887636() {
            return this.uri;
        }
    }

    /* renamed from: org.webrtc.RtpParameters$Rtcp */
    /* loaded from: classes6.dex */
    public static class Rtcp {

        /* renamed from: cname */
        private final java.lang.String f75906x5a6916e;

        /* renamed from: reducedSize */
        private final boolean f75907x3a80fcdf;

        public Rtcp(java.lang.String str, boolean z17) {
            this.f75906x5a6916e = str;
            this.f75907x3a80fcdf = z17;
        }

        /* renamed from: getCname */
        public java.lang.String m156279x744437b8() {
            return this.f75906x5a6916e;
        }

        /* renamed from: getReducedSize */
        public boolean m156280x145743a9() {
            return this.f75907x3a80fcdf;
        }
    }

    public C29849x98aed6d8(java.lang.String str, org.p3371xd0ce3e8d.C29849x98aed6d8.DegradationPreference degradationPreference, org.p3371xd0ce3e8d.C29849x98aed6d8.Rtcp rtcp, java.util.List<org.p3371xd0ce3e8d.C29849x98aed6d8.HeaderExtension> list, java.util.List<org.p3371xd0ce3e8d.C29849x98aed6d8.Encoding> list2, java.util.List<org.p3371xd0ce3e8d.C29849x98aed6d8.Codec> list3) {
        this.f75883x1ab79c99 = str;
        this.f75879xecefaf81 = degradationPreference;
        this.f75882x35922f = rtcp;
        this.f75881x38f11e81 = list;
        this.f75880x59e67d80 = list2;
        this.f75878xaf3af31d = list3;
    }

    /* renamed from: getCodecs */
    public java.util.List<org.p3371xd0ce3e8d.C29849x98aed6d8.Codec> m156249x14521613() {
        return this.f75878xaf3af31d;
    }

    /* renamed from: getDegradationPreference */
    public org.p3371xd0ce3e8d.C29849x98aed6d8.DegradationPreference m156250xf89b81cb() {
        return this.f75879xecefaf81;
    }

    /* renamed from: getEncodings */
    public java.util.List<org.p3371xd0ce3e8d.C29849x98aed6d8.Encoding> m156251x5953eeca() {
        return this.f75880x59e67d80;
    }

    /* renamed from: getHeaderExtensions */
    public java.util.List<org.p3371xd0ce3e8d.C29849x98aed6d8.HeaderExtension> m156252xe0c985f7() {
        return this.f75881x38f11e81;
    }

    /* renamed from: getRtcp */
    public org.p3371xd0ce3e8d.C29849x98aed6d8.Rtcp m156253xfb84faa5() {
        return this.f75882x35922f;
    }

    /* renamed from: getTransactionId */
    public java.lang.String m156254xd81758e3() {
        return this.f75883x1ab79c99;
    }

    /* renamed from: org.webrtc.RtpParameters$Encoding */
    /* loaded from: classes6.dex */
    public static class Encoding {

        /* renamed from: active */
        public boolean f75895xab2f7f06;

        /* renamed from: adaptiveAudioPacketTime */
        public boolean f75896x310a1a95;

        /* renamed from: bitratePriority */
        public double f75897xe3c29c31;

        /* renamed from: maxBitrateBps */
        public java.lang.Integer f75898x5af44bbc;

        /* renamed from: maxFramerate */
        public java.lang.Integer f75899xcbb5c2c9;

        /* renamed from: minBitrateBps */
        public java.lang.Integer f75900xc7927b2a;

        /* renamed from: networkPriority */
        public int f75901x6e9629f2;

        /* renamed from: numTemporalLayers */
        public java.lang.Integer f75902xcb419c2a;
        public java.lang.String rid;

        /* renamed from: scaleResolutionDownBy */
        public java.lang.Double f75903x8ce439cf;

        /* renamed from: ssrc */
        public java.lang.Long f75904x360491;

        public Encoding(java.lang.String str, boolean z17, java.lang.Double d17) {
            this.f75897xe3c29c31 = 1.0d;
            this.f75901x6e9629f2 = 1;
            this.rid = str;
            this.f75895xab2f7f06 = z17;
            this.f75903x8ce439cf = d17;
        }

        /* renamed from: getActive */
        public boolean m156265x1046a1fc() {
            return this.f75895xab2f7f06;
        }

        /* renamed from: getAdaptivePTime */
        public boolean m156266x46989ed1() {
            return this.f75896x310a1a95;
        }

        /* renamed from: getBitratePriority */
        public double m156267xc8246dfb() {
            return this.f75897xe3c29c31;
        }

        /* renamed from: getMaxBitrateBps */
        public java.lang.Integer m156268x18540806() {
            return this.f75898x5af44bbc;
        }

        /* renamed from: getMaxFramerate */
        public java.lang.Integer m156269x2ca8553f() {
            return this.f75899xcbb5c2c9;
        }

        /* renamed from: getMinBitrateBps */
        public java.lang.Integer m156270x84f23774() {
            return this.f75900xc7927b2a;
        }

        /* renamed from: getNetworkPriority */
        public int m156271x52f7fbbc() {
            return this.f75901x6e9629f2;
        }

        /* renamed from: getNumTemporalLayers */
        public java.lang.Integer m156272x1e762374() {
            return this.f75902xcb419c2a;
        }

        /* renamed from: getRid */
        public java.lang.String m156273xb58869d7() {
            return this.rid;
        }

        /* renamed from: getScaleResolutionDownBy */
        public java.lang.Double m156274x98900c19() {
            return this.f75903x8ce439cf;
        }

        /* renamed from: getSsrc */
        public java.lang.Long m156275xfb856d07() {
            return this.f75904x360491;
        }

        public Encoding(java.lang.String str, boolean z17, double d17, int i17, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4, java.lang.Double d18, java.lang.Long l17, boolean z18) {
            this.rid = str;
            this.f75895xab2f7f06 = z17;
            this.f75897xe3c29c31 = d17;
            this.f75901x6e9629f2 = i17;
            this.f75898x5af44bbc = num;
            this.f75900xc7927b2a = num2;
            this.f75899xcbb5c2c9 = num3;
            this.f75902xcb419c2a = num4;
            this.f75903x8ce439cf = d18;
            this.f75904x360491 = l17;
            this.f75896x310a1a95 = z18;
        }
    }
}
