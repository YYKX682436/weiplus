package li1;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f400287a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f400288b = new java.util.ArrayList();

    public final void a() {
        this.f400287a = true;
        java.util.ArrayList arrayList = this.f400288b;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
        arrayList.clear();
    }
}
