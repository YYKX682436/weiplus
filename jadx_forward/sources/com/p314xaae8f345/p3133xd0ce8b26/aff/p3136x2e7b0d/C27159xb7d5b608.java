package com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d;

/* renamed from: com.tencent.wechat.aff.cara.CaraFoundationProto */
/* loaded from: classes15.dex */
public final class C27159xb7d5b608 {

    /* renamed from: com.tencent.wechat.aff.cara.CaraFoundationProto$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f59463xa1df5c61;

        static {
            int[] iArr = new int[com.p176xb6135e39.p283xc50a8b8b.l5.m20737xcee59d22().length];
            f59463xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f59463xa1df5c61[4] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f59463xa1df5c61[2] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f59463xa1df5c61[5] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f59463xa1df5c61[6] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f59463xa1df5c61[0] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f59463xa1df5c61[1] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: com.tencent.wechat.aff.cara.CaraFoundationProto$CaraDeviceBrand */
    /* loaded from: classes15.dex */
    public enum CaraDeviceBrand implements com.p176xb6135e39.p283xc50a8b8b.p6 {
        CARA_DEVICE_BRAND_UNKNOWN(0),
        CARA_DEVICE_BRAND_OTHER(1),
        CARA_DEVICE_BRAND_APPLE(2),
        CARA_DEVICE_BRAND_VIVO(3),
        CARA_DEVICE_BRAND_OPPO(4),
        CARA_DEVICE_BRAND_HUAWEI(5),
        CARA_DEVICE_BRAND_HONOR(6),
        CARA_DEVICE_BRAND_REDMI(7),
        CARA_DEVICE_BRAND_XIAOMI(8),
        CARA_DEVICE_BRAND_REALME(9),
        CARA_DEVICE_BRAND_SAMSUNG(10),
        CARA_DEVICE_BRAND_ONEPLUS(11);


        /* renamed from: CARA_DEVICE_BRAND_APPLE_VALUE */
        public static final int f59466xae988e7d = 2;

        /* renamed from: CARA_DEVICE_BRAND_HONOR_VALUE */
        public static final int f59468x8b5bab8d = 6;

        /* renamed from: CARA_DEVICE_BRAND_HUAWEI_VALUE */
        public static final int f59470xd624bca8 = 5;

        /* renamed from: CARA_DEVICE_BRAND_ONEPLUS_VALUE */
        public static final int f59472x65ddfb63 = 11;

        /* renamed from: CARA_DEVICE_BRAND_OPPO_VALUE */
        public static final int f59474xa80d7761 = 4;

        /* renamed from: CARA_DEVICE_BRAND_OTHER_VALUE */
        public static final int f59476xdaa569b3 = 1;

        /* renamed from: CARA_DEVICE_BRAND_REALME_VALUE */
        public static final int f59478xe149bb37 = 9;

        /* renamed from: CARA_DEVICE_BRAND_REDMI_VALUE */
        public static final int f59480x5ae576d0 = 7;

        /* renamed from: CARA_DEVICE_BRAND_SAMSUNG_VALUE */
        public static final int f59482x245b7edd = 10;

        /* renamed from: CARA_DEVICE_BRAND_UNKNOWN_VALUE */
        public static final int f59484x15c9ef2d = 0;

        /* renamed from: CARA_DEVICE_BRAND_VIVO_VALUE */
        public static final int f59486xb777936d = 3;

        /* renamed from: CARA_DEVICE_BRAND_XIAOMI_VALUE */
        public static final int f59488xf36ca07c = 8;

        /* renamed from: internalValueMap */
        private static final com.p176xb6135e39.p283xc50a8b8b.q6 f59489xc72c7808 = new com.p176xb6135e39.p283xc50a8b8b.q6() { // from class: com.tencent.wechat.aff.cara.CaraFoundationProto.CaraDeviceBrand.1
            @Override // com.p176xb6135e39.p283xc50a8b8b.q6
            /* renamed from: findValueByNumber */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraDeviceBrand mo20884xd369f9d8(int i17) {
                return com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraDeviceBrand.m111427x382ad972(i17);
            }
        };

        /* renamed from: value */
        private final int f59490x6ac9171;

        /* renamed from: com.tencent.wechat.aff.cara.CaraFoundationProto$CaraDeviceBrand$CaraDeviceBrandVerifier */
        /* loaded from: classes15.dex */
        public static final class CaraDeviceBrandVerifier implements com.p176xb6135e39.p283xc50a8b8b.r6 {

