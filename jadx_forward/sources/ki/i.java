package ki;

/* loaded from: classes12.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final ki.i f389634c = new ki.i();

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.ArrayList f389632a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f389633b = new java.util.ArrayList();

    public static final void a(ki.i iVar, java.util.ArrayList arrayList, int i17) {
        java.util.ArrayList arrayList2;
        iVar.getClass();
        synchronized (arrayList) {
            arrayList2 = new java.util.ArrayList(arrayList);
        }
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            try {
                ((ki.a) it.next()).a(i17);
            } catch (java.lang.Throwable th6) {
                oj.j.d("Matrix.TrimMemoryNotifier", th6, "", new java.lang.Object[0]);
            }
        }
        synchronized (iVar) {
            java.lang.Runtime.getRuntime().gc();
        }
    }

    public final void b(ki.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.util.ArrayList arrayList = f389633b;
        synchronized (arrayList) {
            arrayList.add(callback);
        }
    }

    public final void c(ki.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.util.ArrayList arrayList = f389632a;
        synchronized (arrayList) {
            arrayList.add(callback);
        }
    }

    public final void d(java.util.ArrayList arrayList) {
        java.util.ArrayList arrayList2;
        synchronized (arrayList) {
            arrayList2 = new java.util.ArrayList(arrayList);
        }
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            try {
                ((ki.a) it.next()).b();
            } catch (java.lang.Throwable th6) {
                oj.j.d("Matrix.TrimMemoryNotifier", th6, "", new java.lang.Object[0]);
            }
        }
        synchronized (this) {
            java.lang.Runtime.getRuntime().gc();
        }
    }
}
