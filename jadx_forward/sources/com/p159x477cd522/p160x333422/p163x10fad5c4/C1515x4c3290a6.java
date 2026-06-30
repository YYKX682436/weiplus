package com.p159x477cd522.p160x333422.p163x10fad5c4;

/* renamed from: com.eclipsesource.mmv8.snapshot.CreateSnapshotParams */
/* loaded from: classes7.dex */
public final class C1515x4c3290a6 {

    /* renamed from: contextBootstrapParamsList */
    public final java.util.List<com.p159x477cd522.p160x333422.p163x10fad5c4.C1514xa1fae405> f5001xdd7de223;

    /* renamed from: globalSnapshotGlueScriptInfo */
    public final com.p159x477cd522.p160x333422.p163x10fad5c4.C1518x9ab0551d f5002x6c855e95;

    /* renamed from: injectConsole */
    public boolean f5003x2e2d1e86;

    /* renamed from: keepCompiledData */
    public final boolean f5004x43b10000;

    /* renamed from: snapshotDirPath */
    public final java.lang.String f5005x6b42cbee;

    /* renamed from: warmupScriptInfoList */
    public final java.util.List<com.p159x477cd522.p160x333422.p163x10fad5c4.C1518x9ab0551d> f5006xf6cf5457;

    public C1515x4c3290a6(boolean z17, com.p159x477cd522.p160x333422.p163x10fad5c4.C1518x9ab0551d c1518x9ab0551d, java.util.List<com.p159x477cd522.p160x333422.p163x10fad5c4.C1514xa1fae405> list, java.util.List<com.p159x477cd522.p160x333422.p163x10fad5c4.C1518x9ab0551d> list2, boolean z18, java.lang.String str) {
        if (list != null) {
            for (int i17 = 0; i17 < list.size(); i17++) {
                com.p159x477cd522.p160x333422.p163x10fad5c4.C1514xa1fae405 c1514xa1fae405 = list.get(i17);
                if (c1514xa1fae405 == null) {
                    throw new java.lang.IllegalArgumentException("contextBootstrapParams is null");
                }
                if (c1514xa1fae405.f4995xfb59924e && com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Success.f5028x572d1359 != i17) {
                    throw new java.lang.IllegalArgumentException("only the first contextBootstrapParams support setupNodeEnv");
                }
            }
        }
        if (list2 != null) {
            java.util.Iterator<com.p159x477cd522.p160x333422.p163x10fad5c4.C1518x9ab0551d> it = list2.iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    throw new java.lang.IllegalArgumentException("warmupScriptInfo is null");
                }
            }
        }
        if (com.p159x477cd522.p160x333422.p163x10fad5c4.C1519x4e42091.m16636xc53c3619(str)) {
            throw new java.lang.IllegalArgumentException("snapshotDirPath is illegal");
        }
        this.f5003x2e2d1e86 = z17;
        this.f5002x6c855e95 = c1518x9ab0551d;
        this.f5001xdd7de223 = list == null ? java.util.Collections.emptyList() : list;
        this.f5006xf6cf5457 = list2 == null ? java.util.Collections.emptyList() : list2;
        this.f5004x43b10000 = z18;
        this.f5005x6b42cbee = str;
    }

    /* renamed from: toString */
    public java.lang.String m16626x9616526c() {
        return "CreateSnapshotParams{injectConsole=" + this.f5003x2e2d1e86 + ", globalSnapshotGlueScriptInfo=" + this.f5002x6c855e95 + ", contextBootstrapParamsList=" + java.util.Arrays.toString(this.f5001xdd7de223.toArray()) + ", warmupScriptInfoList=" + java.util.Arrays.toString(this.f5006xf6cf5457.toArray()) + ", keepCompiledData=" + this.f5004x43b10000 + ", snapshotDirPath='" + this.f5005x6b42cbee + "'}";
    }
}
