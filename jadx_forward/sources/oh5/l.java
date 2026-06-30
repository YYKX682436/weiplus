package oh5;

/* loaded from: classes12.dex */
public final class l extends oh5.d {

    /* renamed from: f, reason: collision with root package name */
    public static volatile int f427037f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashMap f427038g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public static boolean f427039h;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f427040d;

    /* renamed from: e, reason: collision with root package name */
    public final oh5.q[] f427041e;

    public l() {
        f427038g.put(java.lang.Integer.valueOf(f427037f), this);
        this.f427041e = new oh5.q[]{new oh5.q("FTSMainUI", oh5.r.a("2022-12-28")), new oh5.q("MMWebViewUI", oh5.r.a("2022-12-28")), new oh5.q("TmplWebViewMMUI", oh5.r.a("2022-12-28"))};
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002a A[SYNTHETIC] */
    @Override // oh5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.content.Intent r15) {
        /*
            r14 = this;
            java.lang.String r0 = "intent"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r15, r0)
            java.lang.String r0 = "KEY_COUNTER"
            r1 = -1
            int r0 = r15.getIntExtra(r0, r1)
            java.util.HashMap r1 = oh5.l.f427038g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r2 = r1.get(r2)
            oh5.l r2 = (oh5.l) r2
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L74
            java.util.List r6 = r2.d()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L2a:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L75
            java.lang.Object r8 = r6.next()
            r9 = r8
            oi.e r9 = (oi.e) r9
            oi.h r10 = oi.h.f427100e
            java.util.List r11 = r10.f427102b
            monitor-enter(r11)
            java.util.List r12 = r10.f427102b     // Catch: java.lang.Throwable -> L71
            java.util.LinkedList r12 = (java.util.LinkedList) r12     // Catch: java.lang.Throwable -> L71
            boolean r12 = r12.contains(r9)     // Catch: java.lang.Throwable -> L71
            if (r12 != 0) goto L48
            r12 = r5
            goto L49
        L48:
            r12 = r4
        L49:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L71
            if (r12 != 0) goto L6a
            java.util.List r11 = r10.f427104d
            monitor-enter(r11)
            java.util.List r10 = r10.f427104d     // Catch: java.lang.Throwable -> L67
            long r12 = r9.f427094g     // Catch: java.lang.Throwable -> L67
            java.lang.Long r9 = java.lang.Long.valueOf(r12)     // Catch: java.lang.Throwable -> L67
            java.util.ArrayList r10 = (java.util.ArrayList) r10     // Catch: java.lang.Throwable -> L67
            boolean r9 = r10.contains(r9)     // Catch: java.lang.Throwable -> L67
            if (r9 != 0) goto L61
            r9 = r5
            goto L62
        L61:
            r9 = r4
        L62:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L67
            if (r9 != 0) goto L6a
            r9 = r5
            goto L6b
        L67:
            r15 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L67
            throw r15
        L6a:
            r9 = r4
        L6b:
            if (r9 == 0) goto L2a
            r7.add(r8)
            goto L2a
        L71:
            r15 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L71
            throw r15
        L74:
            r7 = r3
        L75:
            if (r7 == 0) goto L7c
            r2.getClass()
            r2.f427040d = r7
        L7c:
            if (r7 == 0) goto L86
            boolean r2 = r7.isEmpty()
            r2 = r2 ^ r5
            if (r5 != r2) goto L86
            r4 = r5
        L86:
            java.lang.String r2 = "MicroMsg.MatrixOpenGLLeakResultHelper"
            if (r4 == 0) goto La8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "leak not empty["
            r0.<init>(r1)
            int r1 = r7.size()
            r0.append(r1)
            java.lang.String r1 = "]. continue start ui"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            super.a(r15)
            goto Lca
        La8:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            java.lang.Object r15 = r1.remove(r15)
            oh5.l r15 = (oh5.l) r15
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "skip start ui, already released: "
            r0.<init>(r1)
            if (r15 == 0) goto Lc0
            java.util.List r3 = r15.d()
        Lc0:
            r0.append(r3)
            java.lang.String r15 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r15)
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oh5.l.a(android.content.Intent):void");
    }

    @Override // oh5.d
    public java.lang.String c() {
        return com.p314xaae8f345.mm.ui.p2715xbf8d97c1.C22441x64072404.class.getName();
    }

    public final java.util.List d() {
        java.util.List list = this.f427040d;
        if (list != null) {
            return list;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("openGLInfoList");
        throw null;
    }

    public final void e(java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        if (f427039h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MatrixOpenGLLeakResultHelper", "muted");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean z17 = false;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            oi.e eVar = (oi.e) next;
            java.lang.String name = eVar.f427098k.f436026b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            oh5.q[] qVarArr = this.f427041e;
            int length = qVarArr.length;
            int i17 = 0;
            while (i17 < length) {
                oh5.q qVar = qVarArr[i17];
                oi.e eVar2 = eVar;
                if (java.lang.System.currentTimeMillis() < qVar.f427052b) {
                    arrayList2.add(qVar);
                }
                i17++;
                eVar = eVar2;
            }
            oi.e eVar3 = eVar;
            if (!arrayList2.isEmpty()) {
                java.util.Iterator it6 = arrayList2.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        if (r26.n0.D(name, (java.lang.CharSequence) ((oh5.q) it6.next()).f427051a, false, 2, null)) {
                            z17 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MatrixOpenGLLeakResultHelper", "leak white list: " + eVar3);
            }
            if (!z17) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(((oi.e) obj).a(), "getJavaStack(...)");
            if (!r26.n0.B(r6, "com.tencent.matrix.openglleak.utils.EGLHelper", false)) {
                arrayList3.add(obj);
            }
        }
        this.f427040d = arrayList3;
        if (d().isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MatrixOpenGLLeakResultHelper", "no leak");
        } else {
            pm0.v.X(new oh5.k(this));
        }
    }
}
