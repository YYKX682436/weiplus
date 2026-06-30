package is1;

/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final is1.l f375956a = new is1.l();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f375957b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f375958c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f375959d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f375960e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f375961f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.ArrayList f375962g;

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f375963h;

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f375964i;

    static {
        java.lang.String str = ax4.a.f96647a;
        f375957b = str;
        f375958c = str;
        f375959d = jz5.h.b(is1.c.f375942d);
        f375960e = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
        f375961f = new java.util.concurrent.ConcurrentHashMap();
        f375962g = new java.util.ArrayList();
        for (int i17 = 0; i17 < 3; i17++) {
            java.lang.String str2 = "_webview_tmpl_cache_slot_" + i17;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(str2);
            long Y = M.Y();
            if (Y > 0) {
                java.lang.String[] b17 = M.b();
                boolean z17 = true;
                if (b17 != null) {
                    if (!(b17.length == 0)) {
                        z17 = false;
                    }
                }
                if (!z17) {
                    M.d();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Preload.TmplInfoManager", "clear " + str2 + " totalSize:" + Y);
                }
            }
        }
        f375963h = jz5.h.b(is1.k.f375955d);
        f375964i = jz5.h.b(is1.d.f375943d);
    }

    public static final void a(java.util.LinkedList linkedList, int i17, java.lang.String str) {
        ax4.a.a(0);
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            f375962g.add(java.lang.Integer.valueOf(((r45.p20) it.next()).f464209d));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Preload.TmplInfoManager", "checkTmplInner");
        new is1.a(linkedList, i17, str).l().K(new is1.e(linkedList, i17));
    }

    public static final void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.g().clear();
        com.p314xaae8f345.mm.vfs.w6.g(i(), true);
        com.p314xaae8f345.mm.vfs.w6.f(lp0.b.e() + "/jscache/");
    }

    public static final r45.wm6 c(int i17) {
        r45.vm6 j17 = j(f375956a, i17, null, 2, null);
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.j(j17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Preload.TmplInfoManager", "[createTmplParams]type:" + i17 + " localTmplInfo is null");
            ax4.a.a(100);
            return null;
        }
        java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.b(j17);
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.h(b17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Preload.TmplInfoManager", "[createTmplParams]filePath:" + b17 + " is null");
            int i18 = j17.f469910i;
            if (i18 > 0) {
                ax4.a.b(i18, 100, 1, true);
            }
            return null;
        }
        r45.wm6 wm6Var = new r45.wm6();
        wm6Var.f470825d = i17;
        wm6Var.f470826e = j17.f469906e;
        wm6Var.f470829h = j17.f469908g;
        wm6Var.f470828g = b17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = f375957b;
        sb6.append(str);
        sb6.append(i17);
        sb6.append('_');
        sb6.append(j17.f469913o);
        sb6.append(".html");
        java.lang.String str2 = f375958c;
        sb6.append(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str) ? "" : "?prefix=" + java.net.URLEncoder.encode(str2));
        wm6Var.f470827f = sb6.toString();
        wm6Var.f470834p = j17.f469907f;
        wm6Var.f470833o = j17.f469910i;
        wm6Var.f470832n = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.g().getLong("_tmpl_download_time_" + j17.f469905d, 0L);
        wm6Var.f470830i = j17.f469913o;
        java.util.LinkedList<r45.um6> HttpHeaderList = j17.f469911m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(HttpHeaderList, "HttpHeaderList");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        for (r45.um6 um6Var : HttpHeaderList) {
            sb7.append("\n" + um6Var.f469016d + ':' + um6Var.f469017e);
        }
        wm6Var.f470831m = sb7.toString();
        return wm6Var;
    }

    public static final r45.vm6 f(int i17) {
        r45.vm6 vm6Var = new r45.vm6();
        java.lang.String string = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.g().getString("_tmpl_info_latest_responsed_-" + i17, null);
        if (string != null) {
            f375956a.l(vm6Var, i17, string);
        }
        return vm6Var;
    }

    public static final java.util.LinkedList h(boolean z17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        long j17;
        boolean b17;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        is1.l lVar = f375956a;
        java.lang.Integer[] numArr = (java.lang.Integer[]) ((jz5.n) f375959d).mo141623x754a37bb();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = numArr.length;
        int i17 = 0;
        while (true) {
            concurrentHashMap = f375961f;
            boolean z18 = true;
            if (i17 >= length) {
                break;
            }
            java.lang.Integer num = numArr[i17];
            int intValue = num.intValue();
            if (!z17) {
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.k0.a().getBoolean("preload_tmpl_always_check_tmpl_ver", false)) {
                    b17 = true;
                } else {
                    if (concurrentHashMap.containsKey(java.lang.Integer.valueOf(intValue))) {
                        java.lang.Object obj = concurrentHashMap.get(java.lang.Integer.valueOf(intValue));
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                        j17 = ((java.lang.Number) obj).longValue();
                    } else {
                        j17 = 0;
                    }
                    if (f375962g.contains(java.lang.Integer.valueOf(intValue))) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Preload.TmplInfoManager", "[checkTmplVer] %d already check", java.lang.Integer.valueOf(intValue));
                        b17 = false;
                    } else {
                        b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.y3.b(j17, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.g().getLong("_check_time_colddown", f375960e));
                    }
                }
                if (!b17) {
                    z18 = false;
                }
            }
            if (z18) {
                arrayList.add(num);
            }
            i17++;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue2 = ((java.lang.Number) it.next()).intValue();
            concurrentHashMap.put(java.lang.Integer.valueOf(intValue2), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            r45.p20 p20Var = new r45.p20();
            p20Var.f464209d = intValue2;
            p20Var.f464212g = ((java.lang.Number) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.f176021a).mo141623x754a37bb()).longValue();
            linkedList.add(p20Var);
            java.util.ArrayList arrayList2 = null;
            r45.vm6 j18 = j(lVar, intValue2, null, 2, null);
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.j(j18)) {
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.i(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.a(j18))) {
                    p20Var.f464211f = j18.f469913o;
                }
                java.util.Set stringSet = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.g().getStringSet(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.f(j18), null);
                if (stringSet != null) {
                    arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj2 : stringSet) {
                        java.lang.String str = (java.lang.String) obj2;
                        r45.vm6 vm6Var = new r45.vm6();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                        lVar.l(vm6Var, intValue2, str);
                        if (lVar.n(vm6Var, j18)) {
                            arrayList2.add(obj2);
                        }
                    }
                }
                if (!(arrayList2 == null || arrayList2.isEmpty())) {
                    p20Var.f464210e.addAll(arrayList2);
                }
            }
        }
        return linkedList;
    }

    public static final java.lang.String i() {
        java.lang.String str = lp0.b.e() + "webview_tmpl/";
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.k0.a().getBoolean("preload_save_type", false)) {
            str = lp0.b.D();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "DATAROOT_SDCARD_PATH(...)");
        }
        if (!r26.i0.o(str, "/", false, 2, null)) {
            str = str.concat("/");
        }
        java.lang.String str2 = str + "tmpls/";
        com.p314xaae8f345.mm.vfs.w6.u(str2);
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r1.f469913o, r7) == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static r45.vm6 j(is1.l r5, int r6, java.lang.String r7, int r8, java.lang.Object r9) {
        /*
            r8 = r8 & 2
            if (r8 == 0) goto L6
            java.lang.String r7 = ""
        L6:
            r5.getClass()
            r45.vm6 r5 = f(r6)
            boolean r8 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.j(r5)
            if (r8 == 0) goto Lab
            java.lang.String r8 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.a(r5)
            boolean r8 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.i(r8)
            if (r8 == 0) goto L27
            java.lang.String r8 = r5.f469913o
            boolean r8 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r8, r7)
            if (r8 != 0) goto L27
            goto Lb0
        L27:
            com.tencent.mm.sdk.platformtools.o4 r8 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.g()
            java.lang.String r9 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.c(r5)
            r0 = 0
            java.lang.String r8 = r8.getString(r9, r0)
            is1.l r9 = is1.l.f375956a
            if (r8 == 0) goto L71
            r45.vm6 r1 = new r45.vm6
            r1.<init>()
            r9.l(r1, r6, r8)
            boolean r8 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.j(r1)
            if (r8 == 0) goto L71
            com.tencent.mm.sdk.platformtools.o4 r8 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.g()
            java.lang.String r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.d(r1)
            r3 = 0
            long r2 = r8.getLong(r2, r3)
            r8 = 3600000(0x36ee80, float:5.044674E-39)
            boolean r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.y3.a(r2, r8)
            if (r8 != 0) goto L71
            java.lang.String r8 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.a(r1)
            boolean r8 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.i(r8)
            if (r8 == 0) goto L71
            java.lang.String r8 = r1.f469913o
            boolean r8 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r8, r7)
            if (r8 != 0) goto L71
        L6f:
            r5 = r1
            goto Lb0
        L71:
            com.tencent.mm.sdk.platformtools.o4 r8 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.g()
            java.lang.String r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.f(r5)
            java.util.Set r8 = r8.getStringSet(r1, r0)
            if (r8 == 0) goto Lab
            java.util.List r8 = kz5.n0.E0(r8)
            java.util.Iterator r8 = r8.iterator()
        L87:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lab
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r7)
            if (r1 != 0) goto L87
            r45.vm6 r1 = new r45.vm6
            r1.<init>()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0)
            r9.l(r1, r6, r0)
            boolean r0 = r9.n(r1, r5)
            if (r0 == 0) goto L87
            goto L6f
        Lab:
            r45.vm6 r5 = new r45.vm6
            r5.<init>()
        Lb0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: is1.l.j(is1.l, int, java.lang.String, int, java.lang.Object):r45.vm6");
    }

    public final java.lang.String d(r45.vm6 vm6Var) {
        return "Type:" + vm6Var.f469905d + " Version:" + vm6Var.f469906e + " CdnUrl:" + vm6Var.f469907f + " Md5:" + vm6Var.f469908g;
    }

    public final is1.b e(int i17, java.lang.String str, java.util.Map map, java.lang.String str2) {
        boolean z17;
        is1.b bVar = new is1.b();
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str2));
        if (r6Var.m()) {
            r6Var.l();
        }
        try {
            java.net.URLConnection openConnection = new java.net.URL(str).openConnection();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) openConnection;
            try {
                httpURLConnection.setRequestProperty("Cache-Control", "no-cache");
                httpURLConnection.setRequestProperty("Cache-Control", "no-store");
                httpURLConnection.setDefaultUseCaches(false);
                if (map != null && (!map.isEmpty())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Preload.TmplInfoManager", "headers.size:%d", java.lang.Integer.valueOf(map.size()));
                    for (java.lang.String str3 : map.keySet()) {
                        httpURLConnection.setRequestProperty(str3, (java.lang.String) map.get(str3));
                    }
                }
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setReadTimeout(10000);
                httpURLConnection.setConnectTimeout(3000);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    r6Var.k();
                    byte[] bArr = new byte[8192];
                    java.io.InputStream inputStream = httpURLConnection.getInputStream();
                    java.io.OutputStream H = com.p314xaae8f345.mm.vfs.w6.H(r6Var);
                    while (true) {
                        try {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            H.write(bArr, 0, read);
                        } finally {
                        }
                    }
                    vz5.b.a(H, null);
                    bVar.f375937a = true;
                    bVar.f375938b = httpURLConnection.getHeaderField("X-WECHAT-MPBASEFULLVERSION");
                    bVar.f375939c = httpURLConnection.getHeaderField("X-WECHAT-MPPATCHMD5");
                    java.lang.String headerField = httpURLConnection.getHeaderField("X-WECHAT-MPCONTROLFLAG");
                    if (headerField != null && !r26.n0.N(headerField)) {
                        z17 = false;
                        bVar.f375940d = z17 && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("0", headerField);
                    }
                    z17 = true;
                    bVar.f375940d = z17 && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("0", headerField);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Preload.TmplInfoManager", "Server return code:" + responseCode);
                    if (responseCode > 500) {
                        ax4.a.b(i17, 11, 1, true);
                    } else if (responseCode > 400) {
                        ax4.a.b(i17, 10, 1, true);
                    }
                }
            } finally {
            }
        } catch (java.io.FileNotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Preload.TmplInfoManager", e17, "not found file:" + str2 + " \nurl:" + str, new java.lang.Object[0]);
            bVar.f375941e = e17;
            ax4.a.b(i17, 7, 1, true);
            if (r6Var.m()) {
                r6Var.l();
            }
        } catch (java.io.IOException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Preload.TmplInfoManager", e18, "download file:" + str2 + " \nurl:" + str, new java.lang.Object[0]);
            bVar.f375941e = e18;
            ax4.a.b(i17, 7, 1, true);
            if (r6Var.m()) {
                r6Var.l();
            }
        }
        return bVar;
    }

    public final java.lang.String g() {
        java.lang.String str = "";
        for (java.lang.Integer num : (java.lang.Integer[]) ((jz5.n) f375959d).mo141623x754a37bb()) {
            int intValue = num.intValue();
            str = str + intValue + ':' + f(intValue).f469906e + '\n';
        }
        return str;
    }

    public final void k(r45.wm6 tmplParams, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tmplParams, "tmplParams");
        java.lang.String str = "_tmpl_info_inject_fail_-" + tmplParams.f470825d + '-' + tmplParams.f470830i;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.g().W(str);
            return;
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.g().getInt(str, 0) + 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.g().putInt(str, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Preload.TmplInfoManager", "store tmpl inject fail:" + tmplParams.f470825d + ',' + tmplParams.f470830i + ',' + i17);
        if (i17 > 2) {
            ax4.a.a(219);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Preload.TmplInfoManager", "clear tmpl for too many inject fail:" + tmplParams.f470825d + ',' + tmplParams.f470830i + ',' + i17);
        }
    }

    public final r45.vm6 l(r45.vm6 vm6Var, int i17, java.lang.String str) {
        vm6Var.f469905d = i17;
        vm6Var.f469913o = str;
        byte[] j17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.g().j(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.e(vm6Var));
        if (!(j17 == null || j17.length == 0)) {
            try {
                vm6Var.mo11468x92b714fd(j17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Preload.TmplInfoManager", th6, "decode TmplInfo:" + i17 + ", " + str, new java.lang.Object[0]);
            }
        }
        return vm6Var;
    }

    public final boolean m(java.lang.String str, java.lang.String str2) {
        java.util.zip.ZipFile zipFile = new java.util.zip.ZipFile(str);
        try {
            java.util.Enumeration<? extends java.util.zip.ZipEntry> entries = zipFile.entries();
            byte[] bArr = new byte[1024];
            while (entries.hasMoreElements()) {
                java.util.zip.ZipEntry nextElement = entries.nextElement();
                java.lang.String name = nextElement.getName();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(name);
                if (r26.n0.L(name, "../", 0, false, 6, null) != -1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Preload.TmplInfoManager", "skip unzip break through file:%s", name);
                } else {
                    com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str2 + name);
                    java.lang.String r17 = r6Var.r();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r17);
                    com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(r17);
                    java.lang.String str3 = a17.f294812f;
                    if (str3 != null) {
                        java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
                        if (!str3.equals(l17)) {
                            a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                        }
                    }
                    com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                    if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
                        com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, m17);
                        if (m18.a()) {
                            m18.f294799a.r(m18.f294800b);
                        }
                    }
                    if (!nextElement.isDirectory()) {
                        if (!r6Var.m()) {
                            r6Var.k();
                        }
                        java.io.InputStream inputStream = zipFile.getInputStream(nextElement);
                        try {
                            java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(com.p314xaae8f345.mm.vfs.w6.H(r6Var));
                            while (true) {
                                try {
                                    int read = inputStream.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    }
                                    bufferedOutputStream.write(bArr, 0, read);
                                } finally {
                                }
                            }
                            bufferedOutputStream.flush();
                            vz5.b.a(bufferedOutputStream, null);
                            vz5.b.a(inputStream, null);
                        } finally {
                        }
                    } else if (!r6Var.m()) {
                        r6Var.J();
                    }
                }
            }
            vz5.b.a(zipFile, null);
            return true;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(r45.vm6 r9, r45.vm6 r10) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: is1.l.n(r45.vm6, r45.vm6):boolean");
    }

    public final boolean o(java.lang.String str, com.p314xaae8f345.mm.vfs.r6 r6Var) {
        java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(r6Var.u());
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, p17)) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Preload.TmplInfoManager", "checkTmpl MD5 not match md5=" + str + ", fileMd5=" + p17 + ", filePath=" + r6Var.o() + ", fileSize=" + r6Var.C());
        return false;
    }
}
