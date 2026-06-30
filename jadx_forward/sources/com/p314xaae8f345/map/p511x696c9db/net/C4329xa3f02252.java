package com.p314xaae8f345.map.p511x696c9db.net;

/* renamed from: com.tencent.map.tools.net.NetRequest */
/* loaded from: classes13.dex */
public class C4329xa3f02252 {

    /* renamed from: canceler */
    public com.p314xaae8f345.map.p511x696c9db.net.p516x310888.C4342x2d523d6f f16953xf8a884a7;

    /* renamed from: mCacheFile */
    private java.io.File f16954x59b1d231;

    /* renamed from: mIsLogEnable */
    private boolean f16956x4c678530;

    /* renamed from: mNetAdapter */
    private com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4325x1e0dd312 f16957x836def3f;

    /* renamed from: mNetFlowProcessorClz */
    private java.util.HashSet<java.lang.Class<? extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.md>> f16958x4a5abd9d;

    /* renamed from: mNetFlowRules */
    private java.util.HashMap<java.lang.String, java.lang.String> f16959x72bff459;

    /* renamed from: mNetMethod */
    public com.p314xaae8f345.map.p511x696c9db.net.EnumC4328xaa2e1cbe f16960xad7346f1;

    /* renamed from: mProxyRules */
    private java.util.List<com.p314xaae8f345.map.p511x696c9db.net.p516x310888.C4345x442d4ec2> f16961x6c8fdb76;

    /* renamed from: mRegionHostList */
    private java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> f16962x729b6747;

    /* renamed from: mSecretKey */
    private java.lang.String f16965x4ea263a2;

    /* renamed from: postData */
    public byte[] f16967x2d17ac6a;

    /* renamed from: proxy */
    public com.p314xaae8f345.map.p511x696c9db.net.p516x310888.C4344x815606a6 f16969x65fca6e;

    /* renamed from: retryMethod */
    public int f16971xaa1641a9;

    /* renamed from: timeout */
    public int f16972xb1af4d61;
    public java.lang.String url;

    /* renamed from: mRequestId */
    public final long f16964xa413de1d = java.lang.System.nanoTime();

    /* renamed from: mapHeaders */
    public final java.util.Map<java.lang.String, java.lang.String> f16966x3656e28a = new java.util.HashMap();

    /* renamed from: respHeaders */
    public final java.util.Set<java.lang.String> f16970x4eb2c196 = new java.util.HashSet();

    /* renamed from: processors */
    public final java.util.List<com.p314xaae8f345.map.p511x696c9db.net.p517xbebf4c92.InterfaceC4348x36316c72> f16968x192a4621 = new java.util.ArrayList();

    /* renamed from: mForceHttps */
    private boolean f16955xe2f6a10d = true;

    /* renamed from: mRegionName */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329.RegionName f16963x658a73ec = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329.RegionName.EARTH;

    /* renamed from: com.tencent.map.tools.net.NetRequest$NetRequestBuilder */
    /* loaded from: classes13.dex */
    public static class NetRequestBuilder {

        /* renamed from: mNetRequest */
        private final com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 f16973x9503e7f;

        public NetRequestBuilder(com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4325x1e0dd312 interfaceC4325x1e0dd312, java.lang.String str, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329 c26051xb5982329) {
            this(interfaceC4325x1e0dd312, str, c26051xb5982329, null);
        }

