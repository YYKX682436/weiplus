package f53;

/* loaded from: classes5.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b f341229d;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b activityC15905x15a0ec7b) {
        this.f341229d = activityC15905x15a0ec7b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b activityC15905x15a0ec7b = this.f341229d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = activityC15905x15a0ec7b.f221544d;
        if (abstractC19636xc6b37291 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
            throw null;
        }
        if (abstractC19636xc6b37291.getVisibility() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b.T6(activityC15905x15a0ec7b);
            activityC15905x15a0ec7b.Y6();
            yj0.a.h(this, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.api.C15697x4d5ad03a c15697x4d5ad03a = activityC15905x15a0ec7b.f221556s;
        boolean z17 = true;
        if (c15697x4d5ad03a != null && c15697x4d5ad03a.f36436xf8e2c4c8) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = activityC15905x15a0ec7b.f221545e;
            if (c22621x7603e017 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameCommentInputTxt");
                throw null;
            }
            android.text.Editable text = c22621x7603e017.getText();
            if (text != null && text.length() != 0) {
                z17 = false;
            }
            if (!z17 && activityC15905x15a0ec7b.A) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = activityC15905x15a0ec7b.f221545e;
                if (c22621x7603e0172 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameCommentInputTxt");
                    throw null;
                }
                java.lang.Object systemService = c22621x7603e0172.getContext().getSystemService("input_method");
                android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(c22621x7603e0172.getWindowToken(), 0);
                }
                activityC15905x15a0ec7b.X6().setVisibility(8);
                activityC15905x15a0ec7b.Y6();
                yj0.a.h(this, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
        if (activityC15905x15a0ec7b.B) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274588c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.api.C15697x4d5ad03a c15697x4d5ad03a2 = activityC15905x15a0ec7b.f221556s;
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(c15697x4d5ad03a2 != null ? c15697x4d5ad03a2.f36429x9f88aca9 : null), com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b.a.class, null);
        } else {
            m33.y0 y0Var = m33.x0.f404877a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.api.C15697x4d5ad03a c15697x4d5ad03a3 = activityC15905x15a0ec7b.f221556s;
            y0Var.a(c15697x4d5ad03a3 != null ? c15697x4d5ad03a3.f36429x9f88aca9 : null, null);
        }
        activityC15905x15a0ec7b.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
