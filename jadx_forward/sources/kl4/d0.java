package kl4;

/* loaded from: classes15.dex */
public final class d0 implements android.media.AudioTrack.OnPlaybackPositionUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kl4.k0 f390433a;

    public d0(kl4.k0 k0Var) {
        this.f390433a = k0Var;
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public void onMarkerReached(android.media.AudioTrack track) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(track, "track");
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public void onPeriodicNotification(android.media.AudioTrack track) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(track, "track");
        kl4.k0 k0Var = this.f390433a;
        if (k0Var.f390469n || track.getPlaybackHeadPosition() < k0Var.f390477v) {
            return;
        }
        k0Var.f();
    }
}
