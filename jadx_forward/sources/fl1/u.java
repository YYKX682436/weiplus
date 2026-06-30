package fl1;

/* loaded from: classes14.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f345404a = "MicroMsg.AppBrandDialogAccessibilityFixer#" + hashCode();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f345405b = new java.util.HashMap();

    public final java.util.List a(android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        boolean z17 = parent instanceof android.view.ViewGroup;
        kz5.p0 p0Var = kz5.p0.f395529d;
        java.lang.String str = this.f345404a;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "findSiblingsBelow[" + view + "], parent is not ViewGroup");
            return p0Var;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
        int indexOfChild = viewGroup.indexOfChild(view);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "findSiblingsBelow[" + view + "], myIndex: " + indexOfChild);
        if (indexOfChild == 0) {
            return p0Var;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(indexOfChild);
        for (int i17 = 0; i17 < indexOfChild; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            if (childAt != null) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public final void b(android.view.View view, boolean z17, fl1.b2 b2Var, java.util.List list) {
        android.view.View mo81952xc2a54588;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f345404a, "onDialogDismissed[" + view + "], isLastDialog, recover siblings's importantForAccessibility");
            if (list == null) {
                list = a(view);
            }
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((android.view.View) it.next()).setImportantForAccessibility(0);
            }
        }
        if (b2Var == null || (mo81952xc2a54588 = b2Var.mo81952xc2a54588()) == null) {
            return;
        }
        mo81952xc2a54588.setImportantForAccessibility(0);
    }
}
