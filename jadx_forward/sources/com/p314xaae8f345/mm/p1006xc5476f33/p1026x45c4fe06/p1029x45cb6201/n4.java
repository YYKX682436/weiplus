package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public class n4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o4 f157216d;

    public n4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o4 o4Var) {
        this.f157216d = o4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o4 o4Var = this.f157216d;
        int incrementAndGet = o4Var.f157232d.incrementAndGet();
        o4Var.getClass();
        if (incrementAndGet == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r4.q(o4Var.f157233e.f157251d, "公共库增量并发执行完成，重启确认");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r4 r4Var = o4Var.f157233e.f157251d;
        o4Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r4.q(r4Var, "公共库增量" + incrementAndGet + "/3");
    }
}
