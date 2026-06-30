package al5;

/* loaded from: classes11.dex */
public abstract class a3 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.LinkedList f87397a = new java.util.LinkedList();

    public static void a(boolean z17, int i17, boolean z18) {
        java.util.LinkedList linkedList = f87397a;
        if (linkedList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SwipeBackHelper", "notifySettle callback stack empty!, open:%B, speed:%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
            return;
        }
        al5.z2 z2Var = (al5.z2) ((java.lang.ref.WeakReference) linkedList.get(0)).get();
        if (z2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SwipeBackHelper", "notifySettle null, open:%B, speed:%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        } else {
            z2Var.mo2325x58f7e80a(z17, i17, z18);
        }
    }

    public static void b(float f17) {
        java.util.LinkedList linkedList = f87397a;
        if (linkedList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SwipeBackHelper", "notifySwipe callback stack empty!, scrollParent:%f", java.lang.Float.valueOf(f17));
            return;
        }
        al5.z2 z2Var = (al5.z2) ((java.lang.ref.WeakReference) linkedList.get(0)).get();
        if (z2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SwipeBackHelper", "notifySwipe null, scrollParent:%f", java.lang.Float.valueOf(f17));
        } else {
            z2Var.mo2326xb052149b(f17);
        }
    }

    public static boolean c(al5.z2 z2Var) {
        java.util.LinkedList linkedList = f87397a;
        int size = linkedList.size();
        if (z2Var == null) {
            return true;
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        int i17 = 0;
        while (true) {
            if (i17 >= linkedList.size()) {
                break;
            }
            if (z2Var == ((java.lang.ref.WeakReference) linkedList.get(i17)).get()) {
                linkedList.remove(i17);
                break;
            }
            linkedList2.add(0, java.lang.Integer.valueOf(i17));
            i17++;
        }
        if (!z2Var.mo2324x9a379939() && linkedList2.size() == size) {
            return false;
        }
        java.util.Iterator it = linkedList2.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) linkedList.remove(((java.lang.Integer) it.next()).intValue());
            if (weakReference != null) {
                weakReference.get();
            }
        }
        return linkedList2.isEmpty();
    }

    public static void d(al5.z2 z2Var) {
        java.util.LinkedList linkedList = f87397a;
        linkedList.size();
        linkedList.add(0, new java.lang.ref.WeakReference(z2Var));
    }
}
