package si1;

/* loaded from: classes7.dex */
public class g {

    /* renamed from: n, reason: collision with root package name */
    public static volatile boolean f489774n;

    /* renamed from: o, reason: collision with root package name */
    public static si1.m f489775o;

    /* renamed from: p, reason: collision with root package name */
    public static final android.util.SparseIntArray f489776p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.Map f489777q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.Map f489778r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String[] f489779s;

    /* renamed from: a, reason: collision with root package name */
    public final si1.c1 f489780a;

    /* renamed from: b, reason: collision with root package name */
    public final int f489781b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f489782c;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54 f489785f;

    /* renamed from: h, reason: collision with root package name */
    public java.util.HashMap f489787h;

    /* renamed from: j, reason: collision with root package name */
    public java.util.HashMap f489789j;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f489791l;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f489783d = new java.util.LinkedList();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.List f489790k = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final bm5.x0 f489792m = new bm5.x0(new si1.C30194x2f5e1a());

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f489784e = new byte[0];

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f489786g = new byte[0];

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object f489788i = new byte[0];

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        f489776p = sparseIntArray;
        sparseIntArray.put(817, 567);
        sparseIntArray.put(819, 539);
        f489777q = new java.util.concurrent.ConcurrentHashMap();
        f489778r = new java.util.concurrent.ConcurrentHashMap();
        f489779s = new java.lang.String[]{yc1.q.f77528x24728b, "createDownloadTask", ad1.e.f26x24728b, bd1.d.f4199x24728b, bd1.e.f4201x24728b, ad1.f.f28x24728b, bd1.e.f4201x24728b};
    }

    public g(si1.c1 c1Var, int i17, boolean z17) {
        this.f489789j = new java.util.HashMap();
        this.f489780a = c1Var;
        this.f489781b = i17;
        this.f489782c = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54 e17 = c1Var.e();
        if (e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppRuntimeApiPermissionController[permission]", "<init> get NULL permission from runtime");
        }
        m(e17);
        si1.n f17 = c1Var.f();
        java.util.HashMap hashMap = f17 == null ? null : f17.f489809d;
        this.f489787h = hashMap;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(hashMap == null ? 0 : hashMap.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppRuntimeApiPermissionController[permission]", "<init> mPluginPermission size:%d", objArr);
        java.util.HashMap hashMap2 = this.f489787h;
        if (hashMap2 == null || hashMap2.size() <= 0) {
            this.f489791l = false;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 b17 = c1Var.b();
            java.util.Objects.requireNonNull(b17);
            this.f489791l = java.lang.Boolean.parseBoolean(b17.qe("supportInvokeWithAppId"));
        }
        ti1.b a17 = c1Var.a();
        if (a17 != null) {
            java.util.HashMap hashMap3 = a17.f501072d;
            this.f489789j = hashMap3;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            objArr2[0] = java.lang.Integer.valueOf(hashMap3 == null ? 0 : hashMap3.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppRuntimeApiPermissionController[permission]", "mAppidPermission size:%d", objArr2);
        }
    }

    public static java.lang.String e(java.lang.Object obj) {
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.h) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.h) obj).k();
        }
        if (obj instanceof java.lang.Class) {
            java.lang.Class cls = (java.lang.Class) obj;
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.h.class.isAssignableFrom(cls)) {
                java.util.Map map = f489778r;
                java.lang.String str = (java.lang.String) ((java.util.concurrent.ConcurrentHashMap) map).get(cls);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    return str;
                }
                try {
                    java.lang.String str2 = (java.lang.String) new d56.b(cls, cls).f("NAME");
                    ((java.util.concurrent.ConcurrentHashMap) map).put(cls, str2);
                    return str2;
                } catch (d56.c e17) {
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppRuntimeApiPermissionController[permission]", "getApiNameByClass class:%s, reflect failed %s", cls.getName(), e17);
                    return cls.getSimpleName();
                }
            }
        }
        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppRuntimeApiPermissionController[permission]", "Unrecognized api type:".concat(obj.getClass().getName()));
        return obj.toString();
    }

    public static int h(java.lang.Object obj) {
        java.lang.String e17 = e(obj);
        if (android.text.TextUtils.isEmpty(e17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppRuntimeApiPermissionController[permission]", "getCtrlIndex invalid apiNAme, api:%s", obj.toString());
            return 6;
        }
        java.util.Map map = f489777q;
        java.lang.Integer num = (java.lang.Integer) ((java.util.concurrent.ConcurrentHashMap) map).get(e17);
        if (num != null) {
            return num.intValue();
        }
        int i17 = -1;
        try {
            if (obj instanceof java.lang.Class) {
                java.lang.Class cls = (java.lang.Class) obj;
                i17 = ((java.lang.Integer) new d56.b(cls, cls).f("CTRL_INDEX")).intValue();
            } else {
                i17 = ((java.lang.Integer) d56.b.h(obj).f("CTRL_INDEX")).intValue();
            }
            ((java.util.concurrent.ConcurrentHashMap) map).put(e17, java.lang.Integer.valueOf(i17));
        } catch (d56.c e18) {
            java.lang.String name = obj instanceof java.lang.Class ? ((java.lang.Class) obj).getName() : obj.toString();
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppRuntimeApiPermissionController[permission]", "getCtrlIndex class:%s, reflect failed %s", name, e18);
        }
        return i17;
    }

    public boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.Class cls) {
        int d17 = d(lVar, cls, null, null, h(cls), false);
        if (d17 == 1) {
            return true;
        }
        if (d17 != 6) {
            return d17 != 7 ? d17 == 8 : this.f489780a.g();
        }
        ((si1.p0) this.f489792m.b()).F6(lVar, e(cls));
        return false;
    }

    public si1.j b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.h hVar, java.lang.String str, java.lang.String str2, int i17, si1.k kVar) {
        boolean z17;
        if (hVar == null || lVar == null) {
            return si1.j.f489801f;
        }
        u81.b c17 = this.f489780a.c();
        int d17 = d(lVar, hVar, str, str2, h(hVar), true);
        java.lang.String mo48798x74292566 = lVar.mo48798x74292566();
        if (kVar != null) {
            kVar.b(d17);
        }
        if (d17 == 6) {
            ((si1.p0) this.f489792m.b()).F6(lVar, hVar.k());
            return si1.j.f489801f;
        }
        if (d17 == 1) {
            return ((lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) && c17 == u81.b.SUSPEND && yo.a.b(f489779s, hVar.k())) ? new si1.j(-1, java.lang.String.format(java.util.Locale.US, "fail: jsapi has no permission, event=%s, runningState=%s, permissionMsg=%s, detail=%s", hVar.k(), c17.name().toLowerCase(), "permission ok", "network api interrupted in suspend state"), jc1.f.f380456l) : si1.j.f489802g;
        }
        if (d17 != 4) {
            if (d17 == 7) {
                return this.f489780a.g() ? si1.j.f489802g : new si1.j(-1, java.lang.String.format(java.util.Locale.US, "fail: jsapi has no permission, event=%s, runningState=%s, permissionMsg=%s, detail=%s", hVar.k(), c17.name().toLowerCase(), "permission ok", "jsapi permission required playing audio but current not playing audio in background state"), jc1.f.f380456l);
            }
            if (d17 != 8) {
                return si1.j.f489801f;
            }
            if (kVar != null) {
                synchronized (this.f489783d) {
                    this.f489783d.addLast(kVar);
                }
            }
            return si1.j.f489800e;
        }
        java.lang.String k17 = hVar.k();
        boolean z18 = false;
        java.util.Set c18 = ui1.t.f509615d.c(mo48798x74292566, false);
        if (c18 != null) {
            synchronized (c18) {
                z17 = c18.contains(k17);
            }
        } else {
            z17 = false;
        }
        if (z17) {
            return si1.j.f489802g;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) lVar;
        if (hVar.k().equals(qf1.j.f76480x24728b)) {
            k91.z0 E0 = d0Var.t3().E0();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsApiUserAuth", "getWifiList jump userauth:%b", java.lang.Boolean.valueOf(!E0.f387382o));
            z18 = !E0.f387382o;
        }
        if (z18) {
            return si1.j.f489802g;
        }
        ui1.t.c(new ui1.a0((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar, hVar.k(), str, str2, i17), new si1.i(this, kVar));
        return si1.j.f489800e;
    }

    public int c(byte[] bArr, int i17) {
        int i18 = this.f489781b;
        if (i18 == -1) {
            return 1;
        }
        if (i18 == -2) {
            return 0;
        }
        if (i17 == -2) {
            return 1;
        }
        if (i17 == -1) {
            return this.f489782c ? 1 : 0;
        }
        if (i17 >= bArr.length || i17 < 0) {
            return 0;
        }
        return bArr[i17];
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f7, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f9, code lost:
    
        r0 = r18.mo48798x74292566();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0119, code lost:
    
        if (android.text.TextUtils.isEmpty(r10) == false) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l r18, java.lang.Object r19, java.lang.String r20, java.lang.String r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: si1.g.d(com.tencent.mm.plugin.appbrand.jsapi.l, java.lang.Object, java.lang.String, java.lang.String, int, boolean):int");
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.p1175xe0b91e4f.C12541xa79a9e89 f(java.lang.String str, int i17, int i18) {
        synchronized (this.f489788i) {
            java.util.HashMap hashMap = this.f489789j;
            if (hashMap == null) {
                return null;
            }
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.p1175xe0b91e4f.C12541xa79a9e89) hashMap.get(str + (i17 == 1 ? "_weApp" : i17 == 2 ? "_plugin" : "") + i18);
        }
    }

    public final byte[] g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, u81.b[] bVarArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54 c12540xf7cdfd54;
        int i17 = this.f489781b;
        if (i17 == -1) {
            return new byte[]{1};
        }
        if (i17 == -2) {
            return new byte[]{0};
        }
        if (android.text.TextUtils.isEmpty(str) || u46.l.c(lVar.mo48798x74292566(), str)) {
            synchronized (this.f489784e) {
                c12540xf7cdfd54 = this.f489785f;
            }
        } else {
            synchronized (this.f489786g) {
                c12540xf7cdfd54 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54) this.f489787h.get(str);
            }
        }
        if (c12540xf7cdfd54 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppRuntimeApiPermissionController[permission]", "getCtrlBytes(appId:%s, invokeAppId:%s) get NULL bundle", lVar.mo48798x74292566(), str);
            return new byte[]{0};
        }
        if (!(lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9)) {
            return c12540xf7cdfd54.f168926d;
        }
        u81.b c17 = this.f489780a.c();
        int ordinal = c17.ordinal();
        byte[] bArr = (ordinal == 1 || ordinal == 2 || ordinal == 3) ? c12540xf7cdfd54.f168927e : c12540xf7cdfd54.f168926d;
        if (bVarArr == null || bVarArr.length < 1) {
            return bArr;
        }
        bVarArr[0] = c17;
        return bArr;
    }

    public final void i() {
        if (this.f489787h == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppRuntimeApiPermissionController[permission]", "notifyNodeOnPluginUpdate");
        int i17 = 0;
        while (true) {
            java.util.List list = this.f489790k;
            if (i17 >= ((java.util.ArrayList) list).size()) {
                return;
            }
            si1.l lVar = (si1.l) ((java.util.ArrayList) list).get(i17);
            java.util.HashMap hashMap = this.f489787h;
            com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n2 n2Var = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.m2) lVar).f129014a;
            com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22919x419b2652 abstractC22919x419b2652 = n2Var.f129035a;
            if (abstractC22919x419b2652 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("jsBridge");
                throw null;
            }
            abstractC22919x419b2652.m83333x6df7798a(n2Var.b(hashMap));
            i17++;
        }
    }

    public final void j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54 c12540xf7cdfd54) {
        byte[] foreground = c12540xf7cdfd54.f168926d;
        int i17 = 0;
        while (true) {
            java.util.List list = this.f489790k;
            if (i17 >= list.size()) {
                return;
            }
            com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.m2 m2Var = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.m2) ((si1.l) list.get(i17));
            m2Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(foreground, "foreground");
            byte[] background = c12540xf7cdfd54.f168927e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(background, "background");
            byte[] suspend = c12540xf7cdfd54.f168928f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(suspend, "suspend");
            com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n2 n2Var = m2Var.f129014a;
            vp5.f fVar = new vp5.f(n2Var.a(foreground), n2Var.a(background), n2Var.a(suspend));
            com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22919x419b2652 abstractC22919x419b2652 = n2Var.f129035a;
            if (abstractC22919x419b2652 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("jsBridge");
                throw null;
            }
            abstractC22919x419b2652.m83332xec8fc777(fVar);
            i17++;
        }
    }

    public final void k() {
        if (this.f489787h == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppRuntimeApiPermissionController[permission]", "pluginUpdateNotifyWxCommLib mPluginPermission null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppRuntimeApiPermissionController[permission]", "pluginUpdateNotifyWxCommLib");
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str : this.f489787h.keySet()) {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54 c12540xf7cdfd54 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54) this.f489787h.get(str);
            if (c12540xf7cdfd54 != null) {
                hashMap2.put("fg", c12540xf7cdfd54.f168926d);
                hashMap2.put("bg", c12540xf7cdfd54.f168927e);
                hashMap2.put("sp", c12540xf7cdfd54.f168928f);
                hashMap.put(str, hashMap2);
            }
        }
        nf.f.c(hashMap);
        this.f489780a.d("onPluginPermissionUpdate", new org.json.JSONObject(hashMap));
    }

    public void l(java.util.HashMap hashMap) {
        synchronized (this.f489788i) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Integer.valueOf(hashMap == null ? 0 : hashMap.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppRuntimeApiPermissionController[permission]", "updateAppidABTestPermission size:%d", objArr);
            this.f489789j = hashMap;
        }
    }

    public void m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54 c12540xf7cdfd54) {
        if (c12540xf7cdfd54 == null) {
            return;
        }
        synchronized (this.f489784e) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54 c12540xf7cdfd542 = this.f489785f;
            if (c12540xf7cdfd542 != null && c12540xf7cdfd542.f168926d.length > c12540xf7cdfd54.f168926d.length) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppRuntimeApiPermissionController[permission]", "updatePermission, old %s, new %s, ignore", c12540xf7cdfd542, c12540xf7cdfd54);
                return;
            }
            this.f489785f = c12540xf7cdfd54;
            j(c12540xf7cdfd54);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppRuntimeApiPermissionController[permission]", "updatePermission old %s, updated %s", c12540xf7cdfd542, c12540xf7cdfd54);
        }
    }

    public void n(java.util.HashMap hashMap) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(hashMap == null ? -1 : hashMap.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppRuntimeApiPermissionController[permission]", "updatePluginPermission size:%d", objArr);
        if (hashMap == null || hashMap.isEmpty()) {
            return;
        }
        synchronized (this.f489786g) {
            if (this.f489787h == null) {
                this.f489787h = new java.util.HashMap();
            }
            this.f489787h.putAll(hashMap);
            k();
            i();
        }
    }
}
