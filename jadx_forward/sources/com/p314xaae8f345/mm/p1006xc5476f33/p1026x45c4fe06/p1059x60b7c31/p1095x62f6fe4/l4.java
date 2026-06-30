package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes10.dex */
public class l4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f163448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f163449e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f163450f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.o4 f163451g;

    public l4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.o4 o4Var, java.lang.String str, double d17, double d18) {
        this.f163451g = o4Var;
        this.f163448d = str;
        this.f163449e = d17;
        this.f163450f = d18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11696x173f8d55 s17;
        java.lang.String u17;
        java.lang.String w17;
        java.lang.String D;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.C20989xcfc00935 x17;
        java.lang.String str = this.f163448d;
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        boolean F = !m17.a() ? false : m17.f294799a.F(m17.f294800b);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.o4 o4Var = this.f163451g;
        if (!F) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMultiMedia", "take media camera, mVideoFilePath is %s, the file not exist, fail", str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12165x963f1885 c12165x963f1885 = o4Var.f163495e;
            c12165x963f1885.f163196d = -2;
            o4Var.m50420x7b736e5c(c12165x963f1885);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMultiMedia", "take media camera, the mVideoFilePath file exist, success");
        o4Var.f163495e.f163196d = -1;
        s17 = o4Var.s(str, false);
        if (s17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMultiMedia", "addVideoItem fail ,mVideoFilePath is %s", str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12165x963f1885 c12165x963f18852 = o4Var.f163495e;
            c12165x963f18852.f163196d = -2;
            o4Var.m50420x7b736e5c(c12165x963f18852);
            return;
        }
        u17 = o4Var.u(str);
        java.lang.String r17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u17) ? o4Var.r(u17) : "";
        long timeInMillis = java.util.Calendar.getInstance().getTimeInMillis() / 1000;
        double d17 = -1.0d;
        if (i11.b.a(this.f163449e) && i11.b.b(this.f163450f)) {
            x17 = o4Var.x();
            if (x17 != null) {
                d17 = com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4223x8502b2d7.m34966x69db0a53(x17.f273942d, x17.f273943e, this.f163449e, this.f163450f);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiChooseMultiMedia", "calculate X fail, locData is null. video_Path: %s.", str);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiChooseMultiMedia", "calculate X fail, lat/long is invalid. video_Path: %s.", str);
        }
        w17 = o4Var.w(timeInMillis, d17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12165x963f1885 c12165x963f18853 = o4Var.f163495e;
        D = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.o4.D(s17.f157635d, s17.f157646o, s17.f157647p, s17.f157648q, s17.f157645n, r17, w17);
        c12165x963f18853.f163197e = D;
        o4Var.m50420x7b736e5c(o4Var.f163495e);
    }
}
