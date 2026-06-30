package c85;

/* loaded from: classes8.dex */
public final class f implements android.os.Parcelable.Creator {
    public f(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        java.lang.String readString2 = parcel.readString();
        java.lang.Object readValue = parcel.readValue(java.lang.Double.TYPE.getClassLoader());
        java.lang.Double d17 = readValue instanceof java.lang.Double ? (java.lang.Double) readValue : null;
        java.lang.Object readValue2 = parcel.readValue(java.lang.Double.TYPE.getClassLoader());
        java.lang.Double d18 = readValue2 instanceof java.lang.Double ? (java.lang.Double) readValue2 : null;
        java.lang.Object readValue3 = parcel.readValue(java.lang.Double.TYPE.getClassLoader());
        return new com.p314xaae8f345.mm.p2610xe8058ca2.C21013x64a751f(readString, readString2, d17, d18, readValue3 instanceof java.lang.Double ? (java.lang.Double) readValue3 : null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p2610xe8058ca2.C21013x64a751f[i17];
    }
}
