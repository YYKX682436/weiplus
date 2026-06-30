package ir5;

/* loaded from: classes12.dex */
public class j implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.lang.String readString = parcel.readString();
        android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) android.os.ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
        android.os.ParcelFileDescriptor parcelFileDescriptor2 = (android.os.ParcelFileDescriptor) android.os.ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
        java.lang.String readString2 = parcel.readString();
        if (parcelFileDescriptor == null || parcelFileDescriptor2 == null) {
            return null;
        }
        return new com.p314xaae8f345.p2833x33330b.C22995x3ecd368e(readString, parcelFileDescriptor.detachFd(), parcelFileDescriptor2.detachFd(), readString2, null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.p2833x33330b.C22995x3ecd368e[i17];
    }
}
