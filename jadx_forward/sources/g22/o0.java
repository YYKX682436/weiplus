package g22;

/* loaded from: classes15.dex */
public final class o0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.ActivityC13365x3816f414 f349385d;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.ActivityC13365x3816f414 activityC13365x3816f414) {
        this.f349385d = activityC13365x3816f414;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.ActivityC13365x3816f414 context = this.f349385d;
        int i17 = context.f179993q;
        java.lang.String setTitle = context.f179987h;
        java.lang.String setDesc = context.f179988i;
        java.lang.String setIconURL = context.f179989m;
        java.lang.String setAdURL = context.f179990n;
        int i18 = context.f179991o;
        int i19 = context.f180001y;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setTitle, "setTitle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setDesc, "setDesc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setIconURL, "setIconURL");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setAdURL, "setAdURL");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) context, 1, false);
        k0Var.f293405n = new n22.d(1001, context, 1000);
        k0Var.f293414s = new n22.e(1001, setTitle, setDesc, i17, setIconURL, setAdURL, i18, context, 1000);
        k0Var.v();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13224, 2, 0, "", java.lang.Integer.valueOf(i17));
        return false;
    }
}
