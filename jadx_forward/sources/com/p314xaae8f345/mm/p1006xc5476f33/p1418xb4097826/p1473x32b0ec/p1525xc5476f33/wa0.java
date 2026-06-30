package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class wa0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f196432p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f196433q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f196434r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedHashMap f196435s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedHashMap f196436t;

    /* renamed from: u, reason: collision with root package name */
    public km2.s f196437u;

    /* renamed from: v, reason: collision with root package name */
    public km2.s f196438v;

    /* renamed from: w, reason: collision with root package name */
    public int f196439w;

    /* renamed from: x, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f196440x;

    /* renamed from: y, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f196441y;

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pa0 f196442z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa0(android.view.ViewGroup root, qo0.c statusMonitor, r45.qt2 qt2Var) {
        super(root, statusMonitor, qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f196432p = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na0(root));
        this.f196433q = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oa0(root));
        this.f196434r = true;
        this.f196435s = new java.util.LinkedHashMap();
        this.f196436t = new java.util.LinkedHashMap();
        this.f196442z = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pa0(this);
        ((mm2.n6) P0(mm2.n6.class)).f410827g.mo523x53d8522f(java.lang.Boolean.valueOf(zl2.r4.f555483a.I0().getInt(y1(), 1) == 1));
    }

    public static final void t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wa0 wa0Var) {
        wa0Var.f196437u = null;
        wa0Var.f196438v = null;
        wa0Var.x1().setText("");
        java.lang.Object mo141623x754a37bb = ((jz5.n) wa0Var.f196433q).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((android.widget.TextView) mo141623x754a37bb).setText("");
        wa0Var.f196435s.clear();
        wa0Var.f196436t.clear();
        wa0Var.f196434r = true;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = wa0Var.f196440x;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pa0 pa0Var = wa0Var.f196442z;
        pa0Var.mo50303x856b99f0(1);
        pa0Var.mo50303x856b99f0(2);
    }

    public static final void u1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wa0 wa0Var, java.lang.String str, int i17, int i18, int i19) {
        wa0Var.getClass();
        boolean z17 = false;
        if (str.length() > 0) {
            km2.s sVar = i19 == 1 ? wa0Var.f196437u : wa0Var.f196438v;
            if (sVar != null && i17 == sVar.f390752c) {
                z17 = true;
            }
            if (z17) {
                if (sVar != null) {
                    sVar.f390751b = str;
                    sVar.f390753d = i18;
                    wa0Var.D1(sVar);
                    return;
                }
                return;
            }
            if (sVar != null) {
                java.lang.String str2 = sVar.f390751b;
                if (str2 == null) {
                    str2 = "";
                }
                int i27 = sVar.f390754e;
                if (i27 > 0) {
                    str2 = wa0Var.C1(str2, i27, str2.length());
                }
                (sVar.f390750a == 1 ? wa0Var.f196435s : wa0Var.f196436t).put(java.lang.Integer.valueOf(sVar.f390752c), str2);
            }
            km2.s sVar2 = new km2.s(i19, str, i17, i18, 0, 16, null);
            if (i19 == 2) {
                wa0Var.f196438v = sVar2;
            } else {
                wa0Var.f196437u = sVar2;
            }
            wa0Var.D1(sVar2);
        }
    }

    public final boolean A1(java.lang.String str, int i17) {
        return new android.text.StaticLayout(str, 0, str.length(), x1().getPaint(), this.f196439w, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() <= i17;
    }

    public final void B1(int i17, int i18, int i19) {
        int b17;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        if (i19 == 0) {
            return;
        }
        android.view.ViewGroup viewGroup = this.f446856d;
        int i27 = com.p314xaae8f345.mm.ui.bl.b(viewGroup.getContext()).y;
        if (x0()) {
            b17 = i65.a.b(viewGroup.getContext(), 16);
        } else {
            b17 = (((mm2.c1) P0(mm2.c1.class)).R7() ? i65.a.b(viewGroup.getContext(), 4) : i65.a.b(viewGroup.getContext(), 16)) + (i27 - (i18 + i19));
        }
        if (x0()) {
            this.f196439w = z1();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSubtitlePlugin", "requestLayout bottomMargin: " + b17 + " maxWidth: " + this.f196439w);
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = b17;
                marginLayoutParams.width = this.f196439w;
            }
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = b17;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSubtitlePlugin", "requestLayout bottomMargin: " + b17);
    }

    public final java.lang.String C1(java.lang.String str, int i17, int i18) {
        if (i17 >= str.length() || i18 > str.length()) {
            return "";
        }
        java.lang.String substring = str.substring(i17, i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        return substring;
    }

    public final void D1(km2.s sVar) {
        android.widget.TextView x17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pa0 pa0Var;
        jz5.l lVar;
        java.lang.String str;
        boolean z17;
        java.lang.String str2;
        if (sVar.f390750a == 2) {
            java.lang.Object mo141623x754a37bb = ((jz5.n) this.f196433q).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            x17 = (android.widget.TextView) mo141623x754a37bb;
        } else {
            x17 = x1();
        }
        int i17 = sVar.f390750a;
        java.util.LinkedHashMap linkedHashMap = i17 == 1 ? this.f196435s : this.f196436t;
        java.lang.String str3 = sVar.f390751b;
        java.lang.String str4 = str3 == null ? "" : str3;
        int i18 = sVar.f390754e;
        java.lang.String C1 = i18 > 0 ? C1(str4, i18, str4.length()) : str4;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            sb6.append((java.lang.String) ((java.util.Map.Entry) it.next()).getValue());
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        java.lang.String concat = sb7.concat(C1);
        int maxLines = x17.getMaxLines();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pa0 pa0Var2 = this.f196442z;
        pa0Var2.mo50303x856b99f0(i17);
        if (A1(concat, maxLines)) {
            x17.setText(w1(concat));
            return;
        }
        try {
            int length = concat.length();
            java.util.List g17 = new r26.t("(?<=\\u002e)|(?<=\\u002c)|(?<=\\u0020)|(?<=\\uff0c)|(?<=\\uff1f)|(?<=\\u3002)|(?<=\\uff1b)|(\n)|(\r)").g(concat, 0);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : g17) {
                if (((java.lang.String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            int i19 = size - 1;
            java.lang.String str5 = concat;
            while (true) {
                if (i19 <= 0) {
                    pa0Var = pa0Var2;
                    str = "";
                    z17 = false;
                    break;
                }
                pa0Var = pa0Var2;
                try {
                    java.lang.String g07 = kz5.n0.g0(arrayList.subList(0, i19), "", null, null, 0, "", null, 46, null);
                    if (A1(g07, maxLines)) {
                        str = kz5.n0.g0(arrayList.subList(i19, size), "", null, null, 0, "", null, 46, null);
                        str5 = g07;
                        z17 = true;
                        break;
                    } else {
                        i19--;
                        str5 = g07;
                        pa0Var2 = pa0Var;
                    }
                } catch (java.lang.Exception unused) {
                    lVar = new jz5.l("", "");
                    java.lang.String str6 = (java.lang.String) lVar.f384366d;
                    x17.setText(w1(str6));
                    sVar.f390754e = (r26.n0.P(str4, str6, 0, false, 6, null) + str6.length()) - sb7.length();
                    linkedHashMap.clear();
                    android.os.Message obtain = android.os.Message.obtain();
                    obtain.what = i17;
                    obtain.obj = lVar.f384367e;
                    pa0Var.mo50311x7ab51103(obtain, 1000L);
                }
            }
            if (z17) {
                str2 = str5;
            } else {
                int lineEnd = new android.text.StaticLayout(concat, 0, concat.length(), x1().getPaint(), this.f196439w, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineEnd(0);
                int i27 = lineEnd - 1;
                if (i27 > 0) {
                    lineEnd = i27;
                }
                java.lang.String substring = concat.substring(0, lineEnd);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                java.lang.String substring2 = concat.substring(lineEnd, length);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
                str = substring2;
                str2 = substring;
            }
            lVar = new jz5.l(str2, str);
        } catch (java.lang.Exception unused2) {
            pa0Var = pa0Var2;
        }
        java.lang.String str62 = (java.lang.String) lVar.f384366d;
        x17.setText(w1(str62));
        sVar.f390754e = (r26.n0.P(str4, str62, 0, false, 6, null) + str62.length()) - sb7.length();
        linkedHashMap.clear();
        android.os.Message obtain2 = android.os.Message.obtain();
        obtain2.what = i17;
        obtain2.obj = lVar.f384367e;
        pa0Var.mo50311x7ab51103(obtain2, 1000L);
    }

    public final void E1(java.lang.String str) {
        if (((mm2.n6) P0(mm2.n6.class)).f410826f && str != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((mm2.n6) P0(mm2.n6.class)).f410827g.mo3195x754a37bb(), java.lang.Boolean.FALSE) && !((mm2.c1) P0(mm2.c1.class)).T) {
            if (!(((mm2.n0) P0(mm2.n0.class)).f410806r)) {
                try {
                    p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                    this.f196440x = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(this, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.va0(this, str, null), 2, null);
                    return;
                } catch (java.lang.Exception e17) {
                    hc2.c.a(e17, "FinderLiveSubtitlePlugin, exception updateSubtitle msg: ".concat(str));
                    return;
                }
            }
        }
        if (!this.f196434r || str == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSubtitlePlugin", "updateSubtitle msg:" + str + ", disable subtitle!");
        this.f196434r = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        this.f196442z.mo50302x6b17ad39(null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void n1() {
        ((mm2.h7) P0(mm2.h7.class)).f410648g.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qa0(this));
        ((mm2.h7) P0(mm2.h7.class)).f410655q.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ra0(this));
        ((mm2.n6) P0(mm2.n6.class)).f410827g.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.sa0(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final void v1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSubtitlePlugin", "checkVisible enableSubtitle:" + ((mm2.n6) P0(mm2.n6.class)).f410826f);
        if (!((mm2.n6) P0(mm2.n6.class)).f410826f || ((mm2.c1) P0(mm2.c1.class)).T || ((mm2.n0) P0(mm2.n0.class)).f410806r) {
            return;
        }
        K0(0);
        if (!x0()) {
            android.view.ViewGroup viewGroup = this.f446856d;
            this.f196439w = (int) (com.p314xaae8f345.mm.ui.bl.b(viewGroup.getContext()).x - (viewGroup.getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) * 2));
        } else if (((mm2.c1) P0(mm2.c1.class)).ba()) {
            this.f196439w = z1();
        }
    }

    public final java.lang.String w1(java.lang.String str) {
        int i17 = 0;
        for (int i18 = 0; i18 < str.length(); i18++) {
            if (!java.util.regex.Pattern.compile("(?<=\\u002e)|(?<=\\u002c)|(?<=\\u0020)|(?<=\\uff0c)|(?<=\\uff1f)|(?<=\\u3002)|(?<=\\uff1b)|(\n)|(\r)").matcher(java.lang.String.valueOf(str.charAt(i18))).find()) {
                break;
            }
            i17++;
        }
        return C1(str, i17, str.length());
    }

    public final android.widget.TextView x1() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f196432p).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.TextView) mo141623x754a37bb;
    }

    public final java.lang.String y1() {
        return "Subtitle_" + ((mm2.e1) P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        super.z0();
        this.f196434r = true;
        ((mm2.n6) P0(mm2.n6.class)).f410828h = false;
    }

    public final int z1() {
        return ((int) (com.p314xaae8f345.mm.ui.bl.b(r0.getContext()).y * (((mm2.c1) P0(mm2.c1.class)).f410412s2 / ((mm2.c1) P0(mm2.c1.class)).f410418t2))) - i65.a.b(this.f446856d.getContext(), 32);
    }
}
