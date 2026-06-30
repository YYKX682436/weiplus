package ej4;

/* loaded from: classes11.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f334907a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f334908b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.ref.WeakReference f334909c;

    public r(java.lang.Object subject, java.lang.String key, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subject, "subject");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        this.f334907a = key;
        this.f334908b = str;
        this.f334909c = new java.lang.ref.WeakReference(subject);
        java.util.Map map = ej4.c0.f334869b;
        synchronized (map) {
        }
    }

    public final java.lang.ref.WeakReference a() {
        java.lang.ref.WeakReference weakReference = this.f334909c;
        if (weakReference != null) {
            return weakReference;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ref");
        throw null;
    }

    public abstract void b();

    public /* synthetic */ r(java.lang.Object obj, java.lang.String str, java.lang.String str2, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(obj, str, (i17 & 4) != 0 ? "" : str2);
    }
}
