package c4;

/* loaded from: classes14.dex */
public abstract class g {
    public static int a(android.media.AudioManager audioManager, android.media.AudioFocusRequest audioFocusRequest) {
        return audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    public static int b(android.media.AudioManager audioManager, android.media.AudioFocusRequest audioFocusRequest) {
        return audioManager.requestAudioFocus(audioFocusRequest);
    }
}
