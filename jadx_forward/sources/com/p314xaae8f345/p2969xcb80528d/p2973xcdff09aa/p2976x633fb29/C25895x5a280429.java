package com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29;

/* renamed from: com.tencent.tavkit.composition.model.TAVAudioConfiguration */
/* loaded from: classes16.dex */
public class C25895x5a280429 {

    /* renamed from: endVolumeEdge */
    private com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25895x5a280429.VolumeEdge f48994xab9cfb32;

    /* renamed from: nodes */
    private final java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.InterfaceC25879x655c64e7> f48995x64212b1;

    /* renamed from: startVolumeEdge */
    private com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25895x5a280429.VolumeEdge f48996x14b2b9f9;

    /* renamed from: volume */
    private float f48997xcfaae71a;

    /* renamed from: volumeEdges */
    private java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25895x5a280429.VolumeEdge> f48998xca66d35c;

    /* renamed from: com.tencent.tavkit.composition.model.TAVAudioConfiguration$VolumeEdge */
    /* loaded from: classes16.dex */
    public static class VolumeEdge {

        /* renamed from: endVolume */
        private float f48999x64c00bd5;

        /* renamed from: startVolume */
        private float f49000x959a461c;

        /* renamed from: timeRange */
        private com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 f49001x16fae70;

        public VolumeEdge() {
        }

        /* renamed from: getDuration */
        public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m98677x51e8b0a() {
            com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26 = this.f49001x16fae70;
            return c25738xead39d26 != null ? c25738xead39d26.m97256x51e8b0a() : com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        }

        /* renamed from: getEndVolume */
        public float m98678x642d7d1f() {
            return this.f48999x64c00bd5;
        }

        /* renamed from: getStartVolume */
        public float m98679x6f708ce6() {
            return this.f49000x959a461c;
        }

        /* renamed from: getTimeRange */
        public com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m98680xdd1fba() {
            return this.f49001x16fae70;
        }

        /* renamed from: getVolume */
        public float m98681x34c20a10(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
            long m97232x31040141 = c25736x76b98a57.m97232x31040141();
            float f17 = this.f49000x959a461c;
            return f17 + ((this.f48999x64c00bd5 - f17) * ((((float) m97232x31040141) * 1.0f) / ((float) m98677x51e8b0a().m97232x31040141())));
        }

        /* renamed from: setDuration */
        public void m98682xffd6ec16(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
            this.f49001x16fae70 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, c25736x76b98a57);
        }

        /* renamed from: setEndVolume */
        public void m98683xc0813d93(float f17) {
            this.f48999x64c00bd5 = f17;
        }

        /* renamed from: setStartVolume */
        public void m98684x5d6005a(float f17) {
            this.f49000x959a461c = f17;
        }

        /* renamed from: setTimeRange */
        public void m98685x5d30e02e(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
            this.f49001x16fae70 = c25738xead39d26;
        }

