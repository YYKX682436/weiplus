package com.p314xaae8f345.mm.p943x351df9c2;

/* loaded from: classes12.dex */
public class o0 extends l75.s0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f152039e = {"CREATE TABLE IF NOT EXISTS hdheadimginfo ( username text  PRIMARY KEY , imgwidth int  , imgheigth int  , imgformat text  , totallen int  , startpos int  , headimgtype int  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int  ) "};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f152040d;

    public o0(l75.k0 k0Var) {
        this.f152040d = k0Var;
    }

    public com.p314xaae8f345.mm.p943x351df9c2.n0 m0(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select hdheadimginfo.username,hdheadimginfo.imgwidth,hdheadimginfo.imgheigth,hdheadimginfo.imgformat,hdheadimginfo.totallen,hdheadimginfo.startpos,hdheadimginfo.headimgtype,hdheadimginfo.reserved1,hdheadimginfo.reserved2,hdheadimginfo.reserved3,hdheadimginfo.reserved4 from hdheadimginfo   where hdheadimginfo.username = \"");
        java.lang.String str2 = "" + str;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str2);
        sb6.append(str2);
        sb6.append("\"");
        com.p314xaae8f345.mm.p943x351df9c2.n0 n0Var = null;
        android.database.Cursor f17 = this.f152040d.f(sb6.toString(), null, 2);
        if (f17 == null) {
            return null;
        }
        if (f17.moveToFirst()) {
            n0Var = new com.p314xaae8f345.mm.p943x351df9c2.n0();
            n0Var.f152025a = f17.getString(0);
            n0Var.f152026b = f17.getInt(1);
            n0Var.f152027c = f17.getInt(2);
            n0Var.f152028d = f17.getString(3);
            n0Var.f152029e = f17.getInt(4);
            n0Var.f152030f = f17.getInt(5);
            n0Var.f152031g = f17.getInt(6);
            n0Var.f152032h = f17.getString(7);
            n0Var.f152033i = f17.getString(8);
            n0Var.f152034j = f17.getInt(9);
            n0Var.f152035k = f17.getInt(10);
        }
        f17.close();
        return n0Var;
    }
}
