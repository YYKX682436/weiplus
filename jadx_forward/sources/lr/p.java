package lr;

/* loaded from: classes16.dex */
public class p implements lr.l0 {

    /* renamed from: a, reason: collision with root package name */
    public int f402098a;

    /* renamed from: b, reason: collision with root package name */
    public final nr.j f402099b;

    /* renamed from: c, reason: collision with root package name */
    public final nr.c f402100c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9 f402101d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 f402102e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f402103f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f402104g;

    /* renamed from: h, reason: collision with root package name */
    public int f402105h;

    public p(int i17, nr.j jVar, nr.c cVar) {
        this.f402098a = i17;
        this.f402099b = jVar;
        this.f402100c = cVar;
    }

    public static final void c(lr.p pVar, android.content.Context context, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        pVar.getClass();
        qk.x6 m17 = interfaceC4987x84e327cb.m1();
        interfaceC4987x84e327cb.F1(qk.x6.STATUS_UPLOADING);
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) interfaceC4987x84e327cb;
        ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).m(c21053xdbf1e5f4);
        c21053xdbf1e5f4.F1(m17);
        ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().c(c21053xdbf1e5f4.mo42933xb5885648());
    }

    @Override // lr.k0
    public void a(android.view.View view, android.content.Context context, int i17, ir.u0 u0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // lr.k0
    public void b(android.view.View view, android.content.Context context, int i17, ir.u0 u0Var) {
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb;
        int i18;
        java.lang.String str;
        java.lang.String localClassName;
        java.lang.String string;
        yz5.a aVar;
        android.content.Context context2 = context;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPanelClickListener", "onClick: " + i17 + ", " + u0Var);
        if (u0Var == null) {
            return;
        }
        nr.j jVar = this.f402099b;
        if (jVar != null) {
            jVar.f420588c = this.f402098a;
        }
        nr.c cVar = this.f402100c;
        if (cVar != null) {
            cVar.f420569c = this.f402098a;
        }
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.o2) ((ty.g0) i95.n0.c(ty.g0.class))).wi();
        boolean z17 = false;
        int i19 = u0Var.f375440a;
        if (i19 == 0) {
            ir.g gVar = (ir.g) u0Var;
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb2 = gVar.f375369b;
            if (n22.m.l(interfaceC4987x84e327cb2)) {
                interfaceC4987x84e327cb = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().d((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) interfaceC4987x84e327cb2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(interfaceC4987x84e327cb, "getRandomEmoji(...)");
            } else {
                interfaceC4987x84e327cb = interfaceC4987x84e327cb2;
            }
            gr.t.g().a();
            int size = gr.t.g().a().size();
            if (i17 > 997 || i17 > size) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EmojiPanelClickListener", "reportClick error : " + i17 + ", md5: " + interfaceC4987x84e327cb2.mo42933xb5885648() + ", count: " + size + ", group: " + interfaceC4987x84e327cb2.mo42930x4f4a97c4() + ", designer: " + interfaceC4987x84e327cb2.X0());
            }
            if (jVar != null) {
                java.lang.String mo42933xb5885648 = interfaceC4987x84e327cb2.mo42933xb5885648();
                java.lang.String mo42930x4f4a97c4 = interfaceC4987x84e327cb2.mo42930x4f4a97c4();
                java.lang.String X0 = interfaceC4987x84e327cb2.X0();
                java.lang.String S0 = interfaceC4987x84e327cb2.S0();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16029, mo42933xb5885648, mo42930x4f4a97c4, X0, S0, java.lang.Integer.valueOf(jVar.f420588c), java.lang.Long.valueOf(currentTimeMillis - jVar.f420586a), java.lang.Integer.valueOf(jVar.f420587b), java.lang.Integer.valueOf(jVar.f420589d), java.lang.Integer.valueOf(jVar.f420590e), 0, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(jVar.f420591f), 0, 0, java.lang.Integer.valueOf(jVar.f420592g), jVar.f420593h, java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(jVar.f420586a), java.lang.Integer.valueOf(jVar.f420596k), jVar.f420594i, java.lang.Integer.valueOf(jVar.f420595j));
                i18 = 1;
                jVar.f420587b++;
            } else {
                i18 = 1;
            }
            int i27 = gVar.f375370c;
            if (i27 == 0) {
                interfaceC4987x84e327cb.v1(qk.z6.SEND_FROM_SCENE_CUSTOM_TAB);
            } else if (i27 == i18) {
                interfaceC4987x84e327cb.v1(qk.z6.SEND_FROM_SCENE_CAMERA_TAB);
            } else if (i27 == 2) {
                interfaceC4987x84e327cb.v1(qk.z6.SEND_FROM_SCENE_STORE_TAB);
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9 v9Var = this.f402101d;
            if (v9Var != null) {
                v9Var.b((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) interfaceC4987x84e327cb);
                return;
            }
            return;
        }
        if (i19 == 1) {
            ir.a1 a1Var = (ir.a1) u0Var;
            ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().g(a1Var.f375347b.f356196a);
            java.lang.String d17 = com.p314xaae8f345.mm.p2614xca6eae71.e1.b().d(a1Var.f375347b.f356196a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getText(...)");
            java.lang.String str2 = this.f402103f;
            if (str2 != null) {
                r10 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str2) ? 2 : 1;
                str = str2;
            } else {
                str = "";
                r10 = 0;
            }
            boolean z18 = a1Var.f375348c;
            nr.a.f420562a = z18;
            if (cVar != null) {
                java.lang.String t17 = r26.i0.t(d17, ",", " ", false);
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13470, t17, java.lang.Integer.valueOf(cVar.f420569c), java.lang.Integer.valueOf(z18 ? 1 : 0), 0, 0, java.lang.Integer.valueOf(a1Var.f375349d), java.lang.Integer.valueOf(cVar.f420571e ? 1 : 0), java.lang.Integer.valueOf(cVar.f420570d), java.lang.Integer.valueOf(cVar.f420568b), java.lang.Long.valueOf(currentTimeMillis2 - cVar.f420567a), java.lang.Long.valueOf(currentTimeMillis2), java.lang.Long.valueOf(cVar.f420567a), java.lang.Integer.valueOf(cVar.f420572f), cVar.f420573g, java.lang.Integer.valueOf(r10), str);
                cVar.f420568b++;
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 k0Var = this.f402102e;
            if (k0Var != null) {
                k0Var.a(d17);
                return;
            }
            return;
        }
        if (i19 == 2) {
            if (((se0.e) ((te0.e) i95.n0.c(te0.e.class))).m164332x74219ae7()) {
                ((se0.e) ((te0.e) i95.n0.c(te0.e.class))).getClass();
                ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context2);
                return;
            }
            nr.d.f420574a.a(2);
            ir.i0 i0Var = (ir.i0) u0Var;
            r45.v75 v75Var = i0Var.f375400c;
            if (v75Var != null) {
                android.app.Activity a17 = q75.a.a(context);
                qk.v vVar = new qk.v();
                vVar.f445560g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1(java.lang.Integer.valueOf(v75Var.f469497d));
                java.lang.String str3 = v75Var.f469498e;
                if (str3 == null) {
                    str3 = "";
                }
                vVar.f445563j = str3;
                java.lang.String str4 = v75Var.f469499f;
                if (str4 == null) {
                    str4 = "";
                }
                vVar.f445564k = str4;
                java.lang.String str5 = v75Var.f469500g;
                if (str5 == null) {
                    str5 = "";
                }
                vVar.f445565l = str5;
                java.lang.String str6 = v75Var.f469502i;
                if (str6 == null) {
                    str6 = "";
                }
                vVar.f445567n = str6;
                java.lang.String str7 = v75Var.f469503m;
                vVar.f445566m = str7 != null ? str7 : "";
                vVar.f445568o = i0Var.f375402e;
                vVar.f445579z = true;
                if (a17 != null && (localClassName = a17.getLocalClassName()) != null && r26.n0.B(localClassName, "AppBrandUI", false)) {
                    z17 = true;
                }
                if (z17) {
                    vVar.f445574u = true;
                }
                vVar.f445689b = true;
                boolean z19 = i0Var.f375401d;
                vVar.f445688a = z19 ? 66 : 65;
                vVar.A = z19 ? 1 : 0;
                com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.q6 q6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.q6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.q6.class);
                if (q6Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EmojiPanelClickListener", "emoticon page service not found");
                    return;
                }
                if (a17 != null) {
                    context2 = a17;
                }
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h4) q6Var).wi(context2, vVar);
                return;
            }
            return;
        }
        if (i19 == 3) {
            int i28 = ((ir.z) u0Var).f375454b;
            if (i28 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11594, 1);
                android.content.Intent intent = new android.content.Intent();
                if (context2 instanceof com.p314xaae8f345.mm.ui.xb) {
                    context2 = ((com.p314xaae8f345.mm.ui.xb) context2).getBaseContext();
                }
                intent.putExtra("key_from_scene", 1);
                j45.l.j(context2, "emoji", ".ui.EmojiCustomUI", intent, null);
                return;
            }
            if (i28 == 1 && ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().p()) {
                int i29 = this.f402105h;
                int i37 = com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291.f271298e;
                if (i29 == 1) {
                    r10 = 3;
                } else if (i29 == 2) {
                    r10 = 4;
                } else if (i29 == 3) {
                    r10 = 5;
                }
                o22.i.b(context2, r10, this.f402103f);
                return;
            }
            return;
        }
        if (i19 != 6) {
            if (i19 != 7) {
                if (i19 == 10 && (aVar = this.f402104g) != null) {
                    aVar.mo152xb9724478();
                    return;
                }
                return;
            }
            if (((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().p()) {
                int i38 = this.f402105h;
                int i39 = com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291.f271298e;
                if (i38 == 1) {
                    r10 = 3;
                } else if (i38 == 2) {
                    r10 = 4;
                } else if (i38 == 3) {
                    r10 = 5;
                }
                o22.i.b(context2, r10, this.f402103f);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb3 = ((ir.g) u0Var).f375369b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPanelClickListener", "penn send capture emoji click emoji: %s status: %d.", interfaceC4987x84e327cb3.mo42933xb5885648(), java.lang.Integer.valueOf(interfaceC4987x84e327cb3.p0()));
        qk.x6 m17 = interfaceC4987x84e327cb3.m1();
        int i47 = m17 == null ? -1 : lr.h.f402057a[m17.ordinal()];
        if (i47 == 1) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9 v9Var2 = this.f402101d;
            if (v9Var2 != null) {
                v9Var2.b(interfaceC4987x84e327cb3);
            }
            interfaceC4987x84e327cb3.mo42933xb5885648();
            return;
        }
        if (i47 == 2 || i47 == 3) {
            db5.e1.T(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572619bv2));
            return;
        }
        if (i47 == 4) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context2);
            u1Var.g(context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bux));
            u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.c0h);
            u1Var.k(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31));
            u1Var.b(new lr.i(interfaceC4987x84e327cb3));
            u1Var.q(false);
            return;
        }
        if (i47 != 5) {
            return;
        }
        qk.y6 y17 = interfaceC4987x84e327cb3.y1();
        y17.ordinal();
        switch (y17.ordinal()) {
            case 1:
            case 2:
            case 3:
            case 4:
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context2);
                u1Var2.g(context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572618bv1));
                u1Var2.m(com.p314xaae8f345.mm.R.C30867xcad56011.buz);
                u1Var2.b(new lr.j(this, context2, interfaceC4987x84e327cb3));
                u1Var2.q(false);
                return;
            case 5:
                gr.v vVar2 = gr.v.f356229a;
                vVar2.a(false);
                if (vVar2.b().getBoolean("capture_full", false)) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var3 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context2);
                    u1Var3.g(context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c0g));
                    u1Var3.n(context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.byz));
                    u1Var3.b(new lr.k(context2));
                    u1Var3.q(false);
                    return;
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var4 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context2);
                u1Var4.g(context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572618bv1));
                u1Var4.m(com.p314xaae8f345.mm.R.C30867xcad56011.buz);
                u1Var4.b(new lr.l(this, context2, interfaceC4987x84e327cb3));
                u1Var4.q(false);
                return;
            case 6:
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var5 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context2);
                u1Var5.g(context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572618bv1));
                u1Var5.m(com.p314xaae8f345.mm.R.C30867xcad56011.buz);
                u1Var5.b(new lr.m(this, context2, interfaceC4987x84e327cb3));
                u1Var5.q(false);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
                if (qk.y6.ERR_LOCAL_FILE == interfaceC4987x84e327cb3.y1()) {
                    string = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bux);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                } else if (qk.y6.ERR_OVER_SIZE == interfaceC4987x84e327cb3.y1()) {
                    string = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bvl);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                } else if (qk.y6.ERR_SPAM == interfaceC4987x84e327cb3.y1()) {
                    string = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572617bv0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                } else {
                    string = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.buy);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var6 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context2);
                u1Var6.g(string);
                u1Var6.m(com.p314xaae8f345.mm.R.C30867xcad56011.c0h);
                u1Var6.k(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31));
                u1Var6.b(new lr.n(interfaceC4987x84e327cb3));
                u1Var6.q(false);
                return;
            default:
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var7 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context2);
                u1Var7.g(context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572618bv1));
                u1Var7.m(com.p314xaae8f345.mm.R.C30867xcad56011.buz);
                u1Var7.b(new lr.o(this, context2, interfaceC4987x84e327cb3));
                u1Var7.q(false);
                return;
        }
    }

    public /* synthetic */ p(int i17, nr.j jVar, nr.c cVar, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, (i18 & 2) != 0 ? null : jVar, (i18 & 4) != 0 ? null : cVar);
    }
}
