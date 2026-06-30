package com.tencent.mm.modelscan;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/modelscan/ScanCodeInfo;", "Landroid/os/Parcelable;", "j21/a", "plugin-messenger-foundation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class ScanCodeInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.modelscan.ScanCodeInfo> CREATOR;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f71273d;

    /* renamed from: e, reason: collision with root package name */
    public final int f71274e;

    static {
        new j21.a(null);
        CREATOR = new j21.b();
    }

    public ScanCodeInfo(java.lang.String codeContent, int i17) {
        kotlin.jvm.internal.o.g(codeContent, "codeContent");
        this.f71273d = codeContent;
        this.f71274e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.modelscan.ScanCodeInfo)) {
            return false;
        }
        com.tencent.mm.modelscan.ScanCodeInfo scanCodeInfo = (com.tencent.mm.modelscan.ScanCodeInfo) obj;
        return kotlin.jvm.internal.o.b(this.f71273d, scanCodeInfo.f71273d) && this.f71274e == scanCodeInfo.f71274e;
    }

    public int hashCode() {
        return (this.f71273d.hashCode() * 31) + java.lang.Integer.hashCode(this.f71274e);
    }

    public java.lang.String toString() {
        return "ScanCodeInfo{codeContent: " + this.f71273d + ", sourceBizType: " + this.f71274e + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f71273d);
        out.writeInt(this.f71274e);
    }
}
