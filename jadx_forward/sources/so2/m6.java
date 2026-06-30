package so2;

/* loaded from: classes10.dex */
public final class m6 extends pf5.b0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f492017d;

    /* renamed from: e, reason: collision with root package name */
    public int f492018e;

    /* renamed from: f, reason: collision with root package name */
    public int f492019f;

    /* renamed from: g, reason: collision with root package name */
    public int f492020g;

    /* renamed from: h, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f492021h;

    public static final r45.bm2 N6(so2.m6 m6Var, r45.bm2 bm2Var) {
        java.util.LinkedList m75941xfb821914;
        m6Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209547x2;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue() != 1) {
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue() == 2) {
                return null;
            }
            return bm2Var;
        }
        if (bm2Var == null || (m75941xfb821914 = bm2Var.m75941xfb821914(15)) == null) {
            return bm2Var;
        }
        m75941xfb821914.clear();
        return bm2Var;
    }

    public static p3325xe03a0797.p3326xc267989b.r2 S6(so2.m6 m6Var, oz5.l lVar, p3325xe03a0797.p3326xc267989b.a1 a1Var, yz5.p pVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            lVar = oz5.m.f431862d;
        }
        if ((i17 & 2) != 0) {
            a1Var = p3325xe03a0797.p3326xc267989b.a1.DEFAULT;
        }
        return p3325xe03a0797.p3326xc267989b.l.c(m6Var.m158345xefc66565(), lVar, a1Var, pVar);
    }

    public final android.text.SpannableStringBuilder O6(int i17, android.content.Context context, java.lang.CharSequence dynamicDesc, java.util.List list, java.util.List list2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dynamicDesc, "dynamicDesc");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(dynamicDesc);
        sb6.length();
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(sb6);
        if (list != null && list2 != null) {
            int size = list2.size();
            for (int i18 = 0; i18 < size; i18++) {
                android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) list2.get(i18);
                if (drawable == null) {
                    drawable = R6(context, null, this.f492017d, this.f492018e, this.f492019f, false);
                }
                spannableStringBuilder.setSpan(new al5.w(drawable, 1), ((so2.y5) list.get(i18)).f492260b, ((so2.y5) list.get(i18)).f492261c + 1, 17);
            }
        }
        return spannableStringBuilder;
    }

    public final java.lang.String P6(r45.bm2 bm2Var, int i17, int i18, int i19) {
        java.lang.String m75945x2fec8307;
        java.lang.String m75945x2fec83072;
        if (i17 == 1) {
            m75945x2fec8307 = bm2Var.m75945x2fec8307(1);
            if (m75945x2fec8307 == null) {
                return "";
            }
        } else {
            if (i17 == 2) {
                java.lang.String m75945x2fec83073 = bm2Var.m75945x2fec8307(2);
                return m75945x2fec83073 != null ? r26.i0.t(m75945x2fec83073, "$$", java.lang.String.valueOf(i18), true) : "";
            }
            if (i17 != 3) {
                return (i17 == 5 && (m75945x2fec83072 = bm2Var.m75945x2fec8307(2)) != null) ? r26.i0.t(m75945x2fec83072, "$$", java.lang.String.valueOf(i19), true) : "";
            }
            m75945x2fec8307 = bm2Var.m75945x2fec8307(3);
            if (m75945x2fec8307 == null) {
                return "";
            }
        }
        return m75945x2fec8307;
    }

    public final java.lang.Object Q6(r45.bm2 bm2Var, android.content.Context context, java.lang.String str, r45.bm2 bm2Var2, int i17, int i18, int i19, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.y4 y4Var) {
        java.lang.CharSequence sb6;
        java.lang.Object obj;
        java.lang.String m75945x2fec8307;
        java.lang.String str2;
        int i27 = i17;
        java.util.Iterator it = bm2Var.m75941xfb821914(15).iterator();
        while (it.hasNext()) {
            r45.sl2 sl2Var = (r45.sl2) it.next();
            if (sl2Var.m75939xb282bd08(0) == i19) {
                int m75939xb282bd08 = sl2Var.m75939xb282bd08(1);
                if (m75939xb282bd08 == 0) {
                    return P6(bm2Var2, i19, i27, i18);
                }
                if (m75939xb282bd08 == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SyncGetImageModel", "item.type:" + sl2Var.m75939xb282bd08(1) + "  ConstantsFinder.FinderObjectDynamicConfig.DynamicItemType.TEXT:1");
                    return java.lang.String.valueOf(sl2Var.m75945x2fec8307(2));
                }
                if (m75939xb282bd08 != 2) {
                    return P6(bm2Var2, i19, i27, i18);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SyncGetImageModel", "item.type:" + sl2Var.m75939xb282bd08(1) + "  ConstantsFinder.FinderObjectDynamicConfig.DynamicItemType.RICH_TEXT:2");
                if (i19 == 5) {
                    i27 = i18;
                }
                java.lang.String m75945x2fec83072 = sl2Var.m75945x2fec8307(3);
                java.lang.String t17 = m75945x2fec83072 != null ? r26.i0.t(m75945x2fec83072, "$$", java.lang.String.valueOf(i27), true) : "";
                int m75939xb282bd082 = sl2Var.m75939xb282bd08(0);
                if (t17 instanceof android.text.SpannableString) {
                    sb6 = m75939xb282bd082 == 2 ? new android.text.SpannableStringBuilder(str).append((java.lang.CharSequence) t17) : new android.text.SpannableStringBuilder(str).append(' ').append((java.lang.CharSequence) t17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sb6);
                } else if (m75939xb282bd082 == 2) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append((java.lang.Object) str);
                    sb7.append((java.lang.Object) t17);
                    sb6 = sb7.toString();
                } else {
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                    sb8.append((java.lang.Object) str);
                    sb8.append(' ');
                    sb8.append((java.lang.Object) t17);
                    sb6 = sb8.toString();
                }
                java.lang.CharSequence charSequence = sb6;
                q26.n c17 = r26.t.c(new r26.t("<\\s*(?<name>\\w+)\\s*(?<attribute>\\w+)\\s*=\\s*(?<id>\\d+)\\s*/>"), charSequence, 0, 2, null);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                q26.l lVar = new q26.l((q26.m) c17);
                while (lVar.hasNext()) {
                    r26.m mVar = (r26.m) lVar.next();
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                    r26.q qVar = (r26.q) mVar;
                    sb9.append(qVar.c());
                    sb9.append("  ");
                    sb9.append(qVar.b());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SyncGetImageModel", sb9.toString());
                    if (qVar.a().size() == 4) {
                        arrayList.add(new so2.y5(java.lang.Integer.parseInt((java.lang.String) qVar.a().get(3)), qVar.b().f327742d, qVar.b().f327743e));
                    }
                }
                if (!(!arrayList.isEmpty())) {
                    ((so2.k6) y4Var).a(false, null);
                    return O6(i18, context, charSequence, arrayList, null);
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                int size = arrayList.size();
                int i28 = 0;
                while (i28 < size) {
                    int i29 = i28;
                    int i37 = size;
                    java.util.ArrayList arrayList4 = arrayList3;
                    java.util.ArrayList arrayList5 = arrayList;
                    arrayList2.add(R6(context, null, false, 0, -1, true));
                    int i38 = ((so2.y5) arrayList5.get(i29)).f492259a;
                    java.util.Iterator it6 = cu2.f0.f303926c.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it6.next();
                        if (((r45.rl2) obj).m75939xb282bd08(0) == i38) {
                            break;
                        }
                    }
                    r45.rl2 rl2Var = (r45.rl2) obj;
                    if (com.p314xaae8f345.mm.ui.bk.C()) {
                        if (rl2Var != null && (str2 = rl2Var.m75945x2fec8307(2)) != null) {
                        }
                        str2 = "";
                    } else {
                        if (rl2Var != null && (m75945x2fec8307 = rl2Var.m75945x2fec8307(1)) != null) {
                            str2 = m75945x2fec8307;
                        }
                        str2 = "";
                    }
                    arrayList4.add(str2);
                    i28 = i29 + 1;
                    arrayList3 = arrayList4;
                    arrayList = arrayList5;
                    size = i37;
                }
                java.util.List list = arrayList;
                android.text.SpannableStringBuilder O6 = O6(i18, context, charSequence, list, arrayList2);
                pf5.e.m158343xd39de650(this, null, null, new so2.h6(arrayList3, this, context, new so2.a6(this, i18, context, charSequence, list, y4Var), null), 3, null);
                return O6;
            }
        }
        return null;
    }

    public final android.graphics.drawable.Drawable R6(android.content.Context context, r45.rl2 rl2Var, boolean z17, int i17, int i18, boolean z18) {
        android.graphics.drawable.Drawable e17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (z18) {
            e17 = new android.graphics.drawable.ColorDrawable(0);
        } else {
            int i19 = z17 ? com.p314xaae8f345.mm.R.raw.f79745xc84de94e : com.p314xaae8f345.mm.R.raw.f80124xebd44b8e;
            int i27 = this.f492018e;
            if (i27 == 0) {
                i27 = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230);
            }
            e17 = com.p314xaae8f345.mm.ui.uk.e(context, i19, i27);
        }
        int i28 = this.f492019f;
        if (i28 == -1) {
            i28 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6.f185862p;
        }
        e17.setBounds(0, 0, i28, i28);
        return e17;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T6(android.widget.TextView r27, android.content.Context r28, java.lang.String r29, boolean r30, int r31, int r32, r45.bm2 r33, boolean r34, int r35, boolean r36, int r37) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: so2.m6.T6(android.widget.TextView, android.content.Context, java.lang.String, boolean, int, int, r45.bm2, boolean, int, boolean, int):java.lang.Object");
    }
}
