package org.p3343x72743996.net.p3357xb16faff;

/* renamed from: org.chromium.net.httpflags.BaseFeature */
/* loaded from: classes16.dex */
public final class C29581xb23996c5 {

    /* renamed from: FLAG_PREFIX */
    public static final java.lang.String f74384xdfc1bac5 = "ChromiumBaseFeature_";

    /* renamed from: PARAM_DELIMITER */
    public static final java.lang.String f74385xcf28ac95 = "_PARAM_";

    /* renamed from: org.chromium.net.httpflags.BaseFeature$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$org$chromium$net$httpflags$ResolvedFlags$Value$Type */
        static final /* synthetic */ int[] f74386x6d99e5dc;

        static {
            int[] iArr = new int[org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value.Type.m154006xcee59d22().length];
            f74386x6d99e5dc = iArr;
            try {
                iArr[org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value.Type.BOOL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f74386x6d99e5dc[org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value.Type.INT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f74386x6d99e5dc[org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value.Type.FLOAT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f74386x6d99e5dc[org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value.Type.STRING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f74386x6d99e5dc[org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value.Type.BYTES.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: org.chromium.net.httpflags.BaseFeature$ParsedFlagName */
    /* loaded from: classes16.dex */
    public static final class ParsedFlagName {

        /* renamed from: featureName */
        public java.lang.String f74387xe984fea1;

        /* renamed from: paramName */
        public java.lang.String f74388x7473f8b8;

        private ParsedFlagName() {
        }
    }

    private C29581xb23996c5() {
    }

    /* renamed from: applyOverride */
    private static void m153759x2831b55a(java.lang.String str, org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value value, java.util.Map<java.lang.String, org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState.Builder> map) {
        org.p3343x72743996.net.p3357xb16faff.C29581xb23996c5.ParsedFlagName m153763x318173ea = m153763x318173ea(str);
        if (m153763x318173ea == null) {
            return;
        }
        org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState.Builder builder = map.get(m153763x318173ea.f74387xe984fea1);
        if (builder == null) {
            builder = org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState.m153802x3136c9db();
            map.put(m153763x318173ea.f74387xe984fea1, builder);
        }
        java.lang.String str2 = m153763x318173ea.f74388x7473f8b8;
        if (str2 == null) {
            m153761xaf2852af(value, builder);
        } else {
            m153760xb54feaab(str2, value, builder);
        }
    }

    /* renamed from: applyParamOverride */
    private static void m153760xb54feaab(java.lang.String str, org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value value, org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState.Builder builder) {
        com.p176xb6135e39.p283xc50a8b8b.w wVar;
        com.p176xb6135e39.p283xc50a8b8b.y yVar;
        org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value.Type m154002xfb85f7b0 = value.m154002xfb85f7b0();
        int i17 = org.p3343x72743996.net.p3357xb16faff.C29581xb23996c5.AnonymousClass1.f74386x6d99e5dc[m154002xfb85f7b0.ordinal()];
        if (i17 == 1) {
            java.lang.String str2 = value.m153997x794b19f1() ? "true" : "false";
            java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
            com.p176xb6135e39.p283xc50a8b8b.y yVar2 = com.p176xb6135e39.p283xc50a8b8b.y.f127245e;
            wVar = new com.p176xb6135e39.p283xc50a8b8b.w(str2.getBytes(charset));
        } else if (i17 == 2) {
            java.lang.String l17 = java.lang.Long.toString(value.m154000x9cfee438(), 10);
            java.nio.charset.Charset charset2 = java.nio.charset.StandardCharsets.UTF_8;
            com.p176xb6135e39.p283xc50a8b8b.y yVar3 = com.p176xb6135e39.p283xc50a8b8b.y.f127245e;
            wVar = new com.p176xb6135e39.p283xc50a8b8b.w(l17.getBytes(charset2));
        } else if (i17 == 3) {
            java.lang.String f17 = java.lang.Float.toString(value.m153999xb11d506b());
            java.nio.charset.Charset charset3 = java.nio.charset.StandardCharsets.UTF_8;
            com.p176xb6135e39.p283xc50a8b8b.y yVar4 = com.p176xb6135e39.p283xc50a8b8b.y.f127245e;
            wVar = new com.p176xb6135e39.p283xc50a8b8b.w(f17.getBytes(charset3));
        } else {
            if (i17 != 4) {
                if (i17 == 5) {
                    yVar = value.m153998x40bb23bc();
                    builder.m153829xde3cd175(str, yVar);
                } else {
                    throw new java.lang.UnsupportedOperationException("Unsupported HTTP flag value type for base::Feature param `" + str + "`: " + m154002xfb85f7b0);
                }
            }
            java.lang.String m154001x7f48eaaa = value.m154001x7f48eaaa();
            java.nio.charset.Charset charset4 = java.nio.charset.StandardCharsets.UTF_8;
            com.p176xb6135e39.p283xc50a8b8b.y yVar5 = com.p176xb6135e39.p283xc50a8b8b.y.f127245e;
            wVar = new com.p176xb6135e39.p283xc50a8b8b.w(m154001x7f48eaaa.getBytes(charset4));
        }
        yVar = wVar;
        builder.m153829xde3cd175(str, yVar);
    }

    /* renamed from: applyStateOverride */
    private static void m153761xaf2852af(org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value value, org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState.Builder builder) {
        org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value.Type m154002xfb85f7b0 = value.m154002xfb85f7b0();
        if (m154002xfb85f7b0 == org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value.Type.BOOL) {
            builder.m153831x514e147f(value.m153997x794b19f1());
            return;
        }
        throw new java.lang.IllegalArgumentException("HTTP flag has type " + m154002xfb85f7b0 + ", but only boolean flags are supported as base::Feature overrides");
    }

    /* renamed from: getOverrides */
    public static org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2 m153762xd2b9cf71(org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f c29591x39d32d4f) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value> entry : c29591x39d32d4f.m153991x5cfee87().entrySet()) {
            try {
                m153759x2831b55a(entry.getKey(), entry.getValue(), hashMap);
            } catch (java.lang.RuntimeException e17) {
                throw new java.lang.IllegalArgumentException("Could not parse HTTP flag `" + entry.getKey() + "` as a base::Feature override", e17);
            }
        }
        org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.Builder m153770x3136c9db = org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.m153770x3136c9db();
        for (java.util.Map.Entry entry2 : hashMap.entrySet()) {
            m153770x3136c9db.m153794xef05d1c9((java.lang.String) entry2.getKey(), (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState) ((org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2.FeatureState.Builder) entry2.getValue()).mo20556x59bc66e());
        }
        return (org.p3343x72743996.net.p3357xb16faff.C29582xd71b4e2) m153770x3136c9db.mo20556x59bc66e();
    }

    /* renamed from: parseFlagName */
    private static org.p3343x72743996.net.p3357xb16faff.C29581xb23996c5.ParsedFlagName m153763x318173ea(java.lang.String str) {
        if (!str.startsWith(f74384xdfc1bac5)) {
            return null;
        }
        java.lang.String substring = str.substring(20);
        org.p3343x72743996.net.p3357xb16faff.C29581xb23996c5.ParsedFlagName parsedFlagName = new org.p3343x72743996.net.p3357xb16faff.C29581xb23996c5.ParsedFlagName();
        int indexOf = substring.indexOf(f74385xcf28ac95);
        if (indexOf < 0) {
            parsedFlagName.f74387xe984fea1 = substring;
        } else {
            parsedFlagName.f74387xe984fea1 = substring.substring(0, indexOf);
            parsedFlagName.f74388x7473f8b8 = substring.substring(indexOf + 7);
        }
        return parsedFlagName;
    }
}
