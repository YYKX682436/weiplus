package com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b;

/* renamed from: com.tencent.tavkit.composition.video.TAVVideoCompositing */
/* loaded from: classes16.dex */
public class C25915xfbc5e7b2 implements com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629 {

    /* renamed from: ciContext */
    private com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25858x90ea669 f49042x8dc22269;

    /* renamed from: renderThread */
    private java.lang.Thread f49046x2d433340;

    /* renamed from: reportSession */
    private com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25921x5ba123be f49047x416042c2;
    private final java.lang.String TAG = "TAVVideoCompositing@" + java.lang.Integer.toHexString(hashCode());

    /* renamed from: transitionFilterMap */
    private final java.util.HashMap<java.lang.String, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25920x69291167.Filter> f49049x3d9af0ef = new java.util.HashMap<>();

    /* renamed from: sourceFilterMap */
    private final java.util.HashMap<java.lang.String, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3.Filter> f49048xf40cb4e9 = new java.util.HashMap<>();

    /* renamed from: mixFilterMap */
    private final java.util.HashMap<java.lang.String, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb.Filter> f49045x1dc6efc8 = new java.util.HashMap<>();

    /* renamed from: globalFilterMap */
    private final java.util.HashMap<java.lang.String, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3.Filter> f49044x8a369261 = new java.util.HashMap<>();

    /* renamed from: defaultVideoMixFilter */
    private final com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb.Filter f49043x575c2b5a = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25910xc43d7b3a();

    /* renamed from: tryPostReleaseDone */
    private boolean f49050xb0e1b82e = false;

    /* renamed from: applyClipSourceEffect */
    private com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 m98760x546cf88a(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25912xbdf93b84 c25912xbdf93b84, com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 c25859x590b0095, java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3> list) {
        if (list != null && !list.isEmpty()) {
            for (com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3 interfaceC25918xca9d36a3 : list) {
                com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3.Filter m98768x994af1e9 = m98768x994af1e9(interfaceC25918xca9d36a3);
                if (m98768x994af1e9 != null) {
                    c25859x590b0095 = m98768x994af1e9.mo98522x58b836e(interfaceC25918xca9d36a3, c25859x590b0095, c25912xbdf93b84);
                }
            }
        }
        return c25859x590b0095;
    }

    /* renamed from: applyCompositionSourceEffect */
    private com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 m98761xc2a6d508(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25912xbdf93b84 c25912xbdf93b84, com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 c25859x590b0095, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3 interfaceC25918xca9d36a3) {
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3.Filter m98768x994af1e9 = m98768x994af1e9(interfaceC25918xca9d36a3);
        return m98768x994af1e9 == null ? c25859x590b0095 : m98768x994af1e9.mo98522x58b836e(interfaceC25918xca9d36a3, c25859x590b0095, c25912xbdf93b84);
    }

