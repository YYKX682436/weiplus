package com.google.android.material.stateful;

/* loaded from: classes13.dex */
public class ExtendableSavedState extends androidx.customview.view.AbsSavedState {
    public static final android.os.Parcelable.Creator<com.google.android.material.stateful.ExtendableSavedState> CREATOR = new na.a();

    /* renamed from: f, reason: collision with root package name */
    public final x.n f44536f;

    public ExtendableSavedState(android.os.Parcelable parcelable) {
        super(parcelable);
        this.f44536f = new x.n();
    }

    public java.lang.String toString() {
        return "ExtendableSavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " states=" + this.f44536f + "}";
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.f11112d, i17);
        x.n nVar = this.f44536f;
        int i18 = nVar.f450846f;
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

    public ExtendableSavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader, na.a aVar) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        java.lang.String[] strArr = new java.lang.String[readInt];
        parcel.readStringArray(strArr);
        android.os.Bundle[] bundleArr = new android.os.Bundle[readInt];
        parcel.readTypedArray(bundleArr, android.os.Bundle.CREATOR);
        this.f44536f = new x.n(readInt);
        for (int i17 = 0; i17 < readInt; i17++) {
            this.f44536f.put(strArr[i17], bundleArr[i17]);
        }
    }
}
