package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class mj implements com.p314xaae8f345.map.p511x696c9db.net.p517xbebf4c92.InterfaceC4349x3c5d2ee3 {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> f131954a;

    public mj(java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> hashMap) {
        this.f131954a = hashMap;
    }

    @Override // com.p314xaae8f345.map.p511x696c9db.net.p517xbebf4c92.InterfaceC4349x3c5d2ee3
    /* renamed from: onRequest */
    public final void mo36059x90f4f3b0(com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 c4329xa3f02252) {
        java.util.Map<java.lang.String, java.lang.String> map;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329.RegionName regionName = c4329xa3f02252.f16963x658a73ec;
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.A, "RegionHostProcessor Region:" + regionName + " HostList:" + this.f131954a);
        java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> hashMap = this.f131954a;
        if (hashMap == null || hashMap.isEmpty() || regionName == com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329.RegionName.EARTH || (map = this.f131954a.get(regionName.name())) == null) {
            return;
        }
        android.net.Uri parse = android.net.Uri.parse(c4329xa3f02252.url);
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            if (entry.getKey().equals(parse.getHost())) {
                java.lang.String uri = parse.buildUpon().encodedAuthority(entry.getValue()).build().toString();
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.A, "RegionHostProcessor change host from Url " + c4329xa3f02252.url + " to " + uri);
                c4329xa3f02252.m35988xca029dad(uri);
            }
        }
    }
}
