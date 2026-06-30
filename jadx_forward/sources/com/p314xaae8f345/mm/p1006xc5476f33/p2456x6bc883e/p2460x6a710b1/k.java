package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1;

/* loaded from: classes8.dex */
public abstract class k {
    public static void a(com.p314xaae8f345.mm.p944x882e457a.o oVar, android.os.Parcel parcel) {
        com.p314xaae8f345.mm.p944x882e457a.m mVar = oVar.f152243a;
        parcel.writeString(mVar.f152217a.getClass().getName());
        byte[] bArr = new byte[0];
        try {
            bArr = mVar.f152217a.mo14344x5f01b1f6();
        } catch (java.lang.Exception unused) {
        }
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
        com.p314xaae8f345.mm.p944x882e457a.n nVar = oVar.f152244b;
        parcel.writeString(nVar.f152233a.getClass().getName());
        byte[] bArr2 = new byte[0];
        try {
            bArr2 = nVar.f152233a.mo14344x5f01b1f6();
        } catch (java.lang.Exception unused2) {
        }
        parcel.writeInt(bArr2.length);
        parcel.writeByteArray(bArr2);
        parcel.writeString(oVar.f152245c);
        parcel.writeInt(oVar.f152246d);
        parcel.writeInt(mVar.f152219c);
        parcel.writeInt(nVar.f152234b);
    }

    public static com.p314xaae8f345.mm.p944x882e457a.o b(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        java.lang.String readString = parcel.readString();
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        try {
            lVar.f152197a = ((com.p314xaae8f345.mm.p2495xc50a8b8b.f) java.lang.Class.forName(readString).newInstance()).mo11468x92b714fd(bArr);
        } catch (java.lang.Exception unused) {
        }
        java.lang.String readString2 = parcel.readString();
        byte[] bArr2 = new byte[parcel.readInt()];
        parcel.readByteArray(bArr2);
        try {
            lVar.f152198b = ((com.p314xaae8f345.mm.p2495xc50a8b8b.f) java.lang.Class.forName(readString2).newInstance()).mo11468x92b714fd(bArr2);
        } catch (java.lang.Exception e17) {
            if (e17 instanceof b36.g) {
                try {
                    lVar.f152198b = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) java.lang.Class.forName(readString2).newInstance();
                } catch (java.lang.Exception e18) {
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Wepkg.WepkgRunCgi", "readCommReqRespFromParcel, resp fields not ready, re-create one but exp = %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
                }
            }
        }
        lVar.f152199c = parcel.readString();
        lVar.f152200d = parcel.readInt();
        lVar.f152201e = parcel.readInt();
        lVar.f152202f = parcel.readInt();
        return lVar.a();
    }

    public static void c(com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.i iVar) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.mm.p944x882e457a.z2.d(oVar, new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.h(iVar), false);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.C19547xb6f6a078 c19547xb6f6a078 = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.C19547xb6f6a078();
        ((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.f270036c).add(c19547xb6f6a078);
        c19547xb6f6a078.f270022n = oVar;
        c19547xb6f6a078.f270023o = iVar;
        c19547xb6f6a078.f270017f = 1;
        c19547xb6f6a078.d();
    }
}
