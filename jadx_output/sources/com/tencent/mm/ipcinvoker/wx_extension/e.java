package com.tencent.mm.ipcinvoker.wx_extension;

/* loaded from: classes7.dex */
public final class e implements com.tencent.mm.ipcinvoker.extension.a {
    @Override // com.tencent.mm.ipcinvoker.extension.a
    public boolean a(java.lang.Object obj) {
        return obj instanceof com.tencent.mm.modelbase.o;
    }

    @Override // com.tencent.mm.ipcinvoker.extension.a
    public java.lang.Object b(android.os.Parcel parcel) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = (com.tencent.mm.protobuf.f) com.tencent.mm.ipcinvoker.extension.c.c("com.tencent.mm.ipcinvoker.wx_extension.MMProtoBufTransfer", parcel);
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            try {
                lVar.f70665b = (com.tencent.mm.protobuf.f) java.lang.Class.forName(parcel.readString()).newInstance();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.XIPC.CommReqRespTransfer", "readFromParcel, mm process initiate resp e = %s", e17);
                lVar.f70665b = new com.tencent.mm.protobuf.f();
            }
        } else {
            com.tencent.mm.protobuf.f fVar = (com.tencent.mm.protobuf.f) com.tencent.mm.ipcinvoker.extension.c.c("com.tencent.mm.ipcinvoker.wx_extension.MMProtoBufTransfer", parcel);
            if (fVar == null) {
                fVar = new com.tencent.mm.protobuf.f();
            }
            lVar.f70665b = fVar;
        }
        lVar.f70666c = parcel.readString();
        lVar.f70667d = parcel.readInt();
        lVar.f70668e = parcel.readInt();
        lVar.f70669f = parcel.readInt();
        lVar.f70672i = parcel.readInt();
        lVar.f70678o = parcel.readInt();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        r45.xw xwVar = (r45.xw) com.tencent.mm.ipcinvoker.extension.c.c("com.tencent.mm.ipcinvoker.wx_extension.MMProtoBufTransfer", parcel);
        if (xwVar != null) {
            try {
                a17.f70711b.setProfile(xwVar.toByteArray());
            } catch (java.lang.Exception unused) {
            }
        }
        return a17;
    }

    @Override // com.tencent.mm.ipcinvoker.extension.a
    public void c(java.lang.Object obj, android.os.Parcel parcel) {
        com.tencent.mm.modelbase.o oVar = (com.tencent.mm.modelbase.o) obj;
        com.tencent.mm.ipcinvoker.extension.c.d(oVar.f70710a.f70684a, parcel);
        boolean n17 = com.tencent.mm.sdk.platformtools.x2.n();
        com.tencent.mm.modelbase.n nVar = oVar.f70711b;
        if (n17) {
            com.tencent.mm.ipcinvoker.extension.c.d(nVar.f70700a, parcel);
        } else {
            parcel.writeString(nVar.f70700a.getClass().getName());
        }
        parcel.writeString(oVar.f70712c);
        parcel.writeInt(oVar.f70713d);
        parcel.writeInt(oVar.f70710a.f70686c);
        parcel.writeInt(nVar.f70701b);
        parcel.writeInt(oVar.f70715f);
        parcel.writeInt(oVar.getNewDNSBusinessType());
        com.tencent.mm.ipcinvoker.extension.c.d(nVar.getProfile(), parcel);
    }

    @Override // com.tencent.mm.ipcinvoker.extension.a
    public java.lang.String getName() {
        return "com.tencent.mm.ipcinvoker.wx_extension.CommReqRespTransfer";
    }
}
