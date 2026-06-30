package n91;

/* loaded from: classes7.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f417427d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        this.f417427d = o6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final n91.g gVar = this.f417427d.K2;
        if (gVar != null) {
            if (gVar.f417406c.ordinal() >= 2) {
                gVar.a();
                return;
            }
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: n91.g$$b
                @Override // java.lang.Runnable
                public final void run() {
                    n91.g.this.a();
                }
            };
            if (gVar.f417406c.ordinal() >= 3) {
                runnable.run();
            } else {
                gVar.f417407d.add(runnable);
            }
        }
    }
}
