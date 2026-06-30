package com.p314xaae8f345.mm.p2776x373aa5;

/* renamed from: com.tencent.mm.view.ViewAnimHelper$ViewInfo */
/* loaded from: classes9.dex */
public class C22815x98b0aff3 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p2776x373aa5.C22815x98b0aff3> f39837x681a0c0c = new ym5.t6();

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f295046d;

    public C22815x98b0aff3(android.graphics.Rect rect) {
        android.graphics.Rect rect2 = new android.graphics.Rect();
        this.f295046d = rect2;
        rect2.set(rect);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.f295046d, i17);
    }

    public C22815x98b0aff3(android.os.Parcel parcel) {
        this.f295046d = new android.graphics.Rect();
        this.f295046d = (android.graphics.Rect) parcel.readParcelable(android.graphics.Rect.class.getClassLoader());
    }
}
