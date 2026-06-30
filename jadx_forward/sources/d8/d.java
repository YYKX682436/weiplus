package d8;

/* loaded from: classes7.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f308426d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab f308427e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f308428f;

    /* renamed from: g, reason: collision with root package name */
    public final d8.c f308429g = new d8.c();

    public d(com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1591x6c90f41d c1591x6c90f41d, java.lang.Object obj, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab c1592x888963ab) {
        this.f308426d = obj;
        this.f308427e = c1592x888963ab;
        this.f308428f = new java.lang.ref.WeakReference(c1591x6c90f41d);
    }

    @Override // java.lang.Runnable
    public void run() {
        e8.d dVar;
        java.lang.ref.WeakReference weakReference = this.f308428f;
        if (weakReference.get() == null) {
            return;
        }
        com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1591x6c90f41d c1591x6c90f41d = (com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1591x6c90f41d) weakReference.get();
        java.lang.Object obj = this.f308426d;
        com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab c1592x888963ab = this.f308427e;
        com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.InterfaceC1596x8c44c2d8 mo17109xd6ee89f0 = c1591x6c90f41d.mo17109xd6ee89f0(obj, c1592x888963ab);
        dVar = ((com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1591x6c90f41d) weakReference.get()).f5267x36e6cc4a;
        dVar.b(obj.toString(), mo17109xd6ee89f0, this.f308429g, c1592x888963ab);
    }
}
