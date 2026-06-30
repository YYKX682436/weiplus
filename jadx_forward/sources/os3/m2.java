package os3;

/* loaded from: classes8.dex */
public class m2 implements android.view.View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16936x21d2caed f429683d;

    public m2(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16936x21d2caed c16936x21d2caed) {
        this.f429683d = c16936x21d2caed;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        java.lang.String obj;
        android.view.View view2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl$5", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16936x21d2caed c16936x21d2caed = this.f429683d;
        if (i17 == 67 && keyEvent.getAction() == 0) {
            java.lang.String obj2 = c16936x21d2caed.f236417f.getEditableText().toString();
            if (obj2.length() == 0 && (view2 = c16936x21d2caed.f236422n) != null && view2.isSelected()) {
                c16936x21d2caed.f((ks3.u) c16936x21d2caed.f236422n.getTag());
                c16936x21d2caed.f236422n = null;
                c16936x21d2caed.a();
            } else if (obj2.length() == 0 && c16936x21d2caed.f236416e.size() > 0) {
                int size = c16936x21d2caed.f236416e.size() - 1;
                android.view.View childAt = c16936x21d2caed.getChildAt(size);
                if (childAt.isSelected()) {
                    c16936x21d2caed.f((ks3.u) c16936x21d2caed.f236416e.get(size));
                    c16936x21d2caed.a();
                } else {
                    childAt.setSelected(true);
                }
            }
        } else if (i17 == 66 && keyEvent.getAction() == 0 && (obj = c16936x21d2caed.f236417f.getEditableText().toString()) != null && obj.length() > 0) {
            c16936x21d2caed.e(obj, true);
            c16936x21d2caed.a();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl$5", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }
}
