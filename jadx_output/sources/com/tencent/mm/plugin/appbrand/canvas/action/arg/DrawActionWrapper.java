package com.tencent.mm.plugin.appbrand.canvas.action.arg;

/* loaded from: classes13.dex */
public class DrawActionWrapper implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionWrapper> CREATOR = new b91.c();

    /* renamed from: d, reason: collision with root package name */
    public final int f77046d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg f77047e;

    /* renamed from: f, reason: collision with root package name */
    public final org.json.JSONObject f77048f;

    public DrawActionWrapper(android.os.Parcel parcel) {
        int readInt = parcel.readInt();
        this.f77046d = readInt;
        if (readInt != 1) {
            if (readInt != 2) {
                return;
            }
            this.f77047e = (com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg) parcel.readParcelable(com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionWrapper.class.getClassLoader());
        } else {
            try {
                this.f77048f = new org.json.JSONObject(parcel.readString());
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("DrawActionWrapper", e17, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        int i17 = this.f77046d;
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = i17 != 1 ? i17 != 2 ? "" : this.f77047e.f77041d : this.f77048f.optString(ya.b.METHOD);
        return java.lang.String.format("type %d ,method %s", objArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int i18 = this.f77046d;
        parcel.writeInt(i18);
        if (i18 == 1) {
            parcel.writeString(this.f77048f.toString());
        } else {
            if (i18 != 2) {
                return;
            }
            parcel.writeParcelable(this.f77047e, i17);
        }
    }
}
