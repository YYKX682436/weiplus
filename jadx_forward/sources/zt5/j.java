package zt5;

/* loaded from: classes15.dex */
public class j {

    /* renamed from: b, reason: collision with root package name */
    public static volatile zt5.j f557136b;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f557137a = zt5.b.f557133a;

    public static zt5.j a() {
        zt5.j jVar;
        if (f557136b != null) {
            return f557136b;
        }
        synchronized (zt5.j.class) {
            if (f557136b == null) {
                f557136b = new zt5.j();
            }
            jVar = f557136b;
        }
        return jVar;
    }
}
