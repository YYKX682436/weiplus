package com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90;

/* renamed from: com.tencent.tmassistantsdk.openSDK.BaseQQDownloaderOpenSDK */
/* loaded from: classes13.dex */
public abstract class AbstractC26696x1d987bca {
    protected static final java.lang.String TAG = "BaseQQDownloaderOpenSDK";

    /* renamed from: _hellAccFlag_ */
    private byte f56266x7f11beae;

    /* renamed from: sdkAPILevel */
    protected int f56272xb1163be4 = 1;

    /* renamed from: mContext */
    protected android.content.Context f56269xd6cfe882 = null;

    /* renamed from: hostPackageName */
    protected java.lang.String f56267xab3ca929 = null;

    /* renamed from: hostVersionCode */
    protected int f56268x9e1d2c1d = 0;

    /* renamed from: sdkChannel */
    protected com.p314xaae8f345.p3085x8ea91595.p3087x2c0b7d03.C26648x84b129ae f56273xa21b0369 = new com.p314xaae8f345.p3085x8ea91595.p3087x2c0b7d03.C26648x84b129ae();

    /* renamed from: mListenerQueue */
    protected java.lang.ref.ReferenceQueue<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26700x308b266d> f56270x7e003d50 = new java.lang.ref.ReferenceQueue<>();

    /* renamed from: mWeakListenerArrayList */
    protected java.util.ArrayList<java.lang.ref.WeakReference<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26700x308b266d>> f56271x47156d3e = new java.util.ArrayList<>();

