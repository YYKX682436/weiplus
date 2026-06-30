package com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d;

/* renamed from: com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager */
/* loaded from: classes13.dex */
public class C26664x893bb469 implements com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26675xcb69b97b.INetworkChangedObserver {

    /* renamed from: INTERVAL */
    protected static final long f56065x50a5d4c5 = 180000;
    protected static final java.lang.String TAG = "ApkDownloadManager";

    /* renamed from: mApkDownloadManager */
    protected static com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26664x893bb469 f56066x1ac75396;

    /* renamed from: mDownloads */
    final java.util.Map<java.lang.String, com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176> f56067xc8f592fe = new java.util.concurrent.ConcurrentHashMap();

    private C26664x893bb469() {
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26664x893bb469 m104860x9cf0d20b() {
        if (f56066x1ac75396 == null) {
            f56066x1ac75396 = new com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26664x893bb469();
        }
        return f56066x1ac75396;
    }

    /* renamed from: AddDownloadListener */
    public void m104861x7ba30bfd(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.InterfaceC26674x9aeb9f50 interfaceC26674x9aeb9f50) {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "call AddDownloadListener, dl: " + interfaceC26674x9aeb9f50);
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26668x16cd9691.m104911x9cf0d20b().Add(interfaceC26674x9aeb9f50);
    }

