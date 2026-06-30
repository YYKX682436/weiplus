package v24;

/* loaded from: classes15.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v24.w0 f514494a = new v24.w0();

    public final java.util.List a(java.lang.String str) {
        java.util.List<m14.o> e17 = e();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(e17, 10));
        for (m14.o oVar : e17) {
            v24.i iVar = new v24.i();
            v24.w0 w0Var = f514494a;
            java.lang.String j17 = oVar.j().j();
            iVar.k(w0Var.f(j17) ? (!w0Var.g(j17) || tn3.c.f502356a.c()) ? 1 : 3 : 2);
            iVar.j(oVar.j());
            iVar.l(oVar.m146658x3662b71a());
            java.lang.String l17 = oVar.l();
            java.lang.String str2 = "";
            if (l17 == null) {
                l17 = "";
            }
            iVar.n(l17);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(oVar.j().j(), str)) {
                if (w0Var.g(oVar.j().j())) {
                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    android.content.pm.PackageManager packageManager = context.getPackageManager();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(packageManager, "getPackageManager(...)");
                    android.content.Intent intent = new android.content.Intent("android.intent.action.MAIN", (android.net.Uri) null);
                    intent.addCategory("android.intent.category.LAUNCHER");
                    intent.setPackage("com.tencent.wetype");
                    boolean z17 = packageManager.resolveActivity(intent, 0) != null;
                    if (w0Var.h(oVar.k())) {
                        m14.b enableTipsData = oVar.k();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enableTipsData, "enableTipsData");
                        str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.m() ? enableTipsData.l() : com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.n() ? enableTipsData.n() : !com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j() ? enableTipsData.k() : enableTipsData.l();
                    } else if (!z17) {
                        str2 = w0Var.d(oVar.n());
                    }
                } else {
                    str2 = w0Var.d(oVar.n());
                }
            }
            iVar.o(str2);
            arrayList.add(iVar);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e A[Catch: Exception -> 0x00bc, TryCatch #0 {Exception -> 0x00bc, blocks: (B:3:0x0003, B:5:0x0009, B:7:0x001e, B:9:0x0024, B:13:0x0035, B:15:0x004e, B:17:0x0052, B:18:0x0059, B:21:0x0062, B:23:0x0089, B:26:0x008f, B:31:0x0056, B:32:0x002d), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089 A[Catch: Exception -> 0x00bc, TryCatch #0 {Exception -> 0x00bc, blocks: (B:3:0x0003, B:5:0x0009, B:7:0x001e, B:9:0x0024, B:13:0x0035, B:15:0x004e, B:17:0x0052, B:18:0x0059, B:21:0x0062, B:23:0x0089, B:26:0x008f, B:31:0x0056, B:32:0x002d), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b() {
        /*
            r8 = this;
            java.lang.String r0 = ""
            r1 = 0
            m14.o r2 = r8.c()     // Catch: java.lang.Exception -> Lbc
            if (r2 == 0) goto Lbb
            v24.t0 r3 = new v24.t0     // Catch: java.lang.Exception -> Lbc
            r3.<init>()     // Catch: java.lang.Exception -> Lbc
            m14.a r2 = r2.j()     // Catch: java.lang.Exception -> Lbc
            java.lang.String r2 = r2.j()     // Catch: java.lang.Exception -> Lbc
            v24.w0 r4 = v24.w0.f514494a     // Catch: java.lang.Exception -> Lbc
            boolean r5 = r4.g(r2)     // Catch: java.lang.Exception -> Lbc
            if (r5 == 0) goto L2d
            boolean r5 = r4.f(r2)     // Catch: java.lang.Exception -> Lbc
            if (r5 == 0) goto L35
            tn3.b r5 = tn3.c.f502356a     // Catch: java.lang.Exception -> Lbc
            boolean r5 = r5.c()     // Catch: java.lang.Exception -> Lbc
            if (r5 != 0) goto L34
            goto L35
        L2d:
            boolean r5 = r4.f(r2)     // Catch: java.lang.Exception -> Lbc
            if (r5 != 0) goto L34
            goto L35
        L34:
            r2 = r0
        L35:
            r3.r(r2)     // Catch: java.lang.Exception -> Lbc
            com.tencent.mm.plugin.newtips.model.p r2 = rn3.i.Di()     // Catch: java.lang.Exception -> Lbc
            vn3.c r5 = new vn3.c     // Catch: java.lang.Exception -> Lbc
            r6 = 48
            r5.<init>(r6)     // Catch: java.lang.Exception -> Lbc
            android.util.Pair r2 = r2.c(r5)     // Catch: java.lang.Exception -> Lbc
            java.lang.Object r5 = r2.first     // Catch: java.lang.Exception -> Lbc
            com.tencent.mm.plugin.newtips.model.r r6 = com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_REDPOINT     // Catch: java.lang.Exception -> Lbc
            r7 = 1
            if (r5 != r6) goto L56
            java.lang.Object r2 = r2.second     // Catch: java.lang.Exception -> Lbc
            if (r2 == 0) goto L56
            r3.o(r7)     // Catch: java.lang.Exception -> Lbc
            goto L59
        L56:
            r3.o(r1)     // Catch: java.lang.Exception -> Lbc
        L59:
            int r2 = r3.j()     // Catch: java.lang.Exception -> Lbc
            if (r2 != r7) goto L61
            r2 = 7
            goto L62
        L61:
            r2 = r7
        L62:
            r3.q(r2)     // Catch: java.lang.Exception -> Lbc
            java.util.LinkedList r2 = new java.util.LinkedList     // Catch: java.lang.Exception -> Lbc
            java.lang.String r5 = r3.k()     // Catch: java.lang.Exception -> Lbc
            java.util.List r4 = r4.a(r5)     // Catch: java.lang.Exception -> Lbc
            r2.<init>(r4)     // Catch: java.lang.Exception -> Lbc
            r3.l(r2)     // Catch: java.lang.Exception -> Lbc
            gm0.b0 r2 = gm0.j1.u()     // Catch: java.lang.Exception -> Lbc
            com.tencent.mm.storage.n3 r2 = r2.c()     // Catch: java.lang.Exception -> Lbc
            r4 = 274436(0x43004, float:3.84567E-40)
            r5 = 0
            java.lang.Object r2 = r2.l(r4, r5)     // Catch: java.lang.Exception -> Lbc
            boolean r4 = r2 instanceof java.lang.String     // Catch: java.lang.Exception -> Lbc
            if (r4 == 0) goto L8c
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> Lbc
        L8c:
            if (r5 != 0) goto L8f
            r5 = r0
        L8f:
            r3.p(r5)     // Catch: java.lang.Exception -> Lbc
            java.lang.Class<e42.e0> r2 = e42.e0.class
            i95.m r2 = i95.n0.c(r2)     // Catch: java.lang.Exception -> Lbc
            e42.e0 r2 = (e42.e0) r2     // Catch: java.lang.Exception -> Lbc
            e42.c0 r4 = e42.c0.clicfg_setting_tips_config_and     // Catch: java.lang.Exception -> Lbc
            h62.d r2 = (h62.d) r2     // Catch: java.lang.Exception -> Lbc
            java.lang.String r5 = "{}"
            java.lang.String r2 = r2.Zi(r4, r5, r7)     // Catch: java.lang.Exception -> Lbc
            java.lang.String r4 = "getExpt(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r4)     // Catch: java.lang.Exception -> Lbc
            r3.n(r2)     // Catch: java.lang.Exception -> Lbc
            org.json.JSONObject r2 = r3.mo126745xcc31ba03()     // Catch: java.lang.Exception -> Lbc
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> Lbc
            java.lang.String r3 = "toString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)     // Catch: java.lang.Exception -> Lbc
            return r2
        Lbb:
            return r0
        Lbc:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "TipsUtils"
            java.lang.String r4 = "getJsonForLiteApp "
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r3, r2, r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v24.w0.b():java.lang.String");
    }

    public final m14.o c() {
        v24.w0 w0Var;
        java.util.List e17 = e();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = (java.util.ArrayList) e17;
        java.util.Iterator it = arrayList2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            w0Var = f514494a;
            boolean z17 = true;
            if (!hasNext) {
                break;
            }
            java.lang.Object next = it.next();
            m14.o oVar = (m14.o) next;
            if (w0Var.g(oVar.j().j())) {
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                android.content.pm.PackageManager packageManager = context.getPackageManager();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(packageManager, "getPackageManager(...)");
                android.content.Intent intent = new android.content.Intent("android.intent.action.MAIN", (android.net.Uri) null);
                intent.addCategory("android.intent.category.LAUNCHER");
                intent.setPackage("com.tencent.wetype");
                if (!(packageManager.resolveActivity(intent, 0) != null) ? !r26.n0.N(w0Var.d(oVar.n())) : w0Var.h(oVar.k())) {
                    z17 = false;
                }
            } else {
                z17 = oVar.o();
            }
            if (z17) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            java.lang.Object next2 = it6.next();
            m14.o oVar2 = (m14.o) next2;
            if (w0Var.g(oVar2.j().j()) && w0Var.h(oVar2.k())) {
                arrayList3.add(next2);
            }
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            java.lang.Object next3 = it7.next();
            if (!((m14.o) next3).o()) {
                arrayList4.add(next3);
            }
        }
        java.util.List F0 = kz5.n0.F0(arrayList, new v24.u0());
        java.util.List F02 = kz5.n0.F0(arrayList4, new v24.v0());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TipsUtils", "sortData: sortedInstalledItem:" + F0.size() + " unEnableList:" + arrayList3.size() + " sortedInstalledItem:" + F0.size());
        return (m14.o) kz5.n0.Z(kz5.n0.t0(kz5.n0.t0(F02, arrayList3), F0));
    }

    public final java.lang.String d(m14.m textData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textData, "textData");
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.m() ? textData.k() : com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.n() ? textData.l() : !com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j() ? textData.j() : textData.k();
    }

    public final java.util.List e() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_setting_tips_config_and, "{}", true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Zi, "getExpt(...)");
            org.json.JSONObject jSONObject = new org.json.JSONObject(Zi);
            m14.n nVar = new m14.n();
            nVar.m75931xb5cb93b2(jSONObject);
            for (m14.o oVar : nVar.j()) {
                v24.w0 w0Var = f514494a;
                java.lang.String j17 = oVar.j().j();
                oVar.p(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17) ? false : w0Var.f(j17));
            }
            arrayList.addAll(nVar.j());
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TipsUtils", "getTipsTimeList" + jz5.f0.f384359a);
        }
        return arrayList;
    }

    public final boolean f(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        android.content.pm.PackageManager packageManager = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(packageManager, "getPackageManager(...)");
        android.content.Intent intent = new android.content.Intent("android.intent.action.MAIN", (android.net.Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(str);
        return packageManager.resolveActivity(intent, 0) != null;
    }

    public final boolean g(java.lang.String str) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "com.tencent.wetype");
    }

    public final boolean h(m14.b enableTipsData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enableTipsData, "enableTipsData");
        tn3.b bVar = tn3.c.f502356a;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (!bVar.b(context) || bVar.c()) {
            return false;
        }
        byte[] bytes = (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.m() ? enableTipsData.l() : com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.n() ? enableTipsData.n() : !com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j() ? enableTipsData.k() : enableTipsData.l()).getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        v24.s0 s0Var = v24.s0.f514482a;
        java.lang.Object mo141623x754a37bb = ((jz5.n) v24.s0.f514483b).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        sb6.append((java.lang.String) mo141623x754a37bb);
        sb6.append('_');
        sb6.append(g17);
        java.lang.String sb7 = sb6.toString();
        int j17 = enableTipsData.j();
        long p17 = s0Var.b().p(sb7);
        return !((p17 > 0L ? 1 : (p17 == 0L ? 0 : -1)) == 0 ? false : s0Var.d(p17, j17));
    }
}
