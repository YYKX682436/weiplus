package org.p3343x72743996.net.p3357xb16faff;

/* renamed from: org.chromium.net.httpflags.BaseFeatureOverrides */
/* loaded from: classes16.dex */
public final class C29582xd71b4e2 extends com.p176xb6135e39.p283xc50a8b8b.n5 implements org.p3343x72743996.net.p3357xb16faff.InterfaceC29583x426f6d76 {

    /* renamed from: DEFAULT_INSTANCE */
    private static final org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2 f74389xb3e828f3;

    /* renamed from: FEATURE_STATES_FIELD_NUMBER */
    public static final int f74390x51f2a282 = 1;

    /* renamed from: PARSER */
    private static volatile com.p176xb6135e39.p283xc50a8b8b.e9 f74391x8c3e301f;

    /* renamed from: featureStates_ */
    private com.p176xb6135e39.p283xc50a8b8b.e8 f74392x1405eec7 = com.p176xb6135e39.p283xc50a8b8b.e8.f126595e;

    /* renamed from: org.chromium.net.httpflags.BaseFeatureOverrides$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f74393xa1df5c61;

        static {
            int[] iArr = new int[com.p176xb6135e39.p283xc50a8b8b.l5.m20737xcee59d22().length];
            f74393xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f74393xa1df5c61[4] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f74393xa1df5c61[2] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f74393xa1df5c61[5] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f74393xa1df5c61[6] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f74393xa1df5c61[0] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f74393xa1df5c61[1] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: org.chromium.net.httpflags.BaseFeatureOverrides$Builder */
    /* loaded from: classes16.dex */
    public static final class Builder extends com.p176xb6135e39.p283xc50a8b8b.h5 implements org.p3343x72743996.net.p3357xb16faff.InterfaceC29583x426f6d76 {
        /* renamed from: clearFeatureStates */
        public org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.Builder m153792x80f5834b() {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2) this.f7870x21169495).m153767xcfb138b4().clear();
            return this;
        }

        @Override // org.p3343x72743996.net.p3357xb16faff.InterfaceC29583x426f6d76
        /* renamed from: containsFeatureStates */
        public boolean mo153785xbd2b88b9(java.lang.String str) {
            str.getClass();
            return ((org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2) this.f7870x21169495).mo153788xd21d891a().containsKey(str);
        }

        @Override // org.p3343x72743996.net.p3357xb16faff.InterfaceC29583x426f6d76
        @java.lang.Deprecated
        /* renamed from: getFeatureStates */
        public java.util.Map<java.lang.String, org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState> mo153786x632e60e2() {
            return mo153788xd21d891a();
        }

        @Override // org.p3343x72743996.net.p3357xb16faff.InterfaceC29583x426f6d76
        /* renamed from: getFeatureStatesCount */
        public int mo153787xc0593d4d() {
            return ((org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2) this.f7870x21169495).mo153788xd21d891a().size();
        }

        @Override // org.p3343x72743996.net.p3357xb16faff.InterfaceC29583x426f6d76
        /* renamed from: getFeatureStatesMap */
        public java.util.Map<java.lang.String, org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState> mo153788xd21d891a() {
            return java.util.Collections.unmodifiableMap(((org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2) this.f7870x21169495).mo153788xd21d891a());
        }

        @Override // org.p3343x72743996.net.p3357xb16faff.InterfaceC29583x426f6d76
        /* renamed from: getFeatureStatesOrDefault */
        public org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState mo153789x4684281c(java.lang.String str, org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState featureState) {
            str.getClass();
            java.util.Map<java.lang.String, org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState> mo153788xd21d891a = ((org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2) this.f7870x21169495).mo153788xd21d891a();
            return mo153788xd21d891a.containsKey(str) ? mo153788xd21d891a.get(str) : featureState;
        }

        @Override // org.p3343x72743996.net.p3357xb16faff.InterfaceC29583x426f6d76
        /* renamed from: getFeatureStatesOrThrow */
        public org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState mo153790x8d14b381(java.lang.String str) {
            str.getClass();
            java.util.Map<java.lang.String, org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState> mo153788xd21d891a = ((org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2) this.f7870x21169495).mo153788xd21d891a();
            if (mo153788xd21d891a.containsKey(str)) {
                return mo153788xd21d891a.get(str);
            }
            throw new java.lang.IllegalArgumentException();
        }

        /* renamed from: putAllFeatureStates */
        public org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.Builder m153793xabc8c1a6(java.util.Map<java.lang.String, org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState> map) {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2) this.f7870x21169495).m153767xcfb138b4().putAll(map);
            return this;
        }

        /* renamed from: putFeatureStates */
        public org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.Builder m153794xef05d1c9(java.lang.String str, org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState featureState) {
            str.getClass();
            featureState.getClass();
            m20700x8b68b80b();
            ((org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2) this.f7870x21169495).m153767xcfb138b4().put(str, featureState);
            return this;
        }

        /* renamed from: removeFeatureStates */
        public org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.Builder m153795xa711d274(java.lang.String str) {
            str.getClass();
            m20700x8b68b80b();
            ((org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2) this.f7870x21169495).m153767xcfb138b4().remove(str);
            return this;
        }

        private Builder() {
            super(org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.f74389xb3e828f3);
        }
    }

    /* renamed from: org.chromium.net.httpflags.BaseFeatureOverrides$FeatureState */
    /* loaded from: classes16.dex */
    public static final class FeatureState extends com.p176xb6135e39.p283xc50a8b8b.n5 implements org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureStateOrBuilder {

        /* renamed from: DEFAULT_INSTANCE */
        private static final org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState f74394xb3e828f3;

        /* renamed from: ENABLED_FIELD_NUMBER */
        public static final int f74395xad6b0aac = 1;

        /* renamed from: PARAMS_FIELD_NUMBER */
        public static final int f74396x3e548067 = 2;

        /* renamed from: PARSER */
        private static volatile com.p176xb6135e39.p283xc50a8b8b.e9 f74397x8c3e301f;

        /* renamed from: bitField0_ */
        private int f74398x961a12dc;

        /* renamed from: enabled_ */
        private boolean f74399x61e1dd3e;

        /* renamed from: params_ */
        private com.p176xb6135e39.p283xc50a8b8b.e8 f74400xd0b43799 = com.p176xb6135e39.p283xc50a8b8b.e8.f126595e;

        /* renamed from: org.chromium.net.httpflags.BaseFeatureOverrides$FeatureState$Builder */
        /* loaded from: classes16.dex */
        public static final class Builder extends com.p176xb6135e39.p283xc50a8b8b.h5 implements org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureStateOrBuilder {
            /* renamed from: clearEnabled */
            public org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState.Builder m153826x9ea42c34() {
                m20700x8b68b80b();
                ((org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState) this.f7870x21169495).m153797x9ea42c34();
                return this;
            }

            /* renamed from: clearParams */
            public org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState.Builder m153827x9b54ee33() {
                m20700x8b68b80b();
                ((org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState) this.f7870x21169495).m153799x8bcd38e6().clear();
                return this;
            }

            @Override // org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureStateOrBuilder
            /* renamed from: containsParams */
            public boolean mo153818xddae0885(java.lang.String str) {
                str.getClass();
                return ((org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState) this.f7870x21169495).mo153822x73f1ef40().containsKey(str);
            }

            @Override // org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureStateOrBuilder
            /* renamed from: getEnabled */
            public boolean mo153819xdddcc70b() {
                return ((org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState) this.f7870x21169495).mo153819xdddcc70b();
            }

            @Override // org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureStateOrBuilder
            @java.lang.Deprecated
            /* renamed from: getParams */
            public java.util.Map<java.lang.String, com.p176xb6135e39.p283xc50a8b8b.y> mo153820x29c21c7c() {
                return mo153822x73f1ef40();
            }

            @Override // org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureStateOrBuilder
            /* renamed from: getParamsCount */
            public int mo153821x3eacb1f3() {
                return ((org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState) this.f7870x21169495).mo153822x73f1ef40().size();
            }

            @Override // org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureStateOrBuilder
            /* renamed from: getParamsMap */
            public java.util.Map<java.lang.String, com.p176xb6135e39.p283xc50a8b8b.y> mo153822x73f1ef40() {
                return java.util.Collections.unmodifiableMap(((org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState) this.f7870x21169495).mo153822x73f1ef40());
            }

            @Override // org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureStateOrBuilder
            /* renamed from: getParamsOrDefault */
            public com.p176xb6135e39.p283xc50a8b8b.y mo153823xcf20d9c2(java.lang.String str, com.p176xb6135e39.p283xc50a8b8b.y yVar) {
                str.getClass();
                java.util.Map<java.lang.String, com.p176xb6135e39.p283xc50a8b8b.y> mo153822x73f1ef40 = ((org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState) this.f7870x21169495).mo153822x73f1ef40();
                return mo153822x73f1ef40.containsKey(str) ? mo153822x73f1ef40.get(str) : yVar;
            }

            @Override // org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureStateOrBuilder
            /* renamed from: getParamsOrThrow */
            public com.p176xb6135e39.p283xc50a8b8b.y mo153824xc45d96a7(java.lang.String str) {
                str.getClass();
                java.util.Map<java.lang.String, com.p176xb6135e39.p283xc50a8b8b.y> mo153822x73f1ef40 = ((org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState) this.f7870x21169495).mo153822x73f1ef40();
                if (mo153822x73f1ef40.containsKey(str)) {
                    return mo153822x73f1ef40.get(str);
                }
                throw new java.lang.IllegalArgumentException();
            }

            @Override // org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureStateOrBuilder
            /* renamed from: hasEnabled */
            public boolean mo153825x19334f47() {
                return ((org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState) this.f7870x21169495).mo153825x19334f47();
            }

            /* renamed from: putAllParams */
            public org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState.Builder m153828x73155038(java.util.Map<java.lang.String, com.p176xb6135e39.p283xc50a8b8b.y> map) {
                m20700x8b68b80b();
                ((org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState) this.f7870x21169495).m153799x8bcd38e6().putAll(map);
                return this;
            }

            /* renamed from: putParams */
            public org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState.Builder m153829xde3cd175(java.lang.String str, com.p176xb6135e39.p283xc50a8b8b.y yVar) {
                str.getClass();
                yVar.getClass();
                m20700x8b68b80b();
                ((org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState) this.f7870x21169495).m153799x8bcd38e6().put(str, yVar);
                return this;
            }

            /* renamed from: removeParams */
            public org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState.Builder m153830xc6f76b2a(java.lang.String str) {
                str.getClass();
                m20700x8b68b80b();
                ((org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState) this.f7870x21169495).m153799x8bcd38e6().remove(str);
                return this;
            }

            /* renamed from: setEnabled */
            public org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState.Builder m153831x514e147f(boolean z17) {
                m20700x8b68b80b();
                ((org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState) this.f7870x21169495).m153817x514e147f(z17);
                return this;
            }

            private Builder() {
                super(org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState.f74394xb3e828f3);
            }
        }

        /* renamed from: org.chromium.net.httpflags.BaseFeatureOverrides$FeatureState$ParamsDefaultEntryHolder */
        /* loaded from: classes16.dex */
        public static final class ParamsDefaultEntryHolder {

            /* renamed from: defaultEntry */
            static final com.p176xb6135e39.p283xc50a8b8b.v7 f74401xd7cd02b1 = new com.p176xb6135e39.p283xc50a8b8b.v7(com.p176xb6135e39.p283xc50a8b8b.ub.f127124f, "", com.p176xb6135e39.p283xc50a8b8b.ub.f127127i, com.p176xb6135e39.p283xc50a8b8b.y.f127245e);

            private ParamsDefaultEntryHolder() {
            }
        }

        static {
            org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState featureState = new org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState();
            f74394xb3e828f3 = featureState;
            com.p176xb6135e39.p283xc50a8b8b.n5.m20830x48240cd3(org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState.class, featureState);
        }

        private FeatureState() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: clearEnabled */
        public void m153797x9ea42c34() {
            this.f74398x961a12dc &= -2;
            this.f74399x61e1dd3e = false;
        }

        /* renamed from: getDefaultInstance */
        public static org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState m153798x7c90cfc0() {
            return f74394xb3e828f3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: getMutableParamsMap */
        public java.util.Map<java.lang.String, com.p176xb6135e39.p283xc50a8b8b.y> m153799x8bcd38e6() {
            return m153800xd9c69573();
        }

        /* renamed from: internalGetMutableParams */
        private com.p176xb6135e39.p283xc50a8b8b.e8 m153800xd9c69573() {
            com.p176xb6135e39.p283xc50a8b8b.e8 e8Var = this.f74400xd0b43799;
            if (!e8Var.f126596d) {
                this.f74400xd0b43799 = e8Var.f();
            }
            return this.f74400xd0b43799;
        }

        /* renamed from: internalGetParams */
        private com.p176xb6135e39.p283xc50a8b8b.e8 m153801x75cbba3f() {
            return this.f74400xd0b43799;
        }

        /* renamed from: newBuilder */
        public static org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState.Builder m153802x3136c9db() {
            return (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState.Builder) f74394xb3e828f3.m20832x93ab12ff();
        }

        /* renamed from: parseDelimitedFrom */
        public static org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState m153804x4a829d50(java.io.InputStream inputStream) {
            return (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState) com.p176xb6135e39.p283xc50a8b8b.n5.m20815x4a829d50(f74394xb3e828f3, inputStream);
        }

        /* renamed from: parseFrom */
        public static org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState m153812x92b714fd(java.nio.ByteBuffer byteBuffer) {
            return (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState) com.p176xb6135e39.p283xc50a8b8b.n5.m20823x92b714fd(f74394xb3e828f3, byteBuffer);
        }

        /* renamed from: parser */
        public static com.p176xb6135e39.p283xc50a8b8b.e9 m153816xc4ab3c1f() {
            return f74394xb3e828f3.m20838x7ea0ace();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: setEnabled */
        public void m153817x514e147f(boolean z17) {
            this.f74398x961a12dc |= 1;
            this.f74399x61e1dd3e = z17;
        }

        @Override // org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureStateOrBuilder
        /* renamed from: containsParams */
        public boolean mo153818xddae0885(java.lang.String str) {
            str.getClass();
            return m153801x75cbba3f().containsKey(str);
        }

        @Override // com.p176xb6135e39.p283xc50a8b8b.n5
        /* renamed from: dynamicMethod */
        public final java.lang.Object mo20836x12f0b200(com.p176xb6135e39.p283xc50a8b8b.l5 l5Var, java.lang.Object obj, java.lang.Object obj2) {
            switch (l5Var) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return com.p176xb6135e39.p283xc50a8b8b.n5.m20812xe9ec3795(f74394xb3e828f3, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဇ\u0000\u00022", new java.lang.Object[]{"bitField0_", "enabled_", "params_", org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState.ParamsDefaultEntryHolder.f74401xd7cd02b1});
                case NEW_MUTABLE_INSTANCE:
                    return new org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState();
                case NEW_BUILDER:
                    return new org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState.Builder();
                case GET_DEFAULT_INSTANCE:
                    return f74394xb3e828f3;
                case GET_PARSER:
                    com.p176xb6135e39.p283xc50a8b8b.e9 e9Var = f74397x8c3e301f;
                    if (e9Var == null) {
                        synchronized (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState.class) {
                            e9Var = f74397x8c3e301f;
                            if (e9Var == null) {
                                e9Var = new com.p176xb6135e39.p283xc50a8b8b.i5(f74394xb3e828f3);
                                f74397x8c3e301f = e9Var;
                            }
                        }
                    }
                    return e9Var;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        @Override // org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureStateOrBuilder
        /* renamed from: getEnabled */
        public boolean mo153819xdddcc70b() {
            return this.f74399x61e1dd3e;
        }

        @Override // org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureStateOrBuilder
        @java.lang.Deprecated
        /* renamed from: getParams */
        public java.util.Map<java.lang.String, com.p176xb6135e39.p283xc50a8b8b.y> mo153820x29c21c7c() {
            return mo153822x73f1ef40();
        }

        @Override // org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureStateOrBuilder
        /* renamed from: getParamsCount */
        public int mo153821x3eacb1f3() {
            return m153801x75cbba3f().size();
        }

        @Override // org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureStateOrBuilder
        /* renamed from: getParamsMap */
        public java.util.Map<java.lang.String, com.p176xb6135e39.p283xc50a8b8b.y> mo153822x73f1ef40() {
            return java.util.Collections.unmodifiableMap(m153801x75cbba3f());
        }

        @Override // org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureStateOrBuilder
        /* renamed from: getParamsOrDefault */
        public com.p176xb6135e39.p283xc50a8b8b.y mo153823xcf20d9c2(java.lang.String str, com.p176xb6135e39.p283xc50a8b8b.y yVar) {
            str.getClass();
            com.p176xb6135e39.p283xc50a8b8b.e8 m153801x75cbba3f = m153801x75cbba3f();
            return m153801x75cbba3f.containsKey(str) ? (com.p176xb6135e39.p283xc50a8b8b.y) m153801x75cbba3f.get(str) : yVar;
        }

        @Override // org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureStateOrBuilder
        /* renamed from: getParamsOrThrow */
        public com.p176xb6135e39.p283xc50a8b8b.y mo153824xc45d96a7(java.lang.String str) {
            str.getClass();
            com.p176xb6135e39.p283xc50a8b8b.e8 m153801x75cbba3f = m153801x75cbba3f();
            if (m153801x75cbba3f.containsKey(str)) {
                return (com.p176xb6135e39.p283xc50a8b8b.y) m153801x75cbba3f.get(str);
            }
            throw new java.lang.IllegalArgumentException();
        }

        @Override // org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureStateOrBuilder
        /* renamed from: hasEnabled */
        public boolean mo153825x19334f47() {
            return (this.f74398x961a12dc & 1) != 0;
        }

        /* renamed from: newBuilder */
        public static org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState.Builder m153803x3136c9db(org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState featureState) {
            return (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState.Builder) f74394xb3e828f3.m20833x93ab12ff(featureState);
        }

        /* renamed from: parseDelimitedFrom */
        public static org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState m153805x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
            return (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState) com.p176xb6135e39.p283xc50a8b8b.n5.m20816x4a829d50(f74394xb3e828f3, inputStream, t4Var);
        }

        /* renamed from: parseFrom */
        public static org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState m153813x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
            return (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState) com.p176xb6135e39.p283xc50a8b8b.n5.m20824x92b714fd(f74394xb3e828f3, byteBuffer, t4Var);
        }

        /* renamed from: parseFrom */
        public static org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState m153808x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
            return (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState) com.p176xb6135e39.p283xc50a8b8b.n5.m20819x92b714fd(f74394xb3e828f3, yVar);
        }

        /* renamed from: parseFrom */
        public static org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState m153809x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
            return (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState) com.p176xb6135e39.p283xc50a8b8b.n5.m20820x92b714fd(f74394xb3e828f3, yVar, t4Var);
        }

        /* renamed from: parseFrom */
        public static org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState m153814x92b714fd(byte[] bArr) {
            return (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState) com.p176xb6135e39.p283xc50a8b8b.n5.m20825x92b714fd(f74394xb3e828f3, bArr);
        }

        /* renamed from: parseFrom */
        public static org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState m153815x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
            return (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState) com.p176xb6135e39.p283xc50a8b8b.n5.m20826x92b714fd(f74394xb3e828f3, bArr, t4Var);
        }

        /* renamed from: parseFrom */
        public static org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState m153810x92b714fd(java.io.InputStream inputStream) {
            return (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState) com.p176xb6135e39.p283xc50a8b8b.n5.m20821x92b714fd(f74394xb3e828f3, inputStream);
        }

        /* renamed from: parseFrom */
        public static org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState m153811x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
            return (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState) com.p176xb6135e39.p283xc50a8b8b.n5.m20822x92b714fd(f74394xb3e828f3, inputStream, t4Var);
        }

        /* renamed from: parseFrom */
        public static org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState m153806x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
            return (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState) com.p176xb6135e39.p283xc50a8b8b.n5.m20817x92b714fd(f74394xb3e828f3, d0Var);
        }

        /* renamed from: parseFrom */
        public static org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState m153807x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
            return (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState) com.p176xb6135e39.p283xc50a8b8b.n5.m20818x92b714fd(f74394xb3e828f3, d0Var, t4Var);
        }
    }

    /* renamed from: org.chromium.net.httpflags.BaseFeatureOverrides$FeatureStateOrBuilder */
    /* loaded from: classes16.dex */
    public interface FeatureStateOrBuilder extends com.p176xb6135e39.p283xc50a8b8b.p8 {
        /* renamed from: containsParams */
        boolean mo153818xddae0885(java.lang.String str);

        @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
        /* renamed from: getDefaultInstanceForType */
        /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3();

        /* renamed from: getEnabled */
        boolean mo153819xdddcc70b();

        @java.lang.Deprecated
        /* renamed from: getParams */
        java.util.Map<java.lang.String, com.p176xb6135e39.p283xc50a8b8b.y> mo153820x29c21c7c();

        /* renamed from: getParamsCount */
        int mo153821x3eacb1f3();

        /* renamed from: getParamsMap */
        java.util.Map<java.lang.String, com.p176xb6135e39.p283xc50a8b8b.y> mo153822x73f1ef40();

        /* renamed from: getParamsOrDefault */
        com.p176xb6135e39.p283xc50a8b8b.y mo153823xcf20d9c2(java.lang.String str, com.p176xb6135e39.p283xc50a8b8b.y yVar);

        /* renamed from: getParamsOrThrow */
        com.p176xb6135e39.p283xc50a8b8b.y mo153824xc45d96a7(java.lang.String str);

        /* renamed from: hasEnabled */
        boolean mo153825x19334f47();

        @Override // com.p176xb6135e39.p283xc50a8b8b.p8
        /* renamed from: isInitialized */
        /* synthetic */ boolean mo20562xf582434a();
    }

    /* renamed from: org.chromium.net.httpflags.BaseFeatureOverrides$FeatureStatesDefaultEntryHolder */
    /* loaded from: classes16.dex */
    public static final class FeatureStatesDefaultEntryHolder {

        /* renamed from: defaultEntry */
        static final com.p176xb6135e39.p283xc50a8b8b.v7 f74402xd7cd02b1 = new com.p176xb6135e39.p283xc50a8b8b.v7(com.p176xb6135e39.p283xc50a8b8b.ub.f127124f, "", com.p176xb6135e39.p283xc50a8b8b.ub.f127126h, org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState.m153798x7c90cfc0());

        private FeatureStatesDefaultEntryHolder() {
        }
    }

    static {
        org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2 c29582xd71b4e2 = new org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2();
        f74389xb3e828f3 = c29582xd71b4e2;
        com.p176xb6135e39.p283xc50a8b8b.n5.m20830x48240cd3(org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.class, c29582xd71b4e2);
    }

    private C29582xd71b4e2() {
    }

    /* renamed from: getDefaultInstance */
    public static org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2 m153766x7c90cfc0() {
        return f74389xb3e828f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getMutableFeatureStatesMap */
    public java.util.Map<java.lang.String, org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState> m153767xcfb138b4() {
        return m153769x2df5340b();
    }

    /* renamed from: internalGetFeatureStates */
    private com.p176xb6135e39.p283xc50a8b8b.e8 m153768x640f51bf() {
        return this.f74392x1405eec7;
    }

    /* renamed from: internalGetMutableFeatureStates */
    private com.p176xb6135e39.p283xc50a8b8b.e8 m153769x2df5340b() {
        com.p176xb6135e39.p283xc50a8b8b.e8 e8Var = this.f74392x1405eec7;
        if (!e8Var.f126596d) {
            this.f74392x1405eec7 = e8Var.f();
        }
        return this.f74392x1405eec7;
    }

    /* renamed from: newBuilder */
    public static org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.Builder m153770x3136c9db() {
        return (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.Builder) f74389xb3e828f3.m20832x93ab12ff();
    }

    /* renamed from: parseDelimitedFrom */
    public static org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2 m153772x4a829d50(java.io.InputStream inputStream) {
        return (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2) com.p176xb6135e39.p283xc50a8b8b.n5.m20815x4a829d50(f74389xb3e828f3, inputStream);
    }

    /* renamed from: parseFrom */
    public static org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2 m153780x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2) com.p176xb6135e39.p283xc50a8b8b.n5.m20823x92b714fd(f74389xb3e828f3, byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m153784xc4ab3c1f() {
        return f74389xb3e828f3.m20838x7ea0ace();
    }

    @Override // org.p3343x72743996.net.p3357xb16faff.InterfaceC29583x426f6d76
    /* renamed from: containsFeatureStates */
    public boolean mo153785xbd2b88b9(java.lang.String str) {
        str.getClass();
        return m153768x640f51bf().containsKey(str);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n5
    /* renamed from: dynamicMethod */
    public final java.lang.Object mo20836x12f0b200(com.p176xb6135e39.p283xc50a8b8b.l5 l5Var, java.lang.Object obj, java.lang.Object obj2) {
        switch (l5Var) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return com.p176xb6135e39.p283xc50a8b8b.n5.m20812xe9ec3795(f74389xb3e828f3, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"featureStates_", org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureStatesDefaultEntryHolder.f74402xd7cd02b1});
            case NEW_MUTABLE_INSTANCE:
                return new org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2();
            case NEW_BUILDER:
                return new org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.Builder();
            case GET_DEFAULT_INSTANCE:
                return f74389xb3e828f3;
            case GET_PARSER:
                com.p176xb6135e39.p283xc50a8b8b.e9 e9Var = f74391x8c3e301f;
                if (e9Var == null) {
                    synchronized (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.class) {
                        e9Var = f74391x8c3e301f;
                        if (e9Var == null) {
                            e9Var = new com.p176xb6135e39.p283xc50a8b8b.i5(f74389xb3e828f3);
                            f74391x8c3e301f = e9Var;
                        }
                    }
                }
                return e9Var;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // org.p3343x72743996.net.p3357xb16faff.InterfaceC29583x426f6d76
    @java.lang.Deprecated
    /* renamed from: getFeatureStates */
    public java.util.Map<java.lang.String, org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState> mo153786x632e60e2() {
        return mo153788xd21d891a();
    }

    @Override // org.p3343x72743996.net.p3357xb16faff.InterfaceC29583x426f6d76
    /* renamed from: getFeatureStatesCount */
    public int mo153787xc0593d4d() {
        return m153768x640f51bf().size();
    }

    @Override // org.p3343x72743996.net.p3357xb16faff.InterfaceC29583x426f6d76
    /* renamed from: getFeatureStatesMap */
    public java.util.Map<java.lang.String, org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState> mo153788xd21d891a() {
        return java.util.Collections.unmodifiableMap(m153768x640f51bf());
    }

    @Override // org.p3343x72743996.net.p3357xb16faff.InterfaceC29583x426f6d76
    /* renamed from: getFeatureStatesOrDefault */
    public org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState mo153789x4684281c(java.lang.String str, org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState featureState) {
        str.getClass();
        com.p176xb6135e39.p283xc50a8b8b.e8 m153768x640f51bf = m153768x640f51bf();
        return m153768x640f51bf.containsKey(str) ? (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState) m153768x640f51bf.get(str) : featureState;
    }

    @Override // org.p3343x72743996.net.p3357xb16faff.InterfaceC29583x426f6d76
    /* renamed from: getFeatureStatesOrThrow */
    public org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState mo153790x8d14b381(java.lang.String str) {
        str.getClass();
        com.p176xb6135e39.p283xc50a8b8b.e8 m153768x640f51bf = m153768x640f51bf();
        if (m153768x640f51bf.containsKey(str)) {
            return (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState) m153768x640f51bf.get(str);
        }
        throw new java.lang.IllegalArgumentException();
    }

    /* renamed from: newBuilder */
    public static org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.Builder m153771x3136c9db(org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2 c29582xd71b4e2) {
        return (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.Builder) f74389xb3e828f3.m20833x93ab12ff(c29582xd71b4e2);
    }

    /* renamed from: parseDelimitedFrom */
    public static org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2 m153773x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2) com.p176xb6135e39.p283xc50a8b8b.n5.m20816x4a829d50(f74389xb3e828f3, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2 m153781x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2) com.p176xb6135e39.p283xc50a8b8b.n5.m20824x92b714fd(f74389xb3e828f3, byteBuffer, t4Var);
    }

    /* renamed from: parseFrom */
    public static org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2 m153776x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2) com.p176xb6135e39.p283xc50a8b8b.n5.m20819x92b714fd(f74389xb3e828f3, yVar);
    }

    /* renamed from: parseFrom */
    public static org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2 m153777x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2) com.p176xb6135e39.p283xc50a8b8b.n5.m20820x92b714fd(f74389xb3e828f3, yVar, t4Var);
    }

    /* renamed from: parseFrom */
    public static org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2 m153782x92b714fd(byte[] bArr) {
        return (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2) com.p176xb6135e39.p283xc50a8b8b.n5.m20825x92b714fd(f74389xb3e828f3, bArr);
    }

    /* renamed from: parseFrom */
    public static org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2 m153783x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2) com.p176xb6135e39.p283xc50a8b8b.n5.m20826x92b714fd(f74389xb3e828f3, bArr, t4Var);
    }

    /* renamed from: parseFrom */
    public static org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2 m153778x92b714fd(java.io.InputStream inputStream) {
        return (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2) com.p176xb6135e39.p283xc50a8b8b.n5.m20821x92b714fd(f74389xb3e828f3, inputStream);
    }

    /* renamed from: parseFrom */
    public static org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2 m153779x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2) com.p176xb6135e39.p283xc50a8b8b.n5.m20822x92b714fd(f74389xb3e828f3, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2 m153774x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2) com.p176xb6135e39.p283xc50a8b8b.n5.m20817x92b714fd(f74389xb3e828f3, d0Var);
    }

    /* renamed from: parseFrom */
    public static org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2 m153775x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2) com.p176xb6135e39.p283xc50a8b8b.n5.m20818x92b714fd(f74389xb3e828f3, d0Var, t4Var);
    }
}
