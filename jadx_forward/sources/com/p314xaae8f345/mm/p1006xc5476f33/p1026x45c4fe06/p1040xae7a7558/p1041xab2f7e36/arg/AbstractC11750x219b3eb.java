package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg */
/* loaded from: classes13.dex */
public abstract class AbstractC11750x219b3eb implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.InterfaceC11753x43f81f3c {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f158574d;

    public AbstractC11750x219b3eb(android.os.Parcel parcel, java.lang.Object obj) {
        this.f158574d = parcel.readString();
    }

    public boolean a(z81.i iVar, android.graphics.Canvas canvas) {
        return false;
    }

    public void b(android.os.Parcel parcel) {
        this.f158574d = parcel.readString();
    }

    /* renamed from: equals */
    public boolean mo50000xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb) {
            java.lang.String str = this.f158574d;
            java.lang.String str2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb) obj).f158574d;
            if (str == str2) {
                return true;
            }
            if (str != null && str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int mo50001x8cdac1b() {
        return super.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m50002x9616526c() {
        return java.lang.String.format("method %s", this.f158574d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158574d);
    }

    public AbstractC11750x219b3eb(android.os.Parcel parcel) {
        b(parcel);
    }
}
