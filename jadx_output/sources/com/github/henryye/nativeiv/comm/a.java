package com.github.henryye.nativeiv.comm;

/* loaded from: classes7.dex */
public class a implements f8.b {

    /* renamed from: a, reason: collision with root package name */
    public final com.github.henryye.nativeiv.comm.NativeImageJni f44073a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f44074b = new java.util.HashMap();

    public a() {
        com.github.henryye.nativeiv.comm.NativeImageJni nativeImageJni = new com.github.henryye.nativeiv.comm.NativeImageJni();
        this.f44073a = nativeImageJni;
        nativeImageJni.c();
    }

    @Override // f8.b
    public boolean a(java.io.InputStream inputStream, android.graphics.Bitmap.Config config, f8.c cVar) {
        return cVar == f8.c.PNG || cVar == f8.c.JPG;
    }

    @Override // f8.b
    public com.github.henryye.nativeiv.bitmap.IBitmap b() {
        return new com.github.henryye.nativeiv.comm.NativeImage(this.f44073a, this);
    }

    @Override // f8.b
    public void destroy() {
        this.f44073a.b();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        synchronized (this) {
            java.util.Iterator it = this.f44074b.values().iterator();
            while (it.hasNext()) {
                linkedList.push((com.github.henryye.nativeiv.comm.NativeImage) it.next());
            }
            this.f44074b.clear();
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((com.github.henryye.nativeiv.comm.NativeImage) it6.next()).recycle();
        }
        linkedList.clear();
    }
}
