package al5;

/* loaded from: classes3.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f5986a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f5987b;

    public p2(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f5986a = view;
        this.f5987b = new java.util.ArrayList();
    }

    public final void a() {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f5987b;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f5986a.post((java.lang.Runnable) it.next());
        }
        arrayList.clear();
    }
}
