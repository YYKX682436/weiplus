package com.tencent.mm.plugin.facedetectlight.Utils;

/* loaded from: classes5.dex */
public class YTAGFaceReflectResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.facedetectlight.Utils.YTAGFaceReflectResult> CREATOR = new m72.a();
    public byte[] data;
    public int result;
    public byte[] sidedata;

    public YTAGFaceReflectResult(int i17) {
        this.result = i17;
        this.data = null;
        this.sidedata = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
    }

    public void setResult(int i17) {
        this.result = i17;
    }

    public void setSidedata(byte[] bArr) {
        this.sidedata = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.result);
        parcel.writeByteArray(this.data);
        parcel.writeByteArray(this.sidedata);
    }

    public YTAGFaceReflectResult(android.os.Parcel parcel) {
        this.result = parcel.readInt();
        this.data = parcel.createByteArray();
        this.sidedata = parcel.createByteArray();
    }
}
