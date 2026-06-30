package fz;

@j95.b
/* loaded from: classes12.dex */
public final class l extends i95.w implements cp.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f348809d = mm.k.j(mm.k.C1, null, 1, null);

    /* renamed from: e, reason: collision with root package name */
    public boolean f348810e = mm.k.j(mm.k.D1, null, 1, null);

    public void Ai(java.lang.String tag, java.lang.Runnable runnable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runnable, "runnable");
        if (wi()) {
            ((ku5.t0) ku5.t0.f394148d).h(runnable, tag);
        } else {
            gm0.j1.e().j(runnable);
        }
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40963x40b15f2e(new fz.k(this));
    }

    public boolean wi() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && (this.f348809d || mm.o.a());
    }
}
