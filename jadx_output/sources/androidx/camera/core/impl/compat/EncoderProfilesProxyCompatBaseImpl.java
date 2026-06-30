package androidx.camera.core.impl.compat;

/* loaded from: classes14.dex */
class EncoderProfilesProxyCompatBaseImpl {
    private EncoderProfilesProxyCompatBaseImpl() {
    }

    public static androidx.camera.core.impl.EncoderProfilesProxy from(android.media.CamcorderProfile camcorderProfile) {
        return androidx.camera.core.impl.EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(camcorderProfile.duration, camcorderProfile.fileFormat, toAudioProfiles(camcorderProfile), toVideoProfiles(camcorderProfile));
    }

    private static java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy> toAudioProfiles(android.media.CamcorderProfile camcorderProfile) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = camcorderProfile.audioCodec;
        arrayList.add(androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy.create(i17, androidx.camera.core.impl.EncoderProfilesProxy.getAudioCodecMimeType(i17), camcorderProfile.audioBitRate, camcorderProfile.audioSampleRate, camcorderProfile.audioChannels, androidx.camera.core.impl.EncoderProfilesProxy.getRequiredAudioProfile(camcorderProfile.audioCodec)));
        return arrayList;
    }

    private static java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> toVideoProfiles(android.media.CamcorderProfile camcorderProfile) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = camcorderProfile.videoCodec;
        arrayList.add(androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy.create(i17, androidx.camera.core.impl.EncoderProfilesProxy.getVideoCodecMimeType(i17), camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
        return arrayList;
    }
}
