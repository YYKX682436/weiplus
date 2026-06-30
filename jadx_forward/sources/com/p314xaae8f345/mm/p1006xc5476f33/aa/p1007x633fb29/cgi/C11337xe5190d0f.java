package com.p314xaae8f345.mm.p1006xc5476f33.aa.p1007x633fb29.cgi;

/* renamed from: com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$SessionIdListParcel */
/* loaded from: classes9.dex */
public class C11337xe5190d0f implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.aa.p1007x633fb29.cgi.C11337xe5190d0f> f33356x681a0c0c = new i61.o();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f153957d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f153958e;

    public C11337xe5190d0f() {
        this.f153957d = new java.util.ArrayList();
        this.f153958e = new java.util.ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m48625x9616526c() {
        return "SessionIdListParcel{username=" + this.f153957d + ", groupid=" + this.f153958e + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeStringList(this.f153957d);
        parcel.writeStringList(this.f153958e);
    }

    public C11337xe5190d0f(android.os.Parcel parcel) {
        this.f153957d = new java.util.ArrayList();
        this.f153958e = new java.util.ArrayList();
        this.f153957d = parcel.createStringArrayList();
        this.f153958e = parcel.createStringArrayList();
    }
}
