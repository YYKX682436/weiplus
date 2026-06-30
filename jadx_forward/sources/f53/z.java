package f53;

/* loaded from: classes5.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b f341231d;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b activityC15905x15a0ec7b) {
        this.f341231d = activityC15905x15a0ec7b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b activityC15905x15a0ec7b = this.f341231d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = activityC15905x15a0ec7b.f221545e;
        if (c22621x7603e017 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameCommentInputTxt");
            throw null;
        }
        int selectionStart = c22621x7603e017.getSelectionStart();
        if (activityC15905x15a0ec7b.D.f341224e.size() == 0) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        for (java.util.Map.Entry entry : activityC15905x15a0ec7b.D.f341224e.entrySet()) {
            if (selectionStart > ((java.lang.Number) ((jz5.l) entry.getValue()).f384366d).intValue() && selectionStart <= ((java.lang.Number) ((jz5.l) entry.getValue()).f384367e).intValue()) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = activityC15905x15a0ec7b.f221545e;
                if (c22621x7603e0172 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameCommentInputTxt");
                    throw null;
                }
                c22621x7603e0172.mo81549xf579a34a(((java.lang.Number) ((jz5.l) entry.getValue()).f384367e).intValue());
                yj0.a.h(this, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
