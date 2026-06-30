package a01;

/* loaded from: classes14.dex */
public final class a implements android.view.PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a01.d f362a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f363b;

    public a(a01.d dVar, kotlin.jvm.internal.h0 h0Var) {
        this.f362a = dVar;
        this.f363b = h0Var;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i17) {
        a01.d dVar = this.f362a;
        com.tencent.mars.xlog.Log.i(dVar.b(), "captureFrame end result:" + i17 + " isValid:" + dVar.f374f + '.');
        if (i17 == 0 && dVar.f374f) {
            dVar.f373e = (android.graphics.Bitmap) this.f363b.f310123d;
        }
    }
}
