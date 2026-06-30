package android.support.v4.media.session;

/* loaded from: classes11.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final android.support.v4.media.session.i f8990a;

    public r(android.content.Context context, android.support.v4.media.session.MediaSessionCompat$Token mediaSessionCompat$Token) {
        new java.util.concurrent.ConcurrentHashMap();
        if (mediaSessionCompat$Token == null) {
            throw new java.lang.IllegalArgumentException("sessionToken must not be null");
        }
        this.f8990a = new android.support.v4.media.session.k(context, mediaSessionCompat$Token);
    }

    public void a(java.lang.String str, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("command must neither be null nor empty");
        }
        ((android.support.v4.media.session.k) this.f8990a).f8976a.sendCommand(str, bundle, resultReceiver);
    }
}
