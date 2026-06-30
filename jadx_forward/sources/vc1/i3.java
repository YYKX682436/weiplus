package vc1;

/* loaded from: classes13.dex */
public abstract class i3 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.LinkedList f516517a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedList f516518b;

    static {
        new java.util.LinkedList();
        f516517a = new java.util.LinkedList();
        f516518b = new java.util.LinkedList();
    }

    public static boolean a(rl1.f fVar) {
        java.util.LinkedList linkedList = f516517a;
        synchronized (linkedList) {
            if (linkedList.size() > 0) {
                return false;
            }
            linkedList.push(fVar);
            return true;
        }
    }
}
