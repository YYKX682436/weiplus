package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class h implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        boolean isEmpty;
        java.util.LinkedHashMap linkedHashMap = com.tencent.mm.plugin.appbrand.l.f84209b;
        synchronized (linkedHashMap) {
            isEmpty = linkedHashMap.isEmpty();
        }
        if (isEmpty) {
            com.tencent.mm.plugin.appbrand.app.r0.c(com.tencent.mm.plugin.appbrand.app.v0.LOW_MEMORY);
        }
    }
}
