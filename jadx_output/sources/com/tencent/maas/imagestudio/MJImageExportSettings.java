package com.tencent.maas.imagestudio;

/* loaded from: classes5.dex */
public class MJImageExportSettings {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.imagestudio.c f48059a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.base.Vec2 f48060b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.maas.instamovie.MJExportSettings f48061c;

    public MJImageExportSettings(com.tencent.maas.imagestudio.c cVar, com.tencent.maas.base.Vec2 vec2, com.tencent.maas.instamovie.MJExportSettings mJExportSettings) {
        this.f48059a = cVar;
        this.f48060b = vec2;
        this.f48061c = mJExportSettings;
    }

    public com.tencent.maas.base.Vec2 getImageLimitedPixelSize() {
        return this.f48060b;
    }

    public int getImageType() {
        return this.f48059a.f48091d;
    }

    public com.tencent.maas.instamovie.MJExportSettings getVideoExportSettings() {
        return this.f48061c;
    }

    public MJImageExportSettings(int i17, com.tencent.maas.base.Vec2 vec2, com.tencent.maas.instamovie.MJExportSettings mJExportSettings) {
        com.tencent.maas.imagestudio.c cVar = com.tencent.maas.imagestudio.c.Invalid;
        if (i17 != 0) {
            if (i17 == 1) {
                cVar = com.tencent.maas.imagestudio.c.JPEG;
            } else if (i17 == 2) {
                cVar = com.tencent.maas.imagestudio.c.PNG;
            }
        }
        this.f48059a = cVar;
        this.f48060b = vec2;
        this.f48061c = mJExportSettings;
    }
}
