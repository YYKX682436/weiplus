package kw4;

/* loaded from: classes8.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f394697a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f394698b;

    /* renamed from: d, reason: collision with root package name */
    public android.view.GestureDetector f394700d;

    /* renamed from: e, reason: collision with root package name */
    public final kw4.d f394701e;

    /* renamed from: f, reason: collision with root package name */
    public float f394702f;

    /* renamed from: c, reason: collision with root package name */
    public kw4.c f394699c = kw4.c.None;

    /* renamed from: g, reason: collision with root package name */
    public int f394703g = 0;

    /* renamed from: h, reason: collision with root package name */
    public float f394704h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f394705i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f394706j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.Runnable f394707k = new kw4.a(this);

    public e(android.content.Context context, android.view.View view, kw4.d dVar) {
        this.f394702f = 0.0f;
        this.f394697a = context;
        this.f394701e = dVar;
        this.f394698b = view;
        this.f394700d = new android.view.GestureDetector(context, new kw4.b(this));
        this.f394702f = lw4.h.b(context);
    }
}
