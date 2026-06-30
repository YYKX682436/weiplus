package c4;

/* loaded from: classes14.dex */
public abstract class h {
    public static int a(android.media.AudioManager audioManager, c4.f fVar) {
        if (audioManager == null) {
            throw new java.lang.IllegalArgumentException("AudioManager must not be null");
        }
        if (fVar != null) {
            return android.os.Build.VERSION.SDK_INT >= 26 ? c4.g.a(audioManager, (android.media.AudioFocusRequest) fVar.f119822f) : audioManager.abandonAudioFocus(fVar.f119818b);
        }
        throw new java.lang.IllegalArgumentException("AudioFocusRequestCompat must not be null");
    }

    public static int b(android.media.AudioManager audioManager, c4.f fVar) {
        if (audioManager == null) {
            throw new java.lang.IllegalArgumentException("AudioManager must not be null");
        }
        if (fVar == null) {
            throw new java.lang.IllegalArgumentException("AudioFocusRequestCompat must not be null");
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return c4.g.b(audioManager, (android.media.AudioFocusRequest) fVar.f119822f);
        }
        return audioManager.requestAudioFocus(fVar.f119818b, fVar.f119820d.f93227a.a(), fVar.f119817a);
    }
}
