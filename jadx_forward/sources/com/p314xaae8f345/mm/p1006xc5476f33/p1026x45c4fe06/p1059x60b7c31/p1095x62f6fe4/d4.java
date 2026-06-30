package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public class d4 implements lk1.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f163305d;

    public d4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.q4 q4Var, android.content.Context context) {
        this.f163305d = context;
    }

    @Override // lk1.b
    public void j(int i17, java.lang.String str, lk1.a aVar) {
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMultiMedia", "onLocationChange error, errCode: %d.", java.lang.Integer.valueOf(i17));
            return;
        }
        this.f163305d.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e() + "_locCache", 0).edit().putString("locStr", ((int) (aVar.f400529a * 1000000.0d)) + "," + ((int) (aVar.f400530b * 1000000.0d))).apply();
        ((lk1.c) nd.f.a(lk1.c.class)).ia("wgs84", this, null);
    }
}
