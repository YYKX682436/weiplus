package pr;

/* loaded from: classes15.dex */
public final class m0 implements android.os.Parcelable.Creator {
    public m0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        com.p314xaae8f345.mm.p679x5c28046.p683x361a9b.C10444x1291fbaf c10444x1291fbaf = new com.p314xaae8f345.mm.p679x5c28046.p683x361a9b.C10444x1291fbaf();
        c10444x1291fbaf.f146458d = parcel.readInt();
        c10444x1291fbaf.f146459e = parcel.readInt();
        c10444x1291fbaf.f146460f = parcel.readInt();
        c10444x1291fbaf.f146461g = parcel.readInt();
        c10444x1291fbaf.f146462h = parcel.readByte() != 0;
        return c10444x1291fbaf;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p679x5c28046.p683x361a9b.C10444x1291fbaf[i17];
    }
}