        public VolumeEdge(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, float f17, float f18) {
            this.f49001x16fae70 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, c25736x76b98a57);
            this.f49000x959a461c = f17;
            this.f48999x64c00bd5 = f18;
        }

        public VolumeEdge(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26, float f17, float f18) {
            this.f49001x16fae70 = c25738xead39d26;
            this.f49000x959a461c = f17;
            this.f48999x64c00bd5 = f18;
        }
    }

    public C25895x5a280429() {
        this(1.0f);
    }

    /* renamed from: addAudioProcessorNode */
    public void m98663xf39283ff(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.InterfaceC25879x655c64e7 interfaceC25879x655c64e7) {
        this.f48995x64212b1.add(interfaceC25879x655c64e7);
    }

    /* renamed from: addVolumeEdge */
    public void m98664xa4a06b78(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25895x5a280429.VolumeEdge volumeEdge) {
        if (volumeEdge == null) {
            return;
        }
        if (this.f48998xca66d35c == null) {
            this.f48998xca66d35c = new java.util.ArrayList();
        }
        this.f48998xca66d35c.add(0, volumeEdge);
    }

    /* renamed from: getEndVolumeEdge */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25895x5a280429.VolumeEdge m98667x68fcb77c() {
        return this.f48994xab9cfb32;
    }

    /* renamed from: getNodes */
    public java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.InterfaceC25879x655c64e7> m98668x74dfb8fb() {
        return this.f48995x64212b1;
    }

    /* renamed from: getStartVolumeEdge */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25895x5a280429.VolumeEdge m98669xf9148bc3() {
        return this.f48996x14b2b9f9;
    }

    /* renamed from: getVolume */
    public float m98670x34c20a10() {
        return this.f48997xcfaae71a;
    }

    /* renamed from: setAudioProcessorNodes */
    public void m98672x7adb76f3(java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.InterfaceC25879x655c64e7> list) {
        this.f48995x64212b1.clear();
        if (list != null) {
            this.f48995x64212b1.addAll(list);
        }
    }

    /* renamed from: setEndVolumeEdge */
    public void m98673xfbd31df0(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25895x5a280429.VolumeEdge volumeEdge) {
        this.f48994xab9cfb32 = volumeEdge;
    }

    /* renamed from: setStartVolumeEdge */
    public void m98674x2feb2537(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25895x5a280429.VolumeEdge volumeEdge) {
        this.f48996x14b2b9f9 = volumeEdge;
    }

    /* renamed from: setVolume */
    public void m98675x27f73e1c(float f17) {
        this.f48997xcfaae71a = f17;
    }

    /* renamed from: toString */
    public java.lang.String m98676x9616526c() {
        return "TAVAudioConfiguration{volume=" + this.f48997xcfaae71a + ", startVolumeEdge=" + this.f48996x14b2b9f9 + ", endVolumeEdge=" + this.f48994xab9cfb32 + ", nodes=" + this.f48995x64212b1 + '}';
    }

    public C25895x5a280429(float f17) {
        this(f17, null, null);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25895x5a280429 m98666x5a5dd5d() {
        return new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25895x5a280429(this.f48997xcfaae71a, this.f48995x64212b1);
    }

    /* renamed from: getVolume */
    public float m98671x34c20a10(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25895x5a280429.VolumeEdge volumeEdge = this.f48996x14b2b9f9;
        if (volumeEdge != null && volumeEdge.m98680xdd1fba() != null && this.f48996x14b2b9f9.m98680xdd1fba().m97253x805f158c(c25736x76b98a57)) {
            com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25895x5a280429.VolumeEdge volumeEdge2 = this.f48996x14b2b9f9;
            return volumeEdge2.m98681x34c20a10(c25736x76b98a57.sub(volumeEdge2.m98680xdd1fba().m97260x75286aac()));
        }
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25895x5a280429.VolumeEdge volumeEdge3 = this.f48994xab9cfb32;
        if (volumeEdge3 != null && volumeEdge3.m98680xdd1fba() != null && this.f48994xab9cfb32.m98680xdd1fba().m97253x805f158c(c25736x76b98a57)) {
            com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25895x5a280429.VolumeEdge volumeEdge4 = this.f48994xab9cfb32;
            return volumeEdge4.m98681x34c20a10(c25736x76b98a57.sub(volumeEdge4.m98680xdd1fba().m97260x75286aac()));
        }
        java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25895x5a280429.VolumeEdge> list = this.f48998xca66d35c;
        if (list != null && !list.isEmpty()) {
            for (com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25895x5a280429.VolumeEdge volumeEdge5 : this.f48998xca66d35c) {
                if (volumeEdge5 != null && volumeEdge5.m98680xdd1fba() != null && volumeEdge5.m98680xdd1fba().m97253x805f158c(c25736x76b98a57)) {
                    return volumeEdge5.m98681x34c20a10(c25736x76b98a57.sub(volumeEdge5.m98680xdd1fba().m97260x75286aac()));
                }
            }
        }
        return this.f48997xcfaae71a;
    }

    public C25895x5a280429(java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25895x5a280429.VolumeEdge> list) {
        this(1.0f, null, list);
    }

    public C25895x5a280429(float f17, java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.InterfaceC25879x655c64e7> list) {
        this(f17, list, null);
    }

    public C25895x5a280429(float f17, java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.InterfaceC25879x655c64e7> list, java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25895x5a280429.VolumeEdge> list2) {
        this.f48997xcfaae71a = f17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f48995x64212b1 = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.f48998xca66d35c = arrayList2;
        if (list2 != null) {
            arrayList2.addAll(list2);
        }
    }
}
