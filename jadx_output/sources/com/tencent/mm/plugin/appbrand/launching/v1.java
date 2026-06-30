package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class v1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.w1 f85245d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(com.tencent.mm.plugin.appbrand.launching.w1 w1Var) {
        super(1);
        this.f85245d = w1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader reader = (com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader) obj;
        kotlin.jvm.internal.o.g(reader, "reader");
        if (!this.f85245d.f85315b.get()) {
            com.tencent.mm.plugin.appbrand.launching.w1 w1Var = this.f85245d;
            java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = w1Var.f85318e;
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            int i17 = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i18 = 0; i18 < readHoldCount; i18++) {
                readLock.unlock();
            }
            java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                w1Var.f85314a = reader;
                while (!w1Var.f85317d.isEmpty()) {
                    yz5.l lVar = (yz5.l) w1Var.f85317d.poll();
                    if (lVar != null) {
                        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader = w1Var.f85314a;
                        kotlin.jvm.internal.o.d(iCommLibReader);
                        lVar.invoke(iCommLibReader);
                    }
                }
            } finally {
                while (i17 < readHoldCount) {
                    readLock.lock();
                    i17++;
                }
                writeLock.unlock();
            }
        }
        return jz5.f0.f302826a;
    }
}
