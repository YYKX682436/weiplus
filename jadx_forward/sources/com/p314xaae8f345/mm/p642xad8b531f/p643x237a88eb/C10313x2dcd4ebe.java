package com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb;

/* renamed from: com.tencent.mm.booter.notification.NotificationItem */
/* loaded from: classes11.dex */
public class C10313x2dcd4ebe implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.C10313x2dcd4ebe> f27772x681a0c0c = new com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.j0();

    /* renamed from: d, reason: collision with root package name */
    public int f144991d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f144992e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.Notification f144993f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.PendingIntent f144994g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f144995h;

    /* renamed from: i, reason: collision with root package name */
    public long f144996i;

    /* renamed from: m, reason: collision with root package name */
    public int f144997m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f144998n;

    /* renamed from: o, reason: collision with root package name */
    public final int f144999o;

    /* renamed from: p, reason: collision with root package name */
    public int f145000p;

    public C10313x2dcd4ebe(int i17, java.lang.String str, android.app.Notification notification) {
        this(i17, str, notification, true, 0);
    }

    public final void a(android.content.Context context) {
        if (context == null) {
            return;
        }
        android.app.Notification notification = this.f144993f;
        if (notification == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NotificationItem", "error, notify but mNotification == null");
            return;
        }
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (context2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NotificationItem", "error, safeCheck but MMApplicationContext.getContext() == null");
        } else {
            if (context2.getResources().getDrawable(notification.icon) == null) {
                this.f144993f.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.f78060x313c79;
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f144993f.defaults);
        android.app.Notification notification2 = this.f144993f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationItem", "notificaiton.defaults: %d, notification.sound: %s, notification.vibrate: %s", valueOf, notification2.sound, qm.z.a(notification2.vibrate));
        try {
            java.util.Set set = qm.e.f446158b;
            if (((android.media.AudioManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio")).getRingerMode() == 1) {
                android.app.Notification notification3 = this.f144993f;
                if (notification3.defaults != 2 && notification3.vibrate == null) {
                    notification3.defaults = 0;
                    notification3.sound = null;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationItem", "mode == vibrate & wechat shake is close, so notification switch to silent");
                }
            }
            if (fp.h.c(26)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationItem", "manual add led to notification");
                android.app.Notification notification4 = this.f144993f;
                notification4.ledARGB = -16711936;
                notification4.ledOnMS = 300;
                notification4.ledOffMS = 1000;
            }
            new z2.n1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).c(this.f144991d, this.f144993f);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NotificationItem", e17, "Notification Exception?", new java.lang.Object[0]);
        }
        long j17 = this.f144996i;
        if (j17 == 0 || j17 == 0) {
            return;
        }
        java.lang.String string = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.p971x6de15a2e.x2.j()).getString("com.tencent.preference.notification.key.all.notified.msgid", "");
        if (string.length() > 3000) {
            string = string.substring(string.length() / 2, string.length());
        }
        if (com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.e0.e(j17)) {
            return;
        }
        java.lang.String str = string + j17 + "%";
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.p971x6de15a2e.x2.j();
        o4Var.getClass();
        o4Var.putString("com.tencent.preference.notification.key.all.notified.msgid", str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m43393x9616526c() {
        return "id: " + this.f144991d + ",msgId: " + this.f144996i + ",userName: " + this.f144995h + ",unreadCount: " + this.f144997m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f144991d);
        java.lang.String str = this.f144995h;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeParcelable(this.f144992e, 0);
        parcel.writeParcelable(this.f144993f, 0);
        parcel.writeParcelable(this.f144994g, 0);
        parcel.writeByte(this.f144998n ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f144996i);
        parcel.writeInt(this.f144997m);
    }

    public C10313x2dcd4ebe(int i17, android.app.Notification notification, boolean z17) {
        this(i17, null, notification, z17, 0);
    }

    public C10313x2dcd4ebe(int i17, java.lang.String str, android.app.Notification notification, boolean z17, int i18) {
        this.f144996i = 0L;
        this.f144997m = 0;
        this.f144998n = true;
        this.f144999o = 0;
        this.f145000p = 0;
        this.f144991d = i17;
        this.f144995h = str;
        this.f144992e = notification.largeIcon;
        this.f144993f = notification;
        this.f144998n = z17;
        this.f144999o = i18;
    }

    public C10313x2dcd4ebe(android.os.Parcel parcel, com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.j0 j0Var) {
        this.f144991d = -1;
        this.f144996i = 0L;
        this.f144997m = 0;
        this.f144998n = true;
        this.f144999o = 0;
        this.f145000p = 0;
        if (parcel == null) {
            return;
        }
        this.f144991d = parcel.readInt();
        this.f144995h = parcel.readString();
        this.f144992e = (android.graphics.Bitmap) parcel.readParcelable(android.graphics.Bitmap.class.getClassLoader());
        this.f144993f = (android.app.Notification) parcel.readParcelable(android.app.Notification.class.getClassLoader());
        this.f144994g = (android.app.PendingIntent) parcel.readParcelable(android.app.PendingIntent.class.getClassLoader());
        this.f144998n = parcel.readByte() != 0;
        this.f144996i = parcel.readLong();
        this.f144997m = parcel.readInt();
    }
}
