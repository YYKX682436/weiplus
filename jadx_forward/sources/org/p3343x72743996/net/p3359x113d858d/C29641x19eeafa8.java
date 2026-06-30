package org.p3343x72743996.net.p3359x113d858d;

/* renamed from: org.chromium.net.urlconnection.CronetHttpURLConnection */
/* loaded from: classes13.dex */
public class C29641x19eeafa8 extends java.net.HttpURLConnection {

    /* renamed from: CONTENT_LENGTH */
    private static final java.lang.String f74896x2c3f058c = "Content-Length";
    private static final java.lang.String TAG = "CronetHttpURLConnection";

    /* renamed from: mCronetEngine */
    private final org.p3343x72743996.net.AbstractC29500x62bc147f f74897xf085d96c;

    /* renamed from: mException */
    private java.io.IOException f74898xd3071a62;

    /* renamed from: mHasResponseHeadersOrCompleted */
    private boolean f74899x94164730;

    /* renamed from: mInputStream */
    private org.p3343x72743996.net.p3359x113d858d.C29643x7a36d7cd f74900x97d0253d;

    /* renamed from: mMessageLoop */
    private final org.p3343x72743996.net.p3359x113d858d.ExecutorC29646x2f5b872b f74901x75fef09e;

    /* renamed from: mOnRedirectCalled */
    private boolean f74902xfa8668c5;

    /* renamed from: mOutputStream */
    private org.p3343x72743996.net.p3359x113d858d.AbstractC29644xfa3f885e f74903x8fcfe8ee;

    /* renamed from: mRequest */
    private org.p3343x72743996.net.AbstractC29563x9a627640 f74904xdf67a562;

    /* renamed from: mRequestHeaders */
    private final java.util.List<android.util.Pair<java.lang.String, java.lang.String>> f74905xc777efc4;

    /* renamed from: mResponseHeadersList */
    private java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> f74906xd6918096;

    /* renamed from: mResponseHeadersMap */
    private java.util.Map<java.lang.String, java.util.List<java.lang.String>> f74907x8b0cf664;

    /* renamed from: mResponseInfo */
    private org.p3343x72743996.net.AbstractC29564x6974077e f74908xed58fd9c;

    /* renamed from: mTrafficStatsTag */
    private int f74909xba73b36b;

    /* renamed from: mTrafficStatsTagSet */
    private boolean f74910x9e3d54f7;

    /* renamed from: mTrafficStatsUid */
    private int f74911xba73b821;

    /* renamed from: mTrafficStatsUidSet */
    private boolean f74912xa0618c81;

    /* renamed from: org.chromium.net.urlconnection.CronetHttpURLConnection$CronetUrlRequestCallback */
    /* loaded from: classes13.dex */
    public class CronetUrlRequestCallback extends org.p3343x72743996.net.AbstractC29563x9a627640.Callback {
        public CronetUrlRequestCallback() {
        }

        /* renamed from: setResponseDataCompleted */
        private void m154320xedd77be(java.io.IOException iOException) {
            org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8.this.f74898xd3071a62 = iOException;
            if (org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8.this.f74900x97d0253d != null) {
                org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8.this.f74900x97d0253d.m154323xedd77be(iOException);
            }
            if (org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8.this.f74903x8fcfe8ee != null) {
                org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8.this.f74903x8fcfe8ee.m154326xa80f90fe(iOException);
            }
            org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8.this.f74899x94164730 = true;
            org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8.this.f74901x75fef09e.m154333x35224f();
        }

        @Override // org.p3343x72743996.net.AbstractC29563x9a627640.Callback
        /* renamed from: onCanceled */
        public void mo153673x9dc2a798(org.p3343x72743996.net.AbstractC29563x9a627640 abstractC29563x9a627640, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e) {
            org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8.this.f74908xed58fd9c = abstractC29564x6974077e;
            m154320xedd77be(new java.io.IOException("disconnect() called"));
        }

        @Override // org.p3343x72743996.net.AbstractC29563x9a627640.Callback
        /* renamed from: onFailed */
        public void mo153674x428b6afc(org.p3343x72743996.net.AbstractC29563x9a627640 abstractC29563x9a627640, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, org.p3343x72743996.net.AbstractC29501x119930f2 abstractC29501x119930f2) {
            if (abstractC29501x119930f2 == null) {
                throw new java.lang.IllegalStateException("Exception cannot be null in onFailed.");
            }
            org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8.this.f74908xed58fd9c = abstractC29564x6974077e;
            m154320xedd77be(abstractC29501x119930f2);
        }

