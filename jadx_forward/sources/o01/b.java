package o01;

/* loaded from: classes.dex */
public final class b implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.o f423422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u26.k0 f423423e;

    public b(com.p314xaae8f345.mm.p944x882e457a.o oVar, u26.k0 k0Var) {
        this.f423422d = oVar;
        this.f423423e = k0Var;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "FlowNetScene:" + this.f423422d.f152246d;
    }

    @Override // java.lang.Runnable
    public void run() {
        new o01.e(this.f423422d, this.f423423e).mo807x6c193ac1(gm0.j1.d().f152297d, null);
    }
}
