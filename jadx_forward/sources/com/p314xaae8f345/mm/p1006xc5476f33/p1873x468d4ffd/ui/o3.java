package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public class o3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.SightSettingsUI f230914d;

    public o3(com.tencent.mm.plugin.mmsight.ui.SightSettingsUI sightSettingsUI) {
        this.f230914d = sightSettingsUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightSettingsUI", "has connect");
        com.tencent.mm.plugin.mmsight.ui.SightSettingsUI sightSettingsUI = this.f230914d;
        java.util.LinkedList linkedList = sightSettingsUI.h;
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.t3(sightSettingsUI, "打开测试信息", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_DEBUGINFO_INT_SYNC, new java.lang.String[]{"Y", "N"}, new int[]{1, 0}));
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.t3(sightSettingsUI, "拍照方式", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_CAPTURE_TYPE_INT_SYNC, new java.lang.String[]{"Image流", "预览帧"}, new int[]{1, 2}));
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.t3(sightSettingsUI, "CameraApi", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_CAMERA_API_INT_SYNC, new java.lang.String[]{"Camera2", "Camera1"}, new int[]{2, 1}));
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.t3(sightSettingsUI, "对焦方案", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_FOCUS_INT_SYNC, new java.lang.String[]{"System", "啊..."}, new int[]{1, 0}));
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.t3(sightSettingsUI, "裁剪方案", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_FFMMPEGCUT_INT_SYNC, new java.lang.String[]{"default", "mediacodecv21", "mediacodecv", "ffmpeg"}, new int[]{-1, 1, 2, 3}));
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.t3(sightSettingsUI, "是否把双通音频压成单通道", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_COMPRESS_TO_SINGLE_CHANNEL_INT_SYNC, new java.lang.String[]{"-1", "yes", "no"}, new int[]{-1, 1, 0}));
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.t3(sightSettingsUI, "Thread", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_THREADCOUNT_INT_SYNC, new java.lang.String[]{"-1", "1", "2", "3", "4", "5", "6"}, new int[]{-1, 1, 2, 3, 4, 5, 6}));
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.t3(sightSettingsUI, "裁剪预览MediaPlayer", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_CLIP_PREVIEW_MEDIA_PLAYER_INT_SYNC, new java.lang.String[]{"default", "系统方案", "MediaCodec解码播放方案"}, new int[]{-1, 1, 2}));
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.t3(sightSettingsUI, "音频录制方案", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_AUDIO_RECORDER_TYPE_INT_SYNC, new java.lang.String[]{"-1", "MediaCodec", "MediaRecorder"}, new int[]{-1, 1, 2}));
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.t3(sightSettingsUI, "预览裁剪方式", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_PREVIEW_CROP_INT_SYNC, new java.lang.String[]{"跟随配置", "预览GPU裁剪", "预览CPU裁剪"}, new int[]{-1, 1, 2}));
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.t3(sightSettingsUI, "预设配置", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_SETTING_PRESET_INT_SYNC, new java.lang.String[]{"跟后台配置", "MediaCodec+540p录制", "MediaCodec+720p双倍码率录制+后期压缩", "FFMpeg+540p录制", "FFMpeg+720p双倍码率录制+后期压缩", "MediaCodec+720p原码率录制", "FFMpeg+720p原码率录制", "MediaCodec+1080p+实时压缩", "MediaCodec+1080p+实时压缩/旋转", "FFMpeg+1080p+实时压缩", "FFMpeg+1080p+实时压缩/旋转", "MediaCodec+1080p双倍码率+后压+实时压缩"}, new int[]{-1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}));
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.t3(sightSettingsUI, "重编码抛异常到兜底逻辑", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_REMUX_THROW_ERROR_INT_SYNC, new java.lang.String[]{"不抛异常", "抛异常"}, new int[]{-1, 1}));
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.t3(sightSettingsUI, "录制创建编码器抛异常", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_RECORD_THROW_ERROR_INT_SYNC, new java.lang.String[]{"不抛异常", "抛异常"}, new int[]{-1, 1}));
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.t3(sightSettingsUI, "转码使用ffmpeg合成器", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_RECORD_USE_FFMPEG_INT_SYNC, new java.lang.String[]{"使用默认配置", "使用MP4V2", "使用FFMPEG"}, new int[]{-1, 1, 2}));
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.t3(sightSettingsUI, "拍摄使用ffmpeg合成器", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_CAPTURE_USE_FFMPEG_INT_SYNC, new java.lang.String[]{"使用默认配置", "使用MP4V2", "使用FFMPEG"}, new int[]{-1, 1, 2}));
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.t3(sightSettingsUI, "ffmpeg合成器写入Codec PTS", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_RECORD_USE_FFMPEG_CODEC_PTS_INT_SYNC, new java.lang.String[]{"使用默认配置", "写入Codec pts", "不写入Codec pts，自己计算"}, new int[]{-1, 1, 2}));
        sightSettingsUI.d = (android.widget.ListView) sightSettingsUI.findViewById(com.p314xaae8f345.mm.R.id.i3y);
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.r3 r3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.r3(sightSettingsUI);
        sightSettingsUI.e = r3Var;
        sightSettingsUI.d.setAdapter((android.widget.ListAdapter) r3Var);
    }
}
