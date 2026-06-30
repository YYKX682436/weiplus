package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29;

/* renamed from: com.tencent.mm.plugin.wallet_core.model.Bankcard */
/* loaded from: classes9.dex */
public class C19091x9511676c extends dm.yb implements android.os.Parcelable {
    public static final l75.e0 A3 = dm.yb.m125718x3593deb(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c.class);

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c> f38671x681a0c0c = new at4.h();
    public java.lang.String I2;
    public java.lang.String J2;
    public final java.lang.String K2;
    public final java.lang.String L2;
    public java.lang.String M2;
    public java.lang.String N2;
    public double O2;
    public java.lang.String P2;
    public double Q2;
    public java.lang.String R2;
    public java.lang.String S2;
    public java.lang.String T2;
    public java.lang.String U2;
    public java.lang.String V2;
    public final at4.f W2;
    public int X2;
    public java.lang.String Y2;
    public boolean Z2;

    /* renamed from: a3, reason: collision with root package name */
    public at4.k f261095a3;

    /* renamed from: b3, reason: collision with root package name */
    public long f261096b3;

    /* renamed from: c3, reason: collision with root package name */
    public long f261097c3;

    /* renamed from: d3, reason: collision with root package name */
    public long f261098d3;

    /* renamed from: e3, reason: collision with root package name */
    public java.lang.String f261099e3;

    /* renamed from: f3, reason: collision with root package name */
    public int f261100f3;

    /* renamed from: g3, reason: collision with root package name */
    public int f261101g3;

    /* renamed from: h3, reason: collision with root package name */
    public java.lang.String f261102h3;

    /* renamed from: i3, reason: collision with root package name */
    public java.lang.String f261103i3;

    /* renamed from: j3, reason: collision with root package name */
    public int f261104j3;

    /* renamed from: k3, reason: collision with root package name */
    public java.lang.String f261105k3;

    /* renamed from: l3, reason: collision with root package name */
    public long f261106l3;

    /* renamed from: m3, reason: collision with root package name */
    public java.lang.String f261107m3;

    /* renamed from: n3, reason: collision with root package name */
    public java.lang.String f261108n3;

    /* renamed from: o3, reason: collision with root package name */
    public java.lang.String f261109o3;

    /* renamed from: p3, reason: collision with root package name */
    public java.lang.String f261110p3;

    /* renamed from: q3, reason: collision with root package name */
    public java.lang.String f261111q3;

    /* renamed from: r3, reason: collision with root package name */
    public java.lang.String f261112r3;

    /* renamed from: s3, reason: collision with root package name */
    public java.lang.String f261113s3;

    /* renamed from: t3, reason: collision with root package name */
    public java.lang.String f261114t3;

    /* renamed from: u3, reason: collision with root package name */
    public java.util.ArrayList f261115u3;

    /* renamed from: v3, reason: collision with root package name */
    public java.lang.String f261116v3;

    /* renamed from: w3, reason: collision with root package name */
    public java.lang.String f261117w3;

    /* renamed from: x3, reason: collision with root package name */
    public int f261118x3;

    /* renamed from: y3, reason: collision with root package name */
    public java.lang.String f261119y3;

    /* renamed from: z3, reason: collision with root package name */
    public java.util.ArrayList f261120z3;

    public C19091x9511676c() {
        this.N2 = null;
        this.Y2 = null;
        this.Z2 = false;
        this.f261115u3 = new java.util.ArrayList();
        this.f261120z3 = new java.util.ArrayList();
    }

