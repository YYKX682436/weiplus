package h5;

/* loaded from: classes13.dex */
public class j {

    /* renamed from: e, reason: collision with root package name */
    public static h5.j f360530e;

    /* renamed from: a, reason: collision with root package name */
    public final h5.a f360531a;

    /* renamed from: b, reason: collision with root package name */
    public final h5.b f360532b;

    /* renamed from: c, reason: collision with root package name */
    public final h5.h f360533c;

    /* renamed from: d, reason: collision with root package name */
    public final h5.i f360534d;

    public j(android.content.Context context, m5.a aVar) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.f360531a = new h5.a(applicationContext, aVar);
        this.f360532b = new h5.b(applicationContext, aVar);
        this.f360533c = new h5.h(applicationContext, aVar);
        this.f360534d = new h5.i(applicationContext, aVar);
    }

    public static synchronized h5.j a(android.content.Context context, m5.a aVar) {
        h5.j jVar;
        synchronized (h5.j.class) {
            if (f360530e == null) {
                f360530e = new h5.j(context, aVar);
            }
            jVar = f360530e;
        }
        return jVar;
    }
}
