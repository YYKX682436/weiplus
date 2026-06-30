package qc1;

/* loaded from: classes7.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f443000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f443001e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f443002f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qc1.k f443003g;

    public j(qc1.k kVar, java.lang.ref.WeakReference weakReference, int i17, int i18) {
        this.f443003g = kVar;
        this.f443000d = weakReference;
        this.f443001e = i17;
        this.f443002f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) this.f443000d.get();
        if (v5Var == null) {
            return;
        }
        if (v5Var.F1() != null) {
            v5Var.F1().mo48674x36654fab();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r1.a(v5Var, this.f443001e);
        v5Var.a(this.f443002f, this.f443003g.o(a17 != null && a17.a() ? "ok" : "fail"));
    }
}
