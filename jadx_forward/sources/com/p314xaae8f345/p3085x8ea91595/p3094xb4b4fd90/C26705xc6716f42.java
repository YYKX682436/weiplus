package com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90;

/* renamed from: com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDK */
/* loaded from: classes13.dex */
public class C26705xc6716f42 extends com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.AbstractC26696x1d987bca implements com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26698x709a5c48, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26699x2293a699 {

    /* renamed from: AUTHORITY */
    public static final java.lang.String f56344xfe0c1723 = "com.tencent.android.qqdownloader.provider";

    /* renamed from: CONTENT_URI */
    public static final android.net.Uri f56345x69356466 = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.f56312x69356466;
    protected static final java.lang.String TAG = "QQDownloaderOpenSDK";

    /* renamed from: mInstance */
    protected static com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26705xc6716f42 f56346x46143c22;

    /* renamed from: _hellAccFlag_ */
    private byte f56347x7f11beae;

    /* renamed from: mDownloadParams */
    java.util.Map<java.lang.String, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b> f56348x26f731fb;

    /* renamed from: sdkAPILevel */
    protected int f56349xb1163be4 = 1;

    private C26705xc6716f42() {
        this.f56348x26f731fb = null;
        this.f56348x26f731fb = new java.util.concurrent.ConcurrentHashMap();
    }

    /* renamed from: about */
    public static java.lang.String m105058x585238d() {
        return "TMQQDownloaderOpenSDK_2014_05_13_17_36_release_35169";
    }

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26705xc6716f42 m105059x9cf0d20b() {
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26705xc6716f42 c26705xc6716f42;
        synchronized (com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26705xc6716f42.class) {
            if (f56346x46143c22 == null) {
                f56346x46143c22 = new com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26705xc6716f42();
            }
            c26705xc6716f42 = f56346x46143c22;
        }
        return c26705xc6716f42;
    }

