package bk4;

/* loaded from: classes11.dex */
public final class f0 extends bk4.f {

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Long f102999b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f103000c;

    /* renamed from: d, reason: collision with root package name */
    public static pj4.e1 f103001d;

    /* renamed from: h, reason: collision with root package name */
    public static int f103005h;

    /* renamed from: a, reason: collision with root package name */
    public static final bk4.f0 f102998a = new bk4.f0();

    /* renamed from: e, reason: collision with root package name */
    public static pj4.p1 f103002e = new pj4.p1();

    /* renamed from: f, reason: collision with root package name */
    public static pj4.x0 f103003f = new pj4.x0();

    /* renamed from: g, reason: collision with root package name */
    public static pj4.k0 f103004g = new pj4.k0();

    /* renamed from: i, reason: collision with root package name */
    public static java.util.LinkedList f103006i = new java.util.LinkedList();

    @Override // bk4.f
    public boolean A(java.lang.String str) {
        if (str == null || r26.n0.N(str)) {
            return false;
        }
        pj4.o1 j17 = j(str);
        return (j17 != null ? bk4.g0.e(j17, false) : null) != null;
    }

    @Override // bk4.f
    public boolean B(mj4.h hVar) {
        java.lang.String str;
        pj4.x c17;
        if (bi4.v1.l()) {
            java.lang.String o17 = hVar != null ? ((mj4.k) hVar).o() : null;
            if (o17 == null ? false : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(o17, en1.a.a())) {
                return true;
            }
        }
        if (hVar == null || (str = ((mj4.k) hVar).c()) == null) {
            str = "";
        }
        if (r26.n0.N(str)) {
            return false;
        }
        pj4.o1 j17 = j(str);
        java.util.LinkedList linkedList = j17 != null ? j17.f436763f : (hVar == null || (c17 = mj4.d.c(xe0.j0.a(hVar, false, 1, null))) == null) ? null : c17.f436856e;
        return (linkedList != null ? bk4.g0.f(linkedList) : null) != null;
    }

    @Override // bk4.f
    public boolean C() {
        return true;
    }

