package w82;

/* loaded from: classes11.dex */
public final class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13624x28778504 f525364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f525365e;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13624x28778504 c13624x28778504, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        this.f525364d = c13624x28778504;
        this.f525365e = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13624x28778504 c13624x28778504 = this.f525364d;
        w82.q0 q0Var = c13624x28778504.Q;
        if (q0Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.r7) q0Var).a(c13624x28778504.getHeight(), this.f525365e.f391645d);
        }
    }
}
