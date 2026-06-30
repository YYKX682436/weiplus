package com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p175x2eaf0c;

/* loaded from: classes7.dex */
public class a implements f8.b {

    /* renamed from: a, reason: collision with root package name */
    public final com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p175x2eaf0c.C1600xa8fcb1a1 f125606a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f125607b = new java.util.HashMap();

    public a() {
        com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p175x2eaf0c.C1600xa8fcb1a1 c1600xa8fcb1a1 = new com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p175x2eaf0c.C1600xa8fcb1a1();
        this.f125606a = c1600xa8fcb1a1;
        c1600xa8fcb1a1.c();
    }

    @Override // f8.b
    public boolean a(java.io.InputStream inputStream, android.graphics.Bitmap.Config config, f8.c cVar) {
        return cVar == f8.c.PNG || cVar == f8.c.JPG;
    }

    @Override // f8.b
    public com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.InterfaceC1596x8c44c2d8 b() {
        return new com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p175x2eaf0c.C1599xca908764(this.f125606a, this);
    }

    @Override // f8.b
    /* renamed from: destroy */
    public void mo17148x5cd39ffa() {
        this.f125606a.b();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        synchronized (this) {
            java.util.Iterator it = this.f125607b.values().iterator();
            while (it.hasNext()) {
                linkedList.push((com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p175x2eaf0c.C1599xca908764) it.next());
            }
            this.f125607b.clear();
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p175x2eaf0c.C1599xca908764) it6.next()).mo17133x408b7293();
        }
        linkedList.clear();
    }
}
