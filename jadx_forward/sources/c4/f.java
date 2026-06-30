package c4;

/* loaded from: classes14.dex */
public class f {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f119816g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f119817a;

    /* renamed from: b, reason: collision with root package name */
    public final android.media.AudioManager.OnAudioFocusChangeListener f119818b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Handler f119819c;

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p096x62f6fe4.C1125xc009ef8f f119820d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f119821e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f119822f;

    static {
        int i17 = p012xc85e97e9.p096x62f6fe4.C1125xc009ef8f.f93226b;
        c4.a cVar = android.os.Build.VERSION.SDK_INT >= 26 ? new c4.c() : new c4.b();
        cVar.a(1);
        new p012xc85e97e9.p096x62f6fe4.C1125xc009ef8f(cVar.mo14107x59bc66e());
    }

    public f(int i17, android.media.AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, android.os.Handler handler, p012xc85e97e9.p096x62f6fe4.C1125xc009ef8f c1125xc009ef8f, boolean z17) {
        this.f119817a = i17;
        this.f119819c = handler;
        this.f119820d = c1125xc009ef8f;
        this.f119821e = z17;
        int i18 = android.os.Build.VERSION.SDK_INT;
        if (i18 >= 26 || handler.getLooper() == android.os.Looper.getMainLooper()) {
            this.f119818b = onAudioFocusChangeListener;
        } else {
            this.f119818b = new c4.e(onAudioFocusChangeListener, handler);
        }
        if (i18 >= 26) {
            this.f119822f = c4.d.a(i17, c1125xc009ef8f != null ? (android.media.AudioAttributes) c1125xc009ef8f.f93227a.b() : null, z17, this.f119818b, handler);
        } else {
            this.f119822f = null;
        }
    }

    /* renamed from: equals */
    public boolean m14109xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4.f)) {
            return false;
        }
        c4.f fVar = (c4.f) obj;
        return this.f119817a == fVar.f119817a && this.f119821e == fVar.f119821e && m3.c.a(this.f119818b, fVar.f119818b) && m3.c.a(this.f119819c, fVar.f119819c) && m3.c.a(this.f119820d, fVar.f119820d);
    }

    /* renamed from: hashCode */
    public int m14110x8cdac1b() {
        return m3.c.b(java.lang.Integer.valueOf(this.f119817a), this.f119818b, this.f119819c, this.f119820d, java.lang.Boolean.valueOf(this.f119821e));
    }
}
