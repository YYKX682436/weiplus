package c4;

/* loaded from: classes14.dex */
public class f {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f38283g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f38284a;

    /* renamed from: b, reason: collision with root package name */
    public final android.media.AudioManager.OnAudioFocusChangeListener f38285b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Handler f38286c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.media.AudioAttributesCompat f38287d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f38288e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f38289f;

    static {
        int i17 = androidx.media.AudioAttributesCompat.f11693b;
        c4.a cVar = android.os.Build.VERSION.SDK_INT >= 26 ? new c4.c() : new c4.b();
        cVar.a(1);
        new androidx.media.AudioAttributesCompat(cVar.build());
    }

    public f(int i17, android.media.AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, android.os.Handler handler, androidx.media.AudioAttributesCompat audioAttributesCompat, boolean z17) {
        this.f38284a = i17;
        this.f38286c = handler;
        this.f38287d = audioAttributesCompat;
        this.f38288e = z17;
        int i18 = android.os.Build.VERSION.SDK_INT;
        if (i18 >= 26 || handler.getLooper() == android.os.Looper.getMainLooper()) {
            this.f38285b = onAudioFocusChangeListener;
        } else {
            this.f38285b = new c4.e(onAudioFocusChangeListener, handler);
        }
        if (i18 >= 26) {
            this.f38289f = c4.d.a(i17, audioAttributesCompat != null ? (android.media.AudioAttributes) audioAttributesCompat.f11694a.b() : null, z17, this.f38285b, handler);
        } else {
            this.f38289f = null;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4.f)) {
            return false;
        }
        c4.f fVar = (c4.f) obj;
        return this.f38284a == fVar.f38284a && this.f38288e == fVar.f38288e && m3.c.a(this.f38285b, fVar.f38285b) && m3.c.a(this.f38286c, fVar.f38286c) && m3.c.a(this.f38287d, fVar.f38287d);
    }

    public int hashCode() {
        return m3.c.b(java.lang.Integer.valueOf(this.f38284a), this.f38285b, this.f38286c, this.f38287d, java.lang.Boolean.valueOf(this.f38288e));
    }
}
