package com.p314xaae8f345.p457x3304c6.p461x3a6d265;

/* renamed from: com.tencent.maas.camstudio.MJAIGCServiceMediaFile */
/* loaded from: classes5.dex */
public class C3994x6054d88c {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p461x3a6d265.h f129381a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f129382b;

    public C3994x6054d88c(com.p314xaae8f345.p457x3304c6.p461x3a6d265.h hVar, java.lang.String str) {
        this.f129381a = hVar;
        this.f129382b = str;
    }

    /* renamed from: getMediaFileURL */
    public java.lang.String m32502x2f266445() {
        return this.f129382b;
    }

    /* renamed from: getMediaTypeValue */
    public int m32503x6c9da3c9() {
        return this.f129381a.f129489d;
    }

    /* renamed from: toString */
    public java.lang.String m32504x9616526c() {
        return "MJAIGCServiceMediaFile{mediaType=" + this.f129381a + ", mediaFileURL='" + this.f129382b + "'}";
    }

    public C3994x6054d88c(int i17, java.lang.String str) {
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.h hVar;
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.h[] m32915xcee59d22 = com.p314xaae8f345.p457x3304c6.p461x3a6d265.h.m32915xcee59d22();
        int length = m32915xcee59d22.length;
        int i18 = 0;
        while (true) {
            if (i18 < length) {
                hVar = m32915xcee59d22[i18];
                if (hVar.f129489d == i17) {
                    break;
                } else {
                    i18++;
                }
            } else {
                hVar = com.p314xaae8f345.p457x3304c6.p461x3a6d265.h.nMJAIMediaTypeInvalid;
                break;
            }
        }
        this.f129381a = hVar;
        this.f129382b = str;
    }
}
