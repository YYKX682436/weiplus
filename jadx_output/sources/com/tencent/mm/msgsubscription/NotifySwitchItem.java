package com.tencent.mm.msgsubscription;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/msgsubscription/NotifySwitchItem;", "Landroid/os/Parcelable;", "wxbiz-msgsubscription-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final /* data */ class NotifySwitchItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.msgsubscription.NotifySwitchItem> CREATOR = new d31.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f71767d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f71768e;

    /* renamed from: f, reason: collision with root package name */
    public final int f71769f;

    public NotifySwitchItem(java.lang.String bizUsername, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        this.f71767d = bizUsername;
        this.f71768e = z17;
        this.f71769f = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.msgsubscription.NotifySwitchItem)) {
            return false;
        }
        com.tencent.mm.msgsubscription.NotifySwitchItem notifySwitchItem = (com.tencent.mm.msgsubscription.NotifySwitchItem) obj;
        return kotlin.jvm.internal.o.b(this.f71767d, notifySwitchItem.f71767d) && this.f71768e == notifySwitchItem.f71768e && this.f71769f == notifySwitchItem.f71769f;
    }

    public int hashCode() {
        return (((this.f71767d.hashCode() * 31) + java.lang.Boolean.hashCode(this.f71768e)) * 31) + java.lang.Integer.hashCode(this.f71769f);
    }

    public java.lang.String toString() {
        return "NotifySwitchItem(bizUsername=" + this.f71767d + ", isOpen=" + this.f71768e + ", importantNotifyNum=" + this.f71769f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f71767d);
        out.writeInt(this.f71768e ? 1 : 0);
        out.writeInt(this.f71769f);
    }
}
