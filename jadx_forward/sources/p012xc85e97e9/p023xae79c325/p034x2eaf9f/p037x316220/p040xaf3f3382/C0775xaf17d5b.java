package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p040xaf3f3382;

/* renamed from: androidx.camera.core.impl.compat.EncoderProfilesProxyCompatBaseImpl */
/* loaded from: classes14.dex */
class C0775xaf17d5b {
    private C0775xaf17d5b() {
    }

    /* renamed from: from */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08 m5774x3017aa(android.media.CamcorderProfile camcorderProfile) {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.ImmutableEncoderProfilesProxy.m5433xaf65a0fc(camcorderProfile.duration, camcorderProfile.fileFormat, m5775x274a3725(camcorderProfile), m5776x8a903aca(camcorderProfile));
    }

    /* renamed from: toAudioProfiles */
    private static java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.AudioProfileProxy> m5775x274a3725(android.media.CamcorderProfile camcorderProfile) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = camcorderProfile.audioCodec;
        arrayList.add(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.AudioProfileProxy.m5432xaf65a0fc(i17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.m5429xa7614d84(i17), camcorderProfile.audioBitRate, camcorderProfile.audioSampleRate, camcorderProfile.audioChannels, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.m5430x3216ea8(camcorderProfile.audioCodec)));
        return arrayList;
    }

    /* renamed from: toVideoProfiles */
    private static java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.VideoProfileProxy> m5776x8a903aca(android.media.CamcorderProfile camcorderProfile) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = camcorderProfile.videoCodec;
        arrayList.add(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.VideoProfileProxy.m5434xaf65a0fc(i17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.m5431x97f4c8ff(i17), camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
        return arrayList;
    }
}
