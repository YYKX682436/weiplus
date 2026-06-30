package ls4;

/* loaded from: classes8.dex */
public final class p implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ls4.u f402623a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f402624b;

    public p(ls4.u uVar, long j17) {
        this.f402623a = uVar;
        this.f402624b = j17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar);
        boolean g17 = os4.h.g(fVar);
        ls4.u uVar = this.f402623a;
        if (g17) {
            uVar.d(new pr4.a(pr4.j.f439545d));
        } else {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f resp = fVar.f152151d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp, "resp");
            pm0.v.K(null, new os4.g((r45.js3) resp, uVar.f402633a.f439553a));
            uVar.e();
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f = uVar.f402633a.f439554b;
            long j17 = this.f402624b;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f resp2 = fVar.f152151d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp2, "resp");
            ns4.c0 c0Var = new ns4.c0(activityC1102x9ee2d9f, new ns4.d0(uVar.f402633a, j17, (r45.js3) resp2, new ls4.h(uVar), new ls4.i(uVar), new ls4.j(uVar), new ls4.l(uVar)));
            uVar.f402635c = c0Var;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = c0Var.f420997c;
            y1Var.f293571t = new ls4.o(uVar);
            y1Var.s();
        }
        return jz5.f0.f384359a;
    }
}
