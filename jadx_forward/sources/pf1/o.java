package pf1;

/* loaded from: classes7.dex */
public final class o {
    public o(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.view.ViewGroup root) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        int childCount = root.getChildCount();
        if (childCount <= 0) {
            return;
        }
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = root.getChildAt(i17);
            if (childAt instanceof pf1.q) {
                pf1.q qVar = (pf1.q) childAt;
                qVar.mo158326x5cd39ffa();
                qVar.removeAllViewsInLayout();
            } else if (!(childAt instanceof android.view.ViewGroup)) {
                return;
            } else {
                a((android.view.ViewGroup) childAt);
            }
        }
    }
}
