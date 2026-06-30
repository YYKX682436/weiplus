package fl1;

/* loaded from: classes7.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f345312a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f345313b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f345314c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f345315d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Bitmap f345316e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f345317f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f345318g;

    /* renamed from: h, reason: collision with root package name */
    public final int f345319h;

    public h1(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, android.graphics.Bitmap bitmap, boolean z17, java.lang.String iconUrl, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconUrl, "iconUrl");
        this.f345312a = i17;
        this.f345313b = str;
        this.f345314c = str2;
        this.f345315d = str3;
        this.f345316e = bitmap;
        this.f345317f = z17;
        this.f345318g = iconUrl;
        this.f345319h = i18;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h1(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, java.lang.String iconUrl, int i18) {
        this(i17, str, str2, str3, null, z17, iconUrl, i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconUrl, "iconUrl");
    }

    public h1(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, android.graphics.Bitmap bitmap, int i18) {
        this(i17, str, str2, str3, bitmap, z17, "", i18);
    }

    public h1(int i17, java.lang.String str, java.lang.String str2, boolean z17) {
        this(i17, str, "", str2, null, z17, "", 0);
    }
}
