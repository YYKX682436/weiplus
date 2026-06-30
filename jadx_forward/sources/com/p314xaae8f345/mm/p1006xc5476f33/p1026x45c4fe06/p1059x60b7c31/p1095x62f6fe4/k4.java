package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes10.dex */
public class k4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f163423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f163424e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f163425f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f163426g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.o4 f163427h;

    public k4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.o4 o4Var, boolean z17, java.lang.String str, double d17, double d18) {
        this.f163427h = o4Var;
        this.f163423d = z17;
        this.f163424e = str;
        this.f163425f = d17;
        this.f163426g = d18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.o4 o4Var;
        java.lang.String w17;
        java.lang.String C;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.C20989xcfc00935 x17;
        java.lang.String str = this.f163424e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.o4 o4Var2 = this.f163427h;
        boolean z17 = this.f163423d;
        java.lang.String t17 = z17 ? o4Var2.t(str) : str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p4 C2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.q4.C(t17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11693xc4fcf5fe b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11694xde197cf.b(o4Var2.f163494d.f163183d, t17, null, z17 | true);
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMultiMedia", "handle image from mm-sight camera, get null obj from path: %s", str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12165x963f1885 c12165x963f1885 = o4Var2.f163495e;
            c12165x963f1885.f163196d = -2;
            o4Var2.m50420x7b736e5c(c12165x963f1885);
            return;
        }
        long timeInMillis = java.util.Calendar.getInstance().getTimeInMillis() / 1000;
        double d17 = -1.0d;
        if (i11.b.a(this.f163425f) && i11.b.b(this.f163426g)) {
            x17 = o4Var2.x();
            if (x17 != null) {
                o4Var = o4Var2;
                d17 = com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4223x8502b2d7.m34966x69db0a53(x17.f273942d, x17.f273943e, this.f163425f, this.f163426g);
            } else {
                o4Var = o4Var2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiChooseMultiMedia", "calculate X fail, locData is null. pic_Path: %s.", str);
            }
        } else {
            o4Var = o4Var2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiChooseMultiMedia", "calculate X fail, lat/long is invalid. pic_Path: %s.", str);
        }
        w17 = o4Var.w(timeInMillis, d17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMultiMedia", "handle image from mm-sight is done.");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12165x963f1885 c12165x963f18852 = o4Var.f163495e;
        c12165x963f18852.f163196d = -1;
        C = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.o4.C(b17.f157635d, b17.f157640i, C2.f163524a, C2.f163525b, C2.f163526c, w17);
        c12165x963f18852.f163197e = C;
        o4Var.m50420x7b736e5c(o4Var.f163495e);
    }
}
