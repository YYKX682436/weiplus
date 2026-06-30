package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class ha implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12348x9f2a4bd6 c12348x9f2a4bd6 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12348x9f2a4bd6(0, null, null, false, 0, null, 62, null);
        int readInt = source.readInt();
        c12348x9f2a4bd6.f165980d = readInt;
        if (readInt == 1) {
            c12348x9f2a4bd6.f165981e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11666xa31a0b7f) source.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11666xa31a0b7f.class.getClassLoader());
        } else if (readInt == 2) {
            int readInt2 = source.readInt();
            java.util.ArrayList arrayList = new java.util.ArrayList(readInt2);
            for (int i17 = 0; i17 < readInt2; i17++) {
                java.lang.String readString = source.readString();
                java.lang.ClassLoader classLoader = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(readString, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.class.getName()) ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.class.getClassLoader() : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(readString, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847.class.getName()) ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847.class.getClassLoader() : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(classLoader);
                android.os.Parcelable readParcelable = source.readParcelable(classLoader);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(readParcelable, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.IPkgInfo");
                arrayList.add((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.InterfaceC11654xe38d2811) readParcelable);
            }
            c12348x9f2a4bd6.f165982f = arrayList;
            c12348x9f2a4bd6.f165983g = source.readByte() > 0;
            c12348x9f2a4bd6.f165984h = source.readInt();
            c12348x9f2a4bd6.f165985i = source.readString();
        }
        return c12348x9f2a4bd6;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12348x9f2a4bd6[i17];
    }
}
