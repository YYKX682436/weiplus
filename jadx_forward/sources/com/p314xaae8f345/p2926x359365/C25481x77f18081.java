package com.p314xaae8f345.p2926x359365;

/* renamed from: com.tencent.rtmp.TXLiveBase */
/* loaded from: classes16.dex */
public class C25481x77f18081 {
    private static final java.lang.String TAG = "TXLiveBase";

    /* renamed from: instance */
    private static com.p314xaae8f345.p2926x359365.C25481x77f18081 f46254x21169495 = new com.p314xaae8f345.p2926x359365.C25481x77f18081();

    /* renamed from: networkTimeCallback */
    private static com.p314xaae8f345.p2926x359365.C25481x77f18081.b f46255xa4289380 = new com.p314xaae8f345.p2926x359365.C25481x77f18081.b(0);

    /* renamed from: sListener */
    private static com.p314xaae8f345.p2926x359365.AbstractC25482x39049855 f46256xeed50647;

    /* renamed from: com.tencent.rtmp.TXLiveBase$a */
    /* loaded from: classes16.dex */
    public static class a implements com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.a {
        private a() {
        }

        public /* synthetic */ a(byte b17) {
            this();
        }

        @Override // com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.a
        public final void a(int i17, java.lang.String str, java.lang.String str2) {
            com.p314xaae8f345.p2926x359365.AbstractC25482x39049855 abstractC25482x39049855 = com.p314xaae8f345.p2926x359365.C25481x77f18081.f46256xeed50647;
            if (abstractC25482x39049855 != null) {
                abstractC25482x39049855.m94479x64f5ce5(i17, str, str2);
            }
        }
    }

    /* renamed from: com.tencent.rtmp.TXLiveBase$b */
    /* loaded from: classes16.dex */
    public static class b implements com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3774xbd6c7cad.a {
        private b() {
        }

        public /* synthetic */ b(byte b17) {
            this();
        }

        @Override // com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3774xbd6c7cad.a
        public final void a(int i17, java.lang.String str) {
            com.p314xaae8f345.p2926x359365.C25481x77f18081.m94463xd6b96d73(i17, str);
        }
    }

