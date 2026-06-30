package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf;

/* loaded from: classes8.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public java.util.Map f264991a;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 f264993c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e f264994d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.v f264995e;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f264992b = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 f264996f = new com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3(2);

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e f264997g = com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273709f;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.v vVar) {
        this.f264995e = vVar == null ? new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.t(this) : vVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewPermission", "edw <init> hardcodeJsPerm = " + this.f264993c + ", hardcodeGenCtrl = " + this.f264994d);
        this.f264991a = new java.util.HashMap();
    }

    public final java.lang.String a(java.lang.String str) {
        int indexOf = str.indexOf("#");
        return indexOf < 0 ? str : str.substring(0, indexOf);
    }

    public com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.u uVar;
        if (this.f264994d != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewPermission", "getGenCtrl, return hardcodeGenCtrl = " + this.f264994d);
            return this.f264994d;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.v vVar = this.f264995e;
        if (vVar != null) {
            uVar = d(vVar.a());
            if (uVar == null) {
                uVar = d(vVar.b());
            }
        } else {
            uVar = null;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e c19774x1007d35e = uVar != null ? uVar.f264990b : null;
        return c19774x1007d35e == null ? this.f264997g : c19774x1007d35e;
    }

    public com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.u uVar;
        if (this.f264993c != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewPermission", "getJsPerm, return hardcodeJsPerm = " + this.f264993c);
            return this.f264993c;
        }
        boolean z17 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.v vVar = this.f264995e;
        if (vVar != null) {
            uVar = d(vVar.a());
            str = vVar.b();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                if (uVar == null) {
                    uVar = d(str);
                }
                java.lang.Object[] objArr = new java.lang.Object[1];
                if (str == null) {
                    str = "";
                }
                objArr[0] = java.net.URLEncoder.encode(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h9.a(str));
                str = java.lang.String.format("preverify://url=%s", objArr);
            }
        } else {
            str = null;
            uVar = null;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b3 = uVar != null ? uVar.f264989a : null;
        if (str != null) {
            java.util.HashMap hashMap = (java.util.HashMap) this.f264992b;
            if (hashMap.containsKey(str)) {
                if (c19775x58fd37b3 == null) {
                    c19775x58fd37b3 = new com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3(new byte[0]);
                    z17 = false;
                } else {
                    c19775x58fd37b3 = c19775x58fd37b3.m75975x5a5dd5d();
                }
                java.util.HashMap hashMap2 = (java.util.HashMap) hashMap.get(str);
                for (java.lang.String str2 : hashMap2.keySet()) {
                    ((yg0.s4) ((zg0.q3) i95.n0.c(zg0.q3.class))).getClass();
                    o45.m a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.x3.f263545a.a(str2);
                    int i17 = a17 != null ? a17.f424511c : -1;
                    if (i17 > -1) {
                        int d17 = z17 ? c19775x58fd37b3.d(i17) : 2;
                        int i18 = ((r45.lx6) hashMap2.get(str2)).f461491e;
                        if (d17 == 0) {
                            c19775x58fd37b3.h(i17, (byte) 0);
                        } else if (d17 == 2) {
                            c19775x58fd37b3.h(i17, (byte) i18);
                        } else {
                            c19775x58fd37b3.h(i17, (byte) d17);
                        }
                    }
                }
            }
        }
        return c19775x58fd37b3 == null ? this.f264996f : c19775x58fd37b3;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.u d(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || this.f264991a == null) {
            return null;
        }
        java.lang.String a17 = a(str);
        if (this.f264991a.containsKey(a17)) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.u) this.f264991a.get(a17);
        }
        return null;
    }

    public boolean e(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewPermission", "has fail, url is null");
            return false;
        }
        java.lang.String a17 = a(str);
        java.util.Map map = this.f264991a;
        if (map == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewPermission", "has fail, permMap is null");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.u uVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.u) ((java.util.HashMap) map).get(a17);
        return (uVar == null || uVar.f264989a == this.f264996f || uVar.f264990b == this.f264997g) ? false : true;
    }

    public boolean f(java.lang.String str) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b3;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewPermission", "hasJsPerm fail, url = " + str);
            return false;
        }
        java.lang.String a17 = a(str);
        java.util.Map map = this.f264991a;
        if (map == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewPermission", "hasJsPerm fail, permMap is null");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.u uVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.u) ((java.util.HashMap) map).get(a17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("edw hasJsPerm, jsPerm = ");
        sb6.append(uVar == null ? null : uVar.f264989a);
        sb6.append(", url = ");
        sb6.append(a17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewPermission", sb6.toString());
        return (uVar == null || (c19775x58fd37b3 = uVar.f264989a) == null || c19775x58fd37b3.m75976xb2c87fbf(this.f264996f)) ? false : true;
    }

    public void g(java.lang.String str, com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b3, com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e c19774x1007d35e) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewPermission", "update fail, url is null");
            return;
        }
        boolean z17 = false;
        if (c19774x1007d35e != null && (c19774x1007d35e.f273710d & 524288) != 0) {
            z17 = true;
        }
        if (z17) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.i.f264819a == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.i.f264819a = new java.util.ArrayList();
            }
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.i.f264819a.contains(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.i.f264819a.add(str);
            }
        }
        java.lang.String a17 = a(str);
        if (c19775x58fd37b3 == null) {
            c19775x58fd37b3 = this.f264996f;
        }
        if (c19774x1007d35e == null) {
            c19774x1007d35e = this.f264997g;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewPermission", "edw update, jsPerm = " + c19775x58fd37b3 + ", genCtrl = " + c19774x1007d35e + ", url = " + a17);
        ((java.util.HashMap) this.f264991a).put(a17, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.u(c19775x58fd37b3, c19774x1007d35e));
    }

    public void h(com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b3, com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e c19774x1007d35e) {
        int P;
        this.f264993c = c19775x58fd37b3;
        java.lang.String str = x51.o1.f533593m;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewPermission", "setHardcodeJsPermission, Test.jsapiPermission is null");
        } else {
            try {
                P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(x51.o1.f533593m, 0);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewPermission", "setHardcodeJsPermission, parse jsapi fail, ex = " + e17.getMessage());
                this.f264993c = null;
            }
            if (P < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewPermission", "setHardcodeJsPermission, Test.jsapiPermission wrong");
            } else {
                this.f264993c = new com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3(P);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewPermission", "setHardcodeJsPermission, hardcodeJsPerm = " + this.f264993c);
            }
        }
        this.f264994d = c19774x1007d35e;
        java.lang.String str2 = x51.o1.f533594n;
        if (str2 == null || str2.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewPermission", "setHardcodeGeneralCtrl, Test.generalCtrl is null");
            return;
        }
        try {
            int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(x51.o1.f533594n, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewPermission", "setHardcodeGeneralCtrl, permission = %d", java.lang.Integer.valueOf(P2));
            r45.y73 y73Var = new r45.y73();
            y73Var.f472371d = P2;
            this.f264994d = new com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e(y73Var);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewPermission", "setHardcodeGeneralCtrl fail, ex = %s", e18.getMessage());
            this.f264994d = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewPermission", "setHardcodeGeneralCtrl, hardcodeGenCtrl = " + this.f264994d);
    }

    public void i(android.os.Bundle bundle) {
        java.lang.String string = bundle.getString("jsapi_preverify_commit_url");
        java.lang.String string2 = bundle.getString("jsapi_preverify_current_url");
        j(bundle, string);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(string, string2)) {
            return;
        }
        j(bundle, string2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(android.os.Bundle r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.String r0 = "MicroMsg.WebViewPermission"
            java.lang.String r1 = "jsapi_preverify_fun_list"
            java.util.ArrayList r1 = r11.getStringArrayList(r1)
            java.lang.String r12 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h9.a(r12)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            boolean r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            if (r12 != 0) goto L15
            java.lang.String r12 = ""
        L15:
            java.lang.String r12 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h9.a(r12)
            java.lang.String r12 = java.net.URLEncoder.encode(r12)
            r4 = 0
            r3[r4] = r12
            java.lang.String r12 = "preverify://url=%s"
            java.lang.String r12 = java.lang.String.format(r12, r3)
            java.util.Map r3 = r10.f264992b
            java.util.HashMap r3 = (java.util.HashMap) r3
            boolean r5 = r3.containsKey(r12)
            if (r5 != 0) goto L38
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r3.put(r12, r5)
        L38:
            java.lang.Object r12 = r3.get(r12)
            java.util.HashMap r12 = (java.util.HashMap) r12
            java.util.Iterator r1 = r1.iterator()
        L42:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto La8
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            r45.lx6 r5 = new r45.lx6     // Catch: java.lang.Exception -> L9f
            r5.<init>()     // Catch: java.lang.Exception -> L9f
            byte[] r6 = r11.getByteArray(r3)     // Catch: java.lang.Exception -> L9f
            r5.mo11468x92b714fd(r6)     // Catch: java.lang.Exception -> L9f
            int r6 = r5.f461491e     // Catch: java.lang.Exception -> L9f
            r7 = 2
            if (r6 == 0) goto L64
            if (r6 != r7) goto L62
            goto L64
        L62:
            r8 = r4
            goto L65
        L64:
            r8 = r2
        L65:
            r9 = 3
            if (r8 == 0) goto L81
            java.lang.String r8 = "skip update control bytes by preverify, %s, %d, %d"
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Exception -> L9f
            r9[r4] = r3     // Catch: java.lang.Exception -> L9f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L9f
            r9[r2] = r3     // Catch: java.lang.Exception -> L9f
            int r3 = r5.f461492f     // Catch: java.lang.Exception -> L9f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L9f
            r9[r7] = r3     // Catch: java.lang.Exception -> L9f
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r0, r8, r9)     // Catch: java.lang.Exception -> L9f
            goto L42
        L81:
            r12.put(r3, r5)     // Catch: java.lang.Exception -> L9f
            java.lang.String r6 = "update control bytes by preverify, %s, %d, %d"
            java.lang.Object[] r8 = new java.lang.Object[r9]     // Catch: java.lang.Exception -> L9f
            r8[r4] = r3     // Catch: java.lang.Exception -> L9f
            int r3 = r5.f461491e     // Catch: java.lang.Exception -> L9f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L9f
            r8[r2] = r3     // Catch: java.lang.Exception -> L9f
            int r3 = r5.f461492f     // Catch: java.lang.Exception -> L9f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L9f
            r8[r7] = r3     // Catch: java.lang.Exception -> L9f
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r6, r8)     // Catch: java.lang.Exception -> L9f
            goto L42
        L9f:
            r3 = move-exception
            java.lang.String r5 = "parse preverify info"
            java.lang.Object[] r6 = new java.lang.Object[r4]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r3, r5, r6)
            goto L42
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w.j(android.os.Bundle, java.lang.String):void");
    }
}
