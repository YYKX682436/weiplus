package oc2;

/* loaded from: classes8.dex */
public final class n implements oc2.k {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f425759a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f425760b;

    /* renamed from: c, reason: collision with root package name */
    public volatile oc2.h f425761c;

    /* renamed from: d, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.p1451xc84b4196.C13738xbdff117b f425762d;

    /* renamed from: e, reason: collision with root package name */
    public volatile r45.fz2 f425763e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.util.List f425764f;

    public n(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f425759a = context;
        this.f425760b = jz5.h.b(oc2.m.f425757d);
    }

    public java.util.List a(r45.fz2 renderTmpl) {
        java.util.LinkedList linkedList;
        r45.cp5 cp5Var;
        java.util.LinkedList linkedList2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderTmpl, "renderTmpl");
        r45.cr4 cr4Var = renderTmpl.f456277g;
        java.util.LinkedList linkedList3 = cr4Var != null ? cr4Var.f453333d : null;
        boolean z17 = !(linkedList3 == null || linkedList3.isEmpty());
        if (z17) {
            linkedList = new java.util.LinkedList();
            r45.cr4 cr4Var2 = renderTmpl.f456277g;
            if (cr4Var2 != null && (linkedList2 = cr4Var2.f453333d) != null) {
                java.util.Iterator it = linkedList2.iterator();
                while (it.hasNext()) {
                    linkedList.addAll(((r45.bp5) it.next()).f452482e);
                }
            }
        } else {
            linkedList = renderTmpl.f456274d;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.Renderer", "analysisNodes isMultiLevelDslRender=" + z17 + " nodes:" + linkedList.size());
        java.util.LinkedList linkedList4 = new java.util.LinkedList();
        java.util.Iterator it6 = linkedList.iterator();
        while (true) {
            oc2.o oVar = null;
            while (it6.hasNext()) {
                cp5Var = (r45.cp5) it6.next();
                if (cp5Var.f453301d == 3) {
                    break;
                }
                oc2.o oVar2 = oVar;
                if (oVar2 != null) {
                    oVar2.f425770b.add(cp5Var);
                } else {
                    oVar = new oc2.o();
                    oVar.f425770b.add(cp5Var);
                    linkedList4.add(oVar);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.Renderer", "analysisNodes contextList :" + linkedList4.size());
            return linkedList4;
            oc2.o oVar3 = new oc2.o();
            oVar3.f425769a = cp5Var;
            linkedList4.add(oVar3);
        }
    }

    public boolean b() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207973a.K() ? ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f209965a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a, "发现页右侧DSL红点最大宽度是否考虑左侧数字红点宽度", e42.c0.clicfg_finder_entrance_cal_width_with_mention_entrance, 1, false, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ge0.f208366d, 8, null)).intValue() : ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207997r).mo141623x754a37bb()).r()).intValue()) == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b5, code lost:
    
        if (r7.b(r5.f425770b, r6.f425770b) == false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00be A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(oc2.h r11, java.util.List r12) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oc2.n.c(oc2.h, java.util.List):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e6 A[LOOP:0: B:48:0x008a->B:57:0x00e6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.ViewGroup d(java.lang.CharSequence r11, oc2.h r12, java.util.List r13, r45.fz2 r14, oc2.e r15) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oc2.n.d(java.lang.CharSequence, oc2.h, java.util.List, r45.fz2, oc2.e):android.view.ViewGroup");
    }
}
