package sk4;

/* loaded from: classes14.dex */
public final class b extends com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190 implements jm4.i0 {

    /* renamed from: d, reason: collision with root package name */
    public f25.m0 f490499d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f490500e = new java.util.LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f490501f = new java.util.concurrent.locks.ReentrantLock();

    public static final void a(sk4.b bVar, int i17, byte[] extraData) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = bVar.f490501f;
        reentrantLock.lock();
        try {
            java.util.List<jm4.j0> S0 = kz5.n0.S0(bVar.f490500e);
            reentrantLock.unlock();
            for (jm4.j0 j0Var : S0) {
                if (j0Var != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraData, "extraData");
                    p3380x6a61f93.p3381xf512d0a5.C30484x21b8636c.m169267x21b82f44(((jm4.k0) j0Var).m105978x2737f10(), i17, extraData);
                }
            }
        } catch (java.lang.Throwable th6) {
            reentrantLock.unlock();
            throw th6;
        }
    }
}
