package de3;

/* loaded from: classes7.dex */
public enum b {
    ;

    public static synchronized java.util.Map a(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.WebPageProfile webPageProfile) {
        java.util.HashMap hashMap;
        synchronized (de3.b.class) {
            hashMap = new java.util.HashMap();
            if (webPageProfile != null) {
                hashMap.put("redirectStart", java.lang.Long.valueOf(webPageProfile.f18249xdcf765e6));
                hashMap.put("redirectEnd", java.lang.Long.valueOf(webPageProfile.f18248x7570bb5f));
                hashMap.put("fetchStart", java.lang.Long.valueOf(webPageProfile.f18241x1193f1c8));
                hashMap.put("domainLookUpStart", java.lang.Long.valueOf(webPageProfile.f18239x73018f84));
                hashMap.put("domainLookUpEnd", java.lang.Long.valueOf(webPageProfile.f18238x4494b47d));
                hashMap.put("connectStart", java.lang.Long.valueOf(webPageProfile.f18237x716c5d98));
                hashMap.put("connectEnd", java.lang.Long.valueOf(webPageProfile.f18236xd1c3f791));
                hashMap.put("SSLconnectionStart", java.lang.Long.valueOf(webPageProfile.f18235x4a318b8));
                hashMap.put("SSLconnectionEnd", java.lang.Long.valueOf(webPageProfile.f18234x33aefab1));
                hashMap.put("requestStart", java.lang.Long.valueOf(webPageProfile.f18251x4d052313));
                hashMap.put("requestEnd", java.lang.Long.valueOf(webPageProfile.f18250x235dfcc));
                hashMap.put("responseStart", java.lang.Long.valueOf(webPageProfile.f18253x634840a1));
                hashMap.put("responseEnd", java.lang.Long.valueOf(webPageProfile.f18252x6e1f08da));
                hashMap.put("rtt", java.lang.Integer.valueOf(webPageProfile.rtt));
                hashMap.put("estimate_nettype", java.lang.Integer.valueOf(webPageProfile.f18243x64c417d0));
                hashMap.put("httpRttEstimate", java.lang.Integer.valueOf(webPageProfile.f18242x6b4f2c12));
                hashMap.put("transportRttEstimate", java.lang.Integer.valueOf(webPageProfile.f18258x16957ed1));
                hashMap.put("downstreamThroughputKbpsEstimate", java.lang.Integer.valueOf(webPageProfile.f18240xf406656e));
                hashMap.put("throughputKbps", java.lang.Integer.valueOf(webPageProfile.f18257xad79e6e4));
                hashMap.put("peerIP", webPageProfile.f18244xc4ddaa09);
                hashMap.put("port", java.lang.Integer.valueOf(webPageProfile.f18245x349881));
                hashMap.put("protocol", webPageProfile.f18246xc50a8e98);
                hashMap.put("socketReused", java.lang.Boolean.valueOf(webPageProfile.f18255xfad511c3));
                hashMap.put("sendBytesCount", java.lang.Long.valueOf(webPageProfile.f18254xd0450d0c));
                hashMap.put("receivedBytedCount", java.lang.Long.valueOf(webPageProfile.f18247x806c1ad4));
            }
        }
        return hashMap;
    }

    /* renamed from: valueOf */
    public static de3.b m124122xdce0328(java.lang.String str) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(java.lang.Enum.valueOf(de3.b.class, str));
        return null;
    }
}
