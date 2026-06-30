package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC$SetBackgroundAudioListenerTaskWC */
/* loaded from: classes7.dex */
public class C11988x3b520749 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11986x4eded589 {

    /* renamed from: u, reason: collision with root package name */
    public c01.l2 f160618u;

    /* renamed from: v, reason: collision with root package name */
    public final android.content.Context f160619v;

    public C11988x3b520749(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        super(fVar, lVar, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba2 = lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar).mo32091x9a3f0ba2() : null;
        if (mo32091x9a3f0ba2 != null) {
            this.f160619v = mo32091x9a3f0ba2.f156328d;
        } else {
            this.f160619v = lVar.getF229340d();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11986x4eded589
    public void E(int i17) {
        if (i17 == 0 || i17 == 1) {
            this.f160618u.i("setBackgroundAudioState#isPlaying", java.lang.Boolean.TRUE);
            ((ov.k0) ((pv.h0) i95.n0.c(pv.h0.class))).getClass();
            if (qp1.q.b()) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.t.a(this.f160619v, 6, null);
            return;
        }
        if (i17 == 2 || i17 == 3 || i17 == 4 || i17 == 7) {
            this.f160618u.i("setBackgroundAudioState#isPlaying", java.lang.Boolean.FALSE);
        }
    }
}
