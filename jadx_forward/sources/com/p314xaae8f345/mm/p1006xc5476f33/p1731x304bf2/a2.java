package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2;

/* loaded from: classes8.dex */
public class a2 implements java.lang.Runnable {
    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.y1 y1Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            java.util.LinkedList J0 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ai().J0(0);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(J0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginGame", "checkHaowanPublishState none");
                return;
            }
            java.util.Iterator it = J0.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ai().W0(((i53.x) it.next()).f67215x11522065, 1);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PluginGame", e17, "", new java.lang.Object[0]);
        }
    }
}
