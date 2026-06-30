package pm0;

/* loaded from: classes5.dex */
public final class t implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f438332e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f438333f;

    public t(java.lang.String str, yz5.a aVar, boolean z17) {
        this.f438331d = str;
        this.f438332e = aVar;
        this.f438333f = z17;
    }

    @Override // wu5.f
    public boolean a() {
        return this.f438333f;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return this.f438331d + '#' + r26.i0.w(this.f438332e.getClass().getName(), "com.tencent.mm", "", true);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f438332e.mo152xb9724478();
    }
}
