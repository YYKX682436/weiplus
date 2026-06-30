package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727;

/* loaded from: classes.dex */
public final class n implements l81.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f161860a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f161861b;

    public n(java.lang.String str, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f161860a = str;
        this.f161861b = qVar;
    }

    @Override // l81.v0
    public void a(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandYuanbaoService", "startPreRender appId:" + this.f161860a + " errCode:" + i17 + " errMsg:" + str);
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        ((p3325xe03a0797.p3326xc267989b.r) this.f161861b).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
    }

    @Override // l81.v0
    /* renamed from: onSuccess */
    public void mo50385xe05b4124() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandYuanbaoService", "startPreRender appId:" + this.f161860a + " success");
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        ((p3325xe03a0797.p3326xc267989b.r) this.f161861b).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
    }
}
