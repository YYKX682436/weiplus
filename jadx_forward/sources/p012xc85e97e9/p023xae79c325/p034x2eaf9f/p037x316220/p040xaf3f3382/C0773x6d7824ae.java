package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p040xaf3f3382;

/* renamed from: androidx.camera.core.impl.compat.EncoderProfilesProxyCompatApi31Impl */
/* loaded from: classes16.dex */
class C0773x6d7824ae {
    private C0773x6d7824ae() {
    }

    /* renamed from: from */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08 m5768x3017aa(android.media.EncoderProfiles encoderProfiles) {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.ImmutableEncoderProfilesProxy.m5433xaf65a0fc(encoderProfiles.getDefaultDurationSeconds(), encoderProfiles.getRecommendedFileFormat(), m5769x38e8d256(encoderProfiles.getAudioProfiles()), m5770x9c2ed5fb(encoderProfiles.getVideoProfiles()));
    }

    /* renamed from: fromAudioProfiles */
    private static java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.AudioProfileProxy> m5769x38e8d256(java.util.List<android.media.EncoderProfiles.AudioProfile> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.media.EncoderProfiles.AudioProfile audioProfile : list) {
            arrayList.add(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.AudioProfileProxy.m5432xaf65a0fc(audioProfile.getCodec(), audioProfile.getMediaType(), audioProfile.getBitrate(), audioProfile.getSampleRate(), audioProfile.getChannels(), audioProfile.getProfile()));
        }
        return arrayList;
    }

    /* renamed from: fromVideoProfiles */
    private static java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.VideoProfileProxy> m5770x9c2ed5fb(java.util.List<android.media.EncoderProfiles.VideoProfile> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.media.EncoderProfiles.VideoProfile videoProfile : list) {
            arrayList.add(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.VideoProfileProxy.m5434xaf65a0fc(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), 8, 0, 0));
        }
        return arrayList;
    }
}
