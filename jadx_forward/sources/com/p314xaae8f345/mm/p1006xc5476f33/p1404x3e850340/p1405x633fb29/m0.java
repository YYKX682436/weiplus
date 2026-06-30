package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29;

/* loaded from: classes14.dex */
public class m0 implements java.util.Comparator {
    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.l0 l0Var) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        android.hardware.Camera.Size size = (android.hardware.Camera.Size) obj;
        android.hardware.Camera.Size size2 = (android.hardware.Camera.Size) obj2;
        int i17 = size.height * size.width;
        int i18 = size2.height * size2.width;
        if (i18 < i17) {
            return -1;
        }
        return i18 > i17 ? 1 : 0;
    }
}
