package ls4;

/* loaded from: classes8.dex */
public final class g implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ls4.u f402589a;

    public g(ls4.u uVar) {
        this.f402589a = uVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        ls4.u uVar = this.f402589a;
        uVar.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar);
        if (os4.h.g(fVar)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WeCoinConsumeLogic", "cgi fail: " + fVar);
            uVar.d(new pr4.a(pr4.j.f439545d));
        } else {
            long j17 = ((r45.fs3) fVar.f152151d).f456118d;
            os4.h.l(j17);
            if (j17 >= uVar.f402633a.f439562j) {
                ls4.u.b(uVar);
            } else {
                ls4.u.c(uVar);
            }
        }
        return jz5.f0.f384359a;
    }
}
