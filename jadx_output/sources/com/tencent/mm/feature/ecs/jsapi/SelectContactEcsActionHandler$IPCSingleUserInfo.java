package com.tencent.mm.feature.ecs.jsapi;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/feature/ecs/jsapi/SelectContactEcsActionHandler$IPCSingleUserInfo", "Landroid/os/Parcelable;", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final /* data */ class SelectContactEcsActionHandler$IPCSingleUserInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCSingleUserInfo> CREATOR = new t00.s1();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f65629d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f65630e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f65631f;

    public SelectContactEcsActionHandler$IPCSingleUserInfo(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f65629d = str;
        this.f65630e = str2;
        this.f65631f = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCSingleUserInfo)) {
            return false;
        }
        com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCSingleUserInfo selectContactEcsActionHandler$IPCSingleUserInfo = (com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCSingleUserInfo) obj;
        return kotlin.jvm.internal.o.b(this.f65629d, selectContactEcsActionHandler$IPCSingleUserInfo.f65629d) && kotlin.jvm.internal.o.b(this.f65630e, selectContactEcsActionHandler$IPCSingleUserInfo.f65630e) && kotlin.jvm.internal.o.b(this.f65631f, selectContactEcsActionHandler$IPCSingleUserInfo.f65631f);
    }

    public int hashCode() {
        java.lang.String str = this.f65629d;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f65630e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f65631f;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "IPCSingleUserInfo(displayName=" + this.f65629d + ", avatarUrl=" + this.f65630e + ", errorMsg=" + this.f65631f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f65629d);
        out.writeString(this.f65630e);
        out.writeString(this.f65631f);
    }
}
