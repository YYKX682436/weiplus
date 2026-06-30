package h63;

/* loaded from: classes7.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f360763d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f360764e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360765f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f360766g;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, android.content.Context context, java.lang.String str, int i17) {
        this.f360763d = o6Var;
        this.f360764e = context;
        this.f360765f = str;
        this.f360766g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 N2 = this.f360763d.N2();
        ce.g gVar = N2 != null ? (ce.g) N2.B1(ce.g.class) : null;
        if (gVar != null) {
            ((ce.o) gVar).V(true, false, new de.c());
        }
        java.lang.String str = this.f360765f;
        int i17 = this.f360766g;
        h63.v[] vVarArr = h63.v.f360817d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.C16049x1ab5a75f c16049x1ab5a75f = new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.C16049x1ab5a75f(str, i17, 1, 0, null, null, 0, 0L, 248, null);
        h63.f0 f0Var = h63.f0.f360761a;
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.f159933a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.W6(this.f360764e, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class, c16049x1ab5a75f, f0Var, null);
    }
}
