package pm0;

/* loaded from: classes5.dex */
public final class r implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f438326e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f438327f;

    public r(java.lang.String str, yz5.a aVar, boolean z17) {
        this.f438325d = str;
        this.f438326e = aVar;
        this.f438327f = z17;
    }

    @Override // wu5.f
    public boolean a() {
        return this.f438327f;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return this.f438325d;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f438326e.mo152xb9724478();
    }
}
