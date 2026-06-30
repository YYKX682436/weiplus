package com.tencent.mm.memory;

/* loaded from: classes8.dex */
public class j implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        int i17;
        for (int i18 = 0; i18 < 10; i18++) {
            com.tencent.mm.memory.k kVar = com.tencent.mm.memory.k.f68964d;
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(16384);
            java.lang.Object[] objArr = kVar.f193103a;
            if (objArr != null && (i17 = kVar.f193104b) < objArr.length) {
                objArr[i17] = allocate;
                kVar.f193104b = i17 + 1;
            }
        }
    }
}
