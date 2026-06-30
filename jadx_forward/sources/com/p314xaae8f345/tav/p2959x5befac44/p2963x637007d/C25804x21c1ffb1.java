package com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d;

/* renamed from: com.tencent.tav.decoder.muxer.MediaMuxerFactory */
/* loaded from: classes10.dex */
public class C25804x21c1ffb1 {

    /* renamed from: defaultMuxerCreator */
    private static com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.C25804x21c1ffb1.DefaultMediaMuxerCreator f48393x2f75d1d0 = new com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.C25804x21c1ffb1.DefaultMediaMuxerCreator();

    /* renamed from: muxerCreator */
    private static com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.C25804x21c1ffb1.MediaMuxerCreator f48394x376300ef = null;

    /* renamed from: com.tencent.tav.decoder.muxer.MediaMuxerFactory$DefaultMediaMuxerCreator */
    /* loaded from: classes10.dex */
    public static class DefaultMediaMuxerCreator implements com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.C25804x21c1ffb1.MediaMuxerCreator {
        private DefaultMediaMuxerCreator() {
        }

        @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.C25804x21c1ffb1.MediaMuxerCreator
        /* renamed from: createMediaMuxer */
        public com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422 mo72402xdf726115(java.lang.String str, int i17) {
            return new com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.C25802x700ac3fa(str, i17);
        }

        @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.C25804x21c1ffb1.MediaMuxerCreator
        /* renamed from: parallelMux */
        public int mo72403x25db7049(java.util.List<com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422> list) {
            return 0;
        }
    }

    /* renamed from: com.tencent.tav.decoder.muxer.MediaMuxerFactory$MediaMuxerCreator */
    /* loaded from: classes10.dex */
    public interface MediaMuxerCreator {
        /* renamed from: createMediaMuxer */
        com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422 mo72402xdf726115(java.lang.String str, int i17);

        /* renamed from: parallelMux */
        int mo72403x25db7049(java.util.List<com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422> list);
    }

    /* renamed from: createMediaMuxer */
    public static com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422 m97836xdf726115(java.lang.String str, int i17) {
        com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.C25804x21c1ffb1.MediaMuxerCreator mediaMuxerCreator = f48394x376300ef;
        return mediaMuxerCreator == null ? f48393x2f75d1d0.mo72402xdf726115(str, i17) : mediaMuxerCreator.mo72402xdf726115(str, i17);
    }

    /* renamed from: parallelMux */
    public static int m97837x25db7049(java.util.List<com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422> list) {
        com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.C25804x21c1ffb1.MediaMuxerCreator mediaMuxerCreator = f48394x376300ef;
        return mediaMuxerCreator == null ? f48393x2f75d1d0.mo72403x25db7049(list) : mediaMuxerCreator.mo72403x25db7049(list);
    }

    /* renamed from: setMuxerCreator */
    public static void m97838xce9e8e71(com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.C25804x21c1ffb1.MediaMuxerCreator mediaMuxerCreator) {
        f48394x376300ef = mediaMuxerCreator;
    }
}
