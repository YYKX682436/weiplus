package vw;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.class})
/* loaded from: classes7.dex */
public final class t2 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.C10481x750ad4c2 f522266d;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.feature.brandservice.MagicDynamicCardFeatureService$preCleanFileEvent$1] */
    public t2() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f522266d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5189xf98047de>(a0Var) { // from class: com.tencent.mm.feature.brandservice.MagicDynamicCardFeatureService$preCleanFileEvent$1
            {
                this.f39173x3fe91575 = 1489935310;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5189xf98047de c5189xf98047de) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5189xf98047de event = c5189xf98047de;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.p0 p0Var = event.f135532g;
                boolean z17 = (p0Var.f89122a & 1) != 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicDynamicCardFeatureService", "hy: received clean event, flag is " + p0Var.f89122a + ", is system " + z17);
                if (z17) {
                    yw.w1.f548020a.b("cleanSystemFiles");
                }
                return false;
            }
        };
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        mo48813x58998cd();
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        mo48814x2efc64();
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s7 s7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.class));
        s7Var.bj("MagicAdBrandService", vw.q2.f522254a);
        s7Var.bj("MagicBrandService", vw.r2.f522258a);
        s7Var.bj("MagicFinderCard", vw.s2.f522264a);
    }
}
