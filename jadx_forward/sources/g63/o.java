package g63;

/* loaded from: classes8.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z53.i f350681d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g63.s f350682e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f350683f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f350684g;

    public o(z53.i iVar, g63.s sVar, int i17, android.view.View view) {
        this.f350681d = iVar;
        this.f350682e = sVar;
        this.f350683f = i17;
        this.f350684g = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        m53.h3 h3Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gamelife/ui/GameLifeConversationNormalViewProvider$bindHistoryConversation$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        z53.i iVar = this.f350681d;
        if (iVar.f67671xa35b5abb != Integer.MAX_VALUE) {
            iVar.f67671xa35b5abb = Integer.MAX_VALUE;
            ((t53.m0) i95.n0.c(t53.m0.class)).Ui().m145258xce0038c9(iVar.f72763xa3c65b86, iVar, false);
            ((t53.m0) i95.n0.c(t53.m0.class)).Ui().mo142179xf35bbb4("single", 4, iVar);
        }
        g63.s.a(this.f350682e, iVar, 7L, this.f350683f);
        m33.l1 l1Var = (m33.l1) i95.n0.c(m33.l1.class);
        android.content.Context context = this.f350684g.getContext();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) l1Var).getClass();
        m53.l1 i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.i();
        if (i17 != null && (h3Var = i17.f405393e) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h3Var.f405283d)) {
            r53.f.u(context, i17.f405393e.f405283d);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gamelife/ui/GameLifeConversationNormalViewProvider$bindHistoryConversation$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
