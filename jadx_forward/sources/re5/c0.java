package re5;

/* loaded from: classes12.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re5.d0 f476094d;

    public c0(re5.d0 d0Var) {
        this.f476094d = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        re5.d0 d0Var = this.f476094d;
        em.s1 s1Var = d0Var.f476097t;
        if (s1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16494x7edfff8e c17 = s1Var.c();
        c17.mo61298xa7077af8(d0Var.f476099v);
        c17.a(d0Var.f476098u);
    }
}
