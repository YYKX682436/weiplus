package com.p314xaae8f345.p3085x8ea91595.p3105x36f002;

/* loaded from: classes13.dex */
public class Res {
    private static final java.lang.String TAG = "Res";

    /* renamed from: RclassName */
    protected final java.lang.String f56860x3eef5811;
    protected android.content.Context ctx;

    public Res(android.content.Context context) {
        this.ctx = context;
        this.f56860x3eef5811 = this.ctx.getPackageName() + ".R";
    }

    /* renamed from: reflectResouce */
    private int m105526xfdd2c3eb(java.lang.String str, java.lang.String str2) {
        if (this.f56860x3eef5811 == null || str == null || str2 == null) {
            return 0;
        }
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(this.f56860x3eef5811 + "$" + str);
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(cls.getField(str2).get(cls.newInstance()).toString(), -1);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            return -1;
        }
    }

    /* renamed from: drawable */
    public int m105527xcebc809e(java.lang.String str) {
        return m105526xfdd2c3eb("drawable", str);
    }

    public int id(java.lang.String str) {
        return m105526xfdd2c3eb(dm.i4.f66865x76d1ec5a, str);
    }

    /* renamed from: layout */
    public int m105528xbddafb2a(java.lang.String str) {
        return m105526xfdd2c3eb("layout", str);
    }

    /* renamed from: string */
    public int m105529xcad56011(java.lang.String str) {
        return m105526xfdd2c3eb("string", str);
    }

    /* renamed from: style */
    public int m105530x68b1db1(java.lang.String str) {
        return m105526xfdd2c3eb("style", str);
    }
}
