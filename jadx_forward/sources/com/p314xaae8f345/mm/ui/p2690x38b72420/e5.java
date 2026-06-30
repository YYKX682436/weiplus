package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public final class e5 extends com.p314xaae8f345.mm.ui.p2690x38b72420.o4 implements o13.x {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f288215m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashSet f288216n;

    /* renamed from: o, reason: collision with root package name */
    public p13.c f288217o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f288218p;

    /* renamed from: q, reason: collision with root package name */
    public p13.r f288219q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f288220r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(com.p314xaae8f345.mm.ui.p2690x38b72420.l4 ui6, java.lang.String chatroom, int i17, boolean z17, java.util.HashSet blockSet) {
        super(ui6, z17, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatroom, "chatroom");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(blockSet, "blockSet");
        this.f288215m = chatroom;
        this.f288216n = blockSet;
        this.f288220r = jz5.h.b(com.p314xaae8f345.mm.ui.p2690x38b72420.c5.f288174d);
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        if (vVar != null) {
            if ((p3321xbce91901.jvm.p3324x21ffc6bd.o.b(vVar.f432690b, this.f288217o) ? vVar : null) != null) {
                int i17 = vVar.f432691c;
                if (i17 == -3 || i17 == -2 || i17 == -1) {
                    this.f288218p = null;
                    this.f288219q = null;
                    h();
                    com.p314xaae8f345.mm.ui.p2690x38b72420.n4 n4Var = this.f288584i;
                    if (n4Var != null) {
                        n4Var.d4(vVar.f432692d.f432662a, getCount(), true);
                    }
                    notifyDataSetChanged();
                    return;
                }
                if (i17 != 0) {
                    return;
                }
                java.util.List resultList = vVar.f432693e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resultList, "resultList");
                p13.y yVar = (p13.y) kz5.n0.a0(resultList, 0);
                if (yVar != null) {
                    yVar.f432736u = vVar.f432692d;
                } else {
                    yVar = null;
                }
                this.f288218p = yVar != null ? yVar.f432729n : null;
                this.f288219q = yVar != null ? yVar.f432736u : null;
                h();
                com.p314xaae8f345.mm.ui.p2690x38b72420.n4 n4Var2 = this.f288584i;
                if (n4Var2 != null) {
                    n4Var2.d4(vVar.f432692d.f432662a, getCount(), true);
                }
                notifyDataSetChanged();
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f288218p;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        p13.l lVar;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.m mVar = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.m(i17, this.f288611f);
        java.util.List list = this.f288218p;
        if (list != null && (lVar = (p13.l) kz5.n0.a0(list, i17)) != null) {
            mVar.F = lVar;
            mVar.f288382r = this.f288215m;
            mVar.A = this.f288219q;
        }
        return mVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public void k() {
        p13.c cVar = this.f288217o;
        if (cVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(cVar);
            this.f288217o = null;
        }
        this.f288218p = null;
        this.f288219q = null;
        h();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.o4
    public void r() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.o4
    public void s(java.lang.String str, int[] iArr, boolean z17) {
        w(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.Class<o13.z> r0 = o13.z.class
            r1 = 1
            r2 = 0
            r3 = 0
            if (r7 == 0) goto L54
            java.lang.CharSequence r4 = r26.n0.u0(r7)
            java.lang.String r4 = r4.toString()
            int r4 = r4.length()
            if (r4 <= 0) goto L17
            r4 = r1
            goto L18
        L17:
            r4 = r2
        L18:
            if (r4 == 0) goto L1b
            goto L1c
        L1b:
            r7 = r3
        L1c:
            if (r7 == 0) goto L54
            p13.u r4 = new p13.u
            r4.<init>()
            java.lang.String r5 = r6.f288215m
            r4.f432675d = r5
            r4.f432674c = r7
            r7 = 12
            r4.f432673b = r7
            jz5.g r7 = r6.f288220r
            jz5.n r7 = (jz5.n) r7
            java.lang.Object r7 = r7.mo141623x754a37bb()
            com.tencent.mm.sdk.platformtools.n3 r7 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) r7
            r4.f432685n = r7
            r4.f432684m = r6
            java.util.HashSet r7 = r4.f432681j
            java.util.HashSet r5 = r6.f288216n
            r7.addAll(r5)
            i95.m r7 = i95.n0.c(r0)
            o13.z r7 = (o13.z) r7
            r5 = 2
            com.tencent.mm.plugin.fts.d0 r7 = (com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) r7
            p13.c r7 = r7.sj(r5, r4)
            r6.f288217o = r7
            jz5.f0 r7 = jz5.f0.f384359a
            goto L55
        L54:
            r7 = r3
        L55:
            if (r7 != 0) goto L79
            p13.c r7 = r6.f288217o
            if (r7 == 0) goto L68
            i95.m r0 = i95.n0.c(r0)
            o13.z r0 = (o13.z) r0
            com.tencent.mm.plugin.fts.d0 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) r0
            r0.Ni(r7)
            r6.f288217o = r3
        L68:
            com.tencent.mm.ui.contact.n4 r7 = r6.f288584i
            if (r7 == 0) goto L71
            java.lang.String r0 = ""
            r7.d4(r0, r2, r1)
        L71:
            com.tencent.mm.ui.contact.d5 r7 = new com.tencent.mm.ui.contact.d5
            r7.<init>(r6)
            pm0.v.X(r7)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2690x38b72420.e5.w(java.lang.String):void");
    }
}
