package com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061;

/* loaded from: classes7.dex */
public final class e implements com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a
    public boolean a(java.lang.Object obj) {
        return obj instanceof com.p314xaae8f345.mm.p944x882e457a.o;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a
    public java.lang.Object b(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.c.c("com.tencent.mm.ipcinvoker.wx_extension.MMProtoBufTransfer", parcel);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            try {
                lVar.f152198b = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) java.lang.Class.forName(parcel.readString()).newInstance();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.XIPC.CommReqRespTransfer", "readFromParcel, mm process initiate resp e = %s", e17);
                lVar.f152198b = new com.p314xaae8f345.mm.p2495xc50a8b8b.f();
            }
        } else {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.c.c("com.tencent.mm.ipcinvoker.wx_extension.MMProtoBufTransfer", parcel);
            if (fVar == null) {
                fVar = new com.p314xaae8f345.mm.p2495xc50a8b8b.f();
            }
            lVar.f152198b = fVar;
        }
        lVar.f152199c = parcel.readString();
        lVar.f152200d = parcel.readInt();
        lVar.f152201e = parcel.readInt();
        lVar.f152202f = parcel.readInt();
        lVar.f152205i = parcel.readInt();
        lVar.f152211o = parcel.readInt();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        r45.xw xwVar = (r45.xw) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.c.c("com.tencent.mm.ipcinvoker.wx_extension.MMProtoBufTransfer", parcel);
        if (xwVar != null) {
            try {
                a17.f152244b.m150586x9ecd12e7(xwVar.mo14344x5f01b1f6());
            } catch (java.lang.Exception unused) {
            }
        }
        return a17;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a
    public void c(java.lang.Object obj, android.os.Parcel parcel) {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = (com.p314xaae8f345.mm.p944x882e457a.o) obj;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.c.d(oVar.f152243a.f152217a, parcel);
        boolean n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n();
        com.p314xaae8f345.mm.p944x882e457a.n nVar = oVar.f152244b;
        if (n17) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.c.d(nVar.f152233a, parcel);
        } else {
            parcel.writeString(nVar.f152233a.getClass().getName());
        }
        parcel.writeString(oVar.f152245c);
        parcel.writeInt(oVar.f152246d);
        parcel.writeInt(oVar.f152243a.f152219c);
        parcel.writeInt(nVar.f152234b);
        parcel.writeInt(oVar.f152248f);
        parcel.writeInt(oVar.mo47976x1de73f19());
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.c.d(nVar.m150576x2b5bc573(), parcel);
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a
    /* renamed from: getName */
    public java.lang.String mo46195xfb82e301() {
        return "com.tencent.mm.ipcinvoker.wx_extension.CommReqRespTransfer";
    }
}