    /* renamed from: getQQDownloadApiLevel */
    public static int m105010x3de44a48(android.content.Context context) {
        android.os.Bundle bundle;
        if (context == null) {
            return 0;
        }
        try {
            android.content.pm.ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.tencent.android.qqdownloader", 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return 0;
            }
            return bundle.getInt("com.tencent.android.qqdownloader.sdk.apilevel");
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "packagename not found！");
            return 0;
        }
    }

    /* renamed from: addDownloadTaskFromAppDetail */
    public abstract long mo105011x21184a7a(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b c26708x7750f26b, boolean z17, boolean z18);

    /* renamed from: addDownloadTaskFromAuthorize */
    public abstract long mo105012x3a11b091(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b c26708x7750f26b, java.lang.String str);

    /* renamed from: addDownloadTaskFromTaskList */
    public abstract long mo105013x9c40b21b(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b c26708x7750f26b, boolean z17, boolean z18);

    /* renamed from: addDownloadTaskFromWebview */
    public long m105014xfc3aeea1(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("url", str);
        java.lang.String m105020xd32b22be = m105020xd32b22be(5, hashMap);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "addDownloadTaskFromTaskList,hostPackageName=" + this.f56267xab3ca929 + "; hostVersionCode=" + this.f56268x9e1d2c1d + "; hostUserIdentity=; dataItemType=0;dataItemAction=" + m105020xd32b22be);
        return this.f56273xa21b0369.m104807x93f54d7e(this.f56267xab3ca929, this.f56268x9e1d2c1d, "", 0, m105020xd32b22be, currentTimeMillis, currentTimeMillis + 300000, 0, null);
    }

    /* renamed from: buildAddDBData */
    public long m105015x38e26e5b(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b c26708x7750f26b, boolean z17, boolean z18, java.lang.String str, java.lang.String str2, int i17) {
        java.util.Map<java.lang.String, java.lang.String> m105021xfd3343cb;
        if (android.text.TextUtils.isEmpty(str2)) {
            m105021xfd3343cb = m105021xfd3343cb(c26708x7750f26b, z17, z18);
        } else {
            m105021xfd3343cb = m105021xfd3343cb(c26708x7750f26b, true, true);
            m105021xfd3343cb.put("verifytype", str2);
        }
        java.lang.String m105020xd32b22be = m105020xd32b22be(i17, m105021xfd3343cb);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "addDownloadTaskFromTaskList,hostPackageName=" + this.f56267xab3ca929 + "; hostVersionCode=" + this.f56268x9e1d2c1d + "; hostUserIdentity=; dataItemType=0;dataItemAction=" + m105020xd32b22be);
        return this.f56273xa21b0369.m104807x93f54d7e(this.f56267xab3ca929, this.f56268x9e1d2c1d, "", 0, m105020xd32b22be, currentTimeMillis, currentTimeMillis + 300000, 0, null);
    }

    /* renamed from: checkQQDownloaderInstalled */
    public int m105017x89fda97d() {
        android.content.Context context = this.f56269xd6cfe882;
        if (context == null) {
            throw new java.lang.Exception("you must initial openSDK,by calling initQQDownloaderOpenSDK method!");
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                if (packageManager.getPackageInfo("com.tencent.android.qqdownloader", 0) != null) {
                    return this.f56272xb1163be4 > com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().m105497x3f2a2e75() ? 2 : 0;
                }
                return 1;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "packagename not found！");
            }
        }
        return 1;
    }

    /* renamed from: destroyQQDownloaderOpenSDK */
    public abstract void mo105018x8510c021();

    /* renamed from: formatEncryptUrl */
    public java.lang.String m105019x77685021(java.lang.String str) {
        return "tmast://encrypt?encryptdata=" + java.net.URLEncoder.encode(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.m105048xa5d6c4c7(str));
    }

    /* renamed from: formatIntentUriPath */
    public java.lang.String m105020xd32b22be(int i17, java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String str;
        if (i17 != 1) {
            str = "appdetails";
            if (i17 != 2 && i17 != 3) {
                if (i17 == 4) {
                    str = "updatedownload";
                } else if (i17 == 5) {
                    str = "webview";
                }
            }
        } else {
            str = "download";
        }
        java.lang.String str2 = "tpmast://" + str + "?";
        java.lang.String str3 = "";
        if (map != null && map.size() > 0) {
            int i18 = 0;
            java.lang.String str4 = "";
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.String value = entry.getValue();
                if (!android.text.TextUtils.isEmpty(key) && !android.text.TextUtils.isEmpty(value)) {
                    str4 = str4 + (i18 <= 0 ? "" : "&") + key + "=" + java.net.URLEncoder.encode(value);
                }
                i18++;
            }
            str3 = str4;
        }
        java.lang.String str5 = str2 + str3;
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "path:" + str5);
        return m105019x77685021(str5);
    }

    /* renamed from: formatMapParams */
    public java.util.Map<java.lang.String, java.lang.String> m105021xfd3343cb(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b c26708x7750f26b, boolean z17, boolean z18) {
        java.lang.String m105022x6b99b4d6 = m105022x6b99b4d6(z17, z18);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("hostpname", this.f56267xab3ca929);
        hashMap.put("hostversioncode", java.lang.String.valueOf(this.f56268x9e1d2c1d));
        hashMap.put("sngappid", c26708x7750f26b.f56370x49183d30);
        hashMap.put("appid", c26708x7750f26b.f56375x9200497);
        hashMap.put("apkid", c26708x7750f26b.f56374x91ff1d2);
        hashMap.put("pname", c26708x7750f26b.f56376x4225cd2c);
        hashMap.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56308x97129f1f, c26708x7750f26b.via);
        hashMap.put("uin", c26708x7750f26b.uin);
        hashMap.put("uintype", c26708x7750f26b.f56378xe69c0ab4);
        hashMap.put("versioncode", java.lang.String.valueOf(c26708x7750f26b.f56377x857e2f93));
        hashMap.put("oplist", m105022x6b99b4d6);
        hashMap.put("channelid", c26708x7750f26b.f56372x5720517e);
        hashMap.put("actionflag", c26708x7750f26b.f56371x6e5ae6c2);
        hashMap.put("sdkid", c26708x7750f26b.f56373x6839ef5);
        return hashMap;
    }

    /* renamed from: formatOplist */
    public java.lang.String m105022x6b99b4d6(boolean z17, boolean z18) {
        return (z17 && z18) ? "1;2" : z18 ? "2" : z17 ? "1" : "";
    }

    /* renamed from: getDownloadTaskState */
    public abstract com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300 mo105023xc45041ae(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b c26708x7750f26b);

    /* renamed from: initQQDownloaderOpenSDK */
    public abstract void mo105024x5473474b(android.content.Context context);

    /* renamed from: onStateChanged */
    public void m105025xaba1ac62(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b c26708x7750f26b, int i17, int i18, java.lang.String str) {
        java.util.Iterator<java.lang.ref.WeakReference<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26700x308b266d>> it = this.f56271x47156d3e.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26700x308b266d interfaceC26700x308b266d = it.next().get();
            if (interfaceC26700x308b266d == null) {
                com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "onDownloadStateChanged listener = null");
            } else {
                interfaceC26700x308b266d.mo105044xc6f868cf(c26708x7750f26b, i17, i18, str);
            }
        }
    }

    /* renamed from: registerListener */
    public boolean m105026x42780477(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26700x308b266d interfaceC26700x308b266d) {
        if (interfaceC26700x308b266d == null) {
            return false;
        }
        while (true) {
            java.lang.ref.Reference<? extends com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26700x308b266d> poll = this.f56270x7e003d50.poll();
            if (poll == null) {
                break;
            }
            this.f56271x47156d3e.remove(poll);
        }
        java.util.Iterator<java.lang.ref.WeakReference<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26700x308b266d>> it = this.f56271x47156d3e.iterator();
        while (it.hasNext()) {
            if (it.next().get() == interfaceC26700x308b266d) {
                return true;
            }
        }
        this.f56271x47156d3e.add(new java.lang.ref.WeakReference<>(interfaceC26700x308b266d, this.f56270x7e003d50));
        return true;
    }

    /* renamed from: removeDownloadTask */
    public boolean m105027xdf0c94d1(long j17) {
        if (j17 >= 0) {
            return this.f56273xa21b0369.m104808x85a6a708(j17);
        }
        return false;
    }

    /* renamed from: startToAuthorized */
    public abstract void mo105028x597fd7f8(android.content.Context context, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b c26708x7750f26b, java.lang.String str);

    /* renamed from: startToDownloadTaskList */
    public void m105029x6ef71d08(android.content.Context context) {
        if (context == null) {
            throw new java.lang.Exception("you must input an application or activity context!");
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("tmast://download?hostpname=" + this.f56267xab3ca929 + "&hostversion=" + this.f56268x9e1d2c1d));
        if (context instanceof android.app.Application) {
            intent.addFlags(268435456);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/tmassistantsdk/openSDK/BaseQQDownloaderOpenSDK", "startToDownloadTaskList", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/tmassistantsdk/openSDK/BaseQQDownloaderOpenSDK", "startToDownloadTaskList", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: startToWebView */
    public abstract void mo105030xd0ab32dc(android.content.Context context, java.lang.String str);

    /* renamed from: unregisterListener */
    public boolean m105031xc221c110(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26700x308b266d interfaceC26700x308b266d) {
        if (interfaceC26700x308b266d == null) {
            return false;
        }
        java.util.Iterator<java.lang.ref.WeakReference<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26700x308b266d>> it = this.f56271x47156d3e.iterator();
        while (it.hasNext()) {
            if (it.next().get() == interfaceC26700x308b266d) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    /* renamed from: buildAddDBData */
    public long m105016x38e26e5b(byte[] bArr) {
        if (bArr == null) {
            return -1L;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        return this.f56273xa21b0369.m104807x93f54d7e(null, 0, null, 0, null, currentTimeMillis, currentTimeMillis + 300000, 1, bArr);
    }
}
