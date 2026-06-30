package com.tencent.mm.booter.notification.queue;

/* loaded from: classes8.dex */
public class NotificationQueue$ParcelNotificationQueue extends java.util.LinkedList<com.tencent.mm.booter.notification.NotificationItem> implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.booter.notification.queue.NotificationQueue$ParcelNotificationQueue> CREATOR = new pm.c();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(size());
        java.util.Iterator<com.tencent.mm.booter.notification.NotificationItem> it = iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), 0);
        }
    }
}
