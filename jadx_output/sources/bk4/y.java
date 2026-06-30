package bk4;

/* loaded from: classes11.dex */
public final class y extends bk4.f {

    /* renamed from: c, reason: collision with root package name */
    public static bk4.v f21620c;

    /* renamed from: a, reason: collision with root package name */
    public static final bk4.y f21618a = new bk4.y();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f21619b = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f21621d = new java.util.LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f21622e = new java.util.LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f21623f = new java.util.LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f21624g = {"zh_CN", "en", "zh_HK", "zh_TW"};

    @Override // bk4.f
    public boolean A(java.lang.String str) {
        if (str == null || r26.n0.N(str)) {
            return false;
        }
        bk4.u uVar = (bk4.u) f21619b.get(str);
        return uVar != null && uVar.b();
    }

    @Override // bk4.f
    public boolean B(mj4.h hVar) {
        return true;
    }

    @Override // bk4.f
    public boolean C() {
        return false;
    }

    @Override // bk4.f
    public boolean D() {
        return false;
    }

    @Override // bk4.f
    public boolean E() {
        return false;
    }

    @Override // bk4.f
    public boolean F() {
        return false;
    }

    @Override // bk4.f
    public boolean G() {
        return false;
    }

    @Override // bk4.f
    public boolean H() {
        return false;
    }

    @Override // bk4.f
    public boolean I() {
        return false;
    }

    @Override // bk4.f
    public boolean J() {
        return false;
    }

    @Override // bk4.f
    public boolean K() {
        return false;
    }

    @Override // bk4.f
    public boolean L(java.lang.String str) {
        return false;
    }

