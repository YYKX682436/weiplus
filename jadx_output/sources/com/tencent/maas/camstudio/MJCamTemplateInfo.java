package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class MJCamTemplateInfo {
    private final boolean hasAIGCFeature;
    private final boolean hasARFeature;
    private final boolean isAsyncAIGCEnabled;
    private final boolean isOSTEnabled;
    private final boolean isStaticContentTemplate;
    private final boolean isUseFrontCamera;
    private final com.tencent.maas.model.time.MJTime maxRecordingDuration;
    private final com.tencent.maas.model.time.MJTime minRecordingDuration;
    private final java.util.List<com.tencent.maas.model.MJMusicInfo> musicInfos;
    private final int supportedImportedAssetCount;

    public MJCamTemplateInfo(boolean z17, boolean z18, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2, int i17, boolean z19, java.util.List<com.tencent.maas.model.MJMusicInfo> list) {
        this.isUseFrontCamera = z17;
        this.isOSTEnabled = z18;
        this.minRecordingDuration = mJTime;
        this.maxRecordingDuration = mJTime2;
        this.supportedImportedAssetCount = i17;
        this.hasAIGCFeature = z19;
        this.isAsyncAIGCEnabled = false;
        this.hasARFeature = false;
        this.isStaticContentTemplate = false;
        this.musicInfos = list;
    }

    public com.tencent.maas.model.time.MJTime getMaxRecordingDuration() {
        return this.maxRecordingDuration;
    }

    public com.tencent.maas.model.time.MJTime getMinRecordingDuration() {
        return this.minRecordingDuration;
    }

    public java.util.List<com.tencent.maas.model.MJMusicInfo> getMusicInfos() {
        return this.musicInfos;
    }

    public int getSupportedImportedAssetCount() {
        return this.supportedImportedAssetCount;
    }

    public boolean isAsyncAIGCEnabled() {
        return this.isAsyncAIGCEnabled;
    }

    public boolean isHasAIGCFeature() {
        return this.hasAIGCFeature;
    }

    public boolean isHasARFeature() {
        return this.hasARFeature;
    }

    public boolean isOSTEnabled() {
        return this.isOSTEnabled;
    }

    public boolean isStaticContentTemplate() {
        return this.isStaticContentTemplate;
    }

    public boolean isUseFrontCamera() {
        return this.isUseFrontCamera;
    }

    public MJCamTemplateInfo(boolean z17, boolean z18, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2, int i17, boolean z19, boolean z27, boolean z28, boolean z29, java.lang.Object[] objArr) {
        this.isUseFrontCamera = z17;
        this.isOSTEnabled = z18;
        this.minRecordingDuration = mJTime;
        this.maxRecordingDuration = mJTime2;
        this.supportedImportedAssetCount = i17;
        this.hasAIGCFeature = z19;
        this.isAsyncAIGCEnabled = z27;
        this.hasARFeature = z28;
        this.isStaticContentTemplate = z29;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (objArr != null) {
            for (java.lang.Object obj : objArr) {
                arrayList.add((com.tencent.maas.model.MJMusicInfo) obj);
            }
        }
        this.musicInfos = arrayList;
    }
}
