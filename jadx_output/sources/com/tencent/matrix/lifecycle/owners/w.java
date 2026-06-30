package com.tencent.matrix.lifecycle.owners;

/* loaded from: classes12.dex */
public final class w implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
        com.tencent.matrix.lifecycle.owners.f0.f52739u = true;
        java.util.HashSet hashSet = com.tencent.matrix.lifecycle.owners.f0.f52738t;
        synchronized (hashSet) {
            java.util.Iterator it = new java.util.ArrayList(hashSet).iterator();
            while (it.hasNext()) {
                ((ei.a) it.next()).a(true);
            }
        }
    }
}
