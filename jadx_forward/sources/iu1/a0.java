package iu1;

/* loaded from: classes9.dex */
public final class a0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 f376371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xt f376372e;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76, r45.xt xtVar) {
        this.f376371d = activityC13064xaf775f76;
        this.f376372e = xtVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76 = this.f376371d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC13064xaf775f76.mo55332x76847179(), 1, false);
        r45.xt xtVar = this.f376372e;
        k0Var.f293405n = new iu1.y(xtVar);
        k0Var.f293414s = new iu1.z(xtVar, activityC13064xaf775f76);
        k0Var.v();
        return false;
    }
}
