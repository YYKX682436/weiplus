package n72;

/* loaded from: classes14.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f416801d;

    /* renamed from: e, reason: collision with root package name */
    public final android.hardware.Camera f416802e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n72.q f416803f;

    public o(n72.q qVar, byte[] bArr, android.hardware.Camera camera) {
        this.f416803f = qVar;
        this.f416801d = bArr;
        this.f416802e = camera;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f416803f.f416815q && this.f416803f.f416816r && this.f416803f.G == 2) {
            k72.j.f386258a.a(this.f416801d, this.f416802e);
        }
    }
}
