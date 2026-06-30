package al5;

/* loaded from: classes3.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f87519a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f87520b;

    public p2(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f87519a = view;
        this.f87520b = new java.util.ArrayList();
    }

    public final void a() {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f87520b;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f87519a.post((java.lang.Runnable) it.next());
        }
        arrayList.clear();
    }
}
