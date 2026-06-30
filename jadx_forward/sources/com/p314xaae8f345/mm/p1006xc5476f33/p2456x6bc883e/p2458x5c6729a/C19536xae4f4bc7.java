package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a;

/* renamed from: com.tencent.mm.plugin.wepkg.event.LiteInfoUpdateCompleteNotify */
/* loaded from: classes8.dex */
public class C19536xae4f4bc7 implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f269863d;

    public C19536xae4f4bc7(java.lang.String str) {
        this.f269863d = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f269863d);
    }
}
