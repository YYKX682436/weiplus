package pi0;

/* loaded from: classes11.dex */
public final class l1 {

    /* renamed from: a */
    public final pi0.q f436175a;

    /* renamed from: b */
    public final java.lang.String f436176b;

    /* renamed from: c */
    public final java.util.List f436177c;

    /* renamed from: d */
    public final boolean f436178d;

    /* renamed from: e */
    public final java.lang.String f436179e;

    /* renamed from: f */
    public java.lang.String f436180f;

    /* renamed from: g */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e f436181g;

    /* renamed from: h */
    public boolean f436182h;

    /* renamed from: i */
    public boolean f436183i;

    /* renamed from: j */
    public long f436184j;

    /* renamed from: k */
    public java.lang.String f436185k;

    /* renamed from: l */
    public pi0.h0 f436186l;

    /* renamed from: m */
    public final java.util.HashSet f436187m;

    /* renamed from: n */
    public pi0.w0 f436188n;

    /* renamed from: o */
    public java.util.List f436189o;

    /* renamed from: p */
    public java.util.List f436190p;

    /* renamed from: q */
    public qi0.h f436191q;

    /* renamed from: r */
    public p3325xe03a0797.p3326xc267989b.c0 f436192r;

    /* renamed from: s */
    public final long f436193s;

    /* renamed from: t */
    public long f436194t;

    /* renamed from: u */
    public long f436195u;

