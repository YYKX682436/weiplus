package f53;

/* loaded from: classes5.dex */
public final class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b f341185d;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b activityC15905x15a0ec7b) {
        this.f341185d = activityC15905x15a0ec7b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$init$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = this.f341185d.f221544d;
        if (abstractC19636xc6b37291 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
            throw null;
        }
        if (abstractC19636xc6b37291.getVisibility() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b.T6(this.f341185d);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f341185d.f221545e;
            if (c22621x7603e017 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameCommentInputTxt");
                throw null;
            }
            java.lang.Object systemService = c22621x7603e017.getContext().getSystemService("input_method");
            android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
            if (inputMethodManager != null) {
                c22621x7603e017.requestFocus();
                inputMethodManager.showSoftInput(c22621x7603e017, 0);
            }
            this.f341185d.X6().setVisibility(0);
        } else {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = this.f341185d.mo55332x76847179();
            this.f341185d.getClass();
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(mo55332x76847179, 90, 9001, 999, 2, 0, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b activityC15905x15a0ec7b = this.f341185d;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = activityC15905x15a0ec7b.f221545e;
            if (c22621x7603e0172 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameCommentInputTxt");
                throw null;
            }
            java.lang.Object systemService2 = c22621x7603e0172.getContext().getSystemService("input_method");
            android.view.inputmethod.InputMethodManager inputMethodManager2 = systemService2 instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService2 : null;
            if (inputMethodManager2 != null) {
                inputMethodManager2.hideSoftInputFromWindow(c22621x7603e0172.getWindowToken(), 0);
            }
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(activityC15905x15a0ec7b.mo55332x76847179(), 90, 9002, 0, 1, 0, null);
            ku5.u0 u0Var = ku5.t0.f394148d;
            f53.n0 n0Var = new f53.n0(activityC15905x15a0ec7b);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(n0Var, 200L, false);
            android.widget.ImageView imageView = activityC15905x15a0ec7b.f221546f;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ivSmileyIcon");
                throw null;
            }
            activityC15905x15a0ec7b.U6(imageView, com.p314xaae8f345.mm.R.raw.f79431xb48c745d, activityC15905x15a0ec7b.C);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$init$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
