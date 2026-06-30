package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes7.dex */
public class f2 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(final android.os.Parcel parcel) {
        return new android.os.Parcelable(parcel) { // from class: com.tencent.mm.xcompat.recyclerview.widget.StaggeredGridLayoutManager$SavedState

            /* renamed from: CREATOR */
            public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22952x3ddf30fd> f39973x681a0c0c = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.f2();

            /* renamed from: d, reason: collision with root package name */
            public final int f295967d;

            /* renamed from: e, reason: collision with root package name */
            public final int f295968e;

            /* renamed from: f, reason: collision with root package name */
            public final int f295969f;

            /* renamed from: g, reason: collision with root package name */
            public final int[] f295970g;

            /* renamed from: h, reason: collision with root package name */
            public final int f295971h;

            /* renamed from: i, reason: collision with root package name */
            public final int[] f295972i;

            /* renamed from: m, reason: collision with root package name */
            public final java.util.List f295973m;

            /* renamed from: n, reason: collision with root package name */
            public final boolean f295974n;

            /* renamed from: o, reason: collision with root package name */
            public final boolean f295975o;

            /* renamed from: p, reason: collision with root package name */
            public final boolean f295976p;

            {
                this.f295967d = parcel.readInt();
                this.f295968e = parcel.readInt();
                int readInt = parcel.readInt();
                this.f295969f = readInt;
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f295970g = iArr;
                    parcel.readIntArray(iArr);
                }
                int readInt2 = parcel.readInt();
                this.f295971h = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    this.f295972i = iArr2;
                    parcel.readIntArray(iArr2);
                }
                this.f295974n = parcel.readInt() == 1;
                this.f295975o = parcel.readInt() == 1;
                this.f295976p = parcel.readInt() == 1;
                this.f295973m = parcel.readArrayList(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22951xc8ca1c25.class.getClassLoader());
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel parcel2, int i17) {
                parcel2.writeInt(this.f295967d);
                parcel2.writeInt(this.f295968e);
                int i18 = this.f295969f;
                parcel2.writeInt(i18);
                if (i18 > 0) {
                    parcel2.writeIntArray(this.f295970g);
                }
                int i19 = this.f295971h;
                parcel2.writeInt(i19);
                if (i19 > 0) {
                    parcel2.writeIntArray(this.f295972i);
                }
                parcel2.writeInt(this.f295974n ? 1 : 0);
                parcel2.writeInt(this.f295975o ? 1 : 0);
                parcel2.writeInt(this.f295976p ? 1 : 0);
                parcel2.writeList(this.f295973m);
            }
        };
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22952x3ddf30fd[i17];
    }
}
