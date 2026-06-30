package ef1;

/* loaded from: classes15.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f333922a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f333923b;

    /* renamed from: d, reason: collision with root package name */
    public android.view.GestureDetector f333925d;

    /* renamed from: e, reason: collision with root package name */
    public final ef1.d f333926e;

    /* renamed from: f, reason: collision with root package name */
    public float f333927f;

    /* renamed from: c, reason: collision with root package name */
    public ef1.c f333924c = ef1.c.None;

    /* renamed from: g, reason: collision with root package name */
    public int f333928g = 0;

    /* renamed from: h, reason: collision with root package name */
    public float f333929h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f333930i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f333931j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.Runnable f333932k = new ef1.a(this);

    public e(android.content.Context context, android.view.View view, ef1.d dVar) {
        this.f333927f = 0.0f;
        this.f333922a = context;
        this.f333926e = dVar;
        this.f333923b = view;
        this.f333925d = new android.view.GestureDetector(context, new ef1.b(this));
        this.f333927f = oe1.x1.b(context);
    }
}
