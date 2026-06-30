package com.tencent.mm.booter.notification;

/* loaded from: classes11.dex */
public class j0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.booter.notification.NotificationItem(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.booter.notification.NotificationItem[i17];
    }
}
