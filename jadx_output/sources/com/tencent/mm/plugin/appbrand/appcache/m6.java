package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes4.dex */
public class m6 extends dm.o9 implements qj1.d {

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.String[] f75675v;

    /* renamed from: w, reason: collision with root package name */
    public static final l75.e0 f75676w = dm.o9.initAutoDBInfo(dm.o9.class);

    static {
        java.lang.String[] strArr = {"appId", "type", "version"};
        f75675v = strArr;
        java.lang.String str = " PRIMARY KEY ( ";
        for (java.lang.String str2 : strArr) {
            str = str + ", " + str2;
        }
        java.lang.String str3 = str.replaceFirst(",", "") + " )";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        l75.e0 e0Var = f75676w;
        sb6.append(e0Var.f316956e);
        sb6.append(",");
        sb6.append(str3);
        e0Var.f316956e = sb6.toString();
    }

    @Override // dm.o9, l75.f0
    public l75.e0 getDBInfo() {
        return f75676w;
    }

    @Override // qj1.d
    public java.lang.String[] getKeys() {
        return f75675v;
    }

    public java.lang.String t0() {
        return java.lang.String.format(java.util.Locale.US, "EncryptPkgInfo[%s %d %d]", this.field_appId, java.lang.Integer.valueOf(this.field_type), java.lang.Integer.valueOf(this.field_version));
    }
}
