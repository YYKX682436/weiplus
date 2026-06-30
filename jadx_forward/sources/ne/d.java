package ne;

/* loaded from: classes7.dex */
public final class d implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        k91.z3 z3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        boolean z17 = parcel.readInt() != 0;
        int readInt = parcel.readInt();
        k91.z3 z3Var2 = k91.z3.UNKNOWN;
        int readInt2 = parcel.readInt();
        k91.z3[] m142252xcee59d22 = k91.z3.m142252xcee59d22();
        int length = m142252xcee59d22.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                z3Var = z3Var2;
                break;
            }
            z3Var = m142252xcee59d22[i17];
            if (z3Var.ordinal() == readInt2) {
                break;
            }
            i17++;
        }
        return new com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3898xeaad22a8(z17, readInt, z3Var, parcel.readString(), parcel.readInt() != 0, k91.y3.m142248xdce0328(parcel.readString()), k91.y3.m142248xdce0328(parcel.readString()));
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3898xeaad22a8[i17];
    }
}
