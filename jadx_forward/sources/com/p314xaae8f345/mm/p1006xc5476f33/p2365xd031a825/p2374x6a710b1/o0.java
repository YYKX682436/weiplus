package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1;

/* loaded from: classes7.dex */
public final class o0 implements android.os.Parcelable.Creator {
    public o0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.s0 s0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n0 n0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.m0 m0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n0.f262472e;
        int readInt = parcel.readInt();
        m0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n0[] m73964xcee59d22 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n0.m73964xcee59d22();
        int length = m73964xcee59d22.length;
        int i17 = 0;
        while (true) {
            s0Var = null;
            if (i17 >= length) {
                n0Var = null;
                break;
            }
            n0Var = m73964xcee59d22[i17];
            if (n0Var.f262482d == readInt) {
                break;
            }
            i17++;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n0 n0Var2 = n0Var == null ? com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n0.f262473f : n0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.r0 r0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.s0.f262513e;
        int readInt2 = parcel.readInt();
        r0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.s0[] m73977xcee59d22 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.s0.m73977xcee59d22();
        int length2 = m73977xcee59d22.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length2) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.s0 s0Var2 = m73977xcee59d22[i18];
            if (s0Var2.f262518d == readInt2) {
                s0Var = s0Var2;
                break;
            }
            i18++;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.s0 s0Var3 = s0Var == null ? com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.s0.f262514f : s0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.q0 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.q0.f262498e.a(parcel.readInt());
        java.lang.String readString = parcel.readString();
        java.lang.String str = readString == null ? "" : readString;
        java.lang.String readString2 = parcel.readString();
        java.lang.String str2 = readString2 == null ? "" : readString2;
        java.lang.String readString3 = parcel.readString();
        java.lang.String str3 = readString3 == null ? "" : readString3;
        java.lang.String readString4 = parcel.readString();
        java.lang.String str4 = readString4 == null ? "" : readString4;
        java.lang.String readString5 = parcel.readString();
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19156xb6112c3(n0Var2, s0Var3, a17, str, str2, str3, str4, readString5 == null ? "" : readString5, parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19156xb6112c3[i17];
    }
}
