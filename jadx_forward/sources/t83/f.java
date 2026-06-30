package t83;

/* loaded from: classes8.dex */
public abstract class f {
    public static java.lang.String a(long j17) {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        double d17 = j17;
        if (d17 <= 60.0d) {
            return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3o, java.lang.String.valueOf(j17));
        }
        double d18 = d17 / 60.0d;
        int i17 = (int) d18;
        if (d18 - i17 > 0.0d) {
            i17++;
        }
        return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3n, java.lang.String.valueOf(i17));
    }

    public static java.lang.String b(long j17) {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (d(j17, 6) == 0) {
            return new java.text.SimpleDateFormat("HH:mm", java.util.Locale.US).format(new java.util.Date(j17));
        }
        return d(j17, 6) == -1 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3j) : new java.text.SimpleDateFormat("MM/dd", java.util.Locale.US).format(new java.util.Date(j17));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(android.content.Context r9) {
        /*
            java.lang.Class<lg0.n> r0 = lg0.n.class
            i95.m r0 = i95.n0.c(r0)
            lg0.n r0 = (lg0.n) r0
            kg0.r r0 = (kg0.r) r0
            r0.getClass()
            boolean r0 = vq4.p0.d()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1a
            r0 = 2131769773(0x7f1039ad, float:1.917083E38)
            goto L98
        L1a:
            boolean r0 = p21.i.a()
            r3 = 2131769771(0x7f1039ab, float:1.9170826E38)
            if (r0 == 0) goto L26
        L23:
            r0 = r3
            goto L98
        L26:
            boolean r0 = iq.b.H()
            r4 = 2131769767(0x7f1039a7, float:1.9170818E38)
            if (r0 == 0) goto L32
        L2f:
            r0 = r4
            goto L98
        L32:
            p21.b r0 = p21.l.a()
            if (r0 == 0) goto L82
            p21.b r0 = p21.l.a()
            dh4.t r0 = (dh4.t) r0
            monitor-enter(r0)
            bh4.b r5 = r0.f314116b     // Catch: java.lang.Throwable -> L7f
            java.util.LinkedList r5 = r5.f102450d     // Catch: java.lang.Throwable -> L7f
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L7f
        L47:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L7f
            if (r6 == 0) goto L79
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L7f
            bh4.a r6 = (bh4.a) r6     // Catch: java.lang.Throwable -> L7f
            int r7 = r6.f102449f     // Catch: java.lang.Throwable -> L7f
            if (r7 == 0) goto L58
            goto L47
        L58:
            java.util.LinkedList r6 = r6.f102448e     // Catch: java.lang.Throwable -> L7f
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L7f
        L5e:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L7f
            if (r7 == 0) goto L47
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L7f
            r45.nk6 r7 = (r45.nk6) r7     // Catch: java.lang.Throwable -> L7f
            java.lang.String r8 = c01.z1.r()     // Catch: java.lang.Throwable -> L7f
            java.lang.String r7 = r7.f463007e     // Catch: java.lang.Throwable -> L7f
            boolean r7 = r8.equals(r7)     // Catch: java.lang.Throwable -> L7f
            if (r7 == 0) goto L5e
            monitor-exit(r0)
            r0 = r1
            goto L7b
        L79:
            monitor-exit(r0)
            r0 = r2
        L7b:
            if (r0 == 0) goto L82
            r0 = r1
            goto L83
        L7f:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        L82:
            r0 = r2
        L83:
            if (r0 == 0) goto L86
            goto L23
        L86:
            boolean r0 = iq.b.a()
            if (r0 == 0) goto L90
            r0 = 2131769772(0x7f1039ac, float:1.9170828E38)
            goto L98
        L90:
            boolean r0 = iq.b.d()
            if (r0 == 0) goto L97
            goto L2f
        L97:
            r0 = r2
        L98:
            if (r0 != 0) goto L9b
            return r1
        L9b:
            r1 = 2131756315(0x7f10051b, float:1.9143534E38)
            db5.e1.i(r9, r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t83.f.c(android.content.Context):boolean");
    }

    public static long d(long j17, int i17) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        long timeInMillis = calendar.getTimeInMillis();
        calendar.add(i17, 1);
        long timeInMillis2 = calendar.getTimeInMillis() - timeInMillis;
        return (j17 / timeInMillis2) - (java.util.Calendar.getInstance().getTimeInMillis() / timeInMillis2);
    }

    public static r45.zr3 e() {
        java.lang.Object m17 = c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IPCALL_ACCOUNT_CACHE_STRING, null);
        if (m17 != null) {
            r45.zr3 zr3Var = new r45.zr3();
            try {
                zr3Var.mo11468x92b714fd(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(m17.toString()));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallUtil", "[royle]parse success,Coupons:%s,Wording:%s,Title:%s,Desc:%s,ImgPath:%s,UrlPath:%s,Balance:%s,PVWording:%s,PackageMsg:%s", zr3Var.f473850d, zr3Var.f473851e, zr3Var.f473852f, zr3Var.f473853g, zr3Var.f473854h, zr3Var.f473855i, zr3Var.f473856m, zr3Var.f473857n, zr3Var.f473864u);
                return zr3Var;
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallUtil", "[royle]parse exception:%s", e17.getMessage());
            }
        }
        return null;
    }

    public static java.lang.String f() {
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("IPCall_LastInputPref", 0).getString("IPCall_LastInputCountryCode", "");
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) ? string.replace("+", "") : t83.c.h();
    }

    public static r45.c27 g(java.util.LinkedList linkedList) {
        if (linkedList == null || linkedList.size() <= 0) {
            return null;
        }
        r45.c27 c27Var = new r45.c27();
        c27Var.f452782d = linkedList.size();
        c27Var.f452783e = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.fe5 fe5Var = (r45.fe5) it.next();
            r45.b27 b27Var = new r45.b27();
            int i17 = 0;
            try {
                byte[] address = java.net.InetAddress.getByName(fe5Var.f455789d).getAddress();
                if (address != null) {
                    int i18 = 0;
                    for (byte b17 : address) {
                        i18 = (i18 << 8) | (b17 & 255);
                    }
                    i17 = i18;
                }
            } catch (java.net.UnknownHostException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.IPCallUtil", e17, "", new java.lang.Object[0]);
            }
            b27Var.f452018d = i17;
            b27Var.f452019e = fe5Var.f455790e;
            b27Var.f452020f = fe5Var.f455789d;
            c27Var.f452783e.add(b27Var);
        }
        return c27Var;
    }

    public static java.lang.String h(int i17) {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (i17 != 1 && i17 != 2) {
            return i17 != 6 ? i17 != 7 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g4x) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g4u) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g4t);
        }
        return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g4x);
    }

    public static java.lang.String i(java.lang.String str) {
        return str.replace("-", "").replace(" ", "").replace("(", "").replace(")", "").trim();
    }
}
