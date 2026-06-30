package fp;

/* loaded from: classes14.dex */
public class g implements fp.d {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f346729a;

    /* renamed from: b, reason: collision with root package name */
    public android.media.AudioManager f346730b;

    /* renamed from: c, reason: collision with root package name */
    public fp.c f346731c;

    /* renamed from: d, reason: collision with root package name */
    public final android.media.AudioManager.OnAudioFocusChangeListener f346732d = new fp.f(this);

    public g(android.content.Context context) {
        this.f346729a = context instanceof android.app.Activity ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : context;
    }

    public boolean a() {
        android.content.Context context;
        if (this.f346730b == null && (context = this.f346729a) != null) {
            this.f346730b = (android.media.AudioManager) context.getSystemService("audio");
        }
        android.media.AudioManager audioManager = this.f346730b;
        return audioManager != null && 1 == audioManager.abandonAudioFocus(this.f346732d);
    }

    public int b() {
        android.content.Context context;
        if (this.f346730b == null && (context = this.f346729a) != null) {
            this.f346730b = (android.media.AudioManager) context.getSystemService("audio");
        }
        int i17 = android.os.Build.VERSION.SDK_INT;
        android.media.AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f346732d;
        return i17 >= 26 ? this.f346730b.requestAudioFocus(new android.media.AudioFocusRequest.Builder(1).setAudioAttributes(new android.media.AudioAttributes.Builder().setContentType(2).setUsage(1).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(onAudioFocusChangeListener).build()) : this.f346730b.requestAudioFocus(onAudioFocusChangeListener, 3, 1);
    }

    public boolean c() {
        android.content.Context context;
        if (this.f346730b == null && (context = this.f346729a) != null) {
            this.f346730b = (android.media.AudioManager) context.getSystemService("audio");
        }
        android.media.AudioManager audioManager = this.f346730b;
        android.media.AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f346732d;
        boolean z17 = false;
        if (audioManager != null && 1 == audioManager.requestAudioFocus(onAudioFocusChangeListener, 3, 2)) {
            z17 = true;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.AudioFocusHelper", "jacks requestFocus: %B, %x", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(onAudioFocusChangeListener.hashCode()));
        return z17;
    }
}
