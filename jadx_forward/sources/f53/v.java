package f53;

/* loaded from: classes5.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b f341227d;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b activityC15905x15a0ec7b) {
        this.f341227d = activityC15905x15a0ec7b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b.G;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b activityC15905x15a0ec7b = this.f341227d;
        activityC15905x15a0ec7b.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC15905x15a0ec7b.mo55332x76847179(), false, 1);
        java.lang.String str = activityC15905x15a0ec7b.f221558u;
        java.lang.String string = str == null || str.length() == 0 ? activityC15905x15a0ec7b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fnl) : activityC15905x15a0ec7b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fnm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        k0Var.f293405n = new f53.l0(activityC15905x15a0ec7b, string);
        k0Var.f293414s = new f53.m0(activityC15905x15a0ec7b);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
