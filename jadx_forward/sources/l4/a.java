package l4;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final p4.e f397236a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f397237b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f397238c;

    /* renamed from: d, reason: collision with root package name */
    public final l4.p f397239d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.Executor f397240e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.Executor f397241f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f397242g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f397243h;

    public a(android.content.Context context, java.lang.String str, p4.e eVar, l4.p pVar, java.util.List list, boolean z17, l4.o oVar, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, boolean z18, boolean z19, boolean z27, java.util.Set set, java.lang.String str2, java.io.File file) {
        this.f397236a = eVar;
        this.f397237b = context;
        this.f397238c = str;
        this.f397239d = pVar;
        this.f397240e = executor;
        this.f397241f = executor2;
        this.f397242g = z19;
        this.f397243h = z27;
    }

    public boolean a(int i17, int i18) {
        return !((i17 > i18) && this.f397243h) && this.f397242g;
    }
}
