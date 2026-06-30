package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31;

/* loaded from: classes9.dex */
public interface b {
    static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.C12403xda2a3ec7 invokeArgs, android.content.Context context, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: backToApp");
        }
        if ((i17 & 2) != 0) {
            context = null;
        }
        if ((i17 & 4) != 0) {
            str = null;
        }
        bVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeArgs, "invokeArgs");
        android.os.Bundle bundle = new android.os.Bundle();
        com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11257xdceeb189.Resp resp = new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11257xdceeb189.Resp(android.os.Bundle.EMPTY);
        java.lang.String str2 = invokeArgs.f167091d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        resp.f32992xe4e861a4 = str2;
        resp.f32991x9f346274 = invokeArgs.f167098n;
        resp.f32868xb2d5068c = str;
        resp.mo48431x792022dd(bundle);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.g(bundle);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.h(bundle);
        fm1.b bVar2 = fm1.b.f345547a;
        java.lang.String str3 = invokeArgs.f167091d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
        android.app.Activity a17 = bVar2.a(str3);
        if (a17 != null) {
            a17.overridePendingTransition(0, 0);
        }
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args args = new com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args();
        args.f32706x6a744ba6 = invokeArgs.f167097m;
        args.f32701xaddf3082 = bundle;
        args.f32703x5cfee87 = 268435456;
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.m48400x35cf88(context, args);
    }

    java.lang.String b();

    void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.C12403xda2a3ec7 c12403xda2a3ec7, l81.b1 b1Var);
}
