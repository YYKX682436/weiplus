package zl1;

/* loaded from: classes7.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zl1.p f555135d;

    public o(zl1.p pVar) {
        this.f555135d = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        zl1.p pVar = this.f555135d;
        if (pVar.f555137e.getParent() instanceof zl1.q) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.l2) ((zl1.q) pVar.f555137e.getParent())).a(pVar.f555137e, true);
        }
    }
}
