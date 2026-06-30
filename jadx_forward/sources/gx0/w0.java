package gx0;

/* loaded from: classes5.dex */
public final class w0 implements android.os.Parcelable.Creator {
    public w0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x013b, code lost:
    
        if (r5 != false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.uic.C10955x675e70c1 a(android.content.Intent r37) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.w0.a(android.content.Intent):com.tencent.mm.mj_publisher.finder.movie_composing.uic.MovieComposingConfig");
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        java.lang.String str = readString;
        android.os.Parcelable.Creator<com.p314xaae8f345.mm.p839xf223db21.C10858x5d0663fa> creator = com.p314xaae8f345.mm.p839xf223db21.C10858x5d0663fa.f29646x681a0c0c;
        java.util.List createTypedArrayList = parcel.createTypedArrayList(creator);
        java.util.List list = kz5.p0.f395529d;
        if (createTypedArrayList == null) {
            createTypedArrayList = list;
        }
        com.p314xaae8f345.mm.p839xf223db21.C10859x7be975f4 c10859x7be975f4 = (com.p314xaae8f345.mm.p839xf223db21.C10859x7be975f4) parcel.readParcelable(com.p314xaae8f345.mm.p839xf223db21.C10859x7be975f4.class.getClassLoader());
        if (c10859x7be975f4 == null) {
            c10859x7be975f4 = new com.p314xaae8f345.mm.p839xf223db21.C10859x7be975f4(false, false);
        }
        gx0.i1 i1Var = (gx0.i1) ((rz5.c) gx0.i1.f358054h).get(parcel.readInt());
        java.util.List createTypedArrayList2 = parcel.createTypedArrayList(creator);
        if (createTypedArrayList2 == null) {
            createTypedArrayList2 = list;
        }
        return new com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.uic.C10955x675e70c1(str, createTypedArrayList, c10859x7be975f4, i1Var, createTypedArrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.uic.C10955x675e70c1[i17];
    }
}
