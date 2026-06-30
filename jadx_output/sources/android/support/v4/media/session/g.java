package android.support.v4.media.session;

/* loaded from: classes15.dex */
public abstract class g extends android.support.v4.media.session.b {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f8975e;

    public g(android.support.v4.media.session.h hVar) {
        this.f8975e = new java.lang.ref.WeakReference(hVar);
    }

    @Override // android.support.v4.media.session.c
    public void bj(android.support.v4.media.session.PlaybackStateCompat playbackStateCompat) {
        android.support.v4.media.f.a(this.f8975e.get());
    }
}
