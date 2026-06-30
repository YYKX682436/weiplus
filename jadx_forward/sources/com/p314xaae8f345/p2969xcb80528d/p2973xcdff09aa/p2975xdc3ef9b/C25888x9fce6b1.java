package com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.tavkit.composition.builder.CompositionBuilder */
/* loaded from: classes16.dex */
public class C25888x9fce6b1 {

    /* renamed from: builderModel */
    private com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25887x114f86e f48977xf749a44e;

    /* renamed from: composition */
    private com.p314xaae8f345.tav.p2945x58ceaf0.C25644x906c22c4 f48978xcdff09aa = new com.p314xaae8f345.tav.p2945x58ceaf0.C25644x906c22c4();

    /* renamed from: isAudioTracksMerge */
    private boolean f48979x7a82b824;

    /* renamed from: isVideoTracksMerge */
    private boolean f48980xb24d65f;

    public C25888x9fce6b1(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25887x114f86e c25887x114f86e, boolean z17, boolean z18) {
        this.f48977xf749a44e = c25887x114f86e;
        this.f48980xb24d65f = z17;
        this.f48979x7a82b824 = z18;
    }

    /* renamed from: getAudioTransitionInfo */
    private com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25886x591554f9 m98635x669169e3(java.util.List<? extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25898x5fe17e9e> list, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.InterfaceC25881xbf556302 interfaceC25881xbf556302, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25898x5fe17e9e interfaceC25898x5fe17e9e, int i17) {
        return (i17 != 0 || list.size() <= 1) ? i17 == list.size() - 1 ? new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25886x591554f9(interfaceC25881xbf556302, null) : new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25886x591554f9(interfaceC25881xbf556302, interfaceC25898x5fe17e9e.mo98544x1d246395()) : new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25886x591554f9(null, interfaceC25898x5fe17e9e.mo98544x1d246395());
    }

    /* renamed from: initCompositionWithAudioChannels */
    private void m98636xf0531f46() {
        for (java.util.List<? extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25898x5fe17e9e> list : this.f48977xf749a44e.m98621x9f95aa10()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.HashMap hashMap = new java.util.HashMap();
            com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.InterfaceC25881xbf556302 interfaceC25881xbf556302 = null;
            for (int i17 = 0; i17 < list.size(); i17++) {
                com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25898x5fe17e9e interfaceC25898x5fe17e9e = list.get(i17);
                for (int i18 = 0; i18 < interfaceC25898x5fe17e9e.mo98554x1af018de(); i18++) {
                    com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1 mo98539x300462b8 = interfaceC25898x5fe17e9e.mo98539x300462b8(this.f48978xcdff09aa, i18, this.f48979x7a82b824);
                    if (mo98539x300462b8 != null) {
                        arrayList.add(new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25882x82a4b984(mo98539x300462b8, interfaceC25898x5fe17e9e));
                    }
                }
                hashMap.put(java.lang.String.valueOf(i17), m98635x669169e3(list, interfaceC25881xbf556302, interfaceC25898x5fe17e9e, i17));
                interfaceC25881xbf556302 = interfaceC25898x5fe17e9e.mo98544x1d246395();
            }
            this.f48977xf749a44e.m98618x663e29fd(new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25885x80237baa(arrayList, hashMap));
        }
    }

    /* renamed from: initCompositionWithMixAudios */
    private void m98637xe1672e59(java.util.List<? extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25893x1ae335cd> list) {
        if (list == null) {
            return;
        }
        for (com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25893x1ae335cd interfaceC25893x1ae335cd : list) {
            for (int i17 = 0; i17 < interfaceC25893x1ae335cd.mo98554x1af018de(); i17++) {
                com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1 mo98539x300462b8 = interfaceC25893x1ae335cd.mo98539x300462b8(this.f48978xcdff09aa, i17, this.f48979x7a82b824);
                if (mo98539x300462b8 != null) {
                    this.f48977xf749a44e.m98617xc436b864(new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25883xeb2f6494(mo98539x300462b8, interfaceC25893x1ae335cd));
                }
            }
        }
    }

    /* renamed from: initCompositionWithOverlays */
    private void m98638xf55e24a3(java.util.List<? extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25900x1c05ae72> list) {
        if (list == null) {
            return;
        }
        for (com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25900x1c05ae72 interfaceC25900x1c05ae72 : list) {
            for (int i17 = 0; i17 < interfaceC25900x1c05ae72.mo98555x3ebcc1c3(); i17++) {
                com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1 mo98565xa18dec9d = interfaceC25900x1c05ae72.mo98565xa18dec9d(this.f48978xcdff09aa, i17, this.f48980xb24d65f);
                if (mo98565xa18dec9d != null) {
                    this.f48977xf749a44e.m98620x56233cea(new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25892x978041c3(mo98565xa18dec9d, interfaceC25900x1c05ae72));
                }
            }
        }
    }

    /* renamed from: initCompositionWithVideoChannels */
    private void m98639x539922eb() {
        for (java.util.List<? extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25899x6103f743> list : this.f48977xf749a44e.m98633x2dbadb5()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25899x6103f743 interfaceC25899x6103f743 : list) {
                for (int i17 = 0; i17 < interfaceC25899x6103f743.mo98555x3ebcc1c3(); i17++) {
                    com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1 mo98565xa18dec9d = interfaceC25899x6103f743.mo98565xa18dec9d(this.f48978xcdff09aa, i17, this.f48980xb24d65f);
                    if (mo98565xa18dec9d != null) {
                        arrayList.add(new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25890xc6e057a9(mo98565xa18dec9d, interfaceC25899x6103f743));
                    }
                }
            }
            this.f48977xf749a44e.m98619x6bb89af8(arrayList);
        }
    }

    /* renamed from: build */
    public com.p314xaae8f345.tav.p2945x58ceaf0.C25644x906c22c4 m98640x59bc66e() {
        m98639x539922eb();
        m98636xf0531f46();
        m98638xf55e24a3(this.f48977xf749a44e.m98629x9b6e8399());
        m98637xe1672e59(this.f48977xf749a44e.m98627xfd62ae23());
        return this.f48978xcdff09aa;
    }
}
