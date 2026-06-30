package com.p314xaae8f345.mm.ui.p2731xc84c5534;

/* loaded from: classes9.dex */
public class g0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.ui.p2731xc84c5534.h0 h0Var;
        com.p314xaae8f345.mm.ui.p2731xc84c5534.j0 j0Var;
        java.lang.String readString = parcel.readString();
        int readInt = parcel.readInt();
        com.p314xaae8f345.mm.ui.p2731xc84c5534.j0 j0Var2 = com.p314xaae8f345.mm.ui.p2731xc84c5534.j0.Unknown;
        if (readInt != 0) {
            if (readInt == 1) {
                j0Var = com.p314xaae8f345.mm.ui.p2731xc84c5534.j0.SingleChat;
            } else if (readInt == 2) {
                j0Var = com.p314xaae8f345.mm.ui.p2731xc84c5534.j0.GroupChat;
            } else if (readInt == 3) {
                j0Var = com.p314xaae8f345.mm.ui.p2731xc84c5534.j0.SNS;
            }
            j0Var2 = j0Var;
        }
        int readInt2 = parcel.readInt();
        java.lang.String readString2 = parcel.readString();
        java.lang.String readString3 = parcel.readString();
        int readInt3 = parcel.readInt();
        com.p314xaae8f345.mm.ui.p2731xc84c5534.h0 h0Var2 = com.p314xaae8f345.mm.ui.p2731xc84c5534.h0.Unknown;
        if (readInt3 != 0) {
            if (readInt3 == 1) {
                h0Var = com.p314xaae8f345.mm.ui.p2731xc84c5534.h0.Image;
            } else if (readInt3 == 2) {
                h0Var = com.p314xaae8f345.mm.ui.p2731xc84c5534.h0.Video;
            }
            return new com.p314xaae8f345.mm.ui.p2731xc84c5534.C22471x941a9a3f(readString, j0Var2, readInt2, readString2, readString3, h0Var, null);
        }
        h0Var = h0Var2;
        return new com.p314xaae8f345.mm.ui.p2731xc84c5534.C22471x941a9a3f(readString, j0Var2, readInt2, readString2, readString3, h0Var, null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.ui.p2731xc84c5534.C22471x941a9a3f[i17];
    }
}
