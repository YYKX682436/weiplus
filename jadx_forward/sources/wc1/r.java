package wc1;

/* loaded from: classes7.dex */
public class r extends wc1.q {

    /* renamed from: CTRL_INDEX */
    public static final int f77349x366c91de = 1183;

    /* renamed from: NAME */
    public static final java.lang.String f77350x24728b = "createLoadSubPackageTaskForWaiter";

    @Override // yc1.b
    public void B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.r2 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p0.a(lVar);
        java.lang.String tag = "AwaitTagLoadSubPackage_" + str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        java.util.concurrent.locks.Condition newCondition = reentrantLock.newCondition();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c5) a17).f171931d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(newCondition);
        concurrentHashMap.put(tag, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b5(reentrantLock, newCondition));
    }

    @Override // wc1.q
    public void D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, ph1.g gVar, java.lang.String str2, java.lang.String str3) {
        super.D(lVar, str, gVar, str2, str3);
        java.lang.String tag = "AwaitTagLoadSubPackage_" + str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c5 c5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c5) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p0.a(lVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b5 b5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b5) c5Var.f171931d.remove(tag);
        if (b5Var != null) {
            c5Var.f171932e.put(tag, gVar);
            java.util.concurrent.locks.ReentrantLock reentrantLock = b5Var.f171924a;
            reentrantLock.lock();
            b5Var.f171925b.signalAll();
            reentrantLock.unlock();
        }
    }
}
