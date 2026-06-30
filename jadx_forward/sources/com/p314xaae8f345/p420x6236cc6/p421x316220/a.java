package com.p314xaae8f345.p420x6236cc6.p421x316220;

/* loaded from: classes16.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.p420x6236cc6.p421x316220.a.C30885a f128727a = new com.p314xaae8f345.p420x6236cc6.p421x316220.a.C30885a();

    /* renamed from: b, reason: collision with root package name */
    private static com.p314xaae8f345.p420x6236cc6.C3877x3eb9c7a0.V2TXLivePremierObserver f128728b;

    /* renamed from: com.tencent.live2.impl.a$a, reason: collision with other inner class name */
    /* loaded from: classes16.dex */
    public static final class C30885a implements com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.a {

        /* renamed from: a, reason: collision with root package name */
        com.p314xaae8f345.p420x6236cc6.C3877x3eb9c7a0.V2TXLivePremierObserver f128729a;

        @Override // com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.a
        public final void a(int i17, java.lang.String str, java.lang.String str2) {
            com.p314xaae8f345.p420x6236cc6.C3877x3eb9c7a0.V2TXLivePremierObserver v2TXLivePremierObserver = this.f128729a;
            if (v2TXLivePremierObserver != null) {
                v2TXLivePremierObserver.mo31697x64f5ce5(i17, str2);
            }
        }
    }

    public static java.lang.String a() {
        return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3774xbd6c7cad.m29501xdb46aa5d();
    }

    public static int c(java.lang.String str) {
        return com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3799x7566b7e5.m30033xd33a8dd4(str);
    }

    public static void a(com.p314xaae8f345.p420x6236cc6.C3877x3eb9c7a0.V2TXLivePremierObserver v2TXLivePremierObserver) {
        f128728b = v2TXLivePremierObserver;
        f128727a.f128729a = v2TXLivePremierObserver;
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3799x7566b7e5.m30046x8b59f158(v2TXLivePremierObserver);
    }

    public static void b(boolean z17, com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat) {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3799x7566b7e5.m30036x7cd113fd(z17, v2TXLiveAudioFrameObserverFormat);
    }

    public static void b(java.lang.String str) {
        com.p314xaae8f345.p373xbe494963.C3726xa247d561.m29045x26778548(str);
    }

    public static void a(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveLogConfig v2TXLiveLogConfig) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.b bVar;
        if (v2TXLiveLogConfig != null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.m29543xce787289(v2TXLiveLogConfig.f15322x7b70ae54);
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.m29548xea224ab1(v2TXLiveLogConfig.f15323x571193dd);
            java.lang.String str = v2TXLiveLogConfig.f15326x145c3989;
            if (str != null) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.m29546x7a0c955a(str);
            }
            int i17 = v2TXLiveLogConfig.f15325x76f472a0;
            if (i17 == 2) {
                bVar = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.b.kInfo;
            } else if (i17 == 3) {
                bVar = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.b.kWarning;
            } else if (i17 == 4) {
                bVar = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.b.kError;
            } else if (i17 == 5) {
                bVar = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.b.kFatal;
            } else if (i17 != 6) {
                bVar = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.b.kAll;
            } else {
                bVar = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.b.kNone;
            }
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.m29547xc712448b(bVar.f14762x11e5d8ed);
            com.p314xaae8f345.p420x6236cc6.p421x316220.a.C30885a c30885a = f128727a;
            boolean z17 = v2TXLiveLogConfig.f15324x2946a979;
            if (!z17) {
                c30885a = null;
            }
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.m29550x6c4ebec7(c30885a);
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.m29544xe88b6783(z17);
        }
    }

    public static void a(java.lang.String str) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3774xbd6c7cad.m29510x72e07808(str);
    }

    public static void a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29241x91f62b6f(context.getApplicationContext());
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29246xa5f59752("liteav");
        com.p314xaae8f345.p373xbe494963.sdk.p394xaf3f29eb.C3801xb71d9454.m30184x9cf0d20b().m30196xc6cf6336(new com.p314xaae8f345.p373xbe494963.sdk.p394xaf3f29eb.C3801xb71d9454.b() { // from class: com.tencent.live2.impl.a.1
            @Override // com.p314xaae8f345.p373xbe494963.sdk.p394xaf3f29eb.C3801xb71d9454.b
            public final void a(int i17, java.lang.String str3) {
                com.p314xaae8f345.p420x6236cc6.C3877x3eb9c7a0.V2TXLivePremierObserver v2TXLivePremierObserver = com.p314xaae8f345.p420x6236cc6.p421x316220.a.f128728b;
                if (v2TXLivePremierObserver != null) {
                    v2TXLivePremierObserver.mo31696x37e8c217(i17, str3);
                }
            }
        });
        com.p314xaae8f345.p373xbe494963.sdk.p394xaf3f29eb.C3801xb71d9454.m30184x9cf0d20b().m30195xbb2f0d7f(com.p314xaae8f345.p373xbe494963.sdk.p394xaf3f29eb.C3801xb71d9454.c.LIVE, str, str2);
    }

    public static void a(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveSocks5ProxyConfig v2TXLiveSocks5ProxyConfig) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3774xbd6c7cad.m29511x22df1366(str, i17, str2, str3, v2TXLiveSocks5ProxyConfig.f15388xa2ad225c, v2TXLiveSocks5ProxyConfig.f15389xdb688192, v2TXLiveSocks5ProxyConfig.f15390xdb688572);
    }

    public static void a(boolean z17, com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat) {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3799x7566b7e5.m30035xfbd787a9(z17, v2TXLiveAudioFrameObserverFormat);
    }

    public static void a(boolean z17) {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3799x7566b7e5.m30037xa2f8f7e9(z17);
    }
}
