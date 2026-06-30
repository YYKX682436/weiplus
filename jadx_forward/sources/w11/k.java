package w11;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final w11.k f523601a = new w11.k();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f523602b = jz5.h.b(w11.i.f523588d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f523603c = jz5.h.b(w11.h.f523570d);

    public static final void a(w11.k kVar, r45.jl0 jl0Var) {
        kVar.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DoCmdErrorHandler", "tryClean() called");
        long c17 = c01.id.c();
        int size = jl0Var.f459450d.size();
        java.util.LinkedList items = jl0Var.f459450d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(items, "items");
        java.util.List F0 = kz5.n0.F0(items, new w11.j());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : F0) {
            if (c17 - ((r45.kl0) obj).f460335g < 604800000) {
                arrayList.add(obj);
            }
        }
        int size2 = arrayList.size();
        java.util.Collection collection = arrayList;
        if (size2 > 10) {
            collection = kz5.n0.L0(arrayList, 10);
        }
        java.util.LinkedList linkedList = new java.util.LinkedList(collection);
        jl0Var.f459450d = linkedList;
        int size3 = linkedList.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DoCmdErrorHandler", "tryClean() end called cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " beforeSize:" + size + " afterSize:" + size3);
        java.lang.Object mo141623x754a37bb = ((jz5.n) f523602b).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb).H(gm0.j1.b().j(), jl0Var.mo14344x5f01b1f6());
    }

    public final void b(r45.b50 cmdItem, java.lang.Throwable e17, int i17) {
        int i18;
        boolean z17;
        int i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdItem, "cmdItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        int i27 = cmdItem.f452063d;
        if (i27 == 5) {
            try {
                r45.cu5 cu5Var = cmdItem.f452064e;
                byte[] bArr = cu5Var != null ? cu5Var.f453374f.f273689a : null;
                r45.j4 j4Var = new r45.j4();
                j4Var.mo11468x92b714fd(bArr);
                i18 = j4Var.f459093g;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DoCmdErrorHandler", th6, "CmdItem.getMsgType error cmdId:" + i27, new java.lang.Object[0]);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DoCmdErrorHandler", "collectError() called with cmdid:" + cmdItem.f452063d + " msgType:" + i18 + " callSource:" + i17);
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(e17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stackTraceString, "getStackTraceString(...)");
            java.lang.String u17 = r26.i0.u(stackTraceString, ',', ' ', false, 4, null);
            r45.kl0 kl0Var = new r45.kl0();
            kl0Var.f460332d = cmdItem;
            z17 = true;
            java.lang.String format = java.lang.String.format("%08X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(o45.wf.f424562g)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            kl0Var.f460333e = format;
            kl0Var.f460334f = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e;
            kl0Var.f460335g = c01.id.c();
            kl0Var.f460336h = u17;
            kl0Var.f460337i = i17;
            kl0Var.f460338m = i18;
            jz5.g gVar = f523603c;
            ((r45.jl0) ((jz5.n) gVar).mo141623x754a37bb()).f459450d.add(kl0Var);
            r45.jl0 jl0Var = (r45.jl0) ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jl0Var, "<this>");
            java.lang.Object mo141623x754a37bb = ((jz5.n) f523602b).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb).H(gm0.j1.b().j(), jl0Var.mo14344x5f01b1f6());
            ((ku5.t0) ku5.t0.f394148d).h(new w11.g(cmdItem, kl0Var, u17), "DoCmdErrorHandler.Report");
            i19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
            if (!(i19 != 788529167 || i19 == 788529166) && !z65.c.a()) {
                z17 = false;
            }
            if (z17 || !bm5.o1.f104252a.a() || (e17 instanceof c01.c)) {
                return;
            }
            try {
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(i95.n0.c(com.p314xaae8f345.mm.app.v2.class));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gm0.j1.b().j(), "getUinString(...)");
                throw null;
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DoCmdErrorHandler", th7, "showDebugInfo err", new java.lang.Object[0]);
                return;
            }
        }
        i18 = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DoCmdErrorHandler", "collectError() called with cmdid:" + cmdItem.f452063d + " msgType:" + i18 + " callSource:" + i17);
        java.lang.String stackTraceString2 = android.util.Log.getStackTraceString(e17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stackTraceString2, "getStackTraceString(...)");
        java.lang.String u172 = r26.i0.u(stackTraceString2, ',', ' ', false, 4, null);
        r45.kl0 kl0Var2 = new r45.kl0();
        kl0Var2.f460332d = cmdItem;
        z17 = true;
        java.lang.String format2 = java.lang.String.format("%08X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(o45.wf.f424562g)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
        kl0Var2.f460333e = format2;
        kl0Var2.f460334f = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e;
        kl0Var2.f460335g = c01.id.c();
        kl0Var2.f460336h = u172;
        kl0Var2.f460337i = i17;
        kl0Var2.f460338m = i18;
        jz5.g gVar2 = f523603c;
        ((r45.jl0) ((jz5.n) gVar2).mo141623x754a37bb()).f459450d.add(kl0Var2);
        r45.jl0 jl0Var2 = (r45.jl0) ((jz5.n) gVar2).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jl0Var2, "<this>");
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) f523602b).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb2).H(gm0.j1.b().j(), jl0Var2.mo14344x5f01b1f6());
        ((ku5.t0) ku5.t0.f394148d).h(new w11.g(cmdItem, kl0Var2, u172), "DoCmdErrorHandler.Report");
        i19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
        if (!(i19 != 788529167 || i19 == 788529166)) {
            z17 = false;
        }
        if (z17) {
        }
    }
}