    @Override // bk4.f
    public boolean D() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_text_status_expt_custom_status_switch_and, bm5.h0.RepairerConfig_TextStatus_CustomStatusSwitch_Int, 0) == 1;
    }

    @Override // bk4.f
    public boolean E() {
        return true;
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
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        java.lang.String e17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().e(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2569xa4f4bf5f.C20711xeb69a576());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e17);
        return q26.h0.n(r26.n0.g0(e17, new char[]{','}, false, 0, 6, null), str) >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00db A[Catch: all -> 0x0107, TryCatch #1 {all -> 0x0107, blocks: (B:38:0x00d1, B:40:0x00db, B:57:0x00e1, B:59:0x00f1, B:63:0x00fb), top: B:37:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e1 A[Catch: all -> 0x0107, TryCatch #1 {all -> 0x0107, blocks: (B:38:0x00d1, B:40:0x00db, B:57:0x00e1, B:59:0x00f1, B:63:0x00fb), top: B:37:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a2 A[Catch: all -> 0x00ab, TRY_LEAVE, TryCatch #3 {all -> 0x00ab, blocks: (B:26:0x0097, B:68:0x00a2), top: B:25:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x006e A[Catch: all -> 0x0077, TRY_LEAVE, TryCatch #2 {all -> 0x0077, blocks: (B:14:0x0063, B:72:0x006e), top: B:13:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // bk4.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M() {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bk4.f0.M():void");
    }

    @Override // bk4.f
    public void N() {
    }

    @Override // bk4.f
    public void P(java.lang.Integer num) {
        int i17 = 0;
        boolean z17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TEXT_STATUS_LAST_CLIENT_VERSION_INT, 0) != o45.wf.f424562g;
        boolean z18 = z17 || bm5.o1.f104252a.g(bm5.h0.RepairerConfig_TextStatus_PullNewConfigSwitch_Int, 0) == 1;
        long j17 = z18 ? 0L : f103002e.f436784d;
        long j18 = z18 ? 0L : f103003f.f436861d;
        long j19 = z18 ? 0L : f103004g.f436686d;
        long j27 = z18 ? 0L : b().f436784d;
        if (num != null && num.intValue() == 1) {
            i17 = 5;
        } else if (z17) {
            i17 = 2;
        } else if (num != null && num.intValue() == 2) {
            i17 = 16;
        } else if (num != null && num.intValue() == 3) {
            i17 = 8;
        } else if (num != null && num.intValue() == 4) {
            i17 = 4;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusIconHelperV2", "[reqNewestIconConfig] key:" + j17 + " coverAgendaKey:" + j18 + " keyValueConfigKey:" + j19 + " appbrandConfigKey:" + j27 + " flag:" + i17 + " isClientVersionChange:" + z17);
        gm0.j1.d().g(new ej4.e(j17, java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27), java.lang.Integer.valueOf(i17)));
    }

    @Override // bk4.f
    public void Q(android.widget.ImageView imageView, java.lang.String str, bi4.d iconType, bi4.b iconColor, mj4.h hVar) {
        pj4.g0 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconType, "iconType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconColor, "iconColor");
        if (bk4.i.a().J()) {
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
            return;
        }
        if (bk4.i.a().J()) {
            str = "1080";
        }
        bk4.k X = X(imageView, str, iconType, iconColor, hVar, false);
        if (X == null || (a17 = X.a()) == null) {
            return;
        }
        X.b(a17.f436588p, bk4.g0.j(a17));
    }

    @Override // bk4.f
    public void S(long j17) {
        f102999b = java.lang.Long.valueOf(j17);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TEXT_STATUS_COVER_AGENDA_LAST_CLICK_TIME_LONG, java.lang.Long.valueOf(j17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusIconHelperV2", "setCoverAgendaClickTime:  clickTime:" + j17);
    }

    @Override // bk4.f
    public void T(java.lang.String iconId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconId, "iconId");
        f103000c = iconId;
    }

    @Override // bk4.f
    public void U(android.widget.ImageView imageView, java.lang.String str, bi4.d iconType, bi4.b iconColor, mj4.h hVar, boolean z17, boolean z18) {
        pj4.g0 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconType, "iconType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconColor, "iconColor");
        bk4.k X = X(imageView, str, iconType, iconColor, hVar, z18);
        if (X == null || (a17 = X.a()) == null) {
            return;
        }
        X.b(a17.f436579d, bk4.g0.j(a17));
    }

    public final void W(pj4.o1 o1Var, java.lang.String str, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            pj4.r1 r1Var = (pj4.r1) it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r1Var.f436807d.f436798d, str)) {
                r1Var.f436808e.add(o1Var);
            }
        }
    }

    public final bk4.k X(android.widget.ImageView imageView, java.lang.String str, bi4.d dVar, bi4.b bVar, mj4.h hVar, boolean z17) {
        if ((str == null || r26.n0.N(str)) || imageView == null) {
            return null;
        }
        return new bk4.k(imageView, j(str), dVar, bVar, hVar, z17);
    }

    public final pj4.p1 Y(java.util.LinkedList linkedList) {
        if (!(linkedList == null || linkedList.isEmpty())) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                pj4.p1 p1Var = (pj4.p1) it.next();
                java.lang.String str = p1Var.f436785e;
                java.lang.String str2 = p1Var.f436785e;
                if (str2 != null && str2.equals("weapp_panel")) {
                    return p1Var;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TextStatus.StatusIconHelperV2", "getAppBrandPanelConfig: can't find right config ,return curConfig. iconConfigs.size:%s", java.lang.Integer.valueOf(linkedList.size()));
        return new pj4.p1();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0046. Please report as an issue. */
    public final int Z(pj4.k0 k0Var) {
        java.lang.String str;
        int i17;
        java.util.LinkedList<pj4.l0> linkedList = k0Var.f436687e;
        if (linkedList != null) {
            for (pj4.l0 l0Var : linkedList) {
                if (l0Var.f436702d.equals("textstatus_post_explore_param_202207") || l0Var.f436702d.equals("textstatus_customtitle_expt_param_202208")) {
                    str = l0Var.f436702d + l0Var.f436703e;
                    break;
                }
            }
        }
        str = null;
        if (str == null) {
            return 0;
        }
        switch (str.hashCode()) {
            case -1576802596:
                if (!str.equals("textstatus_customtitle_expt_param_202208fullscreen_title_icon")) {
                    return 0;
                }
                i17 = 6;
                return i17;
            case -1025813249:
                if (!str.equals("textstatus_post_explore_param_202207default")) {
                    return 0;
                }
                i17 = 5;
                return i17;
            case -682472626:
                if (!str.equals("textstatus_post_explore_param_202207expt_emoji_or_smiley")) {
                    return 0;
                }
                i17 = 3;
                return i17;
            case -231679503:
                if (!str.equals("textstatus_post_explore_param_202207expt_no_icon")) {
                    return 0;
                }
                i17 = 1;
                return i17;
            case 406916073:
                if (!str.equals("textstatus_post_explore_param_202207expt_legacy_icon")) {
                    return 0;
                }
                i17 = 2;
                return i17;
            case 622069136:
                if (!str.equals("textstatus_post_explore_param_202207expt_browse")) {
                    return 0;
                }
                i17 = 4;
                return i17;
            case 1136985625:
                if (!str.equals("textstatus_customtitle_expt_param_202208default")) {
                    return 0;
                }
                i17 = 8;
                return i17;
            case 1406151676:
                if (!str.equals("textstatus_customtitle_expt_param_202208fullscreen_title")) {
                    return 0;
                }
                i17 = 7;
                return i17;
            default:
                return 0;
        }
    }

    @Override // bk4.f
    public boolean a(java.lang.String str) {
        if (str == null) {
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "userdefine")) {
            pj4.o1 j17 = f102998a.j(str);
            if (1 != (j17 != null ? j17.f436765h : 0L)) {
                return false;
            }
        }
        return true;
    }

    public final void a0(java.lang.String url, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (r26.n0.N(url)) {
            callback.mo146xb9724478(null);
            return;
        }
        vo0.d dVar = vi4.e.f519142a;
        wo0.c a17 = vi4.e.f519142a.a(new vi4.b(url));
        bk4.e0 e0Var = new bk4.e0(callback);
        a17.getClass();
        a17.f529406d = e0Var;
        a17.a();
    }

    @Override // bk4.f
    public pj4.p1 b() {
        return Y(f103006i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0098, code lost:
    
        if (r8 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a9, code lost:
    
        if (r8 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ba, code lost:
    
        if (r8 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cb, code lost:
    
        if (r8 != null) goto L84;
     */
    @Override // bk4.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String c(pj4.o0 r8, int r9, java.lang.String r10, int r11) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bk4.f0.c(pj4.o0, int, java.lang.String, int):java.lang.String");
    }

    @Override // bk4.f
    public pj4.p1 d() {
        return f103002e;
    }

    @Override // bk4.f
    public java.lang.String e() {
        java.lang.String str;
        java.util.LinkedList linkedList;
        java.util.LinkedList<pj4.y0> linkedList2;
        jz5.f0 f0Var;
        java.lang.Integer num = null;
        if (!bk4.i.a().E()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusIconHelperV2", "getCoverAgendaIconId: isTextStatusEditorDefault , return AgendaIconId is null ");
            return null;
        }
        long a17 = c01.id.a() / 1000;
        pj4.x0 x0Var = f103003f;
        if (x0Var == null || (linkedList2 = x0Var.f436862e) == null) {
            str = null;
        } else {
            str = null;
            for (pj4.y0 y0Var : linkedList2) {
                if (y0Var.f436875e > a17 || y0Var.f436876f < a17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TextStatus.StatusIconHelperV2", "getCoverAgendaIconId Out of time range : begin_time:" + y0Var.f436875e + " end_time:" + y0Var.f436876f + " nowTime:" + a17);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusIconHelperV2", "getCoverAgendaIconId: begin_time:" + y0Var.f436875e + " end_time:" + y0Var.f436876f + " nowTime:" + a17);
                    java.lang.Long l17 = f102999b;
                    if (l17 != null) {
                        long longValue = l17.longValue();
                        if (longValue < y0Var.f436875e || longValue > y0Var.f436876f) {
                            str = y0Var.f436874d;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusIconHelperV2", "getCoverAgendaIconId: lastAgendaClickTime:" + longValue);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusIconHelperV2", "getCoverAgendaIconId: Has been clicked");
                        }
                        f0Var = jz5.f0.f384359a;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        str = y0Var.f436874d;
                    }
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getCoverAgendaIconId: nowTime:");
        sb6.append(a17);
        sb6.append(" lastAgendaClickTime:");
        sb6.append(f102999b);
        sb6.append(" coverAgenda.cover_icons.size:");
        pj4.x0 x0Var2 = f103003f;
        if (x0Var2 != null && (linkedList = x0Var2.f436862e) != null) {
            num = java.lang.Integer.valueOf(linkedList.size());
        }
        sb6.append(num);
        sb6.append(" iconId:");
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusIconHelperV2", sb6.toString());
        return str;
    }

    @Override // bk4.f
    public java.lang.String f() {
        java.lang.String str = f103000c;
        f103000c = null;
        return str == null ? "" : str;
    }

    @Override // bk4.f
    public java.util.ArrayList g() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new lj4.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jwg)));
        pj4.p1 p1Var = f103002e;
        if (p1Var != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = p1Var.f436786f.iterator();
            while (it.hasNext()) {
                pj4.q1 q1Var = (pj4.q1) it.next();
                pj4.r1 r1Var = new pj4.r1();
                r1Var.f436807d = q1Var;
                linkedList.add(r1Var);
            }
            java.util.Iterator it6 = p1Var.f436787g.iterator();
            while (true) {
                boolean z17 = true;
                if (!it6.hasNext()) {
                    break;
                }
                pj4.o1 o1Var = (pj4.o1) it6.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(o1Var);
                pj4.g0 e17 = bk4.g0.e(o1Var, true);
                java.lang.String str = e17 != null ? e17.f436585m : null;
                if (str != null && !r26.n0.N(str)) {
                    z17 = false;
                }
                if (!z17) {
                    f102998a.W(o1Var, str, linkedList);
                }
            }
            java.util.Iterator it7 = linkedList.iterator();
            while (it7.hasNext()) {
                pj4.r1 r1Var2 = (pj4.r1) it7.next();
                if (r1Var2.f436808e.size() > 0) {
                    java.util.LinkedList icons = r1Var2.f436808e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(icons, "icons");
                    if (icons.size() > 1) {
                        kz5.g0.t(icons, new bk4.a0());
                    }
                    pj4.q1 iconGroup = r1Var2.f436807d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(iconGroup, "iconGroup");
                    java.util.LinkedList iconGroupDescriptions = iconGroup.f436799e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(iconGroupDescriptions, "iconGroupDescriptions");
                    java.lang.String b17 = bk4.g0.b(iconGroupDescriptions);
                    if (b17 == null) {
                        b17 = "";
                    }
                    arrayList.add(new lj4.b(b17));
                    java.util.Iterator it8 = icons.iterator();
                    while (it8.hasNext()) {
                        pj4.o1 o1Var2 = (pj4.o1) it8.next();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(o1Var2);
                        arrayList.add(new lj4.d(bk4.g0.c(o1Var2), o1Var2.f436761d));
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // bk4.f
    public java.util.ArrayList h() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!((java.util.ArrayList) bk4.r.f103077a.c()).isEmpty()) {
            arrayList.add(new lj4.f());
        }
        pj4.p1 p1Var = f103002e;
        if (p1Var != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = p1Var.f436786f.iterator();
            while (it.hasNext()) {
                pj4.q1 q1Var = (pj4.q1) it.next();
                pj4.r1 r1Var = new pj4.r1();
                r1Var.f436807d = q1Var;
                linkedList.add(r1Var);
            }
            java.util.Iterator it6 = p1Var.f436787g.iterator();
            while (it6.hasNext()) {
                pj4.o1 o1Var = (pj4.o1) it6.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(o1Var);
                pj4.g0 e17 = bk4.g0.e(o1Var, true);
                java.lang.String str = e17 != null ? e17.f436585m : null;
                if (!(str == null || r26.n0.N(str))) {
                    f102998a.W(o1Var, str, linkedList);
                }
            }
            java.util.Iterator it7 = linkedList.iterator();
            while (it7.hasNext()) {
                pj4.r1 r1Var2 = (pj4.r1) it7.next();
                if (r1Var2.f436808e.size() > 0) {
                    java.util.LinkedList icons = r1Var2.f436808e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(icons, "icons");
                    if (icons.size() > 1) {
                        kz5.g0.t(icons, new bk4.b0());
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.Iterator it8 = icons.iterator();
                    while (it8.hasNext()) {
                        pj4.o1 o1Var2 = (pj4.o1) it8.next();
                        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(o1Var2.f436761d, "userdefine")) {
                            arrayList2.add(new lj4.d(bk4.g0.c(o1Var2), o1Var2.f436761d));
                        }
                    }
                    pj4.q1 iconGroup = r1Var2.f436807d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(iconGroup, "iconGroup");
                    java.util.LinkedList iconGroupDescriptions = iconGroup.f436799e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(iconGroupDescriptions, "iconGroupDescriptions");
                    java.lang.String b17 = bk4.g0.b(iconGroupDescriptions);
                    if (b17 == null) {
                        b17 = "";
                    }
                    arrayList.add(new lj4.e(b17, arrayList2));
                }
            }
        }
        return arrayList;
    }

    @Override // bk4.f
    public pj4.o1 j(java.lang.String str) {
        pj4.o1 d17 = bk4.g0.d(f103002e, str);
        return d17 == null ? bk4.g0.d(b(), str) : d17;
    }

    @Override // bk4.f
    public android.text.style.ImageSpan k(android.view.View view, java.lang.String str, bi4.d iconType, bi4.b iconColor, bi4.c cVar, int i17, mj4.h hVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconType, "iconType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconColor, "iconColor");
        java.lang.String str2 = bk4.i.a().K() ? "1080" : str;
        int i18 = 0;
        android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable(0);
        colorDrawable.setBounds(0, 0, 0, 0);
        int i19 = cVar == null ? -1 : bk4.z.f103164a[cVar.ordinal()];
        if (i19 != 1 && i19 != 2 && i19 != 3 && i19 != 4) {
            int i27 = bk4.u0.f103108t;
            i18 = bk4.u0.f103108t;
        }
        int i28 = i18;
        return (((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).vj(null) && bi4.c.CONVERSATION_LIST == cVar) ? new bk4.z0(view, colorDrawable, str2, 1, hVar, cVar, iconType, iconColor, i17, i28) : new bk4.u0(view, colorDrawable, str2, 1, hVar, cVar, iconType, iconColor, i17, i28);
    }

    @Override // bk4.f
    public java.lang.String l(java.lang.String str) {
        pj4.o1 j17 = j(str);
        return j17 != null ? bk4.g0.c(j17) : "";
    }

    @Override // bk4.f
    public java.lang.String m(pj4.o0 o0Var) {
        if (o0Var == null) {
            return "";
        }
        java.lang.String str = o0Var.f436751i;
        if (str == null || str.length() == 0) {
            return l(o0Var.f436747e);
        }
        java.lang.String str2 = o0Var.f436751i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        return str2;
    }

    @Override // bk4.f
    public java.lang.String n(java.lang.String str) {
        mj4.h M = ai4.m0.f86706a.M(str);
        return m(M != null ? xe0.j0.a(M, false, 1, null) : null);
    }

    @Override // bk4.f
    public long o() {
        return f103002e.f436784d;
    }

    @Override // bk4.f
    public pj4.k0 p() {
        return f103004g;
    }

    @Override // bk4.f
    public void r(pj4.e1 rsp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rsp, "rsp");
        pj4.x0 x0Var = rsp.f436565e;
        if (x0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusIconHelperV2", "handleCoverAgendaResult nochange");
            return;
        }
        f103003f = x0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleCoverAgendaResult:");
        java.util.LinkedList linkedList = f103003f.f436862e;
        sb6.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusIconHelperV2", sb6.toString());
        com.p314xaae8f345.mm.vfs.w6.R(bk4.n.f103046a.i(""), f103003f.mo14344x5f01b1f6());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    @Override // bk4.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s(pj4.e1 r10) {
        /*
            r9 = this;
            java.lang.String r0 = "rsp"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            java.util.LinkedList r10 = r10.f436567g
            r0 = 0
            r1 = 1
            if (r10 == 0) goto L15
            boolean r2 = r10.isEmpty()
            if (r2 == 0) goto L13
            goto L15
        L13:
            r2 = r0
            goto L16
        L15:
            r2 = r1
        L16:
            if (r2 == 0) goto L19
            goto L30
        L19:
            pj4.p1 r2 = r9.Y(r10)
            java.util.LinkedList r3 = r2.f436786f
            int r3 = r3.size()
            if (r3 == 0) goto L30
            java.util.LinkedList r2 = r2.f436787g
            int r2 = r2.size()
            if (r2 != 0) goto L2e
            goto L30
        L2e:
            r2 = r1
            goto L31
        L30:
            r2 = r0
        L31:
            java.lang.String r3 = "MicroMsg.TextStatus.StatusIconHelperV2"
            if (r2 != 0) goto L3c
            java.lang.String r10 = "handleIconConfigListResult nochange"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r10)
            return
        L3c:
            java.lang.String r2 = "icon_configs"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r10, r2)
            bk4.f0.f103006i = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r2 = "handleIconConfigListResult:"
            r10.<init>(r2)
            java.util.LinkedList r2 = bk4.f0.f103006i
            int r2 = r2.size()
            r10.append(r2)
            r2 = 32
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r10)
            java.util.LinkedList r10 = bk4.f0.f103006i
            if (r10 == 0) goto L6e
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L6c
            goto L6e
        L6c:
            r10 = r0
            goto L6f
        L6e:
            r10 = r1
        L6f:
            java.lang.String r2 = ""
            if (r10 != 0) goto Lc8
            java.util.LinkedList r10 = bk4.f0.f103006i
            java.util.Iterator r10 = r10.iterator()
            r4 = r2
        L7a:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto Lb6
            java.lang.Object r5 = r10.next()
            pj4.p1 r5 = (pj4.p1) r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r4 = "index:"
            r6.append(r4)
            r6.append(r0)
            java.lang.String r4 = " , key:"
            r6.append(r4)
            long r7 = r5.f436784d
            r6.append(r7)
            java.lang.String r4 = " , configId:"
            r6.append(r4)
            java.lang.String r4 = r5.f436785e
            r6.append(r4)
            java.lang.String r4 = " .    "
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            int r0 = r0 + r1
            goto L7a
        Lb6:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "handleIconConfigListResult: "
            r10.<init>(r0)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r10)
        Lc8:
            pj4.m r10 = new pj4.m
            r10.<init>()
            java.util.LinkedList r0 = bk4.f0.f103006i
            r10.f436707d = r0
            bk4.n r0 = bk4.n.f103046a
            java.lang.String r0 = r0.d(r2)
            byte[] r10 = r10.mo14344x5f01b1f6()
            com.p314xaae8f345.mm.vfs.w6.R(r0, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bk4.f0.s(pj4.e1):void");
    }

    @Override // bk4.f
    public void t(pj4.e1 rsp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rsp, "rsp");
        pj4.p1 p1Var = rsp.f436564d;
        if (p1Var == null || p1Var.f436786f.size() == 0 || rsp.f436564d.f436787g.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusIconHelperV2", "handleIconConfigResult nochange");
            return;
        }
        long j17 = f103002e.f436784d;
        pj4.p1 p1Var2 = rsp.f436564d;
        long j18 = p1Var2.f436784d;
        f103002e = p1Var2;
        int R = com.p314xaae8f345.mm.vfs.w6.R(bk4.n.f103046a.e(""), p1Var2.mo14344x5f01b1f6());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("res:");
        sb6.append(R);
        sb6.append(" icon_configs.isNullOrEmpty():");
        java.util.LinkedList linkedList = rsp.f436567g;
        sb6.append(linkedList == null || linkedList.isEmpty());
        sb6.append(" handleIconConfigResult:");
        pj4.p1 icon_config = rsp.f436564d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(icon_config, "icon_config");
        sb6.append(bk4.g0.l(icon_config));
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusIconHelperV2", sb6.toString());
        if (R == 0) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TEXT_STATUS_LASTTIME_REQ_ICON_CONFIG_LONG, java.lang.Long.valueOf(c01.id.a()));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TEXT_STATUS_LAST_CLIENT_VERSION_INT, java.lang.Integer.valueOf(o45.wf.f424562g));
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6128x89a4de44 c6128x89a4de44 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6128x89a4de44();
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        am.xx xxVar = c6128x89a4de44.f136400g;
        xxVar.f89939a = valueOf;
        xxVar.f89940b = java.lang.Long.valueOf(j18);
        c6128x89a4de44.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e7, code lost:
    
        if (((r11 == null || (r11 = r11.f334873d) == null || r11.intValue() != 5) ? false : true) != false) goto L43;
     */
    @Override // bk4.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean u(pj4.e1 r10, ej4.e r11) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bk4.f0.u(pj4.e1, ej4.e):boolean");
    }

    @Override // bk4.f
    public void v() {
        pj4.k0 k0Var;
        pj4.p1 p1Var;
        java.lang.Object[] objArr = new java.lang.Object[2];
        pj4.e1 e1Var = f103001d;
        java.lang.Object obj = "";
        objArr[0] = (e1Var == null || (p1Var = e1Var.f436564d) == null) ? "" : java.lang.Long.valueOf(p1Var.f436784d);
        pj4.e1 e1Var2 = f103001d;
        if (e1Var2 != null && (k0Var = e1Var2.f436566f) != null) {
            obj = java.lang.Long.valueOf(k0Var.f436686d);
        }
        objArr[1] = obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusIconHelperV2", "lastRsp: icon_config.key: %s  key_value_config?.key:%s", objArr);
        pj4.e1 e1Var3 = f103001d;
        if (e1Var3 != null) {
            pm0.v.O("TextStatusThread", new bk4.c0(e1Var3));
        }
    }

    @Override // bk4.f
    public boolean w() {
        return true;
    }

    @Override // bk4.f
    public boolean x() {
        return false;
    }

    @Override // bk4.f
    public boolean y() {
        return true;
    }

    @Override // bk4.f
    public boolean z() {
        return false;
    }
}
