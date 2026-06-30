package a01;

/* loaded from: classes14.dex */
public final class a implements android.view.PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a01.d f81895a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f81896b;

    public a(a01.d dVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f81895a = dVar;
        this.f81896b = h0Var;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i17) {
        a01.d dVar = this.f81895a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dVar.b(), "captureFrame end result:" + i17 + " isValid:" + dVar.f81907f + '.');
        if (i17 == 0 && dVar.f81907f) {
            dVar.f81906e = (android.graphics.Bitmap) this.f81896b.f391656d;
        }
    }
}
