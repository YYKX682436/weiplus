package com.tencent.mm.media.camera;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/media/camera/CameraSupportInfo;", "Landroid/os/Parcelable;", "CREATOR", "nr0/b", "plugin-camera_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final /* data */ class CameraSupportInfo implements android.os.Parcelable {
    public static final nr0.b CREATOR = new nr0.b(null);

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f68856d;

    /* renamed from: e, reason: collision with root package name */
    public int f68857e;

    /* renamed from: f, reason: collision with root package name */
    public int f68858f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f68859g;

    public CameraSupportInfo(java.lang.String id6, int i17, int i18, java.lang.String str) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(str, "str");
        this.f68856d = id6;
        this.f68857e = i17;
        this.f68858f = i18;
        this.f68859g = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.media.camera.CameraSupportInfo)) {
            return false;
        }
        com.tencent.mm.media.camera.CameraSupportInfo cameraSupportInfo = (com.tencent.mm.media.camera.CameraSupportInfo) obj;
        return kotlin.jvm.internal.o.b(this.f68856d, cameraSupportInfo.f68856d) && this.f68857e == cameraSupportInfo.f68857e && this.f68858f == cameraSupportInfo.f68858f && kotlin.jvm.internal.o.b(this.f68859g, cameraSupportInfo.f68859g);
    }

    public int hashCode() {
        return (((((this.f68856d.hashCode() * 31) + java.lang.Integer.hashCode(this.f68857e)) * 31) + java.lang.Integer.hashCode(this.f68858f)) * 31) + this.f68859g.hashCode();
    }

    public java.lang.String toString() {
        return "CameraSupportInfo(id=" + this.f68856d + ", lensFacing=" + this.f68857e + ", level=" + this.f68858f + ", str=" + this.f68859g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.f68856d);
        parcel.writeInt(this.f68857e);
        parcel.writeInt(this.f68858f);
        parcel.writeString(this.f68859g);
    }

    public /* synthetic */ CameraSupportInfo(java.lang.String str, int i17, int i18, java.lang.String str2, int i19, kotlin.jvm.internal.i iVar) {
        this((i19 & 1) != 0 ? "" : str, (i19 & 2) != 0 ? -1 : i17, (i19 & 4) != 0 ? -1 : i18, (i19 & 8) != 0 ? "" : str2);
    }
}
