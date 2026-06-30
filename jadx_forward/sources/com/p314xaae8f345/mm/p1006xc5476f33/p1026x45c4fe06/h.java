package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class h implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        boolean isEmpty;
        java.util.LinkedHashMap linkedHashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.f165742b;
        synchronized (linkedHashMap) {
            isEmpty = linkedHashMap.isEmpty();
        }
        if (isEmpty) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.v0.LOW_MEMORY);
        }
    }
}
