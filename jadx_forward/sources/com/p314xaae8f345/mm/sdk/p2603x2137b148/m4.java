package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes7.dex */
public class m4 implements kk.h {
    @Override // kk.h
    public void a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) obj2;
        if (((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) obj3) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiProcessMMKV", "preRemoveCallback newValue == null, name = " + ((java.lang.String) o4Var.f274432e.first));
            if (o4Var.U()) {
                java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = o4Var.f274435h;
                writeLock.lock();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiProcessMMKV", "preRemoveCallback MMKV : %s, will be closed, my hashcode = %d, coreMMKV hashcode = %d", o4Var.f274432e.first, java.lang.Integer.valueOf(o4Var.hashCode()), java.lang.Integer.valueOf(o4Var.f274431d.hashCode()));
                o4Var.f274431d.m84047x5a5ddf8();
                writeLock.unlock();
            } else {
                o4Var.f274431d.m84047x5a5ddf8();
                o4Var.f274431d = null;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiProcessMMKV", "preRemoveCallback done, name = " + ((java.lang.String) o4Var.f274432e.first));
    }
}
