package d85;

@j95.b
/* loaded from: classes15.dex */
public final class d1 extends i95.w implements d85.m0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f308678f = kz5.c1.l(new jz5.l(d85.g0.LOCAION, new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION"}), new jz5.l(d85.g0.CONTRACT, new java.lang.String[]{"android.permission.READ_CONTACTS"}), new jz5.l(d85.g0.STORAGE, new java.lang.String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}), new jz5.l(d85.g0.MICRO_PHONE, new java.lang.String[]{"android.permission.RECORD_AUDIO"}), new jz5.l(d85.g0.HEALTHY, new java.lang.String[]{"android.permission.ACTIVITY_RECOGNITION"}), new jz5.l(d85.g0.CAMERA, new java.lang.String[]{"android.permission.CAMERA"}));

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f308679d = "PluginSensitive";

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f308680e = jz5.h.a(jz5.i.f384362d, d85.x0.f308784d);

    public d85.f0 Ai(java.lang.String str) {
        java.lang.Object obj;
        java.util.Iterator<E> it = d85.s0.f308776a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((d85.f0) obj).f308709d, str)) {
                break;
            }
        }
        return (d85.f0) obj;
    }

    public boolean Bi(android.app.Activity activity, d85.g0 g0Var, d85.f0 f0Var, d85.k0 k0Var) {
        if (g0Var == null || f0Var == null) {
            return false;
        }
        j85.g.f379784a.c(g0Var, f0Var, null);
        return k85.t.f386972a.c(activity, g0Var, f0Var, new d85.v0(k0Var));
    }

    public boolean Di(d85.g0 permission, d85.f0 business, d85.k0 listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permission, "permission");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(business, "business");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        j85.g.f379784a.c(permission, business, null);
        return k85.t.f386972a.d(permission, business, new d85.u0(listener));
    }

    public boolean Ni(d85.g0 permission, d85.k0 k0Var) {
        d85.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permission, "permission");
        java.lang.String c17 = com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274716f.c();
        if (c17 != null) {
            try {
                d85.f0[] m123703xcee59d22 = d85.f0.m123703xcee59d22();
                int length = m123703xcee59d22.length;
                for (int i17 = 0; i17 < length; i17++) {
                    f0Var = m123703xcee59d22[i17];
                    if (r26.i0.p(f0Var.f308709d, c17, true)) {
                        break;
                    }
                }
            } catch (java.lang.IllegalArgumentException unused) {
            }
        }
        f0Var = null;
        boolean d17 = f0Var != null ? k0Var != null ? k85.t.f386972a.d(permission, f0Var, new d85.t0(k0Var)) : k85.t.f386972a.d(permission, f0Var, null) : false;
        j85.g.f379784a.c(permission, f0Var, null);
        return d17;
    }

    public boolean Ri(d85.g0 permission, d85.f0 f0Var) {
        java.lang.Boolean bool;
        d85.f0 f0Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permission, "permission");
        boolean z17 = false;
        if (f0Var == null) {
            java.lang.String c17 = com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274716f.c();
            if (c17 != null) {
                try {
                    d85.f0[] m123703xcee59d22 = d85.f0.m123703xcee59d22();
                    int length = m123703xcee59d22.length;
                    for (int i17 = 0; i17 < length; i17++) {
                        f0Var2 = m123703xcee59d22[i17];
                        if (r26.i0.p(f0Var2.f308709d, c17, true)) {
                            break;
                        }
                    }
                } catch (java.lang.IllegalArgumentException unused) {
                }
                f0Var2 = null;
                f0Var = f0Var2;
            } else {
                f0Var = null;
            }
        }
        j85.g.f379784a.c(permission, f0Var, null);
        java.lang.String value = permission.f308725d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "value");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Zi = Zi(value);
        if (Zi == null) {
            return true;
        }
        java.lang.String str = f0Var != null ? f0Var.f308709d : null;
        if (f0Var != null && (bool = f0Var.f308711f) != null) {
            z17 = bool.booleanValue();
        }
        return Zi.getBoolean(str, !z17);
    }

    public java.lang.String Ui() {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.HashMap hashMap = e85.i.f331848a;
        for (java.util.Map.Entry entry : e85.i.f331848a.entrySet()) {
            d85.g0 g0Var = (d85.g0) entry.getKey();
            java.lang.String[] strArr = (java.lang.String[]) ((java.util.LinkedHashMap) f308678f).get(g0Var);
            if (strArr != null ? j35.u.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length)) : false) {
                java.util.Iterator it = ((e85.h) entry.getValue()).f331847c.entrySet().iterator();
                while (it.hasNext()) {
                    d85.f0 f0Var = (d85.f0) ((java.util.Map.Entry) it.next()).getKey();
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("type", g0Var.f308726e);
                    jSONObject.put("biz", f0Var.f308710e);
                    java.lang.String value = g0Var.f308725d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "value");
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Zi = Zi(value);
                    int i17 = 1;
                    if (!(Zi != null && Zi.getBoolean(f0Var.f308709d, true))) {
                        i17 = 2;
                    }
                    jSONObject.put("status", i17);
                    jSONArray.put(jSONObject);
                }
            }
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray2, "toString(...)");
        return r26.i0.u(jSONArray2, ',', ';', false, 4, null);
    }

    public android.util.Pair Vi(java.lang.String permission, java.lang.String business) {
        d85.f0 f0Var;
        e85.g gVar;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permission, "permission");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(business, "business");
        try {
        } catch (java.lang.IllegalArgumentException unused) {
        }
        try {
            for (d85.g0 g0Var : d85.g0.m123709xcee59d22()) {
                if (!r26.i0.p(g0Var.f308725d, permission, true)) {
                }
                break;
            }
            break;
            d85.f0[] m123703xcee59d22 = d85.f0.m123703xcee59d22();
            int length = m123703xcee59d22.length;
            for (int i18 = 0; i18 < length; i18++) {
                f0Var = m123703xcee59d22[i18];
                if (r26.i0.p(f0Var.f308709d, business, true)) {
                    break;
                }
            }
        } catch (java.lang.IllegalArgumentException unused2) {
        }
        g0Var = null;
        f0Var = null;
        if (g0Var == null || f0Var == null) {
            return null;
        }
        java.util.HashMap hashMap = e85.i.f331848a;
        e85.h hVar = (e85.h) e85.i.f331848a.get(g0Var);
        if (hVar == null || (gVar = (e85.g) hVar.f331847c.get(f0Var)) == null) {
            return null;
        }
        d85.f0 f0Var2 = d85.f0.f308699q;
        int i19 = gVar.f331842b;
        return (f0Var == f0Var2 && g0Var == d85.g0.MICRO_PHONE && ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Vi()) ? new android.util.Pair(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.m4z), java.lang.Integer.valueOf(i19)) : new android.util.Pair(java.lang.Integer.valueOf(gVar.f331841a), java.lang.Integer.valueOf(i19));
    }

    public com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Zi(java.lang.String permission) {
        d85.g0 g0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permission, "permission");
        try {
            d85.g0[] m123709xcee59d22 = d85.g0.m123709xcee59d22();
            int length = m123709xcee59d22.length;
            for (int i17 = 0; i17 < length; i17++) {
                g0Var = m123709xcee59d22[i17];
                if (r26.i0.p(g0Var.f308725d, permission, true)) {
                    break;
                }
            }
        } catch (java.lang.IllegalArgumentException unused) {
        }
        g0Var = null;
        if (g0Var == null) {
            return null;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(gm0.m.i() + '_' + permission);
    }

    public java.lang.Integer aj(java.lang.String permission) {
        d85.g0 g0Var;
        java.lang.Integer num;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permission, "permission");
        try {
            d85.g0[] m123709xcee59d22 = d85.g0.m123709xcee59d22();
            int length = m123709xcee59d22.length;
            for (int i17 = 0; i17 < length; i17++) {
                g0Var = m123709xcee59d22[i17];
                if (r26.i0.p(g0Var.f308725d, permission, true)) {
                    break;
                }
            }
        } catch (java.lang.IllegalArgumentException unused) {
        }
        g0Var = null;
        int i18 = -1;
        if (g0Var != null) {
            java.util.HashMap hashMap = e85.i.f331848a;
            e85.h hVar = (e85.h) e85.i.f331848a.get(g0Var);
            if (hVar != null && (num = hVar.f331845a) != null) {
                i18 = num.intValue();
            }
        }
        return java.lang.Integer.valueOf(i18);
    }

    public java.lang.String bj(java.lang.String permission, java.lang.String str) {
        d85.g0 g0Var;
        d85.f0 f0Var;
        java.lang.String str2;
        java.lang.String string;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permission, "permission");
        try {
            d85.g0[] m123709xcee59d22 = d85.g0.m123709xcee59d22();
            int length = m123709xcee59d22.length;
            for (int i17 = 0; i17 < length; i17++) {
                g0Var = m123709xcee59d22[i17];
                if (r26.i0.p(g0Var.f308725d, permission, true)) {
                    break;
                }
            }
        } catch (java.lang.IllegalArgumentException unused) {
        }
        g0Var = null;
        java.lang.String str3 = "";
        if (str == null && (str = com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274716f.c()) == null) {
            str = "";
        }
        try {
            d85.f0[] m123703xcee59d22 = d85.f0.m123703xcee59d22();
            int length2 = m123703xcee59d22.length;
            for (int i18 = 0; i18 < length2; i18++) {
                f0Var = m123703xcee59d22[i18];
                if (r26.i0.p(f0Var.f308709d, str, true)) {
                    break;
                }
            }
        } catch (java.lang.IllegalArgumentException unused2) {
        }
        f0Var = null;
        if (g0Var != null && f0Var != null) {
            java.util.HashMap hashMap = e85.i.f331848a;
            e85.h hVar = (e85.h) e85.i.f331848a.get(g0Var);
            if (hVar != null) {
                e85.g gVar = (e85.g) hVar.f331847c.get(f0Var);
                android.util.Pair pair = gVar != null ? new android.util.Pair(java.lang.Integer.valueOf(gVar.f331841a), java.lang.Integer.valueOf(gVar.f331842b)) : null;
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                java.lang.Integer num = pair != null ? (java.lang.Integer) pair.first : null;
                if (!(num == null || num.intValue() != -1)) {
                    num = null;
                }
                if (num == null || (str2 = context.getString(num.intValue())) == null) {
                    str2 = "";
                }
                java.lang.Integer num2 = pair != null ? (java.lang.Integer) pair.second : null;
                java.lang.Integer num3 = num2 == null || num2.intValue() != -1 ? num2 : null;
                if (num3 != null && (string = context.getString(num3.intValue())) != null) {
                    str3 = string;
                }
                str3 = str2.concat(str3);
            }
        }
        if ((!(str3.length() == 0) && f0Var != null) || g0Var == null) {
            return str3;
        }
        java.lang.String value = g0Var.f308725d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "value");
        java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(aj(value).intValue());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        return string2;
    }

    public java.lang.Integer cj(java.lang.String permission) {
        d85.g0 g0Var;
        java.lang.Integer num;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permission, "permission");
        try {
            d85.g0[] m123709xcee59d22 = d85.g0.m123709xcee59d22();
            int length = m123709xcee59d22.length;
            for (int i17 = 0; i17 < length; i17++) {
                g0Var = m123709xcee59d22[i17];
                if (r26.i0.p(g0Var.f308725d, permission, true)) {
                    break;
                }
            }
        } catch (java.lang.IllegalArgumentException unused) {
        }
        g0Var = null;
        int i18 = -1;
        if (g0Var != null) {
            java.util.HashMap hashMap = e85.i.f331848a;
            e85.h hVar = (e85.h) e85.i.f331848a.get(g0Var);
            if (hVar != null && (num = hVar.f331846b) != null) {
                i18 = num.intValue();
            }
        }
        return java.lang.Integer.valueOf(i18);
    }

    public java.lang.String fj(java.lang.String permission) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permission, "permission");
        java.util.HashMap hashMap = e85.i.f331848a;
        java.lang.String str = (java.lang.String) e85.i.f331850c.get(permission);
        if (!(true ^ (str == null || str.length() == 0))) {
            str = null;
        }
        if (str != null) {
            return str;
        }
        return null;
    }

    public boolean hj(d85.g0 permission) {
        android.app.Activity activity;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permission, "permission");
        k85.t tVar = k85.t.f386972a;
        java.lang.ref.WeakReference i17 = com.p314xaae8f345.mm.app.w.INSTANCE.i();
        if (i17 != null && (activity = (android.app.Activity) i17.get()) != null) {
            jz5.l lVar = (jz5.l) k85.t.f386973b.get(activity + '_' + permission.f308725d);
            if (lVar != null) {
                return ((java.lang.Boolean) lVar.f384366d).booleanValue();
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008a, code lost:
    
        if (r9.getBoolean(r6.f308709d, !r6.f308711f.booleanValue()) == true) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d85.h0 ij(android.content.Context r9, java.lang.String r10, int r11) {
        /*
            r8 = this;
            java.lang.String r0 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r0)
            java.lang.String r0 = "permission"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            java.util.HashMap r0 = e85.i.f331849b
            java.lang.Object r0 = r0.get(r10)
            d85.g0 r0 = (d85.g0) r0
            r1 = 0
            r2 = 0
            d85.f0[] r3 = d85.f0.m123703xcee59d22()     // Catch: java.lang.IllegalArgumentException -> L26
            int r4 = r3.length     // Catch: java.lang.IllegalArgumentException -> L26
            r5 = r1
        L1a:
            if (r5 >= r4) goto L26
            r6 = r3[r5]     // Catch: java.lang.IllegalArgumentException -> L26
            int r7 = r6.f308710e     // Catch: java.lang.IllegalArgumentException -> L26
            if (r7 != r11) goto L23
            goto L27
        L23:
            int r5 = r5 + 1
            goto L1a
        L26:
            r6 = r2
        L27:
            if (r0 == 0) goto L2e
            j85.g r3 = j85.g.f379784a
            r3.c(r0, r6, r2)
        L2e:
            r3 = 1
            boolean r10 = j35.u.d(r9, r10, r3)
            bm5.o1 r4 = bm5.o1.f104252a
            com.tencent.mm.sensitive.RepairConfigAppBrandPermissionNullBusinessTest r5 = new com.tencent.mm.sensitive.RepairConfigAppBrandPermissionNullBusinessTest
            r5.<init>()
            int r4 = r4.h(r5)
            if (r4 != r3) goto L41
            r6 = r2
        L41:
            if (r10 != 0) goto L46
            d85.h0 r9 = d85.h0.SYSTEM_REFUSE
            return r9
        L46:
            d85.h0 r10 = d85.h0.GRANTED
            if (r6 != 0) goto L6e
            java.lang.String r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a
            boolean r0 = z65.c.a()
            if (r0 == 0) goto L5a
            d85.w0 r0 = new d85.w0
            r0.<init>(r9)
            pm0.v.X(r0)
        L5a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "unknown business: "
            r9.<init>(r0)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            java.lang.String r11 = r8.f308679d
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r11, r9)
            return r10
        L6e:
            if (r0 == 0) goto L90
            java.lang.String r9 = r0.f308725d
            java.lang.String r11 = "value"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r9, r11)
            com.tencent.mm.sdk.platformtools.o4 r9 = r8.Zi(r9)
            if (r9 == 0) goto L8d
            java.lang.Boolean r11 = r6.f308711f
            boolean r11 = r11.booleanValue()
            r11 = r11 ^ r3
            java.lang.String r0 = r6.f308709d
            boolean r9 = r9.getBoolean(r0, r11)
            if (r9 != r3) goto L8d
            goto L8e
        L8d:
            r3 = r1
        L8e:
            jz5.f0 r2 = jz5.f0.f384359a
        L90:
            if (r2 != 0) goto L93
            goto L94
        L93:
            r1 = r3
        L94:
            if (r1 != 0) goto L98
            d85.h0 r10 = d85.h0.BUSINESS_REFUSE
        L98:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: d85.d1.ij(android.content.Context, java.lang.String, int):d85.h0");
    }

    public boolean mj(d85.g0 permission, d85.f0 business) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permission, "permission");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(business, "business");
        return c01.e2.a0() && permission == d85.g0.LOCAION && d85.m0.E0.contains(business.f308709d);
    }

    public boolean nj(java.lang.String permission, java.lang.String business) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permission, "permission");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(business, "business");
        return c01.e2.a0() && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(permission, d85.g0.LOCAION.f308725d) && d85.m0.E0.contains(business);
    }

    public void oj(d85.f0 business) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(business, "business");
        com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274716f.b().a("com.tencent.mm.sensitive.SENSITIVE_PAGE_ENTER", business.name());
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        k85.t tVar = k85.t.f386972a;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = k85.t.f386977f;
        tVar.g();
        abstractC20980x9b9ad01d.mo48813x58998cd();
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_USER_STATUS_INT_SYNC, 0);
        boolean z17 = (r17 & 4) == 4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConfigStorageLogic", "extUserStatus: " + r17 + ", isSensitiveRegion: " + z17);
        if (z17) {
            java.util.List<java.lang.String> wechatBussinessDefaultCloseList = d85.m0.E0;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(wechatBussinessDefaultCloseList, "wechatBussinessDefaultCloseList");
            for (java.lang.String str : wechatBussinessDefaultCloseList) {
                long j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_NAME_SENSITIVE_LOCATION_LAST_RESET_TIME").getLong(str, 0L);
                java.lang.String value = d85.g0.LOCAION.f308725d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "value");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Zi = Zi(value);
                if ((Zi != null ? Zi.getBoolean(str, false) : false) && java.lang.System.currentTimeMillis() - j17 >= 172800000) {
                    sj(value, str, false);
                }
            }
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        k85.t tVar = k85.t.f386972a;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = k85.t.f386977f;
        k85.t.f386976e.putBoolean(k85.t.f386975d, true);
        abstractC20980x9b9ad01d.mo48814x2efc64();
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new d85.y0(this, null), 3, null);
    }

    public void pj(d85.f0 business) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(business, "business");
        com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274716f.b().a("com.tencent.mm.sensitive.SENSITIVE_PAGE_EXIT", business.name());
    }

    public void qj(java.lang.String business) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(business, "business");
        com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274716f.b().b("com.tencent.mm.sensitive.SENSITIVE_PAGE_ENTER", business, "");
    }

    public void rj(java.lang.String business) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(business, "business");
        com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274716f.b().b("com.tencent.mm.sensitive.SENSITIVE_PAGE_EXIT", business, "");
    }

    public void sj(java.lang.String str, java.lang.String str2, boolean z17) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, d85.g0.LOCAION.f308725d) && z17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_NAME_SENSITIVE_LOCATION_LAST_RESET_TIME").putLong(str2, java.lang.System.currentTimeMillis());
        }
        if (str == null) {
            str = "";
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Zi = Zi(str);
        if (Zi != null) {
            if (str2 == null) {
                str2 = "";
            }
            Zi.putBoolean(str2, z17);
        }
    }

    public void tj(d85.g0 p17, long j17, java.lang.String str) {
        d85.f0 f0Var;
        java.util.HashMap hashMap;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p");
        if (j17 == 162) {
            java.util.HashMap hashMap2 = e85.i.f331848a;
            e85.h hVar = (e85.h) e85.i.f331848a.get(p17);
            if (hVar != null && (hashMap = hVar.f331847c) != null) {
                for (java.util.Map.Entry entry : hashMap.entrySet()) {
                    ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).sj(p17.f308725d, ((d85.f0) entry.getKey()).f308709d, !r3.mj(p17, (d85.f0) entry.getKey()));
                }
            }
        }
        if (str == null) {
            str = "";
        }
        int i17 = 0;
        d85.f0 f0Var2 = null;
        try {
            d85.f0[] m123703xcee59d22 = d85.f0.m123703xcee59d22();
            int length = m123703xcee59d22.length;
            for (int i18 = 0; i18 < length; i18++) {
                f0Var = m123703xcee59d22[i18];
                if (r26.i0.p(f0Var.f308709d, str, true)) {
                    break;
                }
            }
        } catch (java.lang.IllegalArgumentException unused) {
        }
        f0Var = null;
        if (f0Var == null) {
            java.lang.String c17 = com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274716f.c();
            if (c17 != null) {
                try {
                    d85.f0[] m123703xcee59d222 = d85.f0.m123703xcee59d22();
                    int length2 = m123703xcee59d222.length;
                    while (true) {
                        if (i17 >= length2) {
                            break;
                        }
                        d85.f0 f0Var3 = m123703xcee59d222[i17];
                        if (r26.i0.p(f0Var3.f308709d, c17, true)) {
                            f0Var2 = f0Var3;
                            break;
                        }
                        i17++;
                    }
                } catch (java.lang.IllegalArgumentException unused2) {
                }
            }
        } else {
            f0Var2 = f0Var;
        }
        j85.h.f379791a.a(j17, java.lang.Long.valueOf(p17.f308726e), java.lang.Long.valueOf(f0Var2 != null ? f0Var2.f308710e : -1L), java.lang.Boolean.TRUE);
    }

    public void uj(android.app.Activity activity, java.lang.String appid, java.lang.String permission, int i17, d85.l0 callback) {
        d85.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appid, "appid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permission, "permission");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        d85.g0 g0Var = (d85.g0) e85.i.f331849b.get(permission);
        try {
            d85.f0[] m123703xcee59d22 = d85.f0.m123703xcee59d22();
            int length = m123703xcee59d22.length;
            for (int i18 = 0; i18 < length; i18++) {
                f0Var = m123703xcee59d22[i18];
                if (f0Var.f308710e == i17) {
                    break;
                }
            }
        } catch (java.lang.IllegalArgumentException unused) {
        }
        f0Var = null;
        if (g0Var == null) {
            d85.h0 h0Var = d85.h0.ERROR;
            h0Var.f308734d = "unknown permission";
            callback.a(h0Var);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(appid);
        sb6.append('_');
        sb6.append(g0Var != null ? g0Var.f308725d : null);
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("freq_mmkv_key_ver_2");
        if (M != null) {
            M.putLong(sb7, java.lang.System.currentTimeMillis() / 1000);
        }
        d85.f0 f0Var2 = bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2611x1bbd4e96.C21018x82304fbd()) == 1 ? null : f0Var;
        d85.h0 h0Var2 = d85.h0.GRANTED;
        if (g0Var != null && f0Var2 == null) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (z65.c.a()) {
                pm0.v.X(new d85.z0(activity));
            }
            j85.g.f379784a.c(g0Var, null, appid);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f308679d, "unknown business: " + i17);
            if (j35.u.d(activity, permission, true)) {
                callback.a(h0Var2);
                return;
            } else {
                j35.u.j(activity, 0, new d85.a1(callback), new java.lang.String[]{permission}, fj(permission), bj(permission, null));
                return;
            }
        }
        if (g0Var == null || f0Var2 == null) {
            return;
        }
        j85.g.f379784a.c(g0Var, f0Var2, appid);
        int ordinal = ij(activity, permission, i17).ordinal();
        if (ordinal == 0) {
            com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274716f.b().a("com.tencent.mm.sensitive.SENSITIVE_PAGE_ENTER", f0Var2.name());
            java.lang.String value = g0Var.f308725d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "value");
            j35.u.j(activity, 0, new d85.b1(f0Var2, callback, this, activity, appid, permission, i17), new java.lang.String[]{permission}, fj(value), bj(value, f0Var2.f308709d));
            return;
        }
        if (ordinal != 1) {
            callback.a(h0Var2);
        } else {
            if (k85.t.f386972a.c(activity, g0Var, f0Var2, new d85.c1(callback))) {
                return;
            }
            callback.a(h0Var2);
        }
    }

    public d85.f0 wi(int i17) {
        java.lang.Object obj;
        java.util.Iterator<E> it = d85.s0.f308776a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((d85.f0) obj).f308710e == i17) {
                break;
            }
        }
        return (d85.f0) obj;
    }
}
