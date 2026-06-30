package xe2;

/* loaded from: classes3.dex */
public final class n extends we2.x {

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f535416a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f535417b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f535418c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f535419d;

    public n(gk2.e liveContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f535416a = liveContext;
        this.f535417b = "LiveCommentMsgInterceptor";
        this.f535418c = true;
        this.f535419d = true;
        ae2.in inVar = ae2.in.f85221a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.R1).mo141623x754a37bb()).r()).intValue() == 0;
        this.f535418c = z17;
        boolean z18 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.S1).mo141623x754a37bb()).r()).intValue() == 0;
        this.f535419d = z18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveCommentMsgInterceptor", "saveMyselfCommentValue:" + z18 + ", sendLocalGiftToMsgValue :" + z17);
    }

    @Override // we2.x
    public boolean b(we2.b respWrapper) {
        java.util.ArrayList<r45.ch1> arrayList;
        java.util.ArrayList<r45.t12> arrayList2;
        int i17;
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        java.util.LinkedList m75941xfb8219143;
        java.util.LinkedList m75941xfb8219144;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(respWrapper, "respWrapper");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.r71 r71Var = respWrapper.f526747a;
        if (r71Var == null || (m75941xfb8219144 = r71Var.m75941xfb821914(14)) == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : m75941xfb8219144) {
                if (kz5.z.F(((we2.s) this.f535416a.a(we2.s.class)).f526788g.f(), ((r45.ch1) obj).m75939xb282bd08(1))) {
                    arrayList.add(obj);
                }
            }
        }
        if (!(arrayList != null && (arrayList.isEmpty() ^ true))) {
            arrayList = null;
        }
        if (arrayList != null) {
            for (r45.ch1 ch1Var : arrayList) {
                zl2.r4 r4Var = zl2.r4.f555483a;
                r4Var.M2(this.f535417b, "LiveCommentMsgInterceptor before extraFilter msg_type:" + ch1Var.m75939xb282bd08(1));
                if (ch1Var.m75939xb282bd08(1) == 20035) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f535417b, "[MMFinder_LiveAppMsg_Type_Location] msg = " + pm0.b0.g(ch1Var));
                }
                dk2.zf b17 = ((we2.s) this.f535416a.a(we2.s.class)).f526788g.b(ch1Var);
                if (b17 != null) {
                    if (!f(b17)) {
                        b17 = null;
                    }
                    if (b17 != null) {
                        r4Var.M2(this.f535417b, "LiveCommentMsgInterceptor after extraFilter msg_type:" + b17.mo124533xfb85f7b0());
                        if (!((mm2.c1) this.f535416a.a(mm2.c1.class)).Y6(b17)) {
                            linkedList.add(b17);
                            ((mm2.c1) this.f535416a.a(mm2.c1.class)).N6(b17);
                        }
                    }
                }
            }
        }
        r45.r71 r71Var2 = respWrapper.f526747a;
        if (r71Var2 != null && (m75941xfb8219143 = r71Var2.m75941xfb821914(14)) != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.m0.a(m75941xfb8219143).removeAll(linkedList);
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        r45.r71 r71Var3 = respWrapper.f526747a;
        if (r71Var3 == null || (m75941xfb8219142 = r71Var3.m75941xfb821914(2)) == null) {
            arrayList2 = null;
        } else {
            arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : m75941xfb8219142) {
                if (kz5.z.F(((we2.s) this.f535416a.a(we2.s.class)).f526788g.f(), ((r45.t12) obj2).m75939xb282bd08(3))) {
                    arrayList2.add(obj2);
                }
            }
        }
        if (!(arrayList2 != null && (arrayList2.isEmpty() ^ true))) {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            for (r45.t12 t12Var : arrayList2) {
                we2.s sVar = (we2.s) this.f535416a.a(we2.s.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t12Var);
                dk2.zf c17 = sVar.f526788g.c(t12Var);
                if (c17 != null) {
                    if (!f(c17)) {
                        c17 = null;
                    }
                    if (c17 != null && !((mm2.c1) this.f535416a.a(mm2.c1.class)).Y6(c17)) {
                        linkedList2.add(c17);
                        ((mm2.c1) this.f535416a.a(mm2.c1.class)).N6(c17);
                    }
                }
            }
        }
        r45.r71 r71Var4 = respWrapper.f526747a;
        if (r71Var4 != null && (m75941xfb821914 = r71Var4.m75941xfb821914(2)) != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.m0.a(m75941xfb821914).removeAll(linkedList2);
        }
        linkedList.addAll(linkedList2);
        kz5.g0.t(linkedList, new xe2.m());
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj3 : linkedList) {
            long m17 = ((dk2.zf) obj3).m();
            java.util.List list = ((mm2.x4) this.f535416a.a(mm2.x4.class)).f411066n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-cacheDataList>(...)");
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    if (((dk2.zf) it.next()).m() == m17) {
                        break;
                    }
                    i17++;
                }
            }
            if (i17 == -1) {
                arrayList3.add(obj3);
            }
        }
        linkedList3.addAll(arrayList3);
        e(linkedList3);
        return true;
    }

    public final void d(java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, dk2.zf zfVar) {
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb Bi = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.t2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.n6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.n6.class))).Bi(str, gVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f535417b, "[addMsgAfterEmojiLoaded] msgClientId = " + zfVar.v() + ", md5 = " + str + ", cdnUrl = " + ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) Bi).f68654xf47770e7);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.m0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5.class))).wi(Bi, new xe2.l(this, Bi, zfVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0168 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.util.LinkedList r14) {
        /*
            Method dump skipped, instructions count: 1035
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xe2.n.e(java.util.LinkedList):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x026f, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, xy2.c.e(r3)) != false) goto L128;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00c3 A[EDGE_INSN: B:156:0x00c3->B:157:0x00c3 BREAK  A[LOOP:0: B:124:0x0052->B:199:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[LOOP:0: B:124:0x0052->B:199:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0316  */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(dk2.zf r15) {
        /*
            Method dump skipped, instructions count: 919
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xe2.n.f(dk2.zf):boolean");
    }

    public final boolean g(java.lang.String str) {
        if (str == null) {
            return false;
        }
        if (!(str.length() > 0)) {
            str = null;
        }
        if (str == null) {
            return false;
        }
        java.util.List list = ((mm2.x4) this.f535416a.a(mm2.x4.class)).f411077y;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(list != null ? java.lang.Boolean.valueOf(list.contains(str)) : null, java.lang.Boolean.TRUE);
    }
}
