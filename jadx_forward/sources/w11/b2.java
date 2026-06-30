package w11;

/* loaded from: classes12.dex */
public final class b2 {
    public b2(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final byte[] a() {
        boolean n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n();
        java.lang.String c17 = c();
        byte[] bArr = w11.c2.f523528e;
        if (bArr != null && n17) {
            return bArr;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p()) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("notify_sync_pref", 4).getString("notify_sync_key_keybuf", ""));
        }
        java.lang.Object l17 = gm0.j1.u().c().l(8195, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(l17, "null cannot be cast to non-null type kotlin.String");
        byte[] h17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h((java.lang.String) l17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncKeyKV", "getSyncKeyBuf uin:%s buffer:%s ", c17, o45.qi.d(h17));
        w11.c2.f523528e = h17;
        return h17;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 b() {
        java.lang.StackTraceElement stackTraceElement;
        java.lang.String j17 = gm0.j1.b().j();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j17, "getUinString(...)");
        if (w11.c2.f523527d == null) {
            w11.c2.f523527d = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("SyncMMKV_".concat(j17), 2, null);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = w11.c2.f523527d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(o4Var);
        if (o4Var.Y() > 4194304) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SyncKeyKV", "mmkvOverSize: " + (o4Var.Y() / 1024) + "KB");
            if (mm.k.j(mm.k.f410050x1, null, 1, null)) {
                synchronized (o4Var) {
                    if (!w11.c2.f523525b) {
                        java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stackTrace, "getStackTrace(...)");
                        int length = stackTrace.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= length) {
                                stackTraceElement = null;
                                break;
                            }
                            stackTraceElement = stackTrace[i17];
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stackTraceElement.getClassName(), "getClassName(...)");
                            if (!r26.n0.B(r8, w11.c2.class.getName(), false)) {
                                break;
                            }
                            i17++;
                        }
                        ((ku5.t0) ku5.t0.f394148d).g(new w11.a2(o4Var, stackTraceElement != null ? stackTraceElement.toString() : null));
                    }
                }
            }
        }
        return o4Var;
    }

    public final java.lang.String c() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            java.lang.String j17 = gm0.j1.b().j();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j17);
            return j17;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p()) {
            java.lang.String m143587x9616526c = new kk.v(com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153526n.f153435o).m143587x9616526c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m143587x9616526c);
            return m143587x9616526c;
        }
        throw new java.lang.IllegalThreadStateException("invoke must main process current processName:" + bm5.f1.a());
    }

    public final void d(byte[] bArr, boolean z17) {
        java.lang.String c17 = c();
        if (java.util.Arrays.equals(bArr, w11.c2.f523528e)) {
            return;
        }
        java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(bArr);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            gm0.j1.u().c().w(8195, l17);
        }
        w11.c2.f523528e = bArr;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("notify_sync_pref", 4).edit().putString("notify_sync_key_keybuf", l17).commit();
        if (z17) {
            gm0.j1.u().c().b(bArr == null ? 5 : 4, gm0.j1.u().c(), 8195);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncKeyKV", "setSyncKeyBuf uin:%s buffer:%s ", c17, o45.qi.d(bArr));
    }
}
