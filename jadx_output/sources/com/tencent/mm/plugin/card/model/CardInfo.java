package com.tencent.mm.plugin.card.model;

/* loaded from: classes15.dex */
public class CardInfo extends dm.nb implements android.os.Parcelable, tt1.j {
    public static final l75.e0 B1 = dm.nb.initAutoDBInfo(com.tencent.mm.plugin.card.model.CardInfo.class);
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.card.model.CardInfo> CREATOR = new xt1.d();
    public java.lang.String A1 = "";

    /* renamed from: p1, reason: collision with root package name */
    public r45.vu f94675p1;

    /* renamed from: x1, reason: collision with root package name */
    public r45.rt f94676x1;

    /* renamed from: y1, reason: collision with root package name */
    public r45.j46 f94677y1;

    /* renamed from: z1, reason: collision with root package name */
    public r45.nu f94678z1;

    public CardInfo() {
        this.field_card_type = -1;
    }

    @Override // tt1.j
    public boolean B() {
        return s0() != null && s0().L == 0;
    }

    @Override // tt1.j
    public java.lang.String C(int i17) {
        return null;
    }

    @Override // tt1.j
    public boolean F() {
        r45.rt rtVar = this.f94676x1;
        return rtVar != null && rtVar.f385181d == 0;
    }

    @Override // tt1.j
    public void G(r45.rt rtVar) {
        this.f94676x1 = rtVar;
        if (rtVar != null) {
            this.field_status = rtVar.f385181d;
            if (rtVar != null) {
                try {
                    this.field_dataInfoData = rtVar.toByteArray();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.CardInfo", "setDataInfo fail, ex = %s", e17.getMessage());
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CardInfo", e17, "", new java.lang.Object[0]);
                }
            }
        }
    }

    @Override // tt1.j
    public java.lang.String H() {
        return this.A1;
    }

    @Override // tt1.j
    public int J() {
        return 0;
    }

