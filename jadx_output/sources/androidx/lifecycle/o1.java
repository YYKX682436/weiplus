package androidx.lifecycle;

/* loaded from: classes14.dex */
public abstract class o1 {
    public static androidx.lifecycle.m1 a(android.view.View view) {
        androidx.lifecycle.m1 m1Var = (androidx.lifecycle.m1) view.getTag(com.tencent.mm.R.id.p2_);
        if (m1Var != null) {
            return m1Var;
        }
        java.lang.Object parent = view.getParent();
        while (m1Var == null && (parent instanceof android.view.View)) {
            android.view.View view2 = (android.view.View) parent;
            m1Var = (androidx.lifecycle.m1) view2.getTag(com.tencent.mm.R.id.p2_);
            parent = view2.getParent();
        }
        return m1Var;
    }
}
