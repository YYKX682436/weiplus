package y8;

/* loaded from: classes13.dex */
public final class k implements y8.i {

    /* renamed from: a, reason: collision with root package name */
    public final int f541349a;

    /* renamed from: b, reason: collision with root package name */
    public android.media.MediaCodecInfo[] f541350b;

    public k(boolean z17) {
        this.f541349a = z17 ? 1 : 0;
    }

    @Override // y8.i
    public android.media.MediaCodecInfo a(int i17) {
        if (this.f541350b == null) {
            this.f541350b = new android.media.MediaCodecList(this.f541349a).getCodecInfos();
        }
        return this.f541350b[i17];
    }

    @Override // y8.i
    public boolean b(java.lang.String str, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    @Override // y8.i
    public int c() {
        if (this.f541350b == null) {
            this.f541350b = new android.media.MediaCodecList(this.f541349a).getCodecInfos();
        }
        return this.f541350b.length;
    }

    @Override // y8.i
    public boolean d() {
        return true;
    }
}
