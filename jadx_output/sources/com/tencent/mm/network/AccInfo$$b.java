package com.tencent.mm.network;

/* loaded from: classes12.dex */
public final /* synthetic */ class AccInfo$$b implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.util.Map.Entry entry2 = (java.util.Map.Entry) obj2;
        android.os.Parcelable.Creator<com.tencent.mm.network.AccInfo> creator = com.tencent.mm.network.AccInfo.CREATOR;
        try {
            return com.tencent.mm.sdk.platformtools.t8.j(((r45.hx3) entry.getKey()).toByteArray()).compareTo(com.tencent.mm.sdk.platformtools.t8.j(((r45.hx3) entry2.getKey()).toByteArray()));
        } catch (java.io.IOException unused) {
            return 1;
        }
    }
}
