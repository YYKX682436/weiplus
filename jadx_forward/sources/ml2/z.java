package ml2;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final ml2.x0 f409852a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.ref.WeakReference f409853b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.ref.WeakReference f409854c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f409855d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f409856e;

    /* renamed from: f, reason: collision with root package name */
    public int f409857f;

    /* renamed from: h, reason: collision with root package name */
    public int f409859h;

    /* renamed from: g, reason: collision with root package name */
    public long f409858g = -1;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f409860i = new java.util.HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashMap f409861j = new java.util.HashMap();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.HashMap f409862k = new java.util.HashMap();

    public z(ml2.x0 x0Var) {
        this.f409852a = x0Var;
    }

    public final java.lang.String a(so2.j5 j5Var, java.lang.String str, int i17, ml2.x1 x1Var, java.lang.String str2) {
        java.lang.String str3;
        long mo2128x1ed62e84 = j5Var.mo2128x1ed62e84();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String q17 = b52.b.q(mo2128x1ed62e84);
        java.util.HashMap hashMap = this.f409860i;
        if (hashMap.containsKey(q17)) {
            str3 = q17;
        } else {
            ml2.d0 d0Var = ml2.f0.A;
            nm5.c a17 = d0Var.a(j5Var);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(q17);
            java.lang.Object a18 = a17.a(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "$1(...)");
            long longValue = ((java.lang.Number) a18).longValue();
            java.lang.Object a19 = a17.a(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a19, "$2(...)");
            int intValue = ((java.lang.Number) a19).intValue();
            java.lang.String b17 = d0Var.b(j5Var);
            ml2.e0 e0Var = ml2.e0.f408902d;
            java.lang.Object a27 = a17.a(2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a27, "$3(...)");
            ml2.f0 f0Var = new ml2.f0(j5Var, str, i17, q17, mo2128x1ed62e84, longValue, x1Var, str2, intValue, b17, e0Var, false, ((java.lang.Boolean) a27).booleanValue(), 0, null, null, null, null, 0L, null, this.f409857f, this.f409858g, this.f409859h, null, null, null, 59760640, null);
            str3 = q17;
            hashMap.put(str3, f0Var);
            ml2.x0 x0Var = this.f409852a;
            if (x0Var != null) {
                ((ml2.b) x0Var).a(f0Var, false);
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
        return str3;
    }

    public final void b(java.util.ArrayList arrayList) {
        java.util.Iterator it = this.f409860i.entrySet().iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            java.util.Map.Entry entry = (java.util.Map.Entry) next;
            if (!arrayList.contains(entry.getKey())) {
                it.remove();
                if (this.f409852a != null) {
                    java.lang.Object value = entry.getValue();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "<get-value>(...)");
                }
            }
        }
    }

    public final void c(com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, ml2.x1 x1Var, java.lang.String str, boolean z17) {
        int w17;
        int y17;
        if (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff1 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) layoutManager;
            int[] iArr = new int[c1164x587b7ff1.f93453d];
            c1164x587b7ff1.u(iArr);
            int[] iArr2 = new int[c1164x587b7ff1.f93453d];
            c1164x587b7ff1.v(iArr2);
            w17 = java.lang.Math.min(iArr[0], iArr[1]);
            y17 = java.lang.Math.max(iArr2[0], iArr2[1]);
        } else {
            if (!(layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d)) {
                return;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) layoutManager;
            w17 = c1161x57298f5d.w();
            y17 = c1161x57298f5d.y();
        }
        int a07 = c22848x6ddd90cf.a0();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List m82898xfb7e5820 = c22848x6ddd90cf.m82898xfb7e5820();
        if ((true ^ m82898xfb7e5820.isEmpty()) && w17 <= y17) {
            while (true) {
                int i17 = w17 - a07;
                if (i17 < 0) {
                    i17 = w17;
                }
                if (i17 < m82898xfb7e5820.size() && i17 >= 0) {
                    so2.j5 j5Var = (so2.j5) m82898xfb7e5820.get(i17);
                    arrayList.add(a(j5Var, j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().m59299x6bf53a6c() : "", w17, x1Var, str));
                }
                if (w17 == y17) {
                    break;
                } else {
                    w17++;
                }
            }
        }
        b(arrayList);
        arrayList.clear();
    }

    public final void d(com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff1, ml2.x1 x1Var, java.lang.String str) {
        int i17;
        int i18;
        boolean z17;
        boolean z18;
        int i19;
        int i27;
        ml2.x1 x1Var2;
        java.lang.String str2;
        java.util.Iterator it;
        int i28;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff12 = c1164x587b7ff1;
        int[] iArr = new int[c1164x587b7ff12.f93453d];
        c1164x587b7ff12.u(iArr);
        int[] iArr2 = new int[c1164x587b7ff12.f93453d];
        c1164x587b7ff12.v(iArr2);
        int a07 = c22848x6ddd90cf.a0();
        boolean z19 = false;
        boolean z27 = true;
        int min = java.lang.Math.min(iArr[0], iArr[1]);
        int max = java.lang.Math.max(iArr2[0], iArr2[1]);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.List m82898xfb7e5820 = c22848x6ddd90cf.m82898xfb7e5820();
        boolean z28 = !m82898xfb7e5820.isEmpty();
        java.util.HashMap hashMap = this.f409860i;
        if (z28 && min <= max) {
            int i29 = min;
            while (true) {
                if (c1164x587b7ff12.mo7935xa188593e(i29) != null && m82898xfb7e5820.size() > (i17 = a07 + i29)) {
                    java.lang.Object obj = m82898xfb7e5820.get(i17);
                    if (obj instanceof so2.i1) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.util.Iterator it6 = ((so2.i1) obj).f491950e.iterator();
                        while (it6.hasNext()) {
                            so2.j5 j5Var = (so2.j5) it6.next();
                            long mo2128x1ed62e84 = j5Var.mo2128x1ed62e84();
                            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                            java.lang.String q17 = b52.b.q(mo2128x1ed62e84);
                            if (this.f409862k.containsKey(q17)) {
                                if (hashMap.containsKey(q17)) {
                                    it = it6;
                                    i28 = a07;
                                } else {
                                    ml2.d0 d0Var = ml2.f0.A;
                                    nm5.c a17 = d0Var.a(j5Var);
                                    it = it6;
                                    java.lang.String m76836x6c03c64c = j5Var instanceof so2.j1 ? ((so2.j1) j5Var).f491972d.m76836x6c03c64c() : "";
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(q17);
                                    i28 = a07;
                                    java.lang.Object a18 = a17.a(0);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "$1(...)");
                                    long longValue = ((java.lang.Number) a18).longValue();
                                    java.lang.Object a19 = a17.a(1);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a19, "$2(...)");
                                    int intValue = ((java.lang.Number) a19).intValue();
                                    java.lang.String b17 = d0Var.b(j5Var);
                                    ml2.e0 e0Var = ml2.e0.f408902d;
                                    java.lang.Object a27 = a17.a(2);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a27, "$3(...)");
                                    ml2.f0 f0Var = new ml2.f0(j5Var, m76836x6c03c64c, i29, q17, mo2128x1ed62e84, longValue, x1Var, str, intValue, b17, e0Var, ((java.lang.Boolean) a27).booleanValue(), false, 0, null, null, null, null, 0L, null, this.f409857f, this.f409858g, this.f409859h, null, null, null, 59764736, null);
                                    if (j5Var instanceof so2.m1) {
                                        f0Var.f408935g = ml2.x1.f409734e;
                                    }
                                    hashMap.put(q17, f0Var);
                                    ml2.x0 x0Var = this.f409852a;
                                    if (x0Var != null) {
                                        ((ml2.b) x0Var).a(f0Var, false);
                                    }
                                }
                                arrayList3.add(q17);
                                it6 = it;
                                a07 = i28;
                            } else {
                                arrayList4.add(q17);
                            }
                        }
                        i18 = a07;
                        nm5.b c17 = nm5.j.c(arrayList3, arrayList4);
                        z17 = false;
                        arrayList.addAll((java.util.Collection) c17.a(0));
                        z18 = true;
                        arrayList2.addAll((java.util.Collection) c17.a(1));
                        i27 = i29;
                    } else {
                        i18 = a07;
                        z17 = z19;
                        z18 = z27;
                        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                            java.lang.String m59299x6bf53a6c = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj).getFeedObject().m59299x6bf53a6c();
                            ml2.q1 q1Var = ml2.q1.f409345e;
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "temp_10")) {
                                x1Var2 = ml2.x1.f409735f;
                                str2 = "15";
                            } else {
                                x1Var2 = x1Var;
                                str2 = str;
                            }
                            i19 = i29;
                            arrayList.add(a((so2.j5) obj, m59299x6bf53a6c, i29, x1Var2, str2));
                        } else {
                            i19 = i29;
                            if ((obj instanceof so2.j5 ? (so2.j5) obj : null) != null) {
                                arrayList.add(a((so2.j5) obj, "", i19, x1Var, str));
                            }
                        }
                        i27 = i19;
                    }
                } else {
                    i27 = i29;
                    i18 = a07;
                    z17 = z19;
                    z18 = z27;
                }
                if (i27 == max) {
                    break;
                }
                i29 = i27 + 1;
                z19 = z17;
                z27 = z18;
                a07 = i18;
                c1164x587b7ff12 = c1164x587b7ff1;
            }
        }
        java.util.Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            hashMap.remove((java.lang.String) it7.next());
        }
        b(arrayList);
        arrayList.clear();
        arrayList2.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x012d A[LOOP:1: B:27:0x0050->B:41:0x012d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013a A[EDGE_INSN: B:42:0x013a->B:6:0x013a BREAK  A[LOOP:1: B:27:0x0050->B:41:0x012d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(zy2.fc r26, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 r27, ml2.x1 r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ml2.z.e(zy2.fc, androidx.recyclerview.widget.StaggeredGridLayoutManager, ml2.x1, java.lang.String):void");
    }
}
