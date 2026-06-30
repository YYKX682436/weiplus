package m95;

/* loaded from: classes13.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Application f406628a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.res.Resources f406629b;

    /* renamed from: c, reason: collision with root package name */
    public final android.util.TypedValue f406630c = new android.util.TypedValue();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f406631d;

    public h(java.util.Map map, android.app.Application application, android.content.res.Resources resources) {
        this.f406631d = map;
        this.f406628a = application;
        this.f406629b = resources;
    }

    public void a(java.lang.Integer num, l95.c cVar) {
        if (cVar != null) {
            this.f406631d.put(num, cVar);
        }
        m95.k.b(this.f406628a, this.f406629b, num.intValue(), this.f406630c);
    }
}
