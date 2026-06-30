package org.p3343x72743996.net.p3358x316220;

/* renamed from: org.chromium.net.impl.UrlResponseInfoImpl */
/* loaded from: classes13.dex */
public final class C29632xf92aeebe extends org.p3343x72743996.net.AbstractC29564x6974077e {

    /* renamed from: mHeaders */
    private final org.p3343x72743996.net.p3358x316220.C29632xf92aeebe.HeaderBlockImpl f74849xcd802259;

    /* renamed from: mHttpStatusCode */
    private final int f74850x24b8d74;

    /* renamed from: mHttpStatusText */
    private final java.lang.String f74851x25324b4;

    /* renamed from: mNegotiatedProtocol */
    private final java.lang.String f74852xa39e11ab;

    /* renamed from: mProxyServer */
    private final java.lang.String f74853x2641eca4;

    /* renamed from: mReceivedByteCount */
    private final java.util.concurrent.atomic.AtomicLong f74854xe99baf19;

    /* renamed from: mResponseInfoUrlChain */
    private final java.util.List<java.lang.String> f74855xd936344e;

    /* renamed from: mWasCached */
    private final boolean f74856xfe1faf7e;

    /* renamed from: org.chromium.net.impl.UrlResponseInfoImpl$HeaderBlockImpl */
    /* loaded from: classes13.dex */
    public static final class HeaderBlockImpl extends org.p3343x72743996.net.AbstractC29564x6974077e.HeaderBlock {

        /* renamed from: mAllHeadersList */
        private final java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> f74857x24fafab0;

        /* renamed from: mHeadersMap */
        private java.util.Map<java.lang.String, java.util.List<java.lang.String>> f74858x521e4043;

        public HeaderBlockImpl(java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> list) {
            this.f74857x24fafab0 = list;
        }

        @Override // org.p3343x72743996.net.AbstractC29564x6974077e.HeaderBlock
        /* renamed from: getAsList */
        public java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> mo153690x1115eae6() {
            return this.f74857x24fafab0;
        }

        @Override // org.p3343x72743996.net.AbstractC29564x6974077e.HeaderBlock
        /* renamed from: getAsMap */
        public java.util.Map<java.lang.String, java.util.List<java.lang.String>> mo153691x742a0214() {
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = this.f74858x521e4043;
            if (map != null) {
                return map;
            }
            java.util.TreeMap treeMap = new java.util.TreeMap(java.lang.String.CASE_INSENSITIVE_ORDER);
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.f74857x24fafab0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (treeMap.containsKey(entry.getKey())) {
                    arrayList.addAll((java.util.Collection) treeMap.get(entry.getKey()));
                }
                arrayList.add(entry.getValue());
                treeMap.put(entry.getKey(), java.util.Collections.unmodifiableList(arrayList));
            }
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> unmodifiableMap = java.util.Collections.unmodifiableMap(treeMap);
            this.f74858x521e4043 = unmodifiableMap;
            return unmodifiableMap;
        }
    }

    public C29632xf92aeebe(java.util.List<java.lang.String> list, int i17, java.lang.String str, java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> list2, boolean z17, java.lang.String str2, java.lang.String str3, long j17) {
        this.f74855xd936344e = java.util.Collections.unmodifiableList(list);
        this.f74850x24b8d74 = i17;
        this.f74851x25324b4 = str;
        this.f74849xcd802259 = new org.p3343x72743996.net.p3358x316220.C29632xf92aeebe.HeaderBlockImpl(java.util.Collections.unmodifiableList(list2));
        this.f74856xfe1faf7e = z17;
        this.f74852xa39e11ab = str2;
        this.f74853x2641eca4 = str3;
        this.f74854xe99baf19 = new java.util.concurrent.atomic.AtomicLong(j17);
    }

    @Override // org.p3343x72743996.net.AbstractC29564x6974077e
    /* renamed from: getAllHeaders */
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> mo153680x70925e9b() {
        return this.f74849xcd802259.mo153691x742a0214();
    }

    @Override // org.p3343x72743996.net.AbstractC29564x6974077e
    /* renamed from: getAllHeadersAsList */
    public java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> mo153681x419d726b() {
        return this.f74849xcd802259.mo153690x1115eae6();
    }

    @Override // org.p3343x72743996.net.AbstractC29564x6974077e
    /* renamed from: getHttpStatusCode */
    public int mo153682xea30509d() {
        return this.f74850x24b8d74;
    }

    @Override // org.p3343x72743996.net.AbstractC29564x6974077e
    /* renamed from: getHttpStatusText */
    public java.lang.String mo153683xea37e7dd() {
        return this.f74851x25324b4;
    }

    @Override // org.p3343x72743996.net.AbstractC29564x6974077e
    /* renamed from: getNegotiatedProtocol */
    public java.lang.String mo153684xb7ab1854() {
        return this.f74852xa39e11ab;
    }

    @Override // org.p3343x72743996.net.AbstractC29564x6974077e
    /* renamed from: getProxyServer */
    public java.lang.String mo153685x560b221b() {
        return this.f74853x2641eca4;
    }

    @Override // org.p3343x72743996.net.AbstractC29564x6974077e
    /* renamed from: getReceivedByteCount */
    public long mo153686x9feeaf50() {
        return this.f74854xe99baf19.get();
    }

    @Override // org.p3343x72743996.net.AbstractC29564x6974077e
    /* renamed from: getUrl */
    public java.lang.String mo153687xb5887639() {
        return this.f74855xd936344e.get(r0.size() - 1);
    }

    @Override // org.p3343x72743996.net.AbstractC29564x6974077e
    /* renamed from: getUrlChain */
    public java.util.List<java.lang.String> mo153688x40766c08() {
        return this.f74855xd936344e;
    }

    /* renamed from: setReceivedByteCount */
    public void m154263x7b84bbc4(long j17) {
        this.f74854xe99baf19.set(j17);
    }

    /* renamed from: toString */
    public java.lang.String m154264x9616526c() {
        return java.lang.String.format(java.util.Locale.ROOT, "UrlResponseInfo@[%s][%s]: urlChain = %s, httpStatus = %d %s, headers = %s, wasCached = %b, negotiatedProtocol = %s, proxyServer= %s, receivedByteCount = %d", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), mo153687xb5887639(), mo153688x40766c08().toString(), java.lang.Integer.valueOf(mo153682xea30509d()), mo153683xea37e7dd(), mo153681x419d726b().toString(), java.lang.Boolean.valueOf(mo153689x8368656b()), mo153684xb7ab1854(), mo153685x560b221b(), java.lang.Long.valueOf(mo153686x9feeaf50()));
    }

    @Override // org.p3343x72743996.net.AbstractC29564x6974077e
    /* renamed from: wasCached */
    public boolean mo153689x8368656b() {
        return this.f74856xfe1faf7e;
    }

    @java.lang.Deprecated
    public C29632xf92aeebe(java.util.List<java.lang.String> list, int i17, java.lang.String str, java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> list2, boolean z17, java.lang.String str2, java.lang.String str3) {
        this(list, i17, str, list2, z17, str2, str3, 0L);
    }
}
