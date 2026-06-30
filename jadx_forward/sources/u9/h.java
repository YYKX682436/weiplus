package u9;

/* loaded from: classes14.dex */
public final class h implements android.media.MediaCodec.OnFrameRenderedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u9.i f507278a;

    public h(u9.i iVar, android.media.MediaCodec mediaCodec, u9.f fVar) {
        this.f507278a = iVar;
        mediaCodec.setOnFrameRenderedListener(this, new android.os.Handler());
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public void onFrameRendered(android.media.MediaCodec mediaCodec, long j17, long j18) {
        u9.i iVar = this.f507278a;
        if (this != iVar.T1) {
            return;
        }
        iVar.P();
    }
}
