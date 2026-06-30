package fg;

/* loaded from: classes7.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg.g f343255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fg.b0 f343256e;

    public a0(fg.g gVar, fg.b0 b0Var) {
        this.f343255d = gVar;
        this.f343256e = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int measuredHeight = this.f343255d.mo129516xfb86a31b().getMeasuredHeight();
        sf.c cVar = sf.c.f488472a;
        fg.b0 b0Var = this.f343256e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar = b0Var.f343260d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oaVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t a17 = oaVar.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar2 = b0Var.f343260d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oaVar2);
        cVar.a(a17, oaVar2.b(), new sf.b(measuredHeight, b0Var.d(measuredHeight), b0Var.f343268l, new fg.z(b0Var, measuredHeight)));
    }
}
