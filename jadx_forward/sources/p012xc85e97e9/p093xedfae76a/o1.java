package p012xc85e97e9.p093xedfae76a;

/* loaded from: classes14.dex */
public abstract class o1 {
    public static p012xc85e97e9.p093xedfae76a.m1 a(android.view.View view) {
        p012xc85e97e9.p093xedfae76a.m1 m1Var = (p012xc85e97e9.p093xedfae76a.m1) view.getTag(com.p314xaae8f345.mm.R.id.p2_);
        if (m1Var != null) {
            return m1Var;
        }
        java.lang.Object parent = view.getParent();
        while (m1Var == null && (parent instanceof android.view.View)) {
            android.view.View view2 = (android.view.View) parent;
            m1Var = (p012xc85e97e9.p093xedfae76a.m1) view2.getTag(com.p314xaae8f345.mm.R.id.p2_);
            parent = view2.getParent();
        }
        return m1Var;
    }
}