        @Override // org.p3343x72743996.net.AbstractC29563x9a627640.Callback
        /* renamed from: onReadCompleted */
        public void mo153675x6da909b6(org.p3343x72743996.net.AbstractC29563x9a627640 abstractC29563x9a627640, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, java.nio.ByteBuffer byteBuffer) {
            org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8.this.f74908xed58fd9c = abstractC29564x6974077e;
            org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8.this.f74901x75fef09e.m154333x35224f();
        }

        @Override // org.p3343x72743996.net.AbstractC29563x9a627640.Callback
        /* renamed from: onRedirectReceived */
        public void mo153676x4d4e5ddc(org.p3343x72743996.net.AbstractC29563x9a627640 abstractC29563x9a627640, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, java.lang.String str) {
            org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8.this.f74902xfa8668c5 = true;
            try {
                java.net.URL url = new java.net.URL(str);
                boolean equals = url.getProtocol().equals(((java.net.HttpURLConnection) org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8.this).url.getProtocol());
                if (((java.net.HttpURLConnection) org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8.this).instanceFollowRedirects) {
                    ((java.net.HttpURLConnection) org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8.this).url = url;
                }
                if (((java.net.HttpURLConnection) org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8.this).instanceFollowRedirects && equals) {
                    org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8.this.f74904xdf67a562.mo153667x25da56ad();
                    return;
                }
            } catch (java.net.MalformedURLException unused) {
            }
            org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8.this.f74908xed58fd9c = abstractC29564x6974077e;
            org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8.this.f74904xdf67a562.mo153666xae7a2e7a();
            m154320xedd77be(null);
        }

        @Override // org.p3343x72743996.net.AbstractC29563x9a627640.Callback
        /* renamed from: onResponseStarted */
        public void mo153677x5d21f921(org.p3343x72743996.net.AbstractC29563x9a627640 abstractC29563x9a627640, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e) {
            org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8.this.f74908xed58fd9c = abstractC29564x6974077e;
            org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8.this.f74899x94164730 = true;
            org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8.this.f74901x75fef09e.m154333x35224f();
        }

        @Override // org.p3343x72743996.net.AbstractC29563x9a627640.Callback
        /* renamed from: onSucceeded */
        public void mo153678x3688ff42(org.p3343x72743996.net.AbstractC29563x9a627640 abstractC29563x9a627640, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e) {
            org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8.this.f74908xed58fd9c = abstractC29564x6974077e;
            m154320xedd77be(null);
        }
    }

    public C29641x19eeafa8(java.net.URL url, org.p3343x72743996.net.AbstractC29500x62bc147f abstractC29500x62bc147f) {
        super(url);
        this.f74897xf085d96c = abstractC29500x62bc147f;
        this.f74901x75fef09e = new org.p3343x72743996.net.p3359x113d858d.ExecutorC29646x2f5b872b();
        this.f74900x97d0253d = new org.p3343x72743996.net.p3359x113d858d.C29643x7a36d7cd(this);
        this.f74905xc777efc4 = new java.util.ArrayList();
    }

