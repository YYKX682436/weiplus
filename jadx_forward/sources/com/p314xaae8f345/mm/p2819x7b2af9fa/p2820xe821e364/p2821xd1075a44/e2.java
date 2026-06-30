package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes7.dex */
public class e2 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(final android.os.Parcel parcel) {
        return new android.os.Parcelable(parcel) { // from class: com.tencent.mm.xcompat.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem

            /* renamed from: CREATOR */
            public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22951xc8ca1c25> f39972x681a0c0c = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.e2();

            /* renamed from: d, reason: collision with root package name */
            public final int f295963d;

            /* renamed from: e, reason: collision with root package name */
            public final int f295964e;

            /* renamed from: f, reason: collision with root package name */
            public final int[] f295965f;

            /* renamed from: g, reason: collision with root package name */
            public final boolean f295966g;

            {
                this.f295963d = parcel.readInt();
                this.f295964e = parcel.readInt();
                this.f295966g = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f295965f = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            /* renamed from: toString */
            public java.lang.String m83626x9616526c() {
                return "FullSpanItem{mPosition=" + this.f295963d + ", mGapDir=" + this.f295964e + ", mHasUnwantedGapAfter=" + this.f295966g + ", mGapPerSpan=" + java.util.Arrays.toString(this.f295965f) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel parcel2, int i17) {
                parcel2.writeInt(this.f295963d);
                parcel2.writeInt(this.f295964e);
                parcel2.writeInt(this.f295966g ? 1 : 0);
                int[] iArr = this.f295965f;
                if (iArr == null || iArr.length <= 0) {
                    parcel2.writeInt(0);
                } else {
                    parcel2.writeInt(iArr.length);
                    parcel2.writeIntArray(iArr);
                }
            }
        };
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22951xc8ca1c25[i17];
    }
}
