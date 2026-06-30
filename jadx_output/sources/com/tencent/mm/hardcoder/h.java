package com.tencent.mm.hardcoder;

/* loaded from: classes15.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Queue f68268d = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Thread f68269e = null;

    /* JADX WARN: Can't wrap try/catch for region: R(11:33|(3:135|136|(1:138)(10:139|140|36|37|38|39|40|41|42|(0)(0)))|35|36|37|38|39|40|41|42|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(12:51|(4:52|53|54|55)|(3:69|70|(1:72)(9:73|58|59|61|62|46|(0)|49|50))|57|58|59|61|62|46|(0)|49|50) */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x015b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x015c, code lost:
    
        com.tencent.mm.hardcoder.n.b("Hardcoder.HardCoderUtil", "getThreadCoreId bufferedReader close exception:" + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0141, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0142, code lost:
    
        com.tencent.mm.hardcoder.n.b("Hardcoder.HardCoderUtil", "getThreadCoreId fileReader close exception:" + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0242, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0243, code lost:
    
        r2 = new java.lang.StringBuilder("getCpuFreqByCoreId fileReader close exception:");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0228, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0229, code lost:
    
        com.tencent.mm.hardcoder.n.b("Hardcoder.HardCoderUtil", "getCpuFreqByCoreId bufferedReader close exception:" + r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x031a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f4 A[Catch: all -> 0x0254, Exception -> 0x0259, TRY_LEAVE, TryCatch #28 {Exception -> 0x0259, all -> 0x0254, blocks: (B:42:0x01d6, B:51:0x01f4), top: B:41:0x01d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x028c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0271 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r18, java.util.List r20, int r21, int r22, int r23, int[] r24) {
        /*
            Method dump skipped, instructions count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.hardcoder.h.a(long, java.util.List, int, int, int, int[]):void");
    }

    public void finalize() {
        super.finalize();
        ((java.util.concurrent.ConcurrentLinkedQueue) this.f68268d).clear();
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.hardcoder.n.c("Hardcoder.HCPerfStatThread", "HCPerfStatThread start to run.");
        if (java.lang.Thread.currentThread() == null) {
            com.tencent.mm.hardcoder.n.b("Hardcoder.HCPerfStatThread", "run error, current thread is null!");
            return;
        }
        while (java.lang.Thread.currentThread() != null && !java.lang.Thread.currentThread().isInterrupted()) {
            try {
                if (((java.util.concurrent.ConcurrentLinkedQueue) this.f68268d).isEmpty()) {
                    synchronized (this) {
                        while (((java.util.concurrent.ConcurrentLinkedQueue) this.f68268d).isEmpty()) {
                            wait();
                        }
                    }
                } else {
                    java.lang.Object poll = ((java.util.concurrent.ConcurrentLinkedQueue) this.f68268d).poll();
                    if (poll instanceof com.tencent.mm.hardcoder.g) {
                        com.tencent.mm.hardcoder.g gVar = (com.tencent.mm.hardcoder.g) poll;
                        a(gVar.f68262a, gVar.f68263b, gVar.f68264c, gVar.f68265d, gVar.f68266e, gVar.f68267f);
                    } else if (poll instanceof com.tencent.mm.hardcoder.d) {
                        com.tencent.mm.hardcoder.p.a((com.tencent.mm.hardcoder.d) poll);
                    }
                }
            } catch (java.lang.InterruptedException e17) {
                com.tencent.mm.hardcoder.n.b("Hardcoder.HCPerfStatThread", "Performance status thread need to interrupt:" + e17.getMessage());
                java.lang.Thread.currentThread().interrupt();
                return;
            } catch (java.lang.Exception e18) {
                java.lang.Object[] objArr = new java.lang.Object[0];
                com.tencent.mm.hardcoder.m mVar = com.tencent.mm.hardcoder.n.f68276a;
                if (mVar != null) {
                    mVar.printErrStackTrace("Hardcoder.HCPerfStatThread", e18, "run exception:", objArr);
                }
            }
        }
    }
}
