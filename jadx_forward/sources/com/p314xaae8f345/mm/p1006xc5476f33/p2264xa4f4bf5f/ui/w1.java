package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class w1 extends android.widget.FrameLayout implements bi4.s0 {

    /* renamed from: d, reason: collision with root package name */
    public final bi4.m0 f255918d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f255919e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f255920f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f255921g;

    /* renamed from: h, reason: collision with root package name */
    public final bi4.k1 f255922h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f255923i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f255924m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f255925n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f255926o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f255927p;

    /* renamed from: q, reason: collision with root package name */
    public ij4.i f255928q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f255929r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f255930s;

    /* renamed from: t, reason: collision with root package name */
    public int f255931t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w1(android.content.Context r3, android.util.AttributeSet r4, bi4.m0 r5, java.lang.String r6, java.util.ArrayList r7, boolean r8, bi4.k1 r9, int r10, p3321xbce91901.jvm.p3324x21ffc6bd.i r11) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1.<init>(android.content.Context, android.util.AttributeSet, bi4.m0, java.lang.String, java.util.ArrayList, boolean, bi4.k1, int, kotlin.jvm.internal.i):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCardFeedUIC */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782 m71898xc195e76b() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782) ((jz5.n) this.f255929r).mo141623x754a37bb();
    }

    /* renamed from: getIndicator */
    private final com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18621x6d4c961d m71899xd4fd2f59() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f255927p).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18621x6d4c961d) mo141623x754a37bb;
    }

    /* renamed from: getRecyclerView */
    private final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 m71900x4905e9fa() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f255925n).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) mo141623x754a37bb;
    }

    /* renamed from: getRvAdapter */
    private final com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.a m71901x656c9b5() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.a) ((jz5.n) this.f255926o).mo141623x754a37bb();
    }

    @Override // bi4.s0
    public void I5(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f255923i, "updateByStatusId: " + str);
    }

    public final boolean b() {
        return !(m71898xc195e76b() != null ? r0.f255318s : false);
    }

    @Override // bi4.s0
    public void b4(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f255923i, "update: db notify " + str);
        j(ai4.m0.f86706a.G().q(str));
    }

    public final void c(yz5.a aVar) {
        m71900x4905e9fa().post(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.k1(this, aVar));
    }

    public final void d(yz5.l matchFilter, yz5.l checkRefreshListCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matchFilter, "matchFilter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(checkRefreshListCallback, "checkRefreshListCallback");
        int size = m71901x656c9b5().I.size();
        java.lang.String str = this.f255923i;
        if (size <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "findDeleteStatusByFilter: no data");
            checkRefreshListCallback.mo146xb9724478(0);
            return;
        }
        int size2 = m71901x656c9b5().I.size();
        for (int i17 = 0; i17 < size2; i17++) {
            java.lang.Object obj = m71901x656c9b5().I.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            in5.c cVar = (in5.c) obj;
            if ((cVar instanceof ij4.d) && ((java.lang.Boolean) matchFilter.mo146xb9724478(((ij4.d) cVar).f373250d)).booleanValue()) {
                m71901x656c9b5().I.remove(cVar);
                if (((java.lang.Boolean) checkRefreshListCallback.mo146xb9724478(java.lang.Integer.valueOf(m71910x177830ff()))).booleanValue()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "findDeleteStatusByFilter: refresh pos=" + i17);
                    m71901x656c9b5().m8146xced61ae5();
                    this.f255930s = "";
                    h(m71907xfa36d49f());
                    return;
                }
                return;
            }
        }
    }

    public final void e(java.lang.String statusId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusId, "statusId");
        java.util.Iterator it = m71901x656c9b5().I.iterator();
        while (it.hasNext()) {
            in5.c cVar = (in5.c) it.next();
            if (cVar instanceof ij4.d) {
                ij4.d dVar = (ij4.d) cVar;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((mj4.k) dVar.f373250d).l(), statusId)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f255923i, "markStatusExpired[" + dVar.f373250d.hashCode() + "]: " + statusId + ", " + i17);
                    mj4.k kVar = (mj4.k) dVar.f373250d;
                    kVar.getClass();
                    mj4.j jVar = new mj4.j(kVar);
                    jVar.f408599b.put("field_ExpireTime", java.lang.Integer.valueOf(i17));
                    dVar.f373250d = jVar.a();
                    m71901x656c9b5().m8146xced61ae5();
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1) r3).m71906x73c2ac82()) == false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r7) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1.f(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x0186, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4 != null ? r4.f436672d : null, "15") != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r3, ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1) r4).m71906x73c2ac82()) == false) goto L180;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1.g(int, boolean):void");
    }

    /* renamed from: getAdapterConvertData */
    public final java.util.ArrayList<in5.c> m71902xdb53ff24() {
        return m71901x656c9b5().I;
    }

    /* renamed from: getCardEventListener */
    public final bi4.m0 m71903x49981788() {
        return this.f255918d;
    }

    /* renamed from: getContentView$plugin_textstatus_release */
    public final android.view.View m71904x23098797() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f255924m).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    /* renamed from: getCustomShowParam */
    public final bi4.k1 m71905x178658e9() {
        return this.f255922h;
    }

    /* renamed from: getIdentify */
    public final java.lang.String m71906x73c2ac82() {
        return java.lang.String.valueOf(hashCode());
    }

    /* renamed from: getInitScrollIndex */
    public final int m71907xfa36d49f() {
        if (m71910x177830ff() <= m71901x656c9b5().f255238J) {
            return 0;
        }
        return 1073741823 - (1073741823 % m71910x177830ff());
    }

    /* renamed from: getKeyForListenDB */
    public final java.lang.String m71908xfe54d85() {
        java.lang.Object Z = kz5.n0.Z(m71901x656c9b5().I);
        ij4.d dVar = Z instanceof ij4.d ? (ij4.d) Z : null;
        mj4.h hVar = dVar != null ? dVar.f373250d : null;
        java.lang.String o17 = hVar != null ? ((mj4.k) hVar).o() : "";
        java.lang.Boolean valueOf = hVar != null ? java.lang.Boolean.valueOf(((mj4.k) hVar).w()) : null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(o17, bk4.k1.a()) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, java.lang.Boolean.FALSE)) {
            return o17;
        }
        return null;
    }

    /* renamed from: getLikedStatusIdList */
    public final java.util.ArrayList<java.lang.String> m71909x2ab3ae82() {
        return this.f255920f;
    }

    /* renamed from: getRealDataSize */
    public final int m71910x177830ff() {
        return m71901x656c9b5().I.size();
    }

    /* renamed from: getScene */
    public final java.lang.String m71911x7520bed6() {
        return this.f255919e;
    }

    /* renamed from: getShouldMultipleStatusCardViewListenDB */
    public final boolean m71912x95e2eec5() {
        return this.f255921g;
    }

    public final void h(int i17) {
        this.f255931t = i17;
        int m71910x177830ff = m71910x177830ff();
        int m71910x177830ff2 = m71910x177830ff() == 0 ? 0 : i17 % m71910x177830ff();
        m71899xd4fd2f59().m71789x224b8bfe(m71910x177830ff2);
        java.lang.Object a07 = kz5.n0.a0(m71901x656c9b5().I, m71910x177830ff2);
        ij4.d dVar = a07 instanceof ij4.d ? (ij4.d) a07 : null;
        mj4.h hVar = dVar != null ? dVar.f373250d : null;
        this.f255930s = hVar != null ? ((mj4.k) hVar).l() : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f255923i, "refreshIndicator: to " + i17 + ", realPos=" + m71910x177830ff2 + ", realDataSize=" + m71910x177830ff + ", curDisplayStatusId=" + this.f255930s);
        if (m71910x177830ff > 1) {
            m71899xd4fd2f59().setVisibility(0);
        } else {
            m71899xd4fd2f59().setVisibility(8);
        }
    }

    public final void i(int i17, boolean z17, boolean z18) {
        java.lang.String str = "scrollToPosition: pos=" + i17 + ", itemCount=" + m71901x656c9b5().x();
        java.lang.String str2 = this.f255923i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        if (m71901x656c9b5().x() <= i17) {
            return;
        }
        int m71910x177830ff = m71910x177830ff() == 0 ? 0 : i17 % m71910x177830ff();
        java.lang.Object a07 = kz5.n0.a0(m71901x656c9b5().I, m71910x177830ff);
        ij4.d dVar = a07 instanceof ij4.d ? (ij4.d) a07 : null;
        mj4.h hVar = dVar != null ? dVar.f373250d : null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hVar != null ? ((mj4.k) hVar).l() : "", this.f255930s)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "scrollToPosition: statusId same=" + this.f255930s + ", realPos=" + m71910x177830ff + ", forceNotifyPageSettle=" + z17 + ", skip");
            if (z17) {
                g(i17, false);
                return;
            }
            return;
        }
        if (z18) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 m71900x4905e9fa = m71900x4905e9fa();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m71900x4905e9fa, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/MultipleStatusCardView", "scrollToPosition", "(IZZ)V", "Undefined", "smoothScrollToPosition", "(I)V");
            m71900x4905e9fa.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m71900x4905e9fa, "com/tencent/mm/plugin/textstatus/ui/MultipleStatusCardView", "scrollToPosition", "(IZZ)V", "Undefined", "smoothScrollToPosition", "(I)V");
        } else {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 m71900x4905e9fa2 = m71900x4905e9fa();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(m71900x4905e9fa2, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/MultipleStatusCardView", "scrollToPosition", "(IZZ)V", "Undefined", "scrollToPosition", "(I)V");
            m71900x4905e9fa2.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(m71900x4905e9fa2, "com/tencent/mm/plugin/textstatus/ui/MultipleStatusCardView", "scrollToPosition", "(IZZ)V", "Undefined", "scrollToPosition", "(I)V");
        }
        m71900x4905e9fa().post(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.t1(this, i17));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(java.util.List r14) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1.j(java.util.List):boolean");
    }

    public final void k() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782 m71898xc195e76b = m71898xc195e76b();
        if (m71898xc195e76b != null ? m71898xc195e76b.f255306d : false) {
            com.p314xaae8f345.mm.ui.kk.d(m71899xd4fd2f59(), i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561192bw));
            return;
        }
        int h17 = i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        java.lang.String str = this.f255919e;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "SCENE_MULTIPLE_DIALOG") && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "SCENE_MORE_TAB") && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "SCENE_CONTACT_PROFILE")) {
            h17 += com.p314xaae8f345.mm.ui.bl.c(getContext());
        }
        com.p314xaae8f345.mm.ui.kk.d(m71899xd4fd2f59(), h17);
    }
}
