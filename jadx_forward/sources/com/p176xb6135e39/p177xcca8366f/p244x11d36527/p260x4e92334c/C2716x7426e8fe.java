package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p260x4e92334c;

/* renamed from: com.google.android.material.stateful.ExtendableSavedState */
/* loaded from: classes13.dex */
public class C2716x7426e8fe extends p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.p244x11d36527.p260x4e92334c.C2716x7426e8fe> f7862x681a0c0c = new na.a();

    /* renamed from: f, reason: collision with root package name */
    public final x.n f126069f;

    public C2716x7426e8fe(android.os.Parcelable parcelable) {
        super(parcelable);
        this.f126069f = new x.n();
    }

    /* renamed from: toString */
    public java.lang.String m20346x9616526c() {
        return "ExtendableSavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " states=" + this.f126069f + "}";
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.f92645d, i17);
        x.n nVar = this.f126069f;
        int i18 = nVar.f532379f;
        parcel.writeInt(i18);
        java.lang.String[] strArr = new java.lang.String[i18];
        android.os.Bundle[] bundleArr = new android.os.Bundle[i18];
        for (int i19 = 0; i19 < i18; i19++) {
            strArr[i19] = (java.lang.String) nVar.h(i19);
            bundleArr[i19] = (android.os.Bundle) nVar.l(i19);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public C2716x7426e8fe(android.os.Parcel parcel, java.lang.ClassLoader classLoader, na.a aVar) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        java.lang.String[] strArr = new java.lang.String[readInt];
        parcel.readStringArray(strArr);
        android.os.Bundle[] bundleArr = new android.os.Bundle[readInt];
        parcel.readTypedArray(bundleArr, android.os.Bundle.CREATOR);
        this.f126069f = new x.n(readInt);
        for (int i17 = 0; i17 < readInt; i17++) {
            this.f126069f.put(strArr[i17], bundleArr[i17]);
        }
    }
}
