package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes8.dex */
public final class j9 implements android.os.Parcelable.Creator {
    public j9(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.plugin.finder.assist.SearchFinderViewEventNotifier$OnSearchFinderViewInfo searchFinderViewEventNotifier$OnSearchFinderViewInfo = new com.tencent.mm.plugin.finder.assist.SearchFinderViewEventNotifier$OnSearchFinderViewInfo();
        searchFinderViewEventNotifier$OnSearchFinderViewInfo.f101992d = parcel.readString();
        searchFinderViewEventNotifier$OnSearchFinderViewInfo.f101993e = parcel.readString();
        return searchFinderViewEventNotifier$OnSearchFinderViewInfo;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.finder.assist.SearchFinderViewEventNotifier$OnSearchFinderViewInfo[i17];
    }
}
