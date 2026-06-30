package com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88;

/* renamed from: com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTaskManager */
/* loaded from: classes13.dex */
public class C26680x21944beb implements com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.InterfaceC26674x9aeb9f50 {
    protected static final java.lang.String TAG = "ServiceDownloadTaskManager";

    /* renamed from: mServiceTaskList */
    protected java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26679xba086962> f56228x92e56b = new java.util.ArrayList<>();

    /* renamed from: mListener */
    protected com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.InterfaceC26678x1cd107c8 f56227x753a6c41 = null;

    public C26680x21944beb(java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26679xba086962> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        this.f56228x92e56b.addAll(arrayList);
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.InterfaceC26674x9aeb9f50
    /* renamed from: OnDownloadProgressChanged */
    public void mo104948xdb72a920(java.lang.String str, long j17, long j18) {
        java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26679xba086962> m104961x3f7e6a86;
        if (this.f56227x753a6c41 == null || (m104961x3f7e6a86 = m104961x3f7e6a86(str)) == null || m104961x3f7e6a86.size() <= 0) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26679xba086962> it = m104961x3f7e6a86.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26679xba086962 next = it.next();
            if (next.m104958xb69f43e(j17, j18, currentTimeMillis)) {
                com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "OnDownloadProgressChanged,clientKey:" + next.f56221x938e4a7 + ",receivedLen:" + j17 + ",url:" + str.hashCode());
                this.f56227x753a6c41.mo104956xdb72a920(next.f56221x938e4a7, str, j17, j18);
            }
        }
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.InterfaceC26674x9aeb9f50
    /* renamed from: OnDownloadStateChanged */
    public void mo104949xc9b7fa2a(java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17, boolean z18) {
        java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26679xba086962> m104961x3f7e6a86;
        if (this.f56227x753a6c41 == null || (m104961x3f7e6a86 = m104961x3f7e6a86(str)) == null || m104961x3f7e6a86.size() <= 0) {
            return;
        }
        java.util.Iterator<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26679xba086962> it = m104961x3f7e6a86.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26679xba086962 next = it.next();
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "OnDownloadStateChanged,clientKey:" + next.f56221x938e4a7 + ",state:" + i17 + ",errorcode:" + i18 + ",url:" + str.hashCode());
            next.f56224xbec81024 = i17;
            this.f56227x753a6c41.mo104957xc9b7fa2a(next.f56221x938e4a7, str, i17, i18, str2, z17, z18);
        }
    }

    /* renamed from: cancelDownload */
    public void m104959xe1fe4122(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            return;
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "cancelDownload,clientKey:".concat(str));
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26679xba086962 m104960x3f7e6a86 = m104960x3f7e6a86(str, str2);
        if (m104960x3f7e6a86 != null) {
            this.f56228x92e56b.remove(m104960x3f7e6a86);
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "cancelDownload,clientKey:" + str + ",remove taskItem");
        } else {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.w(TAG, "cancelDownload,clientKey:" + str + ",taskItem is null");
        }
        java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26679xba086962> m104961x3f7e6a86 = m104961x3f7e6a86(str2);
        if (m104961x3f7e6a86 == null || m104961x3f7e6a86.size() == 0) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "cancelDownload,clientKey:" + str + ",taskItem is the only on cancelAll");
            com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26664x893bb469.m104860x9cf0d20b().m104863xe1fe4122(str2);
        }
    }

    /* renamed from: findDownloadTask */
    public synchronized com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26679xba086962 m104960x3f7e6a86(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        java.util.Iterator<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26679xba086962> it = this.f56228x92e56b.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26679xba086962 next = it.next();
            java.lang.String str3 = next.f56221x938e4a7;
            if (str3 != null && str3.equals(str) && next.f56226x32d9c2.equals(str2)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: getDownloadTaskInfo */
    public com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300 m104962x69694ff1(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176 m104868xc2c99e3e = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26664x893bb469.m104860x9cf0d20b().m104868xc2c99e3e(str2);
        if (m104868xc2c99e3e != null) {
            return new com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300(m104868xc2c99e3e.f56118x32d5c2, com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.C26761xfeddef81.m105405x31429ad4(m104868xc2c99e3e.f56103xf9236db4), m104868xc2c99e3e.f56114x1a39f6bf, m104868xc2c99e3e.f56108xcf18f39d, m104868xc2c99e3e.m104899xdd045eaf(), m104868xc2c99e3e.f56099x92db64a6);
        }
        if (com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104889x3f8ad588(str2, "application/vnd.android.package-archive")) {
            java.lang.String m104884x7e916b09 = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104884x7e916b09(str2, "application/vnd.android.package-archive");
            java.lang.String m105405x31429ad4 = com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.C26761xfeddef81.m105405x31429ad4(m104884x7e916b09);
            com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.C26761xfeddef81 c26761xfeddef81 = new com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.C26761xfeddef81(m104884x7e916b09, m104884x7e916b09);
            return new com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300(str2, m105405x31429ad4, 4, c26761xfeddef81.m105415xbe0e3ae6(), c26761xfeddef81.m105415xbe0e3ae6(), "application/vnd.android.package-archive");
        }
        if (!com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104889x3f8ad588(str2, "application/tm.android.apkdiff")) {
            m104965xdf0c94d1(str2);
            return null;
        }
        java.lang.String m104884x7e916b092 = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104884x7e916b09(str2, "application/tm.android.apkdiff");
        java.lang.String m105405x31429ad42 = com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.C26761xfeddef81.m105405x31429ad4(m104884x7e916b092);
        com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.C26761xfeddef81 c26761xfeddef812 = new com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.C26761xfeddef81(m104884x7e916b092, m104884x7e916b092);
        return new com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300(str2, m105405x31429ad42, 4, c26761xfeddef812.m105415xbe0e3ae6(), c26761xfeddef812.m105415xbe0e3ae6(), "application/tm.android.apkdiff");
    }

    /* renamed from: pauseDownload */
    public void m104963xe51afc9e(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            return;
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "pauseDownload,clientKey:".concat(str));
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26679xba086962 m104960x3f7e6a86 = m104960x3f7e6a86(str, str2);
        if (m104960x3f7e6a86 != null) {
            m104960x3f7e6a86.f56224xbec81024 = 3;
            this.f56228x92e56b.remove(m104960x3f7e6a86);
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "pauseDownload,clientKey:" + str + ",remove taskItem");
            java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26679xba086962> m104961x3f7e6a86 = m104961x3f7e6a86(str2);
            if (m104961x3f7e6a86 == null || m104961x3f7e6a86.size() == 0) {
                com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "pauseDownload,clientKey:" + str + ",taskItem is the only on pauseAll");
                com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26664x893bb469.m104860x9cf0d20b().m104867xe51afc9e(str2);
                com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "pauseDownload end,clientKey:" + str + ",taskItem is the only on pauseAll");
            }
            com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.InterfaceC26678x1cd107c8 interfaceC26678x1cd107c8 = this.f56227x753a6c41;
            if (interfaceC26678x1cd107c8 != null) {
                interfaceC26678x1cd107c8.mo104957xc9b7fa2a(str, str2, m104960x3f7e6a86.f56224xbec81024, 0, null, false, false);
            }
        } else {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.w(TAG, "pauseDownload,clientKey:" + str + ",taskItem is null");
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "pauseDownload end,clientKey:".concat(str));
    }

    /* renamed from: registerApkDownloadManagerListener */
    public void m104964x2becbd20() {
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26664x893bb469.m104860x9cf0d20b().m104861x7ba30bfd(this);
    }

    /* renamed from: removeDownloadTask */
    public synchronized void m104965xdf0c94d1(java.lang.String str) {
        if (str == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26679xba086962> it = this.f56228x92e56b.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26679xba086962 next = it.next();
            if (next.f56226x32d9c2.equals(str)) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() > 0) {
            this.f56228x92e56b.removeAll(arrayList);
        }
    }

    /* renamed from: setListener */
    public void m104966xc6cf6336(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.InterfaceC26678x1cd107c8 interfaceC26678x1cd107c8) {
        this.f56227x753a6c41 = interfaceC26678x1cd107c8;
    }

    /* renamed from: startDownload */
    public int m104967x5cae6f0a(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i17, java.lang.String str4, java.lang.String str5, java.util.Map<java.lang.String, java.lang.String> map) {
        if (str == null || str2 == null) {
            return 3;
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "startDownload,clientKey:".concat(str));
        if (m104960x3f7e6a86(str, str2) != null) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "startDownload,clientKey:" + str + ",taskItem isn't null");
            return com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26664x893bb469.m104860x9cf0d20b().m104869x5cae6f0a(str2, str3, j17, i17, str4, str5, map);
        }
        java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26679xba086962> m104961x3f7e6a86 = m104961x3f7e6a86(str2);
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26679xba086962 c26679xba086962 = new com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26679xba086962(str, str2);
        c26679xba086962.f56224xbec81024 = 1;
        this.f56228x92e56b.add(c26679xba086962);
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "startDownload,clientKey:" + str + ",add newTask");
        java.util.Iterator<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26679xba086962> it = m104961x3f7e6a86.iterator();
        boolean z17 = false;
        boolean z18 = false;
        while (it.hasNext()) {
            int i18 = it.next().f56224xbec81024;
            if (i18 == 2) {
                z17 = true;
            } else if (i18 == 1) {
                z18 = true;
            }
        }
        if (!z17 && !z18) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "startDownload,clientKey:" + str + ",start newTask download");
            return com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26664x893bb469.m104860x9cf0d20b().m104869x5cae6f0a(str2, str3, j17, i17, str4, str5, map);
        }
        if (z17) {
            c26679xba086962.f56224xbec81024 = 2;
        } else if (z18) {
            c26679xba086962.f56224xbec81024 = 1;
        }
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.InterfaceC26678x1cd107c8 interfaceC26678x1cd107c8 = this.f56227x753a6c41;
        if (interfaceC26678x1cd107c8 != null) {
            interfaceC26678x1cd107c8.mo104957xc9b7fa2a(str, str2, c26679xba086962.f56224xbec81024, 0, null, false, false);
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "startDownload,clientKey:" + str + ",newTask is downloading, state = " + c26679xba086962.f56224xbec81024);
        return 0;
    }

    /* renamed from: unRegisterApkDownloadManagerListener */
    public void m104968xd9fb6199() {
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26664x893bb469.m104860x9cf0d20b().m104862x42434a20(this);
    }

    /* renamed from: findDownloadTask */
    public synchronized java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26679xba086962> m104961x3f7e6a86(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26679xba086962> arrayList = new java.util.ArrayList<>();
        java.util.Iterator<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26679xba086962> it = this.f56228x92e56b.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26679xba086962 next = it.next();
            if (next.f56226x32d9c2.equals(str)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
