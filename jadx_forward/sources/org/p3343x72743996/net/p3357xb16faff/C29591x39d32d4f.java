package org.p3343x72743996.net.p3357xb16faff;

/* renamed from: org.chromium.net.httpflags.ResolvedFlags */
/* loaded from: classes13.dex */
public final class C29591x39d32d4f {

    /* renamed from: mFlags */
    private final java.util.Map<java.lang.String, org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value> f74439xbe0d3a1a;

    /* renamed from: org.chromium.net.httpflags.ResolvedFlags$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$org$chromium$net$httpflags$FlagValue$ConstrainedValue$ValueCase */
        static final /* synthetic */ int[] f74440xcb7e21f1;

        static {
            int[] iArr = new int[org.p3343x72743996.net.p3357xb16faff.C29585x1d9e8545.ConstrainedValue.ValueCase.m153950xcee59d22().length];
            f74440xcb7e21f1 = iArr;
            try {
                iArr[org.p3343x72743996.net.p3357xb16faff.C29585x1d9e8545.ConstrainedValue.ValueCase.BOOL_VALUE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f74440xcb7e21f1[org.p3343x72743996.net.p3357xb16faff.C29585x1d9e8545.ConstrainedValue.ValueCase.INT_VALUE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f74440xcb7e21f1[org.p3343x72743996.net.p3357xb16faff.C29585x1d9e8545.ConstrainedValue.ValueCase.FLOAT_VALUE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f74440xcb7e21f1[org.p3343x72743996.net.p3357xb16faff.C29585x1d9e8545.ConstrainedValue.ValueCase.STRING_VALUE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f74440xcb7e21f1[org.p3343x72743996.net.p3357xb16faff.C29585x1d9e8545.ConstrainedValue.ValueCase.BYTES_VALUE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f74440xcb7e21f1[org.p3343x72743996.net.p3357xb16faff.C29585x1d9e8545.ConstrainedValue.ValueCase.VALUE_NOT_SET.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    public C29591x39d32d4f(java.util.Map<java.lang.String, org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value> map) {
        this.f74439xbe0d3a1a = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: parseVersionString */
    public static int[] m153989xdb01b716(java.lang.String str) {
        try {
            if (str.isEmpty()) {
                throw new java.lang.IllegalArgumentException("Version string is empty");
            }
            java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(str, ".");
            int countTokens = stringTokenizer.countTokens();
            int[] iArr = new int[countTokens];
            for (int i17 = 0; i17 < countTokens; i17++) {
                iArr[i17] = java.lang.Integer.parseInt(stringTokenizer.nextToken());
            }
            return iArr;
        } catch (java.lang.RuntimeException e17) {
            throw new java.lang.IllegalArgumentException("Unable to parse HTTP flags version string: `" + str + "`", e17);
        }
    }

    /* renamed from: resolve */
    public static org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f m153990x416881ec(org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67 c29587x40cfe67, java.lang.String str, java.lang.String str2) {
        int[] m153989xdb01b716 = m153989xdb01b716(str2);
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, org.p3343x72743996.net.p3357xb16faff.C29585x1d9e8545> entry : c29587x40cfe67.mo153975xdc1a1acb().entrySet()) {
            try {
                org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value m153996x416881ec = org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value.m153996x416881ec(entry.getValue(), str, m153989xdb01b716);
                if (m153996x416881ec != null) {
                    hashMap.put(entry.getKey(), m153996x416881ec);
                }
            } catch (java.lang.RuntimeException e17) {
                throw new java.lang.IllegalArgumentException("Unable to resolve HTTP flag `" + entry.getKey() + "`", e17);
            }
        }
        return new org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f(hashMap);
    }

    /* renamed from: flags */
    public java.util.Map<java.lang.String, org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value> m153991x5cfee87() {
        return java.util.Collections.unmodifiableMap(this.f74439xbe0d3a1a);
    }

    /* renamed from: org.chromium.net.httpflags.ResolvedFlags$Value */
    /* loaded from: classes16.dex */
    public static final class Value {

        /* renamed from: mValue */
        private final java.lang.Object f74441xbee9dd04;

        /* renamed from: org.chromium.net.httpflags.ResolvedFlags$Value$Type */
        /* loaded from: classes16.dex */
        public enum Type {
            BOOL,
            INT,
            FLOAT,
            STRING,
            BYTES
        }

        public Value(boolean z17) {
            this.f74441xbee9dd04 = java.lang.Boolean.valueOf(z17);
        }

        /* renamed from: checkType */
        private void m153993x17c22462(org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value.Type type) {
            org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value.Type m154002xfb85f7b0 = m154002xfb85f7b0();
            if (type == m154002xfb85f7b0) {
                return;
            }
            throw new java.lang.IllegalStateException("Attempted to access flag value as " + type + ", but actual type is " + m154002xfb85f7b0);
        }

        /* renamed from: fromConstrainedValue */
        private static org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value m153994xc90a85(org.p3343x72743996.net.p3357xb16faff.C29585x1d9e8545.ConstrainedValue constrainedValue) {
            org.p3343x72743996.net.p3357xb16faff.C29585x1d9e8545.ConstrainedValue.ValueCase mo153919xd1c1d18b = constrainedValue.mo153919xd1c1d18b();
            switch (org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.AnonymousClass1.f74440xcb7e21f1[mo153919xd1c1d18b.ordinal()]) {
                case 1:
                    return new org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value(constrainedValue.mo153911x794b19f1());
                case 2:
                    return new org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value(constrainedValue.mo153914x9cfee438());
                case 3:
                    return new org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value(constrainedValue.mo153913xb11d506b());
                case 4:
                    return new org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value(constrainedValue.mo153917x7f48eaaa());
                case 5:
                    return new org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value(constrainedValue.mo153912x40bb23bc());
                case 6:
                    return null;
                default:
                    throw new java.lang.IllegalArgumentException("Flag value uses unknown value type " + mo153919xd1c1d18b);
            }
        }

        /* renamed from: matchesVersion */
        private static boolean m153995x7b2efc25(int[] iArr, int[] iArr2) {
            int i17 = 0;
            while (i17 < java.lang.Math.max(iArr.length, iArr2.length)) {
                int i18 = i17 < iArr.length ? iArr[i17] : 0;
                int i19 = i17 < iArr2.length ? iArr2[i17] : 0;
                if (i18 > i19) {
                    return true;
                }
                if (i18 < i19) {
                    return false;
                }
                i17++;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: resolve */
        public static org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value m153996x416881ec(org.p3343x72743996.net.p3357xb16faff.C29585x1d9e8545 c29585x1d9e8545, java.lang.String str, int[] iArr) {
            for (org.p3343x72743996.net.p3357xb16faff.C29585x1d9e8545.ConstrainedValue constrainedValue : c29585x1d9e8545.mo153861x5722c020()) {
                if (!constrainedValue.mo153920x6bc8ca2() || constrainedValue.mo153909x74292566().equals(str)) {
                    if (!constrainedValue.mo153925x175e2460() || m153995x7b2efc25(iArr, org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.m153989xdb01b716(constrainedValue.mo153915xdc86661c()))) {
                        return m153994xc90a85(constrainedValue);
                    }
                }
            }
            return null;
        }

        /* renamed from: getBoolValue */
        public boolean m153997x794b19f1() {
            m153993x17c22462(org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value.Type.BOOL);
            return ((java.lang.Boolean) this.f74441xbee9dd04).booleanValue();
        }

        /* renamed from: getBytesValue */
        public com.p176xb6135e39.p283xc50a8b8b.y m153998x40bb23bc() {
            m153993x17c22462(org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value.Type.BYTES);
            return (com.p176xb6135e39.p283xc50a8b8b.y) this.f74441xbee9dd04;
        }

        /* renamed from: getFloatValue */
        public float m153999xb11d506b() {
            m153993x17c22462(org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value.Type.FLOAT);
            return ((java.lang.Float) this.f74441xbee9dd04).floatValue();
        }

        /* renamed from: getIntValue */
        public long m154000x9cfee438() {
            m153993x17c22462(org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value.Type.INT);
            return ((java.lang.Long) this.f74441xbee9dd04).longValue();
        }

        /* renamed from: getStringValue */
        public java.lang.String m154001x7f48eaaa() {
            m153993x17c22462(org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value.Type.STRING);
            return (java.lang.String) this.f74441xbee9dd04;
        }

        /* renamed from: getType */
        public org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value.Type m154002xfb85f7b0() {
            java.lang.Object obj = this.f74441xbee9dd04;
            if (obj instanceof java.lang.Boolean) {
                return org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value.Type.BOOL;
            }
            if (obj instanceof java.lang.Long) {
                return org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value.Type.INT;
            }
            if (obj instanceof java.lang.Float) {
                return org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value.Type.FLOAT;
            }
            if (obj instanceof java.lang.String) {
                return org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value.Type.STRING;
            }
            if (obj instanceof com.p176xb6135e39.p283xc50a8b8b.y) {
                return org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value.Type.BYTES;
            }
            throw new java.lang.IllegalStateException("Unexpected flag value type: ".concat(this.f74441xbee9dd04.getClass().getName()));
        }

        public Value(long j17) {
            this.f74441xbee9dd04 = java.lang.Long.valueOf(j17);
        }

        public Value(float f17) {
            this.f74441xbee9dd04 = java.lang.Float.valueOf(f17);
        }

        public Value(java.lang.String str) {
            this.f74441xbee9dd04 = str;
        }

        public Value(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
            this.f74441xbee9dd04 = yVar;
        }
    }
}
