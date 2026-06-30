package a5;

/* loaded from: classes13.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f82950a;

    /* renamed from: b, reason: collision with root package name */
    public final int f82951b;

    /* renamed from: c, reason: collision with root package name */
    public final android.app.Notification f82952c;

    public o(int i17, android.app.Notification notification, int i18) {
        this.f82950a = i17;
        this.f82952c = notification;
        this.f82951b = i18;
    }

    /* renamed from: equals */
    public boolean m599xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a5.o.class != obj.getClass()) {
            return false;
        }
        a5.o oVar = (a5.o) obj;
        if (this.f82950a == oVar.f82950a && this.f82951b == oVar.f82951b) {
            return this.f82952c.equals(oVar.f82952c);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m600x8cdac1b() {
        return (((this.f82950a * 31) + this.f82951b) * 31) + this.f82952c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m601x9616526c() {
        return "ForegroundInfo{mNotificationId=" + this.f82950a + ", mForegroundServiceType=" + this.f82951b + ", mNotification=" + this.f82952c + '}';
    }
}
