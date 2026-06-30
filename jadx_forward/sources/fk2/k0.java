package fk2;

/* loaded from: classes3.dex */
public final class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.tq1 f344947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fk2.m0 f344948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f344949f;

    public k0(r45.tq1 tq1Var, fk2.m0 m0Var, android.content.Context context) {
        this.f344947d = tq1Var;
        this.f344948e = m0Var;
        this.f344949f = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        jz5.f0 f0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemGameChallengeArena$onBindGameChallengeArenaMsg$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CommentItemGameChallengeArena", "Game challenge arena message clicked.");
        r45.tq1 tq1Var = this.f344947d;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) tq1Var.m75936x14adae67(2);
        if (c19786x6a1e2862 != null) {
            java.lang.String m75945x2fec8307 = tq1Var.m75945x2fec8307(3);
            fk2.m0 m0Var = this.f344948e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 p17 = m0Var.f526773a.p();
            if (p17 != null) {
                boolean m46546x9b8334b1 = p17.m46546x9b8334b1();
                android.content.Context context = this.f344949f;
                if (m46546x9b8334b1) {
                    df2.qf qfVar = (df2.qf) p17.mo57658x143f1b92(df2.qf.class);
                    if (qfVar != null) {
                        qfVar.W6(new fk2.l0(m0Var, context, c19786x6a1e2862, m75945x2fec8307));
                    }
                } else {
                    m0Var.q(context, c19786x6a1e2862, m75945x2fec8307);
                }
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CommentItemGameChallengeArena", "Game challenge arena message jumpInfo is null");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemGameChallengeArena$onBindGameChallengeArenaMsg$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
