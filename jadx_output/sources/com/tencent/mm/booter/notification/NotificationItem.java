package com.tencent.mm.booter.notification;

/* loaded from: classes11.dex */
public class NotificationItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.booter.notification.NotificationItem> CREATOR = new com.tencent.mm.booter.notification.j0();

    /* renamed from: d, reason: collision with root package name */
    public int f63458d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f63459e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.Notification f63460f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.PendingIntent f63461g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f63462h;

    /* renamed from: i, reason: collision with root package name */
    public long f63463i;

    /* renamed from: m, reason: collision with root package name */
    public int f63464m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f63465n;

    /* renamed from: o, reason: collision with root package name */
    public final int f63466o;

    /* renamed from: p, reason: collision with root package name */
    public int f63467p;

    public NotificationItem(int i17, java.lang.String str, android.app.Notification notification) {
        this(i17, str, notification, true, 0);
    }

    public final void a(android.content.Context context) {
        if (context == null) {
            return;
        }
        android.app.Notification notification = this.f63460f;
        if (notification == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NotificationItem", "error, notify but mNotification == null");
            return;
        }
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (context2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NotificationItem", "error, safeCheck but MMApplicationContext.getContext() == null");
        } else {
            if (context2.getResources().getDrawable(notification.icon) == null) {
                this.f63460f.icon = com.tencent.mm.R.drawable.icon;
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f63460f.defaults);
        android.app.Notification notification2 = this.f63460f;
        com.tencent.mars.xlog.Log.i("MicroMsg.NotificationItem", "notificaiton.defaults: %d, notification.sound: %s, notification.vibrate: %s", valueOf, notification2.sound, qm.z.a(notification2.vibrate));
        try {
            java.util.Set set = qm.e.f364625b;
            if (((android.media.AudioManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio")).getRingerMode() == 1) {
                android.app.Notification notification3 = this.f63460f;
                if (notification3.defaults != 2 && notification3.vibrate == null) {
                    notification3.defaults = 0;
                    notification3.sound = null;
                    com.tencent.mars.xlog.Log.i("MicroMsg.NotificationItem", "mode == vibrate & wechat shake is close, so notification switch to silent");
                }
            }
            if (fp.h.c(26)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NotificationItem", "manual add led to notification");
                android.app.Notification notification4 = this.f63460f;
                notification4.ledARGB = -16711936;
                notification4.ledOnMS = 300;
                notification4.ledOffMS = 1000;
            }
            new z2.n1(com.tencent.mm.sdk.platformtools.x2.f193071a).c(this.f63458d, this.f63460f);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NotificationItem", e17, "Notification Exception?", new java.lang.Object[0]);
        }
        long j17 = this.f63463i;
        if (j17 == 0 || j17 == 0) {
            return;
        }
        java.lang.String string = ((com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.network.x2.j()).getString("com.tencent.preference.notification.key.all.notified.msgid", "");
        if (string.length() > 3000) {
            string = string.substring(string.length() / 2, string.length());
        }
        if (com.tencent.mm.booter.notification.e0.e(j17)) {
            return;
        }
        java.lang.String str = string + j17 + "%";
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.network.x2.j();
        o4Var.getClass();
        o4Var.putString("com.tencent.preference.notification.key.all.notified.msgid", str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "id: " + this.f63458d + ",msgId: " + this.f63463i + ",userName: " + this.f63462h + ",unreadCount: " + this.f63464m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f63458d);
        java.lang.String str = this.f63462h;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeParcelable(this.f63459e, 0);
        parcel.writeParcelable(this.f63460f, 0);
        parcel.writeParcelable(this.f63461g, 0);
        parcel.writeByte(this.f63465n ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f63463i);
        parcel.writeInt(this.f63464m);
    }

    public NotificationItem(int i17, android.app.Notification notification, boolean z17) {
        this(i17, null, notification, z17, 0);
    }

    public NotificationItem(int i17, java.lang.String str, android.app.Notification notification, boolean z17, int i18) {
        this.f63463i = 0L;
        this.f63464m = 0;
        this.f63465n = true;
        this.f63466o = 0;
        this.f63467p = 0;
        this.f63458d = i17;
        this.f63462h = str;
        this.f63459e = notification.largeIcon;
        this.f63460f = notification;
        this.f63465n = z17;
        this.f63466o = i18;
    }

    public NotificationItem(android.os.Parcel parcel, com.tencent.mm.booter.notification.j0 j0Var) {
        this.f63458d = -1;
        this.f63463i = 0L;
        this.f63464m = 0;
        this.f63465n = true;
        this.f63466o = 0;
        this.f63467p = 0;
        if (parcel == null) {
            return;
        }
        this.f63458d = parcel.readInt();
        this.f63462h = parcel.readString();
        this.f63459e = (android.graphics.Bitmap) parcel.readParcelable(android.graphics.Bitmap.class.getClassLoader());
        this.f63460f = (android.app.Notification) parcel.readParcelable(android.app.Notification.class.getClassLoader());
        this.f63461g = (android.app.PendingIntent) parcel.readParcelable(android.app.PendingIntent.class.getClassLoader());
        this.f63465n = parcel.readByte() != 0;
        this.f63463i = parcel.readLong();
        this.f63464m = parcel.readInt();
    }
}
