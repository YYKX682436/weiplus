package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class MJAIGCResponseMediaFile {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.camstudio.MJAIGCServiceMediaFile f47846a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.base.Rect2 f47847b;

    public MJAIGCResponseMediaFile(com.tencent.maas.camstudio.MJAIGCServiceMediaFile mJAIGCServiceMediaFile, com.tencent.maas.base.Rect2 rect2) {
        this.f47846a = mJAIGCServiceMediaFile;
        this.f47847b = rect2;
    }

    public com.tencent.maas.base.Rect2 getFrameRect() {
        return this.f47847b;
    }

    public com.tencent.maas.camstudio.MJAIGCServiceMediaFile getMediaFile() {
        return this.f47846a;
    }
}