    static {
        if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.q.a()) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3774xbd6c7cad.m29512xc12469b5(f46255xa4289380);
        }
    }

    private C25481x77f18081() {
    }

    /* renamed from: enableCustomHttpDNS */
    public static void m94457x4081a60d(boolean z17) {
        if (z17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3777x2793b03.m29535x4081a60d(true, new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3777x2793b03.a() { // from class: com.tencent.rtmp.TXLiveBase.2
                @Override // com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3777x2793b03.a
                public final void a(java.lang.String str, java.util.List<java.lang.String> list) {
                    if (com.p314xaae8f345.p2926x359365.C25481x77f18081.f46256xeed50647 != null) {
                        com.p314xaae8f345.p2926x359365.C25481x77f18081.f46256xeed50647.m94477xb9c43331(str, list);
                    }
                }
            });
        } else {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3777x2793b03.m29535x4081a60d(false, null);
        }
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p2926x359365.C25481x77f18081 m94458x9cf0d20b() {
        return f46254x21169495;
    }

    /* renamed from: getNetworkTimestamp */
    public static long m94459x78c9e9fe() {
        return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3774xbd6c7cad.m29500x78c9e9fe();
    }

    /* renamed from: getPituSDKVersion */
    public static java.lang.String m94460x9985520e() {
        return "";
    }

    /* renamed from: getSDKVersionStr */
    public static java.lang.String m94461xdb46aa5d() {
        return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3774xbd6c7cad.m29501xdb46aa5d();
    }

    /* renamed from: isLibraryPathValid */
    public static boolean m94462x6af7e5a6(java.lang.String str) {
        return false;
    }

    /* renamed from: onUpdateNetworkTime */
    public static void m94463xd6b96d73(int i17, java.lang.String str) {
        com.p314xaae8f345.p2926x359365.AbstractC25482x39049855 abstractC25482x39049855 = f46256xeed50647;
        if (abstractC25482x39049855 != null) {
            abstractC25482x39049855.m94480xd6b96d73(i17, str);
        }
    }

    /* renamed from: setAppID */
    public static void m94464x52b73fba(java.lang.String str) {
        com.p314xaae8f345.p373xbe494963.C3726xa247d561.m29043x52b73fda(str);
    }

    /* renamed from: setAppVersion */
    public static void m94465x74dac979(java.lang.String str) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "Set app version:".concat(java.lang.String.valueOf(str)));
        com.p314xaae8f345.p373xbe494963.C3726xa247d561.m29044x74dac979(str);
    }

    /* renamed from: setConsoleEnabled */
    public static void m94466x230a12ec(boolean z17) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.m29543xce787289(z17);
    }

    /* renamed from: setExtID */
    public static boolean m94467x52f34fba(java.lang.String str, java.lang.String str2) {
        return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29479x52f34fba(str, str2);
    }

    /* renamed from: setGlobalEnv */
    public static int m94468x72e07808(java.lang.String str) {
        return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3774xbd6c7cad.m29510x72e07808(str);
    }

    /* renamed from: setLibraryPath */
    public static boolean m94469x4be2e1be(java.lang.String str) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.q.a(str);
        boolean a17 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.q.a();
        if (a17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3774xbd6c7cad.m29512xc12469b5(f46255xa4289380);
        }
        return a17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setListener */
    public static void m94470xc6cf6336(com.p314xaae8f345.p2926x359365.AbstractC25482x39049855 abstractC25482x39049855) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.m29550x6c4ebec7(new com.p314xaae8f345.p2926x359365.C25481x77f18081.a(0 == true ? 1 : 0));
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.m29544xe88b6783(abstractC25482x39049855 != null);
        f46256xeed50647 = abstractC25482x39049855;
    }

    /* renamed from: setLogLevel */
    public static void m94471xed871122(int i17) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.b bVar = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.b.kAll;
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.m29547xc712448b((i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? i17 != 6 ? com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.b.kAll : com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.b.kNone : com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.b.kFatal : com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.b.kError : com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.b.kWarning : com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.b.kInfo).f14762x11e5d8ed);
    }

    /* renamed from: setPituLicencePath */
    public static void m94472xc8a292ba(java.lang.String str) {
    }

    /* renamed from: setUserId */
    public static void m94473x26778548(java.lang.String str) {
        com.p314xaae8f345.p373xbe494963.C3726xa247d561.m29045x26778548(str);
    }

    /* renamed from: updateNetworkTime */
    public static int m94474x4865a192() {
        return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3774xbd6c7cad.m29513x4865a192();
    }

    /* renamed from: getLicenceInfo */
    public java.lang.String m94475x984e1169(android.content.Context context) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29241x91f62b6f(context.getApplicationContext());
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29246xa5f59752("liteav");
        return com.p314xaae8f345.p373xbe494963.sdk.p394xaf3f29eb.C3801xb71d9454.m30184x9cf0d20b().m30194x47bdc00b(com.p314xaae8f345.p373xbe494963.sdk.p394xaf3f29eb.C3801xb71d9454.c.LIVE);
    }

    /* renamed from: setLicence */
    public void m94476xbb2f0b8f(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29241x91f62b6f(context.getApplicationContext());
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29246xa5f59752("liteav");
        com.p314xaae8f345.p373xbe494963.sdk.p394xaf3f29eb.C3801xb71d9454.m30184x9cf0d20b().m30196xc6cf6336(new com.p314xaae8f345.p373xbe494963.sdk.p394xaf3f29eb.C3801xb71d9454.b() { // from class: com.tencent.rtmp.TXLiveBase.1
            @Override // com.p314xaae8f345.p373xbe494963.sdk.p394xaf3f29eb.C3801xb71d9454.b
            public final void a(int i17, java.lang.String str3) {
                com.p314xaae8f345.p2926x359365.AbstractC25482x39049855 abstractC25482x39049855 = com.p314xaae8f345.p2926x359365.C25481x77f18081.f46256xeed50647;
                if (abstractC25482x39049855 != null) {
                    abstractC25482x39049855.m94478x37e8c217(i17, str3);
                }
            }
        });
        com.p314xaae8f345.p373xbe494963.sdk.p394xaf3f29eb.C3801xb71d9454.m30184x9cf0d20b().m30195xbb2f0d7f(com.p314xaae8f345.p373xbe494963.sdk.p394xaf3f29eb.C3801xb71d9454.c.LIVE, str, str2);
    }
}
