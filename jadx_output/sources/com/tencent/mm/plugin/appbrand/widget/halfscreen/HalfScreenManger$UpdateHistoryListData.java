package com.tencent.mm.plugin.appbrand.widget.halfscreen;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/widget/halfscreen/HalfScreenManger$UpdateHistoryListData", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class HalfScreenManger$UpdateHistoryListData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger$UpdateHistoryListData> CREATOR = new com.tencent.mm.plugin.appbrand.widget.halfscreen.p();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f91143d;

    /* renamed from: e, reason: collision with root package name */
    public final int f91144e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f91145f;

    /* renamed from: g, reason: collision with root package name */
    public final int f91146g;

    /* renamed from: h, reason: collision with root package name */
    public final int f91147h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f91148i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f91149m;

    public HalfScreenManger$UpdateHistoryListData(java.lang.String username, int i17, boolean z17, int i18, int i19, java.lang.String str, boolean z18) {
        kotlin.jvm.internal.o.g(username, "username");
        this.f91143d = username;
        this.f91144e = i17;
        this.f91145f = z17;
        this.f91146g = i18;
        this.f91147h = i19;
        this.f91148i = str;
        this.f91149m = z18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger$UpdateHistoryListData)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger$UpdateHistoryListData halfScreenManger$UpdateHistoryListData = (com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger$UpdateHistoryListData) obj;
        return kotlin.jvm.internal.o.b(this.f91143d, halfScreenManger$UpdateHistoryListData.f91143d) && this.f91144e == halfScreenManger$UpdateHistoryListData.f91144e && this.f91145f == halfScreenManger$UpdateHistoryListData.f91145f && this.f91146g == halfScreenManger$UpdateHistoryListData.f91146g && this.f91147h == halfScreenManger$UpdateHistoryListData.f91147h && kotlin.jvm.internal.o.b(this.f91148i, halfScreenManger$UpdateHistoryListData.f91148i) && this.f91149m == halfScreenManger$UpdateHistoryListData.f91149m;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f91143d.hashCode() * 31) + java.lang.Integer.hashCode(this.f91144e)) * 31) + java.lang.Boolean.hashCode(this.f91145f)) * 31) + java.lang.Integer.hashCode(this.f91146g)) * 31) + java.lang.Integer.hashCode(this.f91147h)) * 31;
        java.lang.String str = this.f91148i;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f91149m);
    }

    public java.lang.String toString() {
        return "UpdateHistoryListData(username=" + this.f91143d + ", versionType=" + this.f91144e + ", fromBackground=" + this.f91145f + ", reportScene=" + this.f91146g + ", updateReason=" + this.f91147h + ", visitingSessionId=" + this.f91148i + ", isForPreRender=" + this.f91149m + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f91143d);
        out.writeInt(this.f91144e);
        out.writeInt(this.f91145f ? 1 : 0);
        out.writeInt(this.f91146g);
        out.writeInt(this.f91147h);
        out.writeString(this.f91148i);
        out.writeInt(this.f91149m ? 1 : 0);
    }
}
