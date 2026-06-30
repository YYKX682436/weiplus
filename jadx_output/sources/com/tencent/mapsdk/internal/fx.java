package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class fx {

    /* renamed from: a, reason: collision with root package name */
    public static final int f49494a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f49495b = 1;

    /* renamed from: c, reason: collision with root package name */
    public int f49496c;

    /* renamed from: d, reason: collision with root package name */
    public int f49497d;

    /* renamed from: e, reason: collision with root package name */
    public org.json.JSONArray f49498e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String[] f49499f;

    public fx() {
        this.f49499f = new java.lang.String[0];
    }

    private int c() {
        return this.f49496c;
    }

    private int d() {
        return this.f49497d;
    }

    private org.json.JSONArray e() {
        return this.f49498e;
    }

    private java.lang.String[] f() {
        return this.f49499f;
    }

    public final boolean a() {
        return this.f49496c == 1;
    }

    public final boolean b() {
        return this.f49497d == 1;
    }

    public final java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("IndoorAuth{mEnabled=");
        stringBuffer.append(this.f49496c);
        stringBuffer.append(", mType=");
        stringBuffer.append(this.f49497d);
        stringBuffer.append(", mBuildingJsonArray=");
        stringBuffer.append(this.f49498e);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public fx(int i17, int i18, org.json.JSONArray jSONArray) {
        this.f49499f = new java.lang.String[0];
        this.f49496c = i17;
        this.f49497d = i18;
        this.f49498e = jSONArray;
        if (jSONArray == null) {
            this.f49499f = null;
            return;
        }
        int length = jSONArray.length();
        this.f49499f = new java.lang.String[length];
        for (int i19 = 0; i19 < length; i19++) {
            try {
                this.f49499f[i19] = this.f49498e.getString(i19);
            } catch (org.json.JSONException e17) {
                this.f49499f = null;
                com.tencent.mapsdk.core.utils.log.LogUtil.d(android.util.Log.getStackTraceString(e17));
                return;
            }
        }
    }
}
