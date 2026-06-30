package do1;

/* loaded from: classes12.dex */
public interface b {
    boolean a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, long j17);

    boolean b(bw5.u0 u0Var, bw5.t0 t0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var);

    default boolean c(java.lang.String path, java.lang.String desPath, java.lang.String tag, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desPath, "desPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        boolean x17 = com.p314xaae8f345.mm.vfs.w6.x(path, desPath, true);
        boolean z17 = false;
        if (num != null) {
            num.intValue();
            if (x17) {
                i95.m c17 = i95.n0.c(a00.i.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                z17 = a00.i.zd((a00.i) c17, desPath, num.intValue(), null, null, 12, null).f559227d;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "move file res:" + x17 + ", [" + path + "] -> [" + desPath + "], size = " + com.p314xaae8f345.mm.vfs.w6.k(desPath) + ", linkRet = " + z17);
        return x17;
    }

    boolean d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, bw5.u0 u0Var, bw5.t0 t0Var, co1.c cVar);

    co1.h e(long j17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, do1.a aVar);

    default boolean f(java.lang.String path, java.lang.String desPath, java.lang.String tag, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desPath, "desPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        boolean x17 = com.p314xaae8f345.mm.vfs.w6.x(path, desPath, true);
        if (num != null) {
            num.intValue();
            if (x17) {
                i95.m c17 = i95.n0.c(a00.i.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                a00.i.vi((a00.i) c17, desPath, num.intValue(), null, null, 12, null);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "move file res:" + x17 + ", [" + path + "] -> [" + desPath + ']');
        return x17;
    }

    long g(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, int i17);
}
