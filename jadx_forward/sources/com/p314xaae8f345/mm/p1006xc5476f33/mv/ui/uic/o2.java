package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 f232872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f232873e;

    public o2(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd68, boolean z17) {
        this.f232872d = c16668xffb9dd68;
        this.f232873e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fm3.u uVar;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd68 = this.f232872d;
        pk4.c cVar = c16668xffb9dd68.f232516p;
        if (cVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.TextureViewSurfaceTextureListenerC18694xeac4a29) cVar).f();
        }
        c16668xffb9dd68.T6().m8152xc67946d3(c16668xffb9dd68.f232515o, 1, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68.f232506J);
        if (!kl3.t.g().a().i()) {
            if (c16668xffb9dd68.f232518r || this.f232873e) {
                c16668xffb9dd68.c7(c16668xffb9dd68.f232515o);
                lm3.e eVar = (lm3.e) kz5.n0.a0(c16668xffb9dd68.f232510g, c16668xffb9dd68.f232515o);
                if (eVar != null && (uVar = eVar.f401015d) != null) {
                    uVar.f345676w = 0L;
                    uVar.f345677x = 0L;
                }
                if (!b21.m.c()) {
                    android.content.Intent intent = c16668xffb9dd68.m158354x19263085().getIntent();
                    if (intent != null ? intent.getBooleanExtra("key_music_stop_or_complete", false) : false) {
                        b21.m.i(b21.m.b());
                    } else {
                        b21.m.g();
                    }
                }
            } else {
                pk4.c cVar2 = c16668xffb9dd68.f232516p;
                if (cVar2 != null) {
                    cVar2.mo72021x211de3dc(true);
                }
            }
        }
        c16668xffb9dd68.f232518r = false;
    }
}
