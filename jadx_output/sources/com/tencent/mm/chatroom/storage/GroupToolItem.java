package com.tencent.mm.chatroom.storage;

/* loaded from: classes11.dex */
public class GroupToolItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.chatroom.storage.GroupToolItem> CREATOR = new rn.f();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f63682d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f63683e;

    /* renamed from: f, reason: collision with root package name */
    public long f63684f;

    public GroupToolItem() {
        this.f63682d = "";
        this.f63683e = "";
        this.f63684f = 0L;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        return obj != null && com.tencent.mm.sdk.platformtools.t8.D0(((com.tencent.mm.chatroom.storage.GroupToolItem) obj).f63682d, this.f63682d);
    }

    public java.lang.String toString() {
        return "GroupToolItem{username='" + this.f63682d + "', path='" + this.f63683e + "', updateTime=" + this.f63684f + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f63682d);
        parcel.writeString(this.f63683e);
        parcel.writeLong(this.f63684f);
    }

    public GroupToolItem(java.lang.String str, java.lang.String str2) {
        this.f63684f = 0L;
        this.f63682d = str;
        this.f63683e = str2;
    }

    public GroupToolItem(java.lang.String str, java.lang.String str2, long j17) {
        this.f63682d = str;
        this.f63683e = str2;
        this.f63684f = j17;
    }

    public GroupToolItem(android.os.Parcel parcel) {
        this.f63682d = "";
        this.f63683e = "";
        this.f63684f = 0L;
        this.f63682d = parcel.readString();
        this.f63683e = parcel.readString();
        this.f63684f = parcel.readLong();
    }
}
