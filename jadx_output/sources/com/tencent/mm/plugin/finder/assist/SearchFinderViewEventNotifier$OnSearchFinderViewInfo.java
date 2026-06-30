package com.tencent.mm.plugin.finder.assist;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/finder/assist/SearchFinderViewEventNotifier$OnSearchFinderViewInfo", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/finder/assist/j9", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class SearchFinderViewEventNotifier$OnSearchFinderViewInfo implements android.os.Parcelable {
    public static final com.tencent.mm.plugin.finder.assist.j9 CREATOR = new com.tencent.mm.plugin.finder.assist.j9(null);

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f101992d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f101993e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.f101992d);
        parcel.writeString(this.f101993e);
    }
}
