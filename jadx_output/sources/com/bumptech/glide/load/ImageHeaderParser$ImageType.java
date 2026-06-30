package com.bumptech.glide.load;

/* loaded from: classes13.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    UNKNOWN(false);


    /* renamed from: d, reason: collision with root package name */
    public final boolean f43958d;

    ImageHeaderParser$ImageType(boolean z17) {
        this.f43958d = z17;
    }

    public boolean hasAlpha() {
        return this.f43958d;
    }
}
