package p3335x340bc8.p3336x27ae93cd.p3338xd3ab5596;

/* renamed from: oicq.wlogin_sdk.sharemem.WloginSigInfo */
/* loaded from: classes13.dex */
public class C29273x78a22b4d implements java.io.Serializable, android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<p3335x340bc8.p3336x27ae93cd.p3338xd3ab5596.C29273x78a22b4d> f73081x681a0c0c = new i36.b();

    /* renamed from: serialVersionUID */
    private static final long f73082x3a3ed56c = 1;

    /* renamed from: _A2_expire_time */
    public long f73083x1c84acde;
    public byte[] _D2;

    /* renamed from: _D2Key */
    public byte[] f73084xa5f28212;

    /* renamed from: _TGT */
    public byte[] f73085x2c7382;

    /* renamed from: _TGTKey */
    public byte[] f73086x34d6eb7d;

    /* renamed from: _access_token */
    public byte[] f73087xf0da13d;

    /* renamed from: _app_pri */
    public long f73088x5d420a4a;

    /* renamed from: _create_time */
    public long f73089xbd810671;

    /* renamed from: _en_A1 */
    public byte[] f73090xa7df1667;

    /* renamed from: _expire_time */
    public long f73091xd530c82e;

    /* renamed from: _lsKey */
    public byte[] f73092xa843ba59;

    /* renamed from: _noPicSig */
    public byte[] f73093x2673c567;

    /* renamed from: _openid */
    public byte[] f73094x6533c604;

    /* renamed from: _openkey */
    public byte[] f73095x41450296;

    /* renamed from: _ret_appid */
    public long f73096x498bdc5f;

    /* renamed from: _sKey */
    public byte[] f73097x57025cb;

    /* renamed from: _sid */
    public byte[] f73098x2cec0f;

    /* renamed from: _userA5 */
    public byte[] f73099x6f9b2a3e;

    /* renamed from: _userA8 */
    public byte[] f73100x6f9b2a41;

    /* renamed from: _userPasswdSig */
    public byte[] f73101xf063fc9;

    /* renamed from: _userSig64 */
    public byte[] f73102xbacf98c5;

    /* renamed from: _userStSig */
    public byte[] f73103xbad45426;

    /* renamed from: _userStWebSig */
    public byte[] f73104x91867568;

    /* renamed from: _userSt_Key */
    public byte[] f73105x9fbb34ab;

    /* renamed from: _vkey */
    public byte[] f73106x571fb08;

    public C29273x78a22b4d(long j17, long j18, long j19, long j27, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte[] bArr9, byte[] bArr10, byte[] bArr11, byte[] bArr12, byte[][] bArr13) {
        this.f73096x498bdc5f = 0L;
        this.f73088x5d420a4a = j17;
        this.f73089xbd810671 = j18;
        this.f73091xd530c82e = j19;
        this.f73083x1c84acde = j27;
        this.f73085x2c7382 = (byte[]) bArr.clone();
        this.f73086x34d6eb7d = (byte[]) bArr2.clone();
        this.f73103xbad45426 = (byte[]) bArr3.clone();
        this.f73105x9fbb34ab = (byte[]) bArr4.clone();
        if (bArr5 != null) {
            this.f73104x91867568 = (byte[]) bArr5.clone();
        } else {
            this.f73104x91867568 = new byte[0];
        }
        this.f73101xf063fc9 = new byte[0];
        if (bArr6 != null) {
            this.f73099x6f9b2a3e = (byte[]) bArr6.clone();
        } else {
            this.f73099x6f9b2a3e = new byte[0];
        }
        if (bArr7 != null) {
            this.f73100x6f9b2a41 = (byte[]) bArr7.clone();
        } else {
            this.f73100x6f9b2a41 = new byte[0];
        }
        if (bArr8 != null) {
            this.f73092xa843ba59 = (byte[]) bArr8.clone();
        } else {
            this.f73092xa843ba59 = new byte[0];
        }
        if (bArr9 != null) {
            this.f73097x57025cb = (byte[]) bArr9.clone();
        } else {
            this.f73097x57025cb = new byte[0];
        }
        if (bArr10 != null) {
            this.f73102xbacf98c5 = (byte[]) bArr10.clone();
        } else {
            this.f73102xbacf98c5 = new byte[0];
        }
        if (bArr11 != null) {
            this.f73094x6533c604 = (byte[]) bArr11.clone();
        } else {
            this.f73094x6533c604 = new byte[0];
        }
        if (bArr12 != null) {
            this.f73095x41450296 = (byte[]) bArr12.clone();
        } else {
            this.f73095x41450296 = new byte[0];
        }
        if (bArr13 == null || bArr13.length != 7) {
            this.f73106x571fb08 = new byte[0];
            this.f73090xa7df1667 = new byte[0];
            this.f73087xf0da13d = new byte[0];
            this._D2 = new byte[0];
            this.f73084xa5f28212 = new byte[0];
            this.f73098x2cec0f = new byte[0];
            this.f73093x2673c567 = new byte[0];
            return;
        }
        this.f73106x571fb08 = (byte[]) bArr13[0].clone();
        this.f73090xa7df1667 = (byte[]) bArr13[1].clone();
        this.f73087xf0da13d = (byte[]) bArr13[2].clone();
        this._D2 = (byte[]) bArr13[3].clone();
        this.f73084xa5f28212 = (byte[]) bArr13[4].clone();
        this.f73098x2cec0f = (byte[]) bArr13[5].clone();
        this.f73093x2673c567 = (byte[]) bArr13[6].clone();
    }

    public p3335x340bc8.p3336x27ae93cd.p3338xd3ab5596.C29273x78a22b4d Set(long j17, long j18, long j19, long j27, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte[] bArr9, byte[] bArr10, byte[] bArr11, byte[] bArr12, byte[][] bArr13) {
        this.f73088x5d420a4a = j17;
        this.f73089xbd810671 = j18;
        this.f73091xd530c82e = j19;
        this.f73083x1c84acde = j27;
        this.f73085x2c7382 = (byte[]) bArr.clone();
        this.f73086x34d6eb7d = (byte[]) bArr2.clone();
        this.f73103xbad45426 = (byte[]) bArr3.clone();
        this.f73105x9fbb34ab = (byte[]) bArr4.clone();
        if (bArr5 != null) {
            this.f73104x91867568 = (byte[]) bArr5.clone();
        } else {
            this.f73104x91867568 = new byte[0];
        }
        this.f73101xf063fc9 = new byte[0];
        if (bArr6 != null) {
            this.f73099x6f9b2a3e = (byte[]) bArr6.clone();
        } else {
            this.f73099x6f9b2a3e = new byte[0];
        }
        if (bArr7 != null) {
            this.f73100x6f9b2a41 = (byte[]) bArr7.clone();
        } else {
            this.f73100x6f9b2a41 = new byte[0];
        }
        if (bArr8 != null) {
            this.f73092xa843ba59 = (byte[]) bArr8.clone();
        } else {
            this.f73092xa843ba59 = new byte[0];
        }
        if (bArr9 != null) {
            this.f73097x57025cb = (byte[]) bArr9.clone();
        } else {
            this.f73097x57025cb = new byte[0];
        }
        if (bArr10 != null) {
            this.f73102xbacf98c5 = (byte[]) bArr10.clone();
        } else {
            this.f73102xbacf98c5 = new byte[0];
        }
        if (bArr11 != null) {
            this.f73094x6533c604 = (byte[]) bArr11.clone();
        } else {
            this.f73094x6533c604 = new byte[0];
        }
        if (bArr12 != null) {
            this.f73095x41450296 = (byte[]) bArr12.clone();
        } else {
            this.f73095x41450296 = new byte[0];
        }
        if (bArr13 == null || bArr13.length != 7) {
            this.f73106x571fb08 = new byte[0];
            this.f73087xf0da13d = new byte[0];
            this._D2 = new byte[0];
            this.f73084xa5f28212 = new byte[0];
            this.f73098x2cec0f = new byte[0];
            this.f73093x2673c567 = new byte[0];
        } else {
            this.f73106x571fb08 = (byte[]) bArr13[0].clone();
            bArr13[1].clone();
            if (((byte[]) bArr13[1].clone()).length > 0) {
                this.f73090xa7df1667 = (byte[]) bArr13[1].clone();
                byte[] bArr14 = bArr13[6];
                if (bArr14 == null || bArr14.length <= 0) {
                    this.f73093x2673c567 = new byte[0];
                } else {
                    this.f73093x2673c567 = (byte[]) bArr14.clone();
                }
            }
            this.f73087xf0da13d = (byte[]) bArr13[2].clone();
            this._D2 = (byte[]) bArr13[3].clone();
            this.f73084xa5f28212 = (byte[]) bArr13[4].clone();
            this.f73098x2cec0f = (byte[]) bArr13[5].clone();
        }
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: readFromParcel */
    public void m151446xb362ce89(android.os.Parcel parcel) {
        this.f73085x2c7382 = parcel.createByteArray();
        this.f73086x34d6eb7d = parcel.createByteArray();
        this.f73103xbad45426 = parcel.createByteArray();
        this.f73105x9fbb34ab = parcel.createByteArray();
        this.f73104x91867568 = parcel.createByteArray();
        this.f73101xf063fc9 = parcel.createByteArray();
        this.f73099x6f9b2a3e = parcel.createByteArray();
        this.f73100x6f9b2a41 = parcel.createByteArray();
        this.f73092xa843ba59 = parcel.createByteArray();
        this.f73097x57025cb = parcel.createByteArray();
        this.f73102xbacf98c5 = parcel.createByteArray();
        this.f73094x6533c604 = parcel.createByteArray();
        this.f73095x41450296 = parcel.createByteArray();
        this.f73106x571fb08 = parcel.createByteArray();
        this.f73090xa7df1667 = parcel.createByteArray();
        this.f73087xf0da13d = parcel.createByteArray();
        this._D2 = parcel.createByteArray();
        this.f73084xa5f28212 = parcel.createByteArray();
        this.f73098x2cec0f = parcel.createByteArray();
        this.f73093x2673c567 = parcel.createByteArray();
        this.f73091xd530c82e = parcel.readLong();
        this.f73083x1c84acde = parcel.readLong();
        this.f73089xbd810671 = parcel.readLong();
        this.f73088x5d420a4a = parcel.readLong();
        this.f73096x498bdc5f = parcel.readLong();
    }

    /* renamed from: toString */
    public java.lang.String m151447x9616526c() {
        try {
            return java.lang.String.format(java.util.Locale.getDefault(), "{A1:%d,%d,%s A2:%d,%s D2:%d,%s ext:%d-%d ct:%d}", java.lang.Integer.valueOf(this.f73090xa7df1667.length), java.lang.Long.valueOf(this.f73089xbd810671), p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.i(this.f73090xa7df1667, 2), java.lang.Integer.valueOf(this.f73085x2c7382.length), p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.i(this.f73085x2c7382, 2), java.lang.Integer.valueOf(this._D2.length), p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.i(this._D2, 2), java.lang.Long.valueOf(this.f73091xd530c82e), java.lang.Long.valueOf(this.f73083x1c84acde), java.lang.Long.valueOf(this.f73089xbd810671));
        } catch (java.lang.Exception e17) {
            p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.v("WloginSigInfo.toString", e17);
            return "WloginSigInfo";
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByteArray(this.f73085x2c7382);
        parcel.writeByteArray(this.f73086x34d6eb7d);
        parcel.writeByteArray(this.f73103xbad45426);
        parcel.writeByteArray(this.f73105x9fbb34ab);
        parcel.writeByteArray(this.f73104x91867568);
        parcel.writeByteArray(this.f73101xf063fc9);
        parcel.writeByteArray(this.f73099x6f9b2a3e);
        parcel.writeByteArray(this.f73100x6f9b2a41);
        parcel.writeByteArray(this.f73092xa843ba59);
        parcel.writeByteArray(this.f73097x57025cb);
        parcel.writeByteArray(this.f73102xbacf98c5);
        parcel.writeByteArray(this.f73094x6533c604);
        parcel.writeByteArray(this.f73095x41450296);
        parcel.writeByteArray(this.f73106x571fb08);
        parcel.writeByteArray(this.f73090xa7df1667);
        parcel.writeByteArray(this.f73087xf0da13d);
        parcel.writeByteArray(this._D2);
        parcel.writeByteArray(this.f73084xa5f28212);
        parcel.writeByteArray(this.f73098x2cec0f);
        parcel.writeByteArray(this.f73093x2673c567);
        parcel.writeLong(this.f73091xd530c82e);
        parcel.writeLong(this.f73083x1c84acde);
        parcel.writeLong(this.f73089xbd810671);
        parcel.writeLong(this.f73088x5d420a4a);
        parcel.writeLong(this.f73096x498bdc5f);
    }

    private C29273x78a22b4d(android.os.Parcel parcel) {
        this.f73091xd530c82e = 0L;
        this.f73083x1c84acde = 0L;
        this.f73089xbd810671 = 0L;
        this.f73088x5d420a4a = 0L;
        this.f73096x498bdc5f = 0L;
        m151446xb362ce89(parcel);
    }

    public /* synthetic */ C29273x78a22b4d(android.os.Parcel parcel, i36.b bVar) {
        this(parcel);
    }
}
