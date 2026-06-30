package com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b;

/* renamed from: com.tencent.mm.storage.emotion.EmojiGroupInfo */
/* loaded from: classes12.dex */
public class C21051xbc71d247 extends dm.t2 implements android.os.Parcelable, qk.w6 {
    public static final l75.e0 M1 = dm.t2.m125504x3593deb(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247.class);

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247> f39212x681a0c0c = new z85.c();

    public C21051xbc71d247() {
    }

    public void A0(java.lang.String str) {
        this.f68396x5bec8145 = str;
    }

    public void D0(int i17) {
        this.f68401x10a0fed7 = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // dm.t2, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return M1;
    }

    /* renamed from: setType */
    public void m77990x7650bebc(int i17) {
        this.f68403x2262335f = i17;
    }

    public r45.zj0 t0() {
        r45.zj0 zj0Var = new r45.zj0();
        zj0Var.f473661d = this.f68396x5bec8145;
        zj0Var.f473662e = this.f68389xc8eaa935;
        zj0Var.f473663f = this.f68391x4a7ba5e9;
        zj0Var.f473664g = this.f68386x4a7729ef;
        zj0Var.f473665h = this.f68383x9ec0eed4;
        java.lang.String str = this.f68392x51cf1ab;
        zj0Var.f473666i = str;
        zj0Var.f473667m = this.f68395x4a7eba98;
        zj0Var.f473668n = this.f68388x4a782aca;
        zj0Var.f473669o = this.f68385x346f9696;
        zj0Var.f473670p = (int) this.f68387x8c13c8fd;
        zj0Var.f473671q = this.f68384x3e47b329;
        zj0Var.f473672r = (int) this.f68394xe5087858;
        zj0Var.f473674t = str;
        return zj0Var;
    }

    /* renamed from: toString */
    public java.lang.String m77991x9616526c() {
        return "field_productID:" + this.f68396x5bec8145 + "\nfield_packIconUrl:" + this.f68390xa61c4218 + "\nfield_packGrayIconUrl:" + this.f68389xc8eaa935 + "\nfield_packCoverUrl:" + this.f68385x346f9696 + "\nfield_packName:" + this.f68391x4a7ba5e9 + "\nfield_packDesc:" + this.f68386x4a7729ef + "\nfield_packAuthInfo:" + this.f68383x9ec0eed4 + "\nfield_packPrice:" + this.f68392x51cf1ab + "\nfield_packType:" + this.f68395x4a7eba98 + "\nfield_packFlag:" + this.f68388x4a782aca + "\nfield_packExpire:" + this.f68387x8c13c8fd + "\nfield_packTimeStamp:" + this.f68394xe5087858 + "\nfield_packCopyright:" + this.f68384x3e47b329 + "\nfield_type:" + this.f68403x2262335f + "\nfield_status:" + this.f68401x10a0fed7 + "\nfield_sort:" + this.f68400x226199c3 + "\nfield_lastUseTime:" + this.f68382xd33ad9b9 + "\nfield_packStatus:" + this.f68393xa3b89bd0 + "\nfield_recommand:" + this.f68397xd5942cb3 + "\nfield_sync:" + this.f68402x2261bec0 + "\nfield_idx:" + this.f68379x4b6e59f8 + "\nfield_BigIconUrl:" + this.f68374x14a71d9b + "\nfield_MutiLanName:" + this.f68375x48a3702 + "\nfield_count:" + this.f68377x28f0318a + "\n";
    }

    public void u0(java.lang.String str) {
        this.f68389xc8eaa935 = str;
    }

    public void v0(long j17) {
        this.f68382xd33ad9b9 = j17;
    }

    public void w0(java.lang.String str) {
        this.f68390xa61c4218 = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f68396x5bec8145);
        parcel.writeString(this.f68390xa61c4218);
        parcel.writeString(this.f68389xc8eaa935);
        parcel.writeString(this.f68385x346f9696);
        parcel.writeString(this.f68391x4a7ba5e9);
        parcel.writeString(this.f68386x4a7729ef);
        parcel.writeString(this.f68383x9ec0eed4);
        parcel.writeString(this.f68392x51cf1ab);
        parcel.writeInt(this.f68395x4a7eba98);
        parcel.writeInt(this.f68388x4a782aca);
        parcel.writeLong(this.f68387x8c13c8fd);
        parcel.writeLong(this.f68394xe5087858);
        parcel.writeString(this.f68384x3e47b329);
        parcel.writeInt(this.f68403x2262335f);
        parcel.writeInt(this.f68401x10a0fed7);
        parcel.writeInt(this.f68400x226199c3);
        parcel.writeLong(this.f68382xd33ad9b9);
        parcel.writeInt(this.f68393xa3b89bd0);
        parcel.writeInt(this.f68378x225ba391);
        parcel.writeInt(this.f68397xd5942cb3);
        parcel.writeInt(this.f68402x2261bec0);
        parcel.writeInt(this.f68379x4b6e59f8);
        parcel.writeString(this.f68374x14a71d9b);
        parcel.writeString(this.f68375x48a3702);
        parcel.writeInt(this.f68398x61a09e8d);
        parcel.writeString(this.f68381x225e3613);
        parcel.writeString(this.f68399x61a1d65d);
        parcel.writeInt(this.f68376xce8675f1);
        parcel.writeInt(this.f68377x28f0318a);
        parcel.writeLong(this.f72763xa3c65b86);
        parcel.writeString(this.f68380x29449433);
    }

    public void y0(java.lang.String str) {
        this.f68391x4a7ba5e9 = str;
    }

    public void z0(int i17) {
        this.f68393xa3b89bd0 = i17;
    }

    public C21051xbc71d247(android.os.Parcel parcel) {
        this.f68396x5bec8145 = parcel.readString();
        this.f68390xa61c4218 = parcel.readString();
        this.f68389xc8eaa935 = parcel.readString();
        this.f68385x346f9696 = parcel.readString();
        this.f68391x4a7ba5e9 = parcel.readString();
        this.f68386x4a7729ef = parcel.readString();
        this.f68383x9ec0eed4 = parcel.readString();
        this.f68392x51cf1ab = parcel.readString();
        this.f68395x4a7eba98 = parcel.readInt();
        this.f68388x4a782aca = parcel.readInt();
        this.f68387x8c13c8fd = parcel.readLong();
        this.f68394xe5087858 = parcel.readLong();
        this.f68384x3e47b329 = parcel.readString();
        this.f68403x2262335f = parcel.readInt();
        this.f68401x10a0fed7 = parcel.readInt();
        this.f68400x226199c3 = parcel.readInt();
        this.f68382xd33ad9b9 = parcel.readLong();
        this.f68393xa3b89bd0 = parcel.readInt();
        this.f68378x225ba391 = parcel.readInt();
        this.f68397xd5942cb3 = parcel.readInt();
        this.f68402x2261bec0 = parcel.readInt();
        this.f68379x4b6e59f8 = parcel.readInt();
        this.f68374x14a71d9b = parcel.readString();
        this.f68375x48a3702 = parcel.readString();
        this.f68398x61a09e8d = parcel.readInt();
        this.f68381x225e3613 = parcel.readString();
        this.f68399x61a1d65d = parcel.readString();
        this.f68376xce8675f1 = parcel.readInt();
        this.f68377x28f0318a = parcel.readInt();
        this.f72763xa3c65b86 = parcel.readLong();
        this.f68380x29449433 = parcel.readString();
    }
}
