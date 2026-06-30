package ab1;

/* loaded from: classes.dex */
public final class d implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        ab1.c cVar = (ab1.c) kz5.z.U(ab1.c.values(), parcel.readInt());
        if (cVar == null) {
            cVar = ab1.c.f2712h;
        }
        return new com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$SelectRequest(cVar, parcel.createStringArrayList(), parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$SelectRequest[i17];
    }
}
