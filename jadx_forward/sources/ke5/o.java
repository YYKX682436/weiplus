package ke5;

/* loaded from: classes9.dex */
public final class o implements he5.t {

    /* renamed from: a, reason: collision with root package name */
    public final he5.f f388643a;

    /* renamed from: b, reason: collision with root package name */
    public final hd5.n f388644b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f388645c;

    /* renamed from: d, reason: collision with root package name */
    public final hd5.q f388646d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f388647e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f388648f;

    public o(yb5.d chattingContext, he5.f coreDataSource, hd5.n action, android.os.Bundle bundle, hd5.q qVar, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingContext, "chattingContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coreDataSource, "coreDataSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        this.f388643a = coreDataSource;
        this.f388644b = action;
        this.f388645c = bundle;
        this.f388646d = qVar;
        this.f388647e = z17;
        chattingContext.x();
    }

    @Override // he5.t
    public int a() {
        he5.f fVar = this.f388643a;
        long a17 = fVar.a();
        fVar.f362460e.getClass();
        java.lang.String talker = fVar.f362456a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        yb5.d chattingContext = fVar.f362458c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingContext, "chattingContext");
        if (!c01.s0.c()) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().j7(talker);
        }
        int j76 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().j7(talker);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.c cVar = chattingContext.f542241c;
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) cVar.a(sb5.f.class))).getClass();
        int b17 = yq1.u0.Ai().b1(talker, a17);
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) cVar.a(sb5.f.class))).getClass();
        er1.b Ai = yq1.u0.Ai();
        Ai.getClass();
        java.lang.String y07 = Ai.y0(true);
        if (y07 == null) {
            y07 = "talker = ?";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(talker);
        arrayList.add(talker);
        if (a17 > 0) {
            y07 = y07.concat(" AND createTime > ?");
            arrayList.add(java.lang.String.valueOf(a17));
        }
        int i17 = 0;
        try {
            android.database.Cursor B = Ai.f337540d.B("SELECT COUNT(*) FROM BizContactConversationMassSend WHERE " + y07, (java.lang.String[]) arrayList.toArray(new java.lang.String[0]));
            if (B != null) {
                try {
                    int i18 = B.moveToFirst() ? B.getInt(0) : 0;
                    vz5.b.a(B, null);
                    i17 = i18;
                } finally {
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizContactConversationMassSendStorage", "getFilteredMessageCount error: " + e17.getMessage());
        }
        int i19 = (j76 - b17) + i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizContactMsgDataRepo", "getTotalCount: oldTableTotalCount=" + j76 + ", newTableTotalCount=" + b17 + ", newTableFilteredCount=" + i17 + ", totalCount=" + i19);
        return i19;
    }

    @Override // he5.t
    public void b(java.util.List list, he5.s success) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(success, "success");
        sd5.p.a("fillItem", new ke5.n(this, list));
        ((hd5.f) success).a();
    }

    @Override // he5.t
    public void c(hd5.o oVar) {
        if (oVar != null) {
            oVar.mo133232x338af3();
        }
    }

    @Override // he5.t
    /* renamed from: close */
    public void mo133462x5a5ddf8() {
    }

    @Override // he5.t
    public long d() {
        return this.f388643a.a();
    }
}
