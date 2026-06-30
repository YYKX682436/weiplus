package com.tencent.mm.feature.ecs.jsapi;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/feature/ecs/jsapi/SelectContactEcsActionHandler$IPCUserInfo", "Landroid/os/Parcelable;", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final /* data */ class SelectContactEcsActionHandler$IPCUserInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCUserInfo> CREATOR = new t00.t1();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f65632d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f65633e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Integer f65634f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Integer f65635g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f65636h;

    public SelectContactEcsActionHandler$IPCUserInfo(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, java.lang.String str3) {
        this.f65632d = str;
        this.f65633e = str2;
        this.f65634f = num;
        this.f65635g = num2;
        this.f65636h = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCUserInfo)) {
            return false;
        }
        com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCUserInfo selectContactEcsActionHandler$IPCUserInfo = (com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCUserInfo) obj;
        return kotlin.jvm.internal.o.b(this.f65632d, selectContactEcsActionHandler$IPCUserInfo.f65632d) && kotlin.jvm.internal.o.b(this.f65633e, selectContactEcsActionHandler$IPCUserInfo.f65633e) && kotlin.jvm.internal.o.b(this.f65634f, selectContactEcsActionHandler$IPCUserInfo.f65634f) && kotlin.jvm.internal.o.b(this.f65635g, selectContactEcsActionHandler$IPCUserInfo.f65635g) && kotlin.jvm.internal.o.b(this.f65636h, selectContactEcsActionHandler$IPCUserInfo.f65636h);
    }

    public int hashCode() {
        java.lang.String str = this.f65632d;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f65633e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Integer num = this.f65634f;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.f65635g;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.String str3 = this.f65636h;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "IPCUserInfo(displayName=" + this.f65632d + ", avatarUrl=" + this.f65633e + ", recipientType=" + this.f65634f + ", chatroomCnt=" + this.f65635g + ", errorMsg=" + this.f65636h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f65632d);
        out.writeString(this.f65633e);
        int i18 = 0;
        java.lang.Integer num = this.f65634f;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        java.lang.Integer num2 = this.f65635g;
        if (num2 != null) {
            out.writeInt(1);
            i18 = num2.intValue();
        }
        out.writeInt(i18);
        out.writeString(this.f65636h);
    }
}
