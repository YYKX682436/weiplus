package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e;

/* renamed from: com.tencent.qqmusic.mediaplayer.network.DefaultMediaHTTPConnection */
/* loaded from: classes13.dex */
public class C25394x88045e89 implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.InterfaceC25396xa9fd0b61 {

    /* renamed from: CONNECT_TIMEOUT_MS */
    private static final int f45929x229cff9 = 30000;

    /* renamed from: HTTP_TEMP_REDIRECT */
    private static final int f45930x25e53070 = 307;

    /* renamed from: MAX_REDIRECTS */
    private static final int f45931x935c72bc = 20;
    private static final java.lang.String TAG = "MediaHTTPConnection";

    /* renamed from: VERBOSE */
    private static final boolean f45932x3fb90562 = false;

    /* renamed from: mCurrentOffset */
    private long f45936xd92657ff = -1;

    /* renamed from: mURL */
    private java.net.URL f45940x32d5c2 = null;

    /* renamed from: mHeaders */
    private java.util.Map<java.lang.String, java.lang.String> f45937xcd802259 = null;

    /* renamed from: mConnection */
    private java.net.HttpURLConnection f45935xadf6772b = null;

    /* renamed from: mTotalSize */
    private long f45939x584e3778 = -1;

    /* renamed from: mInputStream */
    private java.io.InputStream f45938x97d0253d = null;

    /* renamed from: mAllowCrossDomainRedirect */
    private boolean f45933x554a74a4 = true;

    /* renamed from: mAllowCrossProtocolRedirect */
    private boolean f45934x8dd1b178 = true;

    /* renamed from: filterOutInternalHeaders */
    private boolean m94086xa46ffe73(java.lang.String str, java.lang.String str2) {
        if (!"android-allow-cross-domain-redirect".equalsIgnoreCase(str)) {
            return false;
        }
        boolean m94088x8ebd09f5 = m94088x8ebd09f5(str2);
        this.f45933x554a74a4 = m94088x8ebd09f5;
        this.f45934x8dd1b178 = m94088x8ebd09f5;
        return true;
    }

    /* renamed from: isLocalHost */
    private static final boolean m94087xfe61dda9(java.net.URL url) {
        java.lang.String host;
        if (url == null || (host = url.getHost()) == null) {
            return false;
        }
        try {
        } catch (java.lang.IllegalArgumentException e17) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "isLocalHost", e17);
        }
        return host.equalsIgnoreCase("localhost");
    }

    /* renamed from: parseBoolean */
    private boolean m94088x8ebd09f5(java.lang.String str) {
        try {
            return java.lang.Long.parseLong(str) != 0;
        } catch (java.lang.NumberFormatException unused) {
            return "true".equalsIgnoreCase(str) || "yes".equalsIgnoreCase(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d2, code lost:
    
        r17.f45940x32d5c2 = r10;
     */
    /* renamed from: seekTo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m94089xc9fc1b13(long r18) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.C25394x88045e89.m94089xc9fc1b13(long):void");
    }

    /* renamed from: teardownConnection */
    private void m94090xdcfb0c02() {
        java.net.HttpURLConnection httpURLConnection = this.f45935xadf6772b;
        if (httpURLConnection != null) {
            this.f45938x97d0253d = null;
            httpURLConnection.disconnect();
            this.f45935xadf6772b = null;
            this.f45936xd92657ff = -1L;
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.InterfaceC25396xa9fd0b61
    /* renamed from: connect */
    public boolean mo94091x38b478ea(java.net.URL url, java.util.Map<java.lang.String, java.lang.String> map) {
        mo94092x1f9d589c();
        this.f45933x554a74a4 = true;
        this.f45940x32d5c2 = url;
        this.f45937xcd802259 = map;
        return true;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.InterfaceC25396xa9fd0b61
    /* renamed from: disconnect */
    public void mo94092x1f9d589c() {
        m94090xdcfb0c02();
        this.f45937xcd802259 = null;
        this.f45940x32d5c2 = null;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.InterfaceC25396xa9fd0b61
    /* renamed from: getMIMEType */
    public java.lang.String mo94093x53babee4() {
        if (this.f45935xadf6772b == null) {
            try {
                m94089xc9fc1b13(0L);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "getMIMEType", e17);
                return "application/octet-stream";
            }
        }
        return this.f45935xadf6772b.getContentType();
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.InterfaceC25396xa9fd0b61
    /* renamed from: getSize */
    public long mo94094xfb854877() {
        if (this.f45935xadf6772b == null) {
            try {
                m94089xc9fc1b13(0L);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "getSize", e17);
                return -1L;
            }
        }
        return this.f45939x584e3778;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.InterfaceC25396xa9fd0b61
    /* renamed from: getUri */
    public java.lang.String mo94095xb5887636() {
        return this.f45940x32d5c2.toString();
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.InterfaceC25396xa9fd0b61
    /* renamed from: readAt */
    public int mo94096xc8455469(long j17, byte[] bArr, int i17, int i18) {
        try {
            if (j17 != this.f45936xd92657ff) {
                m94089xc9fc1b13(j17);
            }
            int read = this.f45938x97d0253d.read(bArr, i17, i18);
            if (read == -1) {
                read = 0;
            }
            this.f45936xd92657ff += read;
            return read;
        } catch (java.net.NoRouteToHostException e17) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.w(TAG, "readAt " + j17 + " / " + i18 + " => " + e17);
            return -1010;
        } catch (java.net.ProtocolException e18) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.w(TAG, "readAt " + j17 + " / " + i18 + " => " + e18);
            return -1010;
        } catch (java.net.UnknownServiceException e19) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.w(TAG, "readAt " + j17 + " / " + i18 + " => " + e19);
            return -1010;
        } catch (java.io.IOException unused) {
            return -2;
        } catch (java.lang.Exception unused2) {
            return -3;
        }
    }
}