    public l1(pi0.q engineGroup, java.lang.String plugin, java.util.List list, boolean z17, java.lang.String entryPoint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(engineGroup, "engineGroup");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entryPoint, "entryPoint");
        this.f436175a = engineGroup;
        this.f436176b = plugin;
        this.f436177c = list;
        this.f436178d = z17;
        this.f436179e = entryPoint;
        this.f436180f = "";
        this.f436183i = true;
        this.f436185k = "";
        this.f436187m = new java.util.HashSet();
        this.f436193s = java.lang.System.nanoTime();
        io.p3284xd2ae381c.Log.i(k(), "init with plugin:" + plugin);
        engineGroup.a(this);
    }

    public static java.lang.Object n(pi0.l1 l1Var, android.content.Context context, com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6, java.lang.Class cls, java.lang.Long l17, android.os.Bundle bundle, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Object obj) {
        return l1Var.d(context, c10716x931597c6, (i17 & 4) != 0 ? null : cls, (i17 & 8) != 0 ? null : l17, (i17 & 16) != 0 ? null : bundle, interfaceC29045xdcb5ca57);
    }

    public static /* synthetic */ java.lang.Object t(pi0.l1 l1Var, android.content.Context context, com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6, java.lang.Class cls, java.lang.Long l17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Object obj) {
        return l1Var.s(context, c10716x931597c6, (i17 & 4) != 0 ? null : cls, (i17 & 8) != 0 ? null : l17, interfaceC29045xdcb5ca57);
    }

    public static /* synthetic */ java.lang.Object v(pi0.l1 l1Var, android.content.Context context, com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6, java.lang.Class cls, java.lang.Long l17, android.os.Bundle bundle, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Object obj) {
        return l1Var.u(context, c10716x931597c6, (i17 & 4) != 0 ? null : cls, (i17 & 8) != 0 ? null : l17, (i17 & 16) != 0 ? null : bundle, interfaceC29045xdcb5ca57);
    }

    public final void a(java.util.List plugins) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28624x6307ecb0 m137439x2173b36a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugins, "plugins");
        if (this.f436190p == null) {
            this.f436190p = new java.util.ArrayList();
        }
        java.util.List list = this.f436190p;
        if (list != null) {
            list.addAll(plugins);
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e = this.f436181g;
        if (c28580x69eec95e != null) {
            if (c28580x69eec95e == null || (m137439x2173b36a = c28580x69eec95e.m137439x2173b36a()) == null) {
                return;
            }
            m137439x2173b36a.add(kz5.n0.X0(plugins));
            return;
        }
        java.util.List list2 = this.f436189o;
        if (list2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(plugins);
            arrayList.addAll(list2);
            plugins = arrayList;
        }
        this.f436189o = plugins;
    }

    public final void b(java.lang.Object host) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        io.p3284xd2ae381c.Log.i(k(), "attach to host " + host);
        this.f436187m.add(host);
        if (host instanceof pi0.w0) {
            pi0.w0 w0Var = this.f436188n;
            if (w0Var != null) {
                w0Var.u3((pi0.w0) host);
            }
            this.f436188n = (pi0.w0) host;
            c61.v9 v9Var = (c61.v9) j(c61.v9.class);
            if (v9Var != null) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                io.p3284xd2ae381c.Log.i("MicroMsg.FlutterAPMPlugin", "setBindFlutterInstanceMills:" + currentTimeMillis);
                v9Var.f120889h = currentTimeMillis;
            }
        }
    }

    public final boolean c(android.content.Context context, java.lang.Class cls, android.content.Intent intent, pi0.t tVar) {
        if (tVar == null) {
            return false;
        }
        android.app.Activity activity = tVar.f436259d;
        java.lang.Class<?> cls2 = activity != null ? activity.getClass() : null;
        if (cls2 == null || cls == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, cls)) {
            return false;
        }
        android.content.pm.ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if ((resolveActivity != null ? resolveActivity.activityInfo : null) == null) {
            return false;
        }
        int i17 = resolveActivity.activityInfo.launchMode;
        if (i17 == 3) {
            io.p3284xd2ae381c.Log.i(k(), "single instance, will start the same activity");
            return true;
        }
        if (i17 != 2) {
            return false;
        }
        io.p3284xd2ae381c.Log.i(k(), "single task, will start the same activity");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.content.Context r15, com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 r16, java.lang.Class r17, java.lang.Long r18, android.os.Bundle r19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r20) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pi0.l1.d(android.content.Context, com.tencent.mm.flutter.ui.FlutterPageStyle, java.lang.Class, java.lang.Long, android.os.Bundle, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r22, java.util.Map r23, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r24) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pi0.l1.e(java.lang.String, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0322 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r24, java.util.Map r25, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r26) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pi0.l1.f(java.lang.String, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:(1:(4:12|13|(1:15)|16)(2:18|19))(5:20|21|22|23|(1:25)(4:26|13|(0)|16)))(1:28))(2:60|(2:62|(1:64)(1:65))(5:66|30|(3:32|(1:34)(1:57)|(10:38|(1:40)(1:56)|41|(3:43|(4:45|(1:47)|48|(1:50))|51)|52|53|(1:55)|22|23|(0)(0)))|58|59))|29|30|(0)|58|59))|68|6|7|(0)(0)|29|30|(0)|58|59) */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x017a, code lost:
    
        io.p3284xd2ae381c.Log.i(r13, "detach timeout");
        r6 = true;
        r4 = r4;
        r7 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, io.flutter.embedding.engine.FlutterEngine] */
    /* JADX WARN: Type inference failed for: r4v19, types: [io.flutter.embedding.engine.FlutterEngine] */
    /* JADX WARN: Type inference failed for: r4v2, types: [io.flutter.embedding.engine.FlutterEngine] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v5, types: [pi0.t0] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r17) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pi0.l1.g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object h(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.util.HashSet hashSet = this.f436187m;
        if (obj == null || hashSet.contains(obj)) {
            io.p3284xd2ae381c.Log.i(k(), "detach from host " + obj);
        } else {
            io.p3284xd2ae381c.Log.w(k(), "detach from an unknown host " + obj);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.m0.a(hashSet).remove(obj);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f436188n, obj)) {
            this.f436188n = null;
        }
        boolean isEmpty = hashSet.isEmpty();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (isEmpty) {
            java.lang.Object g17 = g(interfaceC29045xdcb5ca57);
            return g17 == pz5.a.f440719d ? g17 : f0Var;
        }
        io.p3284xd2ae381c.Log.i(k(), "attached hosts: [" + kz5.n0.g0(hashSet, null, null, null, 0, null, null, 63, null) + ']');
        return f0Var;
    }

    public final void i() {
        for (java.lang.Object obj : this.f436187m) {
            if (obj instanceof pi0.w0) {
                ((pi0.w0) obj).u3(pi0.x0.f436273d);
            }
        }
    }

    public final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f j(java.lang.Class clazz) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28624x6307ecb0 m137439x2173b36a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e = this.f436181g;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f interfaceC28623x7c9e3e4f = (c28580x69eec95e == null || (m137439x2173b36a = c28580x69eec95e.m137439x2173b36a()) == null) ? null : m137439x2173b36a.get(clazz);
        if (interfaceC28623x7c9e3e4f instanceof io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f) {
            return interfaceC28623x7c9e3e4f;
        }
        return null;
    }

    public final java.lang.String k() {
        return "MMFlutterInstance#" + this.f436180f;
    }

    public final void l(java.lang.String str, java.util.Map map) {
        java.lang.String str2;
        pi0.m1 a17 = pi0.a0.f436047a.a(this.f436176b, str, map, this.f436178d, this.f436179e);
        pi0.n0 n0Var = pi0.z.f436281a;
        if (n0Var == null || (str2 = n0Var.b()) == null) {
            str2 = "";
        }
        a17.f436202e = str2;
        java.util.HashMap params = a17.f436203f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(params, "params");
        pi0.n0 n0Var2 = pi0.z.f436281a;
        if (n0Var2 != null) {
            n0Var2.a(str2, params);
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e = this.f436181g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c28580x69eec95e);
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f interfaceC28623x7c9e3e4f = c28580x69eec95e.m137439x2173b36a().get(qi0.c.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(interfaceC28623x7c9e3e4f, "null cannot be cast to non-null type com.tencent.mm.flutter.base.navigator.FlutterNavigatorPlugin");
        qi0.c cVar = (qi0.c) interfaceC28623x7c9e3e4f;
        java.lang.String b17 = a17.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "toJsonString(...)");
        io.p3284xd2ae381c.Log.i("MicroMsg.FlutterNavigatorPlugin", "onNewRoute: ".concat(b17));
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24616x67fd4f20 c24616x67fd4f20 = cVar.f445000e;
        if (c24616x67fd4f20 != null) {
            c24616x67fd4f20.m91314xf6793f88(b17, new qi0.a(cVar, b17));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 r13, android.content.Context r14, boolean r15, long r16, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r18) {
        /*
            r12 = this;
            r0 = r12
            r1 = r18
            boolean r2 = r1 instanceof pi0.f1
            if (r2 == 0) goto L16
            r2 = r1
            pi0.f1 r2 = (pi0.f1) r2
            int r3 = r2.f436102g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f436102g = r3
            goto L1b
        L16:
            pi0.f1 r2 = new pi0.f1
            r2.<init>(r12, r1)
        L1b:
            r9 = r2
            java.lang.Object r1 = r9.f436100e
            pz5.a r2 = pz5.a.f440719d
            int r3 = r9.f436102g
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3b
            if (r3 == r5) goto L33
            if (r3 != r4) goto L2b
            goto L33
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            java.lang.Object r2 = r9.f436099d
            pi0.l1 r2 = (pi0.l1) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r1)
            goto L8c
        L3b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r1)
            r1 = r13
            boolean r1 = r1.f149658o
            if (r1 == 0) goto La3
            pi0.g0 r3 = new pi0.g0
            java.lang.String r1 = r0.f436180f
            r3.<init>(r1)
            pi0.b0 r1 = pi0.g0.f436105e
            java.lang.String r1 = r0.f436180f
            java.lang.String r6 = "engineId"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r6)
            java.util.HashMap r6 = pi0.g0.f436106f
            r6.put(r1, r3)
            pi0.h0 r1 = r3.f436111d
            r0.f436186l = r1
            if (r15 == 0) goto L78
            r6 = 0
            android.graphics.Point r1 = new android.graphics.Point
            r4 = 10
            r1.<init>(r4, r4)
            r8 = 0
            r10 = 2
            r11 = 0
            r9.f436099d = r0
            r9.f436102g = r5
            r4 = r14
            r5 = r6
            r7 = r1
            java.lang.Object r1 = pi0.g0.b(r3, r4, r5, r7, r8, r9, r10, r11)
            if (r1 != r2) goto L8b
            return r2
        L78:
            r7 = 0
            r8 = 0
            r10 = 12
            r11 = 0
            r9.f436099d = r0
            r9.f436102g = r4
            r4 = r14
            r5 = r16
            java.lang.Object r1 = pi0.g0.b(r3, r4, r5, r7, r8, r9, r10, r11)
            if (r1 != r2) goto L8b
            return r2
        L8b:
            r2 = r0
        L8c:
            java.lang.String r1 = r2.k()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "finished prepare for "
            r3.<init>(r4)
            java.lang.String r2 = r2.f436180f
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            io.p3284xd2ae381c.Log.i(r1, r2)
        La3:
            jz5.f0 r1 = jz5.f0.f384359a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pi0.l1.m(com.tencent.mm.flutter.ui.FlutterPageStyle, android.content.Context, boolean, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object o(java.lang.String str, java.util.Map map, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        boolean z17 = this.f436183i;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!z17) {
            return f0Var;
        }
        if (this.f436181g == null) {
            java.lang.Object e17 = e(str, map, interfaceC29045xdcb5ca57);
            return e17 == pz5.a.f440719d ? e17 : f0Var;
        }
        l(str, map);
        return f0Var;
    }

    public final void p() {
        qi0.c cVar = (qi0.c) j(qi0.c.class);
        if (cVar == null) {
            cVar = new qi0.c();
            a(kz5.b0.c(cVar));
        }
        pi0.q engineGroup = this.f436175a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(engineGroup, "engineGroup");
        cVar.f445005m = engineGroup;
        cVar.f445004i = this.f436190p;
    }

    public final void q(qi0.h hVar) {
        if (this.f436181g == null) {
            this.f436191q = hVar;
            return;
        }
        qi0.c cVar = (qi0.c) j(qi0.c.class);
        if (cVar == null) {
            cVar = new qi0.c();
            a(kz5.b0.c(cVar));
        }
        cVar.f445002g = hVar;
    }

    public final boolean r(android.content.Context context, android.content.Intent intent, java.lang.Class cls) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        if (cls == null) {
            cls = pi0.r.f436250a.e();
        }
        pi0.t tVar = (pi0.t) j(pi0.t.class);
        if (tVar == null || !c(context, cls, intent, tVar)) {
            return true;
        }
        return !(tVar.f436259d instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? ((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) r3).mo273xed6858b4().b().a(p012xc85e97e9.p093xedfae76a.n.RESUMED) : false);
    }

    public final java.lang.Object s(android.content.Context context, com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6, java.lang.Class cls, java.lang.Long l17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object v17 = v(this, context, c10716x931597c6, cls, l17, null, interfaceC29045xdcb5ca57, 16, null);
        return v17 == pz5.a.f440719d ? v17 : jz5.f0.f384359a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(android.content.Context r10, com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 r11, java.lang.Class r12, java.lang.Long r13, android.os.Bundle r14, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            r9 = this;
            boolean r0 = r15 instanceof pi0.g1
            if (r0 == 0) goto L13
            r0 = r15
            pi0.g1 r0 = (pi0.g1) r0
            int r1 = r0.f436116h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f436116h = r1
            goto L18
        L13:
            pi0.g1 r0 = new pi0.g1
            r0.<init>(r9, r15)
        L18:
            r7 = r0
            java.lang.Object r15 = r7.f436114f
            pz5.a r0 = pz5.a.f440719d
            int r1 = r7.f436116h
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            java.lang.Object r10 = r7.f436113e
            android.content.Context r10 = (android.content.Context) r10
            java.lang.Object r11 = r7.f436112d
            pi0.l1 r11 = (pi0.l1) r11
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            goto L4f
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            r7.f436112d = r9
            r7.f436113e = r10
            r7.f436116h = r2
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            java.lang.Object r15 = r1.d(r2, r3, r4, r5, r6, r7)
            if (r15 != r0) goto L4e
            return r0
        L4e:
            r11 = r9
        L4f:
            android.content.Intent r15 = (android.content.Intent) r15
            java.lang.String r11 = r11.k()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "startActivity "
            r12.<init>(r13)
            r12.append(r15)
            java.lang.String r12 = r12.toString()
            io.p3284xd2ae381c.Log.i(r11, r12)
            if (r15 == 0) goto La4
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r11.add(r15)
            java.util.Collections.reverse(r11)
            java.lang.Object[] r2 = r11.toArray()
            java.lang.String r3 = "com/tencent/mm/flutter/base/MMFlutterInstance"
            java.lang.String r4 = "showAsActivity"
            java.lang.String r5 = "(Landroid/content/Context;Lcom/tencent/mm/flutter/ui/FlutterPageStyle;Ljava/lang/Class;Ljava/lang/Long;Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r10
            yj0.a.d(r1, r2, r3, r4, r5, r6, r7, r8)
            r12 = 0
            java.lang.Object r11 = r11.get(r12)
            android.content.Intent r11 = (android.content.Intent) r11
            r10.startActivity(r11)
            java.lang.String r2 = "com/tencent/mm/flutter/base/MMFlutterInstance"
            java.lang.String r3 = "showAsActivity"
            java.lang.String r4 = "(Landroid/content/Context;Lcom/tencent/mm/flutter/ui/FlutterPageStyle;Ljava/lang/Class;Ljava/lang/Long;Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r1 = r10
            yj0.a.f(r1, r2, r3, r4, r5, r6, r7)
        La4:
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: pi0.l1.u(android.content.Context, com.tencent.mm.flutter.ui.FlutterPageStyle, java.lang.Class, java.lang.Long, android.os.Bundle, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(android.content.Context r18, com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 r19, java.lang.Class r20, java.lang.Long r21, android.os.Bundle r22, int r23, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r24) {
        /*
            r17 = this;
            r7 = r17
            r0 = r24
            boolean r1 = r0 instanceof pi0.h1
            if (r1 == 0) goto L17
            r1 = r0
            pi0.h1 r1 = (pi0.h1) r1
            int r2 = r1.f436128i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f436128i = r2
            goto L1c
        L17:
            pi0.h1 r1 = new pi0.h1
            r1.<init>(r7, r0)
        L1c:
            r6 = r1
            java.lang.Object r0 = r6.f436126g
            pz5.a r8 = pz5.a.f440719d
            int r1 = r6.f436128i
            r2 = 1
            if (r1 == 0) goto L3f
            if (r1 != r2) goto L37
            int r1 = r6.f436125f
            java.lang.Object r2 = r6.f436124e
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r3 = r6.f436123d
            pi0.l1 r3 = (pi0.l1) r3
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r0)
            r10 = r1
            goto L63
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r0)
            r6.f436123d = r7
            r9 = r18
            r6.f436124e = r9
            r10 = r23
            r6.f436125f = r10
            r6.f436128i = r2
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            java.lang.Object r0 = r0.d(r1, r2, r3, r4, r5, r6)
            if (r0 != r8) goto L61
            return r8
        L61:
            r3 = r7
            r2 = r9
        L63:
            android.content.Intent r0 = (android.content.Intent) r0
            if (r0 == 0) goto L6a
            r0.addFlags(r10)
        L6a:
            java.lang.String r1 = r3.k()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "startActivity "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            io.p3284xd2ae381c.Log.i(r1, r3)
            if (r0 == 0) goto Lca
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r0)
            java.util.Collections.reverse(r1)
            java.lang.Object[] r10 = r1.toArray()
            java.lang.String r11 = "com/tencent/mm/flutter/base/MMFlutterInstance"
            java.lang.String r12 = "showAsActivityWithIntentFlag"
            java.lang.String r13 = "(Landroid/content/Context;Lcom/tencent/mm/flutter/ui/FlutterPageStyle;Ljava/lang/Class;Ljava/lang/Long;Landroid/os/Bundle;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r14 = "Undefined"
            java.lang.String r15 = "startActivity"
            java.lang.String r16 = "(Landroid/content/Intent;)V"
            r9 = r2
            yj0.a.d(r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            android.content.Intent r0 = (android.content.Intent) r0
            r2.startActivity(r0)
            java.lang.String r0 = "com/tencent/mm/flutter/base/MMFlutterInstance"
            java.lang.String r1 = "showAsActivityWithIntentFlag"
            java.lang.String r3 = "(Landroid/content/Context;Lcom/tencent/mm/flutter/ui/FlutterPageStyle;Ljava/lang/Class;Ljava/lang/Long;Landroid/os/Bundle;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r18 = r2
            r19 = r0
            r20 = r1
            r21 = r3
            r22 = r4
            r23 = r5
            r24 = r6
            yj0.a.f(r18, r19, r20, r21, r22, r23, r24)
        Lca:
            jz5.f0 r0 = jz5.f0.f384359a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pi0.l1.w(android.content.Context, com.tencent.mm.flutter.ui.FlutterPageStyle, java.lang.Class, java.lang.Long, android.os.Bundle, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(android.view.ViewGroup r21, p012xc85e97e9.p093xedfae76a.o r22, com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 r23, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 r24, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r25) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pi0.l1.x(android.view.ViewGroup, androidx.lifecycle.o, com.tencent.mm.flutter.ui.FlutterPageStyle, androidx.appcompat.app.AppCompatActivity, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ l1(pi0.q qVar, java.lang.String str, java.util.List list, boolean z17, java.lang.String str2, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(qVar, str, (i17 & 4) != 0 ? null : list, (i17 & 8) != 0 ? true : z17, (i17 & 16) != 0 ? "home" : str2);
    }
}
