package com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342;

/* renamed from: com.tencent.thumbplayer.datatransport.config.TPProxyConfig */
/* loaded from: classes16.dex */
public class C26465x6f5da734 {

    /* renamed from: SERVICE_TYPE_DEFAULT */
    private static final int f53864x7d3c6786 = 0;

    /* renamed from: mConfigs */
    private static final java.util.Map<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225> f53865xd6c99844 = new java.util.HashMap(1);

    /* renamed from: mProxyEnable */
    private static volatile boolean f53867xed4e2e4 = true;

    /* renamed from: mDefaultServiceType */
    private static int f53866xce2dd1db = 0;

    /* renamed from: addServiceConfig */
    private static void m103088x65801f36(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225 c26466xe7648225) {
        java.util.Map<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225> map = f53865xd6c99844;
        synchronized (map) {
            map.put(java.lang.Integer.valueOf(c26466xe7648225.f53874x8d0f678f), c26466xe7648225);
        }
    }

    /* renamed from: getDefaultServiceType */
    public static int m103089xe23ad884() {
        return f53866xce2dd1db;
    }

    /* renamed from: getProxyConfig */
    public static com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225 m103090x3b48761a(int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225 m103092x26a356a1 = m103092x26a356a1(i17);
        return m103092x26a356a1 == null ? new com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225() : com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225.Helper.m103108x5a5dd5d(m103092x26a356a1);
    }

    /* renamed from: getProxyInitParam */
    public static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26368x17a977b3 m103091xf5246b85(int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225 m103092x26a356a1 = m103092x26a356a1(i17);
        if (m103092x26a356a1 == null) {
            m103092x26a356a1 = m103090x3b48761a(f53866xce2dd1db);
        }
        return new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26368x17a977b3(com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101638xeb97a5e9(), com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101632xc725eb98(com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.m101093x6a789444()), com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101634xfb7ffeff(), m103092x26a356a1.f53868xe62915ab, m103092x26a356a1.f53869x56050483, com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225.Helper.m103109xff5b0e4a(m103092x26a356a1));
    }

    /* renamed from: getServiceConfig */
    private static com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225 m103092x26a356a1(int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225 c26466xe7648225;
        java.util.Map<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225> map = f53865xd6c99844;
        synchronized (map) {
            c26466xe7648225 = map.get(java.lang.Integer.valueOf(i17));
        }
        return c26466xe7648225;
    }

    /* renamed from: isProxyEnable */
    public static boolean m103093x10bc6e07() {
        return f53867xed4e2e4;
    }

    /* renamed from: setDefaultServiceType */
    public static void m103094x79665a90(int i17) {
        f53866xce2dd1db = i17;
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225 c26466xe7648225 = new com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225();
        c26466xe7648225.f53874x8d0f678f = f53866xce2dd1db;
        m103101xd1ade98e(c26466xe7648225);
    }

    /* renamed from: setInitConfig */
    public static void m103095x103ece74(int i17, java.lang.String str) {
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225 m103092x26a356a1 = m103092x26a356a1(i17);
        if (m103092x26a356a1 == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        m103092x26a356a1.f53870xf3d9c872 = str;
    }

    /* renamed from: setMaxUseMemoryMB */
    public static void m103097x66b6edfb(long j17) {
        java.util.Map<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225> map = f53865xd6c99844;
        synchronized (map) {
            java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().f53871xb028b8f9 = j17;
            }
        }
    }

    /* renamed from: setMaxUseStorageMB */
    public static void m103099x6de6aa4b(long j17) {
        java.util.Map<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225> map = f53865xd6c99844;
        synchronized (map) {
            java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().f53872x52ae3f0d = j17;
            }
        }
    }

    /* renamed from: setProxyConfig */
    public static void m103100xd1ade98e(int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225 m103092x26a356a1 = m103092x26a356a1(i17);
        if (m103092x26a356a1 == null) {
            m103092x26a356a1 = new com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225();
        }
        m103092x26a356a1.f53874x8d0f678f = i17;
        m103092x26a356a1.f53868xe62915ab = str;
        m103092x26a356a1.f53869x56050483 = str2;
        m103088x65801f36(m103092x26a356a1);
    }

    /* renamed from: setProxyEnable */
    public static void m103102xd5038bcf(boolean z17) {
        f53867xed4e2e4 = z17;
    }

    /* renamed from: setReportEnable */
    public static void m103104xa2f23d59(boolean z17) {
        java.util.Map<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225> map = f53865xd6c99844;
        synchronized (map) {
            java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().f53873xbb6afd7 = z17;
            }
        }
    }

    /* renamed from: setVodCachedEnable */
    public static void m103106xe4ce20ee(boolean z17) {
        java.util.Map<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225> map = f53865xd6c99844;
        synchronized (map) {
            java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().f53875xc995b5b0 = z17;
            }
        }
    }

    /* renamed from: setMaxUseMemoryMB */
    public static void m103096x66b6edfb(int i17, long j17) {
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225 m103092x26a356a1 = m103092x26a356a1(i17);
        if (m103092x26a356a1 != null) {
            m103092x26a356a1.f53871xb028b8f9 = j17;
        }
    }

    /* renamed from: setMaxUseStorageMB */
    public static void m103098x6de6aa4b(int i17, long j17) {
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225 m103092x26a356a1 = m103092x26a356a1(i17);
        if (m103092x26a356a1 != null) {
            m103092x26a356a1.f53872x52ae3f0d = j17;
        }
    }

    /* renamed from: setReportEnable */
    public static void m103103xa2f23d59(int i17, boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225 m103092x26a356a1 = m103092x26a356a1(i17);
        if (m103092x26a356a1 != null) {
            m103092x26a356a1.f53873xbb6afd7 = z17;
        }
    }

    /* renamed from: setVodCachedEnable */
    public static void m103105xe4ce20ee(int i17, boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225 m103092x26a356a1 = m103092x26a356a1(i17);
        if (m103092x26a356a1 != null) {
            m103092x26a356a1.f53875xc995b5b0 = z17;
        }
    }

    /* renamed from: setProxyConfig */
    public static void m103101xd1ade98e(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225 c26466xe7648225) {
        if (m103092x26a356a1(c26466xe7648225.f53874x8d0f678f) == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225 m103108x5a5dd5d = com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225.Helper.m103108x5a5dd5d(c26466xe7648225);
            m103108x5a5dd5d.f53874x8d0f678f = c26466xe7648225.f53874x8d0f678f;
            m103108x5a5dd5d.f53868xe62915ab = c26466xe7648225.f53868xe62915ab;
            m103108x5a5dd5d.f53869x56050483 = c26466xe7648225.f53869x56050483;
            m103108x5a5dd5d.f53871xb028b8f9 = c26466xe7648225.f53871xb028b8f9;
            m103108x5a5dd5d.f53872x52ae3f0d = c26466xe7648225.f53872x52ae3f0d;
            m103108x5a5dd5d.f53875xc995b5b0 = c26466xe7648225.f53875xc995b5b0;
            m103108x5a5dd5d.f53870xf3d9c872 = c26466xe7648225.f53870xf3d9c872;
            m103088x65801f36(m103108x5a5dd5d);
        }
    }
}
