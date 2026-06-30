package n72;

/* loaded from: classes14.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public byte[] f416798d;

    /* renamed from: e, reason: collision with root package name */
    public final android.hardware.Camera f416799e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n72.q f416800f;

    public n(n72.q qVar, byte[] bArr, android.hardware.Camera camera) {
        this.f416800f = qVar;
        byte[] bArr2 = new byte[bArr.length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        this.f416798d = bArr2;
        this.f416799e = camera;
        qVar.L.set(qVar.L.get() + 1);
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] bArr;
        if (this.f416800f.f416815q && this.f416800f.f416816r && this.f416800f.G == 2 && (bArr = this.f416798d) != null && bArr.length > 0) {
            k72.j.f386258a.a(bArr, this.f416799e);
            this.f416798d = null;
            this.f416800f.L.set(this.f416800f.L.get() - 1);
        }
    }
}
