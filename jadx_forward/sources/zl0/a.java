package zl0;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f555089a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f555090b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f555091c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f555092d;

    public java.lang.String a() {
        return this.f555091c + "_" + this.f555092d + "_" + this.f555090b;
    }

    public java.lang.String b() {
        if (android.text.TextUtils.isEmpty(c())) {
            return "";
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(c());
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(m17.a() ? m17.f294799a.F(m17.f294800b) : false)) {
            return "";
        }
        java.lang.String str2 = a17.f294812f;
        int lastIndexOf = str2.lastIndexOf("/");
        return lastIndexOf < 0 ? str2 : str2.substring(lastIndexOf + 1);
    }

    public java.lang.String c() {
        return zl0.g.f555098b + "/" + a();
    }

    public boolean d() {
        if (android.text.TextUtils.isEmpty(this.f555092d)) {
            return false;
        }
        return (android.text.TextUtils.isEmpty(this.f555091c) || android.text.TextUtils.isEmpty(this.f555090b) || !((java.lang.Long.parseLong(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g.replace("0x", ""), 16) > java.lang.Long.parseLong(this.f555092d.replace("0x", ""), 16) ? 1 : (java.lang.Long.parseLong(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g.replace("0x", ""), 16) == java.lang.Long.parseLong(this.f555092d.replace("0x", ""), 16) ? 0 : -1)) >= 0)) ? false : true;
    }

    /* renamed from: toString */
    public java.lang.String mo179080x9616526c() {
        return "BaseModel{url='" + this.f555089a + "', md5='" + this.f555090b + "', moduleName='" + this.f555091c + "', minVersion='" + this.f555092d + "'}";
    }
}
