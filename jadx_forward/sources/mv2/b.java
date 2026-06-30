package mv2;

/* loaded from: classes10.dex */
public class b extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 f413077f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f413078g;

    /* renamed from: h, reason: collision with root package name */
    public final int f413079h;

    public /* synthetic */ b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(yj0Var, (i18 & 2) != 0 ? null : gVar, (i18 & 4) != 0 ? 0 : i17);
    }

    @Override // fp0.d
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var = this.f413077f;
        r45.et0 et0Var = yj0Var.f68953x27838069;
        bq.m mVar = new bq.m(yj0Var, et0Var != null ? (r45.qt2) et0Var.m75936x14adae67(7) : null, null, this.f413078g, this.f413079h);
        long a17 = c01.id.a() - (yj0Var.y0() * 1000);
        if (yj0Var.f68966x90b085b9 >= 2 || a17 >= 1200000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActionTask", "make fail tryNext " + yj0Var.t0() + " tryCount " + yj0Var.f68966x90b085b9 + " createTime: " + yj0Var.y0());
            yj0Var.f68965x29d3a50c = -1;
            ((c61.l7) i95.n0.c(c61.l7.class)).Ij().L0(yj0Var.f68961xf609be94, yj0Var, true);
            b(fp0.u.f346823f);
            return;
        }
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.U8).mo141623x754a37bb()).r()).booleanValue()) {
            e(4, com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14393xa0320ed6, "评论发表失败测试", null);
            return;
        }
        yj0Var.f68966x90b085b9++;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActionTask", "doAction " + yj0Var + ' ' + yj0Var + ".field_tryCount");
        ((c61.l7) i95.n0.c(c61.l7.class)).Ij().L0(yj0Var.f68961xf609be94, yj0Var, false);
        mVar.l().q(new mv2.a(this));
    }

    @Override // fp0.d
    public java.lang.String d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var = this.f413077f;
        sb6.append(yj0Var.f68955x2788aaf5);
        sb6.append('_');
        sb6.append(yj0Var.f68959xf9a02e3e);
        sb6.append('_');
        sb6.append(yj0Var.f68961xf609be94);
        return sb6.toString();
    }

    public void e(int i17, int i18, java.lang.String str, r45.ty0 ty0Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd ");
        sb6.append(i17);
        sb6.append(", ");
        sb6.append(i18);
        sb6.append(", ");
        sb6.append(str);
        sb6.append(", ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var = this.f413077f;
        sb6.append(yj0Var.f68961xf609be94);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActionTask", sb6.toString());
        if (i17 == 0 && i18 == 0) {
            ((c61.l7) i95.n0.c(c61.l7.class)).Ij().J0(yj0Var.f68961xf609be94);
            b(fp0.u.f346823f);
            return;
        }
        if (i17 == 4 && (i18 == -5002 || i18 == -5001 || i18 == -4007 || i18 == -4006)) {
            yj0Var.f68958xdad0d5ae = 2;
            java.lang.String str2 = "";
            if (i17 == 4 && (i18 == -4007 || i18 == -4006)) {
                if (str == null) {
                    str = "";
                }
                str2 = str;
            }
            yj0Var.f209928p1 = str2;
            yj0Var.f68965x29d3a50c = -1;
            ((c61.l7) i95.n0.c(c61.l7.class)).Ij().J0(yj0Var.f68961xf609be94);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.l Ij = ((c61.l7) i95.n0.c(c61.l7.class)).Ij();
            long j17 = yj0Var.f68959xf9a02e3e;
            long t07 = yj0Var.t0();
            long j18 = yj0Var.f68961xf609be94;
            l75.e0 e0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wj0.N;
            Ij.D0(j17, t07, j18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wj0.R, yj0Var);
        } else {
            if (i17 >= 4) {
                yj0Var.f68965x29d3a50c = -1;
                if (i18 == -4010) {
                    yj0Var.f68958xdad0d5ae = 1;
                }
            } else {
                yj0Var.f68963x4ae21932 = c01.id.a();
            }
            ((c61.l7) i95.n0.c(c61.l7.class)).Ij().L0(yj0Var.f68961xf609be94, yj0Var, false);
        }
        b(fp0.u.f346824g);
    }

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 action, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        this.f413077f = action;
        this.f413078g = gVar;
        this.f413079h = i17;
    }
}
