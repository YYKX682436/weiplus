package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class vd extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.wd f172392d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.wd wdVar) {
        super(0);
        this.f172392d = wdVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.wd wdVar = this.f172392d;
        return new p012xc85e97e9.p093xedfae76a.v() { // from class: com.tencent.mm.plugin.appbrand.RuntimeEmbeddingPageHostImpl$onEmbeddingPageLifecycleStateChanged$2$1
            @Override // p012xc85e97e9.p093xedfae76a.v
            /* renamed from: onStateChanged */
            public final void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p093xedfae76a.m event) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(yVar, "<anonymous parameter 0>");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.Wxa.RuntimeEmbeddingPageHostImpl", "receive lifecycle event(" + event + ") for host:" + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.wd.this.f172490a + " from embeddingPage:" + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.wd.this.f172493d);
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ud.f170812a[event.ordinal()];
                if (i17 == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.wd wdVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.wd.this;
                    if (wdVar2.f172490a.V) {
                        return;
                    }
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11525xd10e8bbd) wdVar2.f172491b).f156369a.j0();
                    return;
                }
                if (i17 != 2) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.wd wdVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.wd.this;
                if (wdVar3.f172490a.V) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.td tdVar = wdVar3.f172493d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(tdVar);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 Cf = tdVar.Cf();
                    if (Cf != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.wd.this.f172490a.f156336n, Cf);
                    }
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11526xd10e8bbe) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.wd.this.f172492c).f156370a.g0(false);
                }
            }
        };
    }
}
