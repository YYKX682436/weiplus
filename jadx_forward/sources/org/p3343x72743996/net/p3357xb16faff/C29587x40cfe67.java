package org.p3343x72743996.net.p3357xb16faff;

/* renamed from: org.chromium.net.httpflags.Flags */
/* loaded from: classes16.dex */
public final class C29587x40cfe67 extends com.p176xb6135e39.p283xc50a8b8b.n5 implements org.p3343x72743996.net.p3357xb16faff.InterfaceC29588x659e0991 {

    /* renamed from: DEFAULT_INSTANCE */
    private static final org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67 f74430xb3e828f3;

    /* renamed from: FLAGS_FIELD_NUMBER */
    public static final int f74431xd0cfad26 = 1;

    /* renamed from: PARSER */
    private static volatile com.p176xb6135e39.p283xc50a8b8b.e9 f74432x8c3e301f;

    /* renamed from: flags_ */
    private com.p176xb6135e39.p283xc50a8b8b.e8 f74433xb42de2b8 = com.p176xb6135e39.p283xc50a8b8b.e8.f126595e;

    /* renamed from: org.chromium.net.httpflags.Flags$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f74434xa1df5c61;

        static {
            int[] iArr = new int[com.p176xb6135e39.p283xc50a8b8b.l5.m20737xcee59d22().length];
            f74434xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f74434xa1df5c61[4] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f74434xa1df5c61[2] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f74434xa1df5c61[5] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f74434xa1df5c61[6] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f74434xa1df5c61[0] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f74434xa1df5c61[1] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: org.chromium.net.httpflags.Flags$Builder */
    /* loaded from: classes16.dex */
    public static final class Builder extends com.p176xb6135e39.p283xc50a8b8b.h5 implements org.p3343x72743996.net.p3357xb16faff.InterfaceC29588x659e0991 {
        /* renamed from: clearFlags */
        public org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67.Builder m153979xd2ee303a() {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67) this.f7870x21169495).m153954x507c0465().clear();
            return this;
        }

        @Override // org.p3343x72743996.net.p3357xb16faff.InterfaceC29588x659e0991
        /* renamed from: containsFlags */
        public boolean mo153972x8abf83a8(java.lang.String str) {
            str.getClass();
            return ((org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67) this.f7870x21169495).mo153975xdc1a1acb().containsKey(str);
        }

        @Override // org.p3343x72743996.net.p3357xb16faff.InterfaceC29588x659e0991
        @java.lang.Deprecated
        /* renamed from: getFlags */
        public java.util.Map<java.lang.String, org.p3343x72743996.net.p3357xb16faff.C29585x1d9e8545> mo153973x746d94d1() {
            return mo153975xdc1a1acb();
        }

        @Override // org.p3343x72743996.net.p3357xb16faff.InterfaceC29588x659e0991
        /* renamed from: getFlagsCount */
        public int mo153974x3d7826be() {
            return ((org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67) this.f7870x21169495).mo153975xdc1a1acb().size();
        }

        @Override // org.p3343x72743996.net.p3357xb16faff.InterfaceC29588x659e0991
        /* renamed from: getFlagsMap */
        public java.util.Map<java.lang.String, org.p3343x72743996.net.p3357xb16faff.C29585x1d9e8545> mo153975xdc1a1acb() {
            return java.util.Collections.unmodifiableMap(((org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67) this.f7870x21169495).mo153975xdc1a1acb());
        }

        @Override // org.p3343x72743996.net.p3357xb16faff.InterfaceC29588x659e0991
        /* renamed from: getFlagsOrDefault */
        public org.p3343x72743996.net.p3357xb16faff.C29585x1d9e8545 mo153976xde3ef10d(java.lang.String str, org.p3343x72743996.net.p3357xb16faff.C29585x1d9e8545 c29585x1d9e8545) {
            str.getClass();
            java.util.Map<java.lang.String, org.p3343x72743996.net.p3357xb16faff.C29585x1d9e8545> mo153975xdc1a1acb = ((org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67) this.f7870x21169495).mo153975xdc1a1acb();
            return mo153975xdc1a1acb.containsKey(str) ? mo153975xdc1a1acb.get(str) : c29585x1d9e8545;
        }

        @Override // org.p3343x72743996.net.p3357xb16faff.InterfaceC29588x659e0991
        /* renamed from: getFlagsOrThrow */
        public org.p3343x72743996.net.p3357xb16faff.C29585x1d9e8545 mo153977x3e1f04b2(java.lang.String str) {
            str.getClass();
            java.util.Map<java.lang.String, org.p3343x72743996.net.p3357xb16faff.C29585x1d9e8545> mo153975xdc1a1acb = ((org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67) this.f7870x21169495).mo153975xdc1a1acb();
            if (mo153975xdc1a1acb.containsKey(str)) {
                return mo153975xdc1a1acb.get(str);
            }
            throw new java.lang.IllegalArgumentException();
        }

        /* renamed from: putAllFlags */
        public org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67.Builder m153980x6646f995(java.util.Map<java.lang.String, org.p3343x72743996.net.p3357xb16faff.C29585x1d9e8545> map) {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67) this.f7870x21169495).m153954x507c0465().putAll(map);
            return this;
        }

        /* renamed from: putFlags */
        public org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67.Builder m153981x69bbdcb8(java.lang.String str, org.p3343x72743996.net.p3357xb16faff.C29585x1d9e8545 c29585x1d9e8545) {
            str.getClass();
            c29585x1d9e8545.getClass();
            m20700x8b68b80b();
            ((org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67) this.f7870x21169495).m153954x507c0465().put(str, c29585x1d9e8545);
            return this;
        }

        /* renamed from: removeFlags */
        public org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67.Builder m153982xed1cb863(java.lang.String str) {
            str.getClass();
            m20700x8b68b80b();
            ((org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67) this.f7870x21169495).m153954x507c0465().remove(str);
            return this;
        }

        private Builder() {
            super(org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67.f74430xb3e828f3);
        }
    }

    /* renamed from: org.chromium.net.httpflags.Flags$FlagsDefaultEntryHolder */
    /* loaded from: classes16.dex */
    public static final class FlagsDefaultEntryHolder {

        /* renamed from: defaultEntry */
        static final com.p176xb6135e39.p283xc50a8b8b.v7 f74435xd7cd02b1 = new com.p176xb6135e39.p283xc50a8b8b.v7(com.p176xb6135e39.p283xc50a8b8b.ub.f127124f, "", com.p176xb6135e39.p283xc50a8b8b.ub.f127126h, org.p3343x72743996.net.p3357xb16faff.C29585x1d9e8545.m153841x7c90cfc0());

        private FlagsDefaultEntryHolder() {
        }
    }

    static {
        org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67 c29587x40cfe67 = new org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67();
        f74430xb3e828f3 = c29587x40cfe67;
        com.p176xb6135e39.p283xc50a8b8b.n5.m20830x48240cd3(org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67.class, c29587x40cfe67);
    }

    private C29587x40cfe67() {
    }

    /* renamed from: getDefaultInstance */
    public static org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67 m153953x7c90cfc0() {
        return f74430xb3e828f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getMutableFlagsMap */
    public java.util.Map<java.lang.String, org.p3343x72743996.net.p3357xb16faff.C29585x1d9e8545> m153954x507c0465() {
        return m153956x380aa0fa();
    }

    /* renamed from: internalGetFlags */
    private com.p176xb6135e39.p283xc50a8b8b.e8 m153955x8fa7b2ae() {
        return this.f74433xb42de2b8;
    }

    /* renamed from: internalGetMutableFlags */
    private com.p176xb6135e39.p283xc50a8b8b.e8 m153956x380aa0fa() {
        com.p176xb6135e39.p283xc50a8b8b.e8 e8Var = this.f74433xb42de2b8;
        if (!e8Var.f126596d) {
            this.f74433xb42de2b8 = e8Var.f();
        }
        return this.f74433xb42de2b8;
    }

    /* renamed from: newBuilder */
    public static org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67.Builder m153957x3136c9db() {
        return (org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67.Builder) f74430xb3e828f3.m20832x93ab12ff();
    }

    /* renamed from: parseDelimitedFrom */
    public static org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67 m153959x4a829d50(java.io.InputStream inputStream) {
        return (org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67) com.p176xb6135e39.p283xc50a8b8b.n5.m20815x4a829d50(f74430xb3e828f3, inputStream);
    }

    /* renamed from: parseFrom */
    public static org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67 m153967x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67) com.p176xb6135e39.p283xc50a8b8b.n5.m20823x92b714fd(f74430xb3e828f3, byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m153971xc4ab3c1f() {
        return f74430xb3e828f3.m20838x7ea0ace();
    }

    @Override // org.p3343x72743996.net.p3357xb16faff.InterfaceC29588x659e0991
    /* renamed from: containsFlags */
    public boolean mo153972x8abf83a8(java.lang.String str) {
        str.getClass();
        return m153955x8fa7b2ae().containsKey(str);
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
                return com.p176xb6135e39.p283xc50a8b8b.n5.m20812xe9ec3795(f74430xb3e828f3, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"flags_", org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67.FlagsDefaultEntryHolder.f74435xd7cd02b1});
            case NEW_MUTABLE_INSTANCE:
                return new org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67();
            case NEW_BUILDER:
                return new org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67.Builder();
            case GET_DEFAULT_INSTANCE:
                return f74430xb3e828f3;
            case GET_PARSER:
                com.p176xb6135e39.p283xc50a8b8b.e9 e9Var = f74432x8c3e301f;
                if (e9Var == null) {
                    synchronized (org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67.class) {
                        e9Var = f74432x8c3e301f;
                        if (e9Var == null) {
                            e9Var = new com.p176xb6135e39.p283xc50a8b8b.i5(f74430xb3e828f3);
                            f74432x8c3e301f = e9Var;
                        }
                    }
                }
                return e9Var;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // org.p3343x72743996.net.p3357xb16faff.InterfaceC29588x659e0991
    @java.lang.Deprecated
    /* renamed from: getFlags */
    public java.util.Map<java.lang.String, org.p3343x72743996.net.p3357xb16faff.C29585x1d9e8545> mo153973x746d94d1() {
        return mo153975xdc1a1acb();
    }

    @Override // org.p3343x72743996.net.p3357xb16faff.InterfaceC29588x659e0991
    /* renamed from: getFlagsCount */
    public int mo153974x3d7826be() {
        return m153955x8fa7b2ae().size();
    }

    @Override // org.p3343x72743996.net.p3357xb16faff.InterfaceC29588x659e0991
    /* renamed from: getFlagsMap */
    public java.util.Map<java.lang.String, org.p3343x72743996.net.p3357xb16faff.C29585x1d9e8545> mo153975xdc1a1acb() {
        return java.util.Collections.unmodifiableMap(m153955x8fa7b2ae());
    }

    @Override // org.p3343x72743996.net.p3357xb16faff.InterfaceC29588x659e0991
    /* renamed from: getFlagsOrDefault */
    public org.p3343x72743996.net.p3357xb16faff.C29585x1d9e8545 mo153976xde3ef10d(java.lang.String str, org.p3343x72743996.net.p3357xb16faff.C29585x1d9e8545 c29585x1d9e8545) {
        str.getClass();
        com.p176xb6135e39.p283xc50a8b8b.e8 m153955x8fa7b2ae = m153955x8fa7b2ae();
        return m153955x8fa7b2ae.containsKey(str) ? (org.p3343x72743996.net.p3357xb16faff.C29585x1d9e8545) m153955x8fa7b2ae.get(str) : c29585x1d9e8545;
    }

    @Override // org.p3343x72743996.net.p3357xb16faff.InterfaceC29588x659e0991
    /* renamed from: getFlagsOrThrow */
    public org.p3343x72743996.net.p3357xb16faff.C29585x1d9e8545 mo153977x3e1f04b2(java.lang.String str) {
        str.getClass();
        com.p176xb6135e39.p283xc50a8b8b.e8 m153955x8fa7b2ae = m153955x8fa7b2ae();
        if (m153955x8fa7b2ae.containsKey(str)) {
            return (org.p3343x72743996.net.p3357xb16faff.C29585x1d9e8545) m153955x8fa7b2ae.get(str);
        }
        throw new java.lang.IllegalArgumentException();
    }

    /* renamed from: newBuilder */
    public static org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67.Builder m153958x3136c9db(org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67 c29587x40cfe67) {
        return (org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67.Builder) f74430xb3e828f3.m20833x93ab12ff(c29587x40cfe67);
    }

    /* renamed from: parseDelimitedFrom */
    public static org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67 m153960x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67) com.p176xb6135e39.p283xc50a8b8b.n5.m20816x4a829d50(f74430xb3e828f3, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67 m153968x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67) com.p176xb6135e39.p283xc50a8b8b.n5.m20824x92b714fd(f74430xb3e828f3, byteBuffer, t4Var);
    }

    /* renamed from: parseFrom */
    public static org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67 m153963x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67) com.p176xb6135e39.p283xc50a8b8b.n5.m20819x92b714fd(f74430xb3e828f3, yVar);
    }

    /* renamed from: parseFrom */
    public static org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67 m153964x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67) com.p176xb6135e39.p283xc50a8b8b.n5.m20820x92b714fd(f74430xb3e828f3, yVar, t4Var);
    }

    /* renamed from: parseFrom */
    public static org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67 m153969x92b714fd(byte[] bArr) {
        return (org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67) com.p176xb6135e39.p283xc50a8b8b.n5.m20825x92b714fd(f74430xb3e828f3, bArr);
    }

    /* renamed from: parseFrom */
    public static org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67 m153970x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67) com.p176xb6135e39.p283xc50a8b8b.n5.m20826x92b714fd(f74430xb3e828f3, bArr, t4Var);
    }

    /* renamed from: parseFrom */
    public static org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67 m153965x92b714fd(java.io.InputStream inputStream) {
        return (org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67) com.p176xb6135e39.p283xc50a8b8b.n5.m20821x92b714fd(f74430xb3e828f3, inputStream);
    }

    /* renamed from: parseFrom */
    public static org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67 m153966x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67) com.p176xb6135e39.p283xc50a8b8b.n5.m20822x92b714fd(f74430xb3e828f3, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67 m153961x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67) com.p176xb6135e39.p283xc50a8b8b.n5.m20817x92b714fd(f74430xb3e828f3, d0Var);
    }

    /* renamed from: parseFrom */
    public static org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67 m153962x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67) com.p176xb6135e39.p283xc50a8b8b.n5.m20818x92b714fd(f74430xb3e828f3, d0Var, t4Var);
    }
}
