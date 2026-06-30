package com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758;

/* renamed from: com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager */
/* loaded from: classes13.dex */
public class C26714xd01f052e {

    /* renamed from: CLIENT_NAME */
    protected static final java.lang.String f56417x77b96a7f = "downloadSDKClient";
    protected static final java.lang.String TAG = "OpensdkToMsdkManager";

    /* renamed from: mInstance */
    protected static com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e f56418x46143c22;

    /* renamed from: mContext */
    protected android.content.Context f56426xd6cfe882;

    /* renamed from: mHttpRequest */
    protected com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e.C26690x18e802b6 f56429x1e4a6a3a = null;

    /* renamed from: mToMsdkListener */
    protected com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.InterfaceC26711x59173cea f56436xb68f0069 = null;

    /* renamed from: mAuthorizedInfo */
    protected com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26712xd27f11a0 f56424xc6892b6 = null;

    /* renamed from: mDownloadUrl */
    protected java.lang.String f56428x61dc691a = null;

    /* renamed from: mSupportVersionCode */
    protected int f56435x58c0eee3 = 0;

    /* renamed from: authorizedState */
    protected int f56419xb18b27b6 = 0;

    /* renamed from: hasNotify */
    protected boolean f56421xe6f83a83 = false;

    /* renamed from: isInstallFinished */
    protected boolean f56423x9aa0f0a3 = false;

    /* renamed from: insertActionId */
    protected long f56422xec262fca = -1;

    /* renamed from: sdkChannel */
    protected com.p314xaae8f345.p3085x8ea91595.p3087x2c0b7d03.C26648x84b129ae f56440xa21b0369 = null;

    /* renamed from: dialog */
    protected com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3097xac8f1cfd.DialogC26715xfebdfad9 f56420xb099fd48 = null;

    /* renamed from: mOpenSDK */
    protected com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26705xc6716f42 f56431x52cdb063 = null;

    /* renamed from: mSubMessagehandlerThread */
    protected android.os.HandlerThread f56434xa136b480 = null;

    /* renamed from: mSubMessageHandler */
    protected com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f56433x77814ab6 = null;

    /* renamed from: mMainMessageHandler */
    protected com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f56430x838d5ea9 = null;

    /* renamed from: mClient */
    protected com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18 f56425xfe7f1a98 = null;

    /* renamed from: mRequestListener */
    protected com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e.InterfaceC26693x480da935 f56432xba3c4c36 = new com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e.InterfaceC26693x480da935() { // from class: com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.2
        @Override // com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e.InterfaceC26693x480da935
        /* renamed from: onGetAuthorizedRequestFinished */
        public void mo105006x15efdbcf(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3098x2eefaa.C26717x4b1e0db8 c26717x4b1e0db8, int i17) {
            android.os.Message message = new android.os.Message();
            if (i17 != 0) {
                message.what = 5;
                message.obj = java.lang.Integer.valueOf(i17);
            } else {
                if (c26717x4b1e0db8 == null) {
                    return;
                }
                message.what = 4;
                message.obj = c26717x4b1e0db8;
            }
            com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this.f56430x838d5ea9.mo50308x2936bf5f(message);
        }
    };

