package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class ko {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ko f214053a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ko();

    /* renamed from: b, reason: collision with root package name */
    public static int f214054b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static int f214055c = 1;

    /* JADX WARN: Code restructure failed: missing block: B:156:0x01b2, code lost:
    
        if (r58 == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01b7, code lost:
    
        if (r56 == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x01ae, code lost:
    
        if (r9 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x01b9, code lost:
    
        r59 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x047b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0610  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ko r76, android.view.View r77, android.os.Bundle r78, boolean r79, yz5.l r80) {
        /*
            Method dump skipped, instructions count: 1963
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ko.a(com.tencent.mm.plugin.finder.view.ko, android.view.View, android.os.Bundle, boolean, yz5.l):void");
    }

    public void b(zy2.dc contact, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        ya2.b2 b2Var = (ya2.b2) contact;
        intent.putExtra("Username", b2Var.D0());
        intent.putExtra("Avatar", b2Var.m176700xe5e0d2a0());
        intent.putExtra("Nickname", b2Var.z0());
        r45.hz0 hz0Var = b2Var.f69309x26b3182a;
        intent.putExtra("Sex", hz0Var != null ? hz0Var.m75939xb282bd08(3) : 0);
        intent.putExtra("contactId", b2Var.f72763xa3c65b86);
        r45.hz0 hz0Var2 = b2Var.f69309x26b3182a;
        java.lang.String m75945x2fec8307 = hz0Var2 != null ? hz0Var2.m75945x2fec8307(1) : null;
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        intent.putExtra("Province", m75945x2fec8307);
        r45.hz0 hz0Var3 = b2Var.f69309x26b3182a;
        java.lang.String m75945x2fec83072 = hz0Var3 != null ? hz0Var3.m75945x2fec8307(2) : null;
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        intent.putExtra("City", m75945x2fec83072);
        r45.hz0 hz0Var4 = b2Var.f69309x26b3182a;
        if (hz0Var4 == null) {
            hz0Var4 = new r45.hz0();
        }
        java.lang.String m75945x2fec83073 = hz0Var4.m75945x2fec8307(0);
        intent.putExtra("Country", m75945x2fec83073 != null ? m75945x2fec83073 : "");
        intent.putExtra("Signature", b2Var.A0());
    }

    public final int c(int i17) {
        switch (i17) {
            case 0:
            default:
                return 0;
            case 1:
                return 7;
            case 2:
                return 4;
            case 3:
                return 3;
            case 4:
                return 2;
            case 5:
                return 5;
            case 6:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
            case 10:
            case 11:
            case 12:
                return 11;
            case 13:
            case 14:
            case 15:
                return 12;
            case 21:
                return 14;
        }
    }

    public final void d(android.content.Context context, int i17, boolean z17, long j17) {
        r45.qt2 qt2Var;
        java.lang.String Ri;
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            qt2Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        } else {
            qt2Var = null;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7159x1f557490 c7159x1f557490 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7159x1f557490();
        if (qt2Var == null || (Ri = qt2Var.m75945x2fec8307(0)) == null) {
            Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        }
        c7159x1f557490.f144639d = c7159x1f557490.b("sessionid", Ri, true);
        java.lang.String str2 = "";
        if (qt2Var == null || (str = qt2Var.m75945x2fec8307(1)) == null) {
            str = "";
        }
        c7159x1f557490.f144640e = c7159x1f557490.b("findercontextid", str, true);
        if (qt2Var != null && (m75945x2fec8307 = qt2Var.m75945x2fec8307(2)) != null) {
            str2 = m75945x2fec8307;
        }
        c7159x1f557490.f144646k = c7159x1f557490.b("clicktabcontextid", str2, true);
        c7159x1f557490.f144647l = c7159x1f557490.b("ref_commentscene", java.lang.String.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(7) : 0), true);
        c7159x1f557490.f144641f = c7159x1f557490.b("commentscene", "97", true);
        c7159x1f557490.f144645j = c7159x1f557490.b("udf_kv", "{\"scene\":" + i17 + '}', true);
        c7159x1f557490.f144642g = !z17 ? 1 : 0;
        c7159x1f557490.f144643h = c7159x1f557490.b("event_time", java.lang.String.valueOf(c01.id.c()), true);
        c7159x1f557490.f144648m = j17;
        c7159x1f557490.k();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zk(c7159x1f557490);
    }

    public final void e(java.lang.String field_username, android.os.Bundle bundle) {
        if (field_username == null || field_username.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderWxProfileHelper", "[saveMsgStrangerContact] msgUsername is null");
            return;
        }
        ya2.b2 b2Var = new ya2.b2();
        java.lang.String string = bundle.getString("Username", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        b2Var.f69347xdec927b = string;
        java.lang.String string2 = bundle.getString("Nickname", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        b2Var.f69328x21f9b213 = string2;
        int i17 = bundle.getInt("Sex", 0);
        r45.hz0 hz0Var = b2Var.f69309x26b3182a;
        if (hz0Var == null) {
            hz0Var = new r45.hz0();
        }
        hz0Var.set(3, java.lang.Integer.valueOf(i17));
        b2Var.f69309x26b3182a = hz0Var;
        java.lang.String string3 = bundle.getString("Signature", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        b2Var.f69341xda9bc3b3 = string3;
        java.lang.String string4 = bundle.getString("Province", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
        r45.hz0 hz0Var2 = b2Var.f69309x26b3182a;
        if (hz0Var2 == null) {
            hz0Var2 = new r45.hz0();
        }
        hz0Var2.set(1, string4);
        b2Var.f69309x26b3182a = hz0Var2;
        java.lang.String string5 = bundle.getString("City", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string5, "getString(...)");
        r45.hz0 hz0Var3 = b2Var.f69309x26b3182a;
        if (hz0Var3 == null) {
            hz0Var3 = new r45.hz0();
        }
        hz0Var3.set(2, string5);
        b2Var.f69309x26b3182a = hz0Var3;
        java.lang.String string6 = bundle.getString("Avatar", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string6, "getString(...)");
        b2Var.f69301x81118c51 = string6;
        java.lang.String string7 = bundle.getString("Country", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string7, "getString(...)");
        r45.hz0 hz0Var4 = b2Var.f69309x26b3182a;
        if (hz0Var4 == null) {
            hz0Var4 = new r45.hz0();
        }
        hz0Var4.set(0, string7);
        b2Var.f69309x26b3182a = hz0Var4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(field_username, "field_username");
        b2Var.f69347xdec927b = field_username;
        boolean z17 = b2Var.m176700xe5e0d2a0().length() == 0;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderWxProfileHelper", "nickname=" + b2Var.w0() + " avatarUrl is null. username=" + b2Var.D0());
        }
        ((c61.l7) i95.n0.c(c61.l7.class)).ik().J0(b2Var, !z17);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x095f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0924  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0911  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0903  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x090f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0921  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 f(android.content.Context r54, android.content.Intent r55, int r56, yz5.l r57) {
        /*
            Method dump skipped, instructions count: 2431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ko.f(android.content.Context, android.content.Intent, int, yz5.l):com.tencent.mm.plugin.finder.view.e3");
    }

    public void g(android.content.Context context, android.content.Intent intent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        f(context, intent, i17, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mn(context));
    }

    public final void h(android.view.View view) {
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.szm);
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.qht);
        android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.car);
        android.view.View findViewById4 = view.findViewById(com.p314xaae8f345.mm.R.id.cfi);
        android.view.View findViewById5 = view.findViewById(com.p314xaae8f345.mm.R.id.f565404sy0);
        if (!(findViewById2 != null && findViewById2.getVisibility() == 0)) {
            if (!(findViewById3 != null && findViewById3.getVisibility() == 0)) {
                if (!(findViewById4 != null && findViewById4.getVisibility() == 0)) {
                    if (!(findViewById5 != null && findViewById5.getVisibility() == 0)) {
                        if (findViewById == null) {
                            return;
                        }
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateLines", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateLines", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        return;
                    }
                }
            }
        }
        if (findViewById == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateLines", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateLines", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(android.view.View r26, android.os.Bundle r27) {
        /*
            Method dump skipped, instructions count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ko.i(android.view.View, android.os.Bundle):void");
    }

    public final void j(android.view.View view, android.os.Bundle bundle) {
        r45.nw6 nw6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ko koVar;
        int i17;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        char c17;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.Integer num;
        int i18;
        int i19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15294xd2025bfa c15294xd2025bfa;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc m76160xd133dfec;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
        r45.u13 u13Var;
        java.util.LinkedList m75941xfb821914;
        r45.so2 so2Var;
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.caq);
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.f567458jk2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15292x8a303c00 c15292x8a303c00 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15292x8a303c00) view.findViewById(com.p314xaae8f345.mm.R.id.car);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15294xd2025bfa c15294xd2025bfa2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15294xd2025bfa) view.findViewById(com.p314xaae8f345.mm.R.id.cfi);
        android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.szg);
        android.content.Context context = view.getContext();
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f8e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        c15292x8a303c00.m62093x53bfe316(string);
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f19);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        c15294xd2025bfa2.m62095x53bfe316(string2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String string3 = bundle != null ? bundle.getString("UserPreviewInfo", "") : null;
        if (string3 == null) {
            string3 = "";
        }
        if (string3.length() > 0) {
            r45.nw6 nw6Var2 = new r45.nw6();
            byte[] c18 = ot5.e.c(string3);
            if (c18 != null) {
                try {
                    nw6Var2.mo11468x92b714fd(c18);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                }
                nw6Var = nw6Var2;
            }
            nw6Var2 = null;
            nw6Var = nw6Var2;
        } else {
            nw6Var = null;
        }
        java.lang.String string4 = bundle != null ? bundle.getString("V5UserName", "") : null;
        java.lang.String str8 = string4 == null ? "" : string4;
        java.lang.String string5 = bundle != null ? bundle.getString("Nickname", "") : null;
        java.lang.String str9 = string5 == null ? "" : string5;
        if (bundle != null) {
            i17 = bundle.getInt("FromScene_WXPROFILE", 0);
            koVar = this;
        } else {
            koVar = this;
            i17 = 0;
        }
        int c19 = koVar.c(i17);
        int i27 = bundle != null ? bundle.getInt("key_entrance_type", -1) : -1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        if (nw6Var == null || (so2Var = (r45.so2) nw6Var.m75936x14adae67(8)) == null || (str = so2Var.m75945x2fec8307(3)) == null) {
            str = "";
        }
        if (nw6Var == null || (u13Var = (r45.u13) nw6Var.m75936x14adae67(5)) == null || (m75941xfb821914 = u13Var.m75941xfb821914(0)) == null) {
            str2 = str9;
            str3 = "";
        } else {
            str2 = str9;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
            for (java.util.Iterator it = m75941xfb821914.iterator(); it.hasNext(); it = it) {
                arrayList2.add(java.lang.String.valueOf(((r45.a04) it.next()).m75939xb282bd08(0)));
            }
            str3 = kz5.n0.g0(arrayList2, ",", null, null, 0, null, null, 62, null);
        }
        jz5.l[] lVarArr = new jz5.l[9];
        if (V6 != null) {
            str4 = str8;
            str5 = V6.m75945x2fec8307(0);
        } else {
            str4 = str8;
            str5 = null;
        }
        lVarArr[0] = new jz5.l("behaviour_session_id", str5);
        if (V6 != null) {
            c17 = 1;
            str6 = V6.m75945x2fec8307(1);
        } else {
            c17 = 1;
            str6 = null;
        }
        lVarArr[c17] = new jz5.l("finder_context_id", str6);
        lVarArr[2] = new jz5.l("finder_tab_context_id", V6 != null ? V6.m75945x2fec8307(2) : null);
        lVarArr[3] = new jz5.l("half_screen_source", java.lang.Integer.valueOf(i17));
        if (nw6Var == null || (c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) nw6Var.m75936x14adae67(0)) == null || (str7 = c19782x23db1cfa2.m76197x6c03c64c()) == null) {
            str7 = "";
        }
        lVarArr[4] = new jz5.l("author_finder_username", str7);
        lVarArr[5] = new jz5.l("poiid", str);
        lVarArr[6] = new jz5.l("module_report", str3);
        lVarArr[7] = new jz5.l("auth_type", java.lang.Integer.valueOf((nw6Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) nw6Var.m75936x14adae67(0)) == null || (m76160xd133dfec = c19782x23db1cfa.m76160xd133dfec()) == null) ? 0 : m76160xd133dfec.m76027x1cbb0791()));
        lVarArr[8] = new jz5.l("comment_scene", 97);
        java.util.Map k17 = kz5.c1.k(lVarArr);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(view, "wx_personal_card_half_screen");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(view, 32, 25496);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(view, k17);
        if (nw6Var != null) {
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.mlu);
            if (textView != null) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(textView, "wx_personal_card_letter_cell");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(textView, 40, 25496);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(textView, k17);
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            int i28 = i27;
            int i29 = i17;
            java.lang.String str10 = str2;
            java.lang.String str11 = str4;
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            h0Var.f391656d = "";
            if (((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) nw6Var.m75936x14adae67(0)) == null) {
                c15292x8a303c00.setVisibility(8);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                num = 0;
                i19 = 3;
                i18 = 1;
            } else {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(c15292x8a303c00, "wx_personal_card_finder_cell");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(c15292x8a303c00, 40, 25496);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(c15292x8a303c00, k17);
                c15292x8a303c00.setVisibility(0);
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                num = 0;
                arrayList5.add(null);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(findViewById2, arrayList5.toArray(), "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                i18 = 1;
                if (nw6Var.m75939xb282bd08(1) == 0) {
                    c15292x8a303c00.b(nw6Var);
                } else {
                    c15292x8a303c00.b(null);
                }
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) nw6Var.m75936x14adae67(0);
                java.lang.String m76197x6c03c64c = c19782x23db1cfa3 != null ? c19782x23db1cfa3.m76197x6c03c64c() : null;
                if (m76197x6c03c64c == null) {
                    m76197x6c03c64c = "";
                }
                h0Var.f391656d = m76197x6c03c64c;
                i19 = 3;
            }
            if (nw6Var.m75939xb282bd08(i19) == i18) {
                c15294xd2025bfa = c15294xd2025bfa2;
                c15294xd2025bfa.setVisibility(0);
                if (findViewById3 != null) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(num);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(findViewById3, arrayList6.toArray(), "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (c15292x8a303c00.getVisibility() == 0) {
                    c15294xd2025bfa.f212658f = null;
                    c15294xd2025bfa.b();
                } else {
                    r45.qw6 qw6Var = new r45.qw6();
                    java.util.LinkedList m75941xfb8219142 = qw6Var.m75941xfb821914(i18);
                    r45.d71 d71Var = (r45.d71) nw6Var.m75936x14adae67(4);
                    java.util.List m75941xfb8219143 = d71Var != null ? d71Var.m75941xfb821914(i18) : null;
                    if (m75941xfb8219143 == null) {
                        m75941xfb8219143 = kz5.p0.f395529d;
                    }
                    m75941xfb8219142.addAll(m75941xfb8219143);
                    c15294xd2025bfa.f212658f = qw6Var;
                    c15294xd2025bfa.b();
                }
            } else {
                c15294xd2025bfa = c15294xd2025bfa2;
                c15294xd2025bfa.setVisibility(8);
                if (findViewById3 != null) {
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    arrayList7.add(8);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(findViewById3, arrayList7.toArray(), "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            c15292x8a303c00.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ho(h0Var, i28, i29, nw6Var, c19, context));
            c15294xd2025bfa.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.io(str11, context, str10));
        }
    }

    public final void k(android.view.View view, android.os.Bundle bundle, yz5.l lVar) {
        int i17;
        int i18;
        java.lang.String str;
        int i19;
        java.lang.CharSequence charSequence;
        cq.k1.a();
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.k1().r()).booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15293x49fd1398 c15293x49fd1398 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15293x49fd1398) view.findViewById(com.p314xaae8f345.mm.R.id.f565404sy0);
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.u2_);
            java.lang.Boolean valueOf = bundle != null ? java.lang.Boolean.valueOf(bundle.getBoolean("showLikePrivacy", false)) : null;
            java.lang.Boolean valueOf2 = bundle != null ? java.lang.Boolean.valueOf(bundle.getBoolean("IsSelf", false)) : null;
            long j17 = bundle != null ? bundle.getLong("FeedId", 0L) : 0L;
            java.lang.String string = bundle != null ? bundle.getString("WxUserName", "") : null;
            int i27 = bundle != null ? bundle.getInt("isShieldHisLike", 0) : 0;
            int i28 = bundle != null ? bundle.getInt("isShieldMyLike", 0) : 0;
            if (c15293x49fd1398 != null) {
                jz5.l[] lVarArr = new jz5.l[2];
                lVarArr[0] = new jz5.l("thx_to_uin", string == null ? "" : string);
                lVarArr[1] = new jz5.l("feed_id", pm0.v.u(j17));
                i17 = i28;
                i18 = i27;
                str = "";
                hc2.v0.e(c15293x49fd1398, "friend_like_privilege_entry_button", 40, 0, false, false, kz5.c1.k(lVarArr), null, 92, null);
            } else {
                i17 = i28;
                i18 = i27;
                str = "";
            }
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf2, bool) || (((i19 = i18) == 0 && i17 == 0) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, bool))) {
                if (c15293x49fd1398 != null) {
                    c15293x49fd1398.setVisibility(8);
                }
                if (findViewById == null) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateWxProfileFinderHeartLikePermission", "(Landroid/view/View;Landroid/os/Bundle;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateWxProfileFinderHeartLikePermission", "(Landroid/view/View;Landroid/os/Bundle;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (c15293x49fd1398 != null) {
                c15293x49fd1398.setVisibility(0);
            }
            if (findViewById != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateWxProfileFinderHeartLikePermission", "(Landroid/view/View;Landroid/os/Bundle;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateWxProfileFinderHeartLikePermission", "(Landroid/view/View;Landroid/os/Bundle;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            java.lang.String str2 = str;
            java.lang.String string2 = bundle.getString("Username", str2);
            java.lang.String str3 = string2 == null ? str2 : string2;
            java.lang.String string3 = bundle.getString("SessionId", str2);
            int i29 = bundle.getInt("isNotRec", 0);
            int i37 = bundle.getInt("isBlackList", 0);
            int i38 = bundle.getInt("FromScene_WXPROFILE", 0);
            if (c15293x49fd1398 != null) {
                boolean z17 = i19 == 1;
                boolean z18 = i17 == 1;
                android.widget.TextView textView = c15293x49fd1398.f212655f;
                if (textView != null) {
                    if (z17 && z18) {
                        java.lang.String string4 = c15293x49fd1398.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574444og5);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
                        int K = r26.n0.K(string4, '#', 0, false, 6, null);
                        charSequence = c15293x49fd1398.c(c15293x49fd1398.c(string4, K), r26.n0.K(string4, '#', K + 1, false, 4, null));
                    } else if (z17) {
                        java.lang.String string5 = c15293x49fd1398.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.og7);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string5, "getString(...)");
                        charSequence = c15293x49fd1398.b(string5);
                    } else if (z18) {
                        java.lang.String string6 = c15293x49fd1398.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ogb);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string6, "getString(...)");
                        charSequence = c15293x49fd1398.b(string6);
                    } else {
                        charSequence = str2;
                    }
                    textView.setText(charSequence);
                }
            }
            if (c15293x49fd1398 != null) {
                c15293x49fd1398.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.jo(str3, string, i19, i17, i38, string3, i29, i37, lVar));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(android.view.View r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ko.l(android.view.View, android.os.Bundle):void");
    }
}
