package com.p314xaae8f345.p457x3304c6.p461x3a6d265;

/* renamed from: com.tencent.maas.camstudio.MJCamGestureRecognizerSettings */
/* loaded from: classes5.dex */
public class C4008x4d8fb63e {
    public C4008x4d8fb63e(boolean z17, java.util.List<com.p314xaae8f345.p457x3304c6.p461x3a6d265.p> list) {
    }

    public C4008x4d8fb63e(boolean z17, int[] iArr) {
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.p pVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 : iArr) {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.p[] m32924xcee59d22 = com.p314xaae8f345.p457x3304c6.p461x3a6d265.p.m32924xcee59d22();
            int length = m32924xcee59d22.length;
            int i18 = 0;
            while (true) {
                if (i18 < length) {
                    pVar = m32924xcee59d22[i18];
                    if (pVar.f129510d == i17) {
                        break;
                    } else {
                        i18++;
                    }
                } else {
                    pVar = com.p314xaae8f345.p457x3304c6.p461x3a6d265.p.Invalid;
                    break;
                }
            }
            arrayList.add(pVar);
        }
    }
}
