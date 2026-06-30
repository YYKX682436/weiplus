package e23;

/* loaded from: classes11.dex */
public class r1 extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.s1 f328487b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(e23.s1 s1Var) {
        super(s1Var);
        this.f328487b = s1Var;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        e23.q1 q1Var = (e23.q1) eVar;
        e23.s1 s1Var = (e23.s1) gVar;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.j(q1Var.f328477a, this.f328487b.f505294d);
        java.lang.String str = s1Var.f328493s;
        if (str == null || str.length() <= 0) {
            q1Var.f328478b.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(q1Var.f328478b, s1Var.f328493s, null);
        }
        if (c01.e2.R(s1Var.f328493s)) {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).aj(context, s1Var.f328494t), q1Var.f328479c);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(s1Var.f328494t, q1Var.f328479c);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(s1Var.f328496v, q1Var.f328480d);
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bbw, viewGroup, false);
        e23.q1 q1Var = this.f328487b.f328498x;
        q1Var.f328478b = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        q1Var.f328479c = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
        q1Var.f328480d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cut);
        q1Var.f328477a = inflate.findViewById(com.p314xaae8f345.mm.R.id.d0v);
        inflate.setTag(q1Var);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        e23.s1 s1Var = (e23.s1) gVar;
        a(this.f328487b.i(), s1Var.f328491q);
        java.lang.String str = s1Var.f328493s;
        java.lang.Object obj = s13.b.f483667a;
        if (str != null && str.length() != 0 && !s13.b.f483670d) {
            ((ku5.t0) ku5.t0.f394148d).g(new s13.a(str));
        }
        android.content.Intent putExtra = new android.content.Intent().putExtra("Chat_User", s1Var.f328493s).putExtra("finish_direct", true);
        putExtra.putExtra("chat_from_scene", 5);
        if ((com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(s1Var.f328493s) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.n4(s1Var.f328493s)) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.ContactWeCom.k(view.getContext(), null)) {
            return true;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(s1Var.f328493s)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6800x63c0d5b8 c6800x63c0d5b8 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6800x63c0d5b8();
            c6800x63c0d5b8.p(s1Var.f328493s);
            c6800x63c0d5b8.f141319e = 3L;
            c6800x63c0d5b8.k();
        }
        j45.l.u(context, ".ui.chatting.ChattingUI", putExtra, null);
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(s1Var.f328493s, 2);
        return true;
    }
}
