package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class na extends android.graphics.Paint {

    /* renamed from: a, reason: collision with root package name */
    private final android.graphics.Typeface f132020a;

    public na(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 interfaceC25963x17625b8) {
        this.f132020a = interfaceC25963x17625b8.mo36637x5392760d();
    }

    private android.graphics.Typeface b(int i17) {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            android.graphics.Typeface typeface = this.f132020a;
            return typeface != null ? typeface : i17 >= 600 ? android.graphics.Typeface.DEFAULT_BOLD : android.graphics.Typeface.DEFAULT;
        }
        android.graphics.Typeface typeface2 = this.f132020a;
        if (typeface2 == null) {
            typeface2 = android.graphics.Typeface.DEFAULT;
        }
        return android.graphics.Typeface.create(typeface2, i17, false);
    }

    public final android.graphics.Typeface a(int i17) {
        android.graphics.Typeface typeface;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            android.graphics.Typeface typeface2 = this.f132020a;
            if (typeface2 == null) {
                typeface2 = android.graphics.Typeface.DEFAULT;
            }
            typeface = android.graphics.Typeface.create(typeface2, i17, false);
        } else {
            android.graphics.Typeface typeface3 = this.f132020a;
            typeface = typeface3 != null ? typeface3 : i17 >= 600 ? android.graphics.Typeface.DEFAULT_BOLD : android.graphics.Typeface.DEFAULT;
        }
        return setTypeface(typeface);
    }
}