        /* renamed from: onRequestFinish */
        private com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m35991x6fe9e863(com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde c4330xdd3bdcde) {
            java.io.FileOutputStream fileOutputStream;
            if (c4330xdd3bdcde == null) {
                com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde c4330xdd3bdcde2 = new com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde(this.f16973x9503e7f);
                c4330xdd3bdcde2.f16979x139cb015 = -100;
                c4330xdd3bdcde2.f16980x139cf1d2 = "未知".getBytes();
                return c4330xdd3bdcde2;
            }
            java.io.File file = this.f16973x9503e7f.f16954x59b1d231;
            if (file != null) {
                java.io.FileOutputStream fileOutputStream2 = null;
                try {
                    try {
                        if (file.isFile()) {
                            if (file.exists()) {
                                file.delete();
                            }
                            file.getParentFile().mkdirs();
                            file.createNewFile();
                        }
                        fileOutputStream = new java.io.FileOutputStream(file);
                    } catch (java.lang.Exception e17) {
                        e = e17;
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                }
                try {
                    com.p314xaae8f345.map.p511x696c9db.net.C4332xd10a8f1f.m36042xe4e1b7fc(c4330xdd3bdcde.f16977x2eefaa, fileOutputStream);
                    com.p314xaae8f345.map.p511x696c9db.net.C4332xd10a8f1f.m36039xbb07de6b(fileOutputStream);
                } catch (java.lang.Exception e18) {
                    e = e18;
                    fileOutputStream2 = fileOutputStream;
                    com.p314xaae8f345.map.p511x696c9db.net.C4332xd10a8f1f.m36039xbb07de6b(fileOutputStream2);
                    c4330xdd3bdcde.m36019x584fd04f(e);
                    com.p314xaae8f345.map.p511x696c9db.net.C4332xd10a8f1f.m36039xbb07de6b(fileOutputStream2);
                    return c4330xdd3bdcde;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    fileOutputStream2 = fileOutputStream;
                    com.p314xaae8f345.map.p511x696c9db.net.C4332xd10a8f1f.m36039xbb07de6b(fileOutputStream2);
                    throw th;
                }
            }
            return c4330xdd3bdcde;
        }

        /* renamed from: onRequestStart */
        private void m35992xc247ae92(java.lang.String str, com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252.NetRequestBuilder netRequestBuilder) {
            netRequestBuilder.m35993xb68718f1(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mh(this.f16973x9503e7f.f16956x4c678530));
            netRequestBuilder.m35993xb68718f1(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mf.a(this.f16973x9503e7f.f16955xe2f6a10d));
            netRequestBuilder.m35993xb68718f1(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mg.a(this.f16973x9503e7f.f16961x6c8fdb76));
            netRequestBuilder.m35993xb68718f1(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mk.a(this.f16973x9503e7f.f16965x4ea263a2));
            netRequestBuilder.m35993xb68718f1(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mj(this.f16973x9503e7f.f16962x729b6747));
            if (this.f16973x9503e7f.f16961x6c8fdb76 == null || this.f16973x9503e7f.f16961x6c8fdb76.size() <= 0) {
                java.util.Iterator it = this.f16973x9503e7f.f16958x4a5abd9d.iterator();
                while (it.hasNext()) {
                    try {
                        netRequestBuilder.m35993xb68718f1((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.md) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hp.a((java.lang.Class) it.next(), this.f16973x9503e7f.f16959x72bff459));
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
        }

        /* renamed from: addProcessor */
        public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252.NetRequestBuilder m35993xb68718f1(com.p314xaae8f345.map.p511x696c9db.net.p517xbebf4c92.InterfaceC4348x36316c72 interfaceC4348x36316c72) {
            this.f16973x9503e7f.m35975xb68718f1(interfaceC4348x36316c72);
            return this;
        }

        /* renamed from: canceler */
        public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252.NetRequestBuilder m35994xf8a884a7(com.p314xaae8f345.map.p511x696c9db.net.p516x310888.C4342x2d523d6f c4342x2d523d6f) {
            this.f16973x9503e7f.f16953xf8a884a7 = c4342x2d523d6f;
            return this;
        }

        /* renamed from: doGet */
        public com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m35995x5b4bacb() {
            m35992xc247ae92("doGet", this);
            return m35991x6fe9e863(this.f16973x9503e7f.m35971x5b4bacb());
        }

        /* renamed from: doPost */
        public com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m35996xb0e6dbcb() {
            m35992xc247ae92("doPost", this);
            return m35991x6fe9e863(this.f16973x9503e7f.m35972xb0e6dbcb());
        }

        /* renamed from: doRequest */
        public com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m35997x99e55b84() {
            m35992xc247ae92("doRequest", this);
            return m35991x6fe9e863(this.f16973x9503e7f.m35973x99e55b84());
        }

        /* renamed from: doStream */
        public com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m35998x180373eb() {
            m35992xc247ae92("doStream", this);
            return m35991x6fe9e863(this.f16973x9503e7f.m35974x180373eb());
        }

        /* renamed from: downloadTo */
        public com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m35999x798ad123(java.io.File file) {
            m35992xc247ae92("downloadTo[" + file + "]", this);
            return m36000x2ff57c(file).m35995x5b4bacb();
        }

        /* renamed from: file */
        public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252.NetRequestBuilder m36000x2ff57c(java.io.File file) {
            this.f16973x9503e7f.f16954x59b1d231 = file;
            return this;
        }

        /* renamed from: forceHttps */
        public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252.NetRequestBuilder m36001x6c4a8c0(boolean z17) {
            this.f16973x9503e7f.f16955xe2f6a10d = z17;
            return this;
        }

        /* renamed from: getNetRequest */
        public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 m36002x1b5efe28() {
            return this.f16973x9503e7f;
        }

        /* renamed from: gzip */
        public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252.NetRequestBuilder m36003x30a95a() {
            m36004xb734e28d("Accept-Encoding", "gzip");
            return this;
        }

        /* renamed from: header */
        public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252.NetRequestBuilder m36005xb734e28d(java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
            this.f16973x9503e7f.m35978x52bbe88c(hashMap);
            return this;
        }

        /* renamed from: nonce */
        public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252.NetRequestBuilder m36006x64237ef(java.lang.String str) {
            this.f16973x9503e7f.m35980x536df8ad(str);
            return this;
        }

        /* renamed from: postData */
        public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252.NetRequestBuilder m36007x2d17ac6a(byte[] bArr) {
            this.f16973x9503e7f.f16967x2d17ac6a = bArr;
            return this;
        }

        /* renamed from: proxy */
        public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252.NetRequestBuilder m36008x65fca6e(com.p314xaae8f345.map.p511x696c9db.net.p516x310888.C4344x815606a6 c4344x815606a6) {
            this.f16973x9503e7f.f16969x65fca6e = c4344x815606a6;
            return this;
        }

        /* renamed from: region */
        public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252.NetRequestBuilder m36009xc84826f4(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329.RegionName regionName) {
            this.f16973x9503e7f.f16963x658a73ec = regionName;
            return this;
        }

        /* renamed from: retryNum */
        public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252.NetRequestBuilder m36010xed8c2fbe(int i17) {
            this.f16973x9503e7f.f16971xaa1641a9 = i17;
            return this;
        }

        /* renamed from: startTag */
        public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252.NetRequestBuilder m36011x4e7c8fd8(java.lang.String str) {
            this.f16973x9503e7f.m35984x53b68520(str);
            return this;
        }

        /* renamed from: timeOut */
        public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252.NetRequestBuilder m36012xb1aed541(int i17) {
            this.f16973x9503e7f.f16972xb1af4d61 = i17;
            return this;
        }

        /* renamed from: timestamp */
        public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252.NetRequestBuilder m36013x3492916(java.lang.String str) {
            this.f16973x9503e7f.m35985x5d476ab4(str);
            return this;
        }

        /* renamed from: toString */
        public java.lang.String m36014x9616526c() {
            return "NetRequestBuilder{, mRequestId=" + this.f16973x9503e7f.f16964xa413de1d + ", mNetRequest=" + this.f16973x9503e7f + '}';
        }

        /* renamed from: token */
        public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252.NetRequestBuilder m36015x696b9f9(java.lang.String str) {
            this.f16973x9503e7f.m35987x53c27ab7(str);
            return this;
        }

        public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252.NetRequestBuilder url(java.lang.String str) {
            this.f16973x9503e7f.url = str;
            return this;
        }

        /* renamed from: userAgent */
        public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252.NetRequestBuilder m36016x12900dfa(java.lang.String str) {
            this.f16973x9503e7f.m35989x6e513fb8(str);
            return this;
        }

        public NetRequestBuilder(com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4325x1e0dd312 interfaceC4325x1e0dd312, java.lang.String str, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329 c26051xb5982329, com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 c4329xa3f02252) {
            if (c4329xa3f02252 == null) {
                this.f16973x9503e7f = new com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252().m35986x62edd69f(10000).m35983x1a51fbe7(1);
            } else {
                this.f16973x9503e7f = c4329xa3f02252;
            }
            this.f16973x9503e7f.f16957x836def3f = interfaceC4325x1e0dd312;
            this.f16973x9503e7f.f16965x4ea263a2 = str;
            this.f16973x9503e7f.f16961x6c8fdb76 = interfaceC4325x1e0dd312.mo35899xdb157a92();
            this.f16973x9503e7f.f16956x4c678530 = interfaceC4325x1e0dd312.mo35904xa25a73dd();
            this.f16973x9503e7f.f16958x4a5abd9d = interfaceC4325x1e0dd312.mo35897x2ada13dd();
            this.f16973x9503e7f.f16959x72bff459 = interfaceC4325x1e0dd312.mo35898xa497810f();
            this.f16973x9503e7f.f16962x729b6747 = interfaceC4325x1e0dd312.mo35900x5a802a70();
            if (c26051xb5982329 != null) {
                this.f16973x9503e7f.f16963x658a73ec = c26051xb5982329.f49527x89587b9f;
            }
        }

        /* renamed from: header */
        public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252.NetRequestBuilder m36004xb734e28d(java.lang.String str, java.lang.String str2) {
            this.f16973x9503e7f.m35977x52bbe88c(str, str2);
            return this;
        }
    }

    public C4329xa3f02252() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doGet */
    public com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m35971x5b4bacb() {
        m35979x8e7d2e9c(com.p314xaae8f345.map.p511x696c9db.net.EnumC4328xaa2e1cbe.GET);
        return this.f16957x836def3f.mo35896x99e55b84(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doPost */
    public com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m35972xb0e6dbcb() {
        m35979x8e7d2e9c(com.p314xaae8f345.map.p511x696c9db.net.EnumC4328xaa2e1cbe.POST);
        return this.f16957x836def3f.mo35896x99e55b84(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doRequest */
    public com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m35973x99e55b84() {
        return this.f16957x836def3f.mo35896x99e55b84(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doStream */
    public com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m35974x180373eb() {
        m35979x8e7d2e9c(com.p314xaae8f345.map.p511x696c9db.net.EnumC4328xaa2e1cbe.GET);
        return this.f16957x836def3f.mo35905x14c7026a(this);
    }

    /* renamed from: addProcessor */
    public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 m35975xb68718f1(com.p314xaae8f345.map.p511x696c9db.net.p517xbebf4c92.InterfaceC4348x36316c72 interfaceC4348x36316c72) {
        this.f16968x192a4621.add(interfaceC4348x36316c72);
        return this;
    }

    /* renamed from: setCanceler */
    public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 m35976x6f3b2329(com.p314xaae8f345.map.p511x696c9db.net.p516x310888.C4342x2d523d6f c4342x2d523d6f) {
        this.f16953xf8a884a7 = c4342x2d523d6f;
        return this;
    }

    /* renamed from: setMapHeaders */
    public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 m35978x52bbe88c(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map == null) {
            return this;
        }
        this.f16966x3656e28a.putAll(map);
        return this;
    }

    /* renamed from: setNetMethod */
    public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 m35979x8e7d2e9c(com.p314xaae8f345.map.p511x696c9db.net.EnumC4328xaa2e1cbe enumC4328xaa2e1cbe) {
        this.f16960xad7346f1 = enumC4328xaa2e1cbe;
        return this;
    }

    /* renamed from: setNonce */
    public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 m35980x536df8ad(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            this.f16966x3656e28a.put("nonce", str);
        }
        return this;
    }

    /* renamed from: setPostData */
    public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 m35981xa3aa4aec(byte[] bArr) {
        this.f16967x2d17ac6a = bArr;
        return this;
    }

    /* renamed from: setRespHeaders */
    public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 m35982xbeee7bd4(java.lang.String... strArr) {
        this.f16970x4eb2c196.addAll(java.util.Arrays.asList((java.lang.Object[]) strArr.clone()));
        return this;
    }

    /* renamed from: setRetryMethod */
    public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 m35983x1a51fbe7(int i17) {
        this.f16971xaa1641a9 = i17;
        return this;
    }

    /* renamed from: setStart */
    public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 m35984x53b68520(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            this.f16966x3656e28a.put("Range", "bytes=" + str + "-");
        }
        return this;
    }

    /* renamed from: setTimeStamp */
    public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 m35985x5d476ab4(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            this.f16966x3656e28a.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, str);
        }
        return this;
    }

    /* renamed from: setTimeout */
    public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 m35986x62edd69f(int i17) {
        this.f16972xb1af4d61 = i17;
        return this;
    }

    /* renamed from: setToken */
    public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 m35987x53c27ab7(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            this.f16966x3656e28a.put("Sign", str);
        }
        return this;
    }

    /* renamed from: setUrl */
    public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 m35988xca029dad(java.lang.String str) {
        this.url = str;
        return this;
    }

    /* renamed from: setUserAgent */
    public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 m35989x6e513fb8(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            this.f16966x3656e28a.put("User-Agent", str);
        }
        return this;
    }

    /* renamed from: toString */
    public java.lang.String m35990x9616526c() {
        return "NetRequest{mRequestId=" + this.f16964xa413de1d + ", mNetMethod=" + this.f16960xad7346f1 + ", url='" + this.url + "', postData=" + java.util.Arrays.toString(this.f16967x2d17ac6a) + ", retryMethod=" + this.f16971xaa1641a9 + ", mapHeaders=" + this.f16966x3656e28a + ", respHeaders=" + this.f16970x4eb2c196 + ", processorSet=" + this.f16968x192a4621 + ", canceler=" + this.f16953xf8a884a7 + ", timeout=" + this.f16972xb1af4d61 + ", proxy=" + this.f16969x65fca6e + '}';
    }

    /* renamed from: setMapHeaders */
    public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 m35977x52bbe88c(java.lang.String str, java.lang.String str2) {
        this.f16966x3656e28a.put(str, str2);
        return this;
    }

    public C4329xa3f02252(com.p314xaae8f345.map.p511x696c9db.net.EnumC4328xaa2e1cbe enumC4328xaa2e1cbe, java.lang.String str) {
        this.f16960xad7346f1 = enumC4328xaa2e1cbe;
        this.url = str;
    }
}
