package fh1;

/* loaded from: classes7.dex */
public final class k0 {
    public k0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    /* JADX WARN: Finally extract failed */
    public final void a(java.lang.String bizInstance, java.lang.String appId, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1151x2011485b.p1153x32add612.C12411x6bc6c745 initArgs, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 pkgWrappingInfo) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizInstance, "bizInstance");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initArgs, "initArgs");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgWrappingInfo, "pkgWrappingInfo");
        i95.n0.c(fh1.f0.class);
        fh1.l0 l0Var = (fh1.l0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.class))).Vi(bizInstance, initArgs);
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = l0Var.f344097i;
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i17 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i18 = 0; i18 < readHoldCount; i18++) {
            readLock.unlock();
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = l0Var.f344096h;
        try {
            fj1.t tVar = (fj1.t) concurrentHashMap.get(appId);
            if (tVar != null) {
                str = "merge";
                tVar.f344671b.o(kz5.n0.S0(pkgWrappingInfo));
            } else {
                str = "";
                tVar = null;
            }
            if (tVar == null) {
                str = "insert";
                concurrentHashMap.put(appId, new fj1.t(appId, pkgWrappingInfo));
            }
            while (i17 < readHoldCount) {
                readLock.lock();
                i17++;
            }
            writeLock.unlock();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var.f344093e, "registerPkgReader appId:" + appId + ", operation:" + str);
        } catch (java.lang.Throwable th6) {
            while (i17 < readHoldCount) {
                readLock.lock();
                i17++;
            }
            writeLock.unlock();
            throw th6;
        }
    }
}
