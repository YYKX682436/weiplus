package com.p314xaae8f345.mm.p872xbfc2bd01;

/* loaded from: classes8.dex */
public class j implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        int i17;
        for (int i18 = 0; i18 < 10; i18++) {
            com.p314xaae8f345.mm.p872xbfc2bd01.k kVar = com.p314xaae8f345.mm.p872xbfc2bd01.k.f150497d;
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(16384);
            java.lang.Object[] objArr = kVar.f274636a;
            if (objArr != null && (i17 = kVar.f274637b) < objArr.length) {
                objArr[i17] = allocate;
                kVar.f274637b = i17 + 1;
            }
        }
    }
}
