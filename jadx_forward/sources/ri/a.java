package ri;

/* loaded from: classes12.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f477365a = new ri.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Runnable f477366b = new ri.c();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f477367c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final yj0.b f477368d = new ri.d();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f477369e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f477370f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final yj0.b f477371g = new ri.e();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Map f477372h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public static final yj0.b f477373i = new ri.f();

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.Map f477374j = new java.util.HashMap();

    /* renamed from: k, reason: collision with root package name */
    public static final yj0.b f477375k = new ri.g();

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.Map f477376l = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public static final yj0.b f477377m = new ri.h();

    public static void a(java.lang.Class cls, wh.t0 t0Var) {
        ph.u uVar;
        rh.e3 i17;
        if (!ih.d.c() || (uVar = (ph.u) ih.d.d().a(ph.u.class)) == null) {
            return;
        }
        qh.f0 f0Var = uVar.f435829h;
        if (f0Var.f444868d.f444831q || (i17 = f0Var.i(cls)) == null) {
            return;
        }
        t0Var.mo40853xab27b508(i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(android.os.PowerManager.WakeLock r8) {
        /*
            java.lang.String r0 = ")"
            java.lang.String r1 = "WakeLock ("
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 1
            java.lang.Class r4 = r8.getClass()     // Catch: java.lang.Throwable -> L23
            java.lang.String r5 = "getTag"
            r6 = 0
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L23
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r5, r7)     // Catch: java.lang.Throwable -> L23
            r4.setAccessible(r3)     // Catch: java.lang.Throwable -> L23
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L23
            java.lang.Object r4 = r4.invoke(r8, r5)     // Catch: java.lang.Throwable -> L23
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L23
            goto L28
        L23:
            r4 = move-exception
            r2.add(r4)
            r4 = 0
        L28:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L47
            java.lang.Class r5 = r8.getClass()     // Catch: java.lang.Throwable -> L43
            java.lang.String r6 = "mTag"
            java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch: java.lang.Throwable -> L43
            r5.setAccessible(r3)     // Catch: java.lang.Throwable -> L43
            java.lang.Object r5 = r5.get(r8)     // Catch: java.lang.Throwable -> L43
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L43
            r4 = r5
            goto L47
        L43:
            r5 = move-exception
            r2.add(r5)
        L47:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L88
            java.lang.Class r5 = r8.getClass()     // Catch: java.lang.Throwable -> L84
            java.lang.String r6 = "mTraceName"
            java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch: java.lang.Throwable -> L84
            r5.setAccessible(r3)     // Catch: java.lang.Throwable -> L84
            java.lang.Object r8 = r5.get(r8)     // Catch: java.lang.Throwable -> L84
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L84
            if (r8 == 0) goto L82
            boolean r3 = r8.startsWith(r1)     // Catch: java.lang.Throwable -> L7f
            if (r3 == 0) goto L82
            boolean r3 = r8.endsWith(r0)     // Catch: java.lang.Throwable -> L7f
            if (r3 == 0) goto L82
            int r1 = r8.indexOf(r1)     // Catch: java.lang.Throwable -> L7f
            int r1 = r1 + 10
            int r0 = r8.lastIndexOf(r0)     // Catch: java.lang.Throwable -> L7f
            if (r1 >= r0) goto L82
            java.lang.String r8 = r8.substring(r1, r0)     // Catch: java.lang.Throwable -> L7f
            goto L82
        L7f:
            r0 = move-exception
            r4 = r8
            goto L85
        L82:
            r4 = r8
            goto L88
        L84:
            r0 = move-exception
        L85:
            r2.add(r0)
        L88:
            boolean r8 = android.text.TextUtils.isEmpty(r4)
            if (r8 == 0) goto Lcc
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.util.Iterator r0 = r2.iterator()
        L97:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb9
            java.lang.Object r1 = r0.next()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            int r2 = r8.length()
            if (r2 != 0) goto Lac
            java.lang.String r2 = ""
            goto Lae
        Lac:
            java.lang.String r2 = ";"
        Lae:
            r8.append(r2)
            java.lang.String r1 = r1.getMessage()
            r8.append(r1)
            goto L97
        Lb9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getWakeLockTag err: "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "Matrix.battery.AmsInvokeListener"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r8)
        Lcc:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ri.a.b(android.os.PowerManager$WakeLock):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void c(java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final java.lang.String str5, java.lang.String str6, final java.lang.Object obj, final java.lang.Object[] objArr) {
        java.lang.String str7;
        char c17;
        ph.u uVar;
        rh.e3 i17;
        android.content.ServiceConnection serviceConnection;
        java.lang.String str8;
        java.lang.String str9;
        int i18;
        char c18;
        java.lang.String str10;
        java.lang.Class<?> cls;
        java.lang.String str11;
        android.content.ComponentName component;
        android.content.pm.PackageManager packageManager;
        ph.u uVar2;
        rh.e3 i19;
        final java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("on ");
        sb6.append(str);
        sb6.append(" invoke, method = ");
        sb6.append(str5);
        sb6.append(", form = ");
        sb6.append(str2);
        if ("wakelock".equals(str)) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("@");
            sb7.append(obj != null ? java.lang.Integer.valueOf(obj.hashCode()) : "");
            str7 = sb7.toString();
        } else {
            str7 = "";
        }
        sb6.append(str7);
        sb6.append(", args = ");
        sb6.append(java.util.Arrays.toString(objArr));
        str.getClass();
        int i27 = 0;
        switch (str.hashCode()) {
            case 3649301:
                if (str.equals("wifi")) {
                    c17 = 0;
                    break;
                }
                c17 = 65535;
                break;
            case 92895825:
                if (str.equals("alarm")) {
                    c17 = 1;
                    break;
                }
                c17 = 65535;
                break;
            case 93166550:
                if (str.equals("audio")) {
                    c17 = 2;
                    break;
                }
                c17 = 65535;
                break;
            case 289465551:
                if (str.equals("wakelock")) {
                    c17 = 3;
                    break;
                }
                c17 = 65535;
                break;
            case 1418030008:
                if (str.equals("bindService")) {
                    c17 = 4;
                    break;
                }
                c17 = 65535;
                break;
            case 1901043637:
                if (str.equals(ya.b.f77489x9ff58fb5)) {
                    c17 = 5;
                    break;
                }
                c17 = 65535;
                break;
            case 1968882350:
                if (str.equals("bluetooth")) {
                    c17 = 6;
                    break;
                }
                c17 = 65535;
                break;
            default:
                c17 = 65535;
                break;
        }
        switch (c17) {
            case 0:
                a(rh.e4.class, new wh.t0() { // from class: ri.a$$a
                    @Override // wh.t0
                    /* renamed from: accept */
                    public final void mo40853xab27b508(java.lang.Object obj2) {
                        rh.e4 e4Var = (rh.e4) obj2;
                        java.lang.String str12 = str5;
                        str12.getClass();
                        if (str12.equals("startScan")) {
                            e4Var.f476905b.f476899a++;
                        } else if (str12.equals("getScanResults")) {
                            e4Var.f476905b.f476900b++;
                        }
                    }
                });
                break;
            case 1:
                a(rh.m.class, new wh.t0() { // from class: ri.a$$d
                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    @Override // wh.t0
                    /* renamed from: accept */
                    public final void mo40853xab27b508(java.lang.Object obj2) {
                        char c19;
                        java.lang.String str12 = str5;
                        rh.m mVar = (rh.m) obj2;
                        str12.getClass();
                        switch (str12.hashCode()) {
                            case -1367724422:
                                if (str12.equals("cancel")) {
                                    c19 = 0;
                                    break;
                                }
                                c19 = 65535;
                                break;
                            case -749083434:
                                if (str12.equals("setExactAndAllowWhileIdle")) {
                                    c19 = 1;
                                    break;
                                }
                                c19 = 65535;
                                break;
                            case -683202289:
                                if (str12.equals("setInexactRepeating")) {
                                    c19 = 2;
                                    break;
                                }
                                c19 = 65535;
                                break;
                            case 113762:
                                if (str12.equals("set")) {
                                    c19 = 3;
                                    break;
                                }
                                c19 = 65535;
                                break;
                            case 693646066:
                                if (str12.equals("setWindow")) {
                                    c19 = 4;
                                    break;
                                }
                                c19 = 65535;
                                break;
                            case 884077093:
                                if (str12.equals("setRepeating")) {
                                    c19 = 5;
                                    break;
                                }
                                c19 = 65535;
                                break;
                            case 1391659965:
                                if (str12.equals("setExact")) {
                                    c19 = 6;
                                    break;
                                }
                                c19 = 65535;
                                break;
                            default:
                                c19 = 65535;
                                break;
                        }
                        switch (c19) {
                            case 0:
                                synchronized (mVar.f476984c.f476971a) {
                                    r5.f476973c--;
                                }
                                return;
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                rh.l lVar = mVar.f476984c;
                                synchronized (lVar.f476971a) {
                                    lVar.f476972b++;
                                    lVar.f476973c++;
                                }
                                return;
                            default:
                                return;
                        }
                    }
                });
                break;
            case 2:
                if (ih.d.c() && (uVar = (ph.u) ih.d.d().a(ph.u.class)) != null) {
                    qh.f0 f0Var = uVar.f435829h;
                    if (!f0Var.f444868d.f444831q && (i17 = f0Var.i(rh.m.class)) != null) {
                        str5.getClass();
                        break;
                    }
                }
                break;
            case 3:
                a(rh.z3.class, new wh.t0() { // from class: ri.a$$c
                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    @Override // wh.t0
                    /* renamed from: accept */
                    public final void mo40853xab27b508(java.lang.Object obj2) {
                        char c19;
                        java.lang.String str12 = str5;
                        java.lang.Object[] objArr2 = objArr;
                        java.lang.StringBuilder sb8 = sb6;
                        java.lang.String str13 = str2;
                        java.lang.String str14 = str3;
                        java.lang.String str15 = str4;
                        java.lang.Object obj3 = obj;
                        rh.z3 z3Var = (rh.z3) obj2;
                        str12.getClass();
                        switch (str12.hashCode()) {
                            case -1164222250:
                                if (str12.equals("acquire")) {
                                    c19 = 0;
                                    break;
                                }
                                c19 = 65535;
                                break;
                            case 1090594823:
                                if (str12.equals("release")) {
                                    c19 = 1;
                                    break;
                                }
                                c19 = 65535;
                                break;
                            case 1545258671:
                                if (str12.equals("newWakeLock")) {
                                    c19 = 2;
                                    break;
                                }
                                c19 = 65535;
                                break;
                            default:
                                c19 = 65535;
                                break;
                        }
                        switch (c19) {
                            case 0:
                                rh.y3 y3Var = z3Var.f477109d;
                                synchronized (y3Var.f477094a) {
                                    y3Var.f477097d++;
                                    y3Var.f477098e++;
                                }
                                java.lang.String b17 = obj3 instanceof android.os.PowerManager.WakeLock ? ri.a.b((android.os.PowerManager.WakeLock) obj3) : obj3.getClass().getSimpleName();
                                sb8.append(", tag = ");
                                if (android.text.TextUtils.isEmpty(b17)) {
                                    b17 = "null";
                                }
                                sb8.append(b17);
                                sb8.append("@");
                                sb8.append(obj3.hashCode());
                                return;
                            case 1:
                                synchronized (z3Var.f477109d.f477094a) {
                                    r12.f477098e--;
                                }
                                java.lang.String b18 = obj3 instanceof android.os.PowerManager.WakeLock ? ri.a.b((android.os.PowerManager.WakeLock) obj3) : obj3.getClass().getSimpleName();
                                sb8.append(", tag = ");
                                if (android.text.TextUtils.isEmpty(b18)) {
                                    b18 = "null";
                                }
                                sb8.append(b18);
                                sb8.append("@");
                                sb8.append(obj3.hashCode());
                                return;
                            case 2:
                                if (objArr2 == null || objArr2.length < 1) {
                                    return;
                                }
                                java.lang.Object obj4 = objArr2[0];
                                if (obj4 instanceof java.lang.Integer) {
                                    int intValue = ((java.lang.Integer) obj4).intValue();
                                    sb8.append(", flag = ");
                                    sb8.append(java.lang.Integer.toBinaryString(intValue));
                                    if (mm.l.c()) {
                                        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("");
                                        if ((intValue & 26) == 26) {
                                            sb9.append(sb9.length() == 0 ? "" : "_");
                                            sb9.append("FULL");
                                        }
                                        if ((intValue & 10) == 10) {
                                            sb9.append(sb9.length() == 0 ? "" : "_");
                                            sb9.append("BRIGHT");
                                        }
                                        if ((intValue & 6) == 6) {
                                            sb9.append(sb9.length() == 0 ? "" : "_");
                                            sb9.append("DIM");
                                        }
                                        if (sb9.length() > 0) {
                                            ap.a.a(1, "WakeFlags", new java.lang.Throwable(), null, str13, str14, str15, sb9.toString());
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                    }
                });
                break;
            case 4:
                if (objArr != null) {
                    int length = objArr.length;
                    int i28 = 0;
                    i18 = 0;
                    android.content.ServiceConnection serviceConnection2 = null;
                    str8 = null;
                    str9 = null;
                    while (i28 < length) {
                        java.lang.Object obj2 = objArr[i28];
                        if (obj2 instanceof android.content.ServiceConnection) {
                            serviceConnection2 = (android.content.ServiceConnection) obj2;
                        }
                        android.content.ServiceConnection serviceConnection3 = serviceConnection2;
                        if ((obj2 instanceof android.content.Intent) && (component = ((android.content.Intent) obj2).getComponent()) != null && (packageManager = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager()) != null) {
                            try {
                                android.content.pm.ServiceInfo serviceInfo = packageManager.getServiceInfo(component, i27);
                                if (serviceInfo != null) {
                                    str8 = serviceInfo.processName;
                                    str9 = serviceInfo.name;
                                }
                            } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Matrix.battery.AmsInvokeListener", "get service info err: " + e17.getMessage());
                            }
                        }
                        if (obj2 instanceof java.lang.Integer) {
                            i18 = ((java.lang.Integer) obj2).intValue();
                        }
                        i28++;
                        serviceConnection2 = serviceConnection3;
                        i27 = 0;
                    }
                    serviceConnection = serviceConnection2;
                } else {
                    serviceConnection = null;
                    str8 = null;
                    str9 = null;
                    i18 = 0;
                }
                str5.getClass();
                switch (str5.hashCode()) {
                    case -1531153537:
                        if (str5.equals("unbindService")) {
                            c18 = 0;
                            break;
                        }
                        c18 = 65535;
                        break;
                    case -764694283:
                        if (str5.equals("bindServiceAsUser")) {
                            c18 = 1;
                            break;
                        }
                        c18 = 65535;
                        break;
                    case -379822753:
                        if (str5.equals("bindIsolatedService")) {
                            c18 = 2;
                            break;
                        }
                        c18 = 65535;
                        break;
                    case 1418030008:
                        if (str5.equals("bindService")) {
                            c18 = 3;
                            break;
                        }
                        c18 = 65535;
                        break;
                    default:
                        c18 = 65535;
                        break;
                }
                if (c18 != 0) {
                    if (c18 == 1 || c18 == 2 || c18 == 3) {
                        if (!android.text.TextUtils.isEmpty(str8)) {
                            try {
                                cls = java.lang.Class.forName(str9);
                                ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q) ((ob0.i3) i95.n0.c(ob0.i3.class))).getClass();
                                ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p0) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.i0) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.i0.class))).getClass();
                            } catch (java.lang.ClassNotFoundException unused) {
                                str10 = str9;
                            }
                            if (com.p314xaae8f345.mm.p794xb0fa9b5e.AbstractServiceC10745xd59a50ca.class.isAssignableFrom(cls)) {
                                ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q) ((ob0.i3) i95.n0.c(ob0.i3.class))).getClass();
                                ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p0) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.i0) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.i0.class))).getClass();
                                java.lang.ThreadLocal threadLocal = com.p314xaae8f345.mm.p794xb0fa9b5e.q.f149920i;
                                java.lang.Class cls2 = threadLocal != null ? (java.lang.Class) threadLocal.get() : null;
                                if (cls2 != null) {
                                    str11 = "ipc:" + cls2.getName();
                                    str10 = str11;
                                    if ((i18 & 1) != 1 || (i18 & 32) != 32) {
                                        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q) ((ob0.i3) i95.n0.c(ob0.i3.class))).Ni("type_bind_service", java.lang.System.currentTimeMillis(), bm5.f1.a(), str8, str10);
                                    }
                                }
                            }
                            str11 = str9;
                            str10 = str11;
                            if ((i18 & 1) != 1) {
                            }
                            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q) ((ob0.i3) i95.n0.c(ob0.i3.class))).Ni("type_bind_service", java.lang.System.currentTimeMillis(), bm5.f1.a(), str8, str10);
                        }
                        if (!(serviceConnection instanceof l85.s0)) {
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c && (i18 & 1) == 1) {
                                ap.a.a(1, "bindService", new java.lang.Throwable(), null, str8, str9, java.lang.String.valueOf(i18), str5);
                            }
                            if (serviceConnection != null && !android.text.TextUtils.isEmpty(str8)) {
                                java.util.Map map = f477365a;
                                synchronized (map) {
                                    java.util.List list = (java.util.List) ((java.util.LinkedHashMap) map).get(str8);
                                    if (list == null) {
                                        list = new java.util.LinkedList();
                                        ((java.util.HashMap) map).put(str8, list);
                                    }
                                    java.util.List list2 = list;
                                    synchronized (list2) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.AmsInvokeListener", "hold service conn: " + str9 + "@" + serviceConnection.hashCode() + ", proc=" + str8);
                                        list2.add(new android.util.Pair(str9, new java.lang.ref.WeakReference(serviceConnection)));
                                    }
                                    break;
                                }
                            }
                        }
                    }
                } else if (serviceConnection != null) {
                    java.util.Map map2 = f477365a;
                    synchronized (map2) {
                        for (java.util.List list3 : ((java.util.LinkedHashMap) map2).values()) {
                            synchronized (list3) {
                                try {
                                    java.util.Iterator it = list3.iterator();
                                    while (it.hasNext()) {
                                        android.util.Pair pair = (android.util.Pair) it.next();
                                        if (((java.lang.ref.WeakReference) pair.second).get() == serviceConnection) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.AmsInvokeListener", "release service conn: " + ((java.lang.String) pair.first) + "@" + serviceConnection.hashCode());
                                            it.remove();
                                        }
                                    }
                                } catch (java.lang.Exception e18) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Matrix.battery.AmsInvokeListener", "modify err: " + e18.getMessage());
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            case 5:
                if (ih.d.c() && (uVar2 = (ph.u) ih.d.d().a(ph.u.class)) != null) {
                    qh.f0 f0Var2 = uVar2.f435829h;
                    if (!f0Var2.f444868d.f444831q && (i19 = f0Var2.i(rh.m2.class)) != null) {
                        rh.m2 m2Var = (rh.m2) i19;
                        str5.getClass();
                        if (str5.equals("requestLocationUpdates")) {
                            m2Var.f476993b.f476977a++;
                            break;
                        }
                    }
                }
                break;
            case 6:
                a(rh.b0.class, new wh.t0() { // from class: ri.a$$b
                    @Override // wh.t0
                    /* renamed from: accept */
                    public final void mo40853xab27b508(java.lang.Object obj3) {
                        rh.b0 b0Var = (rh.b0) obj3;
                        java.lang.String str12 = str5;
                        str12.getClass();
                        char c19 = 65535;
                        switch (str12.hashCode()) {
                            case -2129330689:
                                if (str12.equals("startScan")) {
                                    c19 = 0;
                                    break;
                                }
                                break;
                            case -2081340776:
                                if (str12.equals("startLeScan")) {
                                    c19 = 1;
                                    break;
                                }
                                break;
                            case -475549842:
                                if (str12.equals("startDiscovery")) {
                                    c19 = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c19) {
                            case 0:
                            case 1:
                                b0Var.f476840b.f476830c++;
                                return;
                            case 2:
                                b0Var.f476840b.f476829b++;
                                return;
                            default:
                                return;
                        }
                    }
                });
                break;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.AmsInvokeListener", sb6.toString());
    }
}
