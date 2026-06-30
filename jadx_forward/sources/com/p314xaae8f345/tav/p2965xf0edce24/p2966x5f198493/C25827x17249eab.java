package com.p314xaae8f345.tav.p2965xf0edce24.p2966x5f198493;

/* renamed from: com.tencent.tav.extractor.wrapper.ExtractorWrapperPool */
/* loaded from: classes16.dex */
public class C25827x17249eab {

    /* renamed from: extractorHashMap */
    private static final java.util.HashMap<java.lang.String, com.p314xaae8f345.tav.p2965xf0edce24.p2966x5f198493.C25826xf84f21ef> f48565xf50482aa = new java.util.HashMap<>();

    /* renamed from: clear */
    public static synchronized void m98004x5a5b64d() {
        synchronized (com.p314xaae8f345.tav.p2965xf0edce24.p2966x5f198493.C25827x17249eab.class) {
            f48565xf50482aa.clear();
        }
    }

    /* renamed from: contains */
    public static synchronized boolean m98005xde2d761f(java.lang.String str) {
        boolean containsKey;
        synchronized (com.p314xaae8f345.tav.p2965xf0edce24.p2966x5f198493.C25827x17249eab.class) {
            containsKey = f48565xf50482aa.containsKey(str);
        }
        return containsKey;
    }

    /* renamed from: fillIn */
    public static synchronized void m98006xb408aa08(java.lang.String str, com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34) {
        synchronized (com.p314xaae8f345.tav.p2965xf0edce24.p2966x5f198493.C25827x17249eab.class) {
            com.p314xaae8f345.tav.p2965xf0edce24.p2966x5f198493.C25826xf84f21ef c25826xf84f21ef = get(str);
            c25826xf84f21ef.m97998xc8f96935(c25820xcadb1d34);
            c25820xcadb1d34.m97981x76500f83(c25826xf84f21ef.m98002x4ee02466());
            c25820xcadb1d34.m97978xffd6ec16(c25826xf84f21ef.m97999x51e8b0a());
            c25820xcadb1d34.m97980x830b4ab0(c25826xf84f21ef.m98000xbb14e2a4());
        }
    }

    public static synchronized com.p314xaae8f345.tav.p2965xf0edce24.p2966x5f198493.C25826xf84f21ef get(java.lang.String str) {
        com.p314xaae8f345.tav.p2965xf0edce24.p2966x5f198493.C25826xf84f21ef c25826xf84f21ef;
        synchronized (com.p314xaae8f345.tav.p2965xf0edce24.p2966x5f198493.C25827x17249eab.class) {
            java.util.HashMap<java.lang.String, com.p314xaae8f345.tav.p2965xf0edce24.p2966x5f198493.C25826xf84f21ef> hashMap = f48565xf50482aa;
            c25826xf84f21ef = hashMap.get(str);
            if (c25826xf84f21ef == null) {
                c25826xf84f21ef = new com.p314xaae8f345.tav.p2965xf0edce24.p2966x5f198493.C25826xf84f21ef(str);
            }
            hashMap.put(str, c25826xf84f21ef);
        }
        return c25826xf84f21ef;
    }

    /* renamed from: load */
    public static synchronized void m98008x32c4e6(java.lang.String str) {
        synchronized (com.p314xaae8f345.tav.p2965xf0edce24.p2966x5f198493.C25827x17249eab.class) {
            com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34 = new com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34();
            c25820xcadb1d34.m97977x683d6267(str);
            get(str).m97998xc8f96935(c25820xcadb1d34);
        }
    }

    public static synchronized void put(com.p314xaae8f345.tav.p2965xf0edce24.p2966x5f198493.C25826xf84f21ef c25826xf84f21ef) {
        synchronized (com.p314xaae8f345.tav.p2965xf0edce24.p2966x5f198493.C25827x17249eab.class) {
            f48565xf50482aa.put(c25826xf84f21ef.m98001x4edea88a(), c25826xf84f21ef);
        }
    }

    /* renamed from: load */
    public static synchronized void m98007x32c4e6(com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34) {
        synchronized (com.p314xaae8f345.tav.p2965xf0edce24.p2966x5f198493.C25827x17249eab.class) {
            get(c25820xcadb1d34.m97967xabff72d6()).m97998xc8f96935(c25820xcadb1d34);
        }
    }
}
