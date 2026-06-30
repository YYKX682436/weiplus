package com.p314xaae8f345.p347x615374d.p349x208df1fe.app;

/* renamed from: com.tencent.kinda.framework.app.KindaConfigCacheStg */
/* loaded from: classes12.dex */
public class C3125x9fd75533 extends l75.n0 {

    /* renamed from: SAVE_CHARSET */
    public static final java.lang.String f11976x3730806a = "ISO-8859-1";

    /* renamed from: SQL_CREATE */
    public static final java.lang.String[] f11977xcb8b0ad = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3124x5b0ec5a6.f11975x3164ae, "KindaConfigCache")};

    /* renamed from: TABLE_NAME */
    public static final java.lang.String f11978xc4fe047c = "KindaConfigCache";
    public static final java.lang.String TAG = "MicroMsg.KindaConfigCacheStg";

    /* renamed from: db, reason: collision with root package name */
    private l75.k0 f127487db;

    public C3125x9fd75533(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3124x5b0ec5a6.f11975x3164ae, "KindaConfigCache", null);
        this.f127487db = k0Var;
    }

    /* renamed from: getImpl */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3124x5b0ec5a6 m25116xfb80ca96(java.lang.String str) {
        android.database.Cursor B = this.f127487db.B("select * from KindaConfigCache where key=?", new java.lang.String[]{str});
        if (B == null) {
            return null;
        }
        if (B.getCount() == 0) {
            B.close();
            return null;
        }
        B.moveToFirst();
        com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3124x5b0ec5a6 c3124x5b0ec5a6 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3124x5b0ec5a6();
        c3124x5b0ec5a6.mo9015xbf5d97fd(B);
        B.close();
        return c3124x5b0ec5a6;
    }

    /* renamed from: resolveObj */
    public static java.lang.Object m25117xa0a85b6b(int i17, java.lang.String str) {
        try {
            switch (i17) {
                case 1:
                    return java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str, 0));
                case 2:
                    return java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(str, 0L));
                case 3:
                    return str;
                case 4:
                    return java.lang.Boolean.valueOf(str);
                case 5:
                    return java.lang.Float.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(str, 0.0f));
                case 6:
                    return java.lang.Double.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(str, 0.0d));
                case 7:
                    return str.getBytes();
                default:
                    return null;
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "exception:%s", "");
            return null;
        }
    }

    public java.lang.Object get(java.lang.String str, java.lang.Object obj) {
        java.lang.Object m25117xa0a85b6b;
        com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3124x5b0ec5a6 m25116xfb80ca96 = m25116xfb80ca96(str);
        return (m25116xfb80ca96 == null || (m25117xa0a85b6b = m25117xa0a85b6b(m25116xfb80ca96.f66414x2262335f, m25116xfb80ca96.f66415x29f571ec)) == null) ? obj : m25117xa0a85b6b;
    }

    /* renamed from: getBinary */
    public byte[] m25118x124d2ef7(java.lang.String str) {
        return (byte[]) get(str, new byte[0]);
    }

    /* renamed from: getInt */
    public int m25119xb58848b9(java.lang.String str) {
        return ((java.lang.Integer) get(str, (java.lang.Object) 0)).intValue();
    }

    /* renamed from: getLong */
    public long m25120xfb822ef2(java.lang.String str) {
        return ((java.lang.Long) get(str, (java.lang.Object) 0L)).longValue();
    }

    /* renamed from: getString */
    public java.lang.String m25121x2fec8307(java.lang.String str) {
        return (java.lang.String) get(str, "");
    }

    public void put(java.lang.String str, java.lang.Object obj, int i17) {
        put(str, obj, i17, 0L);
    }

    /* renamed from: putBinary */
    public void m25122xc6c7e3f0(java.lang.String str, byte[] bArr) {
        put(str, bArr, 7);
    }

    /* renamed from: putInt */
    public void m25124xc5c55e60(java.lang.String str, int i17) {
        put(str, java.lang.Integer.valueOf(i17), 1);
    }

    /* renamed from: putLong */
    public void m25126xf2e7ce2b(java.lang.String str, long j17) {
        put(str, java.lang.Long.valueOf(j17), 2);
    }

    /* renamed from: putString */
    public void m25128xe4673800(java.lang.String str, java.lang.String str2) {
        put(str, str2, 3);
    }

    public void put(java.lang.String str, java.lang.Object obj, int i17, long j17) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3124x5b0ec5a6 c3124x5b0ec5a6 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3124x5b0ec5a6();
        c3124x5b0ec5a6.f66414x2262335f = i17;
        c3124x5b0ec5a6.f66413x4b6e619a = str;
        c3124x5b0ec5a6.f66412xa987964e = j17;
        if (i17 == 1 && (obj instanceof java.lang.Integer)) {
            c3124x5b0ec5a6.f66415x29f571ec = obj.toString();
        } else if (i17 == 4 && (obj instanceof java.lang.Integer)) {
            c3124x5b0ec5a6.f66415x29f571ec = obj.toString();
        } else if (i17 == 6 && (obj instanceof java.lang.Double)) {
            c3124x5b0ec5a6.f66415x29f571ec = obj.toString();
        } else if (i17 == 5 && (obj instanceof java.lang.Float)) {
            c3124x5b0ec5a6.f66415x29f571ec = obj.toString();
        } else if (i17 == 2 && (obj instanceof java.lang.Long)) {
            c3124x5b0ec5a6.f66415x29f571ec = obj.toString();
        } else if (i17 == 3 && (obj instanceof java.lang.String)) {
            c3124x5b0ec5a6.f66415x29f571ec = obj.toString();
        } else if (i17 != 7 || !(obj instanceof byte[])) {
            return;
        } else {
            c3124x5b0ec5a6.f66415x29f571ec = new java.lang.String((byte[]) obj, java.nio.charset.Charset.forName(f11976x3730806a));
        }
        mo11260x413cb2b4(c3124x5b0ec5a6);
    }

    /* renamed from: putBinary */
    public void m25123xc6c7e3f0(java.lang.String str, byte[] bArr, long j17) {
        put(str, bArr, 7, j17);
    }

    /* renamed from: putInt */
    public void m25125xc5c55e60(java.lang.String str, int i17, long j17) {
        put(str, java.lang.Integer.valueOf(i17), 1, j17);
    }

    /* renamed from: putLong */
    public void m25127xf2e7ce2b(java.lang.String str, long j17, long j18) {
        put(str, java.lang.Long.valueOf(j17), 2, j18);
    }

    /* renamed from: putString */
    public void m25129xe4673800(java.lang.String str, java.lang.String str2, long j17) {
        put(str, str2, 3, j17);
    }
}
