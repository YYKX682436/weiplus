package yr3;

/* loaded from: classes11.dex */
public final class l1 implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yr3.n1 f546458a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.u5 f546459b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f546460c;

    public l1(yr3.n1 n1Var, r45.u5 u5Var, java.lang.String str) {
        this.f546458a = n1Var;
        this.f546459b = u5Var;
        this.f546460c = str;
    }

    @Override // s40.t0
    /* renamed from: onLiveStatusCallback */
    public void mo44975x964762a2(long j17, int i17, java.lang.Object obj) {
        yr3.n1 n1Var = this.f546458a;
        if (j17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(n1Var.f546488f, "query fail, liveId = 0");
        }
        r45.u5 u5Var = this.f546459b;
        if (!u5Var.f468564f.equals(n1Var.f546490h.getTag(com.p314xaae8f345.mm.R.id.bph))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(n1Var.f546488f, "recycled");
            return;
        }
        java.lang.String str = "";
        if (obj != null && (obj instanceof r45.l71)) {
            r45.l71 l71Var = (r45.l71) obj;
            if (!x51.t1.b(l71Var.m75945x2fec8307(4))) {
                str = java.lang.String.valueOf(l71Var.m75945x2fec8307(4));
            }
        }
        if (x51.t1.b(str)) {
            n1Var.f546491i.setVisibility(8);
        } else {
            n1Var.f546491i.setVisibility(0);
            n1Var.f546491i.setText(str);
        }
        if (obj == null || !(obj instanceof r45.l71)) {
            return;
        }
        r45.l71 l71Var2 = (r45.l71) obj;
        if (((r45.nw1) l71Var2.m75936x14adae67(1)) != null) {
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).A(u5Var.f468564f, (r45.nw1) l71Var2.m75936x14adae67(1));
            eq1.h hVar = eq1.h.f337345a;
            r45.nw1 nw1Var = (r45.nw1) l71Var2.m75936x14adae67(1);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = n1Var.f546490h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22624x85d69039, "<get-leftTextTv>(...)");
            hVar.k(nw1Var, c22624x85d69039, this.f546460c);
        }
    }
}
