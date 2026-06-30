package com.tencent.mm.plugin.aa.model.cgi;

/* loaded from: classes9.dex */
public class NetSceneNewAAQueryPFInfo$SessionIdListParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$SessionIdListParcel> CREATOR = new i61.o();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f72424d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f72425e;

    public NetSceneNewAAQueryPFInfo$SessionIdListParcel() {
        this.f72424d = new java.util.ArrayList();
        this.f72425e = new java.util.ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "SessionIdListParcel{username=" + this.f72424d + ", groupid=" + this.f72425e + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeStringList(this.f72424d);
        parcel.writeStringList(this.f72425e);
    }

    public NetSceneNewAAQueryPFInfo$SessionIdListParcel(android.os.Parcel parcel) {
        this.f72424d = new java.util.ArrayList();
        this.f72425e = new java.util.ArrayList();
        this.f72424d = parcel.createStringArrayList();
        this.f72425e = parcel.createStringArrayList();
    }
}