            /* renamed from: INSTANCE */
            static final com.p176xb6135e39.p283xc50a8b8b.r6 f59491x4fbc8495 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraDeviceBrand.CaraDeviceBrandVerifier();

            private CaraDeviceBrandVerifier() {
            }

            @Override // com.p176xb6135e39.p283xc50a8b8b.r6
            /* renamed from: isInRange */
            public boolean mo20891x5045f28e(int i17) {
                return com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraDeviceBrand.m111427x382ad972(i17) != null;
            }
        }

        CaraDeviceBrand(int i17) {
            this.f59490x6ac9171 = i17;
        }

        /* renamed from: forNumber */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraDeviceBrand m111427x382ad972(int i17) {
            switch (i17) {
                case 0:
                    return CARA_DEVICE_BRAND_UNKNOWN;
                case 1:
                    return CARA_DEVICE_BRAND_OTHER;
                case 2:
                    return CARA_DEVICE_BRAND_APPLE;
                case 3:
                    return CARA_DEVICE_BRAND_VIVO;
                case 4:
                    return CARA_DEVICE_BRAND_OPPO;
                case 5:
                    return CARA_DEVICE_BRAND_HUAWEI;
                case 6:
                    return CARA_DEVICE_BRAND_HONOR;
                case 7:
                    return CARA_DEVICE_BRAND_REDMI;
                case 8:
                    return CARA_DEVICE_BRAND_XIAOMI;
                case 9:
                    return CARA_DEVICE_BRAND_REALME;
                case 10:
                    return CARA_DEVICE_BRAND_SAMSUNG;
                case 11:
                    return CARA_DEVICE_BRAND_ONEPLUS;
                default:
                    return null;
            }
        }

        /* renamed from: internalGetValueMap */
        public static com.p176xb6135e39.p283xc50a8b8b.q6 m111428x97e5d0a4() {
            return f59489xc72c7808;
        }

        /* renamed from: internalGetVerifier */
        public static com.p176xb6135e39.p283xc50a8b8b.r6 m111429x7513954f() {
            return com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraDeviceBrand.CaraDeviceBrandVerifier.f59491x4fbc8495;
        }

        @Override // com.p176xb6135e39.p283xc50a8b8b.p6
        /* renamed from: getNumber */
        public final int mo20656x276ffe3f() {
            return this.f59490x6ac9171;
        }

        @java.lang.Deprecated
        /* renamed from: valueOf */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraDeviceBrand m111430xdce0328(int i17) {
            return m111427x382ad972(i17);
        }
    }

    /* renamed from: com.tencent.wechat.aff.cara.CaraFoundationProto$CaraNetworkType */
    /* loaded from: classes15.dex */
    public enum CaraNetworkType implements com.p176xb6135e39.p283xc50a8b8b.p6 {
        CARA_NETWORK_TYPE_UNKNOWN(0),
        CARA_NETWORK_TYPE_WIFI(1),
        CARA_NETWORK_TYPE_MOBILE_LOW(2),
        CARA_NETWORK_TYPE_MOBILE_4G(3),
        CARA_NETWORK_TYPE_MOBILE_5G(4);


        /* renamed from: CARA_NETWORK_TYPE_MOBILE_4G_VALUE */
        public static final int f59494xf8b18e20 = 3;

        /* renamed from: CARA_NETWORK_TYPE_MOBILE_5G_VALUE */
        public static final int f59496x6092baff = 4;

        /* renamed from: CARA_NETWORK_TYPE_MOBILE_LOW_VALUE */
        public static final int f59498xac40966b = 2;

        /* renamed from: CARA_NETWORK_TYPE_UNKNOWN_VALUE */
        public static final int f59500x9abbb6fa = 0;

        /* renamed from: CARA_NETWORK_TYPE_WIFI_VALUE */
        public static final int f59502xcbfe669 = 1;

        /* renamed from: internalValueMap */
        private static final com.p176xb6135e39.p283xc50a8b8b.q6 f59503xc72c7808 = new com.p176xb6135e39.p283xc50a8b8b.q6() { // from class: com.tencent.wechat.aff.cara.CaraFoundationProto.CaraNetworkType.1
            @Override // com.p176xb6135e39.p283xc50a8b8b.q6
            /* renamed from: findValueByNumber */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraNetworkType mo20884xd369f9d8(int i17) {
                return com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraNetworkType.m111436x382ad972(i17);
            }
        };

