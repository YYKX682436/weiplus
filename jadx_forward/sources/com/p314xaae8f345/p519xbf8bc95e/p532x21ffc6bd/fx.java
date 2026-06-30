package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class fx {

    /* renamed from: a, reason: collision with root package name */
    public static final int f131027a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f131028b = 1;

    /* renamed from: c, reason: collision with root package name */
    public int f131029c;

    /* renamed from: d, reason: collision with root package name */
    public int f131030d;

    /* renamed from: e, reason: collision with root package name */
    public org.json.JSONArray f131031e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String[] f131032f;

    public fx() {
        this.f131032f = new java.lang.String[0];
    }

    private int c() {
        return this.f131029c;
    }

    private int d() {
        return this.f131030d;
    }

    private org.json.JSONArray e() {
        return this.f131031e;
    }

    private java.lang.String[] f() {
        return this.f131032f;
    }

    public final boolean a() {
        return this.f131029c == 1;
    }

    public final boolean b() {
        return this.f131030d == 1;
    }

    /* renamed from: toString */
    public final java.lang.String m36737x9616526c() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("IndoorAuth{mEnabled=");
        stringBuffer.append(this.f131029c);
        stringBuffer.append(", mType=");
        stringBuffer.append(this.f131030d);
        stringBuffer.append(", mBuildingJsonArray=");
        stringBuffer.append(this.f131031e);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public fx(int i17, int i18, org.json.JSONArray jSONArray) {
        this.f131032f = new java.lang.String[0];
        this.f131029c = i17;
        this.f131030d = i18;
        this.f131031e = jSONArray;
        if (jSONArray == null) {
            this.f131032f = null;
            return;
        }
        int length = jSONArray.length();
        this.f131032f = new java.lang.String[length];
        for (int i19 = 0; i19 < length; i19++) {
            try {
                this.f131032f[i19] = this.f131031e.getString(i19);
            } catch (org.json.JSONException e17) {
                this.f131032f = null;
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(android.util.Log.getStackTraceString(e17));
                return;
            }
        }
    }
}
