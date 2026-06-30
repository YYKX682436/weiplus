package vd1;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.util.SparseArray f517095a = new android.util.SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final vd1.a f517096b = new vd1.a();

    public final void a() {
        this.f517096b.f517093a.clear();
        android.util.SparseArray sparseArray = this.f517095a;
        synchronized (sparseArray) {
            sparseArray.clear();
        }
    }

    public final void b(int i17, java.lang.String ret) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        android.util.SparseArray sparseArray = this.f517095a;
        synchronized (sparseArray) {
            obj = sparseArray.get(i17, null);
            if (obj != null) {
                sparseArray.remove(i17);
            }
        }
        vd1.g gVar = (vd1.g) obj;
        if (gVar == null) {
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - gVar.f517116d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = gVar.f517113a;
        java.lang.String mo48798x74292566 = d0Var != null ? d0Var.mo48798x74292566() : null;
        java.lang.String str = gVar.f517117e;
        java.lang.String k17 = gVar.f517114b.k();
        java.lang.String str2 = gVar.f517115c;
        int i18 = gVar.f517118f;
        java.util.Set set = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.e0.f169470a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo48798x74292566)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.c0) ((java.util.concurrent.ConcurrentLinkedQueue) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.e0.f169472c.f169469a).poll();
            if (c0Var == null) {
                c0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.c0(null);
            }
            c0Var.f169462d = mo48798x74292566;
            c0Var.f169463e = str;
            c0Var.f169464f = k17;
            c0Var.f169465g = str2;
            c0Var.f169466h = i18;
            c0Var.f169467i = elapsedRealtime;
            c0Var.f169468m = ret;
            ((java.util.concurrent.AbstractExecutorService) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.e0.f169471b).submit(c0Var);
        }
        vd1.a aVar = this.f517096b;
        aVar.getClass();
        aVar.f517093a.offer(gVar);
    }
}
