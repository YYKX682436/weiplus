package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class MJCDNUploadRequest {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f47869a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.camstudio.o f47870b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f47871c;

    public MJCDNUploadRequest(java.lang.String str, int i17, java.lang.String str2) {
        com.tencent.maas.camstudio.o oVar;
        this.f47869a = str;
        com.tencent.maas.camstudio.o[] values = com.tencent.maas.camstudio.o.values();
        int length = values.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                oVar = com.tencent.maas.camstudio.o.AIGC;
                break;
            }
            oVar = values[i18];
            oVar.getClass();
            if (i17 == 0) {
                break;
            } else {
                i18++;
            }
        }
        this.f47870b = oVar;
        this.f47871c = str2;
    }

    public java.lang.String toString() {
        return "MJCDNUploadRequest{taskKey='" + this.f47869a + "', cdnScene=" + this.f47870b + ", filePath='" + this.f47871c + "'}";
    }
}
