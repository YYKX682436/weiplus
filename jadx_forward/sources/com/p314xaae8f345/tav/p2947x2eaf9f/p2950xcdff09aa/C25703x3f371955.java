package com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa;

/* renamed from: com.tencent.tav.core.composition.MutableVideoComposition */
/* loaded from: classes16.dex */
public class C25703x3f371955 extends com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f {
    private static final java.lang.String TAG = "VideoComposition";

    /* renamed from: asset */
    private com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 f47630x58ceaf0;

    /* renamed from: customVideoCompositorClass */
    private java.lang.Class<? extends com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629> f47631x7e810d0d;

    /* renamed from: frameDuration */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f47632xef5b9e21;

    /* renamed from: instructions */
    private java.util.List<? extends com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25707xa7006bf> f47633x2d24a5a5;

    /* renamed from: renderLayoutMode */
    private com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f.RenderLayoutMode f47634x11a9e23;

    /* renamed from: renderScale */
    private float f47635x9e4c6554;

    /* renamed from: renderSize */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 f47636x472bdab7;

    /* renamed from: sourceTrackIDForFrameTiming */
    private int f47637xc3a4f79;

    public C25703x3f371955(com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 abstractC25633x3c9fad0) {
        this.f47630x58ceaf0 = abstractC25633x3c9fad0;
        this.f47633x2d24a5a5 = new java.util.ArrayList();
        m96923xb1b5bf73();
    }

    /* renamed from: fillSourceProperty */
    private void m96923xb1b5bf73() {
        java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b> mo96143x6e29e370 = this.f47630x58ceaf0.mo96143x6e29e370(1);
        this.f47632xef5b9e21 = null;
        this.f47636x472bdab7 = null;
        if (mo96143x6e29e370 != null) {
            for (com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b : mo96143x6e29e370) {
                com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = this.f47632xef5b9e21;
                if (c25736x76b98a57 == null) {
                    this.f47632xef5b9e21 = new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(1L, (int) c25634xf527485b.m96155xe9bce1e7());
                } else {
                    this.f47632xef5b9e21 = ((float) c25736x76b98a57.f47868x17e7e7d) > c25634xf527485b.m96155xe9bce1e7() ? this.f47632xef5b9e21 : new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(1L, (int) c25634xf527485b.m96155xe9bce1e7());
                }
            }
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572 = this.f47632xef5b9e21;
        if (c25736x76b98a572 == null || c25736x76b98a572.f47868x17e7e7d == 0) {
            this.f47632xef5b9e21 = new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(1L, 30);
        }
        com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 abstractC25633x3c9fad0 = this.f47630x58ceaf0;
        if (abstractC25633x3c9fad0 instanceof com.p314xaae8f345.tav.p2945x58ceaf0.C25638x3168b18a) {
            this.f47636x472bdab7 = abstractC25633x3c9fad0.mo96120x47007694();
        } else if (mo96143x6e29e370 != null) {
            for (com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b2 : mo96143x6e29e370) {
                if (this.f47636x472bdab7 == null) {
                    this.f47636x472bdab7 = c25634xf527485b2.m96153x47007694();
                } else if (c25634xf527485b2.m96153x47007694() != null) {
                    this.f47636x472bdab7 = new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85(java.lang.Math.max(this.f47636x472bdab7.f47833x6be2dc6, c25634xf527485b2.m96153x47007694().f47833x6be2dc6), java.lang.Math.max(this.f47636x472bdab7.f47832xb7389127, c25634xf527485b2.m96153x47007694().f47832xb7389127));
                }
            }
        }
        this.f47635x9e4c6554 = 1.0f;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f
    /* renamed from: getCustomVideoCompositor */
    public com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629 mo96924x35bb4175() {
        java.lang.Class<? extends com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629> cls = this.f47631x7e810d0d;
        if (cls == null) {
            return new com.p314xaae8f345.tav.p2947x2eaf9f.C25689xf38a6abc();
        }
        try {
            return cls.newInstance();
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException unused) {
            return new com.p314xaae8f345.tav.p2947x2eaf9f.C25689xf38a6abc();
        }
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f
    /* renamed from: getCustomVideoCompositorClass */
    public java.lang.Class<? extends com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629> mo96925xddaf1903() {
        return this.f47631x7e810d0d;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f
    /* renamed from: getFrameDuration */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96926xacbb5a6b() {
        return this.f47632xef5b9e21;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f
    /* renamed from: getInstructions */
    public java.util.List<? extends com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25707xa7006bf> mo96927x8e17381b() {
        return this.f47633x2d24a5a5;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f
    /* renamed from: getRenderLayoutMode */
    public com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f.RenderLayoutMode mo96928xa8f30599() {
        return this.f47634x11a9e23;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f
    /* renamed from: getRenderScale */
    public float mo96929x7822ac1e() {
        return this.f47635x9e4c6554;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f
    /* renamed from: getRenderSize */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 mo96930x356c92ad() {
        return this.f47636x472bdab7;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f
    /* renamed from: getSourceTrackIDForFrameTiming */
    public int mo96931x92cdc243() {
        return this.f47637xc3a4f79;
    }

    /* renamed from: setCustomVideoCompositorClass */
    public void m96932xcd6dcf0f(java.lang.Class<? extends com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629> cls) {
        this.f47631x7e810d0d = cls;
    }

    /* renamed from: setFrameDuration */
    public void m96933x3f91c0df(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        this.f47632xef5b9e21 = c25736x76b98a57;
    }

    /* renamed from: setInstructions */
    public void m96934xc4603327(java.util.List<? extends com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25707xa7006bf> list) {
        this.f47633x2d24a5a5 = list;
    }

    /* renamed from: setRenderLayoutMode */
    public void m96935x4cef9aa5(com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f.RenderLayoutMode renderLayoutMode) {
        this.f47634x11a9e23 = renderLayoutMode;
    }

    /* renamed from: setRenderScale */
    public void m96936xe881f92(float f17) {
        this.f47635x9e4c6554 = f17;
    }

    /* renamed from: setRenderSize */
    public void m96937x6390e0b9(com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85) {
        this.f47636x472bdab7 = c25732x76648a85;
    }

    /* renamed from: setSourceTrackIDForFrameTiming */
    public void m96938x9ae5cdb7(int i17) {
        this.f47637xc3a4f79 = i17;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f
    /* renamed from: toString */
    public java.lang.String mo96939x9616526c() {
        return "MutableVideoComposition{, frameDuration=" + this.f47632xef5b9e21 + ", renderSize=" + this.f47636x472bdab7 + ", renderLayoutMode=" + this.f47634x11a9e23 + ", instructions=" + this.f47633x2d24a5a5 + '}';
    }

    public C25703x3f371955() {
    }
}
