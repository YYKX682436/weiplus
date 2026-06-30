package tq1;

/* loaded from: classes10.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f502745d;

    public a(tq1.b bVar, byte[] bArr) {
        this.f502745d = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        rq1.e0.h(this.f502745d);
        rq1.e0.b(false);
        rq1.e0.g(rq1.e0.e(false));
    }
}
