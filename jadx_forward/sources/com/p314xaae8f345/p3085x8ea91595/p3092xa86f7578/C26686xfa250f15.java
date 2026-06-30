package com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578;

/* renamed from: com.tencent.tmassistantsdk.logreport.LogReportManager */
/* loaded from: classes13.dex */
public class C26686xfa250f15 {

    /* renamed from: REPORT_MANAGERS */
    private static final java.lang.Class<?>[] f56237xa691d911 = {com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26682x21d6a411.class, com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26687x41d13953.class, com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26688xc1fa8fe2.class};
    private static final java.lang.String TAG = "LogReportManager";

    /* renamed from: mInstance */
    private static com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26686xfa250f15 f56238x46143c22;

    /* renamed from: mNetworkChangedObserver */
    private final com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26675xcb69b97b.INetworkChangedObserver f56239xcb780e69;

    private C26686xfa250f15() {
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26675xcb69b97b.INetworkChangedObserver iNetworkChangedObserver = new com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26675xcb69b97b.INetworkChangedObserver() { // from class: com.tencent.tmassistantsdk.logreport.LogReportManager.1
            @Override // com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26675xcb69b97b.INetworkChangedObserver
            /* renamed from: onNetworkChanged */
            public void mo104866xf54d1865() {
                com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26686xfa250f15.TAG, "onNetworkChanged,netState:" + com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104885x3d316d39());
                for (java.lang.Class cls : com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26686xfa250f15.f56237xa691d911) {
                    try {
                        if (cls.equals(com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26682x21d6a411.class)) {
                            com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26682x21d6a411.m104977x9cf0d20b().m104976x53809b66();
                        } else if (cls.equals(com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26687x41d13953.class)) {
                            com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26687x41d13953.m104992x9cf0d20b().m104976x53809b66();
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26686xfa250f15.TAG, e17, "", new java.lang.Object[0]);
                    }
                }
                if (com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104890xc0ad1bc0()) {
                    com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104885x3d316d39().equalsIgnoreCase("wifi");
                }
            }
        };
        this.f56239xcb780e69 = iNetworkChangedObserver;
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26675xcb69b97b.m104950x9cf0d20b().m104951xb6a2a79d(iNetworkChangedObserver);
    }

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26686xfa250f15 m104988x9cf0d20b() {
        com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26686xfa250f15 c26686xfa250f15;
        synchronized (com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26686xfa250f15.class) {
            if (f56238x46143c22 == null) {
                f56238x46143c22 = new com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26686xfa250f15();
            }
            c26686xfa250f15 = f56238x46143c22;
        }
        return c26686xfa250f15;
    }

    /* renamed from: cancleReport */
    public void m104989xf5e5c7a0() {
        for (java.lang.Class<?> cls : f56237xa691d911) {
            try {
                if (cls.equals(com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26682x21d6a411.class)) {
                    com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26682x21d6a411.m104977x9cf0d20b().m104970xc6e3cda3();
                } else if (cls.equals(com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26687x41d13953.class)) {
                    com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26687x41d13953.m104992x9cf0d20b().m104970xc6e3cda3();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            }
        }
    }

    /* renamed from: destory */
    public void m104990x5cd39514() {
        for (java.lang.Class<?> cls : f56237xa691d911) {
            try {
                if (cls.equals(com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26682x21d6a411.class)) {
                    com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26682x21d6a411.m104977x9cf0d20b().m104971x5cd39ffa();
                } else if (cls.equals(com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26687x41d13953.class)) {
                    com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26687x41d13953.m104992x9cf0d20b().m104971x5cd39ffa();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26675xcb69b97b.m104950x9cf0d20b().m104954x972dcb40(this.f56239xcb780e69);
    }

    /* renamed from: reportLog */
    public void m104991xeaf05970() {
        for (java.lang.Class<?> cls : f56237xa691d911) {
            try {
                if (cls.equals(com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26682x21d6a411.class)) {
                    com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26682x21d6a411.m104977x9cf0d20b().m104975xdf66853a();
                } else if (cls.equals(com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26687x41d13953.class)) {
                    com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26687x41d13953.m104992x9cf0d20b().m104975xdf66853a();
                } else if (cls.equals(com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26688xc1fa8fe2.class)) {
                    com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26688xc1fa8fe2.m104994x9cf0d20b().m104975xdf66853a();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            }
        }
    }
}