    @Override // bk4.f
    public void M() {
        bk4.i.f21484b.alive();
        bk4.i.f21485c.alive();
        long c17 = c01.id.c();
        java.lang.String str = lp0.b.e() + "textstatus/icon";
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mm.vfs.w6.u(str);
        }
        int W = W(str);
        byte[] N = com.tencent.mm.vfs.w6.N("assets:///text_status_res/TextStatus.zip", 0, -1);
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.sdk.platformtools.x2.f193071a.getCacheDir(), "TextStatus");
        com.tencent.mm.vfs.w6.u(r6Var.o());
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(r6Var, "asset.zip");
        if (r6Var2.m()) {
            r6Var2.l();
        }
        com.tencent.mm.vfs.w6.R(r6Var2.o(), N);
        java.lang.String o17 = r6Var2.o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        int Y = Y(o17);
        if (Y > W) {
            jx3.f.INSTANCE.idkeyStat(1629L, 14L, 1L, false);
            java.lang.String o18 = r6Var2.o();
            kotlin.jvm.internal.o.f(o18, "getAbsolutePath(...)");
            a0(o18, Y);
        } else {
            jx3.f.INSTANCE.idkeyStat(1629L, 15L, 1L, false);
            Z();
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusIconHelper", "initTextStatusResource no need to updateVersion currentVersion:" + W + " assetVersion:" + Y);
        }
        r6Var2.l();
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusIconHelper", "initTextStatusResource cost:" + (c01.id.c() - c17));
    }

    @Override // bk4.f
    public void N() {
        bk4.i.f21484b.dead();
        bk4.i.f21485c.dead();
    }

    @Override // bk4.f
    public void P(java.lang.Integer num) {
    }

    @Override // bk4.f
    public void Q(android.widget.ImageView imageView, java.lang.String str, bi4.d iconType, bi4.b iconColor, mj4.h hVar) {
        kotlin.jvm.internal.o.g(iconType, "iconType");
        kotlin.jvm.internal.o.g(iconColor, "iconColor");
    }

    @Override // bk4.f
    public void S(long j17) {
    }

    @Override // bk4.f
    public void T(java.lang.String iconId) {
        kotlin.jvm.internal.o.g(iconId, "iconId");
    }

    @Override // bk4.f
    public void U(android.widget.ImageView imageView, java.lang.String str, bi4.d iconType, bi4.b iconColor, mj4.h hVar, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(iconType, "iconType");
        kotlin.jvm.internal.o.g(iconColor, "iconColor");
        android.graphics.drawable.Drawable X = X(str, bi4.d.FILLED, bi4.b.DEFAULT);
        if (imageView != null) {
            imageView.setImageDrawable(X);
        }
    }

    public final int W(java.lang.String folderPath) {
        kotlin.jvm.internal.o.g(folderPath, "folderPath");
        java.lang.String concat = folderPath.concat("/TextStateIconConfig.xml");
        java.util.ArrayList arrayList = null;
        if (!com.tencent.mm.vfs.w6.j(concat)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFolderResVersion fail not exist configPath:");
            sb6.append(folderPath);
            sb6.append(' ');
            java.lang.Iterable s17 = com.tencent.mm.vfs.w6.s(folderPath, false);
            if (s17 != null) {
                arrayList = new java.util.ArrayList(kz5.d0.q(s17, 10));
                java.util.Iterator it = s17.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.tencent.mm.vfs.x1) it.next()).f213232b);
                }
            }
            sb6.append(arrayList);
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusIconHelper", sb6.toString());
            return -1;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(com.tencent.mm.vfs.w6.M(new com.tencent.mm.vfs.r6(concat).o()), "textStateResource", "");
        if (d17 != null) {
            int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) d17.get(".textStateResource.version"), 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusIconHelper", "getFolderResVersion unzipVersion " + D1);
            return D1;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("getFolderResVersion fail xmlMap is null:");
        sb7.append(folderPath);
        sb7.append(' ');
        java.lang.Iterable s18 = com.tencent.mm.vfs.w6.s(folderPath, false);
        if (s18 != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(s18, 10));
            java.util.Iterator it6 = s18.iterator();
            while (it6.hasNext()) {
                arrayList.add(((com.tencent.mm.vfs.x1) it6.next()).f213232b);
            }
        }
        sb7.append(arrayList);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusIconHelper", sb7.toString());
        return -1;
    }

    public final android.graphics.drawable.Drawable X(java.lang.String str, bi4.d iconType, bi4.b iconColor) {
        jz5.f0 f0Var;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(iconType, "iconType");
        kotlin.jvm.internal.o.g(iconColor, "iconColor");
        if (str != null) {
            java.lang.String str3 = str.length() > 0 ? str : null;
            if (str3 != null) {
                java.util.HashMap hashMap = f21619b;
                bk4.u uVar = (bk4.u) hashMap.get(str3);
                if (uVar != null) {
                    long j17 = uVar.f21568b;
                    if (j17 < 0) {
                        j17 = 0;
                    }
                    long e17 = c01.id.e();
                    if (!(j17 <= e17 && e17 <= com.tencent.wcdb.core.Database.DictDefaultMatchValue)) {
                        return null;
                    }
                    str2 = uVar.f21567a;
                    for (bk4.x xVar : uVar.f21574h.f21595a) {
                        long j18 = xVar.f21606b;
                        long j19 = j18 < 0 ? 0L : j18;
                        long j27 = xVar.f21607c;
                        if (j27 <= 0 || j27 <= j18) {
                            j27 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
                        }
                        long e18 = c01.id.e();
                        if (j19 <= e18 && e18 <= j27) {
                            str2 = str2 + '_' + xVar.f21605a;
                        }
                    }
                    f0Var = jz5.f0.f302826a;
                } else {
                    f0Var = null;
                    str2 = str3;
                }
                if (f0Var == null) {
                    return null;
                }
                bk4.y yVar = f21618a;
                bk4.u uVar2 = (bk4.u) hashMap.get(str3);
                boolean D0 = com.tencent.mm.sdk.platformtools.t8.D0(uVar2 != null ? uVar2.f21570d : null, "1");
                bi4.d dVar = bi4.d.READ;
                bi4.d dVar2 = (D0 && iconColor == bi4.b.GREY) ? dVar : iconType;
                int ordinal = dVar2.ordinal();
                java.util.Map map = f21622e;
                java.util.Map map2 = f21623f;
                java.util.Map map3 = f21621d;
                android.graphics.Bitmap bitmap = ordinal != 0 ? ordinal != 2 ? (android.graphics.Bitmap) ((java.util.LinkedHashMap) map).get(str2) : (android.graphics.Bitmap) ((java.util.LinkedHashMap) map2).get(str2) : (android.graphics.Bitmap) ((java.util.LinkedHashMap) map3).get(str2);
                if (bitmap == null || bitmap.isRecycled()) {
                    java.lang.String str4 = lp0.b.e() + "textstatus/icon";
                    if (!com.tencent.mm.vfs.w6.j(str4)) {
                        com.tencent.mm.vfs.w6.u(str4);
                    }
                    com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(java.lang.String.valueOf(str4)));
                    if (!android.text.TextUtils.isEmpty(str2) && r6Var.m()) {
                        int ordinal2 = dVar2.ordinal();
                        bitmap = com.tencent.mm.sdk.platformtools.x.J(new com.tencent.mm.vfs.r6(r6Var, str2 + (ordinal2 != 1 ? ordinal2 != 2 ? "_filled" : "_read" : "_outlined") + ".png").o(), null);
                        if (bitmap != null) {
                            bitmap.setDensity(com.tencent.mapsdk.internal.km.f50100e);
                            if (dVar2 == bi4.d.FILLED) {
                                map3.put(str2, bitmap);
                            } else if (dVar2 == dVar) {
                                map2.put(str2, bitmap);
                            } else {
                                map.put(str2, bitmap);
                            }
                        }
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusIconHelper", "cache icon " + str2);
                }
                if (bitmap == null) {
                    return null;
                }
                bk4.u uVar3 = (bk4.u) hashMap.get(str3);
                return yVar.i(bitmap, com.tencent.mm.sdk.platformtools.t8.D0(uVar3 != null ? uVar3.f21570d : null, "1"), iconType, iconColor);
            }
        }
        return null;
    }

    public final int Y(java.lang.String filePath) {
        int i17;
        kotlin.jvm.internal.o.g(filePath, "filePath");
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.sdk.platformtools.x2.f193071a.getCacheDir(), "TextStatus/temp");
        if (r6Var.m()) {
            com.tencent.mm.vfs.w6.f(r6Var.o());
        }
        com.tencent.mm.vfs.w6.u(r6Var.o());
        int Q = com.tencent.mm.vfs.w6.Q(filePath, r6Var.o());
        if (Q == 0) {
            java.lang.String o17 = r6Var.o();
            kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
            i17 = W(o17);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusIconHelper", "getZipVersion unzip fail " + Q + ' ' + filePath);
            i17 = -1;
        }
        com.tencent.mm.vfs.w6.f(r6Var.o());
        return i17;
    }

    public final void Z() {
        if (bk4.i.f21483a) {
            f21619b.clear();
            ((java.util.LinkedHashMap) f21621d).clear();
            ((java.util.LinkedHashMap) f21622e).clear();
            ((java.util.LinkedHashMap) f21623f).clear();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str = lp0.b.e() + "textstatus/icon";
            if (!com.tencent.mm.vfs.w6.j(str)) {
                com.tencent.mm.vfs.w6.u(str);
            }
            sb6.append(str);
            sb6.append("/TextStateIconConfig.xml");
            java.lang.String sb7 = sb6.toString();
            if (!com.tencent.mm.vfs.w6.j(sb7)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusIconHelper", "initTextStatusResItem fail config path not exist " + sb7);
                jx3.f.INSTANCE.idkeyStat(1629L, 7L, 1L, false);
                return;
            }
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(com.tencent.mm.vfs.w6.M(new com.tencent.mm.vfs.r6(sb7).o()), "textStateResource", "");
            if (d17 != null) {
                bk4.v vVar = new bk4.v(d17);
                for (bk4.u uVar : vVar.f21591c) {
                    if (uVar.f21571e == 1) {
                        java.lang.String v17 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_TEXT_STATUS_RESIDENT_CONFIG_STRING, "");
                        java.lang.String str2 = "<" + uVar.f21567a + ":1>";
                        kotlin.jvm.internal.o.d(v17);
                        if (r26.n0.B(v17, str2, false) && uVar.b()) {
                            java.util.Iterator it = vVar.f21590b.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    bk4.t tVar = (bk4.t) it.next();
                                    if (kotlin.jvm.internal.o.b(tVar.f21558a, uVar.f21572f)) {
                                        ((java.util.LinkedList) tVar.f21559b).add(uVar);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                f21620c = vVar;
            }
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("initTextStatusResItem version:");
            bk4.v vVar2 = f21620c;
            sb8.append(vVar2 != null ? vVar2.f21589a : -1);
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusIconHelper", sb8.toString());
            jx3.f.INSTANCE.idkeyStat(1629L, 8L, 1L, false);
        }
    }

    @Override // bk4.f
    public boolean a(java.lang.String str) {
        return false;
    }

    public final void a0(java.lang.String filePath, int i17) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        java.lang.String str = lp0.b.e() + "textstatus/icon";
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mm.vfs.w6.u(str);
        }
        com.tencent.mm.vfs.w6.f(str);
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mm.vfs.w6.u(str);
        }
        int Q = com.tencent.mm.vfs.w6.Q(filePath, str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("replaceTextStatusResource updateVersion currentVersion:");
        bk4.v vVar = f21620c;
        sb6.append(vVar != null ? java.lang.Integer.valueOf(vVar.f21589a) : null);
        sb6.append(" updateVersion:");
        sb6.append(i17);
        sb6.append(" unzipRet:");
        sb6.append(Q);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusIconHelper", sb6.toString());
        if (Q != 0) {
            jx3.f.INSTANCE.idkeyStat(1629L, 13L, 1L, false);
        } else {
            jx3.f.INSTANCE.idkeyStat(1629L, 12L, 1L, false);
            Z();
        }
    }

    @Override // bk4.f
    public pj4.p1 b() {
        return new pj4.p1();
    }

    public final void b0(java.util.Map valuesMap, java.util.Map xmlMap, java.lang.String prefix) {
        kotlin.jvm.internal.o.g(valuesMap, "valuesMap");
        kotlin.jvm.internal.o.g(xmlMap, "xmlMap");
        kotlin.jvm.internal.o.g(prefix, "prefix");
        for (java.lang.String str : f21624g) {
            java.lang.String str2 = (java.lang.String) xmlMap.get(prefix + '.' + str);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String z18 = com.tencent.mm.sdk.platformtools.t8.z1(str2, "");
            kotlin.jvm.internal.o.f(z18, "safeFormatString(...)");
            valuesMap.put(str, z18);
        }
    }

    @Override // bk4.f
    public java.lang.String c(pj4.o0 o0Var, int i17, java.lang.String name, int i18) {
        kotlin.jvm.internal.o.g(name, "name");
        if (i18 == 1) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.jvt, java.lang.Integer.valueOf(i17), name);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            return string;
        }
        if (i18 != 2) {
            return "";
        }
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.jvs, java.lang.Integer.valueOf(i17), name);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        return string2;
    }

    public final void c0(java.lang.String filePath) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusIconHelper", "updateTextStatusResource " + filePath + ' ' + com.tencent.mm.vfs.w6.k(filePath));
        int Y = Y(filePath);
        bk4.v vVar = f21620c;
        if ((vVar != null ? vVar.f21589a : -1) < Y) {
            jx3.f.INSTANCE.idkeyStat(1629L, 10L, 1L, false);
            a0(filePath, Y);
        } else {
            jx3.f.INSTANCE.idkeyStat(1629L, 11L, 1L, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusIconHelper", "updateTextStatusResource no need to updateVersion currentVersion:-1 updateVersion:" + Y);
        }
    }

    @Override // bk4.f
    public pj4.p1 d() {
        return new pj4.p1();
    }

    @Override // bk4.f
    public java.lang.String e() {
        return null;
    }

    @Override // bk4.f
    public java.lang.String f() {
        return "";
    }

    @Override // bk4.f
    public java.util.ArrayList g() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new lj4.c(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jwg)));
        bk4.v vVar = f21620c;
        if (vVar != null) {
            for (bk4.t tVar : vVar.f21590b) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                for (bk4.u uVar : tVar.f21559b) {
                    if (uVar.b()) {
                        linkedList.add(uVar);
                    }
                }
                if (linkedList.size() > 0) {
                    java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
                    java.util.HashMap hashMap = (java.util.HashMap) tVar.f21560c;
                    java.lang.String str = (java.lang.String) hashMap.get(f17);
                    boolean z17 = false;
                    if (str != null) {
                        if (str.length() > 0) {
                            z17 = true;
                        }
                    }
                    if (!z17) {
                        str = (java.lang.String) hashMap.get("en");
                    }
                    arrayList.add(new lj4.b(str));
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        bk4.u uVar2 = (bk4.u) it.next();
                        arrayList.add(new lj4.d(uVar2.a(), uVar2.f21567a));
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // bk4.f
    public java.util.ArrayList h() {
        return new java.util.ArrayList();
    }

    @Override // bk4.f
    public pj4.o1 j(java.lang.String str) {
        return null;
    }

    @Override // bk4.f
    public android.text.style.ImageSpan k(android.view.View view, java.lang.String str, bi4.d iconType, bi4.b iconColor, bi4.c cVar, int i17, mj4.h hVar) {
        kotlin.jvm.internal.o.g(iconType, "iconType");
        kotlin.jvm.internal.o.g(iconColor, "iconColor");
        android.graphics.drawable.Drawable X = X(str, iconType, iconColor);
        if (X == null) {
            return null;
        }
        X.setBounds(0, 0, i17, i17);
        return new bk4.r0(X, 1, hVar, cVar);
    }

    @Override // bk4.f
    public java.lang.String l(java.lang.String str) {
        java.lang.String a17;
        bk4.u uVar = (bk4.u) f21619b.get(str);
        return (uVar == null || (a17 = uVar.a()) == null) ? "" : a17;
    }

    @Override // bk4.f
    public java.lang.String m(pj4.o0 o0Var) {
        if (o0Var == null) {
            return "";
        }
        if (!kotlin.jvm.internal.o.b(o0Var.f355214e, "userdefine")) {
            return l(o0Var.f355214e);
        }
        java.lang.String str = o0Var.f355218i;
        return str == null ? "" : str;
    }

    @Override // bk4.f
    public java.lang.String n(java.lang.String str) {
        mj4.h M = ai4.m0.f5173a.M(str);
        return m(M != null ? xe0.j0.a(M, false, 1, null) : null);
    }

    @Override // bk4.f
    public long o() {
        return f21620c != null ? r0.f21589a : -1;
    }

    @Override // bk4.f
    public pj4.k0 p() {
        return new pj4.k0();
    }

    @Override // bk4.f
    public void r(pj4.e1 rsp) {
        kotlin.jvm.internal.o.g(rsp, "rsp");
    }

    @Override // bk4.f
    public void s(pj4.e1 rsp) {
        kotlin.jvm.internal.o.g(rsp, "rsp");
    }

    @Override // bk4.f
    public void t(pj4.e1 rsp) {
        kotlin.jvm.internal.o.g(rsp, "rsp");
    }

    @Override // bk4.f
    public boolean u(pj4.e1 rsp, ej4.e eVar) {
        kotlin.jvm.internal.o.g(rsp, "rsp");
        return false;
    }

    @Override // bk4.f
    public void v() {
    }

    @Override // bk4.f
    public boolean w() {
        return false;
    }

    @Override // bk4.f
    public boolean x() {
        return false;
    }

    @Override // bk4.f
    public boolean y() {
        return false;
    }

    @Override // bk4.f
    public boolean z() {
        return false;
    }
}
