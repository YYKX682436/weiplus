package bj0;

/* loaded from: classes11.dex */
public final class s {

    /* renamed from: f, reason: collision with root package name */
    public static final bj0.p f21129f = new bj0.p(null);

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashMap f21130g = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public int f21133c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f21131a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashSet f21132b = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f21134d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public int f21135e = -1;

    public final bj0.q a() {
        java.lang.Object obj;
        bj0.q qVar;
        synchronized (this.f21131a) {
            java.util.ArrayList arrayList = this.f21131a;
            java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (!((bj0.q) obj).f21126d) {
                    break;
                }
            }
            qVar = (bj0.q) obj;
        }
        return qVar;
    }
}
