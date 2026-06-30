package a5;

/* loaded from: classes13.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f1417a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1418b;

    /* renamed from: c, reason: collision with root package name */
    public final android.app.Notification f1419c;

    public o(int i17, android.app.Notification notification, int i18) {
        this.f1417a = i17;
        this.f1419c = notification;
        this.f1418b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a5.o.class != obj.getClass()) {
            return false;
        }
        a5.o oVar = (a5.o) obj;
        if (this.f1417a == oVar.f1417a && this.f1418b == oVar.f1418b) {
            return this.f1419c.equals(oVar.f1419c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f1417a * 31) + this.f1418b) * 31) + this.f1419c.hashCode();
    }

    public java.lang.String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f1417a + ", mForegroundServiceType=" + this.f1418b + ", mNotification=" + this.f1419c + '}';
    }
}
