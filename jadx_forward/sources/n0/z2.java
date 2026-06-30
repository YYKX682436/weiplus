package n0;

/* loaded from: classes14.dex */
public final class z2 implements android.os.Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.ClassLoaderCreator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public p012xc85e97e9.p064x38a77192.p068x5c71cfd8.C1057x79386292 createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        n0.r4 r4Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        if (classLoader == null) {
            classLoader = n0.z2.class.getClassLoader();
        }
        java.lang.Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            r4Var = n0.w2.f415272a;
        } else if (readInt == 1) {
            r4Var = n0.h5.f415062a;
        } else {
            if (readInt != 2) {
                throw new java.lang.IllegalStateException("Unsupported MutableState policy " + readInt + " was restored");
            }
            r4Var = n0.c4.f415007a;
        }
        return new p012xc85e97e9.p064x38a77192.p068x5c71cfd8.C1057x79386292(readValue, r4Var);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        return createFromParcel(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new p012xc85e97e9.p064x38a77192.p068x5c71cfd8.C1057x79386292[i17];
    }
}
