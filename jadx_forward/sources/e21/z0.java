package e21;

/* loaded from: classes11.dex */
public final class z0 implements xg3.o0 {

    /* renamed from: h, reason: collision with root package name */
    public static e21.r f328142h;

    /* renamed from: n, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f328145n;

    /* renamed from: o, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 f328146o;

    /* renamed from: d, reason: collision with root package name */
    public static final e21.z0 f328138d = new e21.z0();

    /* renamed from: e, reason: collision with root package name */
    public static final e21.e0 f328139e = new e21.e0();

    /* renamed from: f, reason: collision with root package name */
    public static final int f328140f = 20;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f328141g = jz5.h.b(e21.x0.f328131d);

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f328143i = jz5.h.b(e21.v0.f328125d);

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f328144m = jz5.h.b(e21.y0.f328134d);

    static {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 10, u26.u.DROP_OLDEST, 1, null);
        f328145n = b17;
        f328146o = p3325xe03a0797.p3326xc267989b.p3328x30012e.l.a(b17);
    }

    public static final java.lang.Object a(e21.z0 z0Var, xg3.q0 q0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        z0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OplogServiceKt", "dealWith(Sync) option " + e21.a1.a(q0Var));
        return (q0Var.b() == 0 && q0Var.f535960f > 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("@openim", q0Var.f535962h)) ? z0Var.h(q0Var, interfaceC29045xdcb5ca57) : (q0Var.b() == 0 && q0Var.f535960f > 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("@byp", q0Var.f535962h)) ? z0Var.f(q0Var, interfaceC29045xdcb5ca57) : z0Var.g(q0Var, interfaceC29045xdcb5ca57);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(e21.z0 r13, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r14) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e21.z0.b(e21.z0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void c(xg3.q0 q0Var) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "toString(...)");
        v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b) ((jz5.n) f328143i).mo141623x754a37bb(), null, new e21.m0(q0Var, b17, currentTimeMillis, null), 1, null);
    }

    public final void d(xg3.q0 q0Var, xg3.n0 n0Var, java.lang.ref.WeakReference weakReference) {
        xg3.n0 n0Var2;
        if (q0Var == null || v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) f328144m).mo141623x754a37bb(), null, new e21.n0(q0Var, n0Var, weakReference, null), 1, null) == null) {
            if (n0Var != null) {
                o(n0Var, -1, "", "");
            }
            if (weakReference == null || (n0Var2 = (xg3.n0) weakReference.get()) == null) {
                return;
            }
            o(n0Var2, -1, "", "");
        }
    }

    public void e(xg3.q0 q0Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dealWithFlow called with operation: ");
        sb6.append(q0Var != null ? e21.a1.a(q0Var) : null);
        sb6.append(", subscriptionCount: ");
        sb6.append(((java.lang.Number) ((v26.s0) ((v26.b) f328145n).i()).mo144003x754a37bb()).intValue());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OplogServiceKt", sb6.toString());
        d(q0Var, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(xg3.q0 r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e21.z0.f(xg3.q0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(xg3.q0 r8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e21.z0.g(xg3.q0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(xg3.q0 r6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof e21.q0
            if (r0 == 0) goto L13
            r0 = r7
            e21.q0 r0 = (e21.q0) r0
            int r1 = r0.f328103g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f328103g = r1
            goto L18
        L13:
            e21.q0 r0 = new e21.q0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f328101e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f328103g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r6 = r0.f328100d
            xg3.q0 r6 = (xg3.q0) r6
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L59
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            r45.z05 r7 = new r45.z05
            r7.<init>()
            int r2 = r6.f535960f
            r7.f473103d = r2
            com.tencent.mm.protobuf.g r2 = new com.tencent.mm.protobuf.g
            byte[] r4 = r6.a()
            r2.<init>(r4)
            r7.f473104e = r2
            com.tencent.mm.modelbase.i r7 = r7.b()
            r0.f328100d = r6
            r0.f328103g = r3
            java.lang.Object r7 = rm0.h.b(r7, r0)
            if (r7 != r1) goto L59
            return r1
        L59:
            com.tencent.mm.modelbase.f r7 = (com.p314xaae8f345.mm.p944x882e457a.f) r7
            com.tencent.mm.protobuf.f r0 = r7.f152151d
            r45.a15 r0 = (r45.a15) r0
            if (r0 == 0) goto L6f
            r45.ie r0 = r0.mo11484xe92ab0a8()
            if (r0 == 0) goto L6f
            int r0 = r0.f458492d
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            goto L70
        L6f:
            r1 = 0
        L70:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "dealWith(Sync) OpenIM cgiResp: errCode: "
            r0.<init>(r2)
            int r2 = r7.f152149b
            r0.append(r2)
            java.lang.String r2 = " errType: "
            r0.append(r2)
            int r2 = r7.f152148a
            r0.append(r2)
            java.lang.String r2 = " errMsg: "
            r0.append(r2)
            java.lang.String r2 = r7.f152150c
            r0.append(r2)
            java.lang.String r2 = " ret: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.OplogServiceKt"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            boolean r0 = r7.b()
            java.lang.String r2 = ""
            if (r0 == 0) goto Lbc
            e21.f0 r0 = new e21.f0
            if (r1 == 0) goto Lb2
            int r1 = r1.intValue()
            goto Lb3
        Lb2:
            r1 = 0
        Lb3:
            java.lang.String r7 = r7.f152150c
            if (r7 != 0) goto Lb8
            r7 = r2
        Lb8:
            r0.<init>(r6, r1, r2, r7)
            goto Lc7
        Lbc:
            e21.f0 r0 = new e21.f0
            java.lang.String r7 = r7.f152150c
            if (r7 != 0) goto Lc3
            r7 = r2
        Lc3:
            r1 = -1
            r0.<init>(r6, r1, r2, r7)
        Lc7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e21.z0.h(xg3.q0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.util.Map i() {
        return (java.util.Map) ((jz5.n) f328141g).mo141623x754a37bb();
    }

    public final e21.r j() {
        gm0.b0 u17;
        l75.k0 k0Var;
        if (f328142h == null && gm0.j1.h() && gm0.j1.a()) {
            synchronized (e21.r.class) {
                if (f328142h == null && (u17 = gm0.j1.u()) != null && (k0Var = u17.f354686f) != null) {
                    f328142h = new e21.r(k0Var);
                }
            }
        }
        return f328142h;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(xg3.q0 r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e21.z0.k(xg3.q0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.util.List r17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r18) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e21.z0.l(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(xg3.q0 r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e21.z0.m(xg3.q0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void n(xg3.q0 q0Var, e21.x xVar) {
        e21.r j17 = j();
        java.lang.Integer valueOf = j17 != null ? java.lang.Integer.valueOf(j17.m0(q0Var)) : null;
        java.lang.Integer num = (java.lang.Integer) i().get(java.lang.Integer.valueOf(q0Var.f535956b));
        e21.r j18 = j();
        f328139e.c(q0Var, num, j18 != null ? j18.m126807x7444f759() : 0, xVar);
        i().remove(java.lang.Integer.valueOf(q0Var.f535956b));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OplogServiceKt", "remove Operation res=" + valueOf + ' ' + e21.a1.a(q0Var));
    }

    public final void o(xg3.n0 n0Var, int i17, java.lang.String str, java.lang.String str2) {
        try {
            n0Var.a(i17, str, str2);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OplogServiceKt", th6, "safeNotifyOpLogResult callback error, ret=" + i17 + " title=" + str, new java.lang.Object[0]);
        }
    }
}