        /* renamed from: value */
        private final int f59504x6ac9171;

        /* renamed from: com.tencent.wechat.aff.cara.CaraFoundationProto$CaraNetworkType$CaraNetworkTypeVerifier */
        /* loaded from: classes15.dex */
        public static final class CaraNetworkTypeVerifier implements com.p176xb6135e39.p283xc50a8b8b.r6 {

            /* renamed from: INSTANCE */
            static final com.p176xb6135e39.p283xc50a8b8b.r6 f59505x4fbc8495 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraNetworkType.CaraNetworkTypeVerifier();

            private CaraNetworkTypeVerifier() {
            }

            @Override // com.p176xb6135e39.p283xc50a8b8b.r6
            /* renamed from: isInRange */
            public boolean mo20891x5045f28e(int i17) {
                return com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraNetworkType.m111436x382ad972(i17) != null;
            }
        }

        CaraNetworkType(int i17) {
            this.f59504x6ac9171 = i17;
        }

        /* renamed from: forNumber */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraNetworkType m111436x382ad972(int i17) {
            if (i17 == 0) {
                return CARA_NETWORK_TYPE_UNKNOWN;
            }
            if (i17 == 1) {
                return CARA_NETWORK_TYPE_WIFI;
            }
            if (i17 == 2) {
                return CARA_NETWORK_TYPE_MOBILE_LOW;
            }
            if (i17 == 3) {
                return CARA_NETWORK_TYPE_MOBILE_4G;
            }
            if (i17 != 4) {
                return null;
            }
            return CARA_NETWORK_TYPE_MOBILE_5G;
        }

        /* renamed from: internalGetValueMap */
        public static com.p176xb6135e39.p283xc50a8b8b.q6 m111437x97e5d0a4() {
            return f59503xc72c7808;
        }

        /* renamed from: internalGetVerifier */
        public static com.p176xb6135e39.p283xc50a8b8b.r6 m111438x7513954f() {
            return com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraNetworkType.CaraNetworkTypeVerifier.f59505x4fbc8495;
        }

        @Override // com.p176xb6135e39.p283xc50a8b8b.p6
        /* renamed from: getNumber */
        public final int mo20656x276ffe3f() {
            return this.f59504x6ac9171;
        }

        @java.lang.Deprecated
        /* renamed from: valueOf */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraNetworkType m111439xdce0328(int i17) {
            return m111436x382ad972(i17);
        }
    }

    /* renamed from: com.tencent.wechat.aff.cara.CaraFoundationProto$CaraSize */
    /* loaded from: classes16.dex */
    public static final class CaraSize extends com.p176xb6135e39.p283xc50a8b8b.n5 implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSizeOrBuilder {

        /* renamed from: DEFAULT_INSTANCE */
        private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize f59506xb3e828f3;

        /* renamed from: HEIGHT_FIELD_NUMBER */
        public static final int f59507x77501666 = 2;

        /* renamed from: PARSER */
        private static volatile com.p176xb6135e39.p283xc50a8b8b.e9 f59508x8c3e301f = null;

        /* renamed from: WIDTH_FIELD_NUMBER */
        public static final int f59509x6cd46c47 = 1;

        /* renamed from: bitField0_ */
        private int f59510x961a12dc;

        /* renamed from: height_ */
        private float f59511x2fd99418;

        /* renamed from: memoizedIsInitialized */
        private byte f59512xf54bb1a0 = 2;

        /* renamed from: width_ */
        private float f59513xd1078b59;

        /* renamed from: com.tencent.wechat.aff.cara.CaraFoundationProto$CaraSize$Builder */
        /* loaded from: classes16.dex */
        public static final class Builder extends com.p176xb6135e39.p283xc50a8b8b.h5 implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSizeOrBuilder {
            /* renamed from: clearHeight */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize.Builder m111468x8de285d4() {
                m20700x8b68b80b();
                ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize) this.f7870x21169495).m111444x8de285d4();
                return this;
            }

