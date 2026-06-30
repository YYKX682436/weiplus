package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class MJCDNDownloadRequest {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f47865a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.camstudio.o f47866b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f47867c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f47868d;

    public MJCDNDownloadRequest(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        com.tencent.maas.camstudio.o oVar;
        this.f47865a = str;
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
        this.f47866b = oVar;
        this.f47867c = str2;
        this.f47868d = str3;
    }

    public java.lang.String toString() {
        return "MJCDNUploadRequest{taskKey='" + this.f47865a + "', cdnScene=" + this.f47866b + ", resultFilePath='" + this.f47868d + "'}";
    }
}
