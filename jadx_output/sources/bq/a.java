package bq;

/* loaded from: classes10.dex */
public final class a extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final r45.m81 f23473t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i17, int i18, java.lang.String username, boolean z17) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(username, "username");
        r45.m81 m81Var = new r45.m81();
        this.f23473t = m81Var;
        m81Var.set(6, java.lang.Integer.valueOf(i18));
        if (z17) {
            m81Var.set(9, 1);
        } else {
            bq.p0 p0Var = bq.q0.f23513t;
            if (p0Var.b()) {
                m81Var.set(10, com.tencent.mm.protobuf.g.b(bq.p0.e(p0Var, i17, i18, username, false, 8, null)));
                m81Var.set(9, 1);
            } else {
                m81Var.set(2, com.tencent.mm.protobuf.g.b(bq.p0.e(p0Var, i17, i18, username, false, 8, null)));
                m81Var.set(9, 0);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doScene, isNewType: ");
        sb6.append(bq.q0.f23513t.b());
        sb6.append(", pageBuffer: ");
        sb6.append(m81Var.getByteString(10) != null);
        sb6.append(", lastBuffer: ");
        sb6.append(m81Var.getByteString(2) != null);
        com.tencent.mars.xlog.Log.i("Cgi.FinderGetMentionList", sb6.toString());
        m81Var.set(4, java.lang.Integer.valueOf(i17 != 1 ? i17 != 2 ? 0 : 1 : 2));
        m81Var.set(3, username);
        m81Var.set(5, db2.t4.f228171a.a(978));
        B();
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.n81 resp = (r45.n81) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Cgi.FinderGetMentionList", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }

    public final void B() {
        r45.n81 n81Var = new r45.n81();
        n81Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) n81Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 978;
        lVar.f70664a = this.f23473t;
        lVar.f70665b = new r45.n81();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetmentionlist";
        p(lVar.a());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i17, int i18, java.lang.String username, java.lang.String wxUserName, com.tencent.mm.protobuf.g gVar) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(wxUserName, "wxUserName");
        r45.m81 m81Var = new r45.m81();
        this.f23473t = m81Var;
        m81Var.set(6, java.lang.Integer.valueOf(i18));
        m81Var.set(10, gVar);
        m81Var.set(9, 1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doScene, isNewType: ");
        sb6.append(bq.q0.f23513t.b());
        sb6.append(", pageBuffer: ");
        sb6.append(m81Var.getByteString(10) != null);
        sb6.append(", lastBuffer: ");
        sb6.append(m81Var.getByteString(2) != null);
        com.tencent.mars.xlog.Log.i("Cgi.FinderGetMentionList", sb6.toString());
        m81Var.set(4, java.lang.Integer.valueOf(i17 != 1 ? i17 != 2 ? 0 : 1 : 2));
        m81Var.set(3, username);
        m81Var.set(5, db2.t4.f228171a.a(978));
        m81Var.set(8, wxUserName);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("doScene, wx_username: ");
        sb7.append(wxUserName);
        sb7.append(", pageBuffer: ");
        sb7.append(m81Var.getByteString(10) != null);
        com.tencent.mars.xlog.Log.i("Cgi.FinderGetMentionList", sb7.toString());
        B();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i17, int i18, java.lang.String username, long j17, com.tencent.mm.protobuf.g gVar) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(username, "username");
        r45.m81 m81Var = new r45.m81();
        this.f23473t = m81Var;
        int i19 = 2;
        if (i17 == 1) {
            bq.p0 p0Var = bq.q0.f23513t;
        } else if (i17 != 2) {
            i19 = 0;
        } else {
            bq.p0 p0Var2 = bq.q0.f23513t;
            i19 = 1;
        }
        m81Var.set(4, java.lang.Integer.valueOf(i19));
        m81Var.set(6, java.lang.Integer.valueOf(i18));
        m81Var.set(3, username);
        m81Var.set(7, java.lang.Long.valueOf(j17));
        m81Var.set(10, gVar);
        m81Var.set(5, db2.t4.f228171a.a(978));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doScene, aggregatedRootMentionId: ");
        sb6.append(j17);
        sb6.append(", pageBuffer: ");
        sb6.append(m81Var.getByteString(10) != null);
        com.tencent.mars.xlog.Log.i("Cgi.FinderGetMentionList", sb6.toString());
        B();
    }
}