    /* renamed from: RemoveDownloadListener */
    public void m104862x42434a20(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.InterfaceC26674x9aeb9f50 interfaceC26674x9aeb9f50) {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "call RemoveDownloadListener, dl: " + interfaceC26674x9aeb9f50);
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26668x16cd9691.m104911x9cf0d20b().m104914x91afe4a4(interfaceC26674x9aeb9f50);
    }

    /* renamed from: cancelDownload */
    public void m104863xe1fe4122(java.lang.String str) {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "call cancelDownload, url: " + str);
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176 remove = this.f56067xc8f592fe.remove(str);
        if (remove != null) {
            remove.m104908xf2c12aa();
        }
    }

    /* renamed from: init */
    public void m104864x316510() {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "Start to load DownloadInfo list.");
        this.f56067xc8f592fe.clear();
        java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176> m105401xec5873fc = com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.C26760xbf3cb54f.m105397x9cf0d20b().m105401xec5873fc();
        if (m105401xec5873fc != null) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "The size of downloadinfo_list: " + m105401xec5873fc.size());
            java.util.Iterator<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176> it = m105401xec5873fc.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176 next = it.next();
                com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "---------------load download info---------------");
                next.m104897x2f39f4(TAG);
                this.f56067xc8f592fe.put(next.f56118x32d5c2, next);
                if (!next.m104900x832d7d2c()) {
                    next.m104910xc7ed7a1b(3, false);
                }
            }
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "Add NetworkChangedObserver to NetworkMonitorReceiver");
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26675xcb69b97b.m104950x9cf0d20b().m104951xb6a2a79d(this);
    }

    /* renamed from: isAllDownloadFinished */
    public java.lang.Boolean m104865xe58d0751() {
        java.util.Iterator<java.lang.String> it = this.f56067xc8f592fe.keySet().iterator();
        while (it.hasNext()) {
            if (!this.f56067xc8f592fe.get(it.next()).m104900x832d7d2c()) {
                return java.lang.Boolean.FALSE;
            }
        }
        return java.lang.Boolean.TRUE;
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26675xcb69b97b.INetworkChangedObserver
    /* renamed from: onNetworkChanged */
    public void mo104866xf54d1865() {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "onNetworkChanged");
        if (com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104890xc0ad1bc0() && com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88.m104915x9cf0d20b().m104921x1d5cdda1()) {
            java.lang.String m104885x3d316d39 = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104885x3d316d39();
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "currentNetType = " + m104885x3d316d39);
            java.util.Iterator<java.lang.String> it = this.f56067xc8f592fe.keySet().iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176 c26667x4be17176 = this.f56067xc8f592fe.get(it.next());
                if (com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88.m104915x9cf0d20b().m104922x1d5cdda1(c26667x4be17176.f56106xbea494a, m104885x3d316d39)) {
                    com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "onNetworkChanged, errCode = " + c26667x4be17176.f56100x9d2defe0);
                    int i17 = c26667x4be17176.f56100x9d2defe0;
                    if (i17 == 601 || i17 == 602 || i17 == 605 || i17 == 603 || i17 == 606) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "onNetworkChanged, currentTime = " + currentTimeMillis + ", DownloadFailedTime = " + c26667x4be17176.f56101x9990ea9f);
                        if (currentTimeMillis - c26667x4be17176.f56101x9990ea9f < f56065x50a5d4c5) {
                            c26667x4be17176.m104907x1d3a901c(true);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: pauseDownload */
    public void m104867xe51afc9e(java.lang.String str) {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "call pauseDownload, url: " + str);
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176 c26667x4be17176 = this.f56067xc8f592fe.get(str);
        if (c26667x4be17176 != null) {
            c26667x4be17176.m104903xe51afc9e();
        }
    }

    /* renamed from: queryDownloadInfo */
    public com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176 m104868xc2c99e3e(java.lang.String str) {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "call queryDownloadInfo, url: " + str);
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176 c26667x4be17176 = this.f56067xc8f592fe.get(str);
        if (c26667x4be17176 == null) {
            c26667x4be17176 = com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.C26760xbf3cb54f.m105397x9cf0d20b().m105400x9e2ff5fa(str);
        }
        boolean m104889x3f8ad588 = c26667x4be17176 != null ? c26667x4be17176.f56099x92db64a6.equals("application/tm.android.apkdiff") ? com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104889x3f8ad588(str, c26667x4be17176.f56099x92db64a6) : com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104888x3f8ad588(c26667x4be17176.f56103xf9236db4) : false;
        if (c26667x4be17176 == null || !c26667x4be17176.m104901x5e71f07b() || m104889x3f8ad588) {
            return c26667x4be17176;
        }
        this.f56067xc8f592fe.remove(str);
        com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.C26760xbf3cb54f.m105397x9cf0d20b().m105399xf72dcea1(str);
        return null;
    }

    /* renamed from: startDownload */
    public int m104869x5cae6f0a(java.lang.String str, java.lang.String str2, long j17, int i17, java.lang.String str3, java.lang.String str4, java.util.Map<java.lang.String, java.lang.String> map) {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "call startDownload, url: " + str + "priority: " + i17);
        if (!com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104890xc0ad1bc0()) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "call startDownload, return errCode: 1");
            return 1;
        }
        if (!com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104885x3d316d39().equalsIgnoreCase("wifi") && com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88.m104915x9cf0d20b().m104918x4762f449()) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "call startDownload, return errCode: 2");
            return 2;
        }
        if (!com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104892x7c008f1d(str)) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "call startDownload, return errCode: 3");
            return 3;
        }
        if (com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104889x3f8ad588(str, str3)) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "call startDownload, return errCode: 4");
            return 4;
        }
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176 c26667x4be17176 = this.f56067xc8f592fe.get(str);
        if (c26667x4be17176 == null) {
            c26667x4be17176 = com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.C26760xbf3cb54f.m105397x9cf0d20b().m105400x9e2ff5fa(str);
            if (c26667x4be17176 == null) {
                com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176 c26667x4be171762 = new com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176(str, str2, j17, i17, str3);
                if (c26667x4be171762.f56099x92db64a6.equals("resource/tm.android.unknown")) {
                    c26667x4be171762.f56103xf9236db4 = str4;
                }
                c26667x4be17176 = c26667x4be171762;
            } else {
                if (c26667x4be17176.f56099x92db64a6.equals("application/tm.android.apkdiff") ? com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104889x3f8ad588(str, c26667x4be17176.f56099x92db64a6) : com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104888x3f8ad588(c26667x4be17176.f56103xf9236db4)) {
                    com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "call startDownload, return errCode: 4");
                    return 4;
                }
            }
            this.f56067xc8f592fe.put(str, c26667x4be17176);
        }
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = (java.util.HashMap) map;
        c26667x4be17176.m104904x89d77f5(hashMap);
        boolean m104889x3f8ad588 = c26667x4be17176.f56099x92db64a6.equals("application/tm.android.apkdiff") ? com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104889x3f8ad588(str, c26667x4be17176.f56099x92db64a6) : com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104888x3f8ad588(c26667x4be17176.f56103xf9236db4);
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "fileExited = " + m104889x3f8ad588);
        if (m104889x3f8ad588) {
            return 4;
        }
        if (c26667x4be17176.m104901x5e71f07b() && !m104889x3f8ad588) {
            this.f56067xc8f592fe.remove(str);
            com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.C26760xbf3cb54f.m105397x9cf0d20b().m105399xf72dcea1(str);
            com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176 c26667x4be171763 = new com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176(str, str2, j17, i17, str3);
            if (c26667x4be171763.f56099x92db64a6.equals("resource/tm.android.unknown")) {
                c26667x4be171763.f56103xf9236db4 = str4;
            }
            c26667x4be171763.m104904x89d77f5(hashMap);
            this.f56067xc8f592fe.put(str, c26667x4be171763);
            c26667x4be17176 = c26667x4be171763;
        }
        int m104906x1d3a901c = c26667x4be17176.m104906x1d3a901c();
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "call startDownload, return errCode: " + m104906x1d3a901c);
        return m104906x1d3a901c;
    }

    /* renamed from: uninit */
    public void m104870xcde67f29() {
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26675xcb69b97b.m104950x9cf0d20b().m104954x972dcb40(this);
        java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176> arrayList = new java.util.ArrayList<>();
        if (!this.f56067xc8f592fe.isEmpty()) {
            java.util.Iterator<java.lang.String> it = this.f56067xc8f592fe.keySet().iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176 c26667x4be17176 = this.f56067xc8f592fe.get(it.next());
                if (c26667x4be17176.f56114x1a39f6bf == 2) {
                    m104867xe51afc9e(c26667x4be17176.f56118x32d5c2);
                }
                arrayList.add(c26667x4be17176);
            }
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "Start to save DownloadInfo list.");
        com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.C26760xbf3cb54f.m105397x9cf0d20b().m105404x1be912b1(arrayList);
    }
}
