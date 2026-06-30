package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29;

/* renamed from: com.tencent.mm.plugin.card.model.CardInfo */
/* loaded from: classes15.dex */
public class C13038x357affe extends dm.nb implements android.os.Parcelable, tt1.j {
    public static final l75.e0 B1 = dm.nb.m125348x3593deb(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe.class);

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe> f35394x681a0c0c = new xt1.d();
    public java.lang.String A1 = "";

    /* renamed from: p1, reason: collision with root package name */
    public r45.vu f176208p1;

    /* renamed from: x1, reason: collision with root package name */
    public r45.rt f176209x1;

    /* renamed from: y1, reason: collision with root package name */
    public r45.j46 f176210y1;

    /* renamed from: z1, reason: collision with root package name */
    public r45.nu f176211z1;

    public C13038x357affe() {
        this.f67738x8c036204 = -1;
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
        r45.rt rtVar = this.f176209x1;
        return rtVar != null && rtVar.f466714d == 0;
    }

    @Override // tt1.j
    public void G(r45.rt rtVar) {
        this.f176209x1 = rtVar;
        if (rtVar != null) {
            this.f67749x10a0fed7 = rtVar.f466714d;
            if (rtVar != null) {
                try {
                    this.f67740x65db7a67 = rtVar.mo14344x5f01b1f6();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfo", "setDataInfo fail, ex = %s", e17.getMessage());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardInfo", e17, "", new java.lang.Object[0]);
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
        r45.nu nuVar = this.f176211z1;
        if (nuVar != null) {
            return nuVar;
        }
        try {
            if (this.f67748xd61859b3 == null) {
                return null;
            }
            r45.nu nuVar2 = (r45.nu) new r45.nu().mo11468x92b714fd(this.f67748xd61859b3);
            this.f176211z1 = nuVar2;
            return nuVar2;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfo", "getShopInfo fail ex = %s", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardInfo", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // tt1.j
    public boolean N() {
        return (s0().E & 8) > 0;
    }

    @Override // tt1.j
    public boolean Q() {
        return s0() != null && s0().f470083i == 11;
    }

    @Override // tt1.j
    public long R() {
        return this.f67746xe9093d2f;
    }

    @Override // tt1.j
    public boolean X() {
        return s0() != null && s0().f470083i == 20;
    }

    @Override // tt1.j
    public r45.j46 Y() {
        r45.j46 j46Var = this.f176210y1;
        if (j46Var != null) {
            return j46Var;
        }
        try {
            if (this.f67747x7f1b5bf2 == null) {
                return new r45.j46();
            }
            r45.j46 j46Var2 = (r45.j46) new r45.j46().mo11468x92b714fd(this.f67747x7f1b5bf2);
            this.f176210y1 = j46Var2;
            return j46Var2;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfo", "getShareInfo fail, ex = %s", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardInfo", e17, "", new java.lang.Object[0]);
            return new r45.j46();
        }
    }

    @Override // tt1.j
    public java.lang.String a() {
        return this.f67743x7697d746;
    }

    @Override // tt1.j
    public boolean b() {
        return (s0().E & 16) == 0;
    }

    @Override // tt1.j
    public boolean c() {
        return lu1.a0.B(s0().f470083i);
    }

    @Override // tt1.j
    public boolean d() {
        return s0() != null && s0().f470083i == 0;
    }

    @Override // tt1.j
    public boolean d0() {
        if (!F()) {
            return false;
        }
        if (this.f176208p1 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardInfo", "is_acceptable:" + this.f176208p1.S);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardInfo", "stock_num:" + this.f176209x1.f466725r + " limit_num:" + this.f176209x1.f466726s);
        r45.vu vuVar = this.f176208p1;
        if (vuVar != null && vuVar.S == 1) {
            return true;
        }
        if (vuVar != null && vuVar.S == 0) {
            return false;
        }
        r45.rt rtVar = this.f176209x1;
        if (rtVar.f466725r != 0) {
            int i17 = rtVar.f466726s;
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
        return this.f67737xf4648834;
    }

    @Override // tt1.j
    public boolean f0() {
        return (s0().E & 2) > 0;
    }

    @Override // tt1.j
    public java.lang.String g() {
        return this.f67736x95970a65;
    }

    @Override // dm.nb, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
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
        r45.rt rtVar = this.f176209x1;
        if (rtVar != null) {
            return rtVar;
        }
        try {
            if (this.f67740x65db7a67 == null) {
                return new r45.rt();
            }
            r45.rt rtVar2 = (r45.rt) new r45.rt().mo11468x92b714fd(this.f67740x65db7a67);
            this.f176209x1 = rtVar2;
            return rtVar2;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfo", "getDataInfo fail, ex = %s", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardInfo", e17, "", new java.lang.Object[0]);
            return new r45.rt();
        }
    }

    @Override // tt1.j
    public void j0(java.lang.String str) {
        this.f67743x7697d746 = str;
    }

    @Override // tt1.j
    public boolean m() {
        return (s0().E & 1) == 0;
    }

    @Override // tt1.j
    public boolean m0() {
        return s0() != null && s0().f470083i == 30;
    }

    @Override // tt1.j
    public boolean n() {
        r45.ju juVar;
        r45.vu vuVar = this.f176208p1;
        if (vuVar == null || (juVar = vuVar.I) == null || android.text.TextUtils.isEmpty(juVar.f459637e)) {
            return false;
        }
        r45.ju juVar2 = this.f176208p1.I;
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        int i17 = juVar2.f459639g;
        return i17 > 0 && i17 - currentTimeMillis > 0;
    }

    @Override // tt1.j
    public boolean n0() {
        return (s0().E & 4) > 0;
    }

    @Override // tt1.j
    public boolean o() {
        return s0() != null && s0().f470083i == 10;
    }

    @Override // tt1.j
    public boolean q() {
        return (s0().B & 1) == 0;
    }

    @Override // tt1.j
    public r45.vu s0() {
        r45.vu vuVar = this.f176208p1;
        if (vuVar != null) {
            return vuVar;
        }
        try {
            if (this.f67735x13503529 == null) {
                return new r45.vu();
            }
            r45.vu vuVar2 = (r45.vu) new r45.vu().mo11468x92b714fd(this.f67735x13503529);
            this.f176208p1 = vuVar2;
            return vuVar2;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfo", "getCardTpInfo fail, ex = %s", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardInfo", e17, "", new java.lang.Object[0]);
            return new r45.vu();
        }
    }

    @Override // tt1.j
    public void t(r45.nu nuVar) {
        this.f176211z1 = nuVar;
        if (nuVar != null) {
            try {
                this.f67748xd61859b3 = nuVar.mo14344x5f01b1f6();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfo", "setShopInfo fail, ex = %s", e17.getMessage());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardInfo", e17, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // tt1.j
    public boolean u() {
        return (s0().B & 2) == 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f67736x95970a65);
        parcel.writeString(this.f67737xf4648834);
        parcel.writeString(this.f67743x7697d746);
        parcel.writeInt(this.f67749x10a0fed7);
        parcel.writeInt(this.f67741x8ba24d69);
        parcel.writeLong(this.f67746xe9093d2f);
        parcel.writeLong(this.f67754xa783a79b);
        parcel.writeLong(this.f67753x266f95d1);
        parcel.writeLong(this.f67739x4e54006b);
        parcel.writeLong(this.f67733xfb71c908);
        parcel.writeLong(this.f67742x849cdd56);
        parcel.writeString(this.f67734x5d2ffc3);
        parcel.writeInt(this.f67752xead628a4);
        parcel.writeInt(this.f67751xba4dbd9a);
        parcel.writeString(this.f67750x5da73d35);
        parcel.writeInt(this.f67738x8c036204);
        parcel.writeString(this.f67745xd7ba23c8);
        byte[] bArr = this.f67740x65db7a67;
        int i18 = 0;
        if (bArr != null) {
            parcel.writeInt(bArr.length);
            int i19 = 0;
            while (true) {
                byte[] bArr2 = this.f67740x65db7a67;
                if (i19 >= bArr2.length) {
                    break;
                }
                parcel.writeByte(bArr2[i19]);
                i19++;
            }
        } else {
            parcel.writeInt(0);
        }
        byte[] bArr3 = this.f67735x13503529;
        if (bArr3 != null) {
            parcel.writeInt(bArr3.length);
            int i27 = 0;
            while (true) {
                byte[] bArr4 = this.f67735x13503529;
                if (i27 >= bArr4.length) {
                    break;
                }
                parcel.writeByte(bArr4[i27]);
                i27++;
            }
        } else {
            parcel.writeInt(0);
        }
        byte[] bArr5 = this.f67747x7f1b5bf2;
        if (bArr5 != null) {
            parcel.writeInt(bArr5.length);
            int i28 = 0;
            while (true) {
                byte[] bArr6 = this.f67747x7f1b5bf2;
                if (i28 >= bArr6.length) {
                    break;
                }
                parcel.writeByte(bArr6[i28]);
                i28++;
            }
        } else {
            parcel.writeInt(0);
        }
        byte[] bArr7 = this.f67748xd61859b3;
        if (bArr7 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(bArr7.length);
        while (true) {
            byte[] bArr8 = this.f67748xd61859b3;
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
        if (this.f176208p1 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardInfo", "is_acceptable:" + this.f176208p1.S);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardInfo", "avail_num:" + this.f176209x1.f466721n);
        r45.vu vuVar = this.f176208p1;
        if ((vuVar != null && vuVar.S == 1) || this.f176209x1.f466721n > 0) {
            return true;
        }
        if (vuVar != null) {
            int i17 = vuVar.S;
        }
        return false;
    }

    @Override // tt1.j
    public boolean z() {
        r45.vu vuVar = this.f176208p1;
        return vuVar != null && vuVar.W == 1;
    }

    public C13038x357affe(android.os.Parcel parcel) {
        this.f67736x95970a65 = parcel.readString();
        this.f67737xf4648834 = parcel.readString();
        this.f67743x7697d746 = parcel.readString();
        this.f67749x10a0fed7 = parcel.readInt();
        this.f67741x8ba24d69 = parcel.readInt();
        this.f67746xe9093d2f = parcel.readLong();
        this.f67754xa783a79b = parcel.readLong();
        this.f67753x266f95d1 = parcel.readLong();
        this.f67739x4e54006b = parcel.readLong();
        this.f67733xfb71c908 = parcel.readLong();
        this.f67742x849cdd56 = parcel.readLong();
        this.f67734x5d2ffc3 = parcel.readString();
        this.f67752xead628a4 = parcel.readInt();
        this.f67751xba4dbd9a = parcel.readInt();
        this.f67750x5da73d35 = parcel.readString();
        this.f67738x8c036204 = parcel.readInt();
        this.f67745xd7ba23c8 = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            this.f67740x65db7a67 = new byte[readInt];
            for (int i17 = 0; i17 < readInt; i17++) {
                this.f67740x65db7a67[i17] = parcel.readByte();
            }
        }
        int readInt2 = parcel.readInt();
        if (readInt2 > 0) {
            this.f67735x13503529 = new byte[readInt2];
            for (int i18 = 0; i18 < readInt2; i18++) {
                this.f67735x13503529[i18] = parcel.readByte();
            }
        }
        int readInt3 = parcel.readInt();
        if (readInt3 > 0) {
            this.f67747x7f1b5bf2 = new byte[readInt3];
            for (int i19 = 0; i19 < readInt3; i19++) {
                this.f67747x7f1b5bf2[i19] = parcel.readByte();
            }
        }
        int readInt4 = parcel.readInt();
        if (readInt4 > 0) {
            this.f67748xd61859b3 = new byte[readInt4];
            for (int i27 = 0; i27 < readInt4; i27++) {
                this.f67748xd61859b3[i27] = parcel.readByte();
            }
        }
    }
}
