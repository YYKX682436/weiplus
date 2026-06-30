package p012xc85e97e9.p093xedfae76a;

/* loaded from: classes11.dex */
public abstract class n1 {
    public static p012xc85e97e9.p093xedfae76a.y a(android.view.View view) {
        p012xc85e97e9.p093xedfae76a.y yVar = (p012xc85e97e9.p093xedfae76a.y) view.getTag(com.p314xaae8f345.mm.R.id.p28);
        if (yVar != null) {
            return yVar;
        }
        java.lang.Object parent = view.getParent();
        while (yVar == null && (parent instanceof android.view.View)) {
            android.view.View view2 = (android.view.View) parent;
            yVar = (p012xc85e97e9.p093xedfae76a.y) view2.getTag(com.p314xaae8f345.mm.R.id.p28);
            parent = view2.getParent();
        }
        return yVar;
    }
}
