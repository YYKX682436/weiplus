package n8;

/* loaded from: classes15.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public android.media.AudioTrack f417073a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f417074b;

    /* renamed from: c, reason: collision with root package name */
    public int f417075c;

    /* renamed from: d, reason: collision with root package name */
    public long f417076d;

    /* renamed from: e, reason: collision with root package name */
    public long f417077e;

    /* renamed from: f, reason: collision with root package name */
    public long f417078f;

    /* renamed from: g, reason: collision with root package name */
    public long f417079g;

    /* renamed from: h, reason: collision with root package name */
    public long f417080h;

    /* renamed from: i, reason: collision with root package name */
    public long f417081i;

    public p(n8.o oVar) {
    }

    public long a() {
        if (this.f417079g != -9223372036854775807L) {
            return java.lang.Math.min(this.f417081i, this.f417080h + ((((android.os.SystemClock.elapsedRealtime() * 1000) - this.f417079g) * this.f417075c) / 1000000));
        }
        int playState = this.f417073a.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = this.f417073a.getPlaybackHeadPosition() & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
        if (this.f417074b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f417078f = this.f417076d;
            }
            playbackHeadPosition += this.f417078f;
        }
        if (this.f417076d > playbackHeadPosition) {
            this.f417077e++;
        }
        this.f417076d = playbackHeadPosition;
        return playbackHeadPosition + (this.f417077e << 32);
    }

    public long b() {
        throw new java.lang.UnsupportedOperationException();
    }

    public long c() {
        throw new java.lang.UnsupportedOperationException();
    }

    public void d(android.media.AudioTrack audioTrack, boolean z17) {
        this.f417073a = audioTrack;
        this.f417074b = z17;
        this.f417079g = -9223372036854775807L;
        this.f417076d = 0L;
        this.f417077e = 0L;
        this.f417078f = 0L;
        if (audioTrack != null) {
            this.f417075c = audioTrack.getSampleRate();
        }
    }

    public boolean e() {
        return false;
    }
}
