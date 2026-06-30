package hy4;

/* loaded from: classes8.dex */
public class n implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy4.s f367711d;

    public n(hy4.s sVar) {
        this.f367711d = sVar;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        hy4.r rVar;
        int i17 = message.what;
        hy4.s sVar = this.f367711d;
        if (i17 != 1) {
            if (i17 != 2 || (rVar = sVar.f367730d) == null) {
                return false;
            }
            rVar.a(sVar.f367729c);
            return false;
        }
        android.graphics.Bitmap m120139x12501425 = sVar.f367728b.m120139x12501425();
        if (m120139x12501425 == null) {
            return false;
        }
        s75.d.b(new hy4.q(sVar, m120139x12501425), "ViewCaptureHelper_SaveBitmap");
        sVar.f367728b = null;
        return false;
    }
}
