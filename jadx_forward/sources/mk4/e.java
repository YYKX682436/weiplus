package mk4;

/* loaded from: classes14.dex */
public final class e implements android.view.PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mk4.h f408680a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f408681b;

    public e(mk4.h hVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f408680a = hVar;
        this.f408681b = h0Var;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i17) {
        mk4.h hVar = this.f408680a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hVar.d(), "captureFrame end result:" + i17 + " isValid:" + hVar.f408692f + '.');
        if (i17 == 0 && hVar.f408692f) {
            hVar.f408691e = (android.graphics.Bitmap) this.f408681b.f391656d;
        }
    }
}
