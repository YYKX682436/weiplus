package com.p159x477cd522.p160x333422.p163x10fad5c4;

/* renamed from: com.eclipsesource.mmv8.snapshot.ContextBootstrapParams */
/* loaded from: classes7.dex */
public final class C1514xa1fae405 {

    /* renamed from: bootstrapScriptInfos */
    public final com.p159x477cd522.p160x333422.p163x10fad5c4.C1518x9ab0551d[] f4993x4e68602c;

    /* renamed from: name */
    public final java.lang.String f4994x337a8b;

    /* renamed from: setupNodeEnv */
    public final boolean f4995xfb59924e;

    /* renamed from: snapshotGlueScriptInfo */
    public final com.p159x477cd522.p160x333422.p163x10fad5c4.C1518x9ab0551d f4996xf9b35b12;

    /* renamed from: com.eclipsesource.mmv8.snapshot.ContextBootstrapParams$Builder */
    /* loaded from: classes7.dex */
    public static class Builder {

        /* renamed from: mSnapshotGlueScriptInfo */
        private com.p159x477cd522.p160x333422.p163x10fad5c4.C1518x9ab0551d f5000xc01a47df;

        /* renamed from: mName */
        private java.lang.String f4998x624f098 = null;

        /* renamed from: mBootstrapScriptInfos */
        private final java.util.List<com.p159x477cd522.p160x333422.p163x10fad5c4.C1518x9ab0551d> f4997xb74e1c39 = new java.util.ArrayList();

        /* renamed from: mSetupNodeEnv */
        private boolean f4999x92eeab5b = false;

        /* renamed from: appendBootstrapScriptInfo */
        public com.p159x477cd522.p160x333422.p163x10fad5c4.C1514xa1fae405.Builder m16621x74b6a3ad(com.p159x477cd522.p160x333422.p163x10fad5c4.C1518x9ab0551d c1518x9ab0551d) {
            this.f4997xb74e1c39.add(c1518x9ab0551d);
            return this;
        }

        /* renamed from: build */
        public com.p159x477cd522.p160x333422.p163x10fad5c4.C1514xa1fae405 m16622x59bc66e() {
            if (com.p159x477cd522.p160x333422.p163x10fad5c4.C1519x4e42091.m16636xc53c3619(this.f4998x624f098)) {
                throw new java.lang.IllegalStateException("name is empty");
            }
            int size = this.f4997xb74e1c39.size();
            com.p159x477cd522.p160x333422.p163x10fad5c4.C1518x9ab0551d[] c1518x9ab0551dArr = new com.p159x477cd522.p160x333422.p163x10fad5c4.C1518x9ab0551d[size];
            for (int i17 = 0; i17 < size; i17++) {
                c1518x9ab0551dArr[i17] = this.f4997xb74e1c39.get(i17);
            }
            return new com.p159x477cd522.p160x333422.p163x10fad5c4.C1514xa1fae405(this.f4998x624f098, this.f5000xc01a47df, c1518x9ab0551dArr, this.f4999x92eeab5b);
        }

        /* renamed from: name */
        public com.p159x477cd522.p160x333422.p163x10fad5c4.C1514xa1fae405.Builder m16623x337a8b(java.lang.String str) {
            if (com.p159x477cd522.p160x333422.p163x10fad5c4.C1519x4e42091.m16636xc53c3619(str)) {
                throw new java.lang.IllegalArgumentException("name is empty");
            }
            this.f4998x624f098 = str;
            return this;
        }

        /* renamed from: setupNodeEnv */
        public com.p159x477cd522.p160x333422.p163x10fad5c4.C1514xa1fae405.Builder m16624xfb59924e(boolean z17) {
            this.f4999x92eeab5b = z17;
            return this;
        }

        /* renamed from: snapshotGlueScriptInfo */
        public com.p159x477cd522.p160x333422.p163x10fad5c4.C1514xa1fae405.Builder m16625xf9b35b12(com.p159x477cd522.p160x333422.p163x10fad5c4.C1518x9ab0551d c1518x9ab0551d) {
            this.f5000xc01a47df = c1518x9ab0551d;
            return this;
        }
    }

    /* renamed from: equals */
    public boolean m16618xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.p159x477cd522.p160x333422.p163x10fad5c4.C1514xa1fae405.class != obj.getClass()) {
            return false;
        }
        return this.f4994x337a8b.equals(((com.p159x477cd522.p160x333422.p163x10fad5c4.C1514xa1fae405) obj).f4994x337a8b);
    }

    /* renamed from: hashCode */
    public int m16619x8cdac1b() {
        return java.util.Objects.hash(this.f4994x337a8b);
    }

    /* renamed from: toString */
    public java.lang.String m16620x9616526c() {
        return "ContextBootstrapParams{name='" + this.f4994x337a8b + "', snapshotGlueScriptInfo=" + this.f4996xf9b35b12 + ", bootstrapScriptInfos=" + java.util.Arrays.toString(this.f4993x4e68602c) + ", setupNodeEnv=" + this.f4995xfb59924e + '}';
    }

    private C1514xa1fae405(java.lang.String str, com.p159x477cd522.p160x333422.p163x10fad5c4.C1518x9ab0551d c1518x9ab0551d, com.p159x477cd522.p160x333422.p163x10fad5c4.C1518x9ab0551d[] c1518x9ab0551dArr, boolean z17) {
        this.f4994x337a8b = str;
        this.f4996xf9b35b12 = c1518x9ab0551d;
        this.f4993x4e68602c = c1518x9ab0551dArr;
        this.f4995xfb59924e = z17;
    }
}
