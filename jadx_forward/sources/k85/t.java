package k85;

/* loaded from: classes15.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final k85.t f386972a = new k85.t();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f386973b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String[] f386974c = {"LauncherUI", "ComposeUI", "AlbumPreviewUI", "MultiStageCitySelectUI", "FinderPostUI"};

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f386975d = "MMKV_KEY_EXPT_PERMISSION_DIALOG";

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f386976e = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_KEY_EXPT_VALUE");

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f386977f;

    static {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        f386977f = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5386xed4ad233>(a0Var) { // from class: com.tencent.mm.sensitive.ui.PermissionSwitchCheckUtil$listener$1
            {
                this.f39173x3fe91575 = -31521245;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5386xed4ad233 c5386xed4ad233) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5386xed4ad233 event = c5386xed4ad233;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                k85.t.f386972a.g();
                return false;
            }
        };
    }

    public static final void a(k85.t tVar, android.app.Activity activity, d85.g0 g0Var, d85.f0 f0Var, yz5.a aVar) {
        tVar.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(activity);
        y1Var.i(false);
        android.view.View inflate = android.view.View.inflate(activity, com.p314xaae8f345.mm.R.C30864xbddafb2a.c9f, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) inflate;
        android.view.View findViewById = c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.f564846aa1);
        android.widget.TextView textView = (android.widget.TextView) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
        com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.obc)).getPaint(), 0.8f);
        if (f0Var != null) {
            d85.f0 f0Var2 = d85.f0.Q;
            d85.g0 g0Var2 = d85.g0.IMAGE_LOCATION_DATA;
            if (f0Var == f0Var2 && (g0Var == g0Var2 || g0Var == d85.g0.IMAGE_CONTENT_DATA)) {
                textView.setText(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lnz));
            } else if (f0Var == d85.f0.f308696n && g0Var == g0Var2) {
                textView.setText(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n1b));
            } else {
                java.lang.Object obj = e85.i.f331850c.get(g0Var.f308725d);
                java.lang.Object obj2 = e85.i.f331851d.get(f0Var.f308709d);
                if (obj != null && obj2 != null) {
                    textView.setText(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ivv, (java.lang.String) obj, (java.lang.String) obj2));
                }
            }
        } else {
            java.lang.String str = (java.lang.String) e85.i.f331850c.get(g0Var.f308725d);
            if (str != null) {
                textView.setText(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ivw, str));
            }
        }
        findViewById.setOnClickListener(new k85.m(y1Var));
        y1Var.f293570s = new k85.n(aVar);
        y1Var.k(c22646x1e9ca55);
        y1Var.d(true);
        y1Var.s();
    }

    public static boolean b(k85.t tVar, java.lang.String methodName, yz5.l lVar, int i17, java.lang.Object obj) {
        java.lang.String str;
        java.lang.String c17;
        d85.f0 f0Var;
        int i18;
        if ((i17 & 2) != 0) {
            lVar = null;
        }
        tVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(methodName, "methodName");
        boolean z17 = false;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.j() && (str = (java.lang.String) d85.o0.f308762a.get(methodName)) != null && (c17 = com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274716f.c()) != null) {
            try {
            } catch (java.lang.IllegalArgumentException unused) {
            }
            try {
                for (d85.g0 g0Var : d85.g0.m123709xcee59d22()) {
                    if (!r26.i0.p(g0Var.f308725d, str, true)) {
                    }
                    break;
                }
                break;
                d85.f0[] m123703xcee59d22 = d85.f0.m123703xcee59d22();
                int length = m123703xcee59d22.length;
                for (int i19 = 0; i19 < length; i19++) {
                    f0Var = m123703xcee59d22[i19];
                    if (r26.i0.p(f0Var.f308709d, c17, true)) {
                        break;
                    }
                }
            } catch (java.lang.IllegalArgumentException unused2) {
            }
            g0Var = null;
            f0Var = null;
            if (g0Var != null && f0Var != null) {
                k85.t tVar2 = f386972a;
                java.lang.Boolean e17 = tVar2.e(g0Var);
                if (e17 != null) {
                    java.lang.Boolean bool = true ^ e17.booleanValue() ? e17 : null;
                    if (bool != null) {
                        bool.booleanValue();
                    }
                }
                z17 = tVar2.d(g0Var, f0Var, lVar);
            }
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kenneth-methodCall", "method:" + methodName + " return default value， asking permission:" + str + " in business:" + c17 + ",process:" + bm5.f1.a());
            }
        }
        return z17;
    }

    public final boolean c(android.app.Activity activity, d85.g0 permission, d85.f0 business, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permission, "permission");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(business, "business");
        if (!f(permission, business)) {
            return false;
        }
        java.lang.Boolean e17 = e(permission);
        jz5.f0 f0Var = null;
        if (e17 != null) {
            if (!(!e17.booleanValue())) {
                e17 = null;
            }
            if (e17 != null) {
                e17.booleanValue();
                return false;
            }
        }
        j85.g.f379784a.c(permission, business, null);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Zi = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Zi(permission.f308725d);
        if (Zi != null) {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(Zi.getBoolean(business.f308709d, !business.f308711f.booleanValue()));
            if (!(!valueOf.booleanValue())) {
                valueOf = null;
            }
            if (valueOf != null) {
                valueOf.booleanValue();
                k85.t tVar = f386972a;
                if (activity != null) {
                    tVar.i(activity, permission, business, lVar);
                    f0Var = jz5.f0.f384359a;
                }
                if (f0Var == null) {
                    pm0.v.V(0L, new k85.h(lVar, permission, business));
                }
                return true;
            }
        }
        return false;
    }

    public final boolean d(d85.g0 permission, d85.f0 business, yz5.l lVar) {
        e85.h hVar;
        java.util.HashMap hashMap;
        e85.g gVar;
        java.util.List list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permission, "permission");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(business, "business");
        if (!f(permission, business)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PermissionSwitchCheckUtil", "[checkManually] 2");
            return false;
        }
        java.lang.Boolean e17 = e(permission);
        jz5.f0 f0Var = null;
        if (e17 != null) {
            if (!(!e17.booleanValue())) {
                e17 = null;
            }
            if (e17 != null) {
                e17.booleanValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PermissionSwitchCheckUtil", "[checkManually] 3");
                return false;
            }
        }
        j85.g.f379784a.c(permission, business, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[checkManually] permission:");
        java.lang.String str = permission.f308725d;
        sb6.append(str);
        sb6.append(", business:");
        java.lang.String str2 = business.f308709d;
        sb6.append(str2);
        sb6.append(", value:");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Zi = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Zi(str);
        java.lang.Boolean bool = business.f308711f;
        sb6.append(Zi != null ? java.lang.Boolean.valueOf(Zi.getBoolean(str2, !bool.booleanValue())) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PermissionSwitchCheckUtil", sb6.toString());
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Zi2 = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Zi(str);
        if (Zi2 != null) {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(Zi2.getBoolean(str2, !bool.booleanValue()));
            if (!(!valueOf.booleanValue())) {
                valueOf = null;
            }
            if (valueOf != null) {
                valueOf.booleanValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PermissionSwitchCheckUtil", "[checkManually] 5");
                e85.b bVar = com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274716f;
                e85.c cVar = (e85.c) kz5.n0.k0(com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274719i);
                java.lang.String str3 = cVar != null ? cVar.f331832b : null;
                java.lang.Boolean valueOf2 = (str3 == null || (hVar = (e85.h) e85.i.f331848a.get(permission)) == null || (hashMap = hVar.f331847c) == null || (gVar = (e85.g) hashMap.get(business)) == null || (list = gVar.f331844d) == null) ? null : java.lang.Boolean.valueOf(list.contains(str3));
                if (valueOf2 != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf2, java.lang.Boolean.FALSE)) {
                    return true;
                }
                java.lang.ref.WeakReference i17 = com.p314xaae8f345.mm.app.w.INSTANCE.i();
                android.app.Activity activity = i17 != null ? (android.app.Activity) i17.get() : null;
                k85.t tVar = f386972a;
                if (activity != null) {
                    tVar.i(activity, permission, business, lVar);
                    f0Var = jz5.f0.f384359a;
                }
                if (f0Var == null) {
                    pm0.v.V(0L, new k85.h(lVar, permission, business));
                }
                return true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PermissionSwitchCheckUtil", "[checkManually] 4");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cb, code lost:
    
        if (r7 == 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean e(d85.g0 r10) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k85.t.e(d85.g0):java.lang.Boolean");
    }

    public final boolean f(d85.g0 g0Var, d85.f0 f0Var) {
        java.util.HashMap hashMap;
        e85.g gVar;
        java.util.HashMap hashMap2 = e85.i.f331848a;
        e85.h hVar = (e85.h) e85.i.f331848a.get(g0Var);
        if (hVar == null || (hashMap = hVar.f331847c) == null || (gVar = (e85.g) hashMap.get(f0Var)) == null) {
            return false;
        }
        return gVar.f331843c;
    }

    public final void g() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f386976e;
        java.lang.String str = f386975d;
        o4Var.putBoolean(str, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_use_new_permission_dialog, !o4Var.getBoolean(str, true) ? 1 : 0) == 0);
    }

    public final jz5.l h(android.app.Activity activity, d85.g0 permission, d85.f0 business, yz5.l lVar, yz5.l lVar2, java.lang.String str) {
        java.lang.String string;
        java.lang.String str2;
        java.util.LinkedList linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permission, "permission");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(business, "business");
        java.util.HashMap hashMap = f386973b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(activity);
        sb6.append('_');
        java.lang.String permission2 = permission.f308725d;
        sb6.append(permission2);
        jz5.l lVar3 = (jz5.l) hashMap.get(sb6.toString());
        if (lVar3 != null && ((java.lang.Boolean) lVar3.f384366d).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PermissionSwitchCheckUtil", "[showBusinessPermissionDialogUI] false case showing");
            if (lVar != null) {
                jz5.l lVar4 = (jz5.l) hashMap.get(activity + '_' + permission2);
                if (lVar4 != null && (linkedList = (java.util.LinkedList) lVar4.f384367e) != null) {
                    linkedList.add(lVar);
                }
            }
            return new jz5.l(java.lang.Boolean.FALSE, java.lang.Boolean.TRUE);
        }
        java.lang.String str3 = activity + '_' + permission2;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        if (lVar != null) {
            linkedList2.add(lVar);
        }
        hashMap.put(str3, new jz5.l(bool, linkedList2));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PermissionSwitchCheckUtil", "[showBusinessPermissionDialogUI] show on " + activity + ", permission:" + permission + ", business:" + business);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(activity);
        y1Var.i(false);
        android.view.View inflate = android.view.View.inflate(activity, com.p314xaae8f345.mm.R.C30864xbddafb2a.c9a, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) inflate;
        c22646x1e9ca55.b((float) com.p314xaae8f345.mm.ui.zk.a(activity, 12), (float) com.p314xaae8f345.mm.ui.zk.a(activity, 12), 0.0f, 0.0f);
        d85.m0 m0Var = (d85.m0) i95.n0.c(d85.m0.class);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.ktf);
        android.widget.TextView textView = (android.widget.TextView) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.cui);
        android.widget.TextView textView2 = (android.widget.TextView) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.obc);
        android.view.View findViewById = c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.bys);
        android.view.View findViewById2 = c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.h1x);
        d85.d1 d1Var = (d85.d1) m0Var;
        java.lang.Integer cj6 = d1Var.cj(permission2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cj6, "getPermissionIcon(...)");
        c22699x3dcdb352.setImageResource(cj6.intValue());
        java.lang.String business2 = business.f308709d;
        if (str != null) {
            string = str;
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permission2, "permission");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(business2, "business");
            java.lang.String str4 = (java.lang.String) e85.i.f331850c.get(permission2);
            java.lang.String str5 = (java.lang.String) e85.i.f331851d.get(business2);
            if (d1Var.nj(permission2, business2) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(permission2, d85.g0.LOCAION.f308725d)) {
                if (str5 != null) {
                    string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iuy, str5);
                }
                string = null;
            } else {
                if (str4 != null && str5 != null) {
                    string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iux, str5, str4);
                }
                string = null;
            }
        }
        textView2.setText(string);
        com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        android.util.Pair Vi = d1Var.Vi(permission2, business2);
        if (Vi != null) {
            java.lang.Object obj = Vi.first;
            java.lang.Integer num = (java.lang.Integer) obj;
            java.lang.Integer num2 = (java.lang.Integer) (num == null || num.intValue() != -1 ? obj : null);
            if (num2 == null || (str2 = activity.getString(num2.intValue())) == null) {
                str2 = "";
            }
            textView.setText(str2);
        }
        android.widget.TextView textView3 = (android.widget.TextView) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.b5i);
        android.widget.TextView textView4 = (android.widget.TextView) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.khs);
        com.p314xaae8f345.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
        com.p314xaae8f345.mm.ui.bk.r0(textView4.getPaint(), 0.8f);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        findViewById2.setOnClickListener(new k85.c(lVar2, c0Var, y1Var, activity, permission, business, lVar, str));
        findViewById.setOnClickListener(new k85.d(activity, permission, business, lVar2, y1Var));
        textView3.setOnClickListener(new k85.e(activity, permission, business, lVar2, y1Var));
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        textView4.setOnClickListener(new k85.f(activity, permission, business, lVar2, c0Var2, y1Var));
        y1Var.k(c22646x1e9ca55);
        y1Var.f293570s = new k85.g(c0Var, activity, permission, c0Var2);
        y1Var.d(true);
        y1Var.s();
        return new jz5.l(bool, bool);
    }

    public final void i(android.app.Activity topActivity, d85.g0 permission, d85.f0 business, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topActivity, "topActivity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permission, "permission");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(business, "business");
        pm0.v.X(new k85.l(topActivity, permission, business, lVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x011f, code lost:
    
        if (r2 == null) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(android.app.Activity r20, d85.g0 r21, d85.f0 r22, yz5.l r23) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k85.t.j(android.app.Activity, d85.g0, d85.f0, yz5.l):void");
    }
}
