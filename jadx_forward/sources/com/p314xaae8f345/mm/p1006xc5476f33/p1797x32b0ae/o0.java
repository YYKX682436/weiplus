package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae;

/* loaded from: classes15.dex */
public class o0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225677a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f225678b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225679c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f225681e;

    public o0(java.lang.String str, java.util.Map map, java.lang.String str2, java.lang.String str3, java.util.Map map2) {
        this.f225677a = str;
        this.f225678b = map;
        this.f225679c = str2;
        this.f225680d = str3;
        this.f225681e = map2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
    /* renamed from: fail */
    public void mo25333x2fd71e(java.lang.String str, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMWxaLiteAppCenter", "triggerLiteAppEvent::checkLiteAppAndGetPath check fail, errCode: %d.", java.lang.Integer.valueOf(i17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
    /* renamed from: success */
    public void mo25334x90b54003(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441, int i17) {
        java.lang.String str = this.f225677a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "triggerLiteAppEvent::checkLiteAppAndGetPath check success. targetAppId: %s.", str);
        java.lang.String str2 = c3712x3ed8a441.f14359x58b7f1c;
        java.util.Map map = this.f225678b;
        map.put("appId", str2);
        map.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, c3712x3ed8a441.f14369x346425);
        map.put("signatureKey", c3712x3ed8a441.f14372xa8503287);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65503xde82919f(this.f225679c, str, this.f225680d, this.f225681e, map);
    }
}
