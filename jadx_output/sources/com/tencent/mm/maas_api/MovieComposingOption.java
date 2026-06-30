package com.tencent.mm.maas_api;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/maas_api/MovieComposingOption;", "Landroid/os/Parcelable;", "maas-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MovieComposingOption implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.maas_api.MovieComposingOption> CREATOR = new pp0.v0();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f68644d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f68645e;

    public MovieComposingOption(boolean z17, boolean z18) {
        this.f68644d = z17;
        this.f68645e = z18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f68644d ? 1 : 0);
        out.writeInt(this.f68645e ? 1 : 0);
    }
}
