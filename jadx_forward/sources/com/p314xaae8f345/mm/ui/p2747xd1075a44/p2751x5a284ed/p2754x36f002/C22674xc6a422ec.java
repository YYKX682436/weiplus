package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2754x36f002;

/* renamed from: com.tencent.mm.ui.widget.cedit.util.ParcelableParcel */
/* loaded from: classes13.dex */
public class C22674xc6a422ec implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.ClassLoaderCreator<com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2754x36f002.C22674xc6a422ec> f39752x681a0c0c = new jl5.a();

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Parcel f293160d;

    public C22674xc6a422ec(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        int i17;
        android.os.Parcel obtain = android.os.Parcel.obtain();
        this.f293160d = obtain;
        int readInt = parcel.readInt();
        if (readInt < 0) {
            throw new java.lang.IllegalArgumentException("Negative size read from parcel");
        }
        int dataPosition = parcel.dataPosition();
        if (readInt == 0) {
            i17 = dataPosition;
        } else {
            if ((readInt <= 0 || dataPosition > Integer.MAX_VALUE - readInt) && (readInt >= 0 || dataPosition < Integer.MIN_VALUE - readInt)) {
                throw new java.lang.IllegalArgumentException("Addition overflow: " + dataPosition + " + " + readInt);
            }
            i17 = dataPosition + readInt;
        }
        parcel.setDataPosition(i17);
        obtain.appendFrom(parcel, dataPosition, readInt);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        android.os.Parcel parcel2 = this.f293160d;
        parcel.writeInt(parcel2.dataSize());
        parcel.appendFrom(parcel2, 0, parcel2.dataSize());
    }
}
