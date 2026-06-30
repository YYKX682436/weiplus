package org.p3343x72743996.net;

@org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29387x20efb56(m152783x6ac9171 = "net::android")
/* renamed from: org.chromium.net.DnsStatus */
/* loaded from: classes13.dex */
public class C29504x5c8e1e5b {

    /* renamed from: mDnsServers */
    private final java.util.List<java.net.InetAddress> f73810x81ed5474;

    /* renamed from: mPrivateDnsActive */
    private final boolean f73811x6dd4f5d9;

    /* renamed from: mPrivateDnsServerName */
    private final java.lang.String f73812x5bf99c1;

    /* renamed from: mSearchDomains */
    private final java.lang.String f73813x170cd1fa;

    public C29504x5c8e1e5b(java.util.List<java.net.InetAddress> list, boolean z17, java.lang.String str, java.lang.String str2) {
        this.f73810x81ed5474 = list;
        this.f73811x6dd4f5d9 = z17;
        this.f73812x5bf99c1 = str == null ? "" : str;
        this.f73813x170cd1fa = str2 == null ? "" : str2;
    }

    /* renamed from: getDnsServers */
    public byte[][] m153231x93fc141d() {
        byte[][] bArr = new byte[this.f73810x81ed5474.size()];
        for (int i17 = 0; i17 < this.f73810x81ed5474.size(); i17++) {
            bArr[i17] = this.f73810x81ed5474.get(i17).getAddress();
        }
        return bArr;
    }

    /* renamed from: getPrivateDnsActive */
    public boolean m153232xef9592c2() {
        return this.f73811x6dd4f5d9;
    }

    /* renamed from: getPrivateDnsServerName */
    public java.lang.String m153233x4aa59a2a() {
        return this.f73812x5bf99c1;
    }

    /* renamed from: getSearchDomains */
    public java.lang.String m153234x795e85b1() {
        return this.f73813x170cd1fa;
    }
}
