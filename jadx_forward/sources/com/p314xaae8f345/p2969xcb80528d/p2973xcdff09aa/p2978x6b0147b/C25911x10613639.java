package com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b;

/* renamed from: com.tencent.tavkit.composition.video.ImageCollection */
/* loaded from: classes10.dex */
public class C25911x10613639 {

    /* renamed from: videoChannelImages */
    private final java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25911x10613639.TrackImagePair> f49035xa46b58a0 = new java.util.ArrayList();

    /* renamed from: overlayImages */
    private final java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25911x10613639.TrackImagePair> f49034xea6336e8 = new java.util.ArrayList();

    /* renamed from: com.tencent.tavkit.composition.video.ImageCollection$TrackImagePair */
    /* loaded from: classes10.dex */
    public static class TrackImagePair {

        /* renamed from: image */
        private final com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 f49036x5faa95b;

        /* renamed from: track */
        private final com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25901x3c3e4053 f49037x697f14b;

        public TrackImagePair(com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 c25859x590b0095, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25901x3c3e4053 interfaceC25901x3c3e4053) {
            this.f49036x5faa95b = c25859x590b0095;
            this.f49037x697f14b = interfaceC25901x3c3e4053;
        }

        /* renamed from: getImage */
        public com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 m98746x74984fa5() {
            return this.f49036x5faa95b;
        }

        /* renamed from: getTrack */
        public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25901x3c3e4053 m98747x75359795() {
            return this.f49037x697f14b;
        }
    }

    /* renamed from: addChannelImage */
    public void m98741x75b0c959(com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 c25859x590b0095, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25901x3c3e4053 interfaceC25901x3c3e4053) {
        this.f49035xa46b58a0.add(new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25911x10613639.TrackImagePair(c25859x590b0095, interfaceC25901x3c3e4053));
    }

    /* renamed from: addOverlayImage */
    public void m98742x8b918a2c(com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 c25859x590b0095, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25901x3c3e4053 interfaceC25901x3c3e4053) {
        this.f49034xea6336e8.add(new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25911x10613639.TrackImagePair(c25859x590b0095, interfaceC25901x3c3e4053));
    }

    /* renamed from: getOverlayImages */
    public java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25911x10613639.TrackImagePair> m98743xa7c2f332() {
        return this.f49034xea6336e8;
    }

    /* renamed from: getVideoChannelImages */
    public java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25911x10613639.TrackImagePair> m98744xb7c7ba96() {
        return this.f49035xa46b58a0;
    }

    /* renamed from: toString */
    public java.lang.String m98745x9616526c() {
        return "ImageCollection{videoChannelImages=" + this.f49035xa46b58a0 + ", overlayImages=" + this.f49034xea6336e8 + '}';
    }
}
