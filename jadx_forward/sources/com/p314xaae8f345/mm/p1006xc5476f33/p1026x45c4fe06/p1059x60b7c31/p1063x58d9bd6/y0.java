package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6;

/* loaded from: classes11.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f160834d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f160835e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f160836f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f160837g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f160838h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f160839i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f160840m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11980xcda6ee93 f160841n;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11980xcda6ee93 c11980xcda6ee93, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        this.f160841n = c11980xcda6ee93;
        this.f160834d = str;
        this.f160835e = str2;
        this.f160836f = str3;
        this.f160837g = str4;
        this.f160838h = str5;
        this.f160839i = str6;
        this.f160840m = str7;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11980xcda6ee93 c11980xcda6ee93 = this.f160841n;
        sb7.append(c11980xcda6ee93.f160577o);
        java.lang.String str = this.f160834d;
        sb7.append(str);
        java.lang.String str2 = this.f160835e;
        sb7.append(str2);
        sb6.append(sb7.toString().hashCode());
        java.lang.String sb8 = sb6.toString();
        lp0.b.D();
        java.lang.String str3 = g83.a.a() + str2.hashCode();
        b21.r rVar = new b21.r();
        rVar.f98878d = 7;
        rVar.f98884m = str2;
        rVar.f98895x = str2;
        rVar.f98881g = this.f160836f;
        rVar.f98882h = this.f160837g;
        rVar.f98887p = this.f160838h;
        rVar.f98886o = this.f160839i;
        rVar.f98885n = str;
        rVar.f98891t = "";
        rVar.f98889r = str3;
        rVar.f98879e = sb8;
        rVar.f98880f = 0.0f;
        rVar.f98883i = this.f160840m;
        rVar.f98888q = null;
        rVar.f98894w = sb8;
        rVar.B = true;
        b21.m.i(rVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.h hVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.f.f167293a;
        hVar.a(c11980xcda6ee93.f160582t, c11980xcda6ee93.f160577o);
        hVar.f167294a = c11980xcda6ee93.f160577o;
        hVar.f167295b = rVar.f98879e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateMusicPlayer", "startPlayMusic");
        c11980xcda6ee93.f160580r = -1;
        c11980xcda6ee93.f160581s = "";
        c11980xcda6ee93.f160578p = false;
        c11980xcda6ee93.c();
    }
}
