package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9;

/* loaded from: classes3.dex */
public final class e implements dr.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.C12290x66551320 f165413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f165414b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f165415c;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.C12290x66551320 c12290x66551320, p3325xe03a0797.p3326xc267989b.q qVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f165413a = c12290x66551320;
        this.f165414b = qVar;
        this.f165415c = h0Var;
    }

    @Override // dr.q
    public void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandHTMLWebView.EmojiFetcher.MMLogic", "load with args:" + this.f165413a + ", async load success:" + z17);
        p3325xe03a0797.p3326xc267989b.q qVar = this.f165414b;
        if (!z17) {
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
        } else {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(this.f165415c.f391656d));
        }
    }
}
