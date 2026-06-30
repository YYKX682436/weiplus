package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class v1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.w1 f166778d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.w1 w1Var) {
        super(1);
        this.f166778d = w1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 reader = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reader, "reader");
        if (!this.f166778d.f166848b.get()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.w1 w1Var = this.f166778d;
            java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = w1Var.f166851e;
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            int i17 = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i18 = 0; i18 < readHoldCount; i18++) {
                readLock.unlock();
            }
            java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                w1Var.f166847a = reader;
                while (!w1Var.f166850d.isEmpty()) {
                    yz5.l lVar = (yz5.l) w1Var.f166850d.poll();
                    if (lVar != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33 = w1Var.f166847a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(interfaceC11702x4ae7c33);
                        lVar.mo146xb9724478(interfaceC11702x4ae7c33);
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
        return jz5.f0.f384359a;
    }
}
