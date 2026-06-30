package com.tencent.mm.plugin.appbrand.canvas.action.arg;

/* loaded from: classes13.dex */
public class SetLineDashActionArg extends com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.canvas.action.arg.SetLineDashActionArg> CREATOR = new b91.d0();

    /* renamed from: e, reason: collision with root package name */
    public float[] f77116e;

    /* renamed from: f, reason: collision with root package name */
    public float f77117f;

    public SetLineDashActionArg(android.os.Parcel parcel) {
        super(parcel);
        this.f77116e = null;
        this.f77117f = Float.MIN_VALUE;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public void b(android.os.Parcel parcel) {
        this.f77041d = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            float[] fArr = new float[readInt];
            this.f77116e = fArr;
            parcel.readFloatArray(fArr);
        }
        this.f77117f = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.canvas.action.arg.SetLineDashActionArg) || !super.equals(obj)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.canvas.action.arg.SetLineDashActionArg setLineDashActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.SetLineDashActionArg) obj;
        return java.lang.Float.compare(setLineDashActionArg.f77117f, this.f77117f) == 0 && java.util.Arrays.equals(this.f77116e, setLineDashActionArg.f77116e);
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public int hashCode() {
        return (java.util.Objects.hash(java.lang.Integer.valueOf(super.hashCode()), java.lang.Float.valueOf(this.f77117f)) * 31) + java.util.Arrays.hashCode(this.f77116e);
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77041d);
        float[] fArr = this.f77116e;
        if (fArr != null) {
            parcel.writeInt(fArr.length);
            parcel.writeFloatArray(this.f77116e);
        }
        parcel.writeFloat(this.f77117f);
    }
}
