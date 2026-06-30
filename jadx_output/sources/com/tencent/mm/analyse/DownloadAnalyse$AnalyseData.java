package com.tencent.mm.analyse;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/analyse/DownloadAnalyse$AnalyseData", "Landroid/os/Parcelable;", "feature-cdn_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class DownloadAnalyse$AnalyseData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.analyse.DownloadAnalyse$AnalyseData> CREATOR = new nk.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f53188d;

    public DownloadAnalyse$AnalyseData(java.util.HashSet data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f53188d = data;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.analyse.DownloadAnalyse$AnalyseData) && kotlin.jvm.internal.o.b(this.f53188d, ((com.tencent.mm.analyse.DownloadAnalyse$AnalyseData) obj).f53188d);
    }

    public int hashCode() {
        return this.f53188d.hashCode();
    }

    public java.lang.String toString() {
        return "AnalyseData(data=" + this.f53188d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        java.util.HashSet hashSet = this.f53188d;
        out.writeInt(hashSet.size());
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.analyse.DownloadAnalyse$DownloadIndicator) it.next()).writeToParcel(out, i17);
        }
    }
}