    public static java.lang.String u0(android.content.Context context, int i17) {
        switch (i17) {
            case 1:
                return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575126kv5);
            case 2:
                return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kva);
            case 3:
                return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kvf);
            case 4:
                return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kv7);
            case 5:
                return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575124kv3);
            case 6:
                return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kv9);
            case 7:
                return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kvd);
            default:
                return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kvb);
        }
    }

    public boolean A0() {
        return (this.f69227x1d45800f & 128) > 0;
    }

    public boolean D0() {
        return (this.f69227x1d45800f & 64) > 0;
    }

    public boolean F0() {
        return (this.f69227x1d45800f & 4) > 0;
    }

    @Override // dm.yb, l75.f0
    /* renamed from: convertFrom */
    public void mo9015xbf5d97fd(android.database.Cursor cursor) {
        super.mo9015xbf5d97fd(cursor);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // dm.yb, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return A3;
    }

    public int t0(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05) {
        int i18 = this.f69220xb7753620;
        if (i18 != 0) {
            return i18;
        }
        if (c19099x8d444f05 == null || !c19099x8d444f05.f261208e.equals(this.N2)) {
            return !((i17 & this.f69221x3ca948e9) > 0) ? y0() ? 5 : 6 : (c19099x8d444f05 == null || c19099x8d444f05.H.isEmpty() || c19099x8d444f05.H.contains(this.f69223x58802fcb)) ? 0 : 7;
        }
        return 4;
    }

    public boolean v0() {
        return (this.f69227x1d45800f & 8) > 0;
    }

    public boolean w0() {
        return (this.f69227x1d45800f & 2) > 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f69217xaef0808c);
        parcel.writeString(this.f69233x225aa2b6);
        parcel.writeString(this.f69223x58802fcb);
        parcel.writeString(this.f69225xed6d60f6);
        parcel.writeInt(this.f69232xff761ac5);
        parcel.writeInt(this.f69227x1d45800f);
        parcel.writeInt(this.Z2 ? 1 : 0);
        parcel.writeString(this.f69249x61dbf87);
        parcel.writeDouble(this.f69251x46aaea26);
        parcel.writeDouble(this.f69252xf1ac0f39);
        parcel.writeDouble(this.f69230xdbf8d15);
        parcel.writeDouble(this.f69231x2c28d1ea);
        parcel.writeString(this.f69222x587fd4e1);
        parcel.writeString(this.f69218x2f3ef78d);
        parcel.writeInt(this.f69221x3ca948e9);
        parcel.writeInt(this.f69220xb7753620);
        parcel.writeString(this.N2);
        parcel.writeInt(this.X2);
        parcel.writeString(this.Y2);
        parcel.writeInt(this.f69219x5aaf4976);
        parcel.writeString(this.f69234x26bd161e);
        parcel.writeInt(this.f69260x2a326a79 ? 1 : 0);
        parcel.writeString(this.f69215x54da57dd);
        parcel.writeDouble(this.f69238xe5669181);
        parcel.writeDouble(this.f69242x17f4744b);
        parcel.writeString(this.f69250xdd49e65e);
        parcel.writeString(this.f69228x1e2a40ce);
        parcel.writeString(this.f261099e3);
        parcel.writeLong(this.f261096b3);
        parcel.writeLong(this.f261098d3);
        parcel.writeLong(this.f261097c3);
        parcel.writeInt(this.f261100f3);
        parcel.writeInt(this.f261104j3);
        parcel.writeInt(this.f261101g3);
        parcel.writeString(this.f261102h3);
        parcel.writeString(this.f261103i3);
        parcel.writeString(this.f261105k3);
        parcel.writeLong(this.f261106l3);
        parcel.writeString(this.f261107m3);
        parcel.writeString(this.f261108n3);
        parcel.writeString(this.f261109o3);
        parcel.writeString(this.f261110p3);
        parcel.writeString(this.f261111q3);
        parcel.writeString(this.f261112r3);
        parcel.writeString(this.f261113s3);
        parcel.writeString(this.f261114t3);
        parcel.writeStringList(this.f261115u3);
        parcel.writeString(this.f261116v3);
        parcel.writeString(this.f261117w3);
        parcel.writeInt(this.f261118x3);
        parcel.writeString(this.f261119y3);
        parcel.writeStringList(this.f261120z3);
    }

    public boolean y0() {
        return (this.f69227x1d45800f & 1) <= 0;
    }

    public boolean z0() {
        return (this.f69227x1d45800f & 256) > 0;
    }

    public C19091x9511676c(int i17) {
        this.N2 = null;
        this.Y2 = null;
        this.Z2 = false;
        this.f261115u3 = new java.util.ArrayList();
        this.f261120z3 = new java.util.ArrayList();
        this.f69221x3ca948e9 = i17;
    }

    public C19091x9511676c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, double d17, java.lang.String str7, double d18, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, at4.f fVar, int i17, java.lang.String str13, boolean z17, at4.k kVar, long j17, long j18, long j19, java.lang.String str14, int i18, int i19, java.lang.String str15, java.lang.String str16, int i27, java.lang.String str17, long j27, java.lang.String str18, java.lang.String str19, java.lang.String str20, java.lang.String str21, java.lang.String str22) {
        this.N2 = null;
        this.Y2 = null;
        this.Z2 = false;
        this.f261115u3 = new java.util.ArrayList();
        this.f261120z3 = new java.util.ArrayList();
        this.I2 = str;
        this.J2 = str2;
        this.K2 = str3;
        this.L2 = str4;
        this.M2 = str5;
        this.N2 = str6;
        this.O2 = d17;
        this.P2 = str7;
        this.Q2 = d18;
        this.R2 = str8;
        this.S2 = str9;
        this.T2 = str10;
        this.U2 = str11;
        this.V2 = str12;
        this.W2 = fVar;
        this.X2 = i17;
        this.Y2 = str13;
        this.Z2 = z17;
        this.f261095a3 = kVar;
        this.f261096b3 = j17;
        this.f261097c3 = j18;
        this.f261098d3 = j19;
        this.f261099e3 = str14;
        this.f261100f3 = i18;
        this.f261101g3 = i19;
        this.f261102h3 = str15;
        this.f261103i3 = str16;
        this.f261104j3 = i27;
        this.f261105k3 = str17;
        this.f261106l3 = j27;
        this.f261107m3 = str18;
        this.f261108n3 = str19;
        this.f261109o3 = str20;
        this.f261110p3 = str21;
        this.f261111q3 = str22;
    }

    public C19091x9511676c(android.os.Parcel parcel) {
        this.N2 = null;
        this.Y2 = null;
        this.Z2 = false;
        this.f261115u3 = new java.util.ArrayList();
        this.f261120z3 = new java.util.ArrayList();
        this.f69217xaef0808c = parcel.readString();
        this.f69233x225aa2b6 = parcel.readString();
        this.f69223x58802fcb = parcel.readString();
        this.f69225xed6d60f6 = parcel.readString();
        this.f69232xff761ac5 = parcel.readInt();
        this.f69227x1d45800f = parcel.readInt();
        this.Z2 = parcel.readInt() == 1;
        this.f69249x61dbf87 = parcel.readString();
        this.f69251x46aaea26 = parcel.readDouble();
        this.f69252xf1ac0f39 = parcel.readDouble();
        this.f69230xdbf8d15 = parcel.readDouble();
        this.f69231x2c28d1ea = parcel.readDouble();
        this.f69222x587fd4e1 = parcel.readString();
        this.f69218x2f3ef78d = parcel.readString();
        this.f69221x3ca948e9 = parcel.readInt();
        this.f69220xb7753620 = parcel.readInt();
        this.N2 = parcel.readString();
        this.X2 = parcel.readInt();
        this.Y2 = parcel.readString();
        this.f69219x5aaf4976 = parcel.readInt();
        this.f69234x26bd161e = parcel.readString();
        this.f69260x2a326a79 = parcel.readInt() == 1;
        this.f69215x54da57dd = parcel.readString();
        this.f69238xe5669181 = parcel.readDouble();
        this.f69242x17f4744b = parcel.readDouble();
        this.f69250xdd49e65e = parcel.readString();
        this.f69228x1e2a40ce = parcel.readString();
        this.f261099e3 = parcel.readString();
        this.f261096b3 = parcel.readLong();
        this.f261098d3 = parcel.readLong();
        this.f261097c3 = parcel.readLong();
        this.f261100f3 = parcel.readInt();
        this.f261104j3 = parcel.readInt();
        this.f261101g3 = parcel.readInt();
        this.f261102h3 = parcel.readString();
        this.f261103i3 = parcel.readString();
        this.f261105k3 = parcel.readString();
        this.f261106l3 = parcel.readLong();
        this.f261107m3 = parcel.readString();
        this.f261108n3 = parcel.readString();
        this.f261109o3 = parcel.readString();
        this.f261110p3 = parcel.readString();
        this.f261111q3 = parcel.readString();
        this.f261112r3 = parcel.readString();
        this.f261113s3 = parcel.readString();
        this.f261114t3 = parcel.readString();
        parcel.readStringList(this.f261115u3);
        this.f261116v3 = parcel.readString();
        this.f261117w3 = parcel.readString();
        this.f261118x3 = parcel.readInt();
        this.f261119y3 = parcel.readString();
        parcel.readStringList(this.f261120z3);
    }
}
