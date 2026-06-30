package com.tencent.maas.imagestudio;

/* loaded from: classes5.dex */
public class MJImageCropDesc {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.imagestudio.a f48053a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.AspectRatio f48054b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.AspectRatio f48055c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.maas.base.Rect2 f48056d;

    public MJImageCropDesc(com.tencent.maas.imagestudio.a aVar, com.tencent.maas.moviecomposing.AspectRatio aspectRatio, com.tencent.maas.moviecomposing.AspectRatio aspectRatio2, com.tencent.maas.base.Rect2 rect2) {
        this.f48053a = aVar;
        this.f48054b = aspectRatio;
        this.f48055c = aspectRatio2;
        this.f48056d = rect2;
    }

    public com.tencent.maas.moviecomposing.AspectRatio getAspectRatio() {
        return this.f48054b;
    }

    public int getCropAspectRatioType() {
        return this.f48053a.f48080d;
    }

    public com.tencent.maas.base.Rect2 getCropRegion() {
        return this.f48056d;
    }

    public com.tencent.maas.moviecomposing.AspectRatio getOriginalAspectRatio() {
        return this.f48055c;
    }

    public MJImageCropDesc(int i17, com.tencent.maas.moviecomposing.AspectRatio aspectRatio, com.tencent.maas.moviecomposing.AspectRatio aspectRatio2, com.tencent.maas.base.Rect2 rect2) {
        com.tencent.maas.imagestudio.a aVar = com.tencent.maas.imagestudio.a.Original;
        if (i17 != 0) {
            if (i17 == 1) {
                aVar = com.tencent.maas.imagestudio.a.Freeform;
            } else if (i17 == 2) {
                aVar = com.tencent.maas.imagestudio.a.Standard;
            }
        }
        this.f48053a = aVar;
        this.f48054b = aspectRatio;
        this.f48055c = aspectRatio2;
        this.f48056d = rect2;
    }
}