            /* renamed from: clearWidth */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize.Builder m111469xd3dc6f79() {
                m20700x8b68b80b();
                ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize) this.f7870x21169495).m111445xd3dc6f79();
                return this;
            }

            @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSizeOrBuilder
            /* renamed from: getHeight */
            public float mo111464x1c4fb41d() {
                return ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize) this.f7870x21169495).mo111464x1c4fb41d();
            }

            @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSizeOrBuilder
            /* renamed from: getWidth */
            public float mo111465x755bd410() {
                return ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize) this.f7870x21169495).mo111465x755bd410();
            }

            @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSizeOrBuilder
            /* renamed from: hasHeight */
            public boolean mo111466xdc293461() {
                return ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize) this.f7870x21169495).mo111466xdc293461();
            }

            @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSizeOrBuilder
            /* renamed from: hasWidth */
            public boolean mo111467x7ef3b4c() {
                return ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize) this.f7870x21169495).mo111467x7ef3b4c();
            }

            /* renamed from: setHeight */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize.Builder m111470xf84e829(float f17) {
                m20700x8b68b80b();
                ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize) this.f7870x21169495).m111462xf84e829(f17);
                return this;
            }

            /* renamed from: setWidth */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize.Builder m111471x53e9ee84(float f17) {
                m20700x8b68b80b();
                ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize) this.f7870x21169495).m111463x53e9ee84(f17);
                return this;
            }

            private Builder() {
                super(com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize.f59506xb3e828f3);
            }
        }

        static {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize caraSize = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize();
            f59506xb3e828f3 = caraSize;
            com.p176xb6135e39.p283xc50a8b8b.n5.m20830x48240cd3(com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize.class, caraSize);
        }

        private CaraSize() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: clearHeight */
        public void m111444x8de285d4() {
            this.f59510x961a12dc &= -3;
            this.f59511x2fd99418 = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: clearWidth */
        public void m111445xd3dc6f79() {
            this.f59510x961a12dc &= -2;
            this.f59513xd1078b59 = 0.0f;
        }

        /* renamed from: getDefaultInstance */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize m111446x7c90cfc0() {
            return f59506xb3e828f3;
        }

        /* renamed from: newBuilder */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize.Builder m111447x3136c9db() {
            return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize.Builder) f59506xb3e828f3.m20832x93ab12ff();
        }

        /* renamed from: parseDelimitedFrom */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize m111449x4a829d50(java.io.InputStream inputStream) {
            return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize) com.p176xb6135e39.p283xc50a8b8b.n5.m20815x4a829d50(f59506xb3e828f3, inputStream);
        }

        /* renamed from: parseFrom */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize m111457x92b714fd(java.nio.ByteBuffer byteBuffer) {
            return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize) com.p176xb6135e39.p283xc50a8b8b.n5.m20823x92b714fd(f59506xb3e828f3, byteBuffer);
        }

        /* renamed from: parser */
        public static com.p176xb6135e39.p283xc50a8b8b.e9 m111461xc4ab3c1f() {
            return f59506xb3e828f3.m20838x7ea0ace();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: setHeight */
        public void m111462xf84e829(float f17) {
            this.f59510x961a12dc |= 2;
            this.f59511x2fd99418 = f17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: setWidth */
        public void m111463x53e9ee84(float f17) {
            this.f59510x961a12dc |= 1;
            this.f59513xd1078b59 = f17;
        }

        @Override // com.p176xb6135e39.p283xc50a8b8b.n5
        /* renamed from: dynamicMethod */
        public final java.lang.Object mo20836x12f0b200(com.p176xb6135e39.p283xc50a8b8b.l5 l5Var, java.lang.Object obj, java.lang.Object obj2) {
            switch (l5Var) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return java.lang.Byte.valueOf(this.f59512xf54bb1a0);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.f59512xf54bb1a0 = (byte) (obj == null ? 0 : 1);
                    return null;
                case BUILD_MESSAGE_INFO:
                    return com.p176xb6135e39.p283xc50a8b8b.n5.m20812xe9ec3795(f59506xb3e828f3, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔁ\u0000\u0002ᔁ\u0001", new java.lang.Object[]{"bitField0_", "width_", "height_"});
                case NEW_MUTABLE_INSTANCE:
                    return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize();
                case NEW_BUILDER:
                    return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize.Builder();
                case GET_DEFAULT_INSTANCE:
                    return f59506xb3e828f3;
                case GET_PARSER:
                    com.p176xb6135e39.p283xc50a8b8b.e9 e9Var = f59508x8c3e301f;
                    if (e9Var == null) {
                        synchronized (com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize.class) {
                            e9Var = f59508x8c3e301f;
                            if (e9Var == null) {
                                e9Var = new com.p176xb6135e39.p283xc50a8b8b.i5(f59506xb3e828f3);
                                f59508x8c3e301f = e9Var;
                            }
                        }
                    }
                    return e9Var;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSizeOrBuilder
        /* renamed from: getHeight */
        public float mo111464x1c4fb41d() {
            return this.f59511x2fd99418;
        }

        @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSizeOrBuilder
        /* renamed from: getWidth */
        public float mo111465x755bd410() {
            return this.f59513xd1078b59;
        }

        @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSizeOrBuilder
        /* renamed from: hasHeight */
        public boolean mo111466xdc293461() {
            return (this.f59510x961a12dc & 2) != 0;
        }

        @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSizeOrBuilder
        /* renamed from: hasWidth */
        public boolean mo111467x7ef3b4c() {
            return (this.f59510x961a12dc & 1) != 0;
        }

        /* renamed from: newBuilder */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize.Builder m111448x3136c9db(com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize caraSize) {
            return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize.Builder) f59506xb3e828f3.m20833x93ab12ff(caraSize);
        }

        /* renamed from: parseDelimitedFrom */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize m111450x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
            return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize) com.p176xb6135e39.p283xc50a8b8b.n5.m20816x4a829d50(f59506xb3e828f3, inputStream, t4Var);
        }

        /* renamed from: parseFrom */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize m111458x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
            return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize) com.p176xb6135e39.p283xc50a8b8b.n5.m20824x92b714fd(f59506xb3e828f3, byteBuffer, t4Var);
        }

        /* renamed from: parseFrom */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize m111453x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
            return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize) com.p176xb6135e39.p283xc50a8b8b.n5.m20819x92b714fd(f59506xb3e828f3, yVar);
        }

        /* renamed from: parseFrom */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize m111454x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
            return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize) com.p176xb6135e39.p283xc50a8b8b.n5.m20820x92b714fd(f59506xb3e828f3, yVar, t4Var);
        }

        /* renamed from: parseFrom */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize m111459x92b714fd(byte[] bArr) {
            return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize) com.p176xb6135e39.p283xc50a8b8b.n5.m20825x92b714fd(f59506xb3e828f3, bArr);
        }

        /* renamed from: parseFrom */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize m111460x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
            return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize) com.p176xb6135e39.p283xc50a8b8b.n5.m20826x92b714fd(f59506xb3e828f3, bArr, t4Var);
        }

        /* renamed from: parseFrom */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize m111455x92b714fd(java.io.InputStream inputStream) {
            return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize) com.p176xb6135e39.p283xc50a8b8b.n5.m20821x92b714fd(f59506xb3e828f3, inputStream);
        }

        /* renamed from: parseFrom */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize m111456x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
            return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize) com.p176xb6135e39.p283xc50a8b8b.n5.m20822x92b714fd(f59506xb3e828f3, inputStream, t4Var);
        }

        /* renamed from: parseFrom */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize m111451x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
            return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize) com.p176xb6135e39.p283xc50a8b8b.n5.m20817x92b714fd(f59506xb3e828f3, d0Var);
        }

        /* renamed from: parseFrom */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize m111452x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
            return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27159xb7d5b608.CaraSize) com.p176xb6135e39.p283xc50a8b8b.n5.m20818x92b714fd(f59506xb3e828f3, d0Var, t4Var);
        }
    }

    /* renamed from: com.tencent.wechat.aff.cara.CaraFoundationProto$CaraSizeOrBuilder */
    /* loaded from: classes15.dex */
    public interface CaraSizeOrBuilder extends com.p176xb6135e39.p283xc50a8b8b.p8 {
        @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
        /* renamed from: getDefaultInstanceForType */
        /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3();

        /* renamed from: getHeight */
        float mo111464x1c4fb41d();

        /* renamed from: getWidth */
        float mo111465x755bd410();

        /* renamed from: hasHeight */
        boolean mo111466xdc293461();

        /* renamed from: hasWidth */
        boolean mo111467x7ef3b4c();

        @Override // com.p176xb6135e39.p283xc50a8b8b.p8
        /* renamed from: isInitialized */
        /* synthetic */ boolean mo20562xf582434a();
    }

    private C27159xb7d5b608() {
    }

    /* renamed from: registerAllExtensions */
    public static void m111423x82c00eb2(com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
    }
}
