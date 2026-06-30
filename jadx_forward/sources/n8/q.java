package n8;

/* loaded from: classes15.dex */
public class q extends n8.p {

    /* renamed from: j, reason: collision with root package name */
    public final android.media.AudioTimestamp f417082j;

    /* renamed from: k, reason: collision with root package name */
    public long f417083k;

    /* renamed from: l, reason: collision with root package name */
    public long f417084l;

    /* renamed from: m, reason: collision with root package name */
    public long f417085m;

    public q() {
        super(null);
        this.f417082j = new android.media.AudioTimestamp();
    }

    @Override // n8.p
    public long b() {
        return this.f417085m;
    }

    @Override // n8.p
    public long c() {
        return this.f417082j.nanoTime;
    }

    @Override // n8.p
    public void d(android.media.AudioTrack audioTrack, boolean z17) {
        super.d(audioTrack, z17);
        this.f417083k = 0L;
        this.f417084l = 0L;
        this.f417085m = 0L;
    }

    @Override // n8.p
    public boolean e() {
        android.media.AudioTrack audioTrack = this.f417073a;
        android.media.AudioTimestamp audioTimestamp = this.f417082j;
        boolean timestamp = audioTrack.getTimestamp(audioTimestamp);
        if (timestamp) {
            long j17 = audioTimestamp.framePosition;
            if (this.f417084l > j17) {
                this.f417083k++;
            }
            this.f417084l = j17;
            this.f417085m = j17 + (this.f417083k << 32);
        }
        return timestamp;
    }
}