    /* renamed from: applySourceTransform */
    private void m98762x90323c43(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25902x4abb7fa4 c25902x4abb7fa4, com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 c25859x590b0095, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25912xbdf93b84 c25912xbdf93b84) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "applySourceTransform() called with: config = [" + c25902x4abb7fa4 + "]");
        if (c25902x4abb7fa4.m98698xdf713550()) {
            c25859x590b0095.m98351xf97b67f7(c25902x4abb7fa4.m98701x74704fb7(), c25902x4abb7fa4.m98699xc2a14486());
        } else if (c25902x4abb7fa4.m98701x74704fb7() == com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25902x4abb7fa4.f49009xf3478fc0) {
            c25859x590b0095.m98352x80b336d(c25912xbdf93b84.m98752x356c92ad(), c25902x4abb7fa4.m98699xc2a14486());
        }
        c25859x590b0095.m98372x3f52d48b(c25902x4abb7fa4.m98703x3e2bdcb6());
    }

    /* renamed from: compositingImages */
    private com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 m98763xf44a451c(com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.C25699x9dbd9fd8 c25699x9dbd9fd8, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25916xa699d596 c25916xa699d596) {
        if (this.f49042x8dc22269 == null) {
            return null;
        }
        for (com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3.Filter filter : this.f49048xf40cb4e9.values()) {
            if (filter instanceof com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25914x22054d8e.TimeAttachFilter) {
                ((com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25914x22054d8e.TimeAttachFilter) filter).m98759x944da67b(c25699x9dbd9fd8.m96898x2337bd61());
            }
        }
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25912xbdf93b84 c25912xbdf93b84 = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25912xbdf93b84(c25699x9dbd9fd8.m96898x2337bd61(), c25699x9dbd9fd8.m96899xc0f97383().m96918xfb854877(), this.f49042x8dc22269);
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25911x10613639 m98765x9d43e0eb = m98765x9d43e0eb(c25699x9dbd9fd8, c25912xbdf93b84, c25916xa699d596);
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb.Filter m98769x751dbaf = m98769x751dbaf(c25916xa699d596, c25916xa699d596.m98776x56fc9c8());
        com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 mo98537x58b836e = m98769x751dbaf != null ? m98769x751dbaf.mo98537x58b836e(c25916xa699d596.m98776x56fc9c8(), m98765x9d43e0eb, c25912xbdf93b84) : null;
        if (mo98537x58b836e == null) {
            mo98537x58b836e = this.f49043x575c2b5a.mo98537x58b836e(null, m98765x9d43e0eb, c25912xbdf93b84);
        }
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3.Filter m98766x22d2c771 = m98766x22d2c771(c25916xa699d596.m98773x859cc993());
        return m98766x22d2c771 != null ? m98766x22d2c771.mo98522x58b836e(c25916xa699d596.m98773x859cc993(), mo98537x58b836e, c25912xbdf93b84) : mo98537x58b836e;
    }

    /* renamed from: convertLayerToImage */
    private com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 m98764x8aa05262(com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.C25699x9dbd9fd8 c25699x9dbd9fd8, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25912xbdf93b84 c25912xbdf93b84, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75 c25917xe9e06e75, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3 interfaceC25918xca9d36a3) {
        if (!c25917xe9e06e75.m98788xdd1fba().m97253x805f158c(c25912xbdf93b84.m98754xfb85bb43())) {
            return null;
        }
        com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 mo98563xbca917c0 = c25917xe9e06e75.m98786x5b3a9420().mo98563xbca917c0(c25912xbdf93b84.m98754xfb85bb43().sub(c25917xe9e06e75.m98788xdd1fba().m97260x75286aac()), c25912xbdf93b84.m98752x356c92ad());
        if (mo98563xbca917c0 == null) {
            mo98563xbca917c0 = m98767xd6cc1e04(c25699x9dbd9fd8, c25917xe9e06e75);
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "convertLayerToImage: begin sourceImage by request, sourceImage = " + mo98563xbca917c0);
        }
        if (mo98563xbca917c0 == null) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.w(this.TAG, "convertLayerToImage: begin sourceImage by request, sourceImage is null ");
            return null;
        }
        c25912xbdf93b84.m98748xb5bac52a(c25917xe9e06e75.m98786x5b3a9420());
        mo98563xbca917c0.m98355x6ab5ccbc(c25917xe9e06e75.m98790xe6cf5231().m98702xbb14e2a4());
        m98762x90323c43(c25917xe9e06e75.m98790xe6cf5231(), mo98563xbca917c0, c25912xbdf93b84);
        com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 m98761xc2a6d508 = m98761xc2a6d508(c25912xbdf93b84, m98760x546cf88a(c25912xbdf93b84, mo98563xbca917c0, c25917xe9e06e75.m98790xe6cf5231().m98700xd07db4cc()), interfaceC25918xca9d36a3);
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "convertLayerToImage: end, returned: " + m98761xc2a6d508);
        return m98761xc2a6d508;
    }

    /* renamed from: convertToImageCollection */
    private com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25911x10613639 m98765x9d43e0eb(com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.C25699x9dbd9fd8 c25699x9dbd9fd8, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25912xbdf93b84 c25912xbdf93b84, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25916xa699d596 c25916xa699d596) {
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25911x10613639 c25911x10613639 = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25911x10613639();
        java.util.Iterator<java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75>> it = c25916xa699d596.m98772x60bec6f().iterator();
        while (it.hasNext()) {
            for (com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75 c25917xe9e06e75 : it.next()) {
                com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 m98764x8aa05262 = m98764x8aa05262(c25699x9dbd9fd8, c25912xbdf93b84, c25917xe9e06e75, c25916xa699d596.m98775xd2746a1b());
                if (m98764x8aa05262 != null && !m98764x8aa05262.m98369x3b1d7759()) {
                    c25911x10613639.m98741x75b0c959(m98764x8aa05262, c25917xe9e06e75.m98786x5b3a9420());
                }
            }
        }
        for (com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75 c25917xe9e06e752 : c25916xa699d596.m98774xac4345fc()) {
            com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 m98764x8aa052622 = m98764x8aa05262(c25699x9dbd9fd8, c25912xbdf93b84, c25917xe9e06e752, c25916xa699d596.m98775xd2746a1b());
            if (m98764x8aa052622 != null && !m98764x8aa052622.m98369x3b1d7759()) {
                c25911x10613639.m98742x8b918a2c(m98764x8aa052622, c25917xe9e06e752.m98786x5b3a9420());
            }
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "convertToImageCollection: result imageCollection = " + c25911x10613639);
        return c25911x10613639;
    }

    /* renamed from: getGlobalFilter */
    private com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3.Filter m98766x22d2c771(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3 interfaceC25918xca9d36a3) {
        if (interfaceC25918xca9d36a3 == null || android.text.TextUtils.isEmpty(interfaceC25918xca9d36a3.mo98514xc35ea28c())) {
            return null;
        }
        java.lang.String mo98514xc35ea28c = interfaceC25918xca9d36a3.mo98514xc35ea28c();
        if (this.f49044x8a369261.containsKey(mo98514xc35ea28c)) {
            return this.f49044x8a369261.get(mo98514xc35ea28c);
        }
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3.Filter mo98513x44bdab94 = interfaceC25918xca9d36a3.mo98513x44bdab94();
        this.f49044x8a369261.put(mo98514xc35ea28c, mo98513x44bdab94);
        return mo98513x44bdab94;
    }

    /* renamed from: getImageWithRequest */
    private com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 m98767xd6cc1e04(com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.C25699x9dbd9fd8 c25699x9dbd9fd8, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75 c25917xe9e06e75) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m96906xcc32495d = c25699x9dbd9fd8.m96906xcc32495d(c25917xe9e06e75.mo96946xfe2e0f70());
        if (m96906xcc32495d == null || m96906xcc32495d.m97194x3a00ef33() == null) {
            return null;
        }
        return new com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095(m96906xcc32495d.m97194x3a00ef33());
    }

    /* renamed from: getSourceFilter */
    private com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3.Filter m98768x994af1e9(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3 interfaceC25918xca9d36a3) {
        if (interfaceC25918xca9d36a3 == null || android.text.TextUtils.isEmpty(interfaceC25918xca9d36a3.mo98514xc35ea28c())) {
            return null;
        }
        java.lang.String mo98514xc35ea28c = interfaceC25918xca9d36a3.mo98514xc35ea28c();
        if (this.f49048xf40cb4e9.containsKey(mo98514xc35ea28c)) {
            return this.f49048xf40cb4e9.get(mo98514xc35ea28c);
        }
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3.Filter mo98513x44bdab94 = interfaceC25918xca9d36a3.mo98513x44bdab94();
        this.f49048xf40cb4e9.put(mo98514xc35ea28c, mo98513x44bdab94);
        return mo98513x44bdab94;
    }

    /* renamed from: getVideoMixFilter */
    private com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb.Filter m98769x751dbaf(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25916xa699d596 c25916xa699d596, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb interfaceC25919xc89aa8bb) {
        if (interfaceC25919xc89aa8bb == null || android.text.TextUtils.isEmpty(interfaceC25919xc89aa8bb.mo98527xc35ea28c())) {
            return null;
        }
        java.lang.String mo98527xc35ea28c = interfaceC25919xc89aa8bb.mo98527xc35ea28c();
        if (this.f49045x1dc6efc8.containsKey(mo98527xc35ea28c)) {
            return this.f49045x1dc6efc8.get(mo98527xc35ea28c);
        }
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb.Filter mo98526x44bdab94 = c25916xa699d596.m98776x56fc9c8().mo98526x44bdab94();
        this.f49045x1dc6efc8.put(mo98527xc35ea28c, mo98526x44bdab94);
        return mo98526x44bdab94;
    }

    /* renamed from: reportMemory */
    private void m98770x18e44755() {
        if (com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25924x5efcedc3.m98817x73291ac1()) {
            return;
        }
        com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25924x5efcedc3.m98816x9cf0d20b().m98823x36519d("sourceFilter:[" + com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25924x5efcedc3.m98815x8ec0291(this.f49048xf40cb4e9.values()) + "], mixFilter:[" + com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25924x5efcedc3.m98815x8ec0291(this.f49045x1dc6efc8.values()) + "], globalFilter:[" + com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25924x5efcedc3.m98815x8ec0291(this.f49044x8a369261.values()) + "]");
    }

    /* renamed from: tryPostReleaseToRenderThread */
    private void m98771x358f6307() {
        if (this.f49050xb0e1b82e) {
            return;
        }
        this.f49050xb0e1b82e = true;
        java.lang.Thread thread = this.f49046x2d433340;
        if (thread instanceof android.os.HandlerThread) {
            if (((android.os.HandlerThread) thread).getLooper() == null) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "tryPostReleaseToRenderThread error, renderThread looper null");
            } else {
                new android.os.Handler(((android.os.HandlerThread) this.f49046x2d433340).getLooper()).post(new java.lang.Runnable() { // from class: com.tencent.tavkit.composition.video.TAVVideoCompositing.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25915xfbc5e7b2.this.mo96822x41012807();
                    }
                });
            }
        }
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629
    /* renamed from: cancelAllPendingVideoCompositionRequests */
    public void mo96820x3027e603() {
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629
    /* renamed from: release */
    public void mo96822x41012807() {
        if (this.f49046x2d433340 != null && !java.lang.Thread.currentThread().equals(this.f49046x2d433340)) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "release: 当前线程非渲染线程！currentThread = " + java.lang.Thread.currentThread().getName() + ", renderThread = " + this.f49046x2d433340.getName());
            m98771x358f6307();
            return;
        }
        this.f49050xb0e1b82e = false;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "release: begin, currentThread = " + java.lang.Thread.currentThread().getName());
        com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25858x90ea669 c25858x90ea669 = this.f49042x8dc22269;
        if (c25858x90ea669 != null) {
            c25858x90ea669.m98343x41012807();
        }
        java.util.Iterator<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25920x69291167.Filter> it = this.f49049x3d9af0ef.values().iterator();
        while (it.hasNext()) {
            it.next().m98797x41012807();
        }
        java.util.Iterator<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3.Filter> it6 = this.f49048xf40cb4e9.values().iterator();
        while (it6.hasNext()) {
            it6.next().mo98525x41012807();
        }
        java.util.Iterator<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb.Filter> it7 = this.f49045x1dc6efc8.values().iterator();
        while (it7.hasNext()) {
            it7.next().mo98538x41012807();
        }
        java.util.Iterator<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3.Filter> it8 = this.f49044x8a369261.values().iterator();
        while (it8.hasNext()) {
            it8.next().mo98525x41012807();
        }
        this.f49049x3d9af0ef.clear();
        this.f49048xf40cb4e9.clear();
        this.f49045x1dc6efc8.clear();
        this.f49044x8a369261.clear();
        com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25864x178eed28.m98400x9cf0d20b().m98403x41012807();
        com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25921x5ba123be c25921x5ba123be = this.f49047x416042c2;
        if (c25921x5ba123be != null) {
            c25921x5ba123be.m98801x5d03b04();
            this.f49047x416042c2 = null;
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "release: end, currentThread = " + java.lang.Thread.currentThread().getName());
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629
    /* renamed from: renderContextChanged */
    public void mo96823x15c1613b(com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.C25702xbab3092a c25702xbab3092a) {
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629
    /* renamed from: requiredPixelBufferAttributesForRenderContext */
    public java.util.HashMap<java.lang.String, java.lang.Object> mo96824x2787b30e() {
        return null;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629
    /* renamed from: sourcePixelBufferAttributes */
    public java.util.HashMap<java.lang.String, java.lang.Object> mo96825x701ab02() {
        return null;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629
    /* renamed from: startVideoCompositionRequest */
    public void mo96826xbab63a9e(com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.C25699x9dbd9fd8 c25699x9dbd9fd8) {
        if (this.f49047x416042c2 == null) {
            this.f49047x416042c2 = new com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25921x5ba123be(c25699x9dbd9fd8.m96899xc0f97383().m96918xfb854877().f47833x6be2dc6, c25699x9dbd9fd8.m96899xc0f97383().m96918xfb854877().f47832xb7389127);
        }
        long nanoTime = java.lang.System.nanoTime();
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "startVideoCompositionRequest: begin, currentThread = " + java.lang.Thread.currentThread().getName() + ", request = [" + c25699x9dbd9fd8 + "]");
        if (this.f49042x8dc22269 == null) {
            this.f49042x8dc22269 = new com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25858x90ea669(c25699x9dbd9fd8.m96899xc0f97383().m96915xc0f97383());
        }
        if (this.f49046x2d433340 == null) {
            this.f49046x2d433340 = java.lang.Thread.currentThread();
        }
        com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25700xb60b20d6 m96902xbb2591a9 = c25699x9dbd9fd8.m96902xbb2591a9();
        if (!(m96902xbb2591a9 instanceof com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25916xa699d596)) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "startVideoCompositionRequest: end, instruction not instanceof TAVVideoCompositionInstruction");
            this.f49047x416042c2.m98802x46a3683a();
            c25699x9dbd9fd8.m96895xe289c58f(new com.p314xaae8f345.tav.p2957xa228aba5.C25740x57112479(10086, "instruction not instanceof TAVVideoCompositionInstruction"));
            return;
        }
        com.p314xaae8f345.p2969xcb80528d.p2980x6a710b1.C25925x9f3a7e32.m98835xd1272012("compositingImages");
        com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 m98763xf44a451c = m98763xf44a451c(c25699x9dbd9fd8, (com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25916xa699d596) m96902xbb2591a9);
        com.p314xaae8f345.p2969xcb80528d.p2980x6a710b1.C25925x9f3a7e32.m98834x6461108b("compositingImages");
        com.p314xaae8f345.p2969xcb80528d.p2980x6a710b1.C25925x9f3a7e32.m98835xd1272012("renderToSampleBuffer");
        m98770x18e44755();
        if (m98763xf44a451c != null) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m98344xc0b69fdb = this.f49042x8dc22269.m98344xc0b69fdb(m98763xf44a451c, c25699x9dbd9fd8.m96898x2337bd61(), c25699x9dbd9fd8.m96899xc0f97383().m96915xc0f97383());
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "startVideoCompositionRequest: end, resultPixels = [" + m98344xc0b69fdb + "]");
            this.f49047x416042c2.m98803x5f42eba6(java.lang.System.nanoTime() - nanoTime);
            c25699x9dbd9fd8.m96894x58b3683d(m98344xc0b69fdb);
        } else {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "startVideoCompositionRequest: end, destImage is null ");
            this.f49047x416042c2.m98802x46a3683a();
            c25699x9dbd9fd8.m96895xe289c58f(new com.p314xaae8f345.tav.p2957xa228aba5.C25740x57112479(10086, "destImage is null "));
        }
        com.p314xaae8f345.p2969xcb80528d.p2980x6a710b1.C25925x9f3a7e32.m98834x6461108b("renderToSampleBuffer");
    }
}
