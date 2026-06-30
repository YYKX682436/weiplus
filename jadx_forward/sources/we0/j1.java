package we0;

@j95.b
/* loaded from: classes11.dex */
public final class j1 extends i95.w implements xe0.l0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f526663d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f526664e;

    public j1() {
        this.f526664e = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2569xa4f4bf5f.p2572x26f8a610.C20730xaf6aabb5()) == 1;
    }

    public java.lang.CharSequence Ai(android.widget.TextView textView, java.lang.String str, java.lang.CharSequence displayName, bi4.c iconScene, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayName, "displayName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconScene, "iconScene");
        return Bi(textView, str, displayName, iconScene, f17, new xe0.v0());
    }

    public java.lang.CharSequence Bi(android.widget.TextView textView, java.lang.String userName, java.lang.CharSequence displayName, bi4.c iconScene, float f17, xe0.v0 attachExtraConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayName, "displayName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconScene, "iconScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attachExtraConfig, "attachExtraConfig");
        if (!(userName == null || userName.length() == 0)) {
            if ((displayName.length() == 0) || !ze0.a.f553286a.b(iconScene, userName)) {
                return displayName;
            }
            xe0.u0 u0Var = attachExtraConfig.f535355b;
            boolean z17 = attachExtraConfig.f535354a;
            android.view.View.OnClickListener onClickListener = attachExtraConfig.f535356c;
            xe0.m0 m0Var = u0Var != null ? u0Var.f535334b : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
            ze0.g gVar = z17 ? ze0.g.f553294f : !di4.i.d() ? ze0.g.f553294f : u0Var != null ? ze0.g.f553292d : ze0.g.f553293e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appendStatusSpan routing=");
            sb6.append(gVar);
            sb6.append(" forceUseOldSpan=");
            sb6.append(z17);
            sb6.append(" user=");
            sb6.append(userName);
            sb6.append(" scene=");
            sb6.append(iconScene);
            sb6.append(" styleNull=");
            sb6.append(u0Var == null);
            sb6.append(" newStyle=");
            sb6.append(di4.i.d());
            sb6.append(" onClickNull=");
            sb6.append(onClickListener == null);
            sb6.append(" position=");
            sb6.append(m0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusSpanAdapter", sb6.toString());
            int ordinal = gVar.ordinal();
            bi4.d dVar = bi4.d.OUTLINED;
            ak4.g gVar2 = ak4.g.f87158a;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    return ak4.g.b(gVar2, textView, userName, displayName, iconScene, ze0.h.f553296a.a((int) f17, iconScene), false, null, dVar, null, 256, null);
                }
                if (ordinal != 2) {
                    throw new jz5.j();
                }
                android.text.style.ImageSpan q17 = bk4.i.a().q(textView, userName, iconScene, (int) f17);
                if (q17 == null) {
                    return displayName;
                }
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(displayName);
                spannableStringBuilder.append((java.lang.CharSequence) " ");
                spannableStringBuilder.setSpan(q17, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 34);
                return spannableStringBuilder;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var);
            java.lang.CharSequence a17 = gVar2.a(textView, userName, displayName, iconScene, u0Var, onClickListener != null, onClickListener, dVar, m0Var == null ? xe0.m0.f535287d : m0Var);
            if (onClickListener == null || textView == null) {
                return a17;
            }
            java.util.WeakHashMap weakHashMap = ak4.l.f87188e;
            java.lang.Object obj = weakHashMap.get(textView);
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, bool)) {
                return a17;
            }
            textView.setClickable(true);
            textView.setOnTouchListener(new ak4.l());
            weakHashMap.put(textView, bool);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TSItemSpanTL", "installIfNeeded installed on TextView=".concat(textView.getClass().getSimpleName()));
            return a17;
        }
        return displayName;
    }

    public void Di(android.view.View view, java.lang.String viewId, int i17, xe0.o0 o0Var) {
        if (view != null) {
            if (!(viewId == null || viewId.length() == 0) && o0Var != null) {
                java.lang.String userName = o0Var.f535295d;
                if (!(userName.length() == 0)) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
                    qj4.m mVar = new qj4.m(o0Var);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
                    cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                    aVar.pk(view, viewId);
                    aVar.tk(view, "");
                    aVar.Vj(view, i17, new qj4.n(userName, mVar, viewId));
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextStatus.TextStatusFeatureService", "bindReportStatusIconEventFromSns: params error");
    }

    public java.lang.String Ni() {
        java.lang.String e17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().e(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2569xa4f4bf5f.C20709x53553f60());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getValue(...)");
        return e17;
    }

    public java.lang.String Ri() {
        java.lang.String e17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().e(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2569xa4f4bf5f.C20712x9a2b23a4());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getValue(...)");
        return e17;
    }

    public java.lang.String Ui(java.lang.String str) {
        mj4.h M = ai4.m0.f86706a.M(str);
        return M != null ? ((mj4.k) M).h() : "";
    }

    public java.lang.String Vi(java.lang.String str) {
        mj4.h M = str == null || r26.n0.N(str) ? null : ai4.m0.f86706a.M(str);
        return M != null ? ((mj4.k) M).l() : "";
    }

    public android.text.style.ReplacementSpan Zi(android.view.View view, java.lang.String str, bi4.c iconScene, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconScene, "iconScene");
        if (str == null || r26.n0.N(str)) {
            return null;
        }
        ze0.a aVar = ze0.a.f553286a;
        if (aVar.b(iconScene, str)) {
            return aVar.c(view, str, iconScene, f17);
        }
        return null;
    }

    public boolean aj(java.lang.String str) {
        if (bi4.v1.g()) {
            return (str == null || r26.n0.N(str) ? null : ai4.m0.f86706a.M(str)) != null;
        }
        return false;
    }

    public boolean bj() {
        return di4.i.d();
    }

    public void cj(android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a c22702xa9a9ae2a) {
        jz5.f0 f0Var;
        java.util.Objects.toString(context);
        java.util.Objects.toString(c22702xa9a9ae2a);
        if (context != null) {
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            uj4.e eVar = (uj4.e) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(uj4.e.class);
            if (eVar != null) {
                eVar.f509952f = new java.lang.ref.WeakReference(c22702xa9a9ae2a);
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TextStatus.TextStatusFeatureService", "putPullDownListView: context is null");
        }
    }

    public void fj(long j17, java.lang.String str) {
        qj4.s sVar = qj4.s.f445491a;
        if (str == null) {
            str = "";
        }
        qj4.s.l(sVar, j17, str, null, 0L, null, 0L, 60, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x002e, code lost:
    
        if ((r12.length() == 0) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0040, code lost:
    
        if ((r12.length() == 0) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0071, code lost:
    
        if (r13 == 11) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void hj(java.lang.String r12, long r13) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: we0.j1.hj(java.lang.String, long):void");
    }

    public void ij(android.content.Context context, long j17, java.lang.String actionResult, java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionResult, "actionResult");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        qj4.s.m(qj4.s.f445491a, context, j17, actionResult, null, 0L, 0L, 0L, 0L, null, userName, 0L, 1528, null);
    }

    public void mj(java.lang.String viewId, java.lang.String eventId, xe0.n0 n0Var) {
        if (!(viewId == null || viewId.length() == 0)) {
            if (!(eventId == null || eventId.length() == 0) && n0Var != null) {
                java.lang.String str = n0Var.f535291d;
                if (!(str.length() == 0)) {
                    java.lang.String str2 = n0Var.f535292e;
                    if (!(str2.length() == 0)) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
                        mj4.h M = ai4.m0.f86706a.M(str);
                        if (M == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextStatus.tsReport", "reportStatusIconChatCustomEvent: statusItem is null");
                            return;
                        }
                        mj4.k kVar = (mj4.k) M;
                        java.lang.String l17 = kVar.l();
                        boolean z17 = kVar.z();
                        jz5.l[] lVarArr = new jz5.l[7];
                        lVarArr[0] = new jz5.l("wx_username", str);
                        lVarArr[1] = new jz5.l("textstatusid", l17);
                        lVarArr[2] = new jz5.l("icon_style", java.lang.Integer.valueOf(di4.i.d() ? 2 : 1));
                        lVarArr[3] = new jz5.l("icon_read_type", java.lang.Integer.valueOf((z17 || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, en1.a.a())) ? 1 : 0));
                        lVarArr[4] = new jz5.l("chat_name", str2);
                        lVarArr[5] = new jz5.l("view_unique_id", n0Var.f535294g);
                        lVarArr[6] = new jz5.l("enter_sessionid", n0Var.f535293f);
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj(viewId, eventId, kz5.c1.l(lVarArr), 33629);
                        return;
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextStatus.TextStatusFeatureService", "reportStatusIconCustomEventFromChat: params error");
    }

    public void nj(java.lang.String viewId, java.lang.String eventId, xe0.o0 o0Var) {
        if (!(viewId == null || viewId.length() == 0)) {
            if (!(eventId == null || eventId.length() == 0) && o0Var != null) {
                java.lang.String str = o0Var.f535295d;
                if (!(str.length() == 0)) {
                    qj4.s sVar = qj4.s.f445491a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
                    mj4.h M = ai4.m0.f86706a.M(str);
                    if (M == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextStatus.tsReport", "reportStatusIconSnsCustomEvent: statusItem is null");
                        return;
                    } else {
                        mj4.k kVar = (mj4.k) M;
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj(viewId, eventId, sVar.j(o0Var, kVar.l(), kVar.z()), 33629);
                        return;
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextStatus.TextStatusFeatureService", "reportStatusIconCustomEventFromSns: params error");
    }

    public void oj(android.widget.ImageView imageView, java.lang.String str, bi4.d dVar, bi4.b bVar) {
        if (dVar == null || bVar == null) {
            return;
        }
        bk4.f.V(bk4.i.a(), imageView, str, dVar, bVar, null, false, false, 112, null);
    }

    public void pj(android.widget.TextView textView, java.lang.String str, bi4.c iconScene, bi4.d iconType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconScene, "iconScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconType, "iconType");
        qj(textView, str, iconScene, iconType, null);
    }

    public void qj(android.widget.TextView textView, java.lang.String str, bi4.c iconScene, bi4.d iconType, xe0.v0 v0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconScene, "iconScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconType, "iconType");
        if (textView != null) {
            if (str == null || r26.n0.N(str)) {
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setTextWithStatus: ");
            sb6.append(str);
            sb6.append(" scene=");
            sb6.append(iconScene);
            sb6.append(" attachExtraConfig=");
            sb6.append(v0Var != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusFeatureService", sb6.toString());
            ze0.a aVar = ze0.a.f553286a;
            if (aVar.b(iconScene, str)) {
                if (aVar.a(textView, str, iconScene, iconType, v0Var != null ? v0Var.f535355b : null, v0Var != null ? v0Var.f535356c : null)) {
                    return;
                }
                new ej4.v(str, textView, iconType, iconScene);
            }
        }
    }

    public void rj(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659 c21526xca364659, java.lang.String username, bi4.c iconScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconScene, "iconScene");
        if (c21526xca364659 != null) {
            boolean z17 = false;
            if (username == null || r26.n0.N(username)) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusFeatureService", "setTextWithStatus: NoMeasure " + username + " scene=" + iconScene);
            if (ze0.a.f553286a.b(iconScene, username)) {
                bi4.d dVar = bi4.d.OUTLINED;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
                if (di4.i.d()) {
                    ze0.f.f553291a.a(c21526xca364659, username, iconScene, dVar, false, 0, null, null, ze0.b.f553287d, ze0.c.f553288d);
                    z17 = true;
                }
                if (z17) {
                    return;
                }
                new ej4.x(username, c21526xca364659, iconScene);
            }
        }
    }

    public void sj(android.app.Activity activity, bi4.h1 h1Var) {
        if (activity != null && h1Var != null) {
            java.lang.String targetUserName = h1Var.f102582a;
            if (!r26.n0.N(targetUserName) && ai4.m0.f86706a.M(targetUserName) != null) {
                android.content.res.Configuration configuration = activity.getResources().getConfiguration();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(configuration, "getConfiguration(...)");
                if (configuration.orientation == 2) {
                    return;
                }
                if (!(1 == ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2569xa4f4bf5f.p2571xd2ae381c.C20725xee0a927d()))) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.j2 j2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.j2(activity, h1Var);
                    j2Var.show();
                    this.f526663d = new java.lang.ref.WeakReference(j2Var);
                    return;
                }
                we0.u0 u0Var = (we0.u0) ((xe0.c0) i95.n0.c(xe0.c0.class));
                u0Var.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetUserName, "targetUserName");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(u0Var.f526702d, "openFlutterStatusCardDialog: ".concat(targetUserName));
                java.util.Map l17 = kz5.c1.l(new jz5.l("status_card_scene", 1), new jz5.l("status_card_user_name", targetUserName));
                com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6 = new com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
                c10716x931597c6.f149651e = -1;
                c10716x931597c6.f149650d = 1;
                c10716x931597c6.f149653g = false;
                c10716x931597c6.f149656m = 0;
                c10716x931597c6.f149658o = false;
                u0Var.Ni(activity, "StatusCardDialog", l17, "com.tencent.mm.plugin.textstatus.ui.TextStatusNewActivity", c10716x931597c6);
                return;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showCardDialog: err, username=");
        sb6.append(h1Var != null ? h1Var.f102582a : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusFeatureService", sb6.toString());
    }

    public boolean tj(android.content.Context context, java.lang.String str) {
        if ((str == null || str.length() == 0) || context == null || !ai4.m0.f86706a.G().q(str).isEmpty()) {
            return false;
        }
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
        e4Var.f293309c = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jvy);
        e4Var.c();
        return true;
    }

    public void uj(java.lang.String str, java.lang.String str2, java.lang.Boolean bool, java.lang.Boolean bool2) {
        int i17;
        java.lang.String str3;
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = bool2.booleanValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateSelfTextStatus: ");
        sb6.append(str);
        sb6.append(", ");
        sb6.append(str2 != null ? java.lang.Integer.valueOf(str2.length()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusFeatureService", sb6.toString());
        if (!(str == null || str.length() == 0)) {
            if (!(str2 == null || str2.length() == 0)) {
                try {
                    pj4.b0 b0Var = new pj4.b0();
                    b0Var.mo11468x92b714fd(android.util.Base64.decode(str2, 0));
                    ai4.m0 m0Var = ai4.m0.f86706a;
                    str3 = "MicroMsg.TextStatus.TextStatusFeatureService";
                    try {
                        ai4.b.g(m0Var, bk4.k1.a(), str, b0Var, 0, null, 0L, 0.0f, null, null, false, 1016, null);
                        if (booleanValue) {
                            i17 = 0;
                            try {
                                ai4.b.s(m0Var, false, 1, null);
                                return;
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str3, th, "NetSceneGetProfile parse extfail id:" + str, new java.lang.Object[i17]);
                                return;
                            }
                        }
                        return;
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        i17 = 0;
                    }
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    i17 = 0;
                    str3 = "MicroMsg.TextStatus.TextStatusFeatureService";
                }
            }
        }
        if (!booleanValue2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusFeatureService", "updateSelfTextStatus: not checkDeleteSelf");
            return;
        }
        di4.i iVar = di4.i.f314315a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusFeatureService", "del self");
        ai4.m0.f86706a.G().n(bk4.k1.a());
    }

    public boolean vj(java.lang.String str) {
        boolean z17 = this.f526664e;
        return str == null ? z17 : z17 && qi4.v.f445321a.e(str) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.text.style.ImageSpan] */
    public void wi(android.widget.TextView textView, java.lang.String userName, float f17) {
        ak4.h hVar;
        android.graphics.drawable.Drawable drawable;
        if (textView != null) {
            boolean z17 = true;
            if (userName == null || r26.n0.N(userName)) {
                return;
            }
            if (!r26.n0.D(userName, "@", false, 2, null)) {
                bi4.c cVar = bi4.c.DEFAULT;
                if (userName != null && !r26.n0.N(userName)) {
                    z17 = false;
                }
                if (!z17) {
                    ze0.a aVar = ze0.a.f553286a;
                    if (aVar.b(cVar, userName)) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
                        android.text.style.ReplacementSpan c17 = aVar.c(null, userName, cVar, f17);
                        if (di4.i.d() && c17 != null && (c17 instanceof ak4.d)) {
                            hVar = new ak4.h((ak4.d) c17);
                        } else if (c17 instanceof android.text.style.ImageSpan) {
                            hVar = (android.text.style.ImageSpan) c17;
                        }
                        if (hVar != null && (drawable = hVar.getDrawable()) != null) {
                            textView.setCompoundDrawables(null, null, drawable, null);
                            return;
                        }
                    }
                }
                hVar = null;
                if (hVar != null) {
                    textView.setCompoundDrawables(null, null, drawable, null);
                    return;
                }
            }
            textView.setCompoundDrawables(null, null, null, null);
        }
    }
}
