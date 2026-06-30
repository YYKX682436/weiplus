package t40;

/* loaded from: classes3.dex */
public final class c implements android.os.Parcelable.Creator {
    public c(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.api.p745xc4aaf986.C10598x47b4a646 c10598x47b4a646 = new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.api.p745xc4aaf986.C10598x47b4a646();
        c10598x47b4a646.f148136d = parcel.readInt();
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        c10598x47b4a646.f148137e = readString;
        c10598x47b4a646.f148138f = parcel.readString();
        c10598x47b4a646.f148139g = parcel.readString();
        c10598x47b4a646.f148140h = parcel.readLong();
        java.lang.String readString2 = parcel.readString();
        c10598x47b4a646.f148141i = readString2 != null ? readString2 : "";
        return c10598x47b4a646;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.api.p745xc4aaf986.C10598x47b4a646[i17];
    }
}
