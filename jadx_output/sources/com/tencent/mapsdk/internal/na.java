package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class na extends android.graphics.Paint {

    /* renamed from: a, reason: collision with root package name */
    private final android.graphics.Typeface f50487a;

    public na(com.tencent.tencentmap.mapsdk.maps.TencentMapContext tencentMapContext) {
        this.f50487a = tencentMapContext.getTypeface();
    }

    private android.graphics.Typeface b(int i17) {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            android.graphics.Typeface typeface = this.f50487a;
            return typeface != null ? typeface : i17 >= 600 ? android.graphics.Typeface.DEFAULT_BOLD : android.graphics.Typeface.DEFAULT;
        }
        android.graphics.Typeface typeface2 = this.f50487a;
        if (typeface2 == null) {
            typeface2 = android.graphics.Typeface.DEFAULT;
        }
        return android.graphics.Typeface.create(typeface2, i17, false);
    }

    public final android.graphics.Typeface a(int i17) {
        android.graphics.Typeface typeface;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            android.graphics.Typeface typeface2 = this.f50487a;
            if (typeface2 == null) {
                typeface2 = android.graphics.Typeface.DEFAULT;
            }
            typeface = android.graphics.Typeface.create(typeface2, i17, false);
        } else {
            android.graphics.Typeface typeface3 = this.f50487a;
            typeface = typeface3 != null ? typeface3 : i17 >= 600 ? android.graphics.Typeface.DEFAULT_BOLD : android.graphics.Typeface.DEFAULT;
        }
        return setTypeface(typeface);
    }
}
