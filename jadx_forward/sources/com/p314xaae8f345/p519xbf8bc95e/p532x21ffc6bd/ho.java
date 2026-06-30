package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes4.dex */
public final class ho {
    private static <T extends android.os.Parcelable> T a(T t17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.writeParcelable(t17, 0);
        obtain.setDataPosition(0);
        T t18 = (T) obtain.readParcelable(t17.getClass().getClassLoader());
        obtain.recycle();
        return t18;
    }
}
