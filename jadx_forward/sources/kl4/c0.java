package kl4;

/* loaded from: classes15.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl4.k0 f390427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f390428e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f390429f;

    public c0(kl4.k0 k0Var, byte[] bArr, boolean z17) {
        this.f390427d = k0Var;
        this.f390428e = bArr;
        this.f390429f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = this.f390429f;
        byte[] bArr = this.f390428e;
        kl4.k0 k0Var = this.f390427d;
        k0Var.f390464f.lock();
        try {
            java.lang.String str = k0Var.f390481z;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enqueueBuffer playbackHeadPosition: ");
            android.media.AudioTrack audioTrack = k0Var.f390462d;
            sb6.append(audioTrack != null ? java.lang.Integer.valueOf(audioTrack.getPlaybackHeadPosition()) : null);
            sb6.append(", buffer: ");
            sb6.append(bArr.length);
            sb6.append(", hasMore: ");
            sb6.append(z17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            if (!(bArr.length == 0)) {
                ((java.util.ArrayList) k0Var.f390463e).add(bArr);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k0Var.f390481z, "enqueueBuffer " + bArr.length + ' ' + z17);
            }
            k0Var.f390470o = z17;
            if (z17) {
                int length = k0Var.f390474s + bArr.length;
                k0Var.f390474s = length;
                if (length > k0Var.f390473r) {
                    k0Var.f390465g.signalAll();
                    k0Var.f390474s = 0;
                }
            } else {
                k0Var.f390465g.signalAll();
                k0Var.f390474s = 0;
            }
            k0Var.f390464f.unlock();
        } catch (java.lang.Throwable th6) {
            k0Var.f390464f.unlock();
            throw th6;
        }
    }
}
