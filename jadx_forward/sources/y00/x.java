package y00;

/* loaded from: classes3.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f540090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f540091e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f540092f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f540093g;

    public x(java.lang.String str, long j17, java.util.Map map, long j18) {
        this.f540090d = str;
        this.f540091e = j17;
        this.f540092f = map;
        this.f540093g = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y00.h.b(this.f540090d, this.f540091e, this.f540092f, this.f540093g);
    }
}
