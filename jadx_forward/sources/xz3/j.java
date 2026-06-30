package xz3;

/* loaded from: classes15.dex */
public final class j extends xz3.q implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: e, reason: collision with root package name */
    public final long f539761e;

    /* renamed from: f, reason: collision with root package name */
    public final sz3.n f539762f;

    /* renamed from: g, reason: collision with root package name */
    public final xz3.g f539763g;

    /* renamed from: h, reason: collision with root package name */
    public final int f539764h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f539765i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f539766m;

    public j(long j17, sz3.n request, xz3.g callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f539761e = j17;
        this.f539762f = request;
        this.f539763g = callback;
        this.f539766m = new java.util.ArrayList();
        this.f539764h = request.f495480d;
    }

    public final void a(int i17, int i18, java.lang.String str) {
        ((ku5.t0) ku5.t0.f394148d).B(new xz3.h(i17, this, i18, str));
        this.f539763g.j(this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.Integer valueOf = m1Var != null ? java.lang.Integer.valueOf(m1Var.hashCode()) : null;
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var2 = this.f539762f.f495482f;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, m1Var2 != null ? java.lang.Integer.valueOf(m1Var2.hashCode()) : null)) {
            this.f539782d = true;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("retrieval onSceneEnd errType: ");
            sb6.append(i17);
            sb6.append(", errCode: ");
            sb6.append(i18);
            sb6.append(", errMsg: ");
            sb6.append(str);
            sb6.append(", type: ");
            sb6.append(m1Var != null ? java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageRetrievalTask", sb6.toString());
            gm0.j1.d().q(5057, this);
            if (m1Var != null && m1Var.mo808xfb85f7b0() == 5057) {
                if (i17 != 0 || i18 != 0) {
                    a(this.f539764h, i18, str);
                    return;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.scanner.model.NetSceneBizAiScanImageRetrievalV2");
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.z) m1Var).f240641e.f152244b.f152233a;
                r45.cv5 cv5Var = fVar != null ? (r45.cv5) fVar : null;
                if (cv5Var != null) {
                    ((ku5.t0) ku5.t0.f394148d).B(new xz3.i(this, cv5Var, this.f539764h));
                    this.f539763g.j(this);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AiScanImageRetrievalTask", "AiScanImage onSceneEnd success resp null");
                    a(this.f539764h, i18, str);
                }
            }
        }
    }
}
