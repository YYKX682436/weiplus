package androidx.lifecycle;

/* loaded from: classes11.dex */
public abstract class n1 {
    public static androidx.lifecycle.y a(android.view.View view) {
        androidx.lifecycle.y yVar = (androidx.lifecycle.y) view.getTag(com.tencent.mm.R.id.p28);
        if (yVar != null) {
            return yVar;
        }
        java.lang.Object parent = view.getParent();
        while (yVar == null && (parent instanceof android.view.View)) {
            android.view.View view2 = (android.view.View) parent;
            yVar = (androidx.lifecycle.y) view2.getTag(com.tencent.mm.R.id.p28);
            parent = view2.getParent();
        }
        return yVar;
    }
}
