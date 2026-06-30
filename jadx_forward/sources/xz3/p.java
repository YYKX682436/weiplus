package xz3;

/* loaded from: classes15.dex */
public final class p extends xz3.q implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: e, reason: collision with root package name */
    public final long f539778e;

    /* renamed from: f, reason: collision with root package name */
    public final sz3.p f539779f;

    /* renamed from: g, reason: collision with root package name */
    public final xz3.m f539780g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f539781h;

    public p(long j17, sz3.p request, xz3.m callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f539778e = j17;
        this.f539779f = request;
        this.f539780g = callback;
    }

    public void a(sz3.p request, sz3.w0 productItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productItem, "productItem");
        productItem.f495664b = request.f495480d;
        productItem.f495665c = request.f495479c;
        productItem.f495666d = request.f495477a;
        productItem.f495667e = request.f495478b;
    }

    public final void b(int i17, int i18, int i19, java.lang.String str, java.util.List list) {
        ((ku5.t0) ku5.t0.f394148d).B(new xz3.n(i17, this, list, i18, i19, str));
        this.f539780g.j(this);
        if (i19 == 10003) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1 d1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240376a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanFastFocusEngineManager", "disableDetectingByServerAsNoModel");
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240382g = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1 d1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240376a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240383h = true;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.ArrayList arrayList;
        java.lang.Integer valueOf = m1Var != null ? java.lang.Integer.valueOf(m1Var.hashCode()) : null;
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var2 = this.f539779f.f495482f;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, m1Var2 != null ? java.lang.Integer.valueOf(m1Var2.hashCode()) : null)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("uploadImage onSceneEnd errType: ");
            sb6.append(i17);
            sb6.append(", errCode: ");
            sb6.append(i18);
            sb6.append(", errMsg: ");
            sb6.append(str);
            sb6.append(", type: ");
            sb6.append(m1Var != null ? java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageUploadTask", sb6.toString());
            gm0.j1.d().q(5105, this);
            if (m1Var != null && m1Var.mo808xfb85f7b0() == 5105) {
                this.f539782d = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.x xVar = m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.x ? (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.x) m1Var : null;
                if (xVar == null || (arrayList = xVar.f240626f) == null) {
                    arrayList = new java.util.ArrayList();
                }
                java.util.ArrayList arrayList2 = arrayList;
                if (i17 != 0 || i18 != 0) {
                    b(this.f539779f.f495480d, i17, i18, str, arrayList2);
                    return;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.scanner.model.NetSceneAiScanImageV2");
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.x) m1Var).f240625e.f152244b.f152233a;
                r45.fv5 fv5Var = fVar != null ? (r45.fv5) fVar : null;
                if (fv5Var != null) {
                    ((ku5.t0) ku5.t0.f394148d).B(new xz3.o(this.f539779f.f495480d, this, fv5Var, arrayList2, str));
                    this.f539780g.j(this);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AiScanImageUploadTask", "AiScanImage onSceneEnd success resp null");
                    b(this.f539779f.f495480d, i17, i18, str, arrayList2);
                }
            }
        }
    }
}