    /* renamed from: isExistActoin */
    public static boolean m105060xd3bc324f(long j17) {
        java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3087x2c0b7d03.C26649x6e73f9ab> m104809x30842988;
        if (j17 >= 0 && (m104809x30842988 = new com.p314xaae8f345.p3085x8ea91595.p3087x2c0b7d03.C26648x84b129ae().m104809x30842988()) != null && m104809x30842988.size() > 0) {
            java.util.Iterator<com.p314xaae8f345.p3085x8ea91595.p3087x2c0b7d03.C26649x6e73f9ab> it = m104809x30842988.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p3085x8ea91595.p3087x2c0b7d03.C26649x6e73f9ab next = it.next();
                if (next.f55971x7e499b89 == j17 && next.f55973x5fe5d57e - next.f55974x1dda0005 <= 300000) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: isFileExist */
    private boolean m105061xf65bd4d1(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        return !m17.a() ? false : m17.f294799a.F(m17.f294800b);
    }

    /* renamed from: relateToQQDownloader */
    private void m105062x75608b29(android.content.Context context, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b c26708x7750f26b, java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.String> m105021xfd3343cb = super.m105021xfd3343cb(c26708x7750f26b, false, false);
        m105021xfd3343cb.put("taskid", str);
        java.lang.String m105020xd32b22be = super.m105020xd32b22be(4, m105021xfd3343cb);
        android.content.Intent intent = new android.content.Intent("com.tencent.android.qqdownloader.action.RELATED");
        intent.setPackage("com.tencent.android.qqdownloader");
        intent.putExtra("command", "cmd_updatedownload");
        intent.putExtra("relatedurl", m105020xd32b22be);
        context.sendBroadcast(intent);
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.AbstractC26696x1d987bca
    /* renamed from: addDownloadTaskFromAppDetail */
    public long mo105011x21184a7a(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b c26708x7750f26b, boolean z17, boolean z18) {
        if (this.f56348x26f731fb != null && c26708x7750f26b != null) {
            this.f56348x26f731fb.put(java.util.UUID.randomUUID().toString(), c26708x7750f26b);
        }
        return super.m105015x38e26e5b(c26708x7750f26b, z17, z18, c26708x7750f26b.f56371x6e5ae6c2, null, 2);
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.AbstractC26696x1d987bca, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26699x2293a699
    /* renamed from: addDownloadTaskFromAuthorize */
    public long mo105012x3a11b091(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b c26708x7750f26b, java.lang.String str) {
        if (this.f56348x26f731fb != null && c26708x7750f26b != null) {
            this.f56348x26f731fb.put(java.util.UUID.randomUUID().toString(), c26708x7750f26b);
        }
        return super.m105015x38e26e5b(c26708x7750f26b, true, true, c26708x7750f26b.f56371x6e5ae6c2, str, 3);
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.AbstractC26696x1d987bca, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26699x2293a699
    /* renamed from: addDownloadTaskFromTaskList */
    public long mo105013x9c40b21b(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b c26708x7750f26b, boolean z17, boolean z18) {
        if (this.f56348x26f731fb != null && c26708x7750f26b != null) {
            this.f56348x26f731fb.put(java.util.UUID.randomUUID().toString(), c26708x7750f26b);
        }
        return super.m105015x38e26e5b(c26708x7750f26b, z17, z18, c26708x7750f26b.f56371x6e5ae6c2, null, 1);
    }

    /* renamed from: checkQQDownloaderInstalled */
    public int m105064x89fda97d(int i17) {
        android.content.Context context = this.f56269xd6cfe882;
        if (context == null) {
            throw new java.lang.Exception("you must initial openSDK,by calling initQQDownloaderOpenSDK method!");
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                if (packageManager.getPackageInfo("com.tencent.android.qqdownloader", 0) == null) {
                    return 1;
                }
                return (this.f56349xb1163be4 <= com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().m105497x3f2a2e75() && i17 <= com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().m105498x28d5ae1a()) ? 0 : 2;
            } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            }
        }
        return 1;
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.AbstractC26696x1d987bca, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26699x2293a699
    /* renamed from: destroyQQDownloaderOpenSDK */
    public void mo105018x8510c021() {
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26675xcb69b97b.m104950x9cf0d20b().m104955x41b0e64b();
        com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26683x196ff91c.m104979x9cf0d20b().m104980xc6e3cda3();
        com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26686xfa250f15.m104988x9cf0d20b().m104989xf5e5c7a0();
        com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26686xfa250f15.m104988x9cf0d20b().m104990x5cd39514();
        if (this.f56269xd6cfe882 != null) {
            com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26697x286158ba.m105032x9cf0d20b().m105036xb4567ae5(this.f56269xd6cfe882);
            com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26697x286158ba.m105032x9cf0d20b().m105035x30aafe03(this);
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().m105491x5cd39ffa();
        this.f56269xd6cfe882 = null;
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.AbstractC26696x1d987bca, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26699x2293a699
    /* renamed from: getDownloadTaskState */
    public com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300 mo105023xc45041ae(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b c26708x7750f26b) {
        com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300 c26663xc1a70300;
        boolean z17;
        android.database.Cursor query;
        android.content.Context context = this.f56269xd6cfe882;
        if (context == null) {
            throw new java.lang.Exception("Context shouldn't be null !");
        }
        if (c26708x7750f26b == null) {
            throw new java.lang.Exception("QQDownloaderParam param cann't is null!");
        }
        android.content.ContentResolver contentResolver = context.getContentResolver();
        android.database.Cursor cursor = null;
        r6 = null;
        com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300 c26663xc1a703002 = null;
        cursor = null;
        try {
            try {
                z17 = true;
                query = contentResolver.query(f56345x69356466, null, "packageName=? and versionCode=? and channelId=?", new java.lang.String[]{c26708x7750f26b.f56376x4225cd2c, java.lang.String.valueOf(c26708x7750f26b.f56377x857e2f93), c26708x7750f26b.f56372x5720517e}, null);
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
            try {
                try {
                    com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.d(TAG, "getDownloadTaskState from qqdownloader , taskPackageName = " + c26708x7750f26b.f56376x4225cd2c + ", taskVersion=" + java.lang.String.valueOf(c26708x7750f26b.f56377x857e2f93) + ", channelId=" + c26708x7750f26b.f56372x5720517e);
                    if (query != null && query.moveToFirst()) {
                        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "relate to qqdownloader , packageName = " + c26708x7750f26b.f56376x4225cd2c);
                        long j17 = query.getLong(query.getColumnIndex(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56313x3b97817));
                        java.lang.String str = com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105479x6d7665f(query.getString(query.getColumnIndex(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56314xfb87f665))).get(0);
                        java.lang.String string = query.getString(query.getColumnIndex(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1));
                        long j18 = query.getLong(query.getColumnIndex(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56318xd1e65c07));
                        long j19 = query.getLong(query.getColumnIndex(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56320x7e50270a));
                        int m105481x258bf3d6 = com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105481x258bf3d6(query.getInt(query.getColumnIndex("state")));
                        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "getDownloadTaskState state = " + m105481x258bf3d6);
                        if (4 == m105481x258bf3d6 && !m105061xf65bd4d1(string)) {
                            query.close();
                            return null;
                        }
                        c26663xc1a70300 = new com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300(str, string, m105481x258bf3d6, j18, j19, "application/vnd.android.package-archive");
                        if (m105481x258bf3d6 == 5 || m105481x258bf3d6 == 4 || m105481x258bf3d6 == 3) {
                            try {
                                com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26742x5a9e4fad m104978x4a8e9809 = com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26682x21d6a411.m104977x9cf0d20b().m104978x4a8e9809((byte) 1);
                                m104978x4a8e9809.via = c26708x7750f26b.via;
                                m104978x4a8e9809.f56612x58b7f1c = java.lang.String.valueOf(j17);
                                m104978x4a8e9809.f56629xdf539674 = m105481x258bf3d6;
                                m104978x4a8e9809.f56624x2361c60 = str;
                                com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26682x21d6a411.m104977x9cf0d20b().m104969x86141d2d(m104978x4a8e9809);
                            } catch (java.lang.Exception e17) {
                                e = e17;
                                cursor = query;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e, "", new java.lang.Object[0]);
                                if (cursor != null) {
                                    cursor.close();
                                }
                                return c26663xc1a70300;
                            }
                        }
                        java.util.Map<java.lang.String, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b> map = this.f56348x26f731fb;
                        if (map != null) {
                            java.util.Iterator<java.util.Map.Entry<java.lang.String, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b>> it = map.entrySet().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z17 = false;
                                    break;
                                }
                                com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b value = it.next().getValue();
                                if (value != null && value.f56376x4225cd2c.equals(c26708x7750f26b.f56376x4225cd2c) && value.f56377x857e2f93 == c26708x7750f26b.f56377x857e2f93) {
                                    break;
                                }
                            }
                            if (!z17) {
                                com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "relate to qqdownloader , packageName = " + c26708x7750f26b.f56376x4225cd2c);
                                java.lang.String uuid = java.util.UUID.randomUUID().toString();
                                c26708x7750f26b.f56374x91ff1d2 = java.lang.String.valueOf(j17);
                                this.f56348x26f731fb.put(uuid, c26708x7750f26b);
                                m105062x75608b29(this.f56269xd6cfe882, c26708x7750f26b, uuid);
                            }
                        }
                        c26663xc1a703002 = c26663xc1a70300;
                    }
                    if (query == null) {
                        return c26663xc1a703002;
                    }
                    query.close();
                    return c26663xc1a703002;
                } catch (java.lang.Exception e18) {
                    e = e18;
                    c26663xc1a70300 = null;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                cursor = query;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (java.lang.Exception e19) {
            e = e19;
            c26663xc1a70300 = null;
        }
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.AbstractC26696x1d987bca, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26699x2293a699
    /* renamed from: initQQDownloaderOpenSDK */
    public void mo105024x5473474b(android.content.Context context) {
        this.f56269xd6cfe882 = context;
        this.f56267xab3ca929 = context.getPackageName();
        this.f56268x9e1d2c1d = com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105485xc7211efa(this.f56269xd6cfe882);
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().m105499xe9f5beed(this.f56269xd6cfe882);
        this.f56349xb1163be4 = 1;
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26697x286158ba.m105032x9cf0d20b().m105034x2573f6be(this.f56269xd6cfe882);
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26697x286158ba.m105032x9cf0d20b().m105033xfbae60a0(this);
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26675xcb69b97b.m104950x9cf0d20b().m104953xc20729b2();
        com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26683x196ff91c.m104979x9cf0d20b().m104982x319ab1e7();
        com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26686xfa250f15.m104988x9cf0d20b().m104991xeaf05970();
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26698x709a5c48
    /* renamed from: onDownloadStateChanged */
    public void mo105037x9a6f4e0a(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26710x252547fa c26710x252547fa) {
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b c26708x7750f26b = c26710x252547fa.f56385x658188d;
        int m105481x258bf3d6 = com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105481x258bf3d6(c26710x252547fa.f56386x68ac491);
        int m105480xba38b0d6 = com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105480xba38b0d6(c26710x252547fa.f56381x139cb015);
        java.lang.String str = c26710x252547fa.f56382x5336c059;
        java.lang.String str2 = c26710x252547fa.f56387xcb7ef180;
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "onDownloadStateChanged state = " + m105481x258bf3d6);
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b c26708x7750f26b2 = (str2 == null || str2.trim().length() <= 0) ? null : this.f56348x26f731fb.get(str2);
        if (c26708x7750f26b2 != null) {
            m105025xaba1ac62(c26708x7750f26b2, m105481x258bf3d6, m105480xba38b0d6, str);
        } else {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "onDownloadStateChanged storeParam = null");
        }
        if (6 == m105481x258bf3d6) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.util.Map.Entry<java.lang.String, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b> entry : this.f56348x26f731fb.entrySet()) {
                com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b value = entry.getValue();
                java.lang.String key = entry.getKey();
                if (value != null && !android.text.TextUtils.isEmpty(c26708x7750f26b.f56376x4225cd2c) && value.f56376x4225cd2c.equals(c26708x7750f26b.f56376x4225cd2c) && value.f56377x857e2f93 == c26708x7750f26b.f56377x857e2f93) {
                    arrayList.add(key);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f56348x26f731fb.remove((java.lang.String) it.next());
            }
        }
    }

    /* renamed from: startQQDownloader */
    public void m105065xa29bd2d7(android.content.Context context) {
        if (context != null) {
            android.content.Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.tencent.android.qqdownloader");
            if (context instanceof android.app.Application) {
                launchIntentForPackage.addFlags(268435456);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(launchIntentForPackage);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startQQDownloader", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startQQDownloader", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: startToAppDetail */
    public void m105066xd1237fd5(android.content.Context context, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b c26708x7750f26b, boolean z17, boolean z18) {
        if (context == null) {
            throw new java.lang.Exception("you must input an application or activity context!");
        }
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        java.util.Map<java.lang.String, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b> map = this.f56348x26f731fb;
        if (map != null) {
            map.put(uuid, c26708x7750f26b);
        }
        if (z17) {
            com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26742x5a9e4fad m104978x4a8e9809 = com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26682x21d6a411.m104977x9cf0d20b().m104978x4a8e9809((byte) 1);
            m104978x4a8e9809.via = c26708x7750f26b.via;
            m104978x4a8e9809.f56611x27ebbb = uuid;
            m104978x4a8e9809.f56612x58b7f1c = c26708x7750f26b.f56375x9200497;
            m104978x4a8e9809.f56629xdf539674 = 1;
            com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26682x21d6a411.m104977x9cf0d20b().m104969x86141d2d(m104978x4a8e9809);
        }
        java.util.Map<java.lang.String, java.lang.String> m105021xfd3343cb = super.m105021xfd3343cb(c26708x7750f26b, z17, z18);
        m105021xfd3343cb.put("taskid", uuid);
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(super.m105020xd32b22be(2, m105021xfd3343cb)));
        if (context instanceof android.app.Application) {
            intent.addFlags(268435456);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startToAppDetail", "(Landroid/content/Context;Lcom/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startToAppDetail", "(Landroid/content/Context;Lcom/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.AbstractC26696x1d987bca, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26699x2293a699
    /* renamed from: startToAuthorized */
    public void mo105028x597fd7f8(android.content.Context context, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b c26708x7750f26b, java.lang.String str) {
        if (context == null) {
            throw new java.lang.Exception("you must input an application or activity context!");
        }
        if (c26708x7750f26b != null) {
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            java.util.Map<java.lang.String, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b> map = this.f56348x26f731fb;
            if (map != null) {
                map.put(uuid, c26708x7750f26b);
            }
            com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26742x5a9e4fad m104978x4a8e9809 = com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26682x21d6a411.m104977x9cf0d20b().m104978x4a8e9809((byte) 1);
            m104978x4a8e9809.via = c26708x7750f26b.via;
            m104978x4a8e9809.f56611x27ebbb = uuid;
            m104978x4a8e9809.f56612x58b7f1c = c26708x7750f26b.f56375x9200497;
            m104978x4a8e9809.f56629xdf539674 = 1;
            com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26682x21d6a411.m104977x9cf0d20b().m104969x86141d2d(m104978x4a8e9809);
            java.util.Map<java.lang.String, java.lang.String> m105021xfd3343cb = super.m105021xfd3343cb(c26708x7750f26b, true, true);
            m105021xfd3343cb.put("verifytype", str);
            m105021xfd3343cb.put("taskid", uuid);
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(super.m105020xd32b22be(3, m105021xfd3343cb)));
            if (context instanceof android.app.Application) {
                intent.addFlags(268435456);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startToAuthorized", "(Landroid/content/Context;Lcom/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startToAuthorized", "(Landroid/content/Context;Lcom/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        throw new java.lang.Exception("QQDownloaderParam param cann't be null!");
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26699x2293a699
    /* renamed from: startToDownloadTaskList */
    public void mo105041x6ef71d08(android.content.Context context, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b c26708x7750f26b, boolean z17, boolean z18) {
        if (context == null) {
            throw new java.lang.Exception("you must input an application or activity context!");
        }
        if (c26708x7750f26b == null) {
            return;
        }
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        java.util.Map<java.lang.String, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b> map = this.f56348x26f731fb;
        if (map != null) {
            map.put(uuid, c26708x7750f26b);
        }
        if (z17) {
            com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26742x5a9e4fad m104978x4a8e9809 = com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26682x21d6a411.m104977x9cf0d20b().m104978x4a8e9809((byte) 1);
            m104978x4a8e9809.f56611x27ebbb = uuid;
            m104978x4a8e9809.f56624x2361c60 = "";
            m104978x4a8e9809.via = c26708x7750f26b.via;
            m104978x4a8e9809.f56612x58b7f1c = c26708x7750f26b.f56375x9200497;
            com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26682x21d6a411.m104977x9cf0d20b().m104969x86141d2d(m104978x4a8e9809);
        }
        java.util.Map<java.lang.String, java.lang.String> m105021xfd3343cb = super.m105021xfd3343cb(c26708x7750f26b, z17, z18);
        m105021xfd3343cb.put("taskid", uuid);
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(super.m105020xd32b22be(1, m105021xfd3343cb)));
        if (context instanceof android.app.Application) {
            intent.addFlags(268435456);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startToDownloadTaskList", "(Landroid/content/Context;Lcom/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startToDownloadTaskList", "(Landroid/content/Context;Lcom/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.AbstractC26696x1d987bca
    /* renamed from: startToWebView */
    public void mo105030xd0ab32dc(android.content.Context context, java.lang.String str) {
        if (context == null) {
            throw new java.lang.Exception("you must input an application or activity context!");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.Exception("param url shouldn't be null!");
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("url", str);
        java.lang.String m105020xd32b22be = super.m105020xd32b22be(5, hashMap);
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "startToWebView finalPath:" + m105020xd32b22be);
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(m105020xd32b22be));
        if (context instanceof android.app.Application) {
            intent.addFlags(268435456);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startToWebView", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startToWebView", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: addDownloadTaskFromAuthorize */
    public long m105063x3a11b091(java.lang.String str) {
        java.lang.String m105019x77685021 = super.m105019x77685021(str);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        return this.f56273xa21b0369.m104807x93f54d7e(this.f56267xab3ca929, this.f56268x9e1d2c1d, "", 0, m105019x77685021, currentTimeMillis, currentTimeMillis + 300000, 0, null);
    }

    /* renamed from: startToAuthorized */
    public void m105067x597fd7f8(android.content.Context context, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(m105019x77685021(str)));
        if (context instanceof android.app.Application) {
            intent.addFlags(268435456);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startToAuthorized", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startToAuthorized", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
