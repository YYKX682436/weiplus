package com.tencent.mm.plugin.appbrand.canvas.widget;

/* loaded from: classes7.dex */
public class DrawCanvasArg implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.canvas.widget.DrawCanvasArg> CREATOR = new h91.c();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f77165d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f77166e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f77167f;

    /* renamed from: g, reason: collision with root package name */
    public final long f77168g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f77169h;

    public DrawCanvasArg(android.os.Parcel parcel) {
        this.f77167f = new java.util.ArrayList();
        this.f77165d = parcel.readInt() == 1;
        this.f77166e = parcel.readString();
        this.f77167f = parcel.readArrayList(com.tencent.mm.plugin.appbrand.canvas.widget.DrawCanvasArg.class.getClassLoader());
        this.f77168g = parcel.readLong();
        this.f77169h = parcel.readInt() == 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f77165d ? 1 : 0);
        parcel.writeString(this.f77166e);
        parcel.writeList(this.f77167f);
        parcel.writeLong(this.f77168g);
        parcel.writeInt(this.f77169h ? 1 : 0);
    }
}
