package co0;

/* loaded from: classes3.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ co0.s f43719d;

    public i(co0.s sVar) {
        this.f43719d = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        co0.s sVar = this.f43719d;
        sVar.f420759f.removeCallbacks(this);
        sVar.f420759f.postDelayed(this, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
    }
}
