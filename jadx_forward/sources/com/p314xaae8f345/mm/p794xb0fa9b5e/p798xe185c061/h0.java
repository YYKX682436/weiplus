package com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061;

/* loaded from: classes7.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f149964a = {1157, me1.a.f72878x366c91de, 1133, 4602, 1912};

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.w f149965b = new com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.y();

    public static com.p314xaae8f345.mm.p944x882e457a.m1 a(com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v vVar) {
        return b(oVar, null, vVar, null);
    }

    public static com.p314xaae8f345.mm.p944x882e457a.m1 b(com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.w wVar, com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v vVar, im5.b bVar) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            if (wVar != null && !qk0.c.a(wVar.getClass())) {
                java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "remoteCgiImpl in client process, invalid interceptor %s", wVar.getClass().getName());
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.IPCRunCgi", new java.lang.Throwable(), format, new java.lang.Object[0]);
                wVar = null;
            }
            com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.C10758xed10a605 c10758xed10a605 = new com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.C10758xed10a605();
            c10758xed10a605.f149945d = wVar == null ? null : wVar.getClass().getName();
            c10758xed10a605.f149946e = oVar;
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, c10758xed10a605, com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.f0.class, vVar == null ? null : new com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.d0(vVar, bVar));
            return null;
        }
        if (wVar == null) {
            wVar = f149965b;
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.z zVar = u46.a.a(f149964a, oVar.f152246d) ? new com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.z(vVar, oVar) : null;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = wVar.a(oVar);
        com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.a0 a0Var = new com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.a0(vVar, zVar);
        java.util.concurrent.Executor executor = com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.g0.f149963a;
        android.os.HandlerThread handlerThread = com.p314xaae8f345.mm.p944x882e457a.z2.f152379a;
        com.p314xaae8f345.mm.p944x882e457a.g3 g3Var = new com.p314xaae8f345.mm.p944x882e457a.g3(a0Var);
        if (bVar != null) {
            bVar.mo46316x322b85(g3Var);
        }
        com.p314xaae8f345.mm.p944x882e457a.m1 f17 = com.p314xaae8f345.mm.p944x882e457a.z2.f(a17, g3Var, executor, false);
        if (f17 != null && zVar != null) {
            try {
                ((gm0.n) com.p314xaae8f345.mm.p944x882e457a.z2.f152380b).f354793a.f354821b.a(((com.p314xaae8f345.mm.p944x882e457a.c3) f17).f152135m.f152246d, zVar);
            } catch (java.lang.Exception unused) {
            }
        }
        return f17;
    }
}
