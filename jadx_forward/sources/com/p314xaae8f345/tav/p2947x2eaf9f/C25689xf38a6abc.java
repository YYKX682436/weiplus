package com.p314xaae8f345.tav.p2947x2eaf9f;

/* renamed from: com.tencent.tav.core.VideoCompositor */
/* loaded from: classes16.dex */
public class C25689xf38a6abc implements com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629 {

    /* renamed from: filter */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25685xacd027da f47562xb408cb78;

    /* renamed from: checkRequest */
    private boolean m96812x3db16c67(com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.C25699x9dbd9fd8 c25699x9dbd9fd8) {
        return (c25699x9dbd9fd8.m96899xc0f97383() == null || c25699x9dbd9fd8.m96900xe90befbe() == null || c25699x9dbd9fd8.m96900xe90befbe().isEmpty()) ? false : true;
    }

    /* renamed from: drawInstructionBuffer */
    private void m96813xf820d8a(com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.C25699x9dbd9fd8 c25699x9dbd9fd8, com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25700xb60b20d6 interfaceC25700xb60b20d6) {
        this.f47562xb408cb78.m96780xca4e38d(interfaceC25700xb60b20d6.mo96908x3119c89f());
        for (com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec interfaceC25708x5f378eec : interfaceC25700xb60b20d6.mo96909xd5a1e4e0()) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m96906xcc32495d = c25699x9dbd9fd8.m96906xcc32495d(interfaceC25708x5f378eec.mo96946xfe2e0f70());
            if (m96906xcc32495d != null && m96906xcc32495d.m97194x3a00ef33() != null) {
                com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m96898x2337bd61 = c25699x9dbd9fd8.m96898x2337bd61();
                com.p314xaae8f345.tav.p2957xa228aba5.C25747xb6308b4c m96817x22e6e9a0 = m96817x22e6e9a0(m96898x2337bd61, interfaceC25708x5f378eec.mo96947xfae6982e(m96898x2337bd61));
                this.f47562xb408cb78.m96779x79f87086(m96906xcc32495d.m97194x3a00ef33(), m96817x22e6e9a0 == null ? null : m96817x22e6e9a0.m97309x8ace8a1c(), null, m96816x6b3221a1(m96898x2337bd61, interfaceC25708x5f378eec.mo96945x3ae3e7af(m96898x2337bd61)), m96815x6ee421ed(m96898x2337bd61, interfaceC25708x5f378eec.mo96944x19c4e1fb(m96898x2337bd61)));
            }
        }
    }

    /* renamed from: drawSrcBuffer */
    private void m96814xd1d4e260(com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.C25699x9dbd9fd8 c25699x9dbd9fd8) {
        this.f47562xb408cb78.m96780xca4e38d(-16777216);
        java.util.Iterator<java.lang.Integer> it = c25699x9dbd9fd8.m96900xe90befbe().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m96906xcc32495d = c25699x9dbd9fd8.m96906xcc32495d(it.next().intValue());
            if (m96906xcc32495d != null && m96906xcc32495d.m97194x3a00ef33() != null) {
                com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m97194x3a00ef33 = m96906xcc32495d.m97194x3a00ef33();
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97469xa52d49d5(matrix, m97194x3a00ef33.f47886xcc7d15ae, m97194x3a00ef33.f47894x6be2dc6, m97194x3a00ef33.f47883xb7389127);
                this.f47562xb408cb78.m96779x79f87086(m96906xcc32495d.m97194x3a00ef33(), matrix, m97194x3a00ef33.m97280xc3a49506(), 1.0f, null);
            }
        }
    }

    /* renamed from: getCropRectangleForTime */
    private static com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 m96815x6ee421ed(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.CropRectangleRamp cropRectangleRamp) {
        if (cropRectangleRamp.f47667xb1f40f7d == null || cropRectangleRamp.f47666xd87017a4 == null || !cropRectangleRamp.f47668x16fae70.m97253x805f158c(c25736x76b98a57)) {
            return null;
        }
        float m97232x31040141 = (((float) (c25736x76b98a57.m97232x31040141() - cropRectangleRamp.f47668x16fae70.m97261xccb87a6a())) * 1.0f) / ((float) cropRectangleRamp.f47668x16fae70.m97257x37a7fb48());
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468(m96819x2156b9a4(m97232x31040141, cropRectangleRamp.f47667xb1f40f7d.f47829xc3e1af26.x, cropRectangleRamp.f47666xd87017a4.f47829xc3e1af26.x), m96819x2156b9a4(m97232x31040141, cropRectangleRamp.f47667xb1f40f7d.f47829xc3e1af26.y, cropRectangleRamp.f47666xd87017a4.f47829xc3e1af26.y), m96819x2156b9a4(m97232x31040141, cropRectangleRamp.f47667xb1f40f7d.f47830x35e001.f47833x6be2dc6, cropRectangleRamp.f47666xd87017a4.f47830x35e001.f47833x6be2dc6), m96819x2156b9a4(m97232x31040141, cropRectangleRamp.f47667xb1f40f7d.f47830x35e001.f47832xb7389127, cropRectangleRamp.f47666xd87017a4.f47830x35e001.f47832xb7389127));
    }

    /* renamed from: getOpacityForTime */
    private static float m96816x6b3221a1(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.OpacityRamp opacityRamp) {
        if (!opacityRamp.f47672x16fae70.m97253x805f158c(c25736x76b98a57)) {
            return 1.0f;
        }
        return m96819x2156b9a4((((float) (c25736x76b98a57.m97232x31040141() - opacityRamp.f47672x16fae70.m97261xccb87a6a())) * 1.0f) / ((float) opacityRamp.f47672x16fae70.m97257x37a7fb48()), opacityRamp.f47671xac747949, opacityRamp.f47670xc2076ab0);
    }

    /* renamed from: getTransformForTime */
    private static com.p314xaae8f345.tav.p2957xa228aba5.C25747xb6308b4c m96817x22e6e9a0(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.TransformRamp transformRamp) {
        if (!transformRamp.f47676x16fae70.m97253x805f158c(c25736x76b98a57) || transformRamp.f47675x299f952a == null || transformRamp.f47674x263bc8d1 == null) {
            return null;
        }
        float m97232x31040141 = (((float) (c25736x76b98a57.m97232x31040141() - transformRamp.f47676x16fae70.m97261xccb87a6a())) * 1.0f) / ((float) transformRamp.f47676x16fae70.m97257x37a7fb48());
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25747xb6308b4c(m96819x2156b9a4(m97232x31040141, transformRamp.f47675x299f952a.f47899xc9de204e, transformRamp.f47674x263bc8d1.f47899xc9de204e), m96819x2156b9a4(m97232x31040141, transformRamp.f47675x299f952a.f47900xc9de204f, transformRamp.f47674x263bc8d1.f47900xc9de204f), m96819x2156b9a4(m97232x31040141, transformRamp.f47675x299f952a.f47901x995d38ca, transformRamp.f47674x263bc8d1.f47901x995d38ca), m96819x2156b9a4(m97232x31040141, transformRamp.f47675x299f952a.f47902x995d38cb, transformRamp.f47674x263bc8d1.f47902x995d38cb), m96819x2156b9a4(m97232x31040141, transformRamp.f47675x299f952a.f47898x5c296b27, transformRamp.f47674x263bc8d1.f47898x5c296b27));
    }

    /* renamed from: initFilter */
    private void m96818xf8a310a8(com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.C25699x9dbd9fd8 c25699x9dbd9fd8) {
        if (this.f47562xb408cb78 == null) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 m96918xfb854877 = c25699x9dbd9fd8.m96899xc0f97383().m96918xfb854877();
            int i17 = (int) m96918xfb854877.f47833x6be2dc6;
            int i18 = (int) m96918xfb854877.f47832xb7389127;
            com.p314xaae8f345.tav.p2947x2eaf9f.C25685xacd027da c25685xacd027da = new com.p314xaae8f345.tav.p2947x2eaf9f.C25685xacd027da();
            this.f47562xb408cb78 = c25685xacd027da;
            c25685xacd027da.m96787x5e392181(i17);
            this.f47562xb408cb78.m96786x4f1c14cc(i18);
            this.f47562xb408cb78.m96785xf73870dd(false);
        }
    }

    /* renamed from: interpolation */
    private static float m96819x2156b9a4(float f17, float f18, float f19) {
        return f18 == f19 ? f18 : ((f19 - f18) * f17) + f18;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629
    /* renamed from: cancelAllPendingVideoCompositionRequests */
    public void mo96820x3027e603() {
    }

    /* renamed from: finishComposedVideoFrame */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m96821x8c789257(com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719, com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14) {
        return c25734xcdff9c14;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629
    /* renamed from: release */
    public void mo96822x41012807() {
        com.p314xaae8f345.tav.p2947x2eaf9f.C25685xacd027da c25685xacd027da = this.f47562xb408cb78;
        if (c25685xacd027da != null) {
            c25685xacd027da.mo96777x41012807();
            this.f47562xb408cb78 = null;
        }
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
        if (m96812x3db16c67(c25699x9dbd9fd8)) {
            m96818xf8a310a8(c25699x9dbd9fd8);
            com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14 = new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(c25699x9dbd9fd8.m96898x2337bd61(), c25699x9dbd9fd8.m96899xc0f97383().m96920x7e2662a9(), false);
            if (c25734xcdff9c14.m97194x3a00ef33() == null) {
                return;
            }
            this.f47562xb408cb78.m96784x434421f9(c25734xcdff9c14.m97194x3a00ef33());
            com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25700xb60b20d6 m96902xbb2591a9 = c25699x9dbd9fd8.m96902xbb2591a9();
            if (m96902xbb2591a9 == null || m96902xbb2591a9.mo96909xd5a1e4e0() == null || m96902xbb2591a9.mo96909xd5a1e4e0().size() == 0) {
                m96814xd1d4e260(c25699x9dbd9fd8);
            } else {
                m96813xf820d8a(c25699x9dbd9fd8, m96902xbb2591a9);
            }
            c25699x9dbd9fd8.m96894x58b3683d(m96821x8c789257(c25699x9dbd9fd8.m96899xc0f97383().m96915xc0f97383(), c25734xcdff9c14));
        }
    }
}
