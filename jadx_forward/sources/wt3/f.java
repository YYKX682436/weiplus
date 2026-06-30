package wt3;

/* loaded from: classes5.dex */
public final class f implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a();
        c16997xb0aa383a.f237244e = parcel.readInt();
        c16997xb0aa383a.f237245f = parcel.readString();
        c16997xb0aa383a.f237248i = parcel.readString();
        c16997xb0aa383a.f237249m = parcel.readByte() != 0;
        c16997xb0aa383a.f237250n = parcel.readByte() != 0;
        c16997xb0aa383a.f237259w = parcel.readInt();
        c16997xb0aa383a.f237260x = parcel.readLong();
        c16997xb0aa383a.f237251o = parcel.readInt();
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        c16997xb0aa383a.f237256t = readString;
        java.lang.String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        c16997xb0aa383a.f237257u = readString2;
        java.lang.String readString3 = parcel.readString();
        if (readString3 == null) {
            readString3 = "";
        }
        c16997xb0aa383a.f237258v = readString3;
        r45.mh4 mh4Var = c16997xb0aa383a.f237243d;
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray != null) {
            try {
                mh4Var.mo11468x92b714fd(createByteArray);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
        }
        if (parcel.dataAvail() > 0) {
            if (parcel.readByte() != 0) {
                c16997xb0aa383a.G = java.lang.Long.valueOf(parcel.readLong());
                c16997xb0aa383a.H = java.lang.Long.valueOf(parcel.readLong());
            }
        }
        return c16997xb0aa383a;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a[i17];
    }
}
