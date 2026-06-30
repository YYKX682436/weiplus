package com.tencent.mm.network;

/* loaded from: classes4.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f72067a;

    /* renamed from: b, reason: collision with root package name */
    public java.net.URL f72068b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f72069c;

    /* renamed from: d, reason: collision with root package name */
    public int f72070d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f72071e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f72072f;

    public m(java.lang.String str) {
        this.f72067a = null;
        this.f72068b = null;
        this.f72069c = "";
        this.f72070d = 0;
        new java.util.ArrayList();
        this.f72072f = false;
        this.f72071e = str;
        try {
            java.net.URL url = new java.net.URL(str);
            this.f72068b = url;
            java.lang.String host = url.getHost();
            this.f72067a = host;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.mm.network.l lVar = com.tencent.mm.network.n.f72085a;
            if (lVar != null && lVar.a() != null) {
                this.f72070d = com.tencent.mm.network.n.f72085a.a().getHostByName(host, arrayList);
                if (arrayList.size() <= 0) {
                    this.f72070d = 0;
                    return;
                }
                if (1 != this.f72070d) {
                    return;
                }
                java.lang.String str2 = (java.lang.String) arrayList.remove(0);
                this.f72069c = str2;
                if (a(str2)) {
                    str2 = "[" + str2 + "]";
                }
                this.f72068b = new java.net.URL(str.replaceFirst(host, str2));
                return;
            }
            java.lang.Object[] objArr = new java.lang.Object[2];
            com.tencent.mm.network.l lVar2 = com.tencent.mm.network.n.f72085a;
            objArr[0] = lVar2 == null ? "-1" : lVar2.a();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            objArr[1] = new com.tencent.mm.sdk.platformtools.z3();
            com.tencent.mars.xlog.Log.e("MicroMsg.GprsSetting", "UrlRedirct ERR:AUTOAUTH NULL:%s  [%s]", objArr);
        } catch (java.lang.Exception e17) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.GprsSetting", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    public final boolean a(java.lang.String str) {
        try {
            return !(java.net.InetAddress.getByName(str) instanceof java.net.Inet4Address);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.GprsSetting", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return !str.contains(".");
        }
    }

    public m(java.lang.String str, boolean z17) {
        this.f72067a = null;
        this.f72068b = null;
        this.f72069c = "";
        this.f72070d = 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f72072f = z17;
        this.f72071e = str;
        try {
            java.net.URL url = new java.net.URL(str);
            this.f72068b = url;
            java.lang.String host = url.getHost();
            this.f72067a = host;
            com.tencent.mm.network.l lVar = com.tencent.mm.network.n.f72085a;
            if (lVar != null && lVar.a() != null) {
                this.f72070d = com.tencent.mm.network.n.f72085a.a().D0(host, z17, arrayList);
                if (arrayList.size() <= 0) {
                    this.f72070d = 0;
                    return;
                }
                if (1 != this.f72070d) {
                    return;
                }
                java.lang.String str2 = (java.lang.String) arrayList.remove(0);
                this.f72069c = str2;
                if (a(str2)) {
                    this.f72069c = "[" + this.f72069c + "]";
                }
                this.f72068b = new java.net.URL(str.replaceFirst(host, this.f72069c));
                return;
            }
            java.lang.Object[] objArr = new java.lang.Object[2];
            com.tencent.mm.network.l lVar2 = com.tencent.mm.network.n.f72085a;
            objArr[0] = lVar2 == null ? "-1" : lVar2.a();
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            objArr[1] = new com.tencent.mm.sdk.platformtools.z3();
            com.tencent.mars.xlog.Log.e("MicroMsg.GprsSetting", "UrlRedirct ERR:AUTOAUTH NULL:%s  [%s]", objArr);
        } catch (java.lang.Exception e17) {
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.GprsSetting", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }
}
