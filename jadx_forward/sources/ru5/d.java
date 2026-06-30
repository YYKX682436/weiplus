package ru5;

/* loaded from: classes12.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    public static final ru5.d f481325b = new ru5.d();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f481326c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Looper f481327a;

    public d() {
        int i17 = pu5.h.f440005b;
        android.os.HandlerThread a17 = pu5.f.a("TP#Internal", 5);
        a17.setPriority(8);
        a17.start();
        this.f481327a = a17.getLooper();
    }

    public static android.os.Handler a(java.lang.String str, android.os.Handler.Callback callback) {
        ru5.d dVar = f481325b;
        ru5.c cVar = new ru5.c(str, dVar.f481327a, callback);
        f481326c.put(dVar.f481327a, new java.lang.ref.WeakReference(cVar));
        return cVar;
    }
}
