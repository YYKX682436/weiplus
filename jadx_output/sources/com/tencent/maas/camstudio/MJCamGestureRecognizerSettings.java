package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class MJCamGestureRecognizerSettings {
    public MJCamGestureRecognizerSettings(boolean z17, java.util.List<com.tencent.maas.camstudio.p> list) {
    }

    public MJCamGestureRecognizerSettings(boolean z17, int[] iArr) {
        com.tencent.maas.camstudio.p pVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 : iArr) {
            com.tencent.maas.camstudio.p[] values = com.tencent.maas.camstudio.p.values();
            int length = values.length;
            int i18 = 0;
            while (true) {
                if (i18 < length) {
                    pVar = values[i18];
                    if (pVar.f47977d == i17) {
                        break;
                    } else {
                        i18++;
                    }
                } else {
                    pVar = com.tencent.maas.camstudio.p.Invalid;
                    break;
                }
            }
            arrayList.add(pVar);
        }
    }
}