    /* renamed from: checkHasResponseHeaders */
    private void m154305x1edca533() {
        if (!this.f74899x94164730) {
            throw new java.lang.IllegalStateException("No response.");
        }
        java.io.IOException iOException = this.f74898xd3071a62;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f74908xed58fd9c == null) {
            throw new java.lang.NullPointerException("Response info is null when there is no exception.");
        }
    }

    /* renamed from: checkTrafficStatsTag */
    private boolean m154306xd75ca570() {
        if (this.f74910x9e3d54f7) {
            return true;
        }
        int threadStatsTag = android.net.TrafficStats.getThreadStatsTag();
        if (threadStatsTag != -1) {
            this.f74909xba73b36b = threadStatsTag;
            this.f74910x9e3d54f7 = true;
        }
        return this.f74910x9e3d54f7;
    }

    /* renamed from: checkTrafficStatsUid */
    private boolean m154307xd75caa26() {
        if (this.f74912xa0618c81) {
            return true;
        }
        if (android.os.Build.VERSION.SDK_INT < 28) {
            return false;
        }
        int threadStatsUid = android.net.TrafficStats.getThreadStatsUid();
        if (threadStatsUid != -1) {
            this.f74911xba73b821 = threadStatsUid;
            this.f74912xa0618c81 = true;
        }
        return this.f74912xa0618c81;
    }

    /* renamed from: findRequestProperty */
    private int m154308x7b62ae8b(java.lang.String str) {
        for (int i17 = 0; i17 < this.f74905xc777efc4.size(); i17++) {
            if (((java.lang.String) this.f74905xc777efc4.get(i17).first).equalsIgnoreCase(str)) {
                return i17;
            }
        }
        return -1;
    }

    /* renamed from: getAllHeaders */
    private java.util.Map<java.lang.String, java.util.List<java.lang.String>> m154309x70925e9b() {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = this.f74907x8b0cf664;
        if (map != null) {
            return map;
        }
        java.util.TreeMap treeMap = new java.util.TreeMap(java.lang.String.CASE_INSENSITIVE_ORDER);
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : m154310x419d726b()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((java.util.Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add(entry.getValue());
            treeMap.put(entry.getKey(), java.util.Collections.unmodifiableList(arrayList));
        }
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> unmodifiableMap = java.util.Collections.unmodifiableMap(treeMap);
        this.f74907x8b0cf664 = unmodifiableMap;
        return unmodifiableMap;
    }

    /* renamed from: getAllHeadersAsList */
    private java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> m154310x419d726b() {
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> list = this.f74906xd6918096;
        if (list != null) {
            return list;
        }
        this.f74906xd6918096 = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.f74908xed58fd9c.mo153681x419d726b()) {
            if (!entry.getKey().equalsIgnoreCase("Content-Encoding")) {
                this.f74906xd6918096.add(new java.util.AbstractMap.SimpleImmutableEntry(entry));
            }
        }
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> unmodifiableList = java.util.Collections.unmodifiableList(this.f74906xd6918096);
        this.f74906xd6918096 = unmodifiableList;
        return unmodifiableList;
    }

    /* renamed from: getHeaderFieldEntry */
    private java.util.Map.Entry<java.lang.String, java.lang.String> m154311x6d941d7b(int i17) {
        try {
            m154312x679151b7();
            java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> m154310x419d726b = m154310x419d726b();
            if (i17 >= m154310x419d726b.size()) {
                return null;
            }
            return m154310x419d726b.get(i17);
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    /* renamed from: getResponse */
    private void m154312x679151b7() {
        org.p3343x72743996.net.p3359x113d858d.AbstractC29644xfa3f885e abstractC29644xfa3f885e = this.f74903x8fcfe8ee;
        if (abstractC29644xfa3f885e != null) {
            abstractC29644xfa3f885e.mo154291x45140060();
            if (m154314x17f38fe3()) {
                this.f74903x8fcfe8ee.close();
            }
        }
        if (!this.f74899x94164730) {
            m154316x394b73cd();
            this.f74901x75fef09e.m154331x32c6a4();
        }
        m154305x1edca533();
    }

    /* renamed from: getStreamingModeContentLength */
    private long m154313xbbfb1790() {
        long j17 = ((java.net.HttpURLConnection) this).fixedContentLength;
        long j18 = ((java.net.HttpURLConnection) this).fixedContentLengthLong;
        return j18 != -1 ? j18 : j17;
    }

    /* renamed from: isChunkedUpload */
    private boolean m154314x17f38fe3() {
        return ((java.net.HttpURLConnection) this).chunkLength > 0;
    }

    /* renamed from: setRequestPropertyInternal */
    private final void m154315x7a6de99f(java.lang.String str, java.lang.String str2, boolean z17) {
        if (((java.net.HttpURLConnection) this).connected) {
            throw new java.lang.IllegalStateException("Cannot modify request property after connection is made.");
        }
        int m154308x7b62ae8b = m154308x7b62ae8b(str);
        if (m154308x7b62ae8b >= 0) {
            if (!z17) {
                throw new java.lang.UnsupportedOperationException("Cannot add multiple headers of the same key, " + str + ". crbug.com/432719.");
            }
            this.f74905xc777efc4.remove(m154308x7b62ae8b);
        }
        this.f74905xc777efc4.add(android.util.Pair.create(str, str2));
    }

    /* renamed from: startRequest */
    private void m154316x394b73cd() {
        if (((java.net.HttpURLConnection) this).connected) {
            return;
        }
        org.p3343x72743996.net.AbstractC29512x37ecfd48.Builder builder = (org.p3343x72743996.net.AbstractC29512x37ecfd48.Builder) this.f74897xf085d96c.mo153158x92e7539b(getURL().toString(), new org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8.CronetUrlRequestCallback(), this.f74901x75fef09e);
        if (((java.net.HttpURLConnection) this).doOutput) {
            if (((java.net.HttpURLConnection) this).method.equals("GET")) {
                ((java.net.HttpURLConnection) this).method = "POST";
            }
            org.p3343x72743996.net.p3359x113d858d.AbstractC29644xfa3f885e abstractC29644xfa3f885e = this.f74903x8fcfe8ee;
            if (abstractC29644xfa3f885e != null) {
                builder.mo153278xc9755c5e(abstractC29644xfa3f885e.mo154292x3249da52(), (java.util.concurrent.Executor) this.f74901x75fef09e);
                if (getRequestProperty(f74896x2c3f058c) == null && !m154314x17f38fe3()) {
                    addRequestProperty(f74896x2c3f058c, java.lang.Long.toString(this.f74903x8fcfe8ee.mo154292x3249da52().mo153654x23255ddc()));
                }
                this.f74903x8fcfe8ee.mo154293x393b24c7();
            } else if (getRequestProperty(f74896x2c3f058c) == null) {
                addRequestProperty(f74896x2c3f058c, "0");
            }
            if (getRequestProperty("Content-Type") == null) {
                addRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            }
        }
        for (android.util.Pair<java.lang.String, java.lang.String> pair : this.f74905xc777efc4) {
            builder.mo153266xec6c8a8e((java.lang.String) pair.first, (java.lang.String) pair.second);
        }
        if (!getUseCaches()) {
            builder.mo153270xc3a92d7a();
        }
        builder.mo153272x492a458b(((java.net.HttpURLConnection) this).method);
        if (m154306xd75ca570()) {
            builder.mo153276x5fdeed6(this.f74909xba73b36b);
        }
        if (m154307xd75caa26()) {
            builder.mo153277x5fdf38c(this.f74911xba73b821);
        }
        org.p3343x72743996.net.AbstractC29512x37ecfd48 mo153269x59bc66e = builder.mo153269x59bc66e();
        this.f74904xdf67a562 = mo153269x59bc66e;
        mo153269x59bc66e.mo153671x68ac462();
        ((java.net.HttpURLConnection) this).connected = true;
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(java.lang.String str, java.lang.String str2) {
        m154315x7a6de99f(str, str2, false);
    }

    @Override // java.net.URLConnection
    public void connect() {
        getOutputStream();
        m154316x394b73cd();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        if (((java.net.HttpURLConnection) this).connected) {
            this.f74904xdf67a562.mo153666xae7a2e7a();
        }
    }

    @Override // java.net.HttpURLConnection
    public java.io.InputStream getErrorStream() {
        try {
            m154312x679151b7();
            if (this.f74908xed58fd9c.mo153682xea30509d() >= 400) {
                return this.f74900x97d0253d;
            }
            return null;
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // java.net.URLConnection
    public final java.lang.String getHeaderField(java.lang.String str) {
        try {
            m154312x679151b7();
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> m154309x70925e9b = m154309x70925e9b();
            if (!m154309x70925e9b.containsKey(str)) {
                return null;
            }
            return m154309x70925e9b.get(str).get(r4.size() - 1);
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final java.lang.String getHeaderFieldKey(int i17) {
        java.util.Map.Entry<java.lang.String, java.lang.String> m154311x6d941d7b = m154311x6d941d7b(i17);
        if (m154311x6d941d7b == null) {
            return null;
        }
        return m154311x6d941d7b.getKey();
    }

    @Override // java.net.URLConnection
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaderFields() {
        try {
            m154312x679151b7();
            return m154309x70925e9b();
        } catch (java.io.IOException unused) {
            return java.util.Collections.emptyMap();
        }
    }

    @Override // java.net.URLConnection
    public java.io.InputStream getInputStream() {
        m154312x679151b7();
        if (!((java.net.HttpURLConnection) this).instanceFollowRedirects && this.f74902xfa8668c5) {
            throw new java.io.IOException("Cannot read response body of a redirect.");
        }
        if (this.f74908xed58fd9c.mo153682xea30509d() < 400) {
            return this.f74900x97d0253d;
        }
        throw new java.io.FileNotFoundException(((java.net.HttpURLConnection) this).url.toString());
    }

    /* renamed from: getMoreData */
    public void m154317x6ec62a15(java.nio.ByteBuffer byteBuffer) {
        this.f74904xdf67a562.mo153670x355996(byteBuffer);
        this.f74901x75fef09e.m154332x32c6a4(getReadTimeout());
    }

    @Override // java.net.URLConnection
    public java.io.OutputStream getOutputStream() {
        if (this.f74903x8fcfe8ee == null && ((java.net.HttpURLConnection) this).doOutput) {
            if (((java.net.HttpURLConnection) this).connected) {
                throw new java.net.ProtocolException("Cannot write to OutputStream after receiving response.");
            }
            if (m154314x17f38fe3()) {
                this.f74903x8fcfe8ee = new org.p3343x72743996.net.p3359x113d858d.C29639x9914ab0(this, ((java.net.HttpURLConnection) this).chunkLength, this.f74901x75fef09e);
                m154316x394b73cd();
            } else {
                long m154313xbbfb1790 = m154313xbbfb1790();
                if (m154313xbbfb1790 != -1) {
                    this.f74903x8fcfe8ee = new org.p3343x72743996.net.p3359x113d858d.C29640xb71d48db(this, m154313xbbfb1790, this.f74901x75fef09e);
                    m154316x394b73cd();
                } else {
                    java.lang.String requestProperty = getRequestProperty(f74896x2c3f058c);
                    if (requestProperty == null) {
                        this.f74903x8fcfe8ee = new org.p3343x72743996.net.p3359x113d858d.C29638xbfcf49dd(this);
                    } else {
                        this.f74903x8fcfe8ee = new org.p3343x72743996.net.p3359x113d858d.C29638xbfcf49dd(this, java.lang.Long.parseLong(requestProperty));
                    }
                }
            }
        }
        return this.f74903x8fcfe8ee;
    }

    @Override // java.net.URLConnection
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getRequestProperties() {
        if (((java.net.HttpURLConnection) this).connected) {
            throw new java.lang.IllegalStateException("Cannot access request headers after connection is set.");
        }
        java.util.TreeMap treeMap = new java.util.TreeMap(java.lang.String.CASE_INSENSITIVE_ORDER);
        for (android.util.Pair<java.lang.String, java.lang.String> pair : this.f74905xc777efc4) {
            if (treeMap.containsKey(pair.first)) {
                throw new java.lang.IllegalStateException("Should not have multiple values.");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add((java.lang.String) pair.second);
            treeMap.put((java.lang.String) pair.first, java.util.Collections.unmodifiableList(arrayList));
        }
        return java.util.Collections.unmodifiableMap(treeMap);
    }

    @Override // java.net.URLConnection
    public java.lang.String getRequestProperty(java.lang.String str) {
        int m154308x7b62ae8b = m154308x7b62ae8b(str);
        if (m154308x7b62ae8b >= 0) {
            return (java.lang.String) this.f74905xc777efc4.get(m154308x7b62ae8b).second;
        }
        return null;
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        m154312x679151b7();
        return this.f74908xed58fd9c.mo153682xea30509d();
    }

    @Override // java.net.HttpURLConnection
    public java.lang.String getResponseMessage() {
        m154312x679151b7();
        return this.f74908xed58fd9c.mo153683xea37e7dd();
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i17) {
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(java.lang.String str, java.lang.String str2) {
        m154315x7a6de99f(str, str2, true);
    }

    /* renamed from: setTrafficStatsTag */
    public void m154318x5fdeed6(int i17) {
        if (((java.net.HttpURLConnection) this).connected) {
            throw new java.lang.IllegalStateException("Cannot modify traffic stats tag after connection is made.");
        }
        this.f74910x9e3d54f7 = true;
        this.f74909xba73b36b = i17;
    }

    /* renamed from: setTrafficStatsUid */
    public void m154319x5fdf38c(int i17) {
        if (((java.net.HttpURLConnection) this).connected) {
            throw new java.lang.IllegalStateException("Cannot modify traffic stats UID after connection is made.");
        }
        this.f74912xa0618c81 = true;
        this.f74911xba73b821 = i17;
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return false;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final java.lang.String getHeaderField(int i17) {
        java.util.Map.Entry<java.lang.String, java.lang.String> m154311x6d941d7b = m154311x6d941d7b(i17);
        if (m154311x6d941d7b == null) {
            return null;
        }
        return m154311x6d941d7b.getValue();
    }
}
