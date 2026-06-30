package com.p314xaae8f345.p457x3304c6.p461x3a6d265;

/* renamed from: com.tencent.maas.camstudio.MJCDNUploadRequest */
/* loaded from: classes5.dex */
public class C4005xdbfc01de {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f129402a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p461x3a6d265.o f129403b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f129404c;

    public C4005xdbfc01de(java.lang.String str, int i17, java.lang.String str2) {
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.o oVar;
        this.f129402a = str;
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.o[] m32921xcee59d22 = com.p314xaae8f345.p457x3304c6.p461x3a6d265.o.m32921xcee59d22();
        int length = m32921xcee59d22.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                oVar = com.p314xaae8f345.p457x3304c6.p461x3a6d265.o.AIGC;
                break;
            }
            oVar = m32921xcee59d22[i18];
            oVar.getClass();
            if (i17 == 0) {
                break;
            } else {
                i18++;
            }
        }
        this.f129403b = oVar;
        this.f129404c = str2;
    }

    /* renamed from: toString */
    public java.lang.String m32596x9616526c() {
        return "MJCDNUploadRequest{taskKey='" + this.f129402a + "', cdnScene=" + this.f129403b + ", filePath='" + this.f129404c + "'}";
    }
}
