package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper */
/* loaded from: classes9.dex */
public class C19088xa4b300c1 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1> f38668x681a0c0c = new zs4.a();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19089x1d7f0ae9 f261037d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f261038e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f261039f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f261040g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f261041h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f261042i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f261043m;

    /* renamed from: n, reason: collision with root package name */
    public int f261044n;

    public C19088xa4b300c1() {
        this.f261040g = "";
        this.f261041h = "";
        this.f261042i = "";
        this.f261043m = false;
    }

    public boolean a(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, android.os.Bundle bundle, android.content.DialogInterface.OnClickListener onClickListener, com.p314xaae8f345.mm.p2802xd031a825.g gVar) {
        return b(abstractActivityC21394xb3d2c0cf, bundle, onClickListener, gVar, false);
    }

    public boolean b(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, android.os.Bundle bundle, android.content.DialogInterface.OnClickListener onClickListener, com.p314xaae8f345.mm.p2802xd031a825.g gVar, boolean z17) {
        if (this.f261043m) {
            return false;
        }
        if ("1".equals(this.f261038e)) {
            if (!this.f261043m) {
                this.f261043m = true;
            }
            return zs4.q.g(abstractActivityC21394xb3d2c0cf, this.f261039f, 0, this.f261040g, this.f261041h, bundle, z17, onClickListener, gVar, this.f261044n, 1);
        }
        if (!"2".equals(this.f261038e) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f261042i)) {
            return false;
        }
        if (!this.f261043m) {
            this.f261043m = true;
        }
        zs4.q.h(abstractActivityC21394xb3d2c0cf, this.f261039f, this.f261042i, this.f261040g, this.f261041h, z17, onClickListener);
        return true;
    }

    public boolean c(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, android.os.Bundle bundle, android.content.DialogInterface.OnClickListener onClickListener, com.p314xaae8f345.mm.p2802xd031a825.g gVar, boolean z17) {
        boolean z18 = false;
        if (this.f261043m) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19089x1d7f0ae9 c19089x1d7f0ae9 = this.f261037d;
        if (c19089x1d7f0ae9 != null && c19089x1d7f0ae9.f261045d == 1) {
            int i17 = this.f261044n;
            java.lang.String str = c19089x1d7f0ae9.f261046e;
            java.lang.String str2 = c19089x1d7f0ae9.f261047f;
            java.lang.String str3 = c19089x1d7f0ae9.f261048g;
            gm0.j1.i();
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_SET_PWD_TIP_INT_SYNC;
            int intValue = ((java.lang.Integer) c17.m(u3Var, 0)).intValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealnameVerifyUtil", "showSetPwdDialog count %s", java.lang.Integer.valueOf(intValue));
            if (intValue < 3) {
                gm0.j1.i();
                gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(intValue + 1));
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    str2 = abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    str3 = abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 B = db5.e1.B(abstractActivityC21394xb3d2c0cf, str, "", str3, str2, new zs4.d(bundle, i17, abstractActivityC21394xb3d2c0cf, z17), onClickListener == null ? new zs4.c(z17, abstractActivityC21394xb3d2c0cf) : onClickListener, com.p314xaae8f345.mm.R.C30859x5a72f63.aaq);
                if (B != null) {
                    B.setOnCancelListener(new zs4.e(z17, abstractActivityC21394xb3d2c0cf));
                    B.setOnDismissListener(new zs4.f(z17, abstractActivityC21394xb3d2c0cf));
                }
                z18 = true;
            }
            if (z18 && !this.f261043m) {
                this.f261043m = true;
            }
        }
        return z18;
    }

    public void d(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17) {
        this.f261037d = null;
        this.f261038e = str;
        this.f261039f = str2;
        this.f261040g = str3;
        this.f261041h = str4;
        this.f261042i = str5;
        this.f261044n = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.f261037d, i17);
        parcel.writeString(this.f261038e);
        parcel.writeString(this.f261039f);
        parcel.writeString(this.f261040g);
        parcel.writeString(this.f261041h);
        parcel.writeString(this.f261042i);
        parcel.writeByte(this.f261043m ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f261044n);
    }

    public C19088xa4b300c1(android.os.Parcel parcel) {
        this.f261040g = "";
        this.f261041h = "";
        this.f261042i = "";
        this.f261043m = false;
        this.f261037d = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19089x1d7f0ae9) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19089x1d7f0ae9.class.getClassLoader());
        this.f261038e = parcel.readString();
        this.f261039f = parcel.readString();
        this.f261040g = parcel.readString();
        this.f261041h = parcel.readString();
        this.f261042i = parcel.readString();
        this.f261043m = parcel.readByte() != 0;
        this.f261044n = parcel.readInt();
    }
}
