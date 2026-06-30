package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a;

/* renamed from: com.tencent.mm.plugin.wepkg.event.ForceUpdateNotify */
/* loaded from: classes8.dex */
public class C19535x1bd057dd implements android.os.Parcelable {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f269861e = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String[] f269862d;

    public C19535x1bd057dd(java.lang.String[] strArr) {
        this.f269862d = strArr;
    }

    public static void a() {
        java.util.Set set = f269861e;
        if (((java.util.HashSet) set).size() != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.h.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.C19535x1bd057dd((java.lang.String[]) ((java.util.HashSet) set).toArray(new java.lang.String[((java.util.HashSet) set).size()])), new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.b());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeStringArray(this.f269862d);
    }
}