    /* renamed from: retryBtnListener */
    protected android.view.View.OnClickListener f56439x36115768 = new android.view.View.OnClickListener() { // from class: com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.4
        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e c26714xd01f052e = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this;
            com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26712xd27f11a0 c26712xd27f11a0 = c26714xd01f052e.f56424xc6892b6;
            if (c26712xd27f11a0 == null) {
                return;
            }
            android.content.Context context = c26714xd01f052e.f56426xd6cfe882;
            if (context != null) {
                c26714xd01f052e.m105102xf295a38a(c26712xd27f11a0, context);
            }
            com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this.f56420xb099fd48.dismiss();
        }
    };

    /* renamed from: negativeBtnListenner */
    protected android.view.View.OnClickListener f56437x339fb44d = new android.view.View.OnClickListener() { // from class: com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.5
        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            if (com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this.f56420xb099fd48.isShowing()) {
                com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this.f56420xb099fd48.dismiss();
                com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this.f56429x1e4a6a3a = null;
            }
            com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26758x6c6ebd3e m104993x3623e6c2 = com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26687x41d13953.m104992x9cf0d20b().m104993x3623e6c2(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this.f56424xc6892b6);
            m104993x3623e6c2.f56719xe134bf89++;
            com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26687x41d13953.m104992x9cf0d20b().m104969x86141d2d(m104993x3623e6c2);
            try {
                com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e c26714xd01f052e = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this;
                if (c26714xd01f052e.f56425xfe7f1a98 != null) {
                    c26714xd01f052e.m105116xb0172743(c26714xd01f052e.f56428x61dc691a);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.TAG, e17, "", new java.lang.Object[0]);
            }
            com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e c26714xd01f052e2 = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this;
            if (c26714xd01f052e2.f56419xb18b27b6 == 2) {
                c26714xd01f052e2.m105109xfb33c256(true, c26714xd01f052e2.f56424xc6892b6);
            } else {
                c26714xd01f052e2.m105109xfb33c256(false, c26714xd01f052e2.f56424xc6892b6);
            }
        }
    };

    /* renamed from: positiveBtnListener */
    protected android.view.View.OnClickListener f56438x6989d377 = new android.view.View.OnClickListener() { // from class: com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.6
        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            if (com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this.f56426xd6cfe882 == null) {
                return;
            }
            com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3098x2eefaa.C26716x46bbe528 c26716x46bbe528 = (com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3098x2eefaa.C26716x46bbe528) view.getTag();
            try {
                com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e c26714xd01f052e = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this;
                int m105064x89fda97d = c26714xd01f052e.f56431x52cdb063.m105064x89fda97d(c26714xd01f052e.f56435x58c0eee3);
                if (m105064x89fda97d == 0) {
                    try {
                        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this.m105119x979267ad(c26716x46bbe528.f56470xb52fc261);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.TAG, e17, "", new java.lang.Object[0]);
                    }
                } else if (m105064x89fda97d == 1) {
                    com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e c26714xd01f052e2 = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this;
                    c26714xd01f052e2.m105118x729383af(c26714xd01f052e2.f56428x61dc691a, c26716x46bbe528.f56470xb52fc261);
                } else if (m105064x89fda97d == 2) {
                    com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e c26714xd01f052e3 = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this;
                    c26714xd01f052e3.m105118x729383af(c26714xd01f052e3.f56428x61dc691a, c26716x46bbe528.f56470xb52fc261);
                }
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.TAG, e18, "", new java.lang.Object[0]);
            }
        }
    };

    /* renamed from: mDownloadSDKListener */
    protected com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5 f56427xe9fcfb9 = new com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5() { // from class: com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.9
        @Override // com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5
        /* renamed from: OnDownloadSDKTaskProgressChanged */
        public void mo104814x3a76d16f(com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18 c26657x9422ab18, java.lang.String str, long j17, long j18) {
            android.os.Message message = new android.os.Message();
            message.what = 1;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("receiveDataLen", j17);
            bundle.putLong("totalDataLen", j18);
            message.setData(bundle);
            com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this.f56430x838d5ea9.mo50308x2936bf5f(message);
        }

        @Override // com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5
        /* renamed from: OnDownloadSDKTaskStateChanged */
        public void mo104815xdbc24c3b(final com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18 c26657x9422ab18, final java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17, boolean z18) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.TAG, "OnDownloadSDKTaskStateChanged client:" + c26657x9422ab18 + " | state:" + i17 + " | errorcode:" + i18 + " | errorMsg:" + str2);
            if (c26657x9422ab18 == null || android.text.TextUtils.isEmpty(str)) {
                return;
            }
            if (4 == i17) {
                com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this.f56433x77814ab6.mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.9.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            java.lang.String str3 = c26657x9422ab18.m104830xc45041ae(str).f56061xa9723acf;
                            if (android.text.TextUtils.isEmpty(str3)) {
                                return;
                            }
                            android.os.Message message = new android.os.Message();
                            message.what = 0;
                            message.obj = str3;
                            com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this.f56430x838d5ea9.mo50308x2936bf5f(message);
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.TAG, e17, "", new java.lang.Object[0]);
                        }
                    }
                });
            } else if (5 == i17) {
                android.os.Message message = new android.os.Message();
                message.what = 3;
                com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this.f56430x838d5ea9.mo50308x2936bf5f(message);
            }
        }

        @Override // com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5
        /* renamed from: OnDwonloadSDKServiceInvalid */
        public void mo104816x50d9dc65(com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18 c26657x9422ab18) {
        }
    };

    private C26714xd01f052e(android.content.Context context) {
        this.f56426xd6cfe882 = null;
        this.f56426xd6cfe882 = context;
    }

    /* renamed from: about */
    public static java.lang.String m105098x585238d() {
        return "TMOpenSDKToMsdkManager_2014_04_01_19_51_release_25434";
    }

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e m105099x9cf0d20b(android.content.Context context) {
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e c26714xd01f052e;
        synchronized (com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.class) {
            if (f56418x46143c22 == null) {
                f56418x46143c22 = new com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e(context);
            }
            c26714xd01f052e = f56418x46143c22;
        }
        return c26714xd01f052e;
    }

    /* renamed from: continueDownload */
    public void m105100xf1dec24f() {
        this.f56433x77814ab6.mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300 m104830xc45041ae = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this.m105101x142a16c1().m104830xc45041ae(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this.f56428x61dc691a);
                    if (m104830xc45041ae != null) {
                        int i17 = m104830xc45041ae.f56062xbec81024;
                        if (i17 == 3) {
                            android.os.Message message = new android.os.Message();
                            message.what = 6;
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putLong("receiveDataLen", m104830xc45041ae.f56060xabd4db75);
                            bundle.putLong("totalDataLen", m104830xc45041ae.f56063xeaf8334);
                            message.setData(bundle);
                            com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this.f56430x838d5ea9.mo50308x2936bf5f(message);
                        } else if (i17 == 4) {
                            android.os.Message message2 = new android.os.Message();
                            message2.what = 0;
                            message2.arg1 = 1;
                            message2.obj = m104830xc45041ae.f56061xa9723acf;
                            com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this.f56430x838d5ea9.mo50308x2936bf5f(message2);
                        }
                    }
                    if (m104830xc45041ae == null || m104830xc45041ae.f56062xbec81024 != 4) {
                        com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26758x6c6ebd3e m104993x3623e6c2 = com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26687x41d13953.m104992x9cf0d20b().m104993x3623e6c2(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this.f56424xc6892b6);
                        m104993x3623e6c2.f56721x1e35c10f++;
                        com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26687x41d13953.m104992x9cf0d20b().m104969x86141d2d(m104993x3623e6c2);
                    } else {
                        com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26758x6c6ebd3e m104993x3623e6c22 = com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26687x41d13953.m104992x9cf0d20b().m104993x3623e6c2(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this.f56424xc6892b6);
                        m104993x3623e6c22.f56726xa38e695c++;
                        com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26687x41d13953.m104992x9cf0d20b().m104969x86141d2d(m104993x3623e6c22);
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.TAG, e17, "", new java.lang.Object[0]);
                }
            }
        });
    }

    /* renamed from: getClient */
    public com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18 m105101x142a16c1() {
        android.content.Context context = this.f56426xd6cfe882;
        if (context == null) {
            return null;
        }
        com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18 c26657x9422ab18 = this.f56425xfe7f1a98;
        if (c26657x9422ab18 != null) {
            return c26657x9422ab18;
        }
        com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18 m104845xe4a9fc47 = com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26659xeeb04200.m104843x9cf0d20b(context).m104845xe4a9fc47(f56417x77b96a7f);
        m104845xe4a9fc47.m104832xe98e4d44(this.f56427xe9fcfb9);
        this.f56425xfe7f1a98 = m104845xe4a9fc47;
        return m104845xe4a9fc47;
    }

    /* renamed from: getUserAuthorizedInfo */
    public void m105102xf295a38a(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26712xd27f11a0 c26712xd27f11a0, android.content.Context context) {
        if (context != null) {
            this.f56426xd6cfe882 = context;
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "getUserAuthorizedInfo method called!");
        this.f56421xe6f83a83 = false;
        com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e.C26690x18e802b6 c26690x18e802b6 = this.f56429x1e4a6a3a;
        if (c26690x18e802b6 != null) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "mHttpRequest != null, request didn't finish!");
            return;
        }
        if (c26712xd27f11a0 == null) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "AuthorizedInfo object is null!");
            return;
        }
        this.f56424xc6892b6 = c26712xd27f11a0;
        if (c26690x18e802b6 == null) {
            this.f56419xb18b27b6 = 1;
            com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e.C26690x18e802b6 c26690x18e802b62 = new com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e.C26690x18e802b6();
            this.f56429x1e4a6a3a = c26690x18e802b62;
            c26690x18e802b62.m105001x131d2432(this.f56432xba3c4c36);
            this.f56429x1e4a6a3a.m105000x319ab1e7(c26712xd27f11a0);
        }
    }

    /* renamed from: handleDownloadContinue */
    public void m105103x90eeb397(long j17, long j18) {
        android.content.Context context = this.f56426xd6cfe882;
        if (context == null) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "handleDownloading context = null!");
            return;
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.Res res = new com.p314xaae8f345.p3085x8ea91595.p3105x36f002.Res(context);
        java.lang.String string = this.f56426xd6cfe882.getString(res.m105529xcad56011("white_list_positive_continue"));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
        float f17 = (float) j18;
        sb6.append((int) ((((float) (100 * j17)) + 0.0f) / f17));
        sb6.append("%)");
        java.lang.String sb7 = sb6.toString();
        this.f56420xb099fd48.f56461x421afdd5.setText(string + sb7);
        android.widget.ProgressBar progressBar = this.f56420xb099fd48.f56460xdd1330fe;
        progressBar.setProgress((int) (((((float) j17) + 0.0f) / f17) * ((float) progressBar.getMax())));
        if (this.f56420xb099fd48.f56460xdd1330fe.getProgress() > 0) {
            this.f56420xb099fd48.m105130xf12f0e34(res.m105527xcebc809e("com_tencent_tmassistant_sdk_button_bg"));
        }
    }

    /* renamed from: handleDownloadFailed */
    public void m105104x70e9172d() {
        android.content.Context context = this.f56426xd6cfe882;
        if (context == null) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "handleDownloading context = null!");
            return;
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.Res res = new com.p314xaae8f345.p3085x8ea91595.p3105x36f002.Res(context);
        this.f56420xb099fd48.m105132x9179cc4(true);
        this.f56420xb099fd48.f56461x421afdd5.setText(this.f56426xd6cfe882.getString(res.m105529xcad56011("white_list_positive_retry")));
        if (this.f56420xb099fd48.f56460xdd1330fe.getProgress() > 0) {
            this.f56420xb099fd48.m105130xf12f0e34(res.m105527xcebc809e("com_tencent_tmassistant_sdk_button_bg"));
        }
    }

    /* renamed from: handleDownloading */
    public void m105105xd7c7f312(long j17, long j18) {
        android.content.Context context = this.f56426xd6cfe882;
        if (context == null) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "handleDownloading context = null!");
            return;
        }
        java.lang.String string = this.f56426xd6cfe882.getString(new com.p314xaae8f345.p3085x8ea91595.p3105x36f002.Res(context).m105529xcad56011("white_list_positive_downloading"));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
        float f17 = (float) j18;
        sb6.append((int) ((((float) (100 * j17)) + 0.0f) / f17));
        sb6.append("%)");
        java.lang.String sb7 = sb6.toString();
        this.f56420xb099fd48.f56461x421afdd5.setText(string + sb7);
        android.widget.ProgressBar progressBar = this.f56420xb099fd48.f56460xdd1330fe;
        progressBar.setProgress((int) (((((float) j17) + 0.0f) / f17) * ((float) progressBar.getMax())));
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "handleDownloading : receivedlen:" + j17 + " | totalLen:" + j18);
    }

    /* renamed from: handleInstall */
    public void m105106x971b9253(java.lang.String str, int i17) {
        android.content.Context context = this.f56426xd6cfe882;
        if (context == null) {
            return;
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.Res res = new com.p314xaae8f345.p3085x8ea91595.p3105x36f002.Res(context);
        this.f56420xb099fd48.m105132x9179cc4(true);
        this.f56420xb099fd48.f56461x421afdd5.setText(this.f56426xd6cfe882.getString(res.m105529xcad56011("white_list_positive_install")));
        android.content.Context context2 = this.f56426xd6cfe882;
        if (context2 == null) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "handleDownloading context = null!");
            return;
        }
        this.f56423x9aa0f0a3 = true;
        if (i17 == 1) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.n1.d(context2, str, null, false);
    }

    /* renamed from: initOpenSDK */
    public void m105107x3635e60(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.InterfaceC26711x59173cea interfaceC26711x59173cea) {
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26705xc6716f42 m105059x9cf0d20b = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26705xc6716f42.m105059x9cf0d20b();
        this.f56431x52cdb063 = m105059x9cf0d20b;
        m105059x9cf0d20b.mo105024x5473474b(this.f56426xd6cfe882);
        this.f56436xb68f0069 = interfaceC26711x59173cea;
        this.f56440xa21b0369 = new com.p314xaae8f345.p3085x8ea91595.p3087x2c0b7d03.C26648x84b129ae();
        this.f56433x77814ab6 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("OpenSDKToMsdkManager");
        this.f56430x838d5ea9 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper(), new com.p314xaae8f345.mm.sdk.p2603x2137b148.k3() { // from class: com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(android.os.Message message) {
                android.os.Bundle data;
                int i17 = message.what;
                if (i17 == 0) {
                    com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this.m105106x971b9253(message.obj.toString(), message.arg1);
                    return false;
                }
                if (i17 == 1) {
                    android.os.Bundle data2 = message.getData();
                    if (data2 == null) {
                        return false;
                    }
                    com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this.m105105xd7c7f312(data2.getLong("receiveDataLen"), data2.getLong("totalDataLen"));
                    return false;
                }
                if (i17 == 3) {
                    com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this.m105104x70e9172d();
                    return false;
                }
                if (i17 == 4) {
                    com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3098x2eefaa.C26717x4b1e0db8 c26717x4b1e0db8 = (com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3098x2eefaa.C26717x4b1e0db8) message.obj;
                    if (c26717x4b1e0db8 == null) {
                        return false;
                    }
                    com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this.m105113x1b1087e2(c26717x4b1e0db8);
                    return false;
                }
                if (i17 == 5) {
                    com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this.m105112xd0d3547e(((java.lang.Integer) message.obj).intValue());
                    return false;
                }
                if (i17 != 6 || (data = message.getData()) == null) {
                    return false;
                }
                com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this.m105103x90eeb397(data.getLong("receiveDataLen"), data.getLong("totalDataLen"));
                return false;
            }
        });
    }

    /* renamed from: isExitsAction */
    public boolean m105108x6b70e21(long j17) {
        com.p314xaae8f345.p3085x8ea91595.p3087x2c0b7d03.C26648x84b129ae c26648x84b129ae;
        if (j17 < 0 || (c26648x84b129ae = this.f56440xa21b0369) == null) {
            return false;
        }
        java.util.Iterator<com.p314xaae8f345.p3085x8ea91595.p3087x2c0b7d03.C26649x6e73f9ab> it = c26648x84b129ae.m104809x30842988().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p3085x8ea91595.p3087x2c0b7d03.C26649x6e73f9ab next = it.next();
            if (next.f55971x7e499b89 == j17 && next.f55973x5fe5d57e - next.f55974x1dda0005 <= 300000) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: notifyAuthorizedFinished */
    public void m105109xfb33c256(boolean z17, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26712xd27f11a0 c26712xd27f11a0) {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "before realy notifyAuthorizedFinished: TMOpenSDKAuthorizedInfo:" + this.f56424xc6892b6);
        if (this.f56436xb68f0069 == null) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "before notifyAuthorizedFinished: mToMsdkListener = null !");
        }
        if (this.f56436xb68f0069 == null || this.f56424xc6892b6 == null) {
            return;
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "notifyAuthorizedFinished: result:" + z17);
        this.f56436xb68f0069.m105097xb60fff6c(z17, this.f56424xc6892b6);
        this.f56429x1e4a6a3a = null;
        this.f56421xe6f83a83 = true;
    }

    /* renamed from: onDestroy */
    public void m105110xac79a11b() {
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3097xac8f1cfd.DialogC26715xfebdfad9 dialogC26715xfebdfad9 = this.f56420xb099fd48;
        if (dialogC26715xfebdfad9 != null && dialogC26715xfebdfad9.isShowing()) {
            this.f56420xb099fd48.dismiss();
        }
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26705xc6716f42 c26705xc6716f42 = this.f56431x52cdb063;
        if (c26705xc6716f42 != null) {
            c26705xc6716f42.mo105018x8510c021();
        }
        this.f56436xb68f0069 = null;
        this.f56421xe6f83a83 = false;
        this.f56423x9aa0f0a3 = false;
        this.f56419xb18b27b6 = 0;
        this.f56429x1e4a6a3a = null;
        this.f56424xc6892b6 = null;
        this.f56440xa21b0369 = null;
        this.f56422xec262fca = -1L;
        android.content.Context context = this.f56426xd6cfe882;
        if (context != null) {
            com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26659xeeb04200.m104842xe742a1ec(context);
        }
        this.f56425xfe7f1a98 = null;
    }

    /* renamed from: onNetworkException */
    public void m105111xd7faddc0(int i17) {
        android.content.Context context = this.f56426xd6cfe882;
        if (context == null) {
            return;
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.Res res = new com.p314xaae8f345.p3085x8ea91595.p3105x36f002.Res(context);
        java.lang.String string = 1 == i17 ? this.f56426xd6cfe882.getString(res.m105529xcad56011("white_list_network_not_connected")) : this.f56426xd6cfe882.getString(res.m105529xcad56011("white_list_network_error"));
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3098x2eefaa.C26718x8de73426 c26718x8de73426 = new com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3098x2eefaa.C26718x8de73426();
        c26718x8de73426.f56480x6942258 = this.f56426xd6cfe882.getString(res.m105529xcad56011("white_list_dlg_title"));
        c26718x8de73426.f56479x38b73479 = string;
        java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3098x2eefaa.C26716x46bbe528> arrayList = new java.util.ArrayList<>();
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3098x2eefaa.C26716x46bbe528 c26716x46bbe528 = new com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3098x2eefaa.C26716x46bbe528();
        c26716x46bbe528.f56469xf0c83088 = 3;
        arrayList.add(c26716x46bbe528);
        java.lang.String string2 = this.f56426xd6cfe882.getString(res.m105529xcad56011("white_list_negtive_known"));
        c26716x46bbe528.f56471x121d94cd = string2;
        c26716x46bbe528.f56472x870fd994 = string2;
        c26718x8de73426.f56478x3cf09108 = arrayList;
        m105117x1471d2a5(c26718x8de73426);
        this.f56429x1e4a6a3a = null;
        this.f56428x61dc691a = "";
        this.f56419xb18b27b6 = 3;
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "network error happened!");
        com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26758x6c6ebd3e m104993x3623e6c2 = com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26687x41d13953.m104992x9cf0d20b().m104993x3623e6c2(this.f56424xc6892b6);
        m104993x3623e6c2.f56727x63ae255d++;
        com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26687x41d13953.m104992x9cf0d20b().m104969x86141d2d(m104993x3623e6c2);
    }

    /* renamed from: onNetworkFinishedFailed */
    public void m105112xd0d3547e(int i17) {
        if (i17 == 606 || i17 == 602 || i17 == 601 || i17 == 704) {
            m105115x3de48c6d(i17);
        } else {
            m105111xd7faddc0(i17);
        }
    }

    /* renamed from: onNetworkFinishedSuccess */
    public void m105113x1b1087e2(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3098x2eefaa.C26717x4b1e0db8 c26717x4b1e0db8) {
        this.f56428x61dc691a = c26717x4b1e0db8.f56473xb7cf57c7;
        this.f56435x58c0eee3 = c26717x4b1e0db8.f56477x290b12e5;
        this.f56429x1e4a6a3a = null;
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "onNetworkFinishedSuccess! authorizedResult.hasAuthoried=" + c26717x4b1e0db8.f56475x1736dfe3 + "  listenner:" + this.f56436xb68f0069 + "  authroizedinfo:" + this.f56424xc6892b6);
        if (c26717x4b1e0db8.f56475x1736dfe3 == 1) {
            this.f56419xb18b27b6 = 2;
            com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3098x2eefaa.C26718x8de73426 c26718x8de73426 = c26717x4b1e0db8.f56476x8a0cd006;
            if (c26718x8de73426 != null) {
                m105117x1471d2a5(c26718x8de73426);
                return;
            } else {
                m105109xfb33c256(true, this.f56424xc6892b6);
                return;
            }
        }
        this.f56419xb18b27b6 = 3;
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3098x2eefaa.C26718x8de73426 c26718x8de734262 = c26717x4b1e0db8.f56476x8a0cd006;
        if (c26718x8de734262 != null) {
            m105117x1471d2a5(c26718x8de734262);
        } else {
            m105115x3de48c6d(c26717x4b1e0db8.f56474x139cb015);
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "not in white list and no tips!");
        }
    }

    /* renamed from: onResume */
    public void m105114x57429eec() {
        int i17;
        android.content.Context context;
        m105120xe82511ea();
        if (this.f56421xe6f83a83 || (i17 = this.f56419xb18b27b6) == 2) {
            return;
        }
        if ((i17 == 3 || i17 == 0) && (context = this.f56426xd6cfe882) != null) {
            m105102xf295a38a(this.f56424xc6892b6, context);
        }
    }

    /* renamed from: onServerException */
    public void m105115x3de48c6d(int i17) {
        android.content.Context context = this.f56426xd6cfe882;
        if (context == null) {
            return;
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.Res res = new com.p314xaae8f345.p3085x8ea91595.p3105x36f002.Res(context);
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3098x2eefaa.C26718x8de73426 c26718x8de73426 = new com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3098x2eefaa.C26718x8de73426();
        c26718x8de73426.f56480x6942258 = this.f56426xd6cfe882.getString(res.m105529xcad56011("white_list_dlg_title"));
        if (i17 == 602 || i17 == 601) {
            c26718x8de73426.f56479x38b73479 = this.f56426xd6cfe882.getString(res.m105529xcad56011("white_list_network_error"));
        } else {
            c26718x8de73426.f56479x38b73479 = this.f56426xd6cfe882.getString(res.m105529xcad56011("white_list_server_error"));
        }
        java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3098x2eefaa.C26716x46bbe528> arrayList = new java.util.ArrayList<>();
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3098x2eefaa.C26716x46bbe528 c26716x46bbe528 = new com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3098x2eefaa.C26716x46bbe528();
        c26716x46bbe528.f56469xf0c83088 = 4;
        java.lang.String string = this.f56426xd6cfe882.getString(res.m105529xcad56011("white_list_positive_retry_again"));
        c26716x46bbe528.f56471x121d94cd = string;
        c26716x46bbe528.f56472x870fd994 = string;
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3098x2eefaa.C26716x46bbe528 c26716x46bbe5282 = new com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3098x2eefaa.C26716x46bbe528();
        c26716x46bbe5282.f56469xf0c83088 = 3;
        java.lang.String string2 = this.f56426xd6cfe882.getString(res.m105529xcad56011("white_list_negtive"));
        c26716x46bbe5282.f56471x121d94cd = string2;
        c26716x46bbe5282.f56472x870fd994 = string2;
        arrayList.add(c26716x46bbe528);
        arrayList.add(c26716x46bbe5282);
        c26718x8de73426.f56478x3cf09108 = arrayList;
        m105117x1471d2a5(c26718x8de73426);
        this.f56429x1e4a6a3a = null;
        this.f56428x61dc691a = "";
        this.f56419xb18b27b6 = 3;
        com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26758x6c6ebd3e m104993x3623e6c2 = com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26687x41d13953.m104992x9cf0d20b().m104993x3623e6c2(this.f56424xc6892b6);
        m104993x3623e6c2.f56727x63ae255d++;
        com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26687x41d13953.m104992x9cf0d20b().m104969x86141d2d(m104993x3623e6c2);
    }

    /* renamed from: pauseDownloadTask */
    public void m105116xb0172743(final java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) || this.f56424xc6892b6 == null) {
            return;
        }
        this.f56433x77814ab6.mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.8
            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18 m105101x142a16c1 = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this.m105101x142a16c1();
                try {
                    if (m105101x142a16c1.m104830xc45041ae(str) != null) {
                        m105101x142a16c1.m104831xb0172743(str);
                    } else {
                        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.TAG, "getDownloadTaskState taskinfo is null!");
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.TAG, e17, "", new java.lang.Object[0]);
                }
            }
        });
    }

    /* renamed from: showDialog */
    public void m105117x1471d2a5(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3098x2eefaa.C26718x8de73426 c26718x8de73426) {
        java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3098x2eefaa.C26716x46bbe528> arrayList;
        if (this.f56426xd6cfe882 == null) {
            return;
        }
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3097xac8f1cfd.DialogC26715xfebdfad9 dialogC26715xfebdfad9 = this.f56420xb099fd48;
        if (dialogC26715xfebdfad9 == null || !dialogC26715xfebdfad9.isShowing()) {
            android.content.Context context = this.f56426xd6cfe882;
            if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
                com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "context is finishing!  context" + this.f56426xd6cfe882);
                return;
            }
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.Res res = new com.p314xaae8f345.p3085x8ea91595.p3105x36f002.Res(this.f56426xd6cfe882);
            if (c26718x8de73426 == null || (arrayList = c26718x8de73426.f56478x3cf09108) == null || arrayList.size() <= 0) {
                return;
            }
            com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3097xac8f1cfd.DialogC26715xfebdfad9 dialogC26715xfebdfad92 = new com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3097xac8f1cfd.DialogC26715xfebdfad9(this.f56426xd6cfe882, res.m105530x68b1db1("while_list_dialog"), arrayList.size());
            this.f56420xb099fd48 = dialogC26715xfebdfad92;
            dialogC26715xfebdfad92.show();
            this.f56420xb099fd48.m105135x53bfe316(c26718x8de73426.f56480x6942258);
            this.f56420xb099fd48.m105127xe9f5bdb7(c26718x8de73426.f56479x38b73479);
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3098x2eefaa.C26716x46bbe528 c26716x46bbe528 = arrayList.get(i17);
                int i18 = c26716x46bbe528.f56469xf0c83088;
                if (i18 == 3) {
                    this.f56420xb099fd48.m105129x21ad6af2(c26716x46bbe528.f56471x121d94cd);
                    this.f56420xb099fd48.m105128x80c96e37(this.f56437x339fb44d);
                } else if (i18 == 4) {
                    this.f56420xb099fd48.m105134x13bf98ae(c26716x46bbe528.f56472x870fd994);
                    this.f56420xb099fd48.m105131x11c8f3fb(this.f56439x36115768);
                } else {
                    try {
                        int m105064x89fda97d = this.f56431x52cdb063.m105064x89fda97d(this.f56435x58c0eee3);
                        if (m105064x89fda97d == 0) {
                            this.f56420xb099fd48.m105134x13bf98ae(c26716x46bbe528.f56471x121d94cd);
                            com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26758x6c6ebd3e m104993x3623e6c2 = com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26687x41d13953.m104992x9cf0d20b().m104993x3623e6c2(this.f56424xc6892b6);
                            m104993x3623e6c2.f56718x5759995c++;
                            com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26687x41d13953.m104992x9cf0d20b().m104969x86141d2d(m104993x3623e6c2);
                        } else if (m105064x89fda97d == 1) {
                            this.f56420xb099fd48.m105134x13bf98ae(c26716x46bbe528.f56472x870fd994);
                            m105100xf1dec24f();
                        } else if (m105064x89fda97d == 2) {
                            this.f56420xb099fd48.m105134x13bf98ae(this.f56426xd6cfe882.getString(res.m105529xcad56011("white_list_positive_update")));
                            m105100xf1dec24f();
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
                    }
                    this.f56420xb099fd48.m105133x322f77f9(c26716x46bbe528);
                    this.f56420xb099fd48.m105131x11c8f3fb(this.f56438x6989d377);
                }
            }
        }
    }

    /* renamed from: startDownloadTask */
    public void m105118x729383af(final java.lang.String str, final java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.f56420xb099fd48.m105132x9179cc4(false);
        this.f56433x77814ab6.mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.7
            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e c26714xd01f052e = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this;
                if (c26714xd01f052e.f56426xd6cfe882 != null && c26714xd01f052e.f56431x52cdb063 != null && !android.text.TextUtils.isEmpty(str2)) {
                    com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e c26714xd01f052e2 = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this;
                    c26714xd01f052e2.f56422xec262fca = c26714xd01f052e2.f56431x52cdb063.m105063x3a11b091(str2);
                }
                com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18 m105101x142a16c1 = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this.m105101x142a16c1();
                if (m105101x142a16c1 == null) {
                    return;
                }
                try {
                    int m104833x729383af = m105101x142a16c1.m104833x729383af(str, "application/vnd.android.package-archive");
                    if (4 == m104833x729383af) {
                        java.lang.String str3 = m105101x142a16c1.m104830xc45041ae(str).f56061xa9723acf;
                        android.os.Message message = new android.os.Message();
                        message.what = 0;
                        message.obj = str3;
                        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this.f56430x838d5ea9.mo50308x2936bf5f(message);
                    } else if (m104833x729383af == 0) {
                        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.TAG, "start success!");
                    } else if (1 == m104833x729383af) {
                        android.os.Message message2 = new android.os.Message();
                        message2.what = 5;
                        message2.obj = 1;
                        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this.f56430x838d5ea9.mo50308x2936bf5f(message2);
                    } else {
                        android.os.Message message3 = new android.os.Message();
                        message3.what = 3;
                        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this.f56430x838d5ea9.mo50308x2936bf5f(message3);
                    }
                    if (m104833x729383af == 4) {
                        com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26758x6c6ebd3e m104993x3623e6c2 = com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26687x41d13953.m104992x9cf0d20b().m104993x3623e6c2(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this.f56424xc6892b6);
                        m104993x3623e6c2.f56725x21012608++;
                        com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26687x41d13953.m104992x9cf0d20b().m104969x86141d2d(m104993x3623e6c2);
                    } else {
                        com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26758x6c6ebd3e m104993x3623e6c22 = com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26687x41d13953.m104992x9cf0d20b().m104993x3623e6c2(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.this.f56424xc6892b6);
                        m104993x3623e6c22.f56720xc3ff6c3b++;
                        com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26687x41d13953.m104992x9cf0d20b().m104969x86141d2d(m104993x3623e6c22);
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26714xd01f052e.TAG, e17, "", new java.lang.Object[0]);
                }
            }
        });
    }

    /* renamed from: startToQQDownloaderAuthorized */
    public void m105119x979267ad(java.lang.String str) {
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26705xc6716f42 c26705xc6716f42;
        if (this.f56420xb099fd48.isShowing()) {
            this.f56420xb099fd48.dismiss();
        }
        this.f56429x1e4a6a3a = null;
        this.f56423x9aa0f0a3 = false;
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26758x6c6ebd3e m104993x3623e6c2 = com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26687x41d13953.m104992x9cf0d20b().m104993x3623e6c2(this.f56424xc6892b6);
        m104993x3623e6c2.f56717x9bb45608++;
        com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26687x41d13953.m104992x9cf0d20b().m104969x86141d2d(m104993x3623e6c2);
        android.content.Context context = this.f56426xd6cfe882;
        if (context == null || (c26705xc6716f42 = this.f56431x52cdb063) == null) {
            return;
        }
        c26705xc6716f42.m105067x597fd7f8(context, str);
    }

    /* renamed from: tryToCloseDialog */
    public void m105120xe82511ea() {
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26705xc6716f42 c26705xc6716f42 = this.f56431x52cdb063;
        if (c26705xc6716f42 == null || this.f56426xd6cfe882 == null) {
            return;
        }
        try {
            int m105064x89fda97d = c26705xc6716f42.m105064x89fda97d(this.f56435x58c0eee3);
            if (this.f56423x9aa0f0a3 && m105064x89fda97d == 0) {
                this.f56429x1e4a6a3a = null;
                this.f56423x9aa0f0a3 = false;
                this.f56428x61dc691a = null;
                if (this.f56420xb099fd48.isShowing()) {
                    this.f56420xb099fd48.dismiss();
                }
                com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26659xeeb04200.m104842xe742a1ec(this.f56426xd6cfe882);
                this.f56425xfe7f1a98 = null;
                if (m105108x6b70e21(this.f56422xec262fca)) {
                    this.f56431x52cdb063.m105065xa29bd2d7(this.f56426xd6cfe882);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
        }
    }
}
