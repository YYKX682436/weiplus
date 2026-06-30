package pm;

/* loaded from: classes8.dex */
public class c implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.p644x66f1911.C10314x70c3e5df c10314x70c3e5df = new com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.p644x66f1911.C10314x70c3e5df();
        int readInt = parcel.readInt();
        for (int i17 = 0; i17 < readInt; i17++) {
            c10314x70c3e5df.add((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.C10313x2dcd4ebe) parcel.readParcelable(com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.C10313x2dcd4ebe.class.getClassLoader()));
        }
        return c10314x70c3e5df;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.p644x66f1911.C10314x70c3e5df[i17];
    }
}
