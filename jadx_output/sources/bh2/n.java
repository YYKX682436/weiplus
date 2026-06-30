package bh2;

/* loaded from: classes10.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bh2.v f20883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.trtc.TXChorusMusicPlayer.TXChorusError f20884e;

    public n(bh2.v vVar, com.tencent.trtc.TXChorusMusicPlayer.TXChorusError tXChorusError) {
        this.f20883d = vVar;
        this.f20884e = tXChorusError;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bh2.v vVar = this.f20883d;
        bh2.b bVar = vVar.f20898f;
        if (bVar != null) {
            om2.s sVar = vVar.f20894b;
            java.lang.String a17 = sVar != null ? sVar.a() : "";
            com.tencent.trtc.TXChorusMusicPlayer.TXChorusError tXChorusError = this.f20884e;
            bVar.Y4(a17, tXChorusError != null ? tXChorusError.ordinal() : 0);
        }
        vVar.f20903k = false;
        vVar.f20902j = true;
    }
}
