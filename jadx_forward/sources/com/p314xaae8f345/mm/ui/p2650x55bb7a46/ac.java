package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes8.dex */
public class ac {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f279906a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f279907b;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.z3 f279909d;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f279908c = null;

    /* renamed from: e, reason: collision with root package name */
    public final java.text.SimpleDateFormat f279910e = new java.text.SimpleDateFormat("yyyy-MM-dd");

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f279911f = null;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f279912g = new java.util.ArrayList();

    public ac(android.content.Context context, java.util.List list, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        this.f279909d = null;
        this.f279906a = context;
        this.f279907b = list;
        this.f279909d = z3Var;
    }

    public final java.lang.String a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String str;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f279909d.d1())) {
            java.lang.String j17 = f9Var.j();
            int t17 = c01.w9.t(j17);
            if (t17 != -1) {
                java.lang.String trim = j17.substring(0, t17).trim();
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                str = c01.a2.e(trim);
            } else {
                str = null;
            }
        } else {
            java.lang.String Q0 = f9Var.Q0();
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            str = c01.a2.e(Q0);
        }
        if (f9Var.A0() == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OtherMailHistoryExporter", "isSend");
            str = c01.z1.l();
        }
        return "" + str + "  " + new java.text.SimpleDateFormat("HH:mm").format(new java.util.Date(f9Var.mo78012x3fdd41df()));
    }

    public java.lang.String b() {
        java.lang.String f27;
        java.lang.String format;
        java.lang.String str;
        java.lang.String str2;
        int i17;
        java.lang.String str3;
        java.util.List<com.p314xaae8f345.mm.p2621x8fb0427b.f9> list = this.f279907b;
        list.size();
        java.lang.String str4 = this.f279911f;
        if (str4 != null) {
            return str4;
        }
        java.util.ArrayList arrayList = this.f279912g;
        arrayList.clear();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f279909d;
        boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(z3Var.d1());
        android.content.Context context = this.f279906a;
        java.lang.String str5 = null;
        if (R4) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var.P0())) {
                qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
                java.lang.String d17 = z3Var.d1();
                ((py.a) iVar).getClass();
                java.lang.String str6 = "";
                for (java.lang.String str7 : c01.v1.m(d17)) {
                    ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                    str6 = str6 + c01.a2.e(str7) + ", ";
                }
                f27 = str6.substring(0, str6.length() - 2);
            } else {
                f27 = z3Var.f2();
            }
            format = java.lang.String.format(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ihx), f27);
        } else {
            format = java.lang.String.format(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ihy), z3Var.f2(), c01.d9.b().p().l(4, null));
        }
        sb6.append(format);
        sb6.append("\n\n");
        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
        java.lang.String str8 = "share_mail_export";
        com.p314xaae8f345.mm.vfs.r6 h07 = lp0.b.h0("share_mail_export");
        if (h07.m()) {
            com.p314xaae8f345.mm.vfs.w6.f(h07.o());
        }
        h07.J();
        for (com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var : list) {
            java.lang.String str9 = this.f279908c;
            java.text.SimpleDateFormat simpleDateFormat = this.f279910e;
            if (str9 == null) {
                java.lang.String format2 = simpleDateFormat.format(new java.util.Date(f9Var.mo78012x3fdd41df()));
                this.f279908c = format2;
                sb6.append(java.lang.String.format("—————  %s  —————\n\n", format2));
                sb6.append("\n");
            } else {
                java.lang.String format3 = simpleDateFormat.format(new java.util.Date(f9Var.mo78012x3fdd41df()));
                if (!format3.equals(this.f279908c)) {
                    this.f279908c = format3;
                    sb6.append(java.lang.String.format("—————  %s  —————\n\n", format3));
                    sb6.append("\n");
                }
            }
            if (f9Var.b3()) {
                if (f9Var.b3()) {
                    if (f9Var.A0() == 1) {
                        str = java.lang.String.format("%s\n\n%s\n\n", a(f9Var), f9Var.j());
                    } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(z3Var.d1())) {
                        int t17 = c01.w9.t(f9Var.j());
                        if (t17 != -1) {
                            str = java.lang.String.format("%s\n\n%s\n\n", a(f9Var), f9Var.j().substring(t17 + 1).trim());
                        }
                    } else {
                        str = java.lang.String.format("%s\n\n%s\n\n", a(f9Var), f9Var.j());
                    }
                    sb6.append(str);
                }
                str = str5;
                sb6.append(str);
            } else {
                if (f9Var.J2()) {
                    if (f9Var.J2()) {
                        long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
                        str2 = str8;
                        long I0 = f9Var.I0();
                        java.lang.String c17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.eb.c(f9Var.Q0(), m124847x74d37ac6, true);
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17) || !com.p314xaae8f345.mm.vfs.w6.j(c17)) {
                            c17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.eb.d(f9Var.Q0(), I0, true);
                        }
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17)) {
                            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(c17);
                            if (!r6Var.m82467xfb82e301().endsWith(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG)) {
                                com.p314xaae8f345.mm.vfs.r7 r7Var2 = com.p314xaae8f345.mm.vfs.q7.f294674a;
                                com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(lp0.b.h0(str2), r6Var.m82467xfb82e301() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG);
                                com.p314xaae8f345.mm.vfs.w6.c(c17, r6Var2.o());
                                r6Var = r6Var2;
                            }
                            arrayList.add(com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.b(context, r6Var));
                            str3 = java.lang.String.format("%s\n\n%s\n\n", a(f9Var), java.lang.String.format("[%s: %s(%s)]", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bua), r6Var.m82467xfb82e301(), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bu7)));
                            sb6.append(str3);
                        }
                    } else {
                        str2 = str8;
                    }
                    str3 = null;
                    sb6.append(str3);
                } else {
                    str2 = str8;
                    if (f9Var.k2()) {
                        ot0.q v17 = ot0.q.v(f9Var.j());
                        if (v17 == null || !((i17 = v17.f430199i) == 53 || i17 == 57)) {
                            sb6.append(c(f9Var));
                        } else {
                            sb6.append((i17 == 53 || i17 == 57) ? java.lang.String.format("%s\n\n%s\n\n", a(f9Var), v17.f430187f) : null);
                        }
                    } else {
                        sb6.append(c(f9Var));
                    }
                }
                str8 = str2;
                str5 = null;
            }
        }
        sb6.append("\n\n");
        java.lang.String sb7 = sb6.toString();
        this.f279911f = sb7;
        return sb7;
    }

    public final java.lang.String c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String format;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d D0;
        boolean g37 = f9Var.g3();
        android.content.Context context = this.f279906a;
        if (g37) {
            format = java.lang.String.format("[%s]", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.buf));
        } else if (f9Var.k3()) {
            format = f9Var.A0() == 1 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bud) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.buc);
        } else if (f9Var.L2()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5689x3d19c202 c5689x3d19c202 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5689x3d19c202();
            am.ej ejVar = c5689x3d19c202.f136014g;
            ejVar.f88092a = 1;
            ejVar.f88094c = f9Var;
            c5689x3d19c202.e();
            format = java.lang.String.format("[%s]", c5689x3d19c202.f136015h.f88213a);
        } else {
            boolean k27 = f9Var.k2();
            java.util.ArrayList arrayList = this.f279912g;
            if (k27) {
                java.lang.String j17 = f9Var.j();
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                ot0.q v17 = ot0.q.v(j17);
                if (v17 != null) {
                    int i17 = v17.f430199i;
                    if ((i17 == 4 || i17 == 6 || i17 == 130) && (D0 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().D0(v17.f430227p)) != null) {
                        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(D0.f68099xfeae815);
                        if (r6Var.m()) {
                            arrayList.add(com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.b(context, r6Var));
                        }
                    }
                    lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
                    java.lang.String str = v17.f430179d;
                    ((kt.c) i0Var).getClass();
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str);
                    if (h17 == null) {
                        format = "";
                    } else {
                        java.lang.String str2 = h17.f67372x453d1e07;
                        format = ez.v0.f339310a.j(java.lang.Integer.valueOf(v17.f430199i)) ? java.lang.String.format("[%s: %s(%s)]", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bu6), str2, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bu7)) : java.lang.String.format("[%s: %s]", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bu6), str2);
                    }
                }
                format = null;
            } else if (f9Var.E2()) {
                format = java.lang.String.format("[%s: %s]", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bu8), ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).D3(f9Var.j()).f277892b);
            } else if (f9Var.m78014x7b98c171()) {
                com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f104104s, f9Var.z0(), false));
                java.lang.String format2 = java.lang.String.format("[%s: %s(%s)]", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bue), r6Var2.m82467xfb82e301(), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bu7));
                if (r6Var2.m()) {
                    java.lang.String o17 = r6Var2.o();
                    if (!r6Var2.m82467xfb82e301().endsWith(".mp4")) {
                        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
                        com.p314xaae8f345.mm.vfs.r6 r6Var3 = new com.p314xaae8f345.mm.vfs.r6(lp0.b.h0("share_mail_export"), r6Var2.m82467xfb82e301() + ".mp4");
                        com.p314xaae8f345.mm.vfs.w6.c(o17, r6Var3.o());
                        r6Var2 = r6Var3;
                    }
                    arrayList.add(com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.b(context, r6Var2));
                }
                format = format2;
            } else {
                if (f9Var.C2() || f9Var.m2()) {
                    format = java.lang.String.format("[%s]", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bu9));
                }
                format = null;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OtherMailHistoryExporter", "formatOtherMsg, msgStr = %s", format);
        return java.lang.String.format("%s\n\n%s\n\n", a(f9Var), format);
    }
}
