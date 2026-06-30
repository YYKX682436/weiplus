package com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.p644x66f1911;

/* renamed from: com.tencent.mm.booter.notification.queue.NotificationQueue$ParcelNotificationQueue */
/* loaded from: classes8.dex */
public class C10314x70c3e5df extends java.util.LinkedList<com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.C10313x2dcd4ebe> implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.p644x66f1911.C10314x70c3e5df> f27773x681a0c0c = new pm.c();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(size());
        java.util.Iterator<com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.C10313x2dcd4ebe> it = iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), 0);
        }
    }
}
