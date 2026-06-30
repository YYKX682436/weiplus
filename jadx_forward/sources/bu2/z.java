package bu2;

/* loaded from: classes2.dex */
public abstract class z {

    /* renamed from: a */
    public static final kk.l f106111a = new kk.l(200);

    public static final int a(android.util.Size size, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(size, "<this>");
        if (i17 <= 0) {
            return 0;
        }
        int height = (z17 || size.getWidth() <= 0) ? (int) ((i17 * 3.5d) / 3) : (size.getHeight() * i17) / size.getWidth();
        float f17 = height;
        float f18 = i17;
        float f19 = 1.3166667f * f18;
        if (f17 > f19) {
            return (int) f19;
        }
        float f27 = f18 * 0.95f;
        if (f17 >= f27) {
            return height;
        }
        int i18 = (int) f27;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderExt", "calculateStaggeredLayoutParams: originWidth:" + i17 + " targetHeightL:" + i18);
        return i18;
    }

    public static final long b(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725) {
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c19792x256d2725, "<this>");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d2725.m76802x2dd01666();
        if (m76802x2dd01666 == null || (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) == null || (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) == null) {
            return 0L;
        }
        return c19788xd7cfd73e.m76629x36bbd779() * 1000;
    }

    public static final java.lang.String c(java.lang.String str) {
        java.lang.Object obj;
        if (str == null) {
            return "";
        }
        kk.l lVar = f106111a;
        synchronized (lVar) {
            obj = lVar.get(str);
        }
        if (obj == null) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
            obj = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes());
            synchronized (lVar) {
                lVar.j(str, obj);
            }
        }
        java.lang.String str2 = (java.lang.String) obj;
        return str2 == null ? "" : str2;
    }

    public static final bu2.h0 d(java.util.List list, java.lang.String source, boolean z17) {
        r45.mb4 mb4Var;
        int i17;
        float m75938x746dc8a6;
        float m75938x746dc8a62;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        r45.mb4 mb4Var2 = (r45.mb4) kz5.n0.Z(list);
        if (mb4Var2 == null) {
            return new bu2.h0(0.75f, 0, 0, null, list);
        }
        java.util.Iterator it = list.iterator();
        loop0: while (true) {
            mb4Var = mb4Var2;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                mb4Var2 = (r45.mb4) it.next();
                if (!(mb4Var2.m75938x746dc8a6(4) == 0.0f)) {
                    if ((mb4Var.m75938x746dc8a6(4) == 0.0f ? 1 : 0) != 0) {
                        continue;
                    } else {
                        if ((mb4Var.m75938x746dc8a6(5) * 1.0f) / mb4Var.m75938x746dc8a6(4) < (mb4Var2.m75938x746dc8a6(5) * 1.0f) / mb4Var2.m75938x746dc8a6(4)) {
                            break;
                        }
                    }
                }
            }
        }
        if (z17) {
            r45.gn2 gn2Var = (r45.gn2) mb4Var.m75936x14adae67(45);
            if (gn2Var != null && gn2Var.m75933x41a8a7f2(1)) {
                float m75938x746dc8a63 = mb4Var.m75938x746dc8a6(5);
                r45.gn2 gn2Var2 = (r45.gn2) mb4Var.m75936x14adae67(45);
                float m75938x746dc8a64 = m75938x746dc8a63 * (gn2Var2 != null ? gn2Var2.m75938x746dc8a6(3) : 1.0f);
                float m75938x746dc8a65 = mb4Var.m75938x746dc8a6(5);
                r45.gn2 gn2Var3 = (r45.gn2) mb4Var.m75936x14adae67(45);
                float m75938x746dc8a66 = m75938x746dc8a65 * (gn2Var3 != null ? gn2Var3.m75938x746dc8a6(4) : 1.0f);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderExt", "getMaxMediaHWRadio: top=" + m75938x746dc8a64 + ", bottom=" + m75938x746dc8a66 + ", mediaWidth=" + mb4Var.m75938x746dc8a6(4) + ", mediaHeight=" + mb4Var.m75938x746dc8a6(5) + ", source=" + source);
                m75938x746dc8a6 = m75938x746dc8a66 - m75938x746dc8a64;
                i17 = 1;
                m75938x746dc8a62 = (1.0f * m75938x746dc8a6) / mb4Var.m75938x746dc8a6(4);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderExt", "getMaxMediaHWRadio: source=" + source + ", checkScaleInfo=" + z17 + ", case=" + i17 + ", resultRadio=" + m75938x746dc8a62);
                return new bu2.h0(m75938x746dc8a62, (int) m75938x746dc8a6, (int) mb4Var.m75938x746dc8a6(4), mb4Var, list);
            }
        }
        m75938x746dc8a6 = mb4Var.m75938x746dc8a6(5);
        m75938x746dc8a62 = (mb4Var.m75938x746dc8a6(5) * 1.0f) / mb4Var.m75938x746dc8a6(4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderExt", "getMaxMediaHWRadio: source=" + source + ", checkScaleInfo=" + z17 + ", case=" + i17 + ", resultRadio=" + m75938x746dc8a62);
        return new bu2.h0(m75938x746dc8a62, (int) m75938x746dc8a6, (int) mb4Var.m75938x746dc8a6(4), mb4Var, list);
    }

    public static final float e(java.util.List list, java.lang.String source, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        return d(list, source, z17).f106049a;
    }

    public static /* synthetic */ float f(java.util.List list, java.lang.String str, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        return e(list, str, z17);
    }

    public static final android.util.Size g(r45.mb4 mb4Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mb4Var, "<this>");
        return new android.util.Size((int) mb4Var.m75938x746dc8a6(4), (int) mb4Var.m75938x746dc8a6(5));
    }

    public static final java.util.LinkedList h(java.util.LinkedList linkedList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(linkedList, "<this>");
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            linkedList2.add(i((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) it.next()));
        }
        return linkedList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x02b4, code lost:
    
        if (r2 != false) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final r45.mb4 i(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e r11) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bu2.z.i(com.tencent.mm.protocal.protobuf.FinderMedia):r45.mb4");
    }
}
