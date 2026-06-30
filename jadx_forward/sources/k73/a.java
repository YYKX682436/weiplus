package k73;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static volatile k73.a f386314b;

    /* renamed from: a, reason: collision with root package name */
    public r45.uv3 f386315a = null;

    public static k73.a b() {
        k73.a aVar;
        if (f386314b != null) {
            return f386314b;
        }
        synchronized (k73.a.class) {
            if (f386314b == null) {
                f386314b = new k73.a();
            }
            aVar = f386314b;
        }
        return aVar;
    }

    public r45.uv3 a() {
        if (this.f386315a == null) {
            this.f386315a = new r45.uv3();
        }
        return this.f386315a;
    }
}
