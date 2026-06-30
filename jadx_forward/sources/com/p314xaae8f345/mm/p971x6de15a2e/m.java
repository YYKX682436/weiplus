package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes4.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f153600a;

    /* renamed from: b, reason: collision with root package name */
    public java.net.URL f153601b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f153602c;

    /* renamed from: d, reason: collision with root package name */
    public int f153603d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f153604e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f153605f;

    public m(java.lang.String str) {
        this.f153600a = null;
        this.f153601b = null;
        this.f153602c = "";
        this.f153603d = 0;
        new java.util.ArrayList();
        this.f153605f = false;
        this.f153604e = str;
        try {
            java.net.URL url = new java.net.URL(str);
            this.f153601b = url;
            java.lang.String host = url.getHost();
            this.f153600a = host;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.mm.p971x6de15a2e.l lVar = com.p314xaae8f345.mm.p971x6de15a2e.n.f153618a;
            if (lVar != null && lVar.a() != null) {
                this.f153603d = com.p314xaae8f345.mm.p971x6de15a2e.n.f153618a.a().mo48027x8faab340(host, arrayList);
                if (arrayList.size() <= 0) {
                    this.f153603d = 0;
                    return;
                }
                if (1 != this.f153603d) {
                    return;
                }
                java.lang.String str2 = (java.lang.String) arrayList.remove(0);
                this.f153602c = str2;
                if (a(str2)) {
                    str2 = "[" + str2 + "]";
                }
                this.f153601b = new java.net.URL(str.replaceFirst(host, str2));
                return;
            }
            java.lang.Object[] objArr = new java.lang.Object[2];
            com.p314xaae8f345.mm.p971x6de15a2e.l lVar2 = com.p314xaae8f345.mm.p971x6de15a2e.n.f153618a;
            objArr[0] = lVar2 == null ? "-1" : lVar2.a();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            objArr[1] = new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GprsSetting", "UrlRedirct ERR:AUTOAUTH NULL:%s  [%s]", objArr);
        } catch (java.lang.Exception e17) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GprsSetting", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    public final boolean a(java.lang.String str) {
        try {
            return !(java.net.InetAddress.getByName(str) instanceof java.net.Inet4Address);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GprsSetting", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return !str.contains(".");
        }
    }

    public m(java.lang.String str, boolean z17) {
        this.f153600a = null;
        this.f153601b = null;
        this.f153602c = "";
        this.f153603d = 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f153605f = z17;
        this.f153604e = str;
        try {
            java.net.URL url = new java.net.URL(str);
            this.f153601b = url;
            java.lang.String host = url.getHost();
            this.f153600a = host;
            com.p314xaae8f345.mm.p971x6de15a2e.l lVar = com.p314xaae8f345.mm.p971x6de15a2e.n.f153618a;
            if (lVar != null && lVar.a() != null) {
                this.f153603d = com.p314xaae8f345.mm.p971x6de15a2e.n.f153618a.a().D0(host, z17, arrayList);
                if (arrayList.size() <= 0) {
                    this.f153603d = 0;
                    return;
                }
                if (1 != this.f153603d) {
                    return;
                }
                java.lang.String str2 = (java.lang.String) arrayList.remove(0);
                this.f153602c = str2;
                if (a(str2)) {
                    this.f153602c = "[" + this.f153602c + "]";
                }
                this.f153601b = new java.net.URL(str.replaceFirst(host, this.f153602c));
                return;
            }
            java.lang.Object[] objArr = new java.lang.Object[2];
            com.p314xaae8f345.mm.p971x6de15a2e.l lVar2 = com.p314xaae8f345.mm.p971x6de15a2e.n.f153618a;
            objArr[0] = lVar2 == null ? "-1" : lVar2.a();
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            objArr[1] = new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GprsSetting", "UrlRedirct ERR:AUTOAUTH NULL:%s  [%s]", objArr);
        } catch (java.lang.Exception e17) {
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GprsSetting", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }
}
