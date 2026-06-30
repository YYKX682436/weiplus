package com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa;

/* renamed from: com.tencent.tav.core.composition.MutableVideoCompositionLayerInstruction */
/* loaded from: classes16.dex */
public class C25705x11c105f2 implements com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec {

    /* renamed from: assetTrack */
    private com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b f47638x7e556c3b;

    /* renamed from: cropRectangleRampList */
    private java.util.List<com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.CropRectangleRamp> f47639x54e041af;

    /* renamed from: duration */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f47640x89444d94;

    /* renamed from: flipX */
    private boolean f47641x5d00d8b;

    /* renamed from: flipY */
    private boolean f47642x5d00d8c;

    /* renamed from: opacityRampList */
    private java.util.List<com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.OpacityRamp> f47643x99c38fb;

    /* renamed from: trackID */
    private int f47644xc060d3a6;

    /* renamed from: transformRampList */
    private java.util.List<com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.TransformRamp> f47645xd9adbb5c;

    public C25705x11c105f2(com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b) {
        this.f47645xd9adbb5c = new java.util.ArrayList();
        this.f47643x99c38fb = new java.util.ArrayList();
        this.f47639x54e041af = new java.util.ArrayList();
        this.f47640x89444d94 = new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(2147483647L);
        this.f47641x5d00d8b = false;
        this.f47642x5d00d8c = false;
        this.f47644xc060d3a6 = c25634xf527485b.m96163xfe2e0f70();
        this.f47638x7e556c3b = c25634xf527485b;
        this.f47640x89444d94 = c25634xf527485b.mo96150x51e8b0a();
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec
    /* renamed from: getCropRectangleRampForTime */
    public com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.CropRectangleRamp mo96944x19c4e1fb(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        for (com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.CropRectangleRamp cropRectangleRamp : this.f47639x54e041af) {
            if (cropRectangleRamp.f47668x16fae70.m97253x805f158c(c25736x76b98a57)) {
                return cropRectangleRamp;
            }
        }
        return new com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.CropRectangleRamp(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, this.f47640x89444d94));
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec
    /* renamed from: getOpacityRampForTime */
    public com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.OpacityRamp mo96945x3ae3e7af(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        for (com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.OpacityRamp opacityRamp : this.f47643x99c38fb) {
            if (opacityRamp.f47672x16fae70.m97253x805f158c(c25736x76b98a57)) {
                return opacityRamp;
            }
        }
        return new com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.OpacityRamp(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, this.f47640x89444d94));
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec
    /* renamed from: getTrackID */
    public int mo96946xfe2e0f70() {
        return this.f47644xc060d3a6;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec
    /* renamed from: getTransformRampForTime */
    public com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.TransformRamp mo96947xfae6982e(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        for (com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.TransformRamp transformRamp : this.f47645xd9adbb5c) {
            if (transformRamp.f47676x16fae70.m97253x805f158c(c25736x76b98a57)) {
                return transformRamp;
            }
        }
        return new com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.TransformRamp(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, this.f47640x89444d94));
    }

    /* renamed from: setCropRectangle */
    public void m96948x2390177d(com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 c25731x76640468, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572 = this.f47640x89444d94;
        java.util.Iterator<com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.CropRectangleRamp> it = this.f47639x54e041af.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.CropRectangleRamp next = it.next();
            if (next.f47668x16fae70.m97253x805f158c(c25736x76b98a57)) {
                c25736x76b98a572 = next.f47668x16fae70.m97258xb58839a5();
                next.f47668x16fae70 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(next.f47668x16fae70.m97260x75286aac(), c25736x76b98a57.sub(next.f47668x16fae70.m97260x75286aac()));
                break;
            }
        }
        com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.CropRectangleRamp cropRectangleRamp = new com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.CropRectangleRamp(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25736x76b98a57, c25736x76b98a572.sub(c25736x76b98a57)));
        cropRectangleRamp.f47667xb1f40f7d = c25731x76640468;
        cropRectangleRamp.f47666xd87017a4 = c25731x76640468;
        this.f47639x54e041af.add(cropRectangleRamp);
    }

    /* renamed from: setCropRectangleRampFromStartCropRectangle */
    public void m96949xa0aecd6(com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 c25731x76640468, com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 c25731x766404682, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.CropRectangleRamp cropRectangleRamp = new com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.CropRectangleRamp(c25738xead39d26);
        cropRectangleRamp.f47667xb1f40f7d = c25731x76640468;
        cropRectangleRamp.f47666xd87017a4 = c25731x766404682;
        java.util.Iterator<com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.CropRectangleRamp> it = this.f47639x54e041af.iterator();
        if (it.hasNext()) {
            com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.CropRectangleRamp next = it.next();
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97260x75286aac = next.f47668x16fae70.m97260x75286aac();
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97258xb58839a5 = next.f47668x16fae70.m97258xb58839a5();
            if (c25738xead39d26.m97253x805f158c(m97260x75286aac) && c25738xead39d26.m97253x805f158c(m97258xb58839a5)) {
                next.f47668x16fae70 = com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26.f47873x2dc6f5f1;
            } else if (c25738xead39d26.m97253x805f158c(m97260x75286aac) && !c25738xead39d26.m97253x805f158c(m97258xb58839a5)) {
                next.f47668x16fae70 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25738xead39d26.m97258xb58839a5(), next.f47668x16fae70.m97258xb58839a5().sub(c25738xead39d26.m97258xb58839a5()));
            } else if (c25738xead39d26.m97253x805f158c(m97258xb58839a5) && !c25738xead39d26.m97253x805f158c(m97260x75286aac)) {
                next.f47668x16fae70 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(next.f47668x16fae70.m97260x75286aac(), c25738xead39d26.m97260x75286aac().sub(next.f47668x16fae70.m97260x75286aac()));
            }
        }
        int i17 = 0;
        while (i17 < this.f47639x54e041af.size()) {
            com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.CropRectangleRamp cropRectangleRamp2 = this.f47639x54e041af.get(i17);
            if (cropRectangleRamp2.f47668x16fae70 == com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26.f47873x2dc6f5f1) {
                this.f47639x54e041af.remove(cropRectangleRamp2);
                i17--;
            }
            i17++;
        }
        this.f47639x54e041af.add(cropRectangleRamp);
    }

    /* renamed from: setFlipX */
    public void m96950x52fbce49(boolean z17) {
        this.f47641x5d00d8b = z17;
    }

    /* renamed from: setFlipY */
    public void m96951x52fbce4a(boolean z17) {
        this.f47642x5d00d8c = z17;
    }

    /* renamed from: setOpacity */
    public void m96952x65b68149(float f17, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572 = this.f47640x89444d94;
        java.util.Iterator<com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.OpacityRamp> it = this.f47643x99c38fb.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.OpacityRamp next = it.next();
            if (next.f47672x16fae70.m97253x805f158c(c25736x76b98a57)) {
                c25736x76b98a572 = next.f47672x16fae70.m97258xb58839a5();
                next.f47672x16fae70 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(next.f47672x16fae70.m97260x75286aac(), c25736x76b98a57.sub(next.f47672x16fae70.m97260x75286aac()));
                break;
            }
        }
        com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.OpacityRamp opacityRamp = new com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.OpacityRamp(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25736x76b98a57, c25736x76b98a572.sub(c25736x76b98a57)));
        opacityRamp.f47671xac747949 = f17;
        opacityRamp.f47670xc2076ab0 = f17;
        this.f47643x99c38fb.add(opacityRamp);
    }

    /* renamed from: setOpacityRampFromStartOpacity */
    public void m96953x1aaa192e(float f17, float f18, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.OpacityRamp opacityRamp = new com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.OpacityRamp(c25738xead39d26);
        opacityRamp.f47671xac747949 = f17;
        opacityRamp.f47670xc2076ab0 = f18;
        java.util.Iterator<com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.OpacityRamp> it = this.f47643x99c38fb.iterator();
        if (it.hasNext()) {
            com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.OpacityRamp next = it.next();
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97260x75286aac = next.f47672x16fae70.m97260x75286aac();
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97258xb58839a5 = next.f47672x16fae70.m97258xb58839a5();
            if (c25738xead39d26.m97253x805f158c(m97260x75286aac) && c25738xead39d26.m97253x805f158c(m97258xb58839a5)) {
                next.f47672x16fae70 = com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26.f47873x2dc6f5f1;
            } else if (c25738xead39d26.m97253x805f158c(m97260x75286aac) && !c25738xead39d26.m97253x805f158c(m97258xb58839a5)) {
                next.f47672x16fae70 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25738xead39d26.m97258xb58839a5(), next.f47672x16fae70.m97258xb58839a5().sub(c25738xead39d26.m97258xb58839a5()));
            } else if (c25738xead39d26.m97253x805f158c(m97258xb58839a5) && !c25738xead39d26.m97253x805f158c(m97260x75286aac)) {
                next.f47672x16fae70 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(next.f47672x16fae70.m97260x75286aac(), c25738xead39d26.m97260x75286aac().sub(next.f47672x16fae70.m97260x75286aac()));
            }
        }
        int i17 = 0;
        while (i17 < this.f47643x99c38fb.size()) {
            com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.OpacityRamp opacityRamp2 = this.f47643x99c38fb.get(i17);
            if (opacityRamp2.f47672x16fae70 == com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26.f47873x2dc6f5f1) {
                this.f47643x99c38fb.remove(opacityRamp2);
                i17--;
            }
            i17++;
        }
        this.f47643x99c38fb.add(opacityRamp);
    }

    /* renamed from: setTrackID */
    public void m96954x719f5ce4(int i17) {
        this.f47644xc060d3a6 = i17;
    }

    /* renamed from: setTransform */
    public void m96955x9a7f9d2a(com.p314xaae8f345.tav.p2957xa228aba5.C25747xb6308b4c c25747xb6308b4c, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572 = this.f47640x89444d94;
        java.util.Iterator<com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.TransformRamp> it = this.f47645xd9adbb5c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.TransformRamp next = it.next();
            if (next.f47676x16fae70.m97253x805f158c(c25736x76b98a57)) {
                c25736x76b98a572 = next.f47676x16fae70.m97258xb58839a5();
                next.f47676x16fae70 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(next.f47676x16fae70.m97260x75286aac(), c25736x76b98a57.sub(next.f47676x16fae70.m97260x75286aac()));
                break;
            }
        }
        com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.TransformRamp transformRamp = new com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.TransformRamp(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25736x76b98a57, c25736x76b98a572.sub(c25736x76b98a57)));
        transformRamp.f47675x299f952a = c25747xb6308b4c;
        transformRamp.f47674x263bc8d1 = c25747xb6308b4c;
        this.f47645xd9adbb5c.add(transformRamp);
    }

    /* renamed from: setTransformRampFromStartTransform */
    public void m96956xd9b75cf0(com.p314xaae8f345.tav.p2957xa228aba5.C25747xb6308b4c c25747xb6308b4c, com.p314xaae8f345.tav.p2957xa228aba5.C25747xb6308b4c c25747xb6308b4c2, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.TransformRamp transformRamp = new com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.TransformRamp(c25738xead39d26);
        transformRamp.f47675x299f952a = c25747xb6308b4c;
        transformRamp.f47674x263bc8d1 = c25747xb6308b4c2;
        java.util.Iterator<com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.TransformRamp> it = this.f47645xd9adbb5c.iterator();
        if (it.hasNext()) {
            com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.TransformRamp next = it.next();
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97260x75286aac = next.f47676x16fae70.m97260x75286aac();
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97258xb58839a5 = next.f47676x16fae70.m97258xb58839a5();
            if (c25738xead39d26.m97253x805f158c(m97260x75286aac) && c25738xead39d26.m97253x805f158c(m97258xb58839a5)) {
                next.f47676x16fae70 = com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26.f47873x2dc6f5f1;
            } else if (c25738xead39d26.m97253x805f158c(m97260x75286aac) && !c25738xead39d26.m97253x805f158c(m97258xb58839a5)) {
                next.f47676x16fae70 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25738xead39d26.m97258xb58839a5(), next.f47676x16fae70.m97258xb58839a5().sub(c25738xead39d26.m97258xb58839a5()));
            } else if (c25738xead39d26.m97253x805f158c(m97258xb58839a5) && !c25738xead39d26.m97253x805f158c(m97260x75286aac)) {
                next.f47676x16fae70 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(next.f47676x16fae70.m97260x75286aac(), c25738xead39d26.m97260x75286aac().sub(next.f47676x16fae70.m97260x75286aac()));
            }
        }
        int i17 = 0;
        while (i17 < this.f47645xd9adbb5c.size()) {
            com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.TransformRamp transformRamp2 = this.f47645xd9adbb5c.get(i17);
            if (transformRamp2.f47676x16fae70 == com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26.f47873x2dc6f5f1) {
                this.f47645xd9adbb5c.remove(transformRamp2);
                i17--;
            }
            i17++;
        }
        this.f47645xd9adbb5c.add(transformRamp);
    }

    public C25705x11c105f2(int i17) {
        this.f47645xd9adbb5c = new java.util.ArrayList();
        this.f47643x99c38fb = new java.util.ArrayList();
        this.f47639x54e041af = new java.util.ArrayList();
        this.f47640x89444d94 = new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(2147483647L);
        this.f47641x5d00d8b = false;
        this.f47642x5d00d8c = false;
        this.f47644xc060d3a6 = i17;
    }

    public C25705x11c105f2() {
        this.f47645xd9adbb5c = new java.util.ArrayList();
        this.f47643x99c38fb = new java.util.ArrayList();
        this.f47639x54e041af = new java.util.ArrayList();
        this.f47640x89444d94 = new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(2147483647L);
        this.f47641x5d00d8b = false;
        this.f47642x5d00d8c = false;
    }
}
