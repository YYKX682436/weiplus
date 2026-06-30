package fg;

/* loaded from: classes7.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg.b0 f343349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fg.g f343350e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fg.i f343351f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f343352g;

    public y(fg.b0 b0Var, fg.g gVar, fg.i iVar, boolean z17) {
        this.f343349d = b0Var;
        this.f343350e = gVar;
        this.f343351f = iVar;
        this.f343352g = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fg.b0 b0Var = this.f343349d;
        if (b0Var.f343266j) {
            boolean z17 = this.f343351f.f343299b;
            fg.g gVar = this.f343350e;
            gVar.a(z17);
            if (this.f343352g) {
                int measuredHeight = gVar.mo129516xfb86a31b().getMeasuredHeight();
                sf.c cVar = sf.c.f488472a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar = b0Var.f343260d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oaVar);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t a17 = oaVar.a();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar2 = b0Var.f343260d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oaVar2);
                cVar.a(a17, oaVar2.b(), new sf.b(measuredHeight, b0Var.d(measuredHeight), b0Var.f343268l, new fg.w(b0Var, measuredHeight)));
                return;
            }
            sf.c cVar2 = sf.c.f488472a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar3 = b0Var.f343260d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oaVar3);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t a18 = oaVar3.a();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar4 = b0Var.f343260d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oaVar4);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l b17 = oaVar4.b();
            int i17 = b0Var.f343265i;
            cVar2.a(a18, b17, new sf.b(i17, b0Var.d(i17), b0Var.f343268l, new fg.x(b0Var)));
        }
    }
}