    @Override // tt1.j
    public r45.nu K() {
        r45.nu nuVar = this.f94678z1;
        if (nuVar != null) {
            return nuVar;
        }
        try {
            if (this.field_shopInfoData == null) {
                return null;
            }
            r45.nu nuVar2 = (r45.nu) new r45.nu().parseFrom(this.field_shopInfoData);
            this.f94678z1 = nuVar2;
            return nuVar2;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardInfo", "getShopInfo fail ex = %s", e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CardInfo", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // tt1.j
    public boolean N() {
        return (s0().E & 8) > 0;
    }

    @Override // tt1.j
    public boolean Q() {
        return s0() != null && s0().f388550i == 11;
    }

    @Override // tt1.j
    public long R() {
        return this.field_local_updateTime;
    }

    @Override // tt1.j
    public boolean X() {
        return s0() != null && s0().f388550i == 20;
    }

    @Override // tt1.j
    public r45.j46 Y() {
        r45.j46 j46Var = this.f94677y1;
        if (j46Var != null) {
            return j46Var;
        }
        try {
            if (this.field_shareInfoData == null) {
                return new r45.j46();
            }
            r45.j46 j46Var2 = (r45.j46) new r45.j46().parseFrom(this.field_shareInfoData);
            this.f94677y1 = j46Var2;
            return j46Var2;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardInfo", "getShareInfo fail, ex = %s", e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CardInfo", e17, "", new java.lang.Object[0]);
            return new r45.j46();
        }
    }

    @Override // tt1.j
    public java.lang.String a() {
        return this.field_from_username;
    }

    @Override // tt1.j
    public boolean b() {
        return (s0().E & 16) == 0;
    }

    @Override // tt1.j
    public boolean c() {
        return lu1.a0.B(s0().f388550i);
    }

    @Override // tt1.j
    public boolean d() {
        return s0() != null && s0().f388550i == 0;
    }

    @Override // tt1.j
    public boolean d0() {
        if (!F()) {
            return false;
        }
        if (this.f94675p1 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardInfo", "is_acceptable:" + this.f94675p1.S);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardInfo", "stock_num:" + this.f94676x1.f385192r + " limit_num:" + this.f94676x1.f385193s);
        r45.vu vuVar = this.f94675p1;
        if (vuVar != null && vuVar.S == 1) {
            return true;
        }
        if (vuVar != null && vuVar.S == 0) {
            return false;
        }
        r45.rt rtVar = this.f94676x1;
        if (rtVar.f385192r != 0) {
            int i17 = rtVar.f385193s;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // tt1.j
    public boolean e() {
        return s0() != null && s0().R == 1;
    }

    @Override // tt1.j
    public java.lang.String f() {
        return this.field_card_tp_id;
    }

    @Override // tt1.j
    public boolean f0() {
        return (s0().E & 2) > 0;
    }

    @Override // tt1.j
    public java.lang.String g() {
        return this.field_card_id;
    }

    @Override // dm.nb, l75.f0
    public l75.e0 getDBInfo() {
        return B1;
    }

    @Override // tt1.j
    public boolean h() {
        return (s0().E & 32) > 0;
    }

    @Override // tt1.j
    public boolean i() {
        return s0() != null && s0().L == 1;
    }

    @Override // tt1.j
    public r45.rt i0() {
        r45.rt rtVar = this.f94676x1;
        if (rtVar != null) {
            return rtVar;
        }
        try {
            if (this.field_dataInfoData == null) {
                return new r45.rt();
            }
            r45.rt rtVar2 = (r45.rt) new r45.rt().parseFrom(this.field_dataInfoData);
            this.f94676x1 = rtVar2;
            return rtVar2;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardInfo", "getDataInfo fail, ex = %s", e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CardInfo", e17, "", new java.lang.Object[0]);
            return new r45.rt();
        }
    }

    @Override // tt1.j
    public void j0(java.lang.String str) {
        this.field_from_username = str;
    }

    @Override // tt1.j
    public boolean m() {
        return (s0().E & 1) == 0;
    }

    @Override // tt1.j
    public boolean m0() {
        return s0() != null && s0().f388550i == 30;
    }

    @Override // tt1.j
    public boolean n() {
        r45.ju juVar;
        r45.vu vuVar = this.f94675p1;
        if (vuVar == null || (juVar = vuVar.I) == null || android.text.TextUtils.isEmpty(juVar.f378104e)) {
            return false;
        }
        r45.ju juVar2 = this.f94675p1.I;
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        int i17 = juVar2.f378106g;
        return i17 > 0 && i17 - currentTimeMillis > 0;
    }

    @Override // tt1.j
    public boolean n0() {
        return (s0().E & 4) > 0;
    }

    @Override // tt1.j
    public boolean o() {
        return s0() != null && s0().f388550i == 10;
    }

    @Override // tt1.j
    public boolean q() {
        return (s0().B & 1) == 0;
    }

    @Override // tt1.j
    public r45.vu s0() {
        r45.vu vuVar = this.f94675p1;
        if (vuVar != null) {
            return vuVar;
        }
        try {
            if (this.field_cardTpInfoData == null) {
                return new r45.vu();
            }
            r45.vu vuVar2 = (r45.vu) new r45.vu().parseFrom(this.field_cardTpInfoData);
            this.f94675p1 = vuVar2;
            return vuVar2;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardInfo", "getCardTpInfo fail, ex = %s", e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CardInfo", e17, "", new java.lang.Object[0]);
            return new r45.vu();
        }
    }

    @Override // tt1.j
    public void t(r45.nu nuVar) {
        this.f94678z1 = nuVar;
        if (nuVar != null) {
            try {
                this.field_shopInfoData = nuVar.toByteArray();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardInfo", "setShopInfo fail, ex = %s", e17.getMessage());
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CardInfo", e17, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // tt1.j
    public boolean u() {
        return (s0().B & 2) == 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.field_card_id);
        parcel.writeString(this.field_card_tp_id);
        parcel.writeString(this.field_from_username);
        parcel.writeInt(this.field_status);
        parcel.writeInt(this.field_delete_state_flag);
        parcel.writeLong(this.field_local_updateTime);
        parcel.writeLong(this.field_updateTime);
        parcel.writeLong(this.field_updateSeq);
        parcel.writeLong(this.field_create_time);
        parcel.writeLong(this.field_begin_time);
        parcel.writeLong(this.field_end_time);
        parcel.writeString(this.field_block_mask);
        parcel.writeInt(this.field_stickyIndex);
        parcel.writeInt(this.field_stickyEndTime);
        parcel.writeString(this.field_stickyAnnouncement);
        parcel.writeInt(this.field_card_type);
        parcel.writeString(this.field_label_wording);
        byte[] bArr = this.field_dataInfoData;
        int i18 = 0;
        if (bArr != null) {
            parcel.writeInt(bArr.length);
            int i19 = 0;
            while (true) {
                byte[] bArr2 = this.field_dataInfoData;
                if (i19 >= bArr2.length) {
                    break;
                }
                parcel.writeByte(bArr2[i19]);
                i19++;
            }
        } else {
            parcel.writeInt(0);
        }
        byte[] bArr3 = this.field_cardTpInfoData;
        if (bArr3 != null) {
            parcel.writeInt(bArr3.length);
            int i27 = 0;
            while (true) {
                byte[] bArr4 = this.field_cardTpInfoData;
                if (i27 >= bArr4.length) {
                    break;
                }
                parcel.writeByte(bArr4[i27]);
                i27++;
            }
        } else {
            parcel.writeInt(0);
        }
        byte[] bArr5 = this.field_shareInfoData;
        if (bArr5 != null) {
            parcel.writeInt(bArr5.length);
            int i28 = 0;
            while (true) {
                byte[] bArr6 = this.field_shareInfoData;
                if (i28 >= bArr6.length) {
                    break;
                }
                parcel.writeByte(bArr6[i28]);
                i28++;
            }
        } else {
            parcel.writeInt(0);
        }
        byte[] bArr7 = this.field_shopInfoData;
        if (bArr7 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(bArr7.length);
        while (true) {
            byte[] bArr8 = this.field_shopInfoData;
            if (i18 >= bArr8.length) {
                return;
            }
            parcel.writeByte(bArr8[i18]);
            i18++;
        }
    }

    @Override // tt1.j
    public java.lang.String x(int i17) {
        return null;
    }

    @Override // tt1.j
    public boolean y() {
        if (!F()) {
            return false;
        }
        if (this.f94675p1 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardInfo", "is_acceptable:" + this.f94675p1.S);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardInfo", "avail_num:" + this.f94676x1.f385188n);
        r45.vu vuVar = this.f94675p1;
        if ((vuVar != null && vuVar.S == 1) || this.f94676x1.f385188n > 0) {
            return true;
        }
        if (vuVar != null) {
            int i17 = vuVar.S;
        }
        return false;
    }

    @Override // tt1.j
    public boolean z() {
        r45.vu vuVar = this.f94675p1;
        return vuVar != null && vuVar.W == 1;
    }

    public CardInfo(android.os.Parcel parcel) {
        this.field_card_id = parcel.readString();
        this.field_card_tp_id = parcel.readString();
        this.field_from_username = parcel.readString();
        this.field_status = parcel.readInt();
        this.field_delete_state_flag = parcel.readInt();
        this.field_local_updateTime = parcel.readLong();
        this.field_updateTime = parcel.readLong();
        this.field_updateSeq = parcel.readLong();
        this.field_create_time = parcel.readLong();
        this.field_begin_time = parcel.readLong();
        this.field_end_time = parcel.readLong();
        this.field_block_mask = parcel.readString();
        this.field_stickyIndex = parcel.readInt();
        this.field_stickyEndTime = parcel.readInt();
        this.field_stickyAnnouncement = parcel.readString();
        this.field_card_type = parcel.readInt();
        this.field_label_wording = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            this.field_dataInfoData = new byte[readInt];
            for (int i17 = 0; i17 < readInt; i17++) {
                this.field_dataInfoData[i17] = parcel.readByte();
            }
        }
        int readInt2 = parcel.readInt();
        if (readInt2 > 0) {
            this.field_cardTpInfoData = new byte[readInt2];
            for (int i18 = 0; i18 < readInt2; i18++) {
                this.field_cardTpInfoData[i18] = parcel.readByte();
            }
        }
        int readInt3 = parcel.readInt();
        if (readInt3 > 0) {
            this.field_shareInfoData = new byte[readInt3];
            for (int i19 = 0; i19 < readInt3; i19++) {
                this.field_shareInfoData[i19] = parcel.readByte();
            }
        }
        int readInt4 = parcel.readInt();
        if (readInt4 > 0) {
            this.field_shopInfoData = new byte[readInt4];
            for (int i27 = 0; i27 < readInt4; i27++) {
                this.field_shopInfoData[i27] = parcel.readByte();
            }
        }
    }
}
