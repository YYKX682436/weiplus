package c4;

/* loaded from: classes14.dex */
public abstract class d {
    public static android.media.AudioFocusRequest a(int i17, android.media.AudioAttributes audioAttributes, boolean z17, android.media.AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, android.os.Handler handler) {
        return new android.media.AudioFocusRequest.Builder(i17).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(z17).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
    }
}
