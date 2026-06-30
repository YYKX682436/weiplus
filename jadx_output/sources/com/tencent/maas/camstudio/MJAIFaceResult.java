package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class MJAIFaceResult {

    /* renamed from: a, reason: collision with root package name */
    public final int f47831a;

    /* renamed from: b, reason: collision with root package name */
    public final float f47832b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.maas.camstudio.g f47833c;

    public MJAIFaceResult(int i17, float f17, int i18) {
        com.tencent.maas.camstudio.g gVar;
        this.f47831a = i17;
        this.f47832b = f17;
        com.tencent.maas.camstudio.g[] values = com.tencent.maas.camstudio.g.values();
        int length = values.length;
        int i19 = 0;
        while (true) {
            if (i19 >= length) {
                gVar = com.tencent.maas.camstudio.g.nMJAIGenderTypeUnknown;
                break;
            }
            gVar = values[i19];
            if (gVar.f47941d == i18) {
                break;
            } else {
                i19++;
            }
        }
        this.f47833c = gVar;
    }

    public java.lang.String toString() {
        return "MJAIFaceResult{faceID=" + this.f47831a + ", age=" + this.f47832b + ", gender=" + this.f47833c + '}';
    }
}
