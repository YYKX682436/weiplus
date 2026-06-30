package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class MJAIGCServiceMediaFile {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.camstudio.h f47848a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f47849b;

    public MJAIGCServiceMediaFile(com.tencent.maas.camstudio.h hVar, java.lang.String str) {
        this.f47848a = hVar;
        this.f47849b = str;
    }

    public java.lang.String getMediaFileURL() {
        return this.f47849b;
    }

    public int getMediaTypeValue() {
        return this.f47848a.f47956d;
    }

    public java.lang.String toString() {
        return "MJAIGCServiceMediaFile{mediaType=" + this.f47848a + ", mediaFileURL='" + this.f47849b + "'}";
    }

    public MJAIGCServiceMediaFile(int i17, java.lang.String str) {
        com.tencent.maas.camstudio.h hVar;
        com.tencent.maas.camstudio.h[] values = com.tencent.maas.camstudio.h.values();
        int length = values.length;
        int i18 = 0;
        while (true) {
            if (i18 < length) {
                hVar = values[i18];
                if (hVar.f47956d == i17) {
                    break;
                } else {
                    i18++;
                }
            } else {
                hVar = com.tencent.maas.camstudio.h.nMJAIMediaTypeInvalid;
                break;
            }
        }
        this.f47848a = hVar;
        this.f47849b = str;
    }
}
