package c4;

/* loaded from: classes4.dex */
public class e implements android.os.Handler.Callback, android.media.AudioManager.OnAudioFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f119810d;

    /* renamed from: e, reason: collision with root package name */
    public final android.media.AudioManager.OnAudioFocusChangeListener f119811e;

    public e(android.media.AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, android.os.Handler handler) {
        this.f119811e = onAudioFocusChangeListener;
        this.f119810d = new android.os.Handler(handler.getLooper(), this);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        if (message.what != 2782386) {
            return false;
        }
        this.f119811e.onAudioFocusChange(message.arg1);
        return true;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i17) {
        android.os.Handler handler = this.f119810d;
        handler.sendMessage(android.os.Message.obtain(handler, 2782386, i17, 0));
    }
}
